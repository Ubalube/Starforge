package com.ubalube.starforge.common.world.dimension;

import java.util.List;

import javax.annotation.Nullable;

import com.ubalube.starforge.common.init.BiomeInit;
import com.ubalube.starforge.common.init.DimensionInit;
import com.ubalube.starforge.core.Reference;

import net.minecraft.client.audio.MusicTicker.MusicType;
import net.minecraft.client.renderer.Vector3d;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorDebug;
import net.minecraft.world.gen.ChunkGeneratorEnd;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenSpikes.EndSpike;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces.End;
import net.minecraftforge.client.CloudRenderer;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DimensionSpace extends WorldProviderSurface
{
	
	private WorldProviderEnd parProvider;
	
	public DimensionSpace()
	{
		this.biomeProvider = new BiomeProviderSingle(Biomes.SKY);
	}
    
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorSpace(this.world, this.world.getSeed());
	}
	
	@Override
	public void setSkyRenderer(IRenderHandler skyRenderer) {
		skyRenderer = parProvider.getSkyRenderer();
	}
	
	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks)
    {
        return 0.10F;
    }
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean doesXZShowFog(int par1, int par2) {
		return true;
	}

	@Override
	protected void generateLightBrightnessTable() {
		float f = 0.5F;
		for (int i = 0; i <= 15; ++i) {
			float f1 = 1.0F - (float) i / 15.0F;
			this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
		}
	}
}
