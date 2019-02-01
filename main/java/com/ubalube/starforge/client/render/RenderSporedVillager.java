package com.ubalube.starforge.client.render;

import com.ubalube.starforge.client.model.ModelSporedVillager;
import com.ubalube.starforge.common.entity.EntitySporedVillager;
import com.ubalube.starforge.core.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSporedVillager extends RenderLiving<EntitySporedVillager> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/spored/s_villager.png");

    public RenderSporedVillager(RenderManager manager) {
        super(manager, new ModelSporedVillager(), 1.2F);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntitySporedVillager entity) {
		return TEXTURES;
	}
}
