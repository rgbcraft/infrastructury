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
    
    public static final RegistryObject<Block> PL_SOA_TAVOLA = BLOCKS.register("pl_soa_tavola",
            () -> new SignPostBlockModel(BlockBehaviour.Properties.of(Material.METAL).
                    requiresCorrectToolForDrops().noOcclusion().noCollission()));
      
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

