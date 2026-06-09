## 1. UniversalComponentConfig — универсальная модель конфига

- [x] 1.1 Создать `UniversalPropertyOwner` в пакете `internal/universal/` — реализация `PropertyOwner`, хранящая свойства как `JsonObject`
- [x] 1.2 Реализовать `UniversalPropertyOwner.getValue(meta: PropertyMeta): Stateful<*, *>?` — десериализация значения из `JsonElement` по типу `PropertyMeta`
- [x] 1.3 Реализовать `UniversalPropertyOwner.merge(parent: PropertyOwner): UniversalPropertyOwner` — слияние свойств с приоритетом дочерней вариации
- [x] 1.4 Создать `UniversalComponentConfig` в `internal/universal/` — реализация `Config<UniversalPropertyOwner>`, парсируемая из JSON-конфига компонента без компонент-специфичных классов
- [x] 1.5 Написать unit-тесты для `UniversalPropertyOwner.getValue` для каждого из типов `PropertyMeta` (color, dimension, shape, typography, shadow, boolean, integer, float, icon, component_style, value)
- [x] 1.6 Написать unit-тест для `UniversalPropertyOwner.merge` — проверить приоритет дочерней вариации над родительской

## 2. VariationTreeProcessor — инкапсуляция логики обхода вариаций

- [x] 2.1 Создать `VariationTreeProcessor` в `internal/universal/` — новая самостоятельная сущность, реализующая обход дерева вариаций, создание wrapper-классов и extension-функций (аналог логики из `ComposeVariationGenerator`, но как отдельный независимый класс)
- [x] 2.2 Определить тип коллбэка `BuilderCallsProvider: (props: PropertyOwner, variationId: String) -> List<String>` — интерфейс между `VariationTreeProcessor` и вызывающим генератором
- [x] 2.3 Метод `VariationTreeProcessor.process()` SHALL возвращать `Result` с `variations: Map<String, VariationReference>` и `variationProps: Map<String, List<VariationProp>>`
- [x] 2.4 Написать unit-тесты для `VariationTreeProcessor` — обход плоской структуры вариаций, иерархии, view-вариаций, компонента без вариаций

## 3. UniversalComposeVariationGenerator

- [x] 3.1 Создать `UniversalComposeVariationGenerator` в `internal/universal/` — финальный класс, реализующий `ComponentStyleGenerator<UniversalComponentConfig>`, принимающий `ComponentMeta`, маппер-реестр и стандартные зависимости генератора; использует `VariationTreeProcessor` внутри
- [x] 3.2 Реализовать `propsToBuilderCalls` через итерацию по `ComponentMeta.params`: для каждого `PropertyMeta` → `UniversalPropertyOwner.getValue(meta)` → `PropertyMapper.map()`
- [x] 3.3 Реализовать группировку вызовов билдера по `PropertyMeta.group` (напр., `.colors { }`, `.dimensions { }`)
- [x] 3.4 Написать unit-тесты для `UniversalComposeVariationGenerator` — проверить генерацию вызовов для набора `ComponentMeta` с разными типами свойств
- [x] 3.5 Обновить фабрику/DI-контейнер плагина для регистрации `UniversalComposeVariationGenerator` и маппер-реестра

## 4. Поддержка общих билдеров стилей через @ApiInfo(components)

- [x] 4.1 Добавить параметр `components: Array<String> = []` в аннотацию `@ApiInfo` (`api-info-compose`)
- [x] 4.2 Доработать `ApiInfoProcessorProvider` (`api-info-ksp`): если `components` не пуст, генерировать по одной `ComponentMeta` на каждое имя из массива (все записи разделяют `qualifiedName`, `params`, `resolvedTypes`)
- [x] 4.3 Добавить `@ApiInfo(components = ["TextField", "TextArea"])` к `TextFieldStyleBuilder` в `uikit-compose`
- [x] 4.4 Исправить вывод `styleBuilderName` в `UniversalComponentConfigDelegate`: использовать `componentMeta.qualifiedName.substringAfterLast(".")` вместо `componentName.techToCamelCase() + "StyleBuilder"`

## 5. Валидация на пилотном компоненте

- [ ] 5.1 Выбрать один простой компонент без view-вариаций (например, `Badge`) и перевести его на `UniversalComposeVariationGenerator`
- [ ] 5.2 Убедиться, что сгенерированный `*Styles.kt` семантически идентичен предыдущему (сравнить вручную или через snapshot-тест)
- [ ] 5.3 Удалить `BadgeProperties` и `BadgeComposeVariationGenerator` после успешной валидации
- [ ] 5.4 Выбрать один компонент с view-вариациями и перевести его на `UniversalComposeVariationGenerator`; проверить корректность wrapper-интерфейсов и extension-функций
- [ ] 5.5 Прогнать `:sdds-core:plugin_theme_builder:test` и screenshot-тесты для перенесённых компонентов

## 6. Проверка качества

- [x] 6.1 Запустить `./gradlew :sdds-core:plugin_theme_builder:detekt` и исправить предупреждения
- [x] 6.2 Запустить `./gradlew :sdds-core:plugin_theme_builder:spotlessApply` для форматирования новых файлов
- [x] 6.3 Запустить `./gradlew :sdds-core:plugin_theme_builder:test` — все тесты должны пройти
