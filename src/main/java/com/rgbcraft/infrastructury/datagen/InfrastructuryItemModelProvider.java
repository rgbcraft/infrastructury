package com.rgbcraft.infrastructury.datagen;

import java.util.Objects;

import com.rgbcraft.infrastructury.InfrastructuryMain;
import com.rgbcraft.infrastructury.blocks.BlocksInit;
import com.rgbcraft.infrastructury.items.ItemsInit;

import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class InfrastructuryItemModelProvider extends ItemModelProvider {

    public InfrastructuryItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, InfrastructuryMain.MODID, existingFileHelper);
    }
    
    private ItemModelBuilder basicBlockItem(Block block) {
        var rl = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block));
        return withExistingParent("block", "cartello_piena_linea")
                .texture("layer0", modLoc("block"));
    }

    @Override
    protected void registerModels() {
        this.basicBlockItem(BlocksInit.CARTELLO_PIENA_LINEA.get());
    }
}