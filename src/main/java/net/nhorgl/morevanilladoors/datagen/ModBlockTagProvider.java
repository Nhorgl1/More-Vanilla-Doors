package net.nhorgl.morevanilladoors.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.nhorgl.morevanilladoors.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_GLASS_DOOR)
                .add(ModBlocks.SPRUCE_GLASS_DOOR)
                .add(ModBlocks.BIRCH_GLASS_DOOR)
                .add(ModBlocks.JUNGLE_GLASS_DOOR)
                .add(ModBlocks.ACACIA_GLASS_DOOR)
                .add(ModBlocks.DARK_OAK_GLASS_DOOR)
                .add(ModBlocks.MANGROVE_GLASS_DOOR)
                .add(ModBlocks.CHERRY_GLASS_DOOR)
                .add(ModBlocks.BAMBOO_GLASS_DOOR)
                .add(ModBlocks.CRIMSON_GLASS_DOOR)
                .add(ModBlocks.WARPED_GLASS_DOOR);
    }
}
