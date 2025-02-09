package net.peepoturik.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.peepoturik.tutorialmod.blocks.ModBlocks;
import net.peepoturik.tutorialmod.item.ModItemGroups;
import net.peepoturik.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Version Control (GitHub) Test
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}