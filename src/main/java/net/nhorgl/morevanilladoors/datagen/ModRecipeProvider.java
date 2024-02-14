package net.nhorgl.morevanilladoors.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.nhorgl.morevanilladoors.MoreVanillaDoors;
import net.nhorgl.morevanilladoors.block.ModBlocks;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.OAK_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.OAK_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.OAK_PLANKS),conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OAK_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.SPRUCE_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.SPRUCE_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.SPRUCE_PLANKS),conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SPRUCE_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.BIRCH_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.BIRCH_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.BIRCH_PLANKS),conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.BIRCH_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.JUNGLE_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.JUNGLE_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.JUNGLE_PLANKS),conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.JUNGLE_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.ACACIA_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.ACACIA_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.ACACIA_PLANKS),conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ACACIA_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.DARK_OAK_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.DARK_OAK_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.DARK_OAK_PLANKS),conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DARK_OAK_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.MANGROVE_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.MANGROVE_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.MANGROVE_PLANKS),conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.MANGROVE_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.CHERRY_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.CHERRY_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.CHERRY_PLANKS),conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.CHERRY_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.BAMBOO_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.BAMBOO_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.BAMBOO_PLANKS),conditionsFromItem(Items.BAMBOO_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.BAMBOO_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.CRIMSON_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.CRIMSON_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.CRIMSON_PLANKS),conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.CRIMSON_GLASS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.WARPED_GLASS_DOOR,3)
                .pattern("WW")
                .pattern("GG")
                .pattern("WW")
                .input('W',Items.WARPED_PLANKS)
                .input('G',Items.GLASS)
                .criterion(hasItem(Items.WARPED_PLANKS),conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.WARPED_GLASS_DOOR)));
    }
}
