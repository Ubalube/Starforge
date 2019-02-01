package com.ubalube.starforge.common.world.biomes;

import java.util.List;

import com.ubalube.starforge.common.entity.EntitySporedVillager;
import com.ubalube.starforge.common.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenTallGrass;

public class BiomeSpore extends Biome 
{
	public BiomeSpore() 
	{
		super(new BiomeProperties("Spore").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		
		topBlock = ModBlocks.sporedgrass.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();	
		flowers = (List<FlowerEntry>) Blocks.CACTUS;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.decorator.flowerGen.
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySporedVillager.class, 5, 1, 5));
	}
}
