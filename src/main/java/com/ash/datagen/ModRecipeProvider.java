package com.ash.datagen;

import com.ash.block.ModBlocks;
import com.ash.item.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                //List<ItemLike> ASH_Smeltables = List.of();  //Instsert Moditems/ModBlocks.Block/Itemname seperated by "," whenever i make the smeltable  items

                //oreSmelting(ASH_Smeltables, RecipeCategory.MISC, CookingBookCategory.BLOCKS, Moditems.insert_itemname, 0.25f, 100, "name_of_group");

                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, Moditems.AirShard, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AirBlock);
                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, Moditems.AnomalyShard, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AnomalyBlock);


            }
        };
    }
    public String getName() {
        return  "A.S.H mod Recipes";
    }
}
