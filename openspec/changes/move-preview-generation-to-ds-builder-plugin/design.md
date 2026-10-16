## Context

`preview-generator` (≈550 строк: `FactoryGenerator.kt` 403, `ApiMeta.kt`, `OverloadSelector.kt`, `Main.kt`) читает
`uikit-compose-api-meta.json` из JAR `uikit-compose` и порождает по фабрике на компонент (KotlinPoet). Плагин уже содержит KotlinPoet,
serialization и модель меты `ComposeComponentMeta` (sealed `ComposePropertyMeta` по видам свойств), задачу `UikitComposeApiMetaTask`
и блок `sandbox` с `outputLocation` (`BUILD`/`SRC`), подключением вывода как source-каталога и привязкой к `preBuild`.

Различие: Theme Builder выбирает перегрузку под конкретное значение конфигурации (градиент это или цвет), а превью получает значения
в рантайме и генерирует вызовы для всех видов. Поэтому общим становится не `selectOverload(value)`, а функции приоритета и фильтры.

## Decisions

1. **Код живёт в плагине, пакет `preview`.** `FactoryGenerator` переносится как внутренний класс, `Main.kt` исчезает. Задача
   `GenerateComposePreviewTask` принимает `metaClasspath` (как `UikitComposeApiMetaTask`), `outputDirectory`, необязательный
   `components` (`-PpreviewComponents`, сейчас `previewComponents`).
2. **Общий код выбора перегрузок.** `overloadPriority`, `colorOverloadPriority`, `acceptsBrush`, `acceptsInteractiveColor`,
   `acceptsColor` выносятся из `UniversalComposeVariationGenerator.kt` в `internal` файл `OverloadRules.kt`; обе стороны вызывают
   его. Поведение Theme Builder не меняется (его тесты `GenerateComponentsTaskTest` и связанные остаются зелёными).
3. **Модель меты плагина.** Генератор адаптируется к sealed `ComposePropertyMeta` (вместо плоской `ParamMeta` с полем `type`).
   Поля, которых генератору не хватает, добавляются в модель плагина как необязательные, без нарушения чтения текущего JSON.
4. **Вывод побайтово прежний.** Перед удалением старого модуля фиксируется эталон: генерация на текущей мете даёт набор файлов; после
   переноса набор сравнивается побайтово. Расхождение допустимо только как осознанное исправление, перечисленное в change.
5. **Тест вместо дифференциального.** `ThemeBuilderDifferentialTest` удаляется. Вместо него тест плагина: golden-файлы для
   небольшого набора компонентов (`BasicButton`, `CheckBox`, `Tabs`, `AvatarGroup`) и тест покрытия (каждая запись меты даёт фабрику
   либо входит в явный список исключений) на тестовой мете в ресурсах плагина.
6. **Подключение в `preview-compose-plugin`.** Модуль применяет плагин и настраивает `preview { }`; мета берётся из той же
   конфигурации `previewApiMeta` (JAR `uikit-compose`). Вывод идёт в `build/generated/preview-factories`, как сейчас.
   `javaLauncher` на JVM 17 не нужен: задача выполняется в Gradle-демоне плагина.
7. **Что остаётся в `integration-core`.** `generatePreviewGroups` (нужен реестр историй песочницы, он есть только в Kotlin-коде модуля)
   и `generatePreviewIcons` (список иконок из репозитория) не переносятся.
8. **Порядок работ.** Сначала общие функции приоритета и тесты Theme Builder, затем перенос генератора с проверкой побайтового
   равенства, затем переключение `preview-compose-plugin`, в конце удаление старого модуля.

## Risks / Trade-offs

- Изменение плагина выходит релизом `plugin_theme_builder`; любая правка генерации превью теперь требует релиза плагина для внешних
  потребителей. В репозитории это прозрачно (composite build), для публикации - дополнительный шаг.
- Рефакторинг `UniversalComposeVariationGenerator.kt` затрагивает генерацию тем всех дизайн-систем; страховка - существующие тесты
  плагина и побайтовое сравнение вывода Theme Builder на текущих тестовых данных.
- Адаптация к sealed-модели меты может выявить расхождения полей (`resolvedTypes`, `packageName`, `hasBrushOverload` против
  вычисляемых признаков) - они фиксируются в тестах, а не обходятся.
- Блок `preview { }` в публичном `DsBuilderExtension` расширяет API плагина; делаем его `internal`-подобным по документации (для
  репозитория), пока нет внешних потребителей.
- Проверка JVM: плагин собран под JVM 17, `integration-core` под 11 - достаточно, поскольку задача плагина выполняется в его
  classloader, но это нужно подтвердить сборкой.
