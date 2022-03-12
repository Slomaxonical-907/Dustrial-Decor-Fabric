package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class DustrialItemGroup {
    public static List<ItemStack> ITEMGROUP_LIST = new ArrayList<>();

    public static void registerItemgroup() {
         FabricItemGroupBuilder.create(
            new Identifier(DustrialDecor.MOD_ID, "group"))
                .icon(() -> new ItemStack(DustrialBlocks.LARGE_GLOW_LANTERN))
                .appendItems(stackList -> stackList.addAll(ITEMGROUP_LIST))
                .build();

    }
}
