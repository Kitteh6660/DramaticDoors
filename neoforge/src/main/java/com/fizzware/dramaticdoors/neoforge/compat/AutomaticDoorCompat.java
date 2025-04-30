package com.fizzware.dramaticdoors.neoforge.compat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.neoforge.NeoforgeUtils;
import com.fizzware.dramaticdoors.tags.DDBlockTags;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.event.level.LevelEvent;
import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

// This class file provides compatibility for Serilum's Automatic Doors. Doesn't directly require Collective.
public class AutomaticDoorCompat
{
	protected static int doorOpenTime = NeoforgeUtils.getConfigIntValue(FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.doorOpenTime");
	protected static boolean shouldOpenIronDoors = NeoforgeUtils.getConfigBooleanValue(FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.shouldOpenIronDoors");
	protected static boolean preventOpeningOnSneak = NeoforgeUtils.getConfigBooleanValue(FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.preventOpeningOnSneak");
	
	public static HashMap<Level, List<BlockPos>> toclosedoors = new HashMap<Level, List<BlockPos>>();
	public static HashMap<Level, List<BlockPos>> newclosedoors = new HashMap<Level, List<BlockPos>>();
	private static List<BlockPos> runnables = new ArrayList<BlockPos>();

	@SubscribeEvent
	public void onWorldLoad(LevelEvent.Load e) {
		if (!Compats.AUTOMATIC_DOORS_INSTALLED) {
			return;
		}
		Level world = (Level)e.getLevel();
		if (world == null || world.isClientSide) {
			return;
		}
		//Reload config.
		doorOpenTime = NeoforgeUtils.getConfigIntValue(FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.doorOpenTime");
		shouldOpenIronDoors = NeoforgeUtils.getConfigBooleanValue(FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.shouldOpenIronDoors");
		preventOpeningOnSneak = NeoforgeUtils.getConfigBooleanValue(FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.preventOpeningOnSneak");
		
		toclosedoors.put(world, new ArrayList<BlockPos>());
		newclosedoors.put(world, new ArrayList<BlockPos>());

	}
	
	@SubscribeEvent
	public void onWorldTick(LevelTickEvent.Post e) {
		if (!Compats.AUTOMATIC_DOORS_INSTALLED) {
			return;
		}
		Level world = e.getLevel();
		if (world.isClientSide) {
			return;
		}
		if (newclosedoors.size() > 0) {
			toclosedoors.get(world).addAll(newclosedoors.get(world));
			newclosedoors.get(world).clear();
		}

		if (toclosedoors.size() > 0) {
			List<BlockPos> closetoremove = new ArrayList<BlockPos>();

			for (BlockPos bp : toclosedoors.get(world)) {
				if (bp == null) {
					closetoremove.add(bp);
					continue;
				}

				BlockState state = world.getBlockState(bp);
				Block block = state.getBlock();
				if (!(block instanceof TallDoorBlock && isDoorHandOpenable(state))) {
					closetoremove.add(bp);
					continue;
				}

				boolean canclose = true;
				for (Player player : world.getEntitiesOfClass(Player.class, new AABB(bp.getX() - 2, bp.getY(), bp.getZ() - 2, bp.getX() + 2, bp.getY(), bp.getZ() + 2))) {
					BlockPos ppos = player.blockPosition();

					if (ppos.closerThan(bp, 3)) {
						if (preventOpeningOnSneak && player.isCrouching()) {
							continue;
						}
						canclose = false;
						break;
					}
				}

				if (canclose) {
					for (BlockPos aroundpos : BlockPos.betweenClosed(bp.getX() - 1, bp.getY(), bp.getZ() - 1, bp.getX() + 1, bp.getY(), bp.getZ() + 1)) {
						BlockState aroundstate = world.getBlockState(aroundpos);
						Block aroundblock = aroundstate.getBlock();
						if (aroundblock instanceof TallDoorBlock && isDoorHandOpenable(state)) {
							((TallDoorBlock) block).setOpen(null, world, aroundstate, aroundpos, false); // toggleDoor
						}
					}

					closetoremove.add(bp);
				}
			}

			if (closetoremove.size() > 0) {
				for (BlockPos tr : closetoremove) {
					toclosedoors.get(world).remove(tr);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent.Post e) {
		Player player = e.getEntity();
		Level world = player.getCommandSenderWorld();
		if (world.isClientSide) {
			return;
		}
		
		if (player.isSpectator()) {
			return;
		}

		if (player.isShiftKeyDown()) {
			if (preventOpeningOnSneak) {
				return;
			}
		}

		BlockPos ppos = player.blockPosition().above().immutable();
		Iterator<BlockPos> it1 = BlockPos.betweenClosed(ppos.getX()-1, ppos.getY(), ppos.getZ()-1, ppos.getX()+1, ppos.getY(), ppos.getZ()+1).iterator();
		while (it1.hasNext()) {
			BlockPos np = it1.next();
			BlockState state = world.getBlockState(np);
			Block block = state.getBlock();
			if (block instanceof TallDoorBlock && isDoorHandOpenable(state)) {
				if (toclosedoors.get(world).contains(np) || newclosedoors.get(world).contains(np)) {
					continue;
				}
				
				((TallDoorBlock)block).setOpen(player, world, state, np, true); // toggleDoor
				delayDoorClose(world, np.immutable());
			}
		}
	}
	
	public static void delayDoorClose(Level world, BlockPos pos) {
		if (pos == null) {
			return;
		}
		
		if (runnables.contains(pos)) {
			return;
		}
		runnables.add(pos);
		new Thread(() -> {
			try  { Thread.sleep( doorOpenTime ); }
			catch (InterruptedException ignored)  {}

			if (!toclosedoors.get(world).contains(pos) && !newclosedoors.get(world).contains(pos)) {
				newclosedoors.get(world).add(pos);
			}
			runnables.remove(pos);
		}).start();
	}
	
	private static boolean isDoorHandOpenable(BlockState state) {
		Block block = state.getBlock();
		if (block instanceof TallDoorBlock) {
			if (((TallDoorBlock)block).type().canOpenByHand()) {
				return true;
			}
			if (!((TallDoorBlock)block).type().canOpenByHand() && state.is(DDBlockTags.MOB_INTERACTABLE_TALL_DOORS)) {
				return true;
			}
		}
		return shouldOpenIronDoors;
	}
}
