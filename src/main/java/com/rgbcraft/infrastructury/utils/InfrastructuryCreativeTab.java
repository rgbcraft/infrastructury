package com.rgbcraft.infrastructury.utils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class InfrastructuryCreativeTab extends CreativeModeTab {

    public static final InfrastructuryCreativeTab INFRASTRUCTURY_TAB = new InfrastructuryCreativeTab("InfrastructuryCreativeTab");
    
	public InfrastructuryCreativeTab(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		// TODO fix icons
		return new ItemStack(Items.ACACIA_FENCE);
	}

}
