package com.rgbcraft.infrastructury.datagen;

import com.rgbcraft.infrastructury.InfrastructuryMain;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfrastructuryMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeClient(), new InfrastructuryBlockStateProvider(generator, InfrastructuryMain.MODID, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new InfrastructuryRecipes(generator));
        InfrastructuryBlockTags blockTags = new InfrastructuryBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
    }
}
