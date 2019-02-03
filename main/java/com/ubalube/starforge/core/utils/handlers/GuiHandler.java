package com.ubalube.starforge.core.utils.handlers;

import com.ubalube.starforge.client.gui.GuiAssembly;
import com.ubalube.starforge.common.tileentity.TileEntityAssembly;
import com.ubalube.starforge.core.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_ASSEMBLY) return new GuiAssembly(player.inventory, (TileEntityAssembly)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ASSEMBLY) return new GuiAssembly(player.inventory, (TileEntityAssembly)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}