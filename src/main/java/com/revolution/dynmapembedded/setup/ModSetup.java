package com.revolution.dynmapembedded.setup;

import com.mojang.logging.LogUtils;
import com.revolution.dynmapembedded.DynmapEmbedded;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = DynmapEmbedded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void preInit(FMLCommonSetupEvent event) {
        LOGGER.warn("INFO: DynmapEmbedded is loading!");
    }
}
