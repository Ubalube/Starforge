package com.ubalube.starforge.core;

import com.ubalube.starforge.core.proxy.CommonProxy;
import com.ubalube.starforge.core.utils.handlers.RegistryHandler;

import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Starforge 
{
	
	@Instance
	public static Starforge instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	
	@SideOnly(Side.CLIENT)
	@EventHandler
	public static void preinitOne(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistriesOne();
		
	}
	
	//GAMERULES
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) 
	{
		World world = event.getServer().getEntityWorld();
		RegistryHandler.serverRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) 
	{
		RegistryHandler.initRegistries();
		
	}
	
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent e) 
	{
		RegistryHandler.postInitRegistries();
	}

}
