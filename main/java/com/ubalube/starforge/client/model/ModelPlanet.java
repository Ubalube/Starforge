package com.ubalube.starforge.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelShulkerBullet;
import net.minecraft.entity.Entity;
import net.minecraft.potion.PotionEffect;

/**
 * Planet - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelPlanet extends ModelBase {
    public ModelRenderer Planet;

    public ModelPlanet() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Planet = new ModelRenderer(this, 0, 0);
        this.Planet.setRotationPoint(0.0F, -181.0F, 0.0F);
        this.Planet.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 10, 200.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Planet.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) {
    	this.Planet.rotateAngleY = netHeadYaw * 0.017453292F;
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
   
}
