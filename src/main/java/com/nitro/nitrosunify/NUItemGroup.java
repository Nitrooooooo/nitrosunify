package com.nitro.nitrosunify;

import com.nitro.nitrosunify.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class NUItemGroup {
    public static final ItemGroup NITROS_UNIFY = new ItemGroup("nitrosunify") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HAMMER.get());
        }
    };
}
