package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.configs.DustrialConfigs;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static net.minecraft.village.VillagerProfession.MASON;

public class DustrialTrades {
    public static void registerVillagerTrades() {
        if (AutoConfig.getConfigHolder(DustrialConfigs.class).getConfig().enableVillagerTrades) {
            TradeOfferHelper.registerVillagerOffers(MASON, 2, factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 1),
                new ItemStack(DustrialBlocks.CINDER_BRICKS, 16), 12, 10, 0.05F))));
            TradeOfferHelper.registerVillagerOffers(MASON, 2, factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 1),
                new ItemStack(DustrialBlocks.CINDER_BLOCK, 16), 12, 10, 0.05F))));
            TradeOfferHelper.registerVillagerOffers(MASON, 2, factories -> factories.add(new BasicTradeFactory(new TradeOffer(new ItemStack(Items.EMERALD, 1),
                new ItemStack(DustrialBlocks.POLISHED_CINDER_BLOCK, 16), 12, 10, 0.05F))));
        }
    }
        public static class BasicTradeFactory implements TradeOffers.Factory {
        private final TradeOffer trade;

        public BasicTradeFactory(TradeOffer trade) {
            this.trade = trade;
        }

        @Nullable
        @Override
        public TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(this.trade.toNbt());
        }
    }
}
