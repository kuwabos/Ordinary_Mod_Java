package net.isaya.datagen;

import net.isaya.ordinarymod.OrdinaryMod;
import net.isaya.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {
    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, OrdinaryMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(
                Registration.LSItem.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(OrdinaryMod.MODID, "item/longerstick"));
        singleTexture(
                Registration.RLSItem.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(OrdinaryMod.MODID, "item/ridiculouslylongstick"));
        singleTexture(
                Registration.LOSItem.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(OrdinaryMod.MODID, "item/longstick"));
        singleTexture(
                Registration.WOBItem.get().getRegistryName().getPath(),
                new ResourceLocation("item/handheld"),
                "layer0",
                new ResourceLocation(OrdinaryMod.MODID, "item/wob"));

    }

}
