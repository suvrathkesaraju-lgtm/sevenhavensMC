package com.ash.block;

import com.ash.Ash;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {

    public static final Block AirBlock = registerBlock("air_block", properties ->
            new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block AnomalyBlock = registerBlock("anomaly_block", properties ->
            new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS)));
    public static final Block AnomalyRemnant = registerBlock("anomaly_remnant", properties ->
            new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.LANTERN)));
    public static final Block AirRemnant = registerBlock("air_remnant", properties ->
            new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.LANTERN)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier
                .fromNamespaceAndPath(Ash.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Ash.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Ash.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Ash.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Ash.LOGGER.info("Registering ModBlocks");
    }
}
