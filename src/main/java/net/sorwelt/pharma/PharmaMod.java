package net.sorwelt.pharma;

import net.fabricmc.api.ModInitializer;
import net.sorwelt.pharma.item.ModItemGroups;
import net.sorwelt.pharma.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PharmaMod implements ModInitializer {
    public static final String MOD_ID = "pharma";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("havaem tramadol");

        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();

        LOGGER.info("tramadol zahavan");
    }
}