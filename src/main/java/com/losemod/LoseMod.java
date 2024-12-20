package com.losemod;

import net.fabricmc.api.ModInitializer;

public class LoseMod implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
