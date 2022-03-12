package com.slomaxonical.dustrial.decor.data.provider;

import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DustrialBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public DustrialBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }
    private FabricTagBuilder<Block> getOrCreateTagBuildeer(Identifier id) {
        TagKey<Block> tag = TagKey.of(Registry.BLOCK_KEY, id);
        return this.getOrCreateTagBuilder(tag);
    }

    @Override
    protected void generateTags() {
        this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(DustrialBlocks.PADDED_TRAPDOOR)
                .add(DustrialBlocks.PADDED_DOOR)
                .add(DustrialBlocks.CHAIN_LINK_FENCE)
                .add(DustrialBlocks.BARBED_CHAIN_LINK_FENCE)
                .add(DustrialBlocks.BARBED_IRON_BARS)
                .add(DustrialBlocks.GOLD_CHAIN)
                .add(DustrialBlocks.LARGE_CHAIN)
                .add(DustrialBlocks.LARGE_GOLD_CHAIN)
//                .add(DustrialBlocks.LARGE_ICE_CHAIN)
                .add(DustrialBlocks.ANCHOR)
                .add(DustrialBlocks.HOOK)
                .add(DustrialBlocks.CHAIN_TRAPDOOR)
                .add(DustrialBlocks.CHAIN_DOOR)
                .add(DustrialBlocks.INDUSTRIAL_IRON_BLOCK)
                .add(DustrialBlocks.INDUSTRIAL_IRON_PILLAR)
                .add(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_BLOCK)
                .add(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_SLAB)
                .add(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_VERTICAL_SLAB)
                .add(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_STAIRS)
                .add(DustrialBlocks.INDUSTRIAL_IRON_TRAPDOOR)
                .add(DustrialBlocks.INDUSTRIAL_IRON_DOOR)
                .add(DustrialBlocks.CAST_IRON_BLOCK)
                .add(DustrialBlocks.CAST_IRON_PILLAR)
                .add(DustrialBlocks.CAST_IRON_BRICKS)
                .add(DustrialBlocks.CAST_IRON_BRICKS_SLAB)
                .add(DustrialBlocks.CAST_IRON_BRICKS_VERTICAL_SLAB)
                .add(DustrialBlocks.CAST_IRON_BRICKS_STAIRS)
                .add(DustrialBlocks.ENGRAVED_CAST_IRON_BLOCK)
                .add(DustrialBlocks.CAST_IRON_BALUSTRADE)
                .add(DustrialBlocks.SHEET_METAL_PLATING)
                .add(DustrialBlocks.SHEET_METAL_PLATING_SLAB)
                .add(DustrialBlocks.SHEET_METAL_PLATING_VERTICAL_SLAB)
                .add(DustrialBlocks.SHEET_METAL_PLATING_STAIRS)
                .add(DustrialBlocks.SHEET_METAL_PANELING)
                .add(DustrialBlocks.SHEET_METAL_SIDING)
                .add(DustrialBlocks.SHEET_METAL_WALLING)
                .add(DustrialBlocks.SHEET_METAL_TREADING)
                .add(DustrialBlocks.SHEET_METAL_TREADING_SLAB)
                .add(DustrialBlocks.SHEET_METAL_TREADING_VERTICAL_SLAB)
                .add(DustrialBlocks.SHEET_METAL_TREADING_STAIRS)
                .add(DustrialBlocks.SHEET_METAL_TRAPDOOR)
                .add(DustrialBlocks.SHEET_METAL_DOOR)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_PLATING)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_SLAB)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_VERTICAL_SLAB)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_STAIRS)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_PANELING)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_SIDING)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_WALLING)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TREADING)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_SLAB)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_VERTICAL_SLAB)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_STAIRS)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TRAPDOOR)
                .add(DustrialBlocks.RUSTY_SHEET_METAL_DOOR)
                .add(DustrialBlocks.CINDER_BLOCK)
                .add(DustrialBlocks.POLISHED_CINDER_BLOCK)
                .add(DustrialBlocks.CINDER_BRICKS)
                .add(DustrialBlocks.CINDER_BRICKS_SLAB)
                .add(DustrialBlocks.CINDER_BRICKS_VERTICAL_SLAB)
                .add(DustrialBlocks.CINDER_BRICKS_STAIRS)
                .add(DustrialBlocks.RUSTY_IRON_BLOCK)
                .add(DustrialBlocks.RUSTY_IRON_TRAPDOOR)
                .add(DustrialBlocks.RUSTY_IRON_DOOR)
                .add(DustrialBlocks.WRAPPED_CHAINS)
                .add(DustrialBlocks.WRAPPED_GOLD_CHAINS)
//                .add(DustrialBlocks.WRAPPED_ICE_CHAINS)
                .add(DustrialBlocks.IRON_BAR_TRAPDOOR)
                .add(DustrialBlocks.IRON_BAR_DOOR)
                .add(DustrialBlocks.REDSTONE_LANTERN)
                .add(DustrialBlocks.LARGE_LANTERN)
                .add(DustrialBlocks.LARGE_SOUL_LANTERN)
                .add(DustrialBlocks.LARGE_REDSTONE_LANTERN)
                .add(DustrialBlocks.LARGE_ENDER_LANTERN)
                .add(DustrialBlocks.LARGE_CURSED_LANTERN)
                .add(DustrialBlocks.LARGE_GLOW_LANTERN);

        this.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(DustrialBlocks.CARDBOARD_BOX)
                .add(DustrialBlocks.SMOOTH_CARDBOARD)
                .add(DustrialBlocks.SMOOTH_CARDBOARD_SLAB)
                .add(DustrialBlocks.SMOOTH_CARDBOARD_VERTICAL_SLAB)
                .add(DustrialBlocks.SMOOTH_CARDBOARD_STAIRS)
                .add(DustrialBlocks.FOLDED_CARDBOARD)
                .add(DustrialBlocks.CARDBOARD_SCRAP)
                .add(DustrialBlocks.CARDBOARD_TRAPDOOR)
                .add(DustrialBlocks.CARDBOARD_DOOR);

        this.getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(DustrialBlocks.PADDED_BLOCK)
                .add(DustrialBlocks.MINI_PADDED_BLOCK)
                .add(DustrialBlocks.MINI_PADDED_SLAB)
                .add(DustrialBlocks.MINI_PADDED_VERTICAL_SLAB)
                .add(DustrialBlocks.MINI_PADDED_STAIRS);
       
        this.getOrCreateTagBuilder(BlockTags.DOORS)
                .add(DustrialBlocks.CARDBOARD_DOOR)
                .add(DustrialBlocks.CHAIN_DOOR)
                .add(DustrialBlocks.INDUSTRIAL_IRON_DOOR)
                .add(DustrialBlocks.IRON_BAR_DOOR)
                .add(DustrialBlocks.PADDED_DOOR)
                .add(DustrialBlocks.RUSTY_IRON_DOOR)
                .add(DustrialBlocks.SHEET_METAL_DOOR )
                .add(DustrialBlocks.RUSTY_SHEET_METAL_DOOR);

        this.getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(DustrialBlocks.CARDBOARD_TRAPDOOR)
                .add(DustrialBlocks.CHAIN_TRAPDOOR)
                .add(DustrialBlocks.INDUSTRIAL_IRON_TRAPDOOR)
                .add(DustrialBlocks.IRON_BAR_TRAPDOOR)
                .add(DustrialBlocks.PADDED_TRAPDOOR)
                .add(DustrialBlocks.RUSTY_IRON_TRAPDOOR)
                .add(DustrialBlocks.SHEET_METAL_TRAPDOOR )
                .add(DustrialBlocks.RUSTY_SHEET_METAL_TRAPDOOR);

        this.getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(DustrialBlocks.CHAIN_LINK_FENCE)
                .add(DustrialBlocks.BARBED_CHAIN_LINK_FENCE);

        this.getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
                .add(DustrialBlocks.LARGE_SOUL_LANTERN);

    }
}
