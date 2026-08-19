package com.endermite0800.tfcdaturapowdermod;

import com.endermite0800.tfcdaturapowdermod.block.DaturaModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.security.PublicKey;
import java.util.function.Supplier;

public class DaturaModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DaturapowderMod.MODID);
    // Registriert Den CreativeMode Tab
        public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
    public static final Supplier<CreativeModeTab> datura_powder_mod_items_tab = CREATIVE_MODE_TAB.register("datura_powder_mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DaturaModItems.DATURA_SEEDS.get()))
                    .title(Component.translatable("creativetab.datura_powder_mod.items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(DaturaModItems.DATURA_SEEDS);
                        output.accept(DaturaModItems.COCAINE_LEAVES);
                        output.accept(DaturaModItems.COCAINE_POWDER);
                        output.accept(DaturaModItems.RAW_COCAINE);
                        output.accept(DaturaModItems.DATURA_POWDER);


                    } )).build());

        public static final Supplier<CreativeModeTab> datura_powder_mod_blocks_tab = CREATIVE_MODE_TAB.register("datura_powder_mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DaturaModBlocks.DATURA_LEAVES_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DaturapowderMod.MODID, "datura_powder_mod_items_tab"))
                    .title(Component.translatable("creativetab.datura_powder_mod.blocks"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(DaturaModBlocks.DATURA_LEAVES_BLOCK);


                    } )).build());

}
