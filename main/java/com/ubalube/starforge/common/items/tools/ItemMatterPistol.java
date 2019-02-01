package com.ubalube.starforge.common.items.tools;

import javax.annotation.Nullable;

import com.ubalube.starforge.common.entity.EntityBullet;
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

public class ItemMatterPistol extends ItemBase
{

	public ItemMatterPistol(String name, int StackSize, CreativeTabs tab) 
	{
		super(name, StackSize, tab);
		
		this.addPropertyOverride(new ResourceLocation("shooting"), new IItemPropertyGetter()
        {
			@SideOnly(Side.CLIENT)
	        public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	        {
	            if (entityIn == null) {
	                return 0.0F;
	            }
	            NBTTagCompound nbt = checkNBTTags(stack);
	            float j = nbt.getFloat("SHOOT");
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
        if (!nbt.hasKey("SHOOT")) {
            nbt.setFloat("SHOOT", 0);
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
		
		
		if(cd.hasCooldown(this) && stack.getItem() instanceof ItemMatterPistol)
		{
			
			nbt.setFloat("SHOOT", 1);
		}
		else
		{
			if(stack.getItem() instanceof ItemMatterPistol)
			{
				nbt.setFloat("SHOOT", 0);
			}
		}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
	
	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) 
	{
		return false;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		playerIn.getCooldownTracker().setCooldown(this, 8);
		if(!worldIn.isRemote)
		{
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			
			EntityBullet entity = new EntityBullet(worldIn, playerIn);
			entity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 1.0F, 7 * 3, 0.0F);
			entity.setDamage((double)5.0F);
			entity.shootingEntity = playerIn;
			entity.setRange(600);
			worldIn.spawnEntity(entity);
			itemstack.damageItem(1, playerIn);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
