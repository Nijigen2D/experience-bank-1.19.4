package net.nijigen;

import net.fabricmc.api.ModInitializer;

import net.nijigen.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExperienceBank implements ModInitializer {
	public static final String MOD_ID = "experiencebank";
    public static final Logger LOGGER = LoggerFactory.getLogger("experiencebank");
	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}