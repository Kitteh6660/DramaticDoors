package com.fizzware.dramaticdoors.compat;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.registries.*;

public class Compats
{
	private static boolean initializedCompat = false;
	
	public static CompatChecker modChecker;
	
    // Check if the additional mods are installed.
    public static boolean AUTOMATIC_DOORS_INSTALLED;
    public static boolean DOUBLE_DOORS_INSTALLED;
	public static boolean COUPLINGS_INSTALLED;
	public static boolean CURIOS_INSTALLED;
	public static boolean BLUEPRINT_INSTALLED;
	public static boolean WOODWORKS_INSTALLED;
    public static boolean CHIPPED_INSTALLED;
    public static boolean MACAWS_DOORS_INSTALLED;
    public static boolean MANYIDEAS_DOORS_INSTALLED;
    public static boolean QUARK_INSTALLED;
    public static boolean SUPPLEMENTARIES_INSTALLED;
    public static boolean STATEMENT_INSTALLED;
    public static boolean IMMERSIVE_WEATHERING_INSTALLED;
    
    public static void registerCompats(CompatChecker checker) {
    	if (initializedCompat) {
    		return;
    	}
    	AUTOMATIC_DOORS_INSTALLED = isModLoaded("automaticdoors", checker);
    	DOUBLE_DOORS_INSTALLED = isModLoaded("doubledoors", checker);
    	COUPLINGS_INSTALLED = isModLoaded("couplings", checker);
    	CURIOS_INSTALLED = isModLoaded("curios", checker);
    	BLUEPRINT_INSTALLED = isModLoaded("blueprint", checker);
    	WOODWORKS_INSTALLED = isModLoaded("woodworks", checker);
    	CHIPPED_INSTALLED = isModLoaded("chipped", checker);
    	MACAWS_DOORS_INSTALLED = isModLoaded("mcwdoors", checker);
    	MANYIDEAS_DOORS_INSTALLED = isModLoaded("manyideas_doors", checker);
    	QUARK_INSTALLED = isModLoaded("quark", checker);
    	SUPPLEMENTARIES_INSTALLED = isModLoaded("supplementaries", checker);
    	STATEMENT_INSTALLED = isModLoaded("statement", checker);
    	IMMERSIVE_WEATHERING_INSTALLED = isModLoaded("immersive_weathering", checker);
    	DDRegistry.registerVanilla();
    	if (isModLoaded("blueprint", checker)) {
    		AbnormalsCompat.registerCompat(checker);
    	}
    	if (isModLoaded("abundant_atmosphere", checker)) {
    		AbundantAtmosphereCompat.registerCompat();
    	}
    	if (isModLoaded("ad_astra", checker)) {
    		AdAstraCompat.registerCompat();
    	}
		if (isModLoaded("aether", checker)) {
			AetherCompat.registerCompat();
		}
		if (isModLoaded("gravitation", checker)) {
			AetherGravitationCompat.registerCompat();
		}
		if (isModLoaded("aether_redux", checker)) {
			AetherReduxCompat.registerCompat();
		}
		if (isModLoaded("ancient_aether", checker)) {
			AncientAetherCompat.registerCompat();
		}
		if (isModLoaded("theabyss", checker)) {
			TheAbyss2Compat.registerCompat();
		}
		if (isModLoaded("alexscaves", checker)) {
			AlexsCavesCompat.registerCompat(checker);
		}
		if (isModLoaded("architects_palette", checker)) {
			ArchitectsPaletteCompat.registerCompat();
		}
		if (isModLoaded("atum", checker)) {
			AtumCompat.registerCompat();
		}
		if (isModLoaded("aurorasdeco", checker)) {
			AurorasDecorationsCompat.registerCompat();
		}
		if (isModLoaded("bambooeverything", checker)) {
			BambooEverythingCompat.registerCompat();
		}
		if (isModLoaded("betterarcheology", checker)) {
			BetterArchaeologyCompat.registerCompat();
		}
		if (isModLoaded("betterend", checker)) {
			BetterEndCompat.registerCompat();
		}
		if (isModLoaded("betternether", checker)) {
			BetterNetherCompat.registerCompat();
		}
		/*if (isModLoaded("thebetweenlands", checker)) {
			BetweenlandsCompat.registerCompat(); // NYI: Not Yet Implemented
		}*/
		if (isModLoaded("bewitchment", checker)) {
			BewitchmentCompat.registerCompat(checker);
		}
		if (isModLoaded("biomancy", checker)) {
			BiomancyCompat.registerCompat();
		}
		if (isModLoaded("biomemakeover", checker)) {
			BiomeMakeoverCompat.registerCompat();
		}
    	if (isModLoaded("biomesoplenty", checker)) {
    		BiomesOPlentyCompat.registerCompat();
    	}
		if (isModLoaded("blocksplus", checker)) {
			BlocksPlusCompat.registerCompat();
		}
		if (isModLoaded("blockus", checker)) {
			BlockusCompat.registerCompat();
		}
		if (isModLoaded("bountifulfares", checker)) {
			BountifulFaresCompat.registerCompat();
		}
		if (isModLoaded("born_in_chaos_v1", checker)) {
			BornInChaosCompat.registerCompat();
		}
    	if (isModLoaded("biomeswevegone", checker)) { // This replaces BYG.
    		BWGCompat.registerCompat();
    	}
		if (isModLoaded("caupona", checker)) {
			CauponaCompat.registerCompat();
		}
		if (isModLoaded("ceilands", checker)) {
			CeilandsCompat.registerCompat();
		}
		if (isModLoaded("charm", checker)) {
			CharmCompat.registerCompat();
		}
		if (isModLoaded("cinderscapes", checker)) {
			CinderscapesCompat.registerCompat();
		}
		if (isModLoaded("cobblemon", checker)) {
			CobblemonCompat.registerCompat();
		}
		if (isModLoaded("colorfulazaleas", checker)) {
			ColorfulAzaleasCompat.registerCompat();
		}
		if (isModLoaded("copperative", checker)) {
			CopperativeCompat.registerCompat();
		}
		if (isModLoaded("copperoverhaul", checker)) {
			CopperOverhaulCompat.registerCompat();
		}
		if (isModLoaded("alloyed", checker)) {
			CreateAlloyedCompat.registerCompat();
		}
		/*if (isModLoaded("create", checker)) { // This will be handled on Forge and Fabric side.
			CreateCompat.registerCompat();
		}*/
		if (isModLoaded("createdeco", checker)) {
			CreateDecoCompat.registerCompat();
		}
		if (isModLoaded("create_things_and_misc", checker)) {
			CreateMiscThingsCompat.registerCompat();
		}
		if (isModLoaded("darkerdepths", checker)) {
			DarkerDepthsCompat.registerCompat();
		}
		if (isModLoaded("dawnoftimebuilder", checker)) {
			DawnOfTimeBuilderCompat.registerCompat();
		}
		if (isModLoaded("deep_aether", checker)) {
			DeepAetherCompat.registerCompat();
		}
		if (isModLoaded("deeperdarker", checker)) {
			DeeperDarkerCompat.registerCompat();
		}
		if (isModLoaded("desolation", checker)) {
			DesolationCompat.registerCompat();
		}
		if (isModLoaded("dustrial_decor", checker)) {
			DustrialDecorCompat.registerCompat();
		}
		if (isModLoaded("ecologics", checker)) {
			EcologicsCompat.registerCompat();
		}
		if (isModLoaded("edenring", checker)) {
			EdenRingCompat.registerCompat();
		}
		if (isModLoaded("eldritch_end", checker)) {
			EldritchEndCompat.registerCompat();
		}
		if (isModLoaded("endlessbiomes", checker)) {
			EndlessBiomesCompat.registerCompat();
		}
		if (isModLoaded("enhanced_mushrooms", checker)) {
			EnhancedMushroomsCompat.registerCompat();
			if (isModLoaded("habitat", checker)) {
				HabitatCompat.registerCompat();
			}
		}
		if (isModLoaded("phantasm", checker)) {
			EndPhantasmCompat.registerCompat();
		}
		if (isModLoaded("enderscape", checker)) {
			EnderscapeCompat.registerCompat();
		}
		if (isModLoaded("enlightened_end", checker)) {
			EnlightenedEndCompat.registerCompat();
		}
		if (isModLoaded("everythingcopper", checker)) {
			EverythingCopperCompat.registerCompat();
		}
		if (isModLoaded("extendedmushrooms", checker)) {
			ExtendedMushroomsCompat.registerCompat();
		}
		if (isModLoaded("fruitfulfun", checker)) { // This replaces Fruit Trees.
			FruitfulFunCompat.registerCompat();
		}
		if (isModLoaded("forbidden_arcanus", checker)) {
			ForbiddenArcanusCompat.registerCompat();
		}
		/*if (isModLoaded("framedblocks", checker)) { // This will be handled on Forge and Fabric side.
			FramedBlocksCompat.registerCompat();
		}*/
		if (isModLoaded("gardens_of_the_dead", checker)) {
			GardensOfTheDeadCompat.registerCompat();
		}
		if (isModLoaded("goodending", checker)) {
			GoodEndingCompat.registerCompat();
		}
		if (isModLoaded("graveyard", checker)) {
			GraveyardCompat.registerCompat();
		}
		if (isModLoaded("hexcasting", checker)) {
			HexcastingCompat.registerCompat();
		}
		if (isModLoaded("hexerei", checker)) {
			HexereiCompat.registerCompat();
		}
		if (isModLoaded("horizons", checker)) {
			HorizonsCompat.registerCompat();
		}
		if (isModLoaded("immersive_weathering", checker)) {
			ImmersiveWeatheringCompat.registerCompat();
		}
		if (isModLoaded("integrateddynamics", checker)) {
			IntegratedDynamicsCompat.registerCompat();
		}
		if (isModLoaded("doapi", checker)) {
			LetsDoCompat.registerCompat(checker);
		}
		if (isModLoaded("malum", checker)) {
			MalumCompat.registerCompat();
		}
		if (isModLoaded("minestuck", checker)) {
			MinestuckCompat.registerCompat();
		}
		if (isModLoaded("modern_glass_doors", checker)) {
			ModernGlassDoorsCompat.registerCompat();
		}
		if (isModLoaded("ms", checker)) {
			MoShizCompat.registerCompat();
		}
		if (isModLoaded("morecraft", checker)) {
			MorecraftCompat.registerCompat();
		}
		if (isModLoaded("moredoors", checker)) {
			MoreDoorsCompat.registerCompat();
		}
		if (isModLoaded("mynethersdelight", checker)) {
			MyNethersDelightCompat.registerCompat();
		}
		if (isModLoaded("mysticsbiomes", checker)) {
			MysticsBiomesCompat.registerCompat();
		}
		if (isModLoaded("natures_spirit", checker)) {
			NaturesSpiritCompat.registerCompat();
		}
		if (isModLoaded("nethers_exoticism", checker)) {
			NethersExoticismCompat.registerCompat();
		}
		if (isModLoaded("newworld", checker)) {
			NewWorldCompat.registerCompat();
		}
    	if (isModLoaded("pokecube", checker)) {
    		PokecubeCompat.registerCompat();
    	}
    	if (isModLoaded("prehistoricfauna", checker)) {
    		PrehistoricFaunaCompat.registerCompat();
    	}
    	if (isModLoaded("premium_wood", checker)) {
    		PremiumWoodCompat.registerCompat();
    	}
    	if (isModLoaded("promenade", checker)) {
    		PromenadeCompat.registerCompat();
    	}
    	if (isModLoaded("pyromancer", checker)) {
    		PyromancerCompat.registerCompat();
    	}
    	if (isModLoaded("quark", checker)) {
    		QuarkCompat.registerCompat();
    	}
    	if (isModLoaded("regions_unexplored", checker)) {
    		RegionsUnexploredCompat.registerCompat();
    	}
		if (isModLoaded("silentgear", checker)) {
			SilentGearCompat.registerCompat();
		}
		if (isModLoaded("flying_stuff", checker)) {
			SkyLandsCompat.registerCompat();
		}
		if (isModLoaded("snowyspirit", checker)) {
			SnowySpiritCompat.registerCompat();
		}
		if (isModLoaded("supplementaries", checker)) {
			SupplementariesCompat.registerCompat(checker);
		}
		if (isModLoaded("tconstruct", checker)) {
			TinkersConstructCompat.registerCompat();
		}
    	if (isModLoaded("techreborn", checker)) {
    		TechRebornCompat.registerCompat();
    	}
    	if (isModLoaded("terraqueous", checker)) {
    		TerraqueousCompat.registerCompat();
    	}
    	if (isModLoaded("terrestria", checker)) {
    		TerrestriaCompat.registerCompat();
    	}
    	if (isModLoaded("thermal_foundation", checker)) {
    		ThermalFoundationCompat.registerCompat();
    	}
    	if (isModLoaded("thingamajigs", checker)) {
    		ThingamajigsCompat.registerCompat();
    	}
    	if (isModLoaded("traverse", checker)) {
    		TraverseCompat.registerCompat();
    	}
    	if (isModLoaded("tropicraft", checker)) {
    		TropicraftCompat.registerCompat();
    	}
    	if (isModLoaded("twilightforest", checker)) {
    		TwilightForestCompat.registerCompat(checker);
    	}
		if (isModLoaded("undergarden", checker)) {
			UndergardenCompat.registerCompat();
		}
		if (isModLoaded("wilderwild", checker)) {
			WilderWildCompat.registerCompat();
		}
		if (isModLoaded("windswept", checker)) {
			WindsweptCompat.registerCompat();
		}
		if (isModLoaded("xps_additions", checker)) {
			XPSAdditionsCompat.registerCompat();
		}
    	if (isModLoaded("yippee", checker)) {
    		YippeeCompat.registerCompat();
    	}
    	// Mods that add many doors, conditionally register them too.
    	if (isModLoaded("chipped", checker)) {
    		ChippedCompat.registerCompat();
    	}
    	if (isModLoaded("mcwdoors", checker)) {
    		MacawCompat.registerCompat();
    	}
    	if (isModLoaded("manyideas_doors", checker)) {
    		ManyIdeasCompat.registerCompat();
    	}
    	// Backport mods.
    	if (isModLoaded("tricky_trials", checker) || isModLoaded("trials", checker) || isModLoaded("copperandtuffbackport", checker) || isModLoaded("minecraft_121_update", checker)) {
    		TrickyTrialsBackportCompat.registerCompat(checker);
    	}
    	if (isModLoaded("earlyupdate_two", checker) || isModLoaded("palegardenbackport", checker)) {
    		PaleGardenBackportCompat.registerCompat(checker);
    	}
    	initializedCompat = true;
    }
    
    public static boolean isDev() {
    	return modChecker.isDev();
    }
    
    public static boolean isModLoaded(String modid, CompatChecker checker) {
    	if (isDev()) {
    		return true;
    	}
    	return checker.isModLoaded(modid);
    }
}
