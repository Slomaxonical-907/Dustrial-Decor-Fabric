package com.slomaxonical.dustrial.decor;

import com.slomaxonical.dustrial.decor.configs.ConfigResourceCondition;
import com.slomaxonical.dustrial.decor.config.DustrialDecorConfig;
import com.slomaxonical.dustrial.decor.configs.DustrialConfigs;
import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;
import com.slomaxonical.dustrial.decor.registry.DustrialItemGroup;
import com.slomaxonical.dustrial.decor.registry.DustrialItems;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.slomaxonical.dustrial.decor.registry.DustrialTrades;


public class DustrialDecor implements ModInitializer{
    private static final Logger LOGGER = LogManager.getLogger();

    public static String MOD_ID = "dustrial_decor";

    public static DustrialDecorConfig CONFIG;

    @Override
    public void onInitialize() {
        AutoConfig.register(DustrialConfigs.class, GsonConfigSerializer::new);
        DustrialBlocks.registerBlocks();
        ConfigResourceCondition.init();
        DustrialItems.registerItems();
        DustrialItemGroup.registerItemgroup();
        DustrialTrades.registerVillagerTrades();
    }

    //    @SubscribeEvent
//    public void entitySpawn(LivingSpawnEvent.SpecialSpawn event) {
//        if (CONFIG.MOBS_SPAWN_WITH_CARDBOARD_ARMOR.get() && !event.getWorld().isRemote() && event.getEntity().getEntityWorld().getRandom().nextDouble() < 0.05) {
//            EntityType<?> type = event.getEntityLiving().getType();
//            if ((type == EntityType.ZOMBIE
//                    || type == EntityType.SKELETON
//                    || type == EntityType.STRAY
//                    || type == EntityType.HUSK
//                    || type == EntityType.DROWNED)
//                    && event.getEntityLiving() instanceof MobEntity
//                    && event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()
//                    && event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.CHEST).isEmpty()
//                    && event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.LEGS).isEmpty()
//                    && event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.FEET).isEmpty()) {
//                        MobEntity entity = (MobEntity) event.getEntityLiving();
//                        entity.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(DustrialBlocks.CARDBOARD_HELMET.get()));
//                        entity.setDropChance(EquipmentSlotType.HEAD, 0.085F);
//                        entity.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(DustrialBlocks.CARDBOARD_CHESTPLATE.get()));
//                        entity.setDropChance(EquipmentSlotType.CHEST, 0.085F);
//                        entity.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(DustrialBlocks.CARDBOARD_LEGGINGS.get()));
//                        entity.setDropChance(EquipmentSlotType.LEGS, 0.085F);
//                        entity.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(DustrialBlocks.CARDBOARD_BOOTS.get()));
//                        entity.setDropChance(EquipmentSlotType.FEET, 0.085F);
//
//                    }
//                }
//            }

//    @Mod.EventBusSubscriber(modid = "dustrial_decor")
//    public static class LootEvents {
//        @SubscribeEvent
//        public static void onLootLoad(LootTableLoadEvent event) {
//            if (CONFIG.LOOT_TABLE_MODIFICATION.get()) {
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/simple_dungeon"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/pillager_outpost"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/woodland_mansion"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/shipwreck_supply"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/stronghold_corridor"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/village/village_toolsmith"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "chests/village/village_weaponsmith"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "chests/dungeon"))).name("dustrial_inject").build());
//                }
//                if (event.getName().equals(new ResourceLocation("minecraft", "entities/zombie"))) {
//                    event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MOD_ID, "entities/zombie"))).name("dustrial_inject").build());
//                }
//            }
//        }
//    }
}
