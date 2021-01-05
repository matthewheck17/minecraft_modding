package com.Matthew.backpacksmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Matthew.backpacksmod.Main;
import com.Matthew.backpacksmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList <Item>();
	
	public static final Item BACKPACK = new ItemBase("backpack", Main.moddedTab);
	public static final Item PENCIL = new ItemBase("pencil", Main.moddedTab);
	public static final Item LAPTOP = new ItemBase("laptop", Main.moddedTab);
}
