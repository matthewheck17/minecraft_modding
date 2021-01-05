package com.Matthew.backpacksmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Matthew.backpacksmod.Main;
import com.Matthew.backpacksmod.blocks.BlockBase;
import com.Matthew.backpacksmod.blocks.BuildingBlock;
import com.Matthew.backpacksmod.blocks.CarpetBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLACK_CARPET = new CarpetBlock("black_carpet", Material.CARPET, Main.moddedTab);
	
	public static final Block WHITE_CARPET = new CarpetBlock("white_carpet", Material.CARPET, Main.moddedTab);
	
	public static final Block CONCRETE_BLOCK = new BuildingBlock("concrete_block", Material.IRON);
	
}
