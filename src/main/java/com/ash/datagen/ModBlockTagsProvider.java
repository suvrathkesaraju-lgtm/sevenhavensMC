package com.ash.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import com.ash.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {

    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AirBlock).get())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AirRemnant).get())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AnomalyBlock).get())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AnomalyRemnant).get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AirBlock).get())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AirRemnant).get())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AnomalyBlock).get())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.AnomalyRemnant).get());
    }
}
