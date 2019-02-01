package com.ubalube.starforge.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * ModelVillager - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelSporedVillager extends ModelBiped {
    public ModelRenderer villagerArms0;
    public ModelRenderer villagerArms1;
    public ModelRenderer rightVillagerLeg;
    public ModelRenderer villagerBody0;
    public ModelRenderer villagerHead;
    public ModelRenderer leftVillagerLeg;
    public ModelRenderer shape17;
    public ModelRenderer villagerArms0_1;
    public ModelRenderer villagerArms0_2;
    public ModelRenderer villagerArms1_1;
    public ModelRenderer villagerArms0_3;
    public ModelRenderer shape19;
    public ModelRenderer shape19_1;

    public ModelSporedVillager() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.villagerArms1 = new ModelRenderer(this, 16, 70);
        this.villagerArms1.setRotationPoint(4.0F, 1.9F, -4.3F);
        this.villagerArms1.addBox(4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(villagerArms1, -1.0471975511965976F, -1.1838568316277536F, -1.0016444577195458F);
        this.villagerBody0 = new ModelRenderer(this, 16, 20);
        this.villagerBody0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.villagerBody0.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.shape19_1 = new ModelRenderer(this, 50, 80);
        this.shape19_1.setRotationPoint(1.5F, -1.7F, -6.0F);
        this.shape19_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape19_1, 0.5918411493512771F, 0.18203784098300857F, 1.6845917940249266F);
        this.villagerArms0 = new ModelRenderer(this, 16, 70);
        this.villagerArms0.setRotationPoint(-4.0F, 1.9F, -4.3F);
        this.villagerArms0.addBox(-8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(villagerArms0, -1.0471975511965976F, 1.3658946726107624F, 1.2292353921796064F);
        this.shape19 = new ModelRenderer(this, 50, 80);
        this.shape19.setRotationPoint(-2.6F, -0.8F, -3.1F);
        this.shape19.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape19, 0.40980330836826856F, 2.5497515042385164F, 0.18203784098300857F);
        this.shape17 = new ModelRenderer(this, 50, 60);
        this.shape17.setRotationPoint(-1.6F, -1.1F, -0.1F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 3, 12, 3, 0.0F);
        this.setRotateAngle(shape17, 0.11379546723003027F, 0.0F, 0.0F);
        this.leftVillagerLeg = new ModelRenderer(this, 0, 38);
        this.leftVillagerLeg.mirror = true;
        this.leftVillagerLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftVillagerLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(leftVillagerLeg, 0.20496339950749037F, 0.0F, -0.04554742211277569F);
        this.villagerArms0_2 = new ModelRenderer(this, 4, 72);
        this.villagerArms0_2.setRotationPoint(-5.1F, 0.8F, 0.9F);
        this.villagerArms0_2.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(villagerArms0_2, -2.5953045977155678F, -0.27314402793711257F, -1.6390387005478748F);
        this.villagerHead = new ModelRenderer(this, 0, 0);
        this.villagerHead.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.villagerHead.addBox(-4.0F, -9.9F, -4.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(villagerHead, 0.06198187390290414F, 0.0F, 0.0F);
        this.villagerArms1_1 = new ModelRenderer(this, 16, 70);
        this.villagerArms1_1.setRotationPoint(2.4F, 12.8F, -4.2F);
        this.villagerArms1_1.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerArms1_1, -1.2747884856566583F, -1.1838568316277536F, -1.1838568316277536F);
        this.rightVillagerLeg = new ModelRenderer(this, 0, 22);
        this.rightVillagerLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightVillagerLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(rightVillagerLeg, 0.0F, 0.0F, 0.022773711056387834F);
        this.villagerArms0_1 = new ModelRenderer(this, 16, 70);
        this.villagerArms0_1.setRotationPoint(-2.4F, 12.8F, -4.2F);
        this.villagerArms0_1.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerArms0_1, -1.2747884856566583F, 1.1838568316277536F, 1.1838568316277536F);
        this.villagerArms0_3 = new ModelRenderer(this, 4, 72);
        this.villagerArms0_3.setRotationPoint(4.7F, 2.2F, 0.1F);
        this.villagerArms0_3.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(villagerArms0_3, 2.8228955321756284F, 2.6862362517444724F, 1.2747884856566583F);
        this.villagerHead.addChild(this.shape19_1);
        this.villagerHead.addChild(this.shape19);
        this.villagerArms0_1.addChild(this.villagerArms0_2);
        this.villagerArms1.addChild(this.villagerArms1_1);
        this.villagerArms0.addChild(this.villagerArms0_1);
        this.villagerArms1_1.addChild(this.villagerArms0_3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.villagerArms1.render(f5);
        this.villagerBody0.render(f5);
        this.villagerArms0.render(f5);
        this.shape17.render(f5);
        this.leftVillagerLeg.render(f5);
        this.villagerHead.render(f5);
        this.rightVillagerLeg.render(f5);
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
    	// TODO Auto-generated method stub
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    	this.bipedLeftLeg = this.leftVillagerLeg;
    	this.bipedRightLeg = this.rightVillagerLeg;
    	this.bipedHead = this.villagerHead;
    }
    
}
