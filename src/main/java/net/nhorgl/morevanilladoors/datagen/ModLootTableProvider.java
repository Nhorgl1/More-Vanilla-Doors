package net.nhorgl.morevanilladoors.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.nhorgl.morevanilladoors.MoreVanillaDoors;
import net.nhorgl.morevanilladoors.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {
            addDrop(ModBlocks.OAK_GLASS_DOOR,doorDrops(ModBlocks.OAK_GLASS_DOOR));
            addDrop(ModBlocks.SPRUCE_GLASS_DOOR,doorDrops(ModBlocks.SPRUCE_GLASS_DOOR));
            addDrop(ModBlocks.BIRCH_GLASS_DOOR,doorDrops(ModBlocks.BIRCH_GLASS_DOOR));
            addDrop(ModBlocks.JUNGLE_GLASS_DOOR,doorDrops(ModBlocks.JUNGLE_GLASS_DOOR));
            addDrop(ModBlocks.ACACIA_GLASS_DOOR,doorDrops(ModBlocks.ACACIA_GLASS_DOOR));
            addDrop(ModBlocks.DARK_OAK_GLASS_DOOR,doorDrops(ModBlocks.DARK_OAK_GLASS_DOOR));
            addDrop(ModBlocks.MANGROVE_GLASS_DOOR,doorDrops(ModBlocks.MANGROVE_GLASS_DOOR));
            addDrop(ModBlocks.CHERRY_GLASS_DOOR,doorDrops(ModBlocks.CHERRY_GLASS_DOOR));
            addDrop(ModBlocks.BAMBOO_GLASS_DOOR,doorDrops(ModBlocks.BAMBOO_GLASS_DOOR));
            addDrop(ModBlocks.CRIMSON_GLASS_DOOR,doorDrops(ModBlocks.CRIMSON_GLASS_DOOR));
            addDrop(ModBlocks.WARPED_GLASS_DOOR,doorDrops(ModBlocks.WARPED_GLASS_DOOR));
    }
}
