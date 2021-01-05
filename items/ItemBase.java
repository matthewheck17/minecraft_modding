package com.Matthew.backpacksmod.items;

import com.Matthew.backpacksmod.Main;
import com.Matthew.backpacksmod.init.ModItems;
import com.Matthew.backpacksmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name, CreativeTabs creativeTab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
