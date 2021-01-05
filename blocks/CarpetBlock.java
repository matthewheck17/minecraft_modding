package com.Matthew.backpacksmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CarpetBlock extends BlockBase{

	public CarpetBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.CLOTH);
		setHardness(0.5F);
	}

	public CarpetBlock(String name, Material material, CreativeTabs moddedTab) {
		super(name, material, moddedTab);
		setSoundType(SoundType.CLOTH);
		setHardness(0.5F);
	}

}
