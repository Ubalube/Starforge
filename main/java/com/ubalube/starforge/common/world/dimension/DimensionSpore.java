package com.ubalube.starforge.common.world.dimension;

import java.util.List;

import com.ubalube.starforge.common.init.BiomeInit;
import com.ubalube.starforge.common.init.DimensionInit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
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
	
	private WorldProviderEnd parProvider;
	
	public DimensionSpore()
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.SPORE);
	}
    
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorSpore(this.world, this.world.getSeed());
	}
	
	@Override
	public Vec3d getSkyColor(Entity cameraEntity, float partialTicks) {
		return new Vec3d(0, 0, 0);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float par1, float par2) {
		return new Vec3d(1, 0.2, 0.2);
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return true;
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}
	
}
