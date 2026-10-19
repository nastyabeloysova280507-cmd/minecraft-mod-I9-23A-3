package com.minecraft_mod_i9_23a;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/* Реестр предметов мода - общая часть.
Регистрация игровых объектов выполняется в общем коде, а не в клиентском:
предмет должен существовать и на выделенном сервере тоже.


 */


public class ModItems {
    // Пространство имен (mod_id) - должно совпадать с полем "id" в fabric.mod.json.
    public static final String MOD_ID = "project_mod2";

    // Ключ реестра предмета. Начиная с Minecraft 1.21.2 параметр registryKey
    // в Item.Settings() обязателен — без него игра падает с "Item id not set".
    public static final RegistryKey<Item> PITCHFORK_KEY =
            RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "pitchfork"));

    // Регистрация предмета "Вилы" (project_mod2:pitchfork).
    // maxCount(1) — инструмент не складывается в стак.
    public static final Item PITCHFORK = register("pitchfork",
            new Item(new Item.Settings().maxCount(1).registryKey(PITCHFORK_KEY)));

    // Универсальный метод регистрирует предмет в реестре игры под id MOD_ID:name
    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    // Точка входа регистрации. В настоящий момент тело пустое: регистрация
    // выполняется в статических полях класса, а этот вызов нужен, чтобы
    // гарантировать загрузку класса из Project_Mod2.onInitialize()
    public static void initialize() {
        // Регистрация выполняется при загрузке класса (статические поля выше)
    }
}
