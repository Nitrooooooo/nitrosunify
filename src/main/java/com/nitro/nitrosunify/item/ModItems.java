package com.nitro.nitrosunify.item;

import com.nitro.nitrosunify.NUItemGroup;
import com.nitro.nitrosunify.NitrosUnify;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NitrosUnify.MOD_ID);

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties().tab(NUItemGroup.NITROS_UNIFY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
