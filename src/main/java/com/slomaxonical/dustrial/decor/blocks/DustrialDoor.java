package com.slomaxonical.dustrial.decor.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DustrialDoor extends DoorBlock {

    public DustrialDoor(Settings properties) {
            super(properties.nonOpaque());
        }
    public DustrialDoor(Material material, float hardness, float resist, BlockSoundGroup sound) {
        super(FabricBlockSettings.of(material)
                .strength(hardness,resist)
                .sounds(sound)
                //add to mineable tags:
//                .b(harvestlvl)
//                .harvestTool(tool)
                .nonOpaque()
        );
    }




}
