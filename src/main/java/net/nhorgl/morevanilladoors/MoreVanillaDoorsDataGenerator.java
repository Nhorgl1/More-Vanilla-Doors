package net.nhorgl.morevanilladoors;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.nhorgl.morevanilladoors.datagen.ModBlockTagProvider;
import net.nhorgl.morevanilladoors.datagen.ModLootTableProvider;
import net.nhorgl.morevanilladoors.datagen.ModModelProvider;
import net.nhorgl.morevanilladoors.datagen.ModRecipeProvider;

public class MoreVanillaDoorsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
