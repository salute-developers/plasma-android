## Why

`uikit-compose-api-meta.json` и `uikit-api-meta.json` не умеют сообщать, что свойство устарело. Compose-процессор вообще выкидывает методы с `@Deprecated`, а в View-разметке `declare-styleable` нет способа пометить атрибут устаревшим. Потребители меты (генераторы, документация, внешние инструменты) не могут отличить устаревшее свойство от актуального и показать сообщение о миграции.

## What Changes

- В мету каждого параметра (`params[*]`) обоих JSON добавляется необязательное поле `deprecated` — объект с единственным полем `message`. Если свойство не устарело, поле в JSON отсутствует.
- **Compose**: в `com.sdds.api.info.compose` добавляется аннотация `@ApiDeprecated(message = "")` (target `FUNCTION`, retention `SOURCE`). `ApiInfoProcessor` включает помеченные методы в мету с полем `deprecated`. Методы с одним лишь `@Deprecated` по-прежнему пропускаются.
- **Compose, перегрузки**: если `@ApiDeprecated` стоит хотя бы на одной перегрузке, процессор помечает `deprecated` все записи с тем же `id`; `message` берётся у первой помеченной перегрузки в порядке объявления.
- **View**: в словарь `sdds` добавляется атрибут `sdds:api_deprecated="<message>"`. `DeclareStyleableParser` кладёт `deprecated` в `PropertyMeta` того `<attr>`, на котором он стоит. Пустое значение допустимо и не является ошибкой: сам факт разметки означает «устарело». На View пометка не распространяется на другие `<attr>` с тем же `id`.
- Генераторы стилей (Compose и View) пропускают параметры с `deprecated`: поведение генерации не меняется, а устаревшие свойства не попадают в стили и ресурсы.
- Сериализация не-deprecated параметров остаётся прежней: поле `deprecated` не пишется.

## Capabilities

### New Capabilities

Нет.

### Modified Capabilities

- `view-api-info`: словарь `sdds` расширяется атрибутом `sdds:api_deprecated`; правила его разбора (допустимость пустого значения, область действия только на один `<attr>`).
- `view-api-meta-generation`: модель `PropertyMeta` получает необязательное `deprecated`; генераторы View исключают такие свойства из вывода.
- `style-builder-api-info`: появляется `@ApiDeprecated`, правила попадания помеченных методов в мету, распространение статуса по `id` на перегрузки и исключение deprecated-свойств из генерации.

## Impact

- **Модули**: `sdds-core/uikit-compose` (аннотация в `ApiInfo.kt`), `sdds-core/api-info-ksp` (`ApiInfoProcessorProvider`, `ApiInfoData`), `build-system/conventions` (`ApiMeta`, `DeclareStyleableParser` и тесты `DeclareStyleableParserTest`, `MarkupVocabularyTest`, `MarkupCoverageTest`), `sdds-core/plugin_theme_builder` (consumer-модели `ComposePropertyMeta`, `view/ComponentMeta`, `UniversalComposeVariationGenerator`, `UniversalViewVariationGenerator`, `ViewMetaIndex`), `VIEW_STYLE_GENERATOR.md`.
- **Потребители меты**: JSON обратно совместим: поле добавляется только у размеченных параметров, неизвестные поля читателям нужно игнорировать (проверить `ignoreUnknownKeys` в consumer-десериализации).
- **Разметка**: сама разметка `@ApiDeprecated` / `sdds:api_deprecated` в компонентах не расставляется в рамках этого change (только механизм); примеры живут в тестах.
- **Валидация**: `./gradlew :build-system:conventions:test`, `:sdds-core:plugin_theme_builder:test`, сборка `:sdds-core:uikit` и `:sdds-core:uikit-compose` с проверкой JSON, `detektAll`, `spotlessCheck`.
