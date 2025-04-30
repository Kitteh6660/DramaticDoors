package com.fizzware.dramaticdoors.neoforge;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.config.DDConfigCommon;
import com.fizzware.dramaticdoors.neoforge.client.RenderHandler;
import com.fizzware.dramaticdoors.neoforge.compat.AutomaticDoorCompat;
import com.fizzware.dramaticdoors.neoforge.compat.QuarkDoubleDoorCompat;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;

@Mod(DramaticDoors.MOD_ID)
public class DramaticDoorsNeoForge
{
    public DramaticDoorsNeoForge(IEventBus bus, ModContainer container) {
    	// Please let this be a normal field trip.    	
    	// With the Mr. Fizzware? No freakin' way! Register events for the Magic NeoForge Bus to take them on an extraordinary trip.
    	Compats.modChecker = NeoforgeUtils.INSTANCE;
    	DDConfigCommon.initializeConfigs();
    	bus.register(DDNeoForgeRegistry.class);
    	bus.register(NeoforgeUtils.class);
    	
        bus.addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) { 
        	bus.addListener(this::setupClient); 
        	container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        }
    	if (Compats.QUARK_INSTALLED) {
    		bus.register(new QuarkDoubleDoorCompat());
    	}
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	if (Compats.AUTOMATIC_DOORS_INSTALLED) {
    		NeoForge.EVENT_BUS.register(new AutomaticDoorCompat());
    	}
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	RenderHandler.onInitializeClient();
    }
}
