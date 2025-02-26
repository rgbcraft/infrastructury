package com.rgbcraft.infrastructury.datagen;

import java.util.function.Consumer;

import com.rgbcraft.infrastructury.blocks.BlocksInit;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

public class InfrastructuryRecipes extends RecipeProvider {
	
	

    public InfrastructuryRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
    	//Cartello Piena linea
        ShapedRecipeBuilder.shaped(BlocksInit.CARTELLO_PIENA_LINEA.get(), 16)
        .pattern(" w ")
        .pattern("vpv")
        .pattern(" s ")
        .define('w', Tags.Items.DYES_WHITE)
        .define('v', Tags.Items.DYES_PURPLE)
        .define('s', Items.STICK)
        .define('p', Blocks.OAK_PLANKS)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.OAK_PLANKS))
        .group("infrastructury")
        .save(consumer);
    }
}
