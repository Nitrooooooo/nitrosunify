package com.nitro.nitrosunify;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class NUItemGroup extends ItemGroup {
    public NUItemGroup() {
        super(NitrosUnify.MOD_ID)
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack()
    }
}
