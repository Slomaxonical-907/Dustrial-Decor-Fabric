package com.slomaxonical.dustrial.decor.mixins;

import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(DamageSource.class)
public interface DamageSourceInvoker {
    @Invoker("<init>")
    private static DamageSource invokeConstructor(String name){
        throw new AssertionError();
    };
    @Invoker("setBypassesArmor")
    private DamageSource invokeBypassesArmor(){
        return null;
    }
}
