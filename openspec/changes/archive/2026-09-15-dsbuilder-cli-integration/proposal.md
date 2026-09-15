## Why

`design-system-builder` (соседний CLI-репозиторий) вводит платформенных делегатов: `dsbuilder theme generate --platform <p>` и
`dsbuilder components generate --platform <p>` делегируют генерацию инструменту платформы. Для Android этим инструментом
является `sdds-core/plugin_theme_builder` (`dsBuilder` Gradle-плагин), запускаемый через `./gradlew` проекта.

Сегодня плагин не готов быть таким инструментом в двух местах:

1. `generateTheme` и `generateComponents` — по одной таске на модуль, а платформа (Compose / View / обе) решается набором
   `targets` в build.gradle.kts модуля. У CLI нет способа извне попросить сгенерировать конкретно Compose или конкретно
   View: `--platform compose` и `--platform android-view` сегодня привели бы к одному и тому же вызову.
2. `components` capability умеет получать конфигурацию только из remote source (`name`+`version` из theme-converter, или
   `url`). Локального `.sdds`-источника для компонентов нет, хотя CLI уже пишет `meta.json` и конфигурации в
   `.sdds/components` (аналогично тому, как это уже сделано для темы в `.sdds/config.json` и `.sdds/tenants`).

Без этих двух вещей CLI-делегат для Android либо не сможет выбирать платформу, либо не сможет генерировать компоненты
из локального `.sdds`-проекта без предварительно опубликованного remote-пакета.

## What Changes

- Для `theme` и `components` capability регистрируются форсированные пер-платформенные Gradle-таски:
  `generateComposeTheme`, `generateViewTheme`, `generateComposeComponents`, `generateViewComponents`. Каждая таска
  генерирует ровно одну платформу независимо от того, что declared в `dsBuilder.targets` (Compose, View или обе).
- Существующие `generateTheme` и `generateComponents` остаются как agregate-таски: они `dependsOn` на все
  зарегистрированные для модуля пер-платформенные таски своей capability. Поведение и имена для проектов, которые уже
  используют `generateTheme`/`generateComponents` (включая `autoGenerate`/`preBuild`), не меняются.
- `dsBuilder.components` получает fallback на локальный `.sdds`-источник, когда явный `source(...)` не задан —
  аналогично тому, как это уже работает для `dsBuilder.theme` (`theme-builder-dsbuilder-source`). Источником служит
  каталог `.sdds/components`, куда `design-system-builder` CLI уже пишет `meta.json` и конфигурации компонентов.
- `documentationAggregate` не меняется в этом изменении: она остаётся одной таской на модуль и сама выбирает платформу
  по приоритету, если включены обе. CLI-делегат документации продолжит использовать её как есть.

## Capabilities

### New Capabilities
- `components-builder-dsbuilder-source`: локальный `.sdds/components` как fallback-источник для `components` capability,
  зеркально `theme-builder-dsbuilder-source`.

### Modified Capabilities
- `ds-builder-gradle-dsl`: добавляется требование о пер-платформенных generation-тасках для `theme` и `components`
  (`generateComposeTheme`, `generateViewTheme`, `generateComposeComponents`, `generateViewComponents`) и их отношении
  к существующим agregate-таскам.

## Impact

- Модуль: `sdds-core/plugin_theme_builder` (`ThemeBuilderPlugin`, `DsBuilderPlugin`, `ComponentsCapability`,
  `ThemeSourceResolver`/`SddsThemeSourceReader` и их components-аналог).
- Публичный Gradle DSL и набор публичных тасок плагина расширяются (новые имена тасок), существующие остаются без
  breaking changes.
- Затрагивает генерацию токенов/компонентов; не затрагивает public API UI-компонентов, `build-system`, `tokens`
  brand-модули (кроме появления новых доступных тасок) или документацию, кроме упомянутого выше.
- Внешняя зависимость: этот пакет разблокирует platform-delegate для Android в `design-system-builder` (CLI),
  который в свою очередь читает и запускает эти таски через `./gradlew`. Сам CLI-делегат — отдельное изменение в
  другом репозитории.
