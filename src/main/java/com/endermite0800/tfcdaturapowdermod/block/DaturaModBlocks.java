package com.endermite0800.tfcdaturapowdermod.block;

import com.endermite0800.tfcdaturapowdermod.DaturapowderMod;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DaturaModBlocks {
    public  static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DaturapowderMod.MODID)


    private static <T extends Blocks> void registerBlockItem(String name, DeferredRegister<T> Block) {
        datur
    }


            public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
            }
}
