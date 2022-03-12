package com.slomaxonical.dustrial.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;

public class DirectionalBlock extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public DirectionalBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(ItemPlacementContext context) {
        return this.getDefaultState().with(FACING, context.getPlayerFacing().getOpposite());
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

        //add to flammability registry
//    @Override
//    public int getFlammability(BlockState state, BlockView world, BlockPos pos, Direction face) {
//        return 40;
//    }
}
