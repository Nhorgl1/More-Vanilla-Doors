package net.nhorgl.morevanilladoors.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nhorgl.morevanilladoors.MoreVanillaDoors;

public class ModBlocks {
    public static final Block OAK_GLASS_DOOR = registerBlock("oak_glass_door",
            new DoorBlock(BlockSetType.OAK,FabricBlockSettings.copyOf(Blocks.OAK_DOOR)));
    public static final Block SPRUCE_GLASS_DOOR = registerBlock("spruce_glass_door",
            new DoorBlock(BlockSetType.SPRUCE,FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR)));
    public static final Block BIRCH_GLASS_DOOR = registerBlock("birch_glass_door",
            new DoorBlock(BlockSetType.BIRCH,FabricBlockSettings.copyOf(Blocks.BIRCH_DOOR)));
    public static final Block JUNGLE_GLASS_DOOR = registerBlock("jungle_glass_door",
            new DoorBlock(BlockSetType.JUNGLE,FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR)));
    public static final Block ACACIA_GLASS_DOOR = registerBlock("acacia_glass_door",
            new DoorBlock(BlockSetType.ACACIA,FabricBlockSettings.copyOf(Blocks.ACACIA_DOOR)));
    public static final Block DARK_OAK_GLASS_DOOR = registerBlock("dark_oak_glass_door",
            new DoorBlock(BlockSetType.DARK_OAK,FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR)));
    public static final Block MANGROVE_GLASS_DOOR = registerBlock("mangrove_glass_door",
            new DoorBlock(BlockSetType.MANGROVE,FabricBlockSettings.copyOf(Blocks.MANGROVE_DOOR)));
    public static final Block CHERRY_GLASS_DOOR = registerBlock("cherry_glass_door",
            new DoorBlock(BlockSetType.CHERRY,FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR)));
    public static final Block BAMBOO_GLASS_DOOR = registerBlock("bamboo_glass_door",
            new DoorBlock(BlockSetType.BAMBOO,FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR)));
    public static final Block CRIMSON_GLASS_DOOR = registerBlock("crimson_glass_door",
            new DoorBlock(BlockSetType.CRIMSON,FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR)));
    public static final Block WARPED_GLASS_DOOR = registerBlock("warped_glass_door",
            new DoorBlock(BlockSetType.WARPED,FabricBlockSettings.copyOf(Blocks.WARPED_DOOR)));
    public static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(MoreVanillaDoors.MOD_ID,name),block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MoreVanillaDoors.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MoreVanillaDoors.LOGGER.info("Registering Modblocks for " + MoreVanillaDoors.MOD_ID);
    }
}