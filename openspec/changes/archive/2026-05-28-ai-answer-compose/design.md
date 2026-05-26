## Context

`sdds-core/uikit-compose` содержит базовые Compose-компоненты `ButtonGroup`, `ChipGroup`, `Note`, `Spinner`, `Style`, `StatefulValue` и Motion API, но не содержит AI-specific контейнер для ответа LLM. Figma-компонент `Answer / M` объединяет несколько визуальных состояний: обычный ответ с title/content/actions/suggestions, loading state со spinner и текстом, error/negative state через note-like блок.

Новый компонент должен быть добавлен узко в `sdds-core`: runtime API в `sdds-core/uikit-compose`, генерация стилей в `sdds-core/plugin_theme_builder`. Android View версия, Gradle conventions и общая архитектура Motion/Style не меняются.

Ближайшие референсы в кодовой базе:

- `NavigationDrawerItemStyle.kt` для stateful style + builder overloads.
- `NavigationDrawerItemMotionStyle.kt` для motion style builder pattern.
- `ButtonGroup.kt` для `ButtonGroupScope` и nested button styling.
- `ChipGroup.kt` для `FlowRowScope` и wrapping layout.
- `Note.kt` для default error rendering.
- `Spinner.kt` для default loading indicator.

## Goals / Non-Goals

**Goals:**

- Добавить публичный Compose-компонент `Answer` в `com.sdds.compose.uikit.ai`.
- Добавить `AnswerState : ValueState` со значениями `Default`, `Error`, `Loading`.
- Сделать `title` и `content` обычными composable slots, не ограниченными `AnswerScope`.
- Сделать `actionsStart`/`actionsEnd` scoped slots с receiver `ButtonGroupScope` и рендерить их в двух независимых `ButtonGroup`.
- Сделать `suggestions` scoped slot с receiver `FlowRowScope` и рендерить его внутри `ChipGroup`.
- Добавить `AnswerErrorScope` и `AnswerLoadingScope` для custom `error` и `loading` slots.
- Дать scopes доступ к текущему `AnswerState`, `AnswerStyle` и `Motion<AnswerMotionStyle>`.
- Реализовать default `Error` через `Note`, обернутый в `AnswerErrorScope.AnswerError(...)`.
- Реализовать default `Loading` через `Spinner`, обернутый в `AnswerLoadingScope.AnswerLoading(...)`.
- Добавить `AnswerStyle` с non-null `StatefulValue<T>` visual-свойствами и brush-based colors.
- Добавить nested styles для `Note`, loading `Spinner`, двух action `ButtonGroup` и suggestions `ChipGroup`.
- Добавить `AnswerMotionStyle` в `com.sdds.compose.uikit.ai.motion`.
- Добавить Theme Builder генерацию Compose `AnswerStyle`.
- Добавить KDoc, fixtures/samples/docs для новых public API.

**Non-Goals:**

- Не реализовывать markdown/rich text parser.
- Не вводить data model для LLM response, actions или suggestions.
- Не добавлять `loading: Boolean`, `AnswerView` или отдельный visual-state enum.
- Не делать Android View версию.
- Не выносить motion API в `com.sdds.compose.uikit.motion.components.answer`.
- Не менять публичный контракт существующих `ButtonGroup`, `ChipGroup`, `Note` или `Spinner`.
- Не переносить decorative content corner markers из Figma в API первой версии.

## Decisions

### Отдельный AI package для публичного API

Публичные runtime API компонента должны жить в `com.sdds.compose.uikit.ai`, а motion API в `com.sdds.compose.uikit.ai.motion`.

Это отделяет AI-компоненты от общего `com.sdds.compose.uikit`, но оставляет возможность переиспользовать базовые SDDS компоненты (`ButtonGroup`, `ChipGroup`, `Note`, `Spinner`) без новых зависимостей.

Альтернатива: добавить `Answer` прямо в `com.sdds.compose.uikit`. Она отклонена, потому что пользователь явно задал отдельную AI-зону, и будущие AI-компоненты смогут развиваться в одном namespace.

### AnswerState вместо loading/view параметров

`AnswerState : ValueState` должен содержать `Default`, `Error`, `Loading`. Это состояние используется одновременно для выбора layout branch, `StatefulValue` resolution и MotionContext.

```kotlin
enum class AnswerState : ValueState {
    Default,
    Error,
    Loading,
}
```

Альтернатива: `loading: Boolean` + `view: Default/Negative`. Она отклонена, потому что дает пересекающиеся состояния и хуже ложится на `ValueState`.

### Slot-based body без LLM data model

`title` и `content` должны быть обычными composable slots:

```kotlin
title: (@Composable () -> Unit)? = null
content: (@Composable () -> Unit)? = null
```

`Answer` не должен знать про markdown, rich text, streaming chunks, citations или action/suggestion models. Потребитель передает нужный renderer внутрь `content`.

Альтернатива: сделать `content: @Composable AnswerScope.() -> Unit`. Она отклонена для `title/content`, потому что пользователь уточнил, что они должны быть обычными composable slots. `AnswerScope` остается полезным для specialized default/custom state rendering.

### Structured slots для actions и suggestions

`actionsStart` и `actionsEnd` должны иметь receiver `ButtonGroupScope` и рендериться в отдельных `ButtonGroup`:

```kotlin
actionsStart: (ButtonGroupScope.() -> Unit)? = null
actionsEnd: (ButtonGroupScope.() -> Unit)? = null
```

`ButtonGroup` content в текущем API не является `@Composable`, поэтому слот должен соответствовать существующему контракту `ButtonGroupScope.() -> Unit`.

`suggestions` должен иметь receiver `FlowRowScope` и рендериться внутри `ChipGroup`:

```kotlin
suggestions: (@Composable FlowRowScope.() -> Unit)? = null
```

В текущем коде `FlowRowScope` находится в `com.sdds.compose.uikit.internal.common`, но уже используется в публичной сигнатуре `ChipGroup`. Для `Answer` нужно либо переиспользовать этот тип, либо отдельно оценить необходимость публичного alias/wrapper, чтобы не расширять зависимость потребителя от internal package.

### Default Error через AnswerErrorScope.AnswerError

`error` slot должен быть scoped:

```kotlin
error: (@Composable AnswerErrorScope.() -> Unit)? = null
```

`AnswerErrorScope` должен предоставлять текущий `state`, `style`, `motion` и подготовленный composable `AnswerError(...)`, который рендерит `Note` со style из `AnswerStyle`.

Default `Error` branch вызывает `AnswerErrorScope.AnswerError(...)`. Если пользователь передал custom `error`, он сам решает, вызывать ли `AnswerError(...)` внутри scope или полностью заменить rendering.

`Note` принимает `title: String` и `text: String`, поэтому default helper должен иметь строковые параметры для стандартного Note-сценария. Если нужен полностью произвольный error UI, используется custom `error` slot.

Альтернатива: напрямую рендерить `Note` внутри `Answer` без scope helper. Она отклонена, потому что пользователь запросил scope и подготовленный `AnswerErrorScope.AnswerError()`.

### Default Loading через AnswerLoadingScope.AnswerLoading

`loading` slot должен быть scoped:

```kotlin
loading: (@Composable AnswerLoadingScope.() -> Unit)? = null
```

`AnswerLoadingScope` должен предоставлять текущий `state`, `style`, `motion` и подготовленный composable `AnswerLoading(...)`, который рендерит default loading layout со `Spinner` и текстовой областью. `Spinner` должен использовать `AnswerStyle.loadingSpinnerStyle`.

Default `Loading` branch вызывает `AnswerLoadingScope.AnswerLoading(...)`. Если пользователь передал custom `loading`, он может вызвать helper или полностью заменить rendering.

### AnswerStyle как источник всей визуальной вариативности

`AnswerStyle` должен быть самостоятельным `Style`, а не наследником `NoteStyle` или другого existing style. Все visual-свойства должны быть non-null `StatefulValue<T>`, color-like свойства - `StatefulValue<Brush>`.

Минимальная структура:

```kotlin
interface AnswerStyle : Style {
    val colors: AnswerColors
    val dimensions: AnswerDimensions
    val titleStyle: StatefulValue<TextStyle>
    val loadingTextStyle: StatefulValue<TextStyle>
    val noteStyle: NoteStyle
    val loadingSpinnerStyle: SpinnerStyle
    val actionsStartButtonGroupStyle: ButtonGroupStyle
    val actionsEndButtonGroupStyle: ButtonGroupStyle
    val suggestionsChipGroupStyle: ChipGroupStyle
}
```

Имена nested styles должны быть явными, но не чрезмерно длинными. Предпочтительные имена:

- `actionsStartButtonGroupStyle`
- `actionsEndButtonGroupStyle`
- `suggestionsChipGroupStyle`
- `loadingSpinnerStyle`
- `noteStyle`

Builder должен следовать паттерну `NavigationDrawerItemStyle`: принимать stateful values и иметь overloads для `Brush`, `Color`, `InteractiveColor`, `TextStyle`, `Dp`, а также setter-ы nested styles.

### AnswerMotionStyle в AI motion package

`AnswerMotionStyle`, builder, `LocalAnswerMotionStyle` и `rememberAnswerMotion(...)` должны жить в `com.sdds.compose.uikit.ai.motion`.

Первая версия motion API поддерживает только:

- dimensions;
- `Brush`;
- `TextStyle`.

Другие типы, включая nested styles и shapes, не получают motion properties в первой версии. Если значение не поддерживается motion evaluator, оно выбирается statefully без интерполяции.

### Internal implementation

Публичный `Answer` должен быть тонким facade над internal layout/default rendering helpers. Internal package можно организовать как `com.sdds.compose.uikit.internal.ai` или `com.sdds.compose.uikit.internal.answer`; предпочтительно `internal.ai`, если ожидаются будущие AI-компоненты.

Internal implementation отвечает за:

- создание state set с `AnswerState`;
- создание MotionContext с `AnswerState`;
- resolution style values;
- layout `Default` branch;
- рендеринг action `ButtonGroup`;
- рендеринг suggestions `ChipGroup`;
- default `AnswerError`/`AnswerLoading` helpers.

### Theme Builder generation

Theme Builder должен получить поддержку Compose `AnswerStyle`. Generated code должен строиться через runtime builder contracts и не полагаться на nullable fallbacks.

Ожидаемая генерация:

- colors как `StatefulValue<Brush>`;
- dimensions/typography как stateful values;
- state values для `AnswerState.Default`, `AnswerState.Error`, `AnswerState.Loading`;
- nested styles для `Note`, `Spinner`, `ButtonGroup`, `ChipGroup`, либо ссылки на generated/default styles, если token config не задает отдельные значения.

Генерация Android View `Answer` не входит в этот change.

## Risks / Trade-offs

- [Risk] `FlowRowScope` находится в internal package, но нужен в публичной сигнатуре `Answer`. → Mitigation: на implementation этапе проверить текущую бинарную/API политику `ChipGroup`; при необходимости добавить публичный alias/wrapper в AI API или общий public package.
- [Risk] `Note` принимает строковые title/text, а custom error может требовать произвольный composable content. → Mitigation: default `AnswerErrorScope.AnswerError(...)` оставить Note-based со строковыми параметрами, а произвольный UI поддерживать через custom `error` slot.
- [Risk] `ButtonGroup` content не `@Composable`, а накапливает элементы в scope. → Mitigation: сигнатуры `actionsStart`/`actionsEnd` должны повторять existing `ButtonGroupScope.() -> Unit`, а не `@Composable ButtonGroupScope.() -> Unit`.
- [Risk] Theme Builder поддержка расширяет scope за пределы runtime компонента. → Mitigation: ограничить изменения генераторами/config для `Answer`, не менять общую архитектуру Theme Builder.
- [Risk] Новый AI package может потребовать обновления docs/import examples. → Mitigation: добавить KDoc, fixtures и docs samples с imports из `com.sdds.compose.uikit.ai`.

## Migration Plan

Миграция существующего пользовательского кода не требуется: это новая capability и новые API. Existing `ButtonGroup`, `ChipGroup`, `Note`, `Spinner` остаются source-compatible.

Rollout:

1. Добавить runtime API и internal layout в `sdds-core/uikit-compose`.
2. Добавить style/motion API и defaults.
3. Добавить Theme Builder генерацию.
4. Добавить fixtures/docs/sandbox registration.
5. Запустить focused validation из корня репозитория:
   - `./gradlew :sdds-core:uikit-compose:detekt`
   - релевантные задачи `sdds-core/plugin_theme_builder`
   - при необходимости `./gradlew detektAll`

Rollback: удалить новые `Answer` API, fixtures/docs/generator support и generated outputs, не затрагивая существующие компоненты.

## Open Questions

- Нужно ли добавлять публичный alias для `FlowRowScope`, чтобы `Answer` не заставлял потребителя импортировать тип из `internal.common`?
- Какая точная сигнатура у `AnswerErrorScope.AnswerError(...)` и `AnswerLoadingScope.AnswerLoading(...)`: только `title/text`, или еще slots для leading/action content?
- Нужно ли default `Loading` иметь строковый параметр по умолчанию или полностью style/sample-driven текст?
