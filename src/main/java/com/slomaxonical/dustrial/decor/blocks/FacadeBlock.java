package com.slomaxonical.dustrial.decor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Waterloggable;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;

public class FacadeBlock extends Block implements Waterloggable {


    public static final DirectionProperty HORIZONTAL_FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public FacadeBlock(Settings properties) {
        super(properties);
    }




}
