package com.slomaxonical.dustrial.decor.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DustrialPane extends PaneBlock {
    public static final DamageSource BARBED = new BarbDamage("barb").setBypassesArmor();

    public boolean isBarbed;
    public DustrialPane(Settings builder) {
        super(builder);
        isBarbed = false;
    }
    public DustrialPane(Settings builder, boolean isBarbed) {
        super(builder);
        this.isBarbed = isBarbed;
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (isBarbed && worldIn.getRandom().nextInt(10) < 1) {
            entityIn.damage(BARBED, 1);
        }
    }
    public static class BarbDamage extends DamageSource{
        public float exhaustion = 0.1F;

        protected BarbDamage(String name) {
            super(name);
        }
        @Override
        protected DamageSource setBypassesArmor() {
            boolean bypassesArmor = true;
            this.exhaustion = 0.0F;
            return this;
        }
    }
}
