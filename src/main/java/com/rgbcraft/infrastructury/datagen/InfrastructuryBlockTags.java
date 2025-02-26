package com.rgbcraft.infrastructury.datagen;

import com.rgbcraft.infrastructury.InfrastructuryMain;
import com.rgbcraft.infrastructury.blocks.BlocksInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class InfrastructuryBlockTags extends BlockTagsProvider {

    public InfrastructuryBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, InfrastructuryMain.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlocksInit.CARTELLO_PIENA_LINEA.get());
    }

    @Override
    public String getName() {
        return "Infrastructury Tags";
    }
}
