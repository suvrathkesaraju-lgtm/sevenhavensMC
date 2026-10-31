package com.ash.creativemodtab;

import com.ash.item.Moditems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import com.ash.Ash;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModCreativeModeTabs {
    public static final CreativeModeTab SevenHavensTab = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Ash.MOD_ID, "seven_havens_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(Moditems.AirShard))
                    .title(Component.translatable("creativemodetabs.ash.seven_havens_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(Moditems.AirShard);
                        output.accept(Moditems.AnomalyShard);
                    })
                    .build());
    public static void registerModCreativeTabs() {
        Ash.LOGGER.info("Registering ModCreativeModeTabs");
    }
}
