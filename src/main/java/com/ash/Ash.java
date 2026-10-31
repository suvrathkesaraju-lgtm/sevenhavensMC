package com.ash;

import com.ash.creativemodtab.ModCreativeModeTabs;
import com.ash.item.Moditems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ash implements ModInitializer {
	public static final String MOD_ID = "ash";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditems.registerModItems();
		ModCreativeModeTabs.registerModCreativeTabs();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
