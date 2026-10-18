package com.minecraft_mod_i9_23a;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final String MOD_ID = "project_mod2";

    public static final RegistryKey<Item> PITCHFORK_KEY =
            RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "pitchfork"));

    public static final Item PITCHFORK = register("pitchfork",
            new Item(new Item.Settings().maxCount(1).registryKey(PITCHFORK_KEY)));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
    public static void initialize() {
        // Регистрация выполняется при загрузке класса (статические поля выше)
    }
}
