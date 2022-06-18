package com.slomaxonical.dustrial.decor.registry;

import com.slomaxonical.dustrial.decor.configs.DustrialConfigs;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import com.slomaxonical.dustrial.decor.DustrialDecor;
import com.slomaxonical.dustrial.decor.blocks.*;
import com.slomaxonical.dustrial.decor.blocks.DirectionalBlock;
import com.slomaxonical.dustrial.decor.items.CardboardArmorMaterial;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class DustrialBlocks {

    public static final BlockSoundGroup CARDBOARD_SOUND = new BlockSoundGroup(1.0F, 1.0F, SoundEvents.ITEM_CROP_PLANT, SoundEvents.ITEM_CROP_PLANT, SoundEvents.ITEM_CROP_PLANT, SoundEvents.ITEM_CROP_PLANT, SoundEvents.ITEM_CROP_PLANT);

    public static final CardboardArmorMaterial CARDBOARD_ARMOR_MATERIAL = new CardboardArmorMaterial();

    public static final Block PADDED_BLOCK = new PaddedBlock(FabricBlockSettings.of(Material.WOOL, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.WOOL).strength(1F, 1F));

    public static final Block MINI_PADDED_BLOCK = new PaddedBlock(FabricBlockSettings.copyOf(PADDED_BLOCK));

    public static final Block MINI_PADDED_SLAB = new PaddedSlab(FabricBlockSettings.copyOf(PADDED_BLOCK));

    public static final Block MINI_PADDED_VERTICAL_SLAB = new PaddedVerticalSlab(FabricBlockSettings.copyOf(PADDED_BLOCK));

    public static final Block MINI_PADDED_STAIRS = new PaddedStairs(FabricBlockSettings.copyOf(PADDED_BLOCK));

    public static final Block PADDED_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.WOOL).nonOpaque());

    public static final Block PADDED_DOOR = new DoorBlock(FabricBlockSettings.copyOf(PADDED_TRAPDOOR));

    public static final Block CHAIN_LINK_FENCE = new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).sounds(BlockSoundGroup.CHAIN));

    public static final Block BARBED_CHAIN_LINK_FENCE = new DustrialPane(FabricBlockSettings.copyOf(Blocks.IRON_BARS).sounds(BlockSoundGroup.CHAIN), true);

    public static final Block BARBED_IRON_BARS = new DustrialPane(FabricBlockSettings.copyOf(Blocks.IRON_BARS).sounds(BlockSoundGroup.METAL), true);

    public static final Block GOLD_CHAIN = new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN));

    public static final Block LARGE_CHAIN = new LargeChain(FabricBlockSettings.copyOf(Blocks.CHAIN));

    public static final Block LARGE_GOLD_CHAIN = new LargeChain(FabricBlockSettings.copyOf(Blocks.CHAIN));

    //Todo: ADD the ice chain without environmental compat...
//    public static final Block LARGE_ICE_CHAIN = new LargeChain(FabricBlockSettings.copyOf(Blocks.CHAIN));


    public static final Block ANCHOR = new DoubleBlock(FabricBlockSettings.copyOf(Blocks.CHAIN));

    public static final Block HOOK = new HookBlock(FabricBlockSettings.copyOf(Blocks.CHAIN));


    public static final Block CHAIN_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.STONE).strength(1F, 1F).sounds(BlockSoundGroup.CHAIN).mapColor(MapColor.TERRACOTTA_BLUE).nonOpaque());

    public static final Block CHAIN_DOOR = new DoorBlock(FabricBlockSettings.copyOf(CHAIN_TRAPDOOR));

    public static final Block INDUSTRIAL_IRON_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block INDUSTRIAL_IRON_PILLAR = new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block BOLTED_INDUSTRIAL_IRON_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block BOLTED_INDUSTRIAL_IRON_SLAB = new SlabBlock(FabricBlockSettings.copyOf(BOLTED_INDUSTRIAL_IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block BOLTED_INDUSTRIAL_IRON_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(BOLTED_INDUSTRIAL_IRON_BLOCK));

    public static final Block BOLTED_INDUSTRIAL_IRON_STAIRS = new StairsBlock(BOLTED_INDUSTRIAL_IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BOLTED_INDUSTRIAL_IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block INDUSTRIAL_IRON_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE).nonOpaque());

    public static final Block INDUSTRIAL_IRON_DOOR = new DoorBlock(FabricBlockSettings.copyOf(INDUSTRIAL_IRON_TRAPDOOR));

    public static final Block CAST_IRON_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block CAST_IRON_PILLAR = new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block CAST_IRON_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block CAST_IRON_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(CAST_IRON_BRICKS).sounds(BlockSoundGroup.NETHERITE));

    public static final Block CAST_IRON_BRICKS_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(CAST_IRON_BRICKS));

    public static final Block CAST_IRON_BRICKS_STAIRS = new StairsBlock(CAST_IRON_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(CAST_IRON_BRICKS).sounds(BlockSoundGroup.NETHERITE));

    public static final Block ENGRAVED_CAST_IRON_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

    public static final Block CAST_IRON_BALUSTRADE = new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));

//    public static final Block CAST_IRON_FACADE = new DustrialPane(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE));
//    //public static final RegistryObject<Item> CAST_IRON_FACADE_ITEM = ITEMS.register("cast_iron_facade", () -> new BlockItem(CAST_IRON_FACADE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final Block SHEET_METAL_PLATING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block SHEET_METAL_PLATING_SLAB = new SlabBlock(FabricBlockSettings.copyOf(SHEET_METAL_PLATING));

    public static final Block SHEET_METAL_PLATING_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(SHEET_METAL_PLATING));

    public static final Block SHEET_METAL_PLATING_STAIRS = new StairsBlock(SHEET_METAL_PLATING.getDefaultState(), FabricBlockSettings.copyOf(SHEET_METAL_PLATING));

    public static final Block SHEET_METAL_PANELING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block SHEET_METAL_SIDING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block SHEET_METAL_WALLING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block SHEET_METAL_TREADING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block SHEET_METAL_TREADING_SLAB = new SlabBlock(FabricBlockSettings.copyOf(SHEET_METAL_TREADING));

    public static final Block SHEET_METAL_TREADING_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(SHEET_METAL_TREADING));

    public static final Block SHEET_METAL_TREADING_STAIRS = new StairsBlock(SHEET_METAL_TREADING.getDefaultState(), FabricBlockSettings.copyOf(SHEET_METAL_TREADING));

    public static final Block SHEET_METAL_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.STONE).strength(1F, 1F).sounds(BlockSoundGroup.METAL));

    public static final Block SHEET_METAL_DOOR = new DoorBlock(FabricBlockSettings.copyOf(SHEET_METAL_TRAPDOOR));

    //hreer RUSTY_SHEET_METAL

    public static final Block RUSTY_SHEET_METAL_PLATING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block RUSTY_SHEET_METAL_PLATING_SLAB = new SlabBlock(FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_PLATING));

    public static final Block RUSTY_SHEET_METAL_PLATING_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_PLATING));

    public static final Block RUSTY_SHEET_METAL_PLATING_STAIRS = new StairsBlock(RUSTY_SHEET_METAL_PLATING.getDefaultState(), FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_PLATING));

    public static final Block RUSTY_SHEET_METAL_PANELING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block RUSTY_SHEET_METAL_SIDING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block RUSTY_SHEET_METAL_WALLING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block RUSTY_SHEET_METAL_TREADING = new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).strength(3.0F, 3.5F).sounds(BlockSoundGroup.METAL));

    public static final Block RUSTY_SHEET_METAL_TREADING_SLAB = new SlabBlock(FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_TREADING));

    public static final Block RUSTY_SHEET_METAL_TREADING_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_TREADING));

    public static final Block RUSTY_SHEET_METAL_TREADING_STAIRS = new StairsBlock(RUSTY_SHEET_METAL_TREADING.getDefaultState(), FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_TREADING));

    public static final Block RUSTY_SHEET_METAL_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.STONE).strength(1F, 1F).sounds(BlockSoundGroup.METAL));

    public static final Block RUSTY_SHEET_METAL_DOOR = new DoorBlock(FabricBlockSettings.copyOf(RUSTY_SHEET_METAL_TRAPDOOR));

    public static final Block CINDER_BLOCK = new CinderBlock(FabricBlockSettings.copyOf(Blocks.STONE));

    public static final Block POLISHED_CINDER_BLOCK = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STONE));

    public static final Block CINDER_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE));

    public static final Block CINDER_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(CINDER_BRICKS));

    public static final Block CINDER_BRICKS_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(CINDER_BRICKS));

    public static final Block CINDER_BRICKS_STAIRS = new StairsBlock(CINDER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(CINDER_BRICKS));

    //here CARDBOARD item

    public static final Block CARDBOARD_BOX = new DirectionalBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.OAK_TAN).strength(1.0F, 0.3F).sounds(CARDBOARD_SOUND));

    public static final Block SMOOTH_CARDBOARD = new CardboardBlock(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.0F, 0.3F).sounds(CARDBOARD_SOUND));

    public static final Block SMOOTH_CARDBOARD_SLAB = new CardboardSlab(FabricBlockSettings.copyOf(SMOOTH_CARDBOARD));

    public static final Block SMOOTH_CARDBOARD_VERTICAL_SLAB = new VerticalSlabBlock(FabricBlockSettings.copyOf(SMOOTH_CARDBOARD));

    public static final Block SMOOTH_CARDBOARD_STAIRS = new CardboardStairs(FabricBlockSettings.copy(SMOOTH_CARDBOARD));

    public static final Block FOLDED_CARDBOARD = new CardboardBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.OAK_TAN).strength(1.0F, 0.3F).sounds(CARDBOARD_SOUND));

    public static final Block CARDBOARD_SCRAP = new CardboardBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.OAK_TAN).strength(1.0F, 0.3F).sounds(CARDBOARD_SOUND));

    public static final Block CARDBOARD_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.OAK_TAN).strength(1.0F, 0.3F).sounds(CARDBOARD_SOUND));

    public static final Block CARDBOARD_DOOR = new DoorBlock(FabricBlockSettings.of(Material.DECORATION, MapColor.OAK_TAN).strength(1.0F, 0.3F).sounds(CARDBOARD_SOUND).nonOpaque());

    //  ARMOR then RUSTY HERE

    public static final Block RUSTY_IRON_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));

    public static final Block RUSTY_IRON_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR));

    public static final Block RUSTY_IRON_DOOR = new DoorBlock(FabricBlockSettings.copyOf(RUSTY_IRON_TRAPDOOR));

    public static final Block WRAPPED_CHAINS = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHAIN));

    public static final Block WRAPPED_GOLD_CHAINS = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHAIN));

//    public static final Block WRAPPED_ICE_CHAINS = new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHAIN));

    public static final Block IRON_BAR_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS));

    public static final Block IRON_BAR_DOOR = new DoorBlock(FabricBlockSettings.copyOf(IRON_BAR_TRAPDOOR));

    public static final Block REDSTONE_LANTERN = new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 7));

    public static final Block LARGE_LANTERN = new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15));

    public static final Block LARGE_SOUL_LANTERN = new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15));

    public static final Block LARGE_REDSTONE_LANTERN = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(getLightValueLit(12)));

    public static final Block LARGE_ENDER_LANTERN = new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15));

    public static final Block LARGE_CURSED_LANTERN = new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15));

    public static final Block LARGE_GLOW_LANTERN = new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(blockState -> 15));

    public static final Block RED_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block ORANGE_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block YELLOW_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block GREEN_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block CYAN_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block BLUE_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block PINK_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block PURPLE_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block RAINBOW_NEON_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 15));

    public static final Block BLACK_LIGHT = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(blockState -> 7));

    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> state.get(Properties.LIT) ? lightValue : 0;
    }

    public static <B extends Block> B registerBlock(String name, B anyBlock) {
        return registerBlock(name, anyBlock, ItemGroup.BUILDING_BLOCKS);
    }

    public static <B extends Block> B registerBlock(String name, B anyBlock, @Nullable ItemGroup group) {
        //block
        B block = Registry.register(Registry.BLOCK, new Identifier(DustrialDecor.MOD_ID, name), anyBlock);
        //blockItem
        BlockItem blockItem = new BlockItem(block, new Item.Settings().group(group));
        Registry.register(Registry.ITEM, new Identifier(DustrialDecor.MOD_ID,name), blockItem);
        ItemStack stack = new ItemStack(blockItem);
        if (name.contains("vertical")) {
            if (AutoConfig.getConfigHolder(DustrialConfigs.class).getConfig().enableVerticalSlabs) DustrialItemGroup.ITEMGROUP_LIST.add(stack);
        }else{
            DustrialItemGroup.ITEMGROUP_LIST.add(stack);
        }
//        if(STRING_SET.contains(name)) {
//            INDEXS.add(APItemgroup.ITEMGROUP_LIST.indexOf(stack));
//        }
        return block;
    }
    public static void registerBlocks(){
        registerBlock("padded_block",PADDED_BLOCK);
        registerBlock("mini_padded_block",MINI_PADDED_BLOCK);
        registerBlock("mini_padded_slab",MINI_PADDED_SLAB);
        registerBlock("mini_padded_vertical_slab",MINI_PADDED_VERTICAL_SLAB);
        registerBlock("mini_padded_stairs",MINI_PADDED_STAIRS);
        registerBlock("padded_trapdoor",PADDED_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("padded_door",PADDED_DOOR,ItemGroup.REDSTONE);
        registerBlock("chain_link_fence",CHAIN_LINK_FENCE);
        registerBlock("barbed_chain_link_fence",BARBED_CHAIN_LINK_FENCE);
        registerBlock("barbed_iron_bars",BARBED_IRON_BARS);
        registerBlock("gold_chain",GOLD_CHAIN,ItemGroup.DECORATIONS);
        registerBlock("large_chain",LARGE_CHAIN,ItemGroup.DECORATIONS);
        registerBlock("large_gold_chain",LARGE_GOLD_CHAIN,ItemGroup.DECORATIONS);
//        registerBlock("large_ice_chain",LARGE_ICE_CHAIN,() -> isLoaded("environmental"));
        registerBlock("anchor",ANCHOR,ItemGroup.DECORATIONS);
        registerBlock("hook",HOOK,ItemGroup.DECORATIONS);
        registerBlock("chain_trapdoor",CHAIN_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("chain_door",CHAIN_DOOR,ItemGroup.REDSTONE);
        registerBlock("industrial_iron_block",INDUSTRIAL_IRON_BLOCK);
        registerBlock("industrial_iron_pillar",INDUSTRIAL_IRON_PILLAR);
        registerBlock("bolted_industrial_iron_block",BOLTED_INDUSTRIAL_IRON_BLOCK);
        registerBlock("bolted_industrial_iron_slab",BOLTED_INDUSTRIAL_IRON_SLAB);
        registerBlock("bolted_industrial_iron_vertical_slab",BOLTED_INDUSTRIAL_IRON_VERTICAL_SLAB);
        registerBlock("bolted_industrial_iron_stairs",BOLTED_INDUSTRIAL_IRON_STAIRS);
        registerBlock("industrial_iron_trapdoor",INDUSTRIAL_IRON_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("industrial_iron_door",INDUSTRIAL_IRON_DOOR,ItemGroup.REDSTONE);
        registerBlock("cast_iron_block",CAST_IRON_BLOCK);
        registerBlock("cast_iron_pillar",CAST_IRON_PILLAR);
        registerBlock("cast_iron_bricks",CAST_IRON_BRICKS);
        registerBlock("cast_iron_brick_slab",CAST_IRON_BRICKS_SLAB);
        registerBlock("cast_iron_brick_vertical_slab",CAST_IRON_BRICKS_VERTICAL_SLAB);
        registerBlock("cast_iron_brick_stairs",CAST_IRON_BRICKS_STAIRS);
        registerBlock("engraved_cast_iron_block",ENGRAVED_CAST_IRON_BLOCK);
        registerBlock("cast_iron_balustrade",CAST_IRON_BALUSTRADE);
//        registerBlock("cast_iron_facade",CAST_IRON_FACADE);
        registerBlock("sheet_metal_plating",SHEET_METAL_PLATING);
        registerBlock("sheet_metal_plating_slab",SHEET_METAL_PLATING_SLAB);
        registerBlock("sheet_metal_plating_vertical_slab",SHEET_METAL_PLATING_VERTICAL_SLAB);
        registerBlock("sheet_metal_plating_stairs",SHEET_METAL_PLATING_STAIRS);
        registerBlock("sheet_metal_paneling",SHEET_METAL_PANELING);
        registerBlock("sheet_metal_siding",SHEET_METAL_SIDING);
        registerBlock("sheet_metal_walling",SHEET_METAL_WALLING);
        registerBlock("sheet_metal_treading",SHEET_METAL_TREADING);
        registerBlock("sheet_metal_treading_slab",SHEET_METAL_TREADING_SLAB);
        registerBlock("sheet_metal_treading_vertical_slab",SHEET_METAL_TREADING_VERTICAL_SLAB);
        registerBlock("sheet_metal_treading_stairs",SHEET_METAL_TREADING_STAIRS);
        registerBlock("sheet_metal_trapdoor",SHEET_METAL_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("sheet_metal_door",SHEET_METAL_DOOR,ItemGroup.REDSTONE);
        registerBlock("rusty_sheet_metal_plating",RUSTY_SHEET_METAL_PLATING);
        registerBlock("rusty_sheet_metal_plating_slab",RUSTY_SHEET_METAL_PLATING_SLAB);
        registerBlock("rusty_sheet_metal_plating_vertical_slab",RUSTY_SHEET_METAL_PLATING_VERTICAL_SLAB);
        registerBlock("rusty_sheet_metal_plating_stairs",RUSTY_SHEET_METAL_PLATING_STAIRS);
        registerBlock("rusty_sheet_metal_paneling",RUSTY_SHEET_METAL_PANELING);
        registerBlock("rusty_sheet_metal_siding",RUSTY_SHEET_METAL_SIDING);
        registerBlock("rusty_sheet_metal_walling",RUSTY_SHEET_METAL_WALLING);
        registerBlock("rusty_sheet_metal_treading",RUSTY_SHEET_METAL_TREADING);
        registerBlock("rusty_sheet_metal_treading_slab",RUSTY_SHEET_METAL_TREADING_SLAB);
        registerBlock("rusty_sheet_metal_treading_vertical_slab",RUSTY_SHEET_METAL_TREADING_VERTICAL_SLAB);
        registerBlock("rusty_sheet_metal_treading_stairs",RUSTY_SHEET_METAL_TREADING_STAIRS);
        registerBlock("rusty_sheet_metal_trapdoor",RUSTY_SHEET_METAL_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("rusty_sheet_metal_door",RUSTY_SHEET_METAL_DOOR,ItemGroup.REDSTONE);
        registerBlock("cinder_block",CINDER_BLOCK);
        registerBlock("polished_cinder_block",POLISHED_CINDER_BLOCK);
        registerBlock("cinder_bricks",CINDER_BRICKS);
        registerBlock("cinder_brick_slab",CINDER_BRICKS_SLAB);
        registerBlock("cinder_brick_vertical_slab",CINDER_BRICKS_VERTICAL_SLAB);
        registerBlock("cinder_brick_stairs",CINDER_BRICKS_STAIRS);
        registerBlock("cardboard_box",CARDBOARD_BOX);
        registerBlock("smooth_cardboard",SMOOTH_CARDBOARD);
        registerBlock("smooth_cardboard_slab",SMOOTH_CARDBOARD_SLAB);
        registerBlock("smooth_cardboard_vertical_slab",SMOOTH_CARDBOARD_VERTICAL_SLAB);
        registerBlock("smooth_cardboard_stairs",SMOOTH_CARDBOARD_STAIRS);
        registerBlock("folded_cardboard",FOLDED_CARDBOARD);
        registerBlock("cardboard_scrap",CARDBOARD_SCRAP);
        registerBlock("cardboard_trapdoor",CARDBOARD_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("cardboard_door",CARDBOARD_DOOR,ItemGroup.REDSTONE);
        registerBlock("rusty_iron_block",RUSTY_IRON_BLOCK);
        registerBlock("rusty_iron_trapdoor",RUSTY_IRON_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("rusty_iron_door",RUSTY_IRON_DOOR,ItemGroup.REDSTONE);
        registerBlock("wrapped_chains",WRAPPED_CHAINS);
        registerBlock("wrapped_gold_chains",WRAPPED_GOLD_CHAINS);
//        registerBlock("wrapped_ice_chains",WRAPPED_ICE_CHAINS, () -> isLoaded("environmental"));
        registerBlock("iron_bar_trapdoor",IRON_BAR_TRAPDOOR,ItemGroup.REDSTONE);
        registerBlock("iron_bar_door",IRON_BAR_DOOR,ItemGroup.REDSTONE);
        registerBlock("redstone_lantern",REDSTONE_LANTERN,ItemGroup.DECORATIONS);
        registerBlock("large_lantern",LARGE_LANTERN,ItemGroup.DECORATIONS);
        registerBlock("large_soul_lantern",LARGE_SOUL_LANTERN,ItemGroup.DECORATIONS);
        registerBlock("large_redstone_lantern",LARGE_REDSTONE_LANTERN,ItemGroup.DECORATIONS);
        registerBlock("large_ender_lantern",LARGE_ENDER_LANTERN,ItemGroup.DECORATIONS);
        registerBlock("large_cursed_lantern",LARGE_CURSED_LANTERN, ItemGroup.DECORATIONS);
        registerBlock("large_glow_lantern",LARGE_GLOW_LANTERN, ItemGroup.DECORATIONS);
        registerBlock("red_neon_light",RED_NEON_LIGHT);
        registerBlock("orange_neon_light",ORANGE_NEON_LIGHT);
        registerBlock("yellow_neon_light",YELLOW_NEON_LIGHT);
        registerBlock("green_neon_light",GREEN_NEON_LIGHT);
        registerBlock("cyan_neon_light",CYAN_NEON_LIGHT);
        registerBlock("blue_neon_light",BLUE_NEON_LIGHT);
        registerBlock("pink_neon_light",PINK_NEON_LIGHT);
        registerBlock("purple_neon_light",PURPLE_NEON_LIGHT);
        registerBlock("rainbow_neon_light",RAINBOW_NEON_LIGHT);
        registerBlock("black_light",BLACK_LIGHT);
    }
}
