package com.slomaxonical.dustrial.decor.data.tags;

import com.slomaxonical.dustrial.decor.DustrialDecor;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public final class DustrialTags {
    //todo: find where this is used maybe recipe then change name
    public static final Tag.Identified<Item> CARDBOARD_BLOCKS = createItemTag("cardboard_blocks");
    public static final Tag.Identified<Item> INDUSTRIAL_IRON_BLOCKS = createItemTag("industrial_iron_blocks");
    public static final Tag.Identified<Item> PADDED_BLOCKS = createItemTag("padded_blocks");
    public static final Tag.Identified<Item> NEON_BLOCKS = createItemTag("neon_blocks");
//C
    public static final Tag.Identified<Item> CONCRETE_POWDER = TagFactory.ITEM.create( new Identifier("c", "concrete_powder"));

    private static Tag.Identified<Item> createItemTag(String id) {
        return TagFactory.ITEM.create(new Identifier(DustrialDecor.MOD_ID, id));
    }
}
