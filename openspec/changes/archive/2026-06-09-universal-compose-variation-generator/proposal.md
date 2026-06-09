## Why

Для каждого нового компонента в `plugin_theme_builder` требуется писать три уровня бойлерплейта: модель свойств (`*Properties`), специфичный конфиг и генератор (`*ComposeVariationGenerator`), который вручную маппирует каждое свойство в вызов билдера стиля. При этом логика маппинга типизированных свойств (цвет, тень, типографика, размеры и т.д.) уже вынесена в универсальные `PropertyMapper`-ы в пакете `universal/`, а мета-информация о свойствах (`PropertyMeta`) генерируется плагином `api-info-ksp`. Необходимо завершить рефакторинг — заменить компонент-специфичные генераторы одним универсальным генератором, управляемым метаданными.

## What Changes

- **Новое**: `UniversalComposeVariationGenerator` — единственный генератор стилей Compose, принимающий `ComponentMeta` и универсальный конфиг компонента; заменяет все компонент-специфичные `*ComposeVariationGenerator`.
- **Новое**: `UniversalComponentConfig` — универсальная модель конфига компонента, в которую парсится JSON-конфиг; хранит свойства как `Map<String, JsonElement>`, доступные по id из `PropertyMeta`.
- **Новое**: `VariationTreeProcessor` — выделенная сущность, инкапсулирующая логику обхода дерева вариаций, создания wrapper-классов и extension-функций; извлечена из `ComposeVariationGenerator`.
- **Удаление**: компонент-специфичные `*Properties`-классы и `*ComposeVariationGenerator`-реализации (по мере переноса каждого компонента на универсальный генератор); `ComposeVariationGenerator` не изменяется.
- **Изменено**: аннотация `@ApiInfo` в модуле `api-info-compose` — добавлен параметр `components: Array<String>`. KSP-процессор `ApiInfoProcessorProvider` в `api-info-ksp` доработан: если `components` не пуст, для одного `@ApiInfo`-интерфейса генерируется по одной `ComponentMeta` на каждое имя из массива. Это позволяет нескольким компонентам разделять один билдер стиля (напр., `TextField` и `TextArea` оба используют `TextFieldStyleBuilder`).

Изменения затрагивают модуль `sdds-core/plugin_theme_builder`, а также `api-info-compose` и `api-info-ksp`. Публичный API компонентов и токенов не меняется. Сгенерированный код семантически эквивалентен; возможны минорные форматные отличия и отсутствие вызовов с дефолтными значениями, которые не присутствуют в конфиге.

## Capabilities

### New Capabilities

- `universal-config-model`: Универсальная модель конфига компонента (`UniversalComponentConfig`) с парсингом свойств по ключу из `PropertyMeta`.
- `universal-variation-generator`: `UniversalComposeVariationGenerator`, делегирующий маппинг свойств соответствующим `PropertyMapper`-ам на основе типа из `PropertyMeta`.
- `variation-tree-processor`: Отдельная сущность `VariationTreeProcessor`, инкапсулирующая обход дерева вариаций и генерацию wrapper/extension-кода.

### Modified Capabilities

- `api-info-compose/@ApiInfo`: Добавлен параметр `components: Array<String>` — позволяет явно задать имена компонентов, использующих один билдер стиля. Если массив пуст, имя выводится из имени интерфейса (прежнее поведение).
- `api-info-ksp/ApiInfoProcessorProvider`: Доработан для генерации нескольких `ComponentMeta` из одного `@ApiInfo`-интерфейса, когда `components` не пуст. Все записи разделяют одни `params`, `resolvedTypes` и `qualifiedName`, но имеют разные `componentName`.

## Impact

- Модули: `sdds-core/plugin_theme_builder`, `sdds-core/api-info-compose`, `sdds-core/api-info-ksp`
- Затронутые пакеты: `internal/universal`, `internal/components/base/compose`; аннотации и KSP-процессор в `api-info-compose`/`api-info-ksp`
- Компонент-специфичные генераторы (~60 файлов в `internal/components/*/compose/`) постепенно удаляются по мере переноса
- Новые компоненты больше не требуют написания `*Properties` и `*ComposeVariationGenerator`
- Gradle конвенции и публичный API плагина не меняются
- Тесты для затронутых генераторов требуют обновления
