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
        
        //Tavole di orientamento
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_1CAT_1X.get(), 4)
        .pattern("wb ")
        .pattern(" b ")
        .pattern(" s ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_1CAT_2X.get(), 4)
        .pattern("wb ")
        .pattern(" b ")
        .pattern("ss ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_1CAT_3X.get(), 4)
        .pattern("wb ")
        .pattern(" b ")
        .pattern("sss")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_1CAT_4X.get(), 4)
        .pattern("wb ")
        .pattern(" b ")
        .pattern("s s")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_2CAT_1X.get(), 4)
        .pattern("wb ")
        .pattern(" bw")
        .pattern(" s ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_2CAT_2X.get(), 4)
        .pattern("wb ")
        .pattern(" bw")
        .pattern("ss ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_2CAT_3X.get(), 4)
        .pattern("wb ")
        .pattern(" bw")
        .pattern("sss")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_2CAT_4X.get(), 4)
        .pattern("wb ")
        .pattern(" bw")
        .pattern("s s")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_AVVISO_1X.get(), 4)
        .pattern("wbw")
        .pattern(" b ")
        .pattern(" s ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_AVVISO_2X.get(), 4)
        .pattern("wbw")
        .pattern(" b ")
        .pattern("ss ")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_AVVISO_3X.get(), 4)
        .pattern("wbw")
        .pattern(" b ")
        .pattern("sss")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.TAVOLA_AVVISO_4X.get(), 4)
        .pattern("wbw")
        .pattern(" b ")
        .pattern("s s")
        .define('b', Tags.Items.DYES_BLACK)
        .define('w', Tags.Items.DYES_WHITE)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.RALLENTAMENTO_AVVISO.get(), 4)
        .pattern(" y ")
        .pattern("y y")
        .pattern(" s ")
        .define('y', Tags.Items.DYES_YELLOW)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.RALLENTAMENTO.get(), 4)
        .pattern("y y")
        .pattern("y y")
        .pattern(" s ")
        .define('y', Tags.Items.DYES_YELLOW)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
        ShapedRecipeBuilder.shaped(BlocksInit.FINE_RALLENTAMENTO.get(), 4)
        .pattern("g g")
        .pattern("g g")
        .pattern(" s ")
        .define('g', Tags.Items.DYES_LIME)
        .define('s', Items.STICK)
        .unlockedBy("has_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
        .group("infrastructury")
        .save(consumer);
        
    }
}
