package com.slomaxonical.dustrial.decor.data.tags;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public final class DustrialTags {
    //todo: find where this is used maybe recipe then change name
    public static final TagKey<Item> CARDBOARD_BLOCKS = createItemTag("cardboard_blocks");
    public static final TagKey<Item> INDUSTRIAL_IRON_BLOCKS = createItemTag("industrial_iron_blocks");
    public static final TagKey<Item> PADDED_BLOCKS = createItemTag("padded_blocks");
    public static final TagKey<Item> NEON_BLOCKS = createItemTag("neon_blocks");
//C
    public static final TagKey<Item> CONCRETE_POWDER = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "concrete_powder"));

    private static TagKey<Item> createItemTag(String id) {
        return TagKey.of(Registry.ITEM_KEY,new Identifier(DustrialDecor.MOD_ID, id));
    }
}
