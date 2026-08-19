package com.endermite0800.tfcdaturapowdermod;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DaturaModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DaturapowderMod.MODID);


    // Datura Category
    public static final DeferredItem<Item> DATURA_POWDER = ITEMS.registerSimpleItem("datura_powder", new Item.Properties());
    public static final DeferredItem<Item> DATURA_SEEDS = ITEMS.registerSimpleItem("datura_seeds", new Item.Properties());



    //  Cocaine Category
    // Item: cocaine powder
    public static final DeferredItem<Item> COCAINE_POWDER = ITEMS.registerSimpleItem("cocaine_powder", new Item.Properties());
    // Item: cocaine raw (Drop from plant)
    public static final DeferredItem<Item> RAW_COCAINE = ITEMS.registerSimpleItem("cocaine_raw", new Item.Properties());
    // Item: cocaine leaves (Drop from plant)
    public static final DeferredItem<Item> COCAINE_LEAVES = ITEMS.registerSimpleItem("cocaine_leaves", new Item.Properties());






    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
