package com.ubalube.starforge.common.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.starforge.common.items.ItemBase;
import com.ubalube.starforge.common.items.tools.ItemMatterHarvestor;
import com.ubalube.starforge.common.items.tools.ItemMatterPistol;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "starforge")
public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item Harvestor = new ItemMatterHarvestor("harvestor", 1, CreativeTabs.COMBAT);
	public static final Item Pistol = new ItemMatterPistol("pistol", 1, CreativeTabs.COMBAT);
}
