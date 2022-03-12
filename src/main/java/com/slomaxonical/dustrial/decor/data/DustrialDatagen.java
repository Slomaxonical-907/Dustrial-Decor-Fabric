package com.slomaxonical.dustrial.decor.data;

import com.slomaxonical.dustrial.decor.data.provider.DustrialBlockLootTableProvider;
import com.slomaxonical.dustrial.decor.data.provider.DustrialBlockTagProvider;
import com.slomaxonical.dustrial.decor.data.provider.DustrialItemTagProvider;
import com.slomaxonical.dustrial.decor.data.provider.DustrialRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

/*This whole data package is pretty much inspired (copied) from Blockus by BrandCraft06*/
public class DustrialDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        dataGenerator.addProvider(DustrialRecipeProvider::new);
        FabricTagProvider.BlockTagProvider blockTagProvider = new DustrialBlockTagProvider(dataGenerator);
        dataGenerator.addProvider(blockTagProvider);
        dataGenerator.addProvider(new DustrialItemTagProvider(dataGenerator,blockTagProvider));
        dataGenerator.addProvider(DustrialBlockLootTableProvider::new);
    }
}
