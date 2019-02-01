package com.ubalube.starforge.common.init;

import com.ubalube.starforge.common.entity.EntityBullet;
import com.ubalube.starforge.common.entity.EntitySporedVillager;
import com.ubalube.starforge.core.Reference;
import com.ubalube.starforge.core.Starforge;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	
	public static void registerEntities() {
		
		//Guardian's
		registerEntity("Spored Villager", EntitySporedVillager.class, Reference.SPORED_VILLAGER, 50, 5931634, 3095382);
	}
	
	//Registers stuff that has no egg
	
	
	public static void registerProjectiles() {
		registerProjectile("bullet", EntityBullet.class , Reference.BULLET, 50);
	}
	
	
	private static void registerProjectile(String entityName, Class<? extends Entity> entityClass, int id, int range) {
		
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + entityName), entityClass, entityName, id, Starforge.instance, range, 1, true);
		
		
	}
	
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Starforge.instance, range, 1, true, color1, color2);
		
		
	}

}
