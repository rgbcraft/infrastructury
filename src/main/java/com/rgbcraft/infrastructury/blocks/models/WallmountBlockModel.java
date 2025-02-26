package com.rgbcraft.infrastructury.blocks.models;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WallmountBlockModel extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    protected static final VoxelShape NORTH_SHAPE;
    //protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;

    static {
        VoxelShape baseShape = Block.box(0, 0, 0, 3, 16, 16);
        NORTH_SHAPE = Block.box(0, 0, 0, 16, 16, 1.5);
        //SOUTH_SHAPE = Block.box(0, 0, 0, 16, 16, 1.5);
        EAST_SHAPE = Block.box(0, 0, 0, 1.5, 16, 16).move(0.9,0,0);
        WEST_SHAPE = Block.box(0, 0, 0, 1.5, 16, 16);
    }


    public WallmountBlockModel(Properties properties) {
        super(properties);
    }

    //private static final VoxelShape SHAPE =
    //        Block.box(0, 0, 0, 7, 7, 7).move(0.333333, 0.333333, 0.333333);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return switch (state.getValue(FACING)) {
            default -> NORTH_SHAPE;
            case SOUTH -> NORTH_SHAPE;
            case WEST -> EAST_SHAPE;
            case EAST -> WEST_SHAPE;
            case NORTH -> Block.box(0,0,0,16, 16, 1.5).move(0,0,0.9);
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}