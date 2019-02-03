package com.ubalube.starforge.core.events;

import java.util.Random;

import com.ubalube.starforge.core.Reference;
import com.ubalube.starforge.core.Starforge;
import com.ubalube.starforge.core.utils.handlers.SoundHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
public class Ambience {

	
	private static final long AMBIENT_SOUND_INTERVAL = 4800;
    private static final int AMBIENT_SOUND_CHANCE = 120;

    private static long lastAmbientSoundTime;

    private static ISound playingMusic;
	
    private static final Minecraft MC = Minecraft.getMinecraft();
    
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (!MC.isGamePaused()) {
            EntityPlayerSP player = MC.player;
            if (player == null) {
                return;
            }

            if (event.phase == TickEvent.Phase.END) {
                if (playingMusic != null && !MC.getSoundHandler().isSoundPlaying(playingMusic)) {
                    playingMusic = null;
                }

                if (player.dimension == 6) 
                {
                    playAmbientSounds(player);
                }	
            }
        }
    }
    
	 private static void playAmbientSounds(EntityPlayer player) {
	        if (player.posY < 62 && !player.world.canSeeSky(player.getPosition())) {
	            return;
	        }

	        Random rand = player.world.rand;
	        long worldTime = player.world.getTotalWorldTime();

	        if (worldTime - lastAmbientSoundTime > AMBIENT_SOUND_INTERVAL && rand.nextInt(AMBIENT_SOUND_CHANCE) == 0) {
	            ResourceLocation ambientSound = SoundHandler.MUSIC_SPACE.getSoundName();

	            float volume = rand.nextFloat() * 0.4F + 0.8F;
	            float pitch = rand.nextFloat() * 0.6F + 0.7F;

	            float x = (float) (player.posX + rand.nextFloat() - 0.5F);
	            float y = (float) (player.posY + rand.nextFloat() - 0.5F);
	            float z = (float) (player.posZ + rand.nextFloat() - 0.5F);
	            
	            ISound sound = new PositionedSoundRecord(ambientSound, SoundCategory.AMBIENT, volume, pitch, false, 0, ISound.AttenuationType.NONE, x, y, z);
	            MC.getSoundHandler().playSound(sound);

	            lastAmbientSoundTime = worldTime;
	        }
	    }
	
}
