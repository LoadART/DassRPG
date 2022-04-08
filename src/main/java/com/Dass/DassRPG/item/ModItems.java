package com.Dass.DassRPG.item;

import com.Dass.DassRPG.dassrpg;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dassrpg.MOD_ID);

    public static  final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            ()  -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));




    public static void register(IEventBus eventBus) {
       ITEMS.register((eventBus));
    }
}
