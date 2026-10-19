package com.minecraft_mod_i9_23a;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* Точка входа мода - общая часть кода.
Сюда помещается все, что должно быть и на сервере и на клиенте:
регистрация предметов, блоков, материалов инструментов, обработчик событий

Здесь не пишется код отображения (модели, текстуры, частицы, экраны) -
он относится только к клиенту и
  - код:   src/client/java/...  (класс Project_Mod2Client)
  - ресурсы: src/client/resources/assets/project_mod2/ (models, textures, lang)

Благодаря splitEnvironmentSourceSets() в build.gradle клиентский код
физически отделён от общего и попадёт в игру только на стороне клиента.
 */

public class Project_Mod2 implements ModInitializer {
	public static final String MOD_ID = "project_mod2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Регистрация предметов мода - общий код (src/main),
		// поэтому вызывается именно здесь, а не в клиентском инициализаторе
		ModItems.initialize();
	}

	// Вспомогательный метод: строит идентификатор вида "project_mod2:<path>".
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
