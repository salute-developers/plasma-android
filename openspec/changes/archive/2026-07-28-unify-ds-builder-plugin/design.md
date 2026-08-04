## Context

`sdds-core/plugin_theme_builder` публикует Gradle-плагин генерации темы и компонентов. Извлечение documentation snippets находится в `build-system` в `convention.documentation*`, а генерация кода, связывающего дизайн-систему с sandbox infrastructure, — в `convention.integration-compose` и `convention.integration-view`. Эти conventions читают строковые Gradle properties и напрямую зависят от репозиторного build-system.

Модули дизайн-системы имеют стандартную иерархию: основной Gradle project содержит `.sdds`, а `docs` и `integration` являются дочерними projects. `.sdds/config.json` содержит tenant-вариации темы; `config-info-*` и `theme-info-*` содержат платформенные машинные артефакты. В рамках ADR-0003 Android tool должен подготовить платформенно насыщенный локальный результат, а DS Builder CLI — объединить его с Core и пользовательской документацией и опубликовать итоговый пакет.

Обратная совместимость Gradle API не требуется: единственные пользователи плагина — команда, которая одновременно мигрирует repository modules.

## Goals / Non-Goals

**Goals:**

- заменить узкий `themeBuilder` единым `dsBuilder` DSL;
- держать theme, components, documentation и sandbox как независимые capabilities одного плагина;
- сделать `.sdds` общим источником conventions;
- перенести documentation и sandbox Gradle implementation из `build-system` в подпакеты `plugin_theme_builder`;
- убрать строковые integration properties и автоматически выводить стандартные пути, package и theme alias;
- мигрировать Compose и View модули `tokens` без требования переименовать их физические директории;
- обеспечить Gradle-declared inputs/outputs и focused tests для новой инфраструктуры.

**Non-Goals:**

- массово реорганизовывать существующие theme/component packages;
- сохранять `themeBuilder` или старый plugin API;
- переименовывать `plugin_theme_builder` Gradle project и все `integration` directories;
- включать Docusaurus, npm, changelog, S3 и публикацию в documentation aggregation;
- реализовывать DS Builder CLI merge/publish из ADR-0003;
- предоставлять documentation, sandbox или preview выбор tenant-вариации.

## Decisions

### 1. Новый plugin API называется DS Builder

Plugin id становится `io.github.salute-developers.design-system-builder`, implementation class — `DsBuilderPlugin`, а extension — `dsBuilder`. Старые plugin id и extension не регистрируются. Новый DSL группирует настройки по capabilities:

```kotlin
dsBuilder {
    theme { /* existing generation options */ }
    components { /* component source/options */ }
    documentation { compose() }
    sandbox { compose { /* overrides */ } }
}
```

Внутри `DsBuilderExtension` использует отдельные extension/model classes, а не превращается в один класс со всеми mutable полями. Существующие генераторы темы и компонентов на первом этапе адаптируются к новой модели с минимальным физическим переносом.

Альтернатива — добавить documentation и sandbox внутрь `themeBuilder`. Она отклонена, потому что эти возможности не являются частями темы и могут применяться в отдельных Gradle projects.

### 2. Один plugin artifact применяется отдельно в каждом project

Основной, docs и integration/sandbox projects применяют один DS Builder plugin, но каждый включает только нужную capability. Плагин не ищет соседние projects по именам и не конфигурирует их из основного модуля.

Это сохраняет Gradle project isolation и не связывает public API с layout `docs`/`integration`. Базовые `convention.android-lib`, `convention.compose` и testing conventions остаются ответственностью модулей; DS Builder plugin не применяет внутренние repo conventions.

### 3. `.sdds` разрешается общим resolver

`DsBuilderExtension` предоставляет `DirectoryProperty sddsDirectory`. Convention вычисляется лениво:

1. явно заданная директория;
2. `.sdds` текущего project;
3. `.sdds` parent project.

Все capabilities используют общий resolver. Стандартные platform files:

| Platform | Components info | Theme info |
|---|---|---|
| Compose | `config-info-compose.json` | `theme-info-compose.json` |
| View | `config-info-view-system.json` | `theme-info-view-system.json` |

Файлы View, которые сейчас находятся рядом с `.sdds`, мигрируют внутрь неё. Свойства называются `componentsInfoFile` и `themeInfoFile`, поскольку это машинные info-артефакты, а не Gradle configuration files.

Альтернатива — требовать путь в каждом child project. Она отклонена как дублирование стандартной структуры.

### 4. Theme alias описывает одну тему

Tenants рассматриваются как вариации одной темы. Documentation, sandbox и будущий preview не получают tenant selector. Общий `themeAlias` выводится из alias первого базового tenant, с fallback на его name, как уже делает `SddsThemeSourceReader.baseAlias`.

Sandbox допускает явный `themeAlias` override. Несколько tenant entries продолжают передаваться theme generator как default и дополнительные вариации, но наружу предоставляется одно имя темы.

### 5. Sandbox заменяет integration в public API

Новая capability и её классы используют термин `sandbox`, потому что результат связывает тему и компоненты с sandbox/demo infrastructure. Физические token-модули могут временно оставаться `integration`.

Текущие `GenerateComponentsDictionary`, generator models и resource templates переносятся в `com.sdds.plugin.themebuilder.sandbox` и переименовываются по назначению. Typed properties заменяют:

- `integration.compose.config-path`;
- `integration.compose.package-name`;
- `integration.compose.scheme`;
- `integration.compose.multiplatform`;
- `integration.view.config-path`;
- `integration.view.package-name`;
- `integration.view.scheme`;
- `theme-alias`.

`generatedPackageName` по умолчанию берётся из Android namespace. Для non-Android/KMP fallback строится из `componentsInfo.packageName` по соглашению `.sandbox`. Generated sources пишутся в `build/generated/sdds/sandbox` и подключаются к Android/Kotlin source sets; запись в `src` прекращается.

### 6. Documentation capability создаёт platform aggregation, а не портал

В подпакет `documentation` переносятся snippet extraction, Kotlin compiler worker, XML extraction, metadata и unpack core snippets. Capability создаёт собственную resolvable configuration для core documentation artifacts и lifecycle task локальной агрегации.

Результат содержит платформенные snippets, metadata, `components-info` и `theme-info` в стабильных относительных путях. Точная финальная структура пакета сервиса остаётся ответственностью DS Builder CLI. Docusaurus может временно потреблять новый aggregation output через существующий convention, но его build/deploy задачи не переносятся.

### 7. Регистрация остаётся lazy и проверяемой

Новые DSL properties реализуются через `Property`, `RegularFileProperty`, `DirectoryProperty` и Providers. Ошибки отсутствующих файлов возникают с точными resolved paths. Task inputs/outputs аннотируются для up-to-date checks и configuration cache.

Public Gradle types и DSL получают актуальный KDoc. Для task registration и conventions добавляются Gradle TestKit tests; чистые readers/generators сохраняют unit tests.

### 8. Android documentation output следует ADR-0003

Lifecycle-задача называется `documentationAggregate` и записывает платформенно насыщенный результат в
`.sdds/temp/docs`. Android snippets размещаются в `assets/examples/kotlin` и `assets/examples/xml`, metadata примеров —
в `meta/samples.json`, а platform info — в `meta/components-info.json` и `meta/theme-info.json`.
Legacy Core `META-INF/sdds-docs/meta.json` объединяется с локальной metadata; локальная запись имеет
приоритет при совпадении sample id. `snippetPath` нормализуется относительно `.sdds/temp/docs`.

DS Builder Gradle Plugin не формирует `manifest.json` и `docs.json`: согласно ADR-0003 это ответственность
`dsbuilder docs generate`, который объединяет платформенный результат с Core и пользовательской документацией.

### 9. Общие параметры генерации находятся на уровне dsBuilder

`target`, `packageName`, `resourcePrefix`, `outputLocation` и `dimensions` задаются на уровне
`dsBuilder` и используются как conventions одновременно для theme и components capabilities.
Capability-level properties сохраняются как явные overrides для редких случаев, когда результаты
темы и компонентов должны различаться. Sandbox scheme по умолчанию — V2.

## Risks / Trade-offs

- **[Risk] Одновременный breaking DSL затрагивает много token-модулей** → мигрировать сначала по одному Compose и View пилоту, затем выполнить механическую миграцию остальных модулей и удалить conventions только после успешной проверки.
- **[Risk] Автопоиск parent `.sdds` скрывает ошибочный layout** → ограничить поиск текущим и непосредственным parent project, логировать resolved directory и поддержать явный override.
- **[Risk] Android namespace может отличаться от исторического generated package** → проверить каждый существующий integration module; использовать явный override только для необходимых исключений.
- **[Risk] Перенос Kotlin compiler extraction увеличит зависимости plugin artifact** → сохранить compiler в отдельной resolvable classpath configuration и worker classloader isolation, не загружать compiler в Gradle daemon classpath без необходимости.
- **[Risk] Перемещение View info files ломает текущие пути** → выполнять перенос и migration DSL атомарно, покрыть Compose/View resolver tests.
- **[Trade-off] Физические имена `plugin_theme_builder` и `integration` временно расходятся с public terminology** → принять как ограничение первого этапа и не смешивать архитектурную миграцию с массовым переименованием directories/coordinates.

## Migration Plan

1. Добавить `DsBuilderPlugin`, composed extension models и общий `.sdds` resolver в `sdds-core/plugin_theme_builder`.
2. Перевести существующую theme/components регистрацию на `dsBuilder`, сохранив реализации генераторов.
3. Перенести documentation task types и добавить aggregation lifecycle/API.
4. Мигрировать один Compose и один View docs project; подключить существующий Docusaurus pipeline к новому output при необходимости.
5. Перенести sandbox generator, models и templates; добавить generated source wiring.
6. Мигрировать один Compose и один View integration project и сравнить generated output.
7. Мигрировать оставшиеся `tokens` projects, удалить obsolete properties и специализированные conventions.
8. Обновить README/KDoc и выполнить focused, token-wide и repository validation.

Rollback выполняется возвратом change целиком до публикации новой версии плагина; параллельный legacy API намеренно не поддерживается.

## Open Questions

- Должна ли documentation capability сама применять KSP plugin или только конфигурировать его при наличии в project?
- Нужен ли отдельный published artifact/configuration для передачи aggregation output в CLI, либо на первом этапе достаточно документированной output directory?
