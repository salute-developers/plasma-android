## Why

Генератор стилей `plugin_theme_builder` эмитит Android-only ссылки на ресурсы: иконки как сырой `Int` (`com.sdds.icons.R.drawable.ic_*`), шрифты как `Font(R.font.*, Int)`. Это делает сгенерированные `*Styles.kt` непригодными к компиляции в `commonMain` и блокирует пункт 03 перехода дизайн-системы на Compose Multiplatform (CMP). Нужен режим генерации, в котором стили не тянут класс `R` и Android-only перегрузки, но при этом существующий Android/View-вывод остаётся байт-в-байт прежним.

## What Changes

- В DSL плагина (`compose { ... }`) вводится суб-флаг `multiplatform(true)` внутри существующего COMPOSE-таргета (не новый `ThemeBuilderTarget`). Значение по умолчанию `false` — полная обратная совместимость.
- Флаг пробрасывается через `StyleGeneratorDependencies` → `UniversalComponentConfigDelegate` → `PropertyMapperRegistry` → мапперы и `UniversalComposeVariationGenerator`.
- **Иконки:** под CMP-флагом `IconPropertyMapper` эмитит `imageVectorSource(SddsIcons.<Name>)` (пакет `com.sdds.icons.compose`, мультиплатформенный `ImageVector` из модуля `icons-compose`, сгенерированного Valkyrie) вместо `com.sdds.icons.R.drawable.ic_*`. Обёртка `imageVectorSource(...)` применяется и в state-ветке (`getStateTokenRef`), чтобы stateful-иконки собирались как `StatefulValue<ImageSource>`.
- Имя `ImageVector` выводится репликацией алгоритма именования Valkyrie (`ic_add_fill_16` → `AddFill16`, `ic_button_2x2_top_l_fill_36` → `Button2X2TopLFill36`); алгоритм сверен со всем корпусом `icons-compose` байт-в-байт. Проверка существования иконки на этапе генерации не делается — отсутствие `ImageVector` проявится как ошибка компиляции CMP-кода.
- **Шрифты:** под CMP-флагом `FontTokenGenerator` эмитит `Font(Res.font.*)` через `org.jetbrains.compose.resources` вместо `Font(R.font.*, Int)`. Следствие: `FontTokens` становятся `@Composable`-геттерами (структурная правка генератора). Вариативные шрифты (`variationSettings`) в compose-resources 1.7.3 недоступны — гейтятся до CMP ≥ 1.8.x (потребителей `variableFonts` сейчас нет).
- `addCommonImports()`: мёртвый импорт `painterResource` делается условным/убирается; ветка `fromResources` (`dimensionResource`/`R`/`LocalDensity`) под CMP не выполняется.
- Включается двойная генерация (Android-compose + CMP) на переходный период.

Вне скоупа: смена типа билдеров стилей `Int` → `ImageSource` (делается в параллельной ветке `uikit-compose`); размеры `fromResources`/`plasma-stards`; миграция самих vector XML.

## Capabilities

### New Capabilities
- `themebuilder-cmp-styles`: режим мультиплатформенной генерации compose-стилей — CMP-флаг DSL и его проброс, эмиссия иконок через `imageVectorSource(SddsIcons.*)` (включая stateful, имена по правилам Valkyrie), эмиссия шрифтов через compose-resources `Res.font.*`, условная обработка ресурсных импортов, гарантия неизменности Android/View-вывода при выключенном флаге.

### Modified Capabilities
<!-- Нет: при выключенном флаге поведение существующих генераторов идентично, требования спек universal-variation-generator и др. не меняются. -->

## Impact

- **Модуль:** `sdds-core/plugin_theme_builder` — DSL (`ComposeConfigBuilder`), `StyleGeneratorDependencies`, `UniversalComponentConfigDelegate`, `PropertyMapperRegistry`, `UniversalComposeVariationGenerator.addCommonImports()`, `IconPropertyMapper`, `FontTokenGenerator`, `ImportCollector`.
- **Публичный API плагина (Gradle):** добавляется DSL-метод `compose { multiplatform(...) }` — обратно совместимо (default `false`).
- **Зависимости генерируемого кода:** CMP-вывод начинает зависеть от `sdds-core/icons-compose` (пакет `com.sdds.icons.compose`, объект `SddsIcons`) и от `org.jetbrains.compose.resources` (шрифты). Android-вывод — без изменений.
- **Токены:** ~7–8 compose-тем; CMP-вывод пишется в `commonMain` целевого модуля (раскладка модуля — план 06, вне этой задачи).
- **Тесты:** golden-дифф Android/View при флаге off (должен быть пустым), юнит-тесты `IconPropertyMapper`/`FontTokenGenerator` на CMP-emit.
- **Docs generation / View-стек:** не затрагиваются.
