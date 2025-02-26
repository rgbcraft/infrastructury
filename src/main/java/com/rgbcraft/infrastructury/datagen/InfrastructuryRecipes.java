package com.rgbcraft.infrastructury.datagen;

import java.util.function.Consumer;

import com.rgbcraft.infrastructury.blocks.BlocksInit;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
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
        .define('p', ItemTags.PLANKS)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        //Cartello PL SOA (tavola orientamento)
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_PL_SOA.get(), 8)
        .pattern("byb")
        .pattern("yby")
        .pattern(" s ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('y', Tags.Items.DYES_YELLOW)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
    }
}
