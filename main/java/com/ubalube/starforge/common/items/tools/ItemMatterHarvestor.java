package com.ubalube.starforge.common.items.tools;

import javax.annotation.Nullable;

import com.ubalube.starforge.common.items.ItemBase;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMatterHarvestor extends ItemBase
{

	public ItemMatterHarvestor(String name, int StackSize, CreativeTabs tab) 
	{
		super(name, StackSize, tab);
		
		this.addPropertyOverride(new ResourceLocation("using"), new IItemPropertyGetter()
        {
			@SideOnly(Side.CLIENT)
	        public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	        {
	            if (entityIn == null) {
	                return 0.0F;
	            }
	            NBTTagCompound nbt = checkNBTTags(stack);
	            float j = nbt.getBoolean("USE") ? 1.0F : 0.0F;
	            return j; 
	        }
        });
		
	}
	
	public static NBTTagCompound checkNBTTags(ItemStack stack) {
        NBTTagCompound nbt = stack.getTagCompound();
        if (nbt == null) {
            nbt = new NBTTagCompound();
            stack.setTagCompound(nbt);
        }
        if (!nbt.hasKey("USE")) {
            nbt.setBoolean("USE", false);
        }
        
        return nbt;
    }
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
		EntityPlayer playerIn = (EntityPlayer) entityIn;
		
		NBTTagCompound nbt = stack.getTagCompound();
		if(nbt == null)
		{
			nbt = new NBTTagCompound();
		}
		CooldownTracker cd = playerIn.getCooldownTracker();
        if (!cd.hasCooldown(this) && nbt.getBoolean("USE") == true && stack.getItem() instanceof ItemMatterHarvestor) {
            nbt.setBoolean("USE", false);
        }
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
	
	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) 
	{
		return false;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		IBlockState state = worldIn.getBlockState(pos);
		
		ItemStack stack = player.getHeldItem(hand);
		
		NBTTagCompound nbt = stack.getTagCompound();
        if(nbt == null)
        {
            nbt = new NBTTagCompound();
            stack.setTagCompound(nbt);
        }
		
		if(worldIn.getBlockState(pos).getBlock().getBlockHardness(state, worldIn, pos) > 5);
		{
			player.getCooldownTracker().setCooldown(this, 8);
		}
		worldIn.destroyBlock(pos, true);
		nbt.setBoolean("USE", !nbt.getBoolean("USE"));
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}

}
