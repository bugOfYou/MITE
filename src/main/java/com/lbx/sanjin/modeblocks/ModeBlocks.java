package com.lbx.sanjin.modeblocks;

import com.lbx.sanjin.Mite;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModeBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mite.MOD_ID);

    //硬石矿：外观类似煤矿石，挖掘后掉落经验
    public static final RegistryObject<Block> hard_ore =
            BLOCKS.register("hard_ore", () -> new DropExperienceBlock(
                    UniformInt.of(0, 2),
                    BlockBehaviour.Properties.of()
                            .setId(BLOCKS.key("hard_ore"))
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(4.0F, 4.0F)
            ));

    public static void register(BusGroup context) {
        BLOCKS.register(context);
    }
}
