package com.rgbcraft.infrastructury.utils;

import com.rgbcraft.infrastructury.blocks.BlocksInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class InfrastructuryCreativeTab extends CreativeModeTab {

    public static final InfrastructuryCreativeTab INFRASTRUCTURY_TAB = new InfrastructuryCreativeTab("infrastructury_creative_tab");
    
	public InfrastructuryCreativeTab(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		// TODO fix icons
		return new ItemStack(BlocksInit.CARTELLO_PIENA_LINEA.get());
	}

}
