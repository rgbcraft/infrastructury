package com.rgbcraft.infrastructury.datagen;

import com.rgbcraft.infrastructury.InfrastructuryMain;
import com.rgbcraft.infrastructury.blocks.BlocksInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class InfrastructuryBlockStateProvider extends BlockStateProvider
{
    public InfrastructuryBlockStateProvider(DataGenerator dataGenerator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, modid, existingFileHelper);
    }
    
    private String getBlockName(RegistryObject<Block> block) {
        return block.getId().getPath();
    }
    private void createModelBlockItem(RegistryObject<Block> block, int angleOffset) {
    	ResourceLocation rl = new ResourceLocation(InfrastructuryMain.MODID, "block/" + getBlockName(block));
    	simpleBlockItem(block.get(),
    	models().getExistingFile(rl));
       	horizontalBlock(block.get(),
       	models().getExistingFile(rl), angleOffset);
    }
    
    @Override
    protected void registerStatesAndModels()
    {
    	createModelBlockItem(BlocksInit.CARTELLO_PIENA_LINEA, 0);
    	createModelBlockItem(BlocksInit.PL_SOA_TAVOLA, 0);
    }
}
