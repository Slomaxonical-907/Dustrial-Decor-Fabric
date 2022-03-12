package com.slomaxonical.dustrial.decor.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.BlockSoundGroup;

public class DustrialTrapdoor extends TrapdoorBlock {

    public DustrialTrapdoor(Settings properties) {
            super(properties.nonOpaque());
        }
    public DustrialTrapdoor(Material material, float hardness, float resist, BlockSoundGroup sound) {
        super(FabricBlockSettings.of(material)
                .strength(hardness,resist)
                .sounds(sound)
//                .harvestLevel(harvestlvl)
//                .harvestTool(tool).notSolid()
        );
    }




}
