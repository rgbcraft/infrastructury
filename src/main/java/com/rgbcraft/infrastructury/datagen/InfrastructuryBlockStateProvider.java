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
    	createModelBlockItem(BlocksInit.TAVOLA_PL_SOA, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_1CAT_1X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_1CAT_2X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_1CAT_3X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_1CAT_4X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_2CAT_1X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_2CAT_2X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_2CAT_3X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_2CAT_4X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_AVVISO_1X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_AVVISO_2X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_AVVISO_3X, 0);
    	createModelBlockItem(BlocksInit.TAVOLA_AVVISO_4X, 0);
    	createModelBlockItem(BlocksInit.RALLENTAMENTO, 180);
    	createModelBlockItem(BlocksInit.RALLENTAMENTO_AVVISO, 180);
    	createModelBlockItem(BlocksInit.FINE_RALLENTAMENTO, 180);
    	
    }
}
