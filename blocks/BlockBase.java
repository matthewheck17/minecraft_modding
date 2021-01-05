package com.Matthew.backpacksmod.blocks;

import com.Matthew.backpacksmod.Main;
import com.Matthew.backpacksmod.init.ModBlocks;
import com.Matthew.backpacksmod.init.ModItems;
import com.Matthew.backpacksmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public abstract class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, CreativeTabs creativeTab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() throws Exception {
		if (Item.getItemFromBlock(this) == null) {
			throw new Exception();
		}
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
