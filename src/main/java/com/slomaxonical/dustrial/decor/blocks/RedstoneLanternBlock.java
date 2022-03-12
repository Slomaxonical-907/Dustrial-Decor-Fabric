package com.slomaxonical.dustrial.decor.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RedstoneLanternBlock extends LanternBlock {

    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public RedstoneLanternBlock(Settings properties) {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(HANGING, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)).with(LIT, Boolean.valueOf(false)));
    }
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HANGING, WATERLOGGED, LIT);
    }
    @Override
    public ActionResult onUse(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        if (!worldIn.isClient()) {
            worldIn.setBlockState(pos, state.with(LIT, !state.get(LIT)));
            return ActionResult.SUCCESS;
        }
        return ActionResult.CONSUME;
    }

}
