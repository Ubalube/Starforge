package com.ubalube.starforge.common.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.starforge.common.items.ItemBase;
import com.ubalube.starforge.common.items.ItemRocketPart;
import com.ubalube.starforge.common.items.tools.ItemMatterHarvestor;
import com.ubalube.starforge.common.items.tools.ItemMatterPistol;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "starforge")
public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/*
	 * Tools
	 */
	public static final Item HARVESTOR = new ItemMatterHarvestor("harvestor", 1, CreativeTabs.COMBAT);
	public static final Item PISTOL = new ItemMatterPistol("pistol", 1, CreativeTabs.COMBAT);
	
	/*
	 * Materials
	 */
	public static final Item STEEL = new ItemBase("steel", 64, CreativeTabs.TOOLS);
	public static final Item COMPRESSEDSTEEL = new ItemBase("compressedsteel", 64, CreativeTabs.TOOLS);
	public static final Item COMPRESSEDGLASS = new ItemBase("compressedglass", 64, CreativeTabs.TOOLS);
	
	/*
	 * Rocket Parts
	 */
	public static final Item R_NOSE = new ItemRocketPart("nosecone", 1, CreativeTabs.COMBAT, "TOP", "Lowers the air resistance on a rocket.");
	public static final Item R_BODY = new ItemRocketPart("rocketbody", 1, CreativeTabs.COMBAT, "BASE", "The base of the rocket.");
	public static final Item R_COCKPIT = new ItemRocketPart("cockpit", 1, CreativeTabs.COMBAT, "PILOT", "The control part of the rocket.");
	public static final Item R_THRUSTER = new ItemRocketPart("thruster", 1, CreativeTabs.COMBAT, "BOTTOM", "Boosts the rocket upwards.");
	
}


