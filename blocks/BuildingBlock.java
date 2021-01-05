package com.Matthew.backpacksmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BuildingBlock extends BlockBase {
	
	public BuildingBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
	}
}
