package com.ubalube.starforge.common.init;

import com.ubalube.starforge.common.world.dimension.DimensionSpore;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType SPORE = DimensionType.register("Spore", "_spore", 5, DimensionSpore.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(5, SPORE);
	}

}
