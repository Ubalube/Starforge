package com.ubalube.starforge.core.utils.handlers;

import com.ubalube.starforge.client.render.RenderPlanet;
import com.ubalube.starforge.client.render.RenderSporedVillager;
import com.ubalube.starforge.common.entity.EntityPlanet;
import com.ubalube.starforge.common.entity.EntitySporedVillager;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySporedVillager.class, new IRenderFactory<EntitySporedVillager>()
		{
			
			@Override
			public Render<? super EntitySporedVillager> createRenderFor(RenderManager manager){
				
				return new RenderSporedVillager(manager);
				
			}
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPlanet.class, new IRenderFactory<EntityPlanet>()
		{
			
			@Override
			public Render<? super EntityPlanet> createRenderFor(RenderManager manager){
				
				return new RenderPlanet(manager);
				
			}
			
		});
		
	}
	
}
