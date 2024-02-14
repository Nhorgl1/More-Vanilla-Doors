package net.nhorgl.morevanilladoors;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nhorgl.morevanilladoors.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MoreVanillaDoors implements ModInitializer {
	public static final String MOD_ID="morevanilladoors";
	public static final RegistryKey<ItemGroup> MORE_VANILLA_DOORS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "more_doors"));
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, MORE_VANILLA_DOORS, FabricItemGroup.builder()
				.icon(() -> new ItemStack(ModBlocks.OAK_GLASS_DOOR))
				.displayName(Text.literal("More Vanilla Doors"))
				.entries((displayContext, entries) -> {
					entries.add(ModBlocks.OAK_GLASS_DOOR);
					entries.add(ModBlocks.SPRUCE_GLASS_DOOR);
					entries.add(ModBlocks.BIRCH_GLASS_DOOR);
					entries.add(ModBlocks.ACACIA_GLASS_DOOR);
					entries.add(ModBlocks.JUNGLE_GLASS_DOOR);
					entries.add(ModBlocks.DARK_OAK_GLASS_DOOR);
					entries.add(ModBlocks.MANGROVE_GLASS_DOOR);
					entries.add(ModBlocks.CHERRY_GLASS_DOOR);
					entries.add(ModBlocks.BAMBOO_GLASS_DOOR);
					entries.add(ModBlocks.CRIMSON_GLASS_DOOR);
					entries.add(ModBlocks.WARPED_GLASS_DOOR);
						}).build());
		ModBlocks.registerModBlocks();
	}
}