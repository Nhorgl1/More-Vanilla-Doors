package net.nhorgl.morevanilladoors.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.nhorgl.morevanilladoors.MoreVanillaDoors;
import net.nhorgl.morevanilladoors.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerDoor(ModBlocks.OAK_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.SPRUCE_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.BIRCH_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.JUNGLE_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.ACACIA_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.DARK_OAK_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.MANGROVE_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.CHERRY_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.BAMBOO_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.CRIMSON_GLASS_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.WARPED_GLASS_DOOR);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
