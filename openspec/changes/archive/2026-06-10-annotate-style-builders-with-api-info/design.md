## Context

В `sdds-core/uikit-compose` определено ~72 интерфейса вида `interface *StyleBuilder : StyleBuilder<*Style>`. Аннотация `@ApiInfo` из `com.sdds.api.info.compose` указывает KSP-процессору (`api-info-ksp`) на то, что этот интерфейс является описанием билдера стиля компонента. Процессор генерирует `ComponentMeta`, которая используется `UniversalComposeVariationGenerator` в `plugin_theme_builder`.

На текущий момент из всех билдеров аннотирован только `TextFieldStyleBuilder`. Остальные ~71 интерфейс не видимы для KSP-процессора, что блокирует использование универсального генератора для соответствующих компонентов.

## Goals / Non-Goals

**Goals:**
- Добавить `@ApiInfo` ко всем `*StyleBuilder`-интерфейсам в `sdds-core/uikit-compose`, расширяющим `StyleBuilder<T>`
- Корректно указать `components` для билдеров, имя которых не совпадает напрямую с именем компонента или которые обслуживают несколько компонентов

**Non-Goals:**
- Аннотирование `MotionStyleBuilder`-интерфейсов (другой KSP-пайплайн, не задействован в `UniversalComposeVariationGenerator`)
- Изменение логики самих билдеров, стилей или генераторов
- Переход компонентов на `UniversalComposeVariationGenerator` (это отдельное изменение)

## Decisions

### Решение 1: `@ApiInfo` без параметров vs. с явным `components`

**Правило**: если имя интерфейса, минус суффикс `StyleBuilder`, совпадает с именем компонента в конфиге плагина — добавляется `@ApiInfo` без параметров. Если нет — используется `@ApiInfo(components = [...])`.

**Случаи с явным `components`** (на основе анализа `*ConfigDelegate.kt`):
- `TextFieldStyleBuilder` — уже `@ApiInfo(components = ["TextField", "TextArea"])`, не трогаем
- Все остальные билдеры: имя выводится автоматически (напр. `BadgeStyleBuilder` → `Badge`), явный `components` не нужен

**Вывод**: для всех ~71 оставшихся билдеров достаточно `@ApiInfo` без параметров.

**Альтернатива**: задать `components` явно для всех. Отвергнута — избыточно и создаёт дополнительную нагрузку при переименовании компонентов.

### Решение 2: Расположение аннотации

Аннотация ставится непосредственно перед объявлением интерфейса, аналогично образцу в `TextFieldStyleBuilder.kt`. Импорт `com.sdds.api.info.compose.ApiInfo` добавляется в каждый файл.

## Risks / Trade-offs

- **[Риск] Компиляция `api-info-ksp` начнёт генерировать `ComponentMeta` для всех аннотированных билдеров** → Если в проекте есть код, завязанный на отсутствие отдельных `ComponentMeta`, он может сломаться. Митигация: анализ задействован только при явном использовании `UniversalComposeVariationGenerator`; старые генераторы продолжают работать независимо.
- **[Риск] Большое количество файлов (~71)** → Высокий риск пропустить файл или допустить опечатку. Митигация: после правок — проверить компиляцию (`./gradlew :sdds-core:uikit-compose:compileDebugKotlin`) и убедиться, что ни один `StyleBuilder<T>` не остался без аннотации.

## Migration Plan

1. Добавить импорт `com.sdds.api.info.compose.ApiInfo` и аннотацию `@ApiInfo` ко всем `*StyleBuilder`-интерфейсам в `sdds-core/uikit-compose`.
2. Проверить компиляцию: `./gradlew :sdds-core:uikit-compose:compileDebugKotlin`.
3. Проверить тесты и статический анализ: `./gradlew :sdds-core:uikit-compose:test :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessApply`.

Откат: удаление аннотаций не меняет поведение существующих компонентов — безопасен в любой момент.

## Open Questions

_(нет)_
