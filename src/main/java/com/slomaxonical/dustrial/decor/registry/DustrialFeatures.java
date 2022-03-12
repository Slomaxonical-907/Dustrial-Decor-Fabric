package com.slomaxonical.dustrial.decor.registry;

public class DustrialFeatures {
    public static void init() {
//        if (DustrialDecor.CONFIG.VILLAGE_HOUSES) {
//            PlainsVillagePools.init();
//            TaigaVillagePools.init();
//            SnowyVillagePools.init();
//            SavannaVillagePools.init();
//            DesertVillagePools.init();
//
//            //addToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation("dustrial_decor:village/pillager_prison"), 1);
//            addToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation("dustrial_decor:village/mason"), 4);
//            //addToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation("dustrial_decor:village/mason_2"), 4);
//            //addToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation("dustrial_decor:village/workshop"), 6);
//            //addToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation("dustrial_decor:village/insane_house"), 2);
//            addToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation("dustrial_decor:village/cardboard_castle"), 1);
//
//            //addToPool(new ResourceLocation("village/taiga/houses"), new ResourceLocation("dustrial_decor:village/tool_smith"), 4);
//        }
//    }
//
//    private static void addToPool(ResourceLocation pool, ResourceLocation toAdd, int weight) {
//        JigsawPattern old = WorldGenRegistries.JIGSAW_POOL.getOrDefault(pool);
//        List<JigsawPiece> shuffled = old != null ? old.getShuffledPieces(new Random()) : ImmutableList.of();
//        List<Pair<JigsawPiece, Integer>> newPieces = shuffled.stream().map(p -> new Pair<>(p, 1)).collect(Collectors.toList());
//        newPieces.add(new Pair<>(new LegacySingleJigsawPiece(Either.left(toAdd), () -> ProcessorLists.field_244101_a, JigsawPattern.PlacementBehaviour.RIGID), weight));
//        ResourceLocation name = old.getName();
//        Registry.register(WorldGenRegistries.JIGSAW_POOL, pool, new JigsawPattern(pool, name, newPieces));
    }
}
