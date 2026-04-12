package com.iwaliner.ram_memory_notice;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModCoreRamMemoryNotice.ModID)
public class ModCoreRamMemoryNotice
{
    public static final String ModID = "rammemorynotice";
    public static IEventBus modEventBus;
    public ModCoreRamMemoryNotice()
    {
        modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}