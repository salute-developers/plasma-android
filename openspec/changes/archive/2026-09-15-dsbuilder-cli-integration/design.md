## Context

`sdds-core/plugin_theme_builder` регистрирует по одной таске на capability на модуль: `generateTheme` и
`generateComponents`. Какую платформу (Compose, View, обе) генерирует таска, решает `target`, вычисляемый из
`dsBuilder.targets` (`GenerationCapability.target()`: `{COMPOSE}` → `COMPOSE`, `{VIEW}` → `VIEW_SYSTEM`,
`{COMPOSE, VIEW}` → `ALL`) и передаваемый в `GenerateThemeTask`/`GenerateComponentsTask` как обычное task input.
Сама генерация внутри уже умеет работать выборочно — `ThemeBuilderTarget.isComposeOrAll`/`isViewSystemOrAll`
проверяются по всему коду генераторов, — но выбор доступен только через DSL модуля, не через отдельный
Gradle-вызов.

`components` capability получает конфигурацию только через `ThemeBuilderSource.NameAndVersion` (remote, из
theme-converter) или `.Url`. `ThemeBuilderSource.LocalDirectory` в модели уже существует и используется темой, но
`ThemeBuilderPlugin.getComponentsUrl()` бросает `GradleException` для него — путь для локального источника
компонентов физически не реализован.

Именно эти два места делают плагин неудобным как backend для внешнего CLI (`design-system-builder`), который
запускает таски через `./gradlew` и не имеет доступа к DSL модуля: ему нужно (а) явно попросить одну платформу и
получить либо результат, либо явную ошибку «таска не существует», и (б) сгенерировать компоненты из локального
`.sdds/components`, который CLI уже пишет (см. `cli-components` spec в `design-system-builder`) в том же формате,
что уже ожидает `GenerateComponentsTask.componentsDir` — `meta.json` со списком компонентов и `config` для
каждого относительно этой директории.

## Goals / Non-Goals

**Goals:**

- Дать внешнему вызывающему (Gradle CLI-вызов, без DSL) детерминированный способ запросить генерацию одной
  конкретной платформы для `theme` и `components` и получить явную ошибку, если модуль эту платформу не
  конфигурировал.
- Добавить локальный `.sdds/components` как fallback-источник для `components`, зеркально существующему
  `.sdds`-fallback для `theme`.
- Не менять поведение существующих `generateTheme`/`generateComponents` и `autoGenerate`/`preBuild` wiring для
  модулей, которые их уже используют.

**Non-Goals:**

- Не трогаем `documentationAggregate` — она остаётся одной таской на модуль с текущим приоритетом выбора платформы.
  `design-system-builder` уже проектирует свой `docs generate` так, что отсутствие платформенного выбора здесь не
  блокирует его (умолчание `compose` при неоднозначности решается на стороне CLI).
- Не вводим project-property/`-P` overrides для output-путей и прочих DSL-настроек — они остаются частью
  build.gradle.kts модуля, как и сегодня.
- Не публикуем отдельный `dsbuilder-android` бинарь и не добавляем toolchain installer — инструмент остаётся
  `./gradlew` самого проекта.

## Decisions

### 1. Пер-платформенные таски — независимые сиблинги, а не обёртка вокруг `generateTheme`/`generateComponents`

`registerThemeGenerator`/`registerGenerateComponentsTask` уже параметризуют почти всё нужное через `extension` и
списки файлов; единственное, что сегодня жёстко зашито — это имя таски (`"generateTheme"`/`"generateComponents"`)
и то, что `target` берётся из `extension.target` (может быть `ALL`). Обе функции получают дополнительные параметры
`taskName: String` и `target: ThemeBuilderTarget`, и вызывающий код зовёт их несколько раз с разными парами:

- Один раз — как и сегодня, `taskName = "generateTheme"`, `target = extension.target` (в том числе `ALL`, если
  extension так сконфигурирован). Это **тот же самый вызов, что и до изменения** — ни имя, ни поведение, ни тип
  зарегистрированной таски не меняются.
- Дополнительно — по одному разу на каждую платформу, которую `extension.target` реально включает
  (`isComposeOrAll`/`isViewSystemOrAll`): `taskName = "generateComposeTheme"`, `target = ThemeBuilderTarget.COMPOSE`
  и/или `taskName = "generateViewTheme"`, `target = ThemeBuilderTarget.VIEW_SYSTEM`. Это **новые**, отдельно
  зарегистрированные таски `GenerateThemeTask`/`GenerateComponentsTask` с тем же входом, что у `generateTheme`, но
  с захардкоженным `target` вместо `extension.target`.

Если `extension.target == null` (capability включена, но платформа не выбрана), ни один пер-платформенный
`isComposeOrAll`/`isViewSystemOrAll` не проверяется (обращаться не к чему), поэтому ни `generateComposeTheme`, ни
`generateViewTheme` не регистрируются — только исходный `generateTheme` с уже существующим сегодня поведением
(`target.get()` без значения провалится в момент запуска таски, как и до этого изменения). Если модуль
конфигурирует только `targets { compose() }`, `generateViewTheme` не регистрируется вообще: `./gradlew -p <dir>
help --task generateViewTheme` в таком модуле честно ответит «task not found» вместо того, чтобы либо молча
сгенерировать не ту платформу, либо потребовать доп. валидацию на стороне CLI.

Альтернатива, отклонённая на этапе proposal — превратить `generateTheme`/`generateComponents` в lifecycle-агрегаты,
`dependsOn` на пер-платформенные таски. Отклонена при ближайшем рассмотрении реализации: существующие тесты
(`ThemeBuilderPluginTest`, `DsBuilderPluginTest`) кастуют `project.tasks.getByName("generateTheme") as
GenerateThemeTask` и читают его свойства напрямую (`themeTenants`, `packageName`, `target` и т.д.) — превращение
`generateTheme` в обёрточный `DefaultTask` без этих свойств сломало бы их и было бы наблюдаемым изменением
поведения для любого внешнего кода, который делает то же самое. Независимые сиблинги достигают той же цели
(отдельная таска на платформу) без этого риска и без необходимости городить lifecycle-обвязку.

Вторая отклонённая альтернатива — одна таска с параметром (`-PtargetPlatform=compose`), меняющим `target` на
лету. Project properties плохо сочетаются с up-to-date checks и не отвечают на вопрос «а вообще эта платформа тут
включена» так же ясно, как отсутствие таски.

### 2. `generateTheme`/`generateComponents` не меняются вообще

Пункт вытекает из решения (1): раз пер-платформенные таски — сиблинги, а не обёртка, `generateTheme` и
`generateComponents` остаются регистрацией с прежним именем, прежним типом (`GenerateThemeTask`/
`GenerateComponentsTask`) и прежним `target = extension.target`. `autoGenerate`/`preBuild` продолжают ссылаться
именно на них, как и раньше — новые таски в `preBuild` не подключаются, они существуют только для точечного
внешнего вызова (`./gradlew -p <dir> generateComposeTheme`, в первую очередь platform-delegate'ом в
`design-system-builder`).

### 3. Общий output — общий для пер-платформенных тасок, коллизий не создаёт

`outputDirPath`/`outputResDirPath` определяются `OutputLocation` (`BUILD`/`SRC`) и `multiplatform`, а не
платформой генерации — Compose- и View-таска для одного модуля продолжают писать в тот же `outputLocation`, что и
сейчас при `target = ALL`. Компоновка файлов внутри этой директории уже различается по имени/пакету на уровне
генераторов (Compose и View emit разные файлы), поэтому запуск двух тасок раздельно (а не одной с `ALL`) не
меняет набор сгенерированных файлов, только даёт возможность выполнить это раздельно по времени/платформе.

### 4. Локальный `.sdds/components` — тот же `ThemeBuilderSource.LocalDirectory`, что уже существует для темы

`ComponentsCapability` получает fallback, аналогичный `ThemeSourceResolver`: если `source` не задан явно,
используется `SddsComponentsSourceReader(sddsDirectory)`, который строит `ThemeBuilderSource.LocalDirectory`,
указывающий прямо на `.sdds/components`. `registerFetchAndUnzipComponents` для `LocalDirectory` не регистрирует
`fetchComponents`/`unpackComponentFiles` — как и для темы, `componentsDir` устанавливается напрямую на локальную
директорию, минуя fetch/unzip. Формат `.sdds/components` (`meta.json` + `config` per component) уже совпадает с
тем, что `GenerateComponentsTask.componentsDir` ожидает от распакованного `components.zip` — новых форматов не
вводится, только новый источник для существующего входа.

Симметрично уже принятому решению `theme-builder-dsbuilder-source`: `getComponentsUrl` для `LocalDirectory`
по-прежнему не вызывается (он остаётся для remote-путей), а не бросает исключение — путь `LocalDirectory` просто
не проходит через него.

## Risks / Trade-offs

- **Больше публичных имён тасок.** Проекты, обходящие все таски группы `theme-builder` (`tasks --group`) увидят
  новые записи. Не breaking (никакая существующая таска не переименована и не удалена, `generateTheme`/
  `generateComponents` не меняют тип и поведение), но стоит упомянуть в README/CHANGELOG плагина.
- **Дублирующаяся генерация при ручном запуске обеих тасок подряд.** `generateTheme` (`target = ALL`) и
  `generateComposeTheme` + `generateViewTheme` делают пересекающуюся работу, если кто-то вызовет их в одной
  сборке — Gradle это не запретит. На практике это не происходит: `generateTheme` остаётся в `preBuild`, а
  пер-платформенные таски вызываются отдельно внешним инструментом (CLI), не оба пути сразу.
- **`.sdds/components` может не существовать в старых проектах.** Fallback активируется только при отсутствии
  явного `source`; для существующих модулей с remote source поведение не меняется — риска регрессии нет.

## Migration Plan

Чисто аддитивное изменение, миграция не требуется. Существующие модули с `generateTheme`/`generateComponents` и
remote/URL источниками компонентов продолжают работать без правок build.gradle.kts. Откат — обычный revert PR,
без данных для миграции назад.

## Open Questions

- Нужно ли зеркалить это же пер-платформенное разделение для `documentationAggregate` отдельным изменением, когда
  `design-system-builder` дойдёт до платформенного выбора в `docs generate` для Android? Сейчас сознательно вне
  scope (см. Non-Goals).
