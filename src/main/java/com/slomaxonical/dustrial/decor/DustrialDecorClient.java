package com.slomaxonical.dustrial.decor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;

public class DustrialDecorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                DustrialBlocks.CHAIN_LINK_FENCE,
                DustrialBlocks.BARBED_CHAIN_LINK_FENCE,
                DustrialBlocks.BARBED_IRON_BARS,
                DustrialBlocks.PADDED_TRAPDOOR,
                DustrialBlocks.CAST_IRON_BALUSTRADE,
                DustrialBlocks.INDUSTRIAL_IRON_DOOR,
                DustrialBlocks.CHAIN_TRAPDOOR,
                DustrialBlocks.PADDED_DOOR,
                DustrialBlocks.CHAIN_DOOR,
                DustrialBlocks.CARDBOARD_DOOR,
                DustrialBlocks.RUSTY_IRON_TRAPDOOR,
                DustrialBlocks.IRON_BAR_TRAPDOOR,
                DustrialBlocks.RUSTY_IRON_DOOR,
                DustrialBlocks.IRON_BAR_DOOR,
                DustrialBlocks.GOLD_CHAIN,
                DustrialBlocks.LARGE_CHAIN,
                DustrialBlocks.LARGE_GOLD_CHAIN,
                DustrialBlocks.ANCHOR,
                DustrialBlocks.HOOK,
                DustrialBlocks.REDSTONE_LANTERN
                );
//        if (DustrialBlocks.LARGE_ICE_CHAIN != null) {
//            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),DustrialBlocks.LARGE_ICE_CHAIN);
//        }
    }
}