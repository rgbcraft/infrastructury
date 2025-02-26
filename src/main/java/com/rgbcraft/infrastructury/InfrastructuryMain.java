package com.rgbcraft.infrastructury;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.rgbcraft.infrastructury.blocks.BlocksInit;
import com.rgbcraft.infrastructury.datagen.InfrastructuryItemModelProvider;
import com.rgbcraft.infrastructury.items.ItemsInit;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InfrastructuryMain.MODID)
public class InfrastructuryMain
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "infrastructury";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public static ResourceLocation rl(String path) {
        return new ResourceLocation(MODID, path);
    }
    
    public InfrastructuryMain()
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        BlocksInit.BLOCKS.register(modEventBus);
        ItemsInit.ITEMS.register(modEventBus);
        
        // Register ourselves for server and other game events we are interested in
        
        MinecraftForge.EVENT_BUS.register(this);

    }
  

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("Infrastructury - © lego11 2025 ALL RIGHTS RESERVED");
        

    }
}
