package com.lbx.sanjin;

import com.lbx.sanjin.modeitems.ModeItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mite.MOD_ID)
public final class Mite {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "sanjin_mite";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Create a Deferred Register to hold CreativeModeTabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    // 模组专属创造物品栏，图标为硬石锭
    public static final RegistryObject<CreativeModeTab> MITE_TAB = CREATIVE_MODE_TABS.register("mite_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.sanjin_mite"))
            .icon(() -> ModeItems.hard_ingot.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModeItems.hard_ingot.get());
                output.accept(ModeItems.mercury_ingot.get());
                output.accept(ModeItems.tin_ingot.get());
                output.accept(ModeItems.silver_ingot.get());
                output.accept(ModeItems.mithril_ingot.get());
                output.accept(ModeItems.ancient_metal_ingot.get());
                output.accept(ModeItems.adamantine_ingot.get());
            }).build());

    public Mite(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();

        // Register the commonSetup method for modloading
//        FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);

        ModeItems.register(modBusGroup);
        CREATIVE_MODE_TABS.register(modBusGroup);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);


    }

//    private void commonSetup(final FMLCommonSetupEvent event) {
//        // Some common setup code
//        LOGGER.info("HELLO FROM COMMON SETUP");
//
//        if (Config.logDirtBlock)
//            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
//
//        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
//
//        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
//    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
//    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
//    public static class ClientModEvents {
//        @SubscribeEvent
//        public static void onClientSetup(FMLClientSetupEvent event) {
//            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
//        }
//    }
}
