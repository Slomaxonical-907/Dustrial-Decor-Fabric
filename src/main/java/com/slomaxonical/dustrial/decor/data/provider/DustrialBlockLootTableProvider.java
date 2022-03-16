package com.slomaxonical.dustrial.decor.data.provider;

import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTablesProvider;
import net.minecraft.data.server.BlockLootTableGenerator;

public class DustrialBlockLootTableProvider extends FabricBlockLootTablesProvider {
    public DustrialBlockLootTableProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        this.addDrop(DustrialBlocks.PADDED_BLOCK);
        this.addDrop(DustrialBlocks.MINI_PADDED_BLOCK);
        this.addDrop(DustrialBlocks.MINI_PADDED_STAIRS);
        this.addDrop(DustrialBlocks.PADDED_TRAPDOOR);
        this.addDrop(DustrialBlocks.CHAIN_LINK_FENCE);
        this.addDrop(DustrialBlocks.BARBED_CHAIN_LINK_FENCE);
        this.addDrop(DustrialBlocks.BARBED_IRON_BARS);
        this.addDrop(DustrialBlocks.GOLD_CHAIN);
        this.addDrop(DustrialBlocks.LARGE_CHAIN);
        this.addDrop(DustrialBlocks.LARGE_GOLD_CHAIN);
        this.addDrop(DustrialBlocks.HOOK);
        this.addDrop(DustrialBlocks.CHAIN_TRAPDOOR);
        this.addDrop(DustrialBlocks.INDUSTRIAL_IRON_BLOCK);
        this.addDrop(DustrialBlocks.INDUSTRIAL_IRON_PILLAR);
        this.addDrop(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_BLOCK);
        this.addDrop(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_STAIRS);
        this.addDrop(DustrialBlocks.INDUSTRIAL_IRON_TRAPDOOR);
        this.addDrop(DustrialBlocks.CAST_IRON_BLOCK);
        this.addDrop(DustrialBlocks.CAST_IRON_PILLAR);
        this.addDrop(DustrialBlocks.CAST_IRON_BRICKS);
        this.addDrop(DustrialBlocks.CAST_IRON_BRICKS_STAIRS);
        this.addDrop(DustrialBlocks.ENGRAVED_CAST_IRON_BLOCK);
        this.addDrop(DustrialBlocks.CAST_IRON_BALUSTRADE);
        this.addDrop(DustrialBlocks.SHEET_METAL_PLATING);
        this.addDrop(DustrialBlocks.SHEET_METAL_PLATING_STAIRS);
        this.addDrop(DustrialBlocks.SHEET_METAL_PANELING);
        this.addDrop(DustrialBlocks.SHEET_METAL_SIDING);
        this.addDrop(DustrialBlocks.SHEET_METAL_WALLING);
        this.addDrop(DustrialBlocks.SHEET_METAL_TREADING);
        this.addDrop(DustrialBlocks.SHEET_METAL_TREADING_STAIRS);
        this.addDrop(DustrialBlocks.SHEET_METAL_TRAPDOOR);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_PLATING);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_STAIRS);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_PANELING);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_SIDING);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_WALLING);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_TREADING);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_STAIRS);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_TRAPDOOR);
        this.addDrop(DustrialBlocks.CINDER_BLOCK);
        this.addDrop(DustrialBlocks.POLISHED_CINDER_BLOCK);
        this.addDrop(DustrialBlocks.CINDER_BRICKS);
        this.addDrop(DustrialBlocks.CINDER_BRICKS_STAIRS);
        this.addDrop(DustrialBlocks.CARDBOARD_BOX);
        this.addDrop(DustrialBlocks.SMOOTH_CARDBOARD);
        this.addDrop(DustrialBlocks.SMOOTH_CARDBOARD_STAIRS);
        this.addDrop(DustrialBlocks.FOLDED_CARDBOARD);
        this.addDrop(DustrialBlocks.CARDBOARD_SCRAP);
        this.addDrop(DustrialBlocks.CARDBOARD_TRAPDOOR);
        this.addDrop(DustrialBlocks.RUSTY_IRON_BLOCK);
        this.addDrop(DustrialBlocks.RUSTY_IRON_TRAPDOOR);
        this.addDrop(DustrialBlocks.WRAPPED_CHAINS);
        this.addDrop(DustrialBlocks.WRAPPED_GOLD_CHAINS);
        this.addDrop(DustrialBlocks.IRON_BAR_TRAPDOOR);
        this.addDrop(DustrialBlocks.REDSTONE_LANTERN);
        this.addDrop(DustrialBlocks.LARGE_LANTERN);
        this.addDrop(DustrialBlocks.LARGE_SOUL_LANTERN);
        this.addDrop(DustrialBlocks.LARGE_REDSTONE_LANTERN);
        this.addDrop(DustrialBlocks.LARGE_ENDER_LANTERN);
        this.addDrop(DustrialBlocks.LARGE_CURSED_LANTERN);
        this.addDrop(DustrialBlocks.LARGE_GLOW_LANTERN);
        this.addDrop(DustrialBlocks.RED_NEON_LIGHT);
        this.addDrop(DustrialBlocks.ORANGE_NEON_LIGHT);
        this.addDrop(DustrialBlocks.YELLOW_NEON_LIGHT);
        this.addDrop(DustrialBlocks.GREEN_NEON_LIGHT);
        this.addDrop(DustrialBlocks.CYAN_NEON_LIGHT);
        this.addDrop(DustrialBlocks.BLUE_NEON_LIGHT);
        this.addDrop(DustrialBlocks.PINK_NEON_LIGHT);
        this.addDrop(DustrialBlocks.PURPLE_NEON_LIGHT);
        this.addDrop(DustrialBlocks.RAINBOW_NEON_LIGHT);
        this.addDrop(DustrialBlocks.BLACK_LIGHT);

        this.addDrop(DustrialBlocks.MINI_PADDED_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.MINI_PADDED_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.BOLTED_INDUSTRIAL_IRON_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.CAST_IRON_BRICKS_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.CAST_IRON_BRICKS_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.SHEET_METAL_PLATING_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.SHEET_METAL_PLATING_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.SHEET_METAL_TREADING_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.SHEET_METAL_TREADING_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_PLATING_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_TREADING_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.CINDER_BRICKS_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.CINDER_BRICKS_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.SMOOTH_CARDBOARD_SLAB, BlockLootTableGenerator::slabDrops);
        this.addDrop(DustrialBlocks.SMOOTH_CARDBOARD_VERTICAL_SLAB, BlockLootTableGenerator::slabDrops);

        this.addDrop(DustrialBlocks.PADDED_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.ANCHOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.CHAIN_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.INDUSTRIAL_IRON_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.SHEET_METAL_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.RUSTY_SHEET_METAL_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.CARDBOARD_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.RUSTY_IRON_DOOR, BlockLootTableGenerator::addDoorDrop);
        this.addDrop(DustrialBlocks.IRON_BAR_DOOR, BlockLootTableGenerator::addDoorDrop);

//        this.addDropWithSilkTouch(DustrialBlocks.LARGE_ICE_CHAIN);
//        this.addDropWithSilkTouch(DustrialBlocks.WRAPPED_ICE_CHAINS);

    }
}
