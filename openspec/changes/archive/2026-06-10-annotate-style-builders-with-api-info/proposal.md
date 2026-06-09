## Why

В модуле `sdds-core/uikit-compose` определено ~72 интерфейса `*StyleBuilder`, но только `TextFieldStyleBuilder` помечен аннотацией `@ApiInfo` из пакета `com.sdds.api.info.compose`. Без этой аннотации `api-info-ksp` не генерирует `ComponentMeta` для билдера, и `UniversalComposeVariationGenerator` (реализованный в рамках изменения `universal-compose-variation-generator`) не может использоваться для соответствующих компонентов.

## What Changes

- **Изменено**: все `*StyleBuilder`-интерфейсы в `sdds-core/uikit-compose` помечаются аннотацией `@ApiInfo` из пакета `com.sdds.api.info.compose`.
- **Изменено**: для билдеров, чьё имя автоматически выводит правильное имя компонента (напр. `BadgeStyleBuilder` → `Badge`), добавляется `@ApiInfo` без параметров.
- **Изменено**: для билдеров, обслуживающих несколько компонентов или имеющих нестандартное соответствие, используется `@ApiInfo(components = [...])` с явным перечислением имён компонентов.
- **Изменено**: все `enum class`, реализующие `ValueState` и используемые генераторами через `getCustomState`, помечаются аннотацией `@StateSetInfo(components = "...")`.
- **Изменено**: каждый enum entry, чьё PascalCase-имя отличается от ключа в JSON-конфиге, помечается аннотацией `@StateInfo(configName = "...")`.
- **Изменено**: `@Target` аннотации `@StateInfo` в `ApiInfo.kt` расширен с `[PROPERTY]` до `[CLASS, PROPERTY]` для поддержки аннотирования enum entries (которые являются `KSClassDeclaration` в KSP).

Единственный уже аннотированный случай: `TextFieldStyleBuilder` с `@ApiInfo(components = ["TextField", "TextArea"])` — остаётся без изменений.

`MotionStyleBuilder`-интерфейсы (пакет `motion/`) не аннотируются — они не являются целью `api-info-ksp` и не используются в генераторе вариаций.

`AvatarStatus` не аннотируется — генератор Avatar не использует механизм `getCustomState` для вариаций; `AvatarStatus` применяется как параметр цвета, а не как state вариации.

## Capabilities

### New Capabilities

- `style-builder-api-info`: Аннотирование всех `*StyleBuilder`-интерфейсов в `uikit-compose` аннотацией `@ApiInfo` с корректным указанием имён компонентов.

### Modified Capabilities

_(нет изменений на уровне требований существующих спецификаций)_

## Impact

- Модуль: `sdds-core/uikit-compose`
- Затронуты все файлы `*Style.kt` и `*StyleBuilder.kt`, содержащие интерфейс `StyleBuilder<T>` без аннотации `@ApiInfo` (~71 файл)
- Публичный API компонентов, токены и Gradle-конвенции не меняются
- После этого изменения `api-info-ksp` начнёт генерировать `ComponentMeta` для всех аннотированных билдеров, что является необходимым условием для перехода на `UniversalComposeVariationGenerator`
