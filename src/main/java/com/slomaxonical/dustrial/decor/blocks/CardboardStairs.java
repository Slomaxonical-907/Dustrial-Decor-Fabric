package com.slomaxonical.dustrial.decor.blocks;

import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;
import net.minecraft.block.StairsBlock;

public class CardboardStairs extends StairsBlock {
    public CardboardStairs(Settings settings) {
        super(DustrialBlocks.SMOOTH_CARDBOARD.getDefaultState(), settings);
    }

//    @Override
//    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
//        return 40;
//    }
}
