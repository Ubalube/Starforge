package com.ubalube.starforge.core.events;

import com.ubalube.starforge.common.commands.util.CustomTeleporter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

import net.minecraftforge.fml.relauncher.SideOnly;

public class GoToSpace 
{
	@SubscribeEvent
	public void checkHeight(PlayerTickEvent e)
	{
		EntityPlayer p = e.player;
		World worldIn = p.getEntityWorld();
		if(p.getPositionVector().y > 200F && p.dimension != 6 && p.dimension != -1)
		{
			if(!worldIn.isRemote)
			{
				CustomTeleporter.teleportToDimension(p, 5, p.getPositionVector().x, p.getPositionVector().y, p.getPositionVector().z);
			}
		}
	}
}
