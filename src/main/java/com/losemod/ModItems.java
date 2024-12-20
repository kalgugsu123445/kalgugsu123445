package com.losemod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Identifier GEM_HG_ID = Identifier.of("losemod", "gem_hg");
    public static final RegistryKey<Item> GEM_HG_KEY = RegistryKey.of(RegistryKeys.ITEM, GEM_HG_ID);

    public static final Item GEM_HG = new Item(new Item.Settings()
            .rarity(Rarity.UNCOMMON)
            .maxCount(64)
            .registryKey(GEM_HG_KEY)
    );

    public static void registerItems() {
        Registry.register(Registries.ITEM, GEM_HG_KEY, GEM_HG);
    }


}
