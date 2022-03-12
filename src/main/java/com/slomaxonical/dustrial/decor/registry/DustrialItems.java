package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import com.slomaxonical.dustrial.decor.items.CardboardArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.slomaxonical.dustrial.decor.registry.DustrialBlocks.CARDBOARD_ARMOR_MATERIAL;

public class DustrialItems {
    public static final Item INDUSTRIAL_IRON_BILLET = createItem("industrial_iron_billet", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item CAST_IRON_BILLET = createItem("cast_iron_billet", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item SHEET_METAL = createItem("sheet_metal", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item RUSTY_SHEET_METAL = createItem("rusty_sheet_metal", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item CARDBOARD = createItem("cardboard", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));

    public static final Item CARDBOARD_HELMET = createItem("cardboard_helmet", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item CARDBOARD_CHESTPLATE = createItem("cardboard_chestplate", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item CARDBOARD_LEGGINGS = createItem("cardboard_leggings", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item CARDBOARD_BOOTS = createItem("cardboard_boots", new CardboardArmor(CARDBOARD_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item RUSTY_IRON_INGOT = createItem("rusty_iron_ingot", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item RUSTY_IRON_NUGGET = createItem("rusty_iron_nugget", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static <I extends Item> I createItem(String name, I item) {
        I registeredItem = Registry.register(Registry.ITEM, new Identifier(DustrialDecor.MOD_ID, name), item);
        DustrialItemGroup.ITEMGROUP_LIST.add(new ItemStack(item));
        return registeredItem;
    }
    public static void registerItems(){}
}
    