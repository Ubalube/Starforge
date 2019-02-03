package com.ubalube.starforge.common.items;
import java.util.List;

import com.ubalube.starforge.common.init.ModItems;
import com.ubalube.starforge.core.Starforge;
import com.ubalube.starforge.core.utils.IHasModel;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemRocketPart extends Item implements IHasModel
{
	
	String part;
	String usage;
	
	public ItemRocketPart(String name, int StackSize, CreativeTabs tab, String PartType, String Use) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(StackSize);
		
		this.part = PartType;
		this.usage = Use;
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.RED + "Rocket Part");
		tooltip.add(TextFormatting.AQUA + "Part Type: " + part);
		tooltip.add("---------------");
		tooltip.add(TextFormatting.GOLD + usage);
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public void registerModels() 
	{
		Starforge.proxy.registerItemRender(this, 0, "inventory");
		
	}
	
}
