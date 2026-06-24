## Context

В `plugin_theme_builder` (~60 компонентов) каждый Compose-генератор стилей представляет собой отдельный класс, наследующий `ComposeVariationGenerator<*Properties>`. Класс переопределяет `propsToBuilderCalls`, где вручную маппирует каждое свойство компонентно-специфичного `*Properties`-объекта в строку с вызовом билдера стиля. В итоге каждый новый компонент требует написания трёх слоёв бойлерплейта: модель свойств, парсинг конфига в эту модель и сам генератор.

При этом уже реализованы:
- `PropertyMeta` (sealed interface + реализации для каждого типа свойства), генерируемые `api-info-ksp` для каждого компонента
- `PropertyMapper<ValueType, Meta, StateType, StatefulType>` + все реализации (`ColorPropertyMapper`, `DimensionPropertyMapper`, `ShapePropertyMapper`, `TypographyPropertyMapper`, `ShadowPropertyMapper`, `BooleanPropertyMapper`, `IntegerPropertyMapper`, `FloatPropertyMapper`, `IconPropertyMapper`, `ComponentStyleMapper`, `ValuePropertyMapper`) в пакете `internal/universal/`

Не хватает: 
1. Универсальной модели конфига компонента, позволяющей получить значение свойства по его id из `PropertyMeta`
2. `UniversalComposeVariationGenerator`, который соединяет `ComponentMeta`, универсальный конфиг и `PropertyMapper`-ы
3. Выделения логики обхода дерева вариаций из `ComposeVariationGenerator` в отдельную сущность

Область изменений: только `sdds-core/plugin_theme_builder`, пакеты `internal/universal` и `internal/components/base/compose`.

## Goals / Non-Goals

**Goals:**
- Создать `UniversalComponentConfig` — общую модель конфига компонента на базе `JsonObject`, предоставляющую типизированный доступ к свойствам по id из `PropertyMeta`
- Создать `UniversalComposeVariationGenerator` — единственный генератор стилей Compose, не требующий компонент-специфичных подклассов
- Выделить `VariationTreeProcessor` — инкапсулирует рекурсивный обход дерева вариаций, создание wrapper-классов и extension-функций; очищает `ComposeVariationGenerator` от этой логики
- Перевести хотя бы один компонент на новый генератор для валидации подхода

**Non-Goals:**
- Рефакторинг View-генераторов (`ViewVariationGenerator`)
- Одновременная миграция всех ~60 компонентов (миграция инкрементальная)
- Изменение публичного API плагина или формата конфигов токенов
- Изменение сгенерированного кода компонентов

## Decisions

### 1. Универсальная модель конфига на базе `JsonObject`

**Решение**: `UniversalComponentConfig` хранит свойства вариации как `JsonObject` (kotlinx.serialization) и предоставляет метод `getValue(meta: PropertyMeta): <T>?` для получения типизированного значения по `meta.id`.

**Альтернативы**:
- `Map<String, Any?>` — теряется сериализационный контекст, нужна ручная десериализация каждого типа
- Сохранить `PropertyOwner`-иерархию, но сделать её универсальной (`Map<String, Stateful<*,*>>`) — сложно типизировать без рефлексии

**Почему JsonObject**: уже используется `kotlinx.serialization` `1.4.0` в проекте; `JsonObject` позволяет декодировать конкретный тип `Stateful` на этапе маппинга через `Json.decodeFromJsonElement<T>(jsonElement)`, зная тип из `PropertyMeta`.

### 2. `UniversalComposeVariationGenerator` как финальный класс, не требующий наследования

**Решение**: Класс принимает через конструктор `ComponentMeta` и `Map<String, PropertyMapper<*, *, *, *>>` (регистрируется в фабрике/DI-контейнере плагина). Метод `propsToBuilderCalls` заменяется итерацией по `ComponentMeta.params`: для каждого `PropertyMeta` извлекается значение из `UniversalComponentConfig` и вызывается соответствующий `PropertyMapper.map()`.

**Альтернатива**: Оставить `propsToBuilderCalls` как abstract, но реализовать его через рефлексию — ненадёжно на AGP/KSP-версиях Android.

### 3. `VariationTreeProcessor` как самостоятельная сущность

**Решение**: `VariationTreeProcessor` создаётся как новый независимый класс в пакете `internal/universal/`, реализующий ту же логику обхода дерева вариаций (создание wrapper-классов, extension-функций, словарей вариаций) что и `ComposeVariationGenerator`, но не связанный с ним иерархически. `ComposeVariationGenerator` при этом не изменяется — он продолжает работать для компонентов, не перенесённых на универсальный генератор.

**Альтернатива**: Рефакторинг `ComposeVariationGenerator` с выделением логики наружу — отклонено, так как изменение базового класса рискованно и не является целью задачи.

### 5. Поддержка общих билдеров стилей через `@ApiInfo(components)`

**Проблема**: Некоторые компоненты разделяют один интерфейс билдера стиля. Например, `TextField` и `TextArea` оба используют `TextFieldStyleBuilder`. `api-info-ksp` ранее генерировал одну `ComponentMeta` с `componentName = "TextField"`, из-за чего `universalOrFallback("TextArea")` не находил запись и откатывался к старому `TextFieldConfigDelegate`, который генерировал `singleLine(true)` — некорректное дефолтное значение для TextArea.

**Решение**: Расширить аннотацию `@ApiInfo` параметром `components: Array<String>`. Если массив не пуст, `ApiInfoProcessorProvider` эмитирует по одной `ComponentMeta` для каждого указанного имени (все записи разделяют `qualifiedName`, `params`, `resolvedTypes`). `UniversalComponentConfigDelegate` выводит `styleBuilderName` из `componentMeta.qualifiedName.substringAfterLast(".")`, а не из `componentName` — гарантирует корректный класс билдера даже когда имя компонента не совпадает с именем интерфейса.

**Почему не отдельный @ApiInfo на каждый компонент**: `TextFieldStyleBuilder` специфицирует контракт стиля для обоих компонентов одновременно — дублирование аннотации нарушило бы принцип единственного источника истины для `params`/`resolvedTypes`.

### 4. Инкрементальная миграция компонентов

**Решение**: Оба генератора (`ComposeVariationGenerator`-подклассы и `UniversalComposeVariationGenerator`) сосуществуют. Миграция компонентов происходит по одному, с верификацией через существующие screenshot-тесты. Старые генераторы удаляются после переноса.

## Risks / Trade-offs

- [Риск] Несоответствие id из `PropertyMeta` и ключей в JSON-конфиге → Митигация: `PropertyMeta.id` генерируется `api-info-ksp` напрямую из имён полей конфига, несоответствие невозможно по определению.
- [Риск] Производительность: `JsonObject`-декодирование на каждую вариацию → Митигация: декодирование происходит в compile-time плагина, не в рантайме приложения; производительность не критична.
- [Риск] Сложные свойства (напр., color с `gradient`/`color` type-mix, вложенные `ComponentStyle`) могут потребовать доп. контекста в маппере → Митигация: `PropertyMapper` уже получает полный `Stateful`-объект; при необходимости маппер расширяется без изменения интерфейса.
- [Trade-off] Во время переходного периода существуют два механизма генерации — усложняет поддержку → Принято как необходимая стоимость инкрементальной миграции.

## Migration Plan

1. Реализовать `UniversalComponentConfig`, `VariationTreeProcessor` и `UniversalComposeVariationGenerator` как новые файлы в `internal/universal/` — `ComposeVariationGenerator` не трогается
2. Перевести один простой компонент (напр., `Badge`) на новый генератор; сравнить сгенерированный код с предыдущим
3. Прогнать `:sdds-core:plugin_theme_builder:test` и screenshot-тесты задействованного компонента
4. Инкрементально мигрировать оставшиеся компоненты, удаляя старые `*Properties` и `*ComposeVariationGenerator`-подклассы для перенесённых компонентов

Откат: до удаления старых генераторов откат тривиален — новый генератор просто не используется для данного компонента.

## Open Questions

- Нужно ли поддерживать `group`-группировку вызовов билдера (напр., `.colors { }`, `.dimensions { }`) на уровне `UniversalComposeVariationGenerator`, или достаточно плоского списка вызовов? Текущие маперы генерируют плоские вызовы — возможно, `group` из `PropertyMeta` нужен для этого.
- ~~Как обрабатывать свойства, отсутствующие в конфиге конкретной вариации (null)? Пропускать — текущее поведение компонент-специфичных генераторов.~~ **Решено**: свойства, отсутствующие в конфиге, пропускаются — вызов билдера не генерируется. Следствие: в отличие от компонент-специфичных генераторов, универсальный генератор не воспроизводит дефолтные вызовы, закодированные непосредственно в старом генераторе (напр., `singleLine(false)` для TextArea). Семантика сгенерированного кода при этом идентична, поскольку дефолты совпадают.
