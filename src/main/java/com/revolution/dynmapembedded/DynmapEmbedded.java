package com.revolution.dynmapembedded;

import com.mojang.logging.LogUtils;
import com.revolution.dynmapembedded.setup.ClientSetup;
import com.revolution.dynmapembedded.setup.ModSetup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod(DynmapEmbedded.MOD_ID)
public class DynmapEmbedded
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "dynmapembedded";

    public DynmapEmbedded()
    {

    }
}
