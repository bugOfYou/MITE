package com.lbx.sanjin.modeitems;

import com.lbx.sanjin.Mite;
import com.lbx.sanjin.modeblocks.ModeBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModeItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mite.MOD_ID);


    //硬石锭
    public static final RegistryObject<Item> hard_ingot =
            ITEMS.register("hard_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("hard_ingot"))));

    //汞锭
    public static final RegistryObject<Item> mercury_ingot =
            ITEMS.register("mercury_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("mercury_ingot"))));

    //锡锭
    public static final RegistryObject<Item> tin_ingot =
            ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("tin_ingot"))));

    //银锭
    public static final RegistryObject<Item> silver_ingot =
            ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("silver_ingot"))));

    //秘银锭
    public static final RegistryObject<Item> mithril_ingot =
            ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("mithril_ingot"))));

    //远古金属锭
    public static final RegistryObject<Item> ancient_metal_ingot =
            ITEMS.register("ancient_metal_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("ancient_metal_ingot"))));

    //艾德曼锭
    public static final RegistryObject<Item> adamantine_ingot =
            ITEMS.register("adamantine_ingot", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("adamantine_ingot"))));

    //硬石粒
    public static final RegistryObject<Item> hard_nugget =
            ITEMS.register("hard_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("hard_nugget"))));

    //汞粒
    public static final RegistryObject<Item> mercury_nugget =
            ITEMS.register("mercury_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("mercury_nugget"))));

    //锡粒
    public static final RegistryObject<Item> tin_nugget =
            ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("tin_nugget"))));

    //银粒
    public static final RegistryObject<Item> silver_nugget =
            ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("silver_nugget"))));

    //秘银粒
    public static final RegistryObject<Item> mithril_nugget =
            ITEMS.register("mithril_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("mithril_nugget"))));

    //远古金属粒
    public static final RegistryObject<Item> ancient_metal_nugget =
            ITEMS.register("ancient_metal_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("ancient_metal_nugget"))));

    //艾德曼粒
    public static final RegistryObject<Item> adamantine_nugget =
            ITEMS.register("adamantine_nugget", () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("adamantine_nugget"))));

    //硬石矿（方块对应的物品形态）
    public static final RegistryObject<Item> hard_ore =
            ITEMS.register("hard_ore", () -> new BlockItem(ModeBlocks.hard_ore.get(), new Item.Properties()
                    .setId(ITEMS.key("hard_ore"))));

    public static void register(BusGroup context){
        ITEMS.register(context);
    }
}
