package com.slomaxonical.dustrial.decor.data.provider;

import com.google.common.collect.ImmutableList;
import com.slomaxonical.dustrial.decor.configs.ConfigResourceCondition;
import com.slomaxonical.dustrial.decor.configs.DustrialConfigs;
import com.slomaxonical.dustrial.decor.data.tags.DustrialTags;
import com.slomaxonical.dustrial.decor.registry.DustrialBlocks;
import com.slomaxonical.dustrial.decor.registry.DustrialItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;
import static com.slomaxonical.dustrial.decor.registry.DustrialBlocks.*;
import static com.slomaxonical.dustrial.decor.registry.DustrialItems.*;

public class DustrialRecipeProvider extends FabricRecipeProvider {
    private static final ImmutableList<ItemConvertible> SHEETS = ImmutableList.of(RUSTY_SHEET_METAL, SHEET_METAL);

    public DustrialRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }


    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        Consumer<RecipeJsonProvider> vertExporter = withConditions(exporter, ConfigResourceCondition.configEnabeled("enableVerticalSlabs"));

        ShapedRecipeJsonBuilder.create(ANCHOR).input('$',LARGE_CHAIN).input('#', Items.IRON_INGOT).pattern(" $ ").pattern(" # ").pattern("# #").criterion("has_large_chain",conditionsFromItem(DustrialBlocks.LARGE_CHAIN)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(HOOK).input('$',LARGE_CHAIN).input('#', Items.IRON_INGOT).pattern(" $").pattern(" #").pattern("# ").criterion("has_large_chain",conditionsFromItem(DustrialBlocks.LARGE_CHAIN)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(BARBED_CHAIN_LINK_FENCE,16).input('$', Items.IRON_NUGGET).input('#', Blocks.CHAIN).pattern("#$#").pattern("$#$").pattern("#$#").criterion("has_chain",conditionsFromItem(Items.CHAIN)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(BARBED_IRON_BARS,16).input('$', Items.IRON_NUGGET).input('#', Items.IRON_INGOT).pattern("$$$").pattern("###").pattern("###").criterion("has_chain",conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);

        //NEON
        offerNeonLightRecipe(exporter, BLACK_LIGHT, Blocks.BLACK_STAINED_GLASS);
        offerNeonLightRecipe(exporter,RED_NEON_LIGHT,Blocks.RED_STAINED_GLASS);
        offerNeonLightRecipe(exporter,ORANGE_NEON_LIGHT,Blocks.ORANGE_STAINED_GLASS);
        offerNeonLightRecipe(exporter,YELLOW_NEON_LIGHT,Blocks.YELLOW_STAINED_GLASS);
        offerNeonLightRecipe(exporter,GREEN_NEON_LIGHT,Blocks.GREEN_STAINED_GLASS);
        offerNeonLightRecipe(exporter,GREEN_NEON_LIGHT,Blocks.LIME_STAINED_GLASS,"green_neon_from_lime");
        offerNeonLightRecipe(exporter,CYAN_NEON_LIGHT,Blocks.CYAN_STAINED_GLASS);
        offerNeonLightRecipe(exporter,CYAN_NEON_LIGHT,Blocks.LIGHT_BLUE_STAINED_GLASS,"cyan_neon_from_light_blue");
        offerNeonLightRecipe(exporter,BLUE_NEON_LIGHT,Blocks.BLUE_STAINED_GLASS);
        offerNeonLightRecipe(exporter,PURPLE_NEON_LIGHT,Blocks.PURPLE_STAINED_GLASS);
        offerNeonLightRecipe(exporter,PURPLE_NEON_LIGHT,Blocks.MAGENTA_STAINED_GLASS,"purple_neon_from_magenta");
        offerNeonLightRecipe(exporter,PINK_NEON_LIGHT,Blocks.PINK_STAINED_GLASS);
        ShapelessRecipeJsonBuilder.create(RAINBOW_NEON_LIGHT,8).input(RED_NEON_LIGHT).input(ORANGE_NEON_LIGHT).input(YELLOW_NEON_LIGHT).input(GREEN_NEON_LIGHT).input(CYAN_NEON_LIGHT).input(BLUE_NEON_LIGHT).input(PURPLE_NEON_LIGHT).input(PINK_NEON_LIGHT).criterion("has_neon", conditionsFromTag(DustrialTags.NEON_BLOCKS)).offerTo(exporter);

        offerPolishedStoneRecipe(exporter, DustrialBlocks.BOLTED_INDUSTRIAL_IRON_BLOCK, DustrialBlocks.INDUSTRIAL_IRON_BLOCK);
        offerSlabNStairsRecipes(exporter, DustrialBlocks.BOLTED_INDUSTRIAL_IRON_SLAB, DustrialBlocks.BOLTED_INDUSTRIAL_IRON_STAIRS, DustrialBlocks.BOLTED_INDUSTRIAL_IRON_BLOCK);
        //cardboard
        ShapedRecipeJsonBuilder.create(DustrialItems.CARDBOARD, 2).input('#', Items.PAPER).pattern("##").pattern("##").criterion("has_paper",conditionsFromItem(Items.PAPER)).offerTo(exporter);
        createTransmutationRecipe(DustrialBlocks.CARDBOARD_BOX, Ingredient.ofItems(DustrialBlocks.FOLDED_CARDBOARD)).criterion("has_folded",conditionsFromItem(DustrialBlocks.FOLDED_CARDBOARD)).offerTo(exporter);
        offerPolishedStoneRecipe(exporter, FOLDED_CARDBOARD,SMOOTH_CARDBOARD);
        ShapedRecipeJsonBuilder.create(DustrialItems.CARDBOARD_HELMET).input('#', DustrialItems.CARDBOARD).pattern("###").pattern("# #").criterion("has_cardboard",conditionsFromItem(DustrialItems.CARDBOARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(DustrialItems.CARDBOARD_CHESTPLATE).input('#', DustrialItems.CARDBOARD).pattern("# #").pattern("###").pattern("###").criterion("has_cardboard",conditionsFromItem(DustrialItems.CARDBOARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(DustrialItems.CARDBOARD_LEGGINGS).input('#', DustrialItems.CARDBOARD).pattern("###").pattern("# #").pattern("# #").criterion("has_cardboard",conditionsFromItem(DustrialItems.CARDBOARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(DustrialItems.CARDBOARD_BOOTS).input('#', DustrialItems.CARDBOARD).pattern("# #").pattern("# #").criterion("has_cardboard",conditionsFromItem(DustrialItems.CARDBOARD)).offerTo(exporter);
        createDoorRecipe(DustrialBlocks.CARDBOARD_DOOR, Ingredient.ofItems(DustrialItems.CARDBOARD)).criterion("has_cardboard",conditionsFromItem(DustrialItems.CARDBOARD)).offerTo(exporter);
        createTrapdoorRecipe(DustrialBlocks.CARDBOARD_TRAPDOOR, Ingredient.ofItems(DustrialItems.CARDBOARD)).criterion("has_cardboard",conditionsFromItem(DustrialItems.CARDBOARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(DustrialBlocks.CARDBOARD_SCRAP, 8).input('#', DustrialTags.CARDBOARD_BLOCKS).pattern("###").pattern("# #").pattern("###").criterion("has_cardboard",conditionsFromTag(DustrialTags.CARDBOARD_BLOCKS)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(DustrialBlocks.CAST_IRON_BALUSTRADE, 16).input('#', DustrialItems.CAST_IRON_BILLET).pattern("###").pattern("###").criterion(hasItem(DustrialItems.CAST_IRON_BILLET),conditionsFromItem(DustrialItems.CAST_IRON_BILLET)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(DustrialItems.CAST_IRON_BILLET, 4).input('#', Items.IRON_INGOT).input('$',Items.COAL).pattern("#$").pattern("$$").criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
        offerEmptyFrameRecipe(exporter,CAST_IRON_BLOCK, CAST_IRON_BILLET,12);
        offerPolishedStoneRecipe(exporter,CAST_IRON_BRICKS,CAST_IRON_BLOCK);
        offerSlabNStairsRecipes(exporter, CAST_IRON_BRICKS_SLAB, CAST_IRON_BRICKS_STAIRS, CAST_IRON_BRICKS);
        offerPillarRecipe(exporter, CAST_IRON_PILLAR, CAST_IRON_BLOCK);
        offerDetailedDoorRecipe(exporter, CHAIN_DOOR, CHAIN_LINK_FENCE, Items.IRON_INGOT);
        offerReversibleCompactingRecipes(exporter, Blocks.CHAIN, WRAPPED_CHAINS, "wrapped_chains",null,"chains_from_wrapped",null);
        ShapedRecipeJsonBuilder.create(CHAIN_LINK_FENCE, 16).input('#', Blocks.CHAIN).pattern("# #").pattern(" # ").pattern("# #").criterion("has_chain",conditionsFromItem(Blocks.CHAIN)).offerTo(exporter);
        offerDetailedTrapDoorRecipe(exporter, CHAIN_TRAPDOOR, CHAIN_LINK_FENCE, Items.IRON_INGOT);
        //cinder
        ShapedRecipeJsonBuilder.create(CINDER_BLOCK, 4).input('#', DustrialTags.CONCRETE_POWDER).input('$',Items.COAL).pattern("#$").pattern("$#").criterion("has_concrete",conditionsFromTag(DustrialTags.CONCRETE_POWDER)).offerTo(exporter);
        offerPolishedStoneRecipe(exporter,POLISHED_CINDER_BLOCK, CINDER_BLOCK);
        offerPolishedStoneRecipe(exporter,CINDER_BRICKS, POLISHED_CINDER_BLOCK);
        offerSlabNStairsRecipes(exporter, CINDER_BRICKS_SLAB, CINDER_BRICKS_STAIRS, CINDER_BRICKS);

        offerSingleOutputShapelessRecipe(exporter,ENGRAVED_CAST_IRON_BLOCK, CAST_IRON_PILLAR,null);
        offerChainRecipe(exporter, GOLD_CHAIN , Items.GOLD_NUGGET, Items.GOLD_INGOT,8);
        offerReversibleCompactingRecipes(exporter, GOLD_CHAIN, WRAPPED_GOLD_CHAINS, "wrapped_gold_chains",null,"chains_from_gold_wrapped",null);
        ShapedRecipeJsonBuilder.create(INDUSTRIAL_IRON_BILLET, 4).input('#', Items.IRON_INGOT).input('$',Items.COAL).pattern("#$").pattern("$#").criterion("has_iron_ingot",conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
        offerEmptyFrameRecipe(exporter,INDUSTRIAL_IRON_BLOCK, INDUSTRIAL_IRON_BILLET,12);
        createDoorRecipe(INDUSTRIAL_IRON_DOOR, Ingredient.ofItems(INDUSTRIAL_IRON_BILLET)).criterion("has_industrial_billet", conditionsFromItem(INDUSTRIAL_IRON_BILLET)).offerTo(exporter);
        offerPillarRecipe(exporter, INDUSTRIAL_IRON_PILLAR, INDUSTRIAL_IRON_BLOCK);
        ShapedRecipeJsonBuilder.create(INDUSTRIAL_IRON_TRAPDOOR).input('#', INDUSTRIAL_IRON_BILLET).pattern("##").pattern("##").criterion("has_industrial_billet",conditionsFromItem(INDUSTRIAL_IRON_BILLET)).offerTo(exporter);

        offerBlasting(exporter, SHEETS,Items.IRON_INGOT,0.35F,100, "iron_ingot");
        createDoorRecipe(IRON_BAR_DOOR, Ingredient.ofItems(Items.IRON_BARS)).criterion("has_iron_bars",conditionsFromItem(Items.IRON_BARS)).offerTo(exporter);;
        ShapedRecipeJsonBuilder.create(IRON_BAR_TRAPDOOR).input('#', Items.IRON_BARS).pattern("##").pattern("##").criterion("has_iron_bars",conditionsFromItem(Items.IRON_BARS)).offerTo(exporter);
        offerChainRecipe(exporter, LARGE_CHAIN, Items.IRON_INGOT, Blocks.IRON_BLOCK,12);
        offerChainRecipe(exporter, LARGE_GOLD_CHAIN, Items.GOLD_INGOT, Blocks.GOLD_BLOCK,12);
        //todo:this is not overriding
        // ShapedRecipeJsonBuilder.create(Blocks.CHAIN, 18).input('#', Items.IRON_NUGGET).input('$',Items.IRON_INGOT).pattern("#").pattern("$").pattern("#").criterion("has_iron_ingot",conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter, new Identifier("minecraft","chain"));
        //LANterns:
        offerLargeLanternRecipe(exporter, LARGE_LANTERN, Items.TORCH);
        offerLargeLanternRecipe(exporter, LARGE_REDSTONE_LANTERN, Items.REDSTONE_TORCH);
        offerLargeLanternRecipe(exporter, LARGE_SOUL_LANTERN, Items.SOUL_TORCH);
        offerLargeLanternRecipe(exporter, LARGE_GLOW_LANTERN, Items.GLOWSTONE_DUST);
        offerLargeLanternRecipe(exporter, LARGE_CURSED_LANTERN, Items.ENDER_EYE);
        offerLargeLanternRecipe(exporter, LARGE_ENDER_LANTERN, Items.AMETHYST_SHARD);

        offerPolishedStoneRecipe(exporter, MINI_PADDED_BLOCK, PADDED_BLOCK);
        offerSlabNStairsRecipes(exporter, MINI_PADDED_SLAB, MINI_PADDED_STAIRS, MINI_PADDED_BLOCK);
        offerPolishedStoneRecipe(exporter, PADDED_BLOCK, Blocks.WHITE_WOOL);
        ShapedRecipeJsonBuilder.create(PADDED_BLOCK, 4).input('#', MINI_PADDED_BLOCK).pattern("##").pattern("##").criterion("has_mini_padded_blocks",conditionsFromItem(MINI_PADDED_BLOCK)).offerTo(exporter,new Identifier("padded_block_from_mini"));
        ShapedRecipeJsonBuilder.create(PADDED_DOOR, 3).input('#', DustrialTags.PADDED_BLOCKS).input('$', INDUSTRIAL_IRON_BILLET).pattern("##").pattern("#$").pattern("##").criterion("has_padded", conditionsFromTag(DustrialTags.PADDED_BLOCKS)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(PADDED_TRAPDOOR).input('#', DustrialTags.PADDED_BLOCKS).input('$', INDUSTRIAL_IRON_BILLET).pattern("#$#").pattern("###").criterion("has_padded", conditionsFromTag(DustrialTags.PADDED_BLOCKS)).offerTo(exporter);

        offerFramedRecipe(exporter, REDSTONE_LANTERN, Items.REDSTONE_TORCH, Items.IRON_NUGGET , 1);
        offerReversibleCompactingRecipes(exporter, RUSTY_IRON_INGOT ,RUSTY_IRON_BLOCK, "rusty_iron_block",null, "rusty_ingots_from_block",null);
        offerReversibleCompactingRecipes(exporter, RUSTY_IRON_NUGGET ,RUSTY_IRON_INGOT, "rusty_iron_ingot_from_nugget",null, "rusty_nuggets_from_ingot",null);
        offerDetailedDoorRecipe(exporter, RUSTY_IRON_DOOR, RUSTY_IRON_INGOT, RUSTY_IRON_NUGGET);
        ShapedRecipeJsonBuilder.create(RUSTY_IRON_TRAPDOOR).input('#', RUSTY_IRON_INGOT).pattern("##").pattern("##").criterion("has_rusty_ingot",conditionsFromItem(RUSTY_IRON_INGOT)).offerTo(exporter);
        offerFramedRecipe(exporter,RUSTY_IRON_INGOT, Items.WATER_BUCKET, Items.IRON_INGOT, 8);
        offerFramedRecipe(exporter,RUSTY_IRON_NUGGET, Items.WATER_BUCKET, Items.IRON_NUGGET, 8);
        offerFramedRecipe(exporter,RUSTY_SHEET_METAL, Items.WATER_BUCKET, SHEET_METAL, 8);
        createDoorRecipe(RUSTY_SHEET_METAL_DOOR, Ingredient.ofItems(RUSTY_SHEET_METAL)).criterion("has_rusty_ingot",conditionsFromItem(RUSTY_IRON_INGOT)).offerTo(exporter);
        offerPolishedStoneRecipe(exporter, RUSTY_SHEET_METAL_PANELING, RUSTY_SHEET_METAL_PLATING);
        offerEmptyFrameRecipe(exporter,RUSTY_SHEET_METAL_PLATING, RUSTY_SHEET_METAL, 24);
        offerSlabNStairsRecipes(exporter, RUSTY_SHEET_METAL_PLATING_SLAB, RUSTY_SHEET_METAL_PLATING_STAIRS, RUSTY_SHEET_METAL_PLATING);
        ShapedRecipeJsonBuilder.create(RUSTY_SHEET_METAL_SIDING, 16).input('#', RUSTY_SHEET_METAL).pattern("# #").pattern("# #").pattern("# #").criterion("has_rusty_sheet", conditionsFromItem(RUSTY_SHEET_METAL)).offerTo(exporter);
        createTransmutationRecipe(RUSTY_SHEET_METAL_WALLING, Ingredient.ofItems(RUSTY_SHEET_METAL_SIDING)).criterion("has_rusty_sheet", conditionsFromItem(RUSTY_SHEET_METAL)).offerTo(exporter,"rusty_sheet_metal_walling_from_siding");
        createTransmutationRecipe(RUSTY_SHEET_METAL_SIDING, Ingredient.ofItems(RUSTY_SHEET_METAL_WALLING)).criterion("has_rusty_sheet", conditionsFromItem(RUSTY_SHEET_METAL)).offerTo(exporter,"rusty_sheet_metal_siding_from_walling");
        ShapedRecipeJsonBuilder.create(RUSTY_SHEET_METAL_TRAPDOOR).input('#', RUSTY_SHEET_METAL).pattern("##").pattern("##").criterion("has_rusty_sheet", conditionsFromItem(RUSTY_SHEET_METAL)).offerTo(exporter);
        //maybe should do that little X pttrn
        ShapedRecipeJsonBuilder.create(RUSTY_SHEET_METAL_TREADING, 6).input('#', RUSTY_SHEET_METAL).input('$',Items.IRON_NUGGET).pattern("#$").pattern("$#").criterion("has_rusty_sheet",conditionsFromItem(RUSTY_SHEET_METAL)).offerTo(exporter);
        offerSlabNStairsRecipes(exporter, RUSTY_SHEET_METAL_TREADING_SLAB, RUSTY_SHEET_METAL_TREADING_STAIRS, RUSTY_SHEET_METAL_TREADING);
        ShapedRecipeJsonBuilder.create(RUSTY_SHEET_METAL_WALLING,16).input('#', RUSTY_SHEET_METAL).pattern("###").pattern("   ").pattern("###").criterion("has_rusty_sheet", conditionsFromItem(RUSTY_SHEET_METAL)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(SHEET_METAL, 3).input('#', Items.IRON_INGOT).pattern("###").criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
        createDoorRecipe(SHEET_METAL_DOOR, Ingredient.ofItems(SHEET_METAL));
        offerPolishedStoneRecipe(exporter, SHEET_METAL_PANELING, SHEET_METAL_PLATING);
        offerEmptyFrameRecipe(exporter, SHEET_METAL_PLATING, SHEET_METAL,24);
        offerSlabNStairsRecipes(exporter, SHEET_METAL_PLATING_SLAB, SHEET_METAL_PLATING_STAIRS, SHEET_METAL_PLATING);
        ShapedRecipeJsonBuilder.create(SHEET_METAL_SIDING, 16).input('#', SHEET_METAL).pattern("# #").pattern("# #").pattern("# #").criterion("has_metal_sheet", conditionsFromItem(SHEET_METAL)).offerTo(exporter);
        createTransmutationRecipe(SHEET_METAL_SIDING,Ingredient.ofItems(SHEET_METAL_WALLING)).criterion("has_sheet_metal", conditionsFromItem(SHEET_METAL)).offerTo(exporter,"sheet_metal_walling_from_siding");
        createTransmutationRecipe(SHEET_METAL_WALLING, Ingredient.ofItems(SHEET_METAL_SIDING)).criterion("has_sheet_metal", conditionsFromItem(SHEET_METAL)).offerTo(exporter,"sheet_metal_siding_from_walling");
        ShapedRecipeJsonBuilder.create(SHEET_METAL_TRAPDOOR).input('#', SHEET_METAL).pattern("##").pattern("##").criterion("has_sheet_metal",conditionsFromItem(SHEET_METAL)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(SHEET_METAL_TREADING, 6).input('#', SHEET_METAL).input('$',Items.IRON_NUGGET).pattern("#$").pattern("$#").criterion("has_sheet_metal",conditionsFromItem(SHEET_METAL)).offerTo(exporter);
        offerSlabNStairsRecipes(exporter, SHEET_METAL_TREADING_SLAB, SHEET_METAL_TREADING_STAIRS, SHEET_METAL_TREADING);
        ShapedRecipeJsonBuilder.create(SHEET_METAL_WALLING,16).input('#', SHEET_METAL).pattern("###").pattern("   ").pattern("###").criterion("has_sheet_metal", conditionsFromItem(SHEET_METAL)).offerTo(exporter);
        offerEmptyFrameRecipe(exporter, SMOOTH_CARDBOARD, CARDBOARD,12);
        offerSlabNStairsRecipes(exporter, SMOOTH_CARDBOARD_SLAB, SMOOTH_CARDBOARD_STAIRS, SMOOTH_CARDBOARD);

        //todo:figure out how to generate the fabric load condition
        offerVerticalSlabRecipes(vertExporter, SMOOTH_CARDBOARD_VERTICAL_SLAB, SMOOTH_CARDBOARD_SLAB);
        offerVerticalSlabRecipes(vertExporter, DustrialBlocks.BOLTED_INDUSTRIAL_IRON_VERTICAL_SLAB, DustrialBlocks.BOLTED_INDUSTRIAL_IRON_SLAB);
        offerVerticalSlabRecipes(vertExporter,CINDER_BRICKS_VERTICAL_SLAB, CINDER_BRICKS_SLAB);
        offerVerticalSlabRecipes(vertExporter, CAST_IRON_BRICKS_VERTICAL_SLAB, CAST_IRON_BRICKS_SLAB);
        offerVerticalSlabRecipes(vertExporter, MINI_PADDED_VERTICAL_SLAB, MINI_PADDED_SLAB);
        offerVerticalSlabRecipes(vertExporter, RUSTY_SHEET_METAL_PLATING_VERTICAL_SLAB, RUSTY_SHEET_METAL_PLATING_SLAB);
        offerVerticalSlabRecipes(vertExporter, RUSTY_SHEET_METAL_TREADING_VERTICAL_SLAB, RUSTY_SHEET_METAL_TREADING_SLAB);
        offerVerticalSlabRecipes(vertExporter, SHEET_METAL_PLATING_VERTICAL_SLAB, SHEET_METAL_PLATING_SLAB);
        offerVerticalSlabRecipes(vertExporter, SHEET_METAL_TREADING_VERTICAL_SLAB, SHEET_METAL_TREADING_SLAB);

    }
//    public static void offerShapedRecipe
    public static void offerDetailedDoorRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible base, ItemConvertible detail){
        ShapedRecipeJsonBuilder.create(output, 3).input('#', base).input('$', detail).pattern("##").pattern("#$").pattern("##").criterion(hasItem(base), conditionsFromItem(base)).offerTo(exporter);
    }
    public static void offerDetailedTrapDoorRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible base, ItemConvertible detail){
        ShapedRecipeJsonBuilder.create(output).input('#', base).input('$', detail).pattern("#$#").pattern("###").criterion(hasItem(base), conditionsFromItem(base)).offerTo(exporter);
    }
    public static void offerChainRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2, int count){
        ShapedRecipeJsonBuilder.create(output,count).input('#', input1).input('$', input2).pattern("#").pattern("$").pattern("#").criterion(hasItem(input1), conditionsFromItem(input1)).offerTo(exporter);
    }
    public static void offerEmptyFrameRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible surround , int count){
        ShapedRecipeJsonBuilder.create(output, count).input('#', surround).pattern("###").pattern("# #").pattern("###").criterion(hasItem(surround), conditionsFromItem(surround)).offerTo(exporter);
    }
    public static void  offerFramedRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible center,ItemConvertible around , int count){
        ShapedRecipeJsonBuilder.create(output, count).input('#', around).input('$',center).pattern("###").pattern("#$#").pattern("###").criterion(hasItem(around), conditionsFromItem(around)).offerTo(exporter);
    }

    public static void offerLargeLanternRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible heart){
        ShapedRecipeJsonBuilder.create(output).input('#', Items.IRON_INGOT).input('$', heart).input('G', Items.GLOWSTONE).pattern("###").pattern("$G$").pattern("###").criterion(hasItem(heart), conditionsFromItem(heart)).offerTo(exporter);
    }
    public static void offerNeonLightRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible surround) {
        ShapedRecipeJsonBuilder.create(output, 8).input('#', surround).input('$', Blocks.GLOWSTONE).pattern("###").pattern("#$#").pattern("###").group("neon_light").criterion("has_glowstone", conditionsFromItem(Blocks.GLOWSTONE)).offerTo(exporter);
    }
    public static void offerNeonLightRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible surround, String name) {
        ShapedRecipeJsonBuilder.create(output, 8).input('#', surround).input('$', Blocks.GLOWSTONE).pattern("###").pattern("#$#").pattern("###").group("neon_light").criterion("has_glowstone", conditionsFromItem(Blocks.GLOWSTONE)).offerTo(exporter,name);
    }
    public static void offerPillarRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input){
        ShapedRecipeJsonBuilder.create(output, 2).input('#', input).pattern("#").pattern("#").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerStairsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input){
        createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input),conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerSlabNStairsRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible slab, ItemConvertible stair, ItemConvertible input){
        offerSlabRecipe( exporter, slab, input);
        offerStairsRecipe(exporter,stair, input);
    }
    public static void offerVerticalSlabRecipes(Consumer<RecipeJsonProvider> vertExporter, ItemConvertible output, ItemConvertible input){
        ShapedRecipeJsonBuilder.create(output,3).input('#', input).pattern("#").pattern("#").pattern("#").criterion("has_slab",conditionsFromItem(input)).offerTo(vertExporter,"vertical/"+output.asItem().toString());
        createTransmutationRecipe(input, Ingredient.ofItems(output)).criterion(hasItem(input),conditionsFromItem(input)). offerTo(vertExporter,"vertical/vertical_to_"+input.asItem().toString());
    }
}
