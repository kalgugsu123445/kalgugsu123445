package com.losemod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ORE_HG = new Item(new Item.Settings().maxCount(64).fireproof().rarity(Rarity.UNCOMMON));

    public static void registerModItems() {
        Registry.register(Registries.ITEM, Identifier.of("losemod", "ore_hg"), ORE_HG);
    }
}
