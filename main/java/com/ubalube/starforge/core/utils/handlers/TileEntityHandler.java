package com.ubalube.starforge.core.utils.handlers;

import com.ubalube.starforge.common.tileentity.TileEntityAssembly;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityAssembly.class, "assemblytable");
	}
}
