package com.ubalube.starforge.common.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.starforge.common.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "starforge")
public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item Harvestor = new ItemBase("harvestor", 1, CreativeTabs.COMBAT);
	
}
