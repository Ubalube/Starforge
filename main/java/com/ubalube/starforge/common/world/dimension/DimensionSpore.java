package com.ubalube.starforge.common.world.dimension;

import java.util.List;

import com.ubalube.starforge.common.init.BiomeInit;
import com.ubalube.starforge.common.init.DimensionInit;

import net.minecraft.client.renderer.Vector3d;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DimensionSpore extends WorldProviderSurface
{
	public DimensionSpore()
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.SPORE);
	}

    @Override
    public boolean isDaytime() {
    	return false;
    }
    
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorSpore(this.world, this.world.getSeed());
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}
	
}
