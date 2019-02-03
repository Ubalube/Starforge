package com.ubalube.starforge.core.utils.handlers;

import com.ubalube.starforge.core.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {
	public static SoundEvent MUSIC_SPACE;
	
	public static void registerSounds()
	{
		MUSIC_SPACE = registerSound("music.space");
	}
	
public static SoundEvent registerSound(String name) {
		
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
	
}
