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
                .add(BlocksInit.CARTELLO_PIENA_LINEA.get())
                .add(BlocksInit.TAVOLA_PL_SOA.get())
                .add(BlocksInit.TAVOLA_1CAT_1X.get())
                .add(BlocksInit.TAVOLA_1CAT_2X.get())
                .add(BlocksInit.TAVOLA_1CAT_3X.get())
                .add(BlocksInit.TAVOLA_1CAT_4X.get())
                .add(BlocksInit.TAVOLA_2CAT_1X.get())
                .add(BlocksInit.TAVOLA_2CAT_2X.get())
                .add(BlocksInit.TAVOLA_2CAT_3X.get())
                .add(BlocksInit.TAVOLA_2CAT_4X.get())
                .add(BlocksInit.TAVOLA_AVVISO_1X.get())
                .add(BlocksInit.TAVOLA_AVVISO_2X.get())
                .add(BlocksInit.TAVOLA_AVVISO_3X.get())
                .add(BlocksInit.TAVOLA_AVVISO_4X.get())
                .add(BlocksInit.RALLENTAMENTO.get())
                .add(BlocksInit.RALLENTAMENTO_AVVISO.get())
                .add(BlocksInit.FINE_RALLENTAMENTO.get())
                ;
    }

    @Override
    public String getName() {
        return "Infrastructury Tags";
    }
}
