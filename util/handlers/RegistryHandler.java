package com.Matthew.backpacksmod.util.handlers;

import com.Matthew.backpacksmod.init.ModBlocks;
import com.Matthew.backpacksmod.init.ModItems;
import com.Matthew.backpacksmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlcokRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				try {
					((IHasModel)item).registerModels();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		for (Block block : ModBlocks.BLOCKS) {
			if (block instanceof IHasModel) {
				try {
					((IHasModel)block).registerModels();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
