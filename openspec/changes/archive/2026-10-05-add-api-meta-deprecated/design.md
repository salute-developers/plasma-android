## Context

Мета API собирается двумя независимыми producer-ами и читается двумя consumer-моделями:

```
Compose: *StyleBuilder ──KSP ApiInfoProcessor──► ComposeParameterMeta ─JSON─► ComposePropertyMeta (sealed, 12 подтипов)
View:    attrs.xml ──DeclareStyleableParser──► PropertyMeta (Gson) ─JSON─► PropertyMeta (@Serializable)
```

Сейчас Compose-процессор отфильтровывает методы с `kotlin.Deprecated` (`isDeprecated()` в корневых методах и в `flattenBuilderLambda`), поэтому устаревшие свойства в JSON не попадают. Во View понятия устаревшего атрибута в разметке нет.

В Compose `id` свойства = `@ApiName` либо имя метода; перегрузки (`color(Color)`, `color(InteractiveColor)`) попадают в JSON отдельными записями с одним `id`, потребитель склеивает их `groupBy id`. Во View `id` — ключ токен-конфига, и один `id` может быть у нескольких `<attr>` (например, `textColor` → `sd_textColor` + `android:textColor`; `height` → `android:minHeight` + `android:maxHeight`); потребитель различает записи по `attrName to id`.

## Goals / Non-Goals

**Goals:**
- Сообщать в обоих JSON, что параметр устарел, и передавать `message`.
- Механизм разметки в обоих стеках, без зависимости от Kotlin-`@Deprecated`.
- Не менять результат генерации стилей.

**Non-Goals:**
- Расстановка разметки по существующим компонентам.
- `deprecated` для enum-значений, состояний и компонентов целиком.
- Поля кроме `message` (`replaceWith`, `level`, версия).
- Генерация устаревших свойств (в том числе с `@Deprecated` в сгенерированном коде).

## Decisions

**1. Отдельная разметка вместо Kotlin `@Deprecated` (Compose).**
Вводим `@ApiDeprecated(message: String = "")`, а не читаем `@Deprecated`. Так мета управляется явно и не меняет поведение всех методов с `@Deprecated`, которые сейчас пропускаются; существующая спецификация («deprecated overload не участвует в мете») остаётся верной. Различие закрепляется в документации (KDoc и `COMPOSE_STYLE_GENERATOR.md`, tasks 1.1b): `@Deprecated` — нативная разметка Kotlin для компилятора, `@ApiDeprecated` — разметка API-меты; они независимы, метод может иметь обе. Альтернатива — читать `@Deprecated.message` — отвергнута: она втянула бы в мету всё, что уже депрекейтнуто в коде.

**2. Пустой `message` допустим, факт разметки = deprecated.**
`deprecated` — это nullable-объект, а не флаг со строкой: `deprecated = {"message": ""}` валидно. Во View проверяется наличие атрибута `sdds:api_deprecated`, а не непустота значения; в Compose `message` имеет дефолт `""`.

**3. Compose: распространение статуса по `id` в процессоре.**
После сбора всех параметров компонента процессор для каждого `id`, у которого есть хотя бы одна помеченная перегрузка, проставляет `deprecated` всем записям с этим `id`; `message` — у первой помеченной по порядку объявления. Разные `message` у перегрузок не ошибка. Ключ именно `id` (не `(group, id)`), так как потребитель группирует перегрузки по одному `id`.
Альтернатива — решать на потребителе в `paramOverloads`: отвергнута, так как JSON остался бы «неполным» и каждый внешний читатель должен был бы знать правило склейки.

Правило распространения документируется в KDoc `@ApiDeprecated` (см. tasks 1.1a), так как разработчик, помечающий одну перегрузку, должен знать, что устаревает всё свойство.

**4. View: статус только на конкретной записи, без распространения.**
`deprecated` относится к одному `<attr>`. Один `id` во View — это ключ конфига, которым заполняются несколько разных атрибутов платформы; распространение по `id` сделало бы невозможной миграцию вида «`sd_textColor` устарел в пользу `android:textColor`». Различие с Compose обосновано: перегрузки Compose — одна сущность API, атрибуты View — разные.

**5. Генераторы пропускают deprecated (A1).**
- Compose: фильтр `deprecated == null` в `UniversalComposeVariationGenerator.paramOverloads` перед `groupBy id`. Поскольку статус уже распространён на все перегрузки `id`, свойство уходит целиком.
- View: фильтр в `ViewMetaIndex.forComponent` (и для `subStyles`), чтобы все дальнейшие потребители `params` (`UniversalViewVariationGenerator`) видели только актуальные свойства. Фильтр работает по записи, поэтому `android:textColor` продолжит печататься, если помечен только `sd_textColor`.

**6. Форма модели.**
Общий тип `DeprecatedMeta(message: String)` в каждой из четырёх моделей. В `ComposeParameterMeta` и `PropertyMeta` — `deprecated: DeprecatedMeta? = null`. В `ComposePropertyMeta` поле добавляется в sealed interface (`val deprecated: DeprecatedMeta?`) и во все 12 подтипов с дефолтом `null`. Producer-JSON пишет поле только при наличии (Gson по умолчанию опускает `null`; для kotlinx `Json` в процессоре — `explicitNulls = false`/проверка, что `null` не пишется).

**7. Стратегия проверки: реальная сборка вместо новых тестовых фреймворков.**
Новые зависимости (`kctfork` и т. п.) не добавляем. Проверка Compose-процессора и сквозной генерации — временная разметка на реальных целях с настоящей сборкой:
- `@ApiDeprecated` ставится на одну из перегрузок метода в существующем `*StyleBuilder` из `uikit-compose`, `sdds:api_deprecated` — на `sd_textColor` в `toast_attrs.xml`.
- Запускаются настоящие задачи (KSP в `uikit-compose`, `generateUikitApiMeta` в `uikit`), сгенерированные JSON открываются и сравниваются с версией до правки; затем разметка откатывается, результат фиксируется в описании PR.
- Для View дополнительно остаются обычные unit-тесты `DeclareStyleableParserTest` на существующей инфраструктуре.

Компромисс: у `ApiInfoProcessor` нет автотеста, логика распространения по перегрузкам защищена только ручным прогоном.

## Risks / Trade-offs

- [У `ApiInfoProcessor` нет автотеста] → Ручной сквозной прогон (tasks 6.3) обязателен перед merge; его результат прикладывается в PR.

- [Старые читатели JSON падают на неизвестном поле] → Проверить `ignoreUnknownKeys` во всех десериализациях меты; добавить тест чтения JSON с `deprecated`.
- [Изменение формата JSON у не-deprecated параметров] → Тест, что без разметки вывод не меняется (поле не пишется).
- [Расхождение правил Compose (по `id`) и View (по записи)] → Явно зафиксировано в спеках обоих стеков и в `VIEW_STYLE_GENERATOR.md`.
- [Все записи `id` во View помечены, свойство пропадает из генерации] → Ожидаемо; тест на этот случай, чтобы пустой набор не ронял генератор.
- [Дублирование модели в 4 местах] → Принято: модули не делят код (producer на Gson, consumer на kotlinx); зеркальность закрывается тестами.
