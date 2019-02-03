package com.ubalube.starforge.client.render;

import org.lwjgl.opengl.GL11;

import com.ubalube.starforge.client.model.ModelBullet;
import com.ubalube.starforge.client.model.ModelPlanet;
import com.ubalube.starforge.common.entity.EntityBullet;
import com.ubalube.starforge.common.entity.EntityPlanet;
import com.ubalube.starforge.core.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPlanet extends RenderLiving<EntityPlanet>
{
	public static final ResourceLocation[] TEXTURES = new ResourceLocation[] {new ResourceLocation(Reference.MOD_ID + ":textures/entity/planet/earth.png"), new ResourceLocation(Reference.MOD_ID + ":textures/entity/planet/spore.png")};
	
    private final static ModelPlanet model = new ModelPlanet();
 
    private int ID;
    
    public RenderPlanet(RenderManager manager) 
    {
		super(manager, model, 0);
	}
    
    @Override
    public ResourceLocation getEntityTexture(EntityPlanet entity)
    {
    	return TEXTURES[entity.getVariant()];
    }
}
