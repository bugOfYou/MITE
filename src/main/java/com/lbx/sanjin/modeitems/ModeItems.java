package com.lbx.sanjin.modeitems;

import com.lbx.sanjin.Mite;
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

    public static void register(BusGroup context){
        ITEMS.register(context);
    }
}
