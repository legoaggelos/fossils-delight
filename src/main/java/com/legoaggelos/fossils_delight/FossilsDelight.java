package com.legoaggelos.fossils_delight;

import com.github.teamfossilsarcheology.fossil.food.FoodMappingsManager;
import com.legoaggelos.fossils_delight.compat.FossilsArcheologyFeeder;
import com.legoaggelos.fossils_delight.registry.ItemRegistry;
import com.legoaggelos.fossils_delight.registry.TabRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FossilsDelight implements ModInitializer {
	public static final String MOD_ID = "fossils_delight";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ItemRegistry.register();
		TabRegistry.register();
		FoodMappingsManager.INSTANCE.listen(FossilsArcheologyFeeder::registerFoodMappings);
	}
	public static ResourceLocation loc(String path) {
		return ResourceLocation.tryBuild(MOD_ID, path);
	}
}