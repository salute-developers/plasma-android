## 1. Compose: аннотация и процессор

- [x] 1.1 Добавить `@ApiDeprecated(message = "")` в `sdds-core/uikit-compose/.../api/info/compose/ApiInfo.kt` (target `FUNCTION`, retention `SOURCE`), обновить `uikit-compose.api`
- [x] 1.1a Написать KDoc для `@ApiDeprecated` (на русском, как у соседних аннотаций): назначение; параметр `message` и допустимость пустого значения; что метод попадает в `uikit-compose-api-meta.json` с `deprecated`, тогда как метод с одним `@Deprecated` из меты исключается; что статус относится к свойству целиком: если помечена хотя бы одна перегрузка, `deprecated` получают все записи меты с тем же `id` (`@ApiName` либо имя метода), `message` берётся у первой помеченной перегрузки в порядке объявления, различие сообщений не ошибка; что генератор стилей пропускает такие свойства; короткий пример с перегрузками; явно указать, что `@ApiDeprecated` — разметка API-меты, а не замена Kotlin `@Deprecated` (см. 1.1b)
- [x] 1.1b Описать различие `@Deprecated` и `@ApiDeprecated` в `sdds-core/plugin_theme_builder/COMPOSE_STYLE_GENERATOR.md`: в разделе «Как KSP читает билдер» (где сказано про исключение методов с `@Deprecated`) и новым подразделом «`@ApiDeprecated`» в «Аннотациях». В тексте: `@Deprecated` — нативная разметка Kotlin-кода для компилятора и IDE (предупреждения, `ReplaceWith`), на мету не влияет, метод с ним исключается из JSON; `@ApiDeprecated` — разметка API-меты, не влияет на компиляцию и не создаёт предупреждений, нужна только чтобы сообщить потребителям меты об устаревшем свойстве; таблица «что делает каждая», случай «нужны обе» (метод помечен обоими: он попадает в мету с `deprecated`), правило распространения по `id`
- [x] 1.2 Добавить `DeprecatedMeta(message)` и поле `deprecated: DeprecatedMeta? = null` в `ComposeParameterMeta` (`ApiInfoData.kt`)
- [x] 1.3 В `ApiInfoProcessor` включать методы с `@ApiDeprecated` (оставив фильтр по голому `kotlin.Deprecated`) и заполнять `deprecated.message`
- [x] 1.4 После сбора параметров компонента распространять `deprecated` на все записи с тем же `id` (message — у первой помеченной перегрузки)
- [x] 1.5 Убедиться, что у не-deprecated параметров поле не пишется в JSON (`explicitNulls`/эквивалент)

## 2. Compose: consumer

- [x] 2.1 Добавить `DeprecatedMeta` и `deprecated` в `ComposePropertyMeta` и все 12 подтипов (`ComposeComponentMeta.kt`), проверить `ignoreUnknownKeys` в `UikitComposeApiMetaTask`
- [x] 2.2 Фильтровать `deprecated != null` в `UniversalComposeVariationGenerator.paramOverloads` до `groupBy id`

## 3. View: разметка и producer

- [x] 3.1 Добавить `ATTR_API_DEPRECATED = "sdds:api_deprecated"` в `DeclareStyleableParser` и разбор: наличие атрибута = deprecated, пустое значение допустимо
- [x] 3.2 Добавить `DeprecatedMeta` и `deprecated: DeprecatedMeta? = null` в `PropertyMeta` (`ApiMeta.kt`); не сериализовать `null`
- [x] 3.3 Описать `sdds:api_deprecated` в `VIEW_STYLE_GENERATOR.md` (для View нативной депрекации в XML нет, `sdds:api_deprecated` — единственный источник; указать, что на `android:`-атрибуты платформенная депрекация не переносится автоматически) (словарь `sdds` в ресурсах не объявляется — он живёт в парсере и `MarkupVocabularyTest`)

## 4. View: consumer

- [x] 4.1 Добавить `DeprecatedMeta` и `deprecated` в `view/ComponentMeta.kt` (`PropertyMeta`), проверить чтение JSON с полем и без него
- [x] 4.2 Фильтровать deprecated-записи в `ViewMetaIndex.forComponent` (для `params` и `subStyles`), по записи, без распространения по `id`

## 5. Тесты

- [x] 5.1 `DeclareStyleableParserTest`: deprecated с сообщением, с пустым значением, отсутствие поля без разметки, непропагация на другой `<attr>` с тем же `id`
- [x] 5.2 `MarkupVocabularyTest` / `MarkupCoverageTest`: новое имя атрибута в словаре
- [x] 5.3 Тест генерации View-меты на XML-фрагментах через существующую инфраструктуру `DeclareStyleableParserTest`: итоговый JSON (Gson) без `deprecated` у неразмеченных свойств и с ним у размеченных
- [x] 5.4 `UikitApiMetaTaskTest` и тест Compose-consumer: десериализация меты с `deprecated`
- [x] 5.5 Тесты генераторов: Compose — deprecated-свойство не генерируется; View — `sd_textColor` пропущен, `android:textColor` эмитится; все записи `id` устарели — без ошибки

## 6. Проверка

- [x] 6.1 `./gradlew :build-system:conventions:test :sdds-core:plugin_theme_builder:test`
- [x] 6.2 Сквозная проверка без разметки: собрать `:sdds-core:uikit` и `:sdds-core:uikit-compose`, сохранить `uikit-api-meta.json` и `uikit-compose-api-meta.json`, убедиться, что они не изменились относительно `main`
- [x] 6.3 Сквозная проверка с реальной разметкой (временная, не коммитится; единственная проверка Compose-процессора, новых тестовых зависимостей не добавляем): поставить `@ApiDeprecated` на одну из нескольких перегрузок реального метода в `*StyleBuilder` и `sdds:api_deprecated` на `sd_textColor` в `toast_attrs.xml`; запустить KSP-задачу `uikit-compose` и `generateUikitApiMeta`; открыть и показать фрагменты полученных JSON (у всех перегрузок помеченного `id` `deprecated` и одинаковый `message`, у `sd_textColor` `deprecated`, у `android:textColor` нет; также проверить голый `@Deprecated` — в JSON не попадает, и метод без разметки — без поля `deprecated`); откатить разметку
- [x] 6.4 Убедиться на примере из 6.3, что генераторы стилей пропускают deprecated: собрать токен-модуль с этим конфигом и проверить, что сгенерированный стиль не содержит `sd_textColor`, но содержит `android:textColor`
- [x] 6.5 `detektAll`, `spotlessCheck`
