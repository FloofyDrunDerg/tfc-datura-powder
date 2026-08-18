package com.endermite0800.tfcdaturapowdermod;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class daturamoditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DaturapowderMod.MODID);


    // ITEM: Datura powder
    public static final DeferredItem<Item> DATURA_POWDER = ITEMS.registerSimpleItem("datura_powder", new Item.Properties());

    // ITEM: ---





    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
