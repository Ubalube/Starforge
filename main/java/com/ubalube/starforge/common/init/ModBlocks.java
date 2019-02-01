package com.ubalube.starforge.common.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.starforge.common.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "starforge")
public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block sporedgrass = new BlockBase("sporedgrass", Material.GROUND, 2.0f);
	
}
