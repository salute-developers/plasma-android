## 1. Общие правила

- [x] 1.1 Вынести `overloadPriority`, `colorOverloadPriority`, `acceptsBrush`, `acceptsInteractiveColor`, `acceptsColor` из `UniversalComposeVariationGenerator.kt` в `OverloadRules.kt`.
- [x] 1.2 Тесты плагина (`GenerateComponentsTaskTest` и связанные) проходят без изменений поведения.

## 2. Перенос генератора

- [x] 2.1 Зафиксировать эталон: сгенерировать фабрики текущим `preview-generator` на мете `uikit-compose` и сохранить набор файлов для сравнения.
- [x] 2.2 Перенести `FactoryGenerator` в `plugin_theme_builder` (пакет `preview`), адаптировать к `ComposeComponentMeta`/sealed `ComposePropertyMeta`.
- [x] 2.3 Добавить `GenerateComposePreviewTask`, блок `preview { }` в `DsBuilderExtension` и регистрацию в `DsBuilderPlugin`.
- [x] 2.4 Вывод на текущей мете совпадает с эталоном побайтово (или расхождения перечислены в change).
- [x] 2.5 Тесты плагина: golden-файлы для `BasicButton`, `CheckBox`, `Tabs`, `AvatarGroup`; тест покрытия меты.

## 3. Подключение и очистка

- [x] 3.1 `preview-compose-plugin`: применить плагин, настроить `preview { }`, заменить `generatePreviewFactories`; сохранить `-PpreviewComponents`.
- [x] 3.2 Удалить `integration-core/preview-generator` (модуль, `settings.gradle.kts`, `ThemeBuilderDifferentialTest`, обходы JVM 17).
- [x] 3.3 Обновить `compose-preview-style-generation` (спека), README модулей и описание PR.

## 4. Проверка

- [x] 4.1 `jvmTest` плагина превью, SDK, контракта и `plugin_theme_builder`; `spotlessCheck`, `detekt`.
- [x] 4.2 `previewPluginArtifact` и `previewPluginBrowserTest` (79 компонентов, 0 проблем).
- [x] 4.3 Сборка тем не изменилась: `generateTheme` и `generateComponents` модуля `tokens/sdds.serv.compose` дают побайтово тот же результат с новым и со старым плагином; 610 тестов плагина проходят.
