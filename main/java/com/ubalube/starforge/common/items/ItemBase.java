package com.ubalube.starforge.common.items;
import com.ubalube.starforge.common.init.ModItems;
import com.ubalube.starforge.core.Stargate;
import com.ubalube.starforge.core.utils.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name, int StackSize, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(StackSize);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Stargate.proxy.registerItemRender(this, 0, "inventory");
		
	}
	
}
