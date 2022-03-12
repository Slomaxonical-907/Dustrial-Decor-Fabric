package com.slomaxonical.dustrial.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LargeChain extends ChainBlock {

    protected static final VoxelShape Y_AXIS_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 4.5D, 11.5D, 16.0D, 11.5D);
    protected static final VoxelShape Z_AXIS_SHAPE = Block.createCuboidShape(4.5D, 4.5D, 0.0D, 11.5D, 11.5D, 16.0D);
    protected static final VoxelShape X_AXIS_SHAPE = Block.createCuboidShape(0.0D, 4.5D, 4.5D, 16.0D, 11.5D, 11.5D);


    public LargeChain(Settings properties) {
        super(properties);
    }

    //todo:Check if i should add these to climabable

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView worldIn, BlockPos pos, ShapeContext context) {
        switch(state.get(AXIS)) {
            case X:
            default:
                return X_AXIS_SHAPE;
            case Z:
                return Z_AXIS_SHAPE;
            case Y:
                return Y_AXIS_SHAPE;
        }
    }
}
