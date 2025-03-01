package com.rgbcraft.infrastructury.blocks;

import java.util.function.Supplier;

import com.rgbcraft.infrastructury.InfrastructuryMain;
import com.rgbcraft.infrastructury.blocks.models.SignPostBlockModel;
import com.rgbcraft.infrastructury.blocks.models.WallmountBlockModel;
import com.rgbcraft.infrastructury.utils.InfrastructuryCreativeTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlocksInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InfrastructuryMain.MODID);
    
    public static final RegistryObject<Block> CARTELLO_PIENA_LINEA = BLOCKS.register("cartello_piena_linea",
            () -> new WallmountBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_PL_SOA = BLOCKS.register("tavola_pl_soa",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_1CAT_1X = BLOCKS.register("tavola_1cat_1x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_1CAT_2X = BLOCKS.register("tavola_1cat_2x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_1CAT_3X = BLOCKS.register("tavola_1cat_3x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_1CAT_4X = BLOCKS.register("tavola_1cat_4x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_2CAT_1X = BLOCKS.register("tavola_2cat_1x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_2CAT_2X = BLOCKS.register("tavola_2cat_2x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_2CAT_3X = BLOCKS.register("tavola_2cat_3x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_2CAT_4X = BLOCKS.register("tavola_2cat_4x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
   
    public static final RegistryObject<Block> TAVOLA_AVVISO_1X = BLOCKS.register("tavola_avviso_1x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_AVVISO_2X = BLOCKS.register("tavola_avviso_2x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_AVVISO_3X = BLOCKS.register("tavola_avviso_3x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> TAVOLA_AVVISO_4X = BLOCKS.register("tavola_avviso_4x",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
    
    public static final RegistryObject<Block> RALLENTAMENTO = BLOCKS.register("rallentamento",
    		() -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
    				requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> RALLENTAMENTO_AVVISO = BLOCKS.register("rallentamento_avviso",
    		() -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
    				requiresCorrectToolForDrops().noOcclusion()));
    
    public static final RegistryObject<Block> FINE_RALLENTAMENTO = BLOCKS.register("fine_rallentamento",
    		() -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
    				requiresCorrectToolForDrops().noOcclusion()));
    
    
    @SubscribeEvent
    public static void onRegisterItems(final RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.ITEMS)){
            BLOCKS.getEntries().forEach( (blockRegistryObject) -> {
                Block block = blockRegistryObject.get();
                Item.Properties properties = new Item.Properties().tab(InfrastructuryCreativeTab.INFRASTRUCTURY_TAB);
                Supplier<Item> blockItemFactory = () -> new BlockItem(block, properties);
                event.register(ForgeRegistries.Keys.ITEMS, blockRegistryObject.getId(), blockItemFactory);
                
            });
        }
    }
}

 