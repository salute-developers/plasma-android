## Why

Фабрики стилей Compose preview порождает отдельный модуль `integration-core:preview-generator`, а почти вся остальная генерация
(темы, стили компонентов, песочница) живёт в Gradle-плагине `plugin_theme_builder` (`DsBuilderPlugin`, `sdds-core`). Из-за этого:

- правила выбора перегрузки билдера (`overloadPriority`, `colorOverloadPriority`, фильтры `deprecated` и `Brush`) написаны дважды:
  в `UniversalComposeVariationGenerator` плагина и в `OverloadSelector.kt` генератора; от расхождения защищает только
  `ThemeBuilderDifferentialTest`;
- модель api-меты (`ComponentMeta`/`ParamMeta`) копирует `ComposeComponentMeta`/`ComposePropertyMeta` плагина;
- генератор живёт на JVM 17 только из-за Theme Builder в тестах; для этого в `build.gradle.kts` модулей стоят обходы
  (`jvmTarget` тестов, атрибуты конфигураций, `javaLauncher`);
- запуск через `JavaExec` с `MainKt` и ручной разбор аргументов не похож на остальные задачи плагина (`generateComposeSandbox`).

## What Changes

- Генерация фабрик стилей переносится в `plugin_theme_builder` (пакет `com.sdds.plugin.themebuilder.preview`) и подключается блоком
  `preview { }` в `DsBuilderExtension` с задачей `generateComposePreview`: вход - `uikit-compose-api-meta.json` из classpath (как у
  `UikitComposeApiMetaTask`), выход - каталог исходников `outputLocation` (`BUILD`/`SRC`) в стиле `sandbox`.
- Правила приоритета перегрузок выносятся из `UniversalComposeVariationGenerator` в общие внутренние функции; генератор превью и
  Theme Builder вызывают один и тот же код. Дифференциальный тест удаляется: сравнивать больше нечего.
- Генератор работает на модели меты плагина (`ComposeComponentMeta`); собственные `ApiMeta.kt` и `OverloadSelector.kt` удаляются.
- `integration-core:preview-compose-plugin` вызывает задачу плагина вместо `JavaExec`; `generatePreviewGroups` (реестр историй
  песочницы) и `generatePreviewIcons` остаются на месте.
- Модуль `integration-core:preview-generator` удаляется вместе с обходами JVM 17 в его `build.gradle.kts`.
- Генерируемый код, `preview-plugin.json` и поведение плагина не меняются: тот же результат побайтово на той же мете.

## Capabilities

### New Capabilities

Нет.

### Modified Capabilities

- `compose-preview-style-generation`: генератор является задачей DS Builder plugin и использует общий с Theme Builder код выбора
  перегрузок; дифференциальный тест заменяется проверкой вывода.

## Impact

- `sdds-core/plugin_theme_builder`: новый пакет `preview`, блок `preview` в `DsBuilderExtension`, регистрация задачи в
  `DsBuilderPlugin`, рефакторинг `UniversalComposeVariationGenerator.kt` (общие функции приоритета), тесты.
- `integration-core/preview-compose-plugin/build.gradle.kts`: применение плагина и замена `generatePreviewFactories`.
- `integration-core/preview-generator`: удаляется; `integration-core/settings.gradle.kts` теряет модуль.
- Изменение плагина попадает в релиз `plugin_theme_builder`; в composite-сборке (`includeBuild("../sdds-core")`) оно доступно без релиза.
- Контракт Preview Protocol, клиент DS Builder, манифест и тесты плагина превью не меняются.
