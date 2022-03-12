package com.slomaxonical.dustrial.decor.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PaddedVerticalSlab extends VerticalSlabBlock {
    public PaddedVerticalSlab(Settings properties) {
        super(properties);
    }


    @Override
    public void onLandedUpon(World worldIn, BlockState state, BlockPos pos, Entity entityIn, float fallDistance) {
        if (entityIn.bypassesLandingEffects()) {
            super.onLandedUpon(worldIn, state, pos, entityIn, fallDistance);
        } else {
            entityIn.handleFallDamage(fallDistance, 0.0F, DamageSource.FALL);
        }

    }
    @Override
    public void onEntityLand(BlockView worldIn, Entity entityIn) {
        if (entityIn.bypassesLandingEffects()) {
            super.onEntityLand(worldIn, entityIn);
        } else {
            this.bounce(entityIn);
        }

    }

    private void bounce(Entity entity) {
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < 0.0D) {
            double d = entity instanceof LivingEntity ? 0.5D : 0.8D;
            entity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
        }

    }
}
