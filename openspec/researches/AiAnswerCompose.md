# AI Answer Compose

Первая версия ТЗ для будущего change `ai-answer-compose`.

## Контекст

Нужно добавить Compose-компонент `Answer` для отображения ответа от LLM в UI. Компонент должен быть частью `sdds-core/uikit-compose`.

Границы пакетов:

- публичное API: `com.sdds.compose.uikit.ai`;
- motion API: `com.sdds.compose.uikit.ai.motion`;
- внутренняя реализация: `com.sdds.compose.uikit.internal`.

Вариативность компонента должна задаваться на уровне стиля: цвета, размеры, отступы, типографика, motion-поведение и стили вложенных компонентов. Runtime API не должен разрастаться visual-параметрами под каждую вариацию.

## Состояния

Состояние компонента задается через `AnswerState : ValueState`.

Список состояний:

- `Default` - обычное отображение ответа;
- `Error` - отображение ошибки или негативного ответа;
- `Loading` - отображение процесса генерации ответа.

Отдельные параметры `loading: Boolean` и `view: AnswerView` не нужны. Состояние должно участвовать в resolution `StatefulValue` и motion.

## Общая модель компонента

`Answer` остается slot-based компонентом. Он не должен владеть моделью LLM-ответа, не должен парсить markdown/rich text и не должен задавать data model для actions или suggestions.

При этом часть слотов должна быть структурированной:

- `actionsStart` и `actionsEnd` передаются как `ButtonGroupScope` slots;
- каждый из этих слотов `Answer` оборачивает в отдельный `ButtonGroup`;
- `suggestions` передается как `FlowRowScope` slot;
- `suggestions` `Answer` оборачивает в `ChipGroup`.

Default layout:

```text
Answer(state = Default)
┌──────────────────────────────────────────────┐
│ title?                                       │
│                                              │
│ content?                                     │
│                                              │
│ ┌ actionsStart ButtonGroup ┐     ┌ actionsEnd ButtonGroup ┐
│ │ ButtonGroupScope          │     │ ButtonGroupScope        │
│ └───────────────────────────┘     └─────────────────────────┘
│                                              │
│ suggestions? -> ChipGroup / FlowRowScope     │
└──────────────────────────────────────────────┘
```

Loading layout:

```text
Answer(state = Loading)
┌──────────────────────────────────────────────┐
│ custom loading slot OR default loading layout│
└──────────────────────────────────────────────┘
```

Default loading Layout:

```text
Answer(state = Loading)
┌──────────────────────────────────────────────┐
│ Spinner + Text                               │
└──────────────────────────────────────────────┘
```

Error layout:

```text
Answer(state = Error)
┌──────────────────────────────────────────────┐
│ custom error slot OR default Note            │
└──────────────────────────────────────────────┘
```

## Предварительный API

Финальная сигнатура может измениться на этапе proposal/design, но текущая целевая форма такая:

```kotlin
enum class AnswerState : ValueState {
    Default,
    Error,
    Loading,
}

@Stable
interface AnswerScope {
    val state: AnswerState
}

@Composable
fun Answer(
    modifier: Modifier = Modifier,
    state: AnswerState = AnswerState.Default,
    title: (@Composable AnswerScope.() -> Unit)? = null,
    content: (@Composable AnswerScope.() -> Unit)? = null,
    actionsStart: (@Composable ButtonGroupScope.() -> Unit)? = null,
    actionsEnd: (@Composable ButtonGroupScope.() -> Unit)? = null,
    suggestions: (@Composable FlowRowScope.() -> Unit)? = null,
    loading: (@Composable AnswerScope.() -> Unit)? = null,
    error: (@Composable AnswerScope.() -> Unit)? = null,
    style: AnswerStyle = LocalAnswerStyle.current,
    motion: Motion<AnswerMotionStyle> = rememberAnswerMotion(),
)
```

`content` лучше оставить nullable, потому что компонент может быть создан сразу в `Loading` или `Error` состоянии. В `Default` state отсутствие `content` должно быть валидным: компонент должен отрендерить только переданные области либо пустую content area согласно layout/style rules.

## Требования к публичному API

- `Answer`, `AnswerState`, `AnswerScope`, `AnswerStyle`, `AnswerStyleBuilder`, `AnswerColors`, `AnswerDimensions` и `LocalAnswerStyle` должны быть доступны из `com.sdds.compose.uikit.ai`.
- Публичный API не должен раскрывать internal layout/adapters/default renderers.
- `AnswerState` должен наследоваться от `ValueState`.
- `AnswerState` должен использоваться как семантическое состояние компонента и как state для `StatefulValue`/motion resolution.
- `title` и `content` должны быть composable slots. Сейчас предпочтительно ограничить их `AnswerScope`, чтобы API был единообразным с `error` и `loading`.
- `content` должен быть обычным composable slot. Markdown/rich text renderer, если нужен потребителю, передается внутрь `content`.
- `actionsStart` и `actionsEnd` должны иметь receiver `ButtonGroupScope`.
- `Answer` должен рендерить `actionsStart` и `actionsEnd` в двух независимых `ButtonGroup`.
- `suggestions` должен иметь receiver `FlowRowScope`.
- `Answer` должен рендерить `suggestions` внутри `ChipGroup`.
- Для `Error` и `Loading` должны быть опциональные custom slots.
- Custom `error` и `loading` slots должны быть ограничены `AnswerScope`.
- В `Default` state `error` и `loading` slots не рендерятся.

## Требования к Default state

- В `Default` state компонент отображает стандартную структуру ответа: `title`, `content`, footer actions и suggestions.
- Все области должны быть опциональными.
- Если `actionsStart` не передан, соответствующий `ButtonGroup` не должен занимать место, если стиль явно не требует другого поведения.
- Если `actionsEnd` не передан, соответствующий `ButtonGroup` не должен занимать место, если стиль явно не требует другого поведения.
- Если `suggestions` не передан, `ChipGroup` не должен рендериться.
- Расстояния между title/content/actions/suggestions должны задаваться через `AnswerStyle.dimensions`.

## Требования к Loading state

- В `Loading` state компонент отображает custom `loading` slot, если он передан.
- Если custom `loading` slot не передан, компонент отображает default loading layout.
- Default loading layout должен соответствовать Figma: spinner/loading indicator и текстовая область.
- default loading layout должен использовать существующий `Spinner` напрямую.
- Стиль `Spinner` должен задаваться через `AnswerStyle`.
- В `Loading` state стандартные `title`, `content`, `actionsStart`, `actionsEnd` и `suggestions` не отображаются.

## Требования к Error state

- В `Error` state компонент отображает custom `error` slot, если он передан.
- Если custom `error` slot не передан, компонент отображает default error layout через существующий `Note`.
- Стиль `Note` должен задаваться через `AnswerStyle.noteStyle`.
- Default error layout должен соответствовать Figma negative/error state.
- В `Error` state стандартные `title`, `content`, `actionsStart`, `actionsEnd` и `suggestions` не отображаются, если пользователь не переопределил это через custom `error`.

## Требования к AnswerStyle

`AnswerStyle` должен быть публичным style API в пакете `com.sdds.compose.uikit.ai`.

Общие требования:

- стиль создается по аналогии с `NavigationDrawerItemStyle`;
- все visual-свойства должны быть non-null `StatefulValue<T>`;
- все color-like свойства должны иметь тип `StatefulValue<Brush>`;
- typography свойства должны иметь тип `StatefulValue<TextStyle>`;
- dimensions должны быть stateful;
- стиль должен содержать nested styles для внутренних компонентов, которые `Answer` создает сам.

Nested styles:

- `noteStyle: NoteStyle` для default `Error` state;
- стиль для `actionsStart` `ButtonGroup`;
- стиль для `actionsEnd` `ButtonGroup`;
- стиль для `suggestions` `ChipGroup`;
- стиль для default loading indicator `Spinner`.

Builder должен иметь удобные overloads:

- для brush/color-like свойств: `StatefulValue<Brush>`, `Brush`, `Color`, `InteractiveColor`;
- для typography: `StatefulValue<TextStyle>`, `TextStyle`;
- для dimensions: stateful dimension values и plain dimension values, например `Dp`;
- для nested styles: прямые setter-ы `NoteStyle`, `ButtonGroupStyle`, `ChipGroupStyle` и `SpinnerStyle`.

Имена nested style свойств пока открыты. Более явные имена выглядят предпочтительно:

- `actionsStartButtonGroupStyle`;
- `actionsEndButtonGroupStyle`;
- `suggestionsChipGroupStyle`;
- `noteStyle`;
- `loadingSpinnerStyle`, если нужен.

## Требования к AnswerMotionStyle

Motion API для Answer должен жить в `com.sdds.compose.uikit.ai.motion`.

Публичная часть:

- `AnswerMotionStyle`;
- `AnswerMotionStyleBuilder`;
- `LocalAnswerMotionStyle`;
- `rememberAnswerMotion(...)`.

Motion должен учитывать `AnswerState`. Для первой версии motion-свойства нужны только для:

- dimensions;
- `Brush`;
- `TextStyle`.

Свойства других типов в первой версии не нужно выносить в `AnswerMotionStyle`. Если для какого-то visual property нет поддержанного motion evaluator, оно должно разрешаться без анимированной интерполяции.

## Требования к Theme Builder

Theme Builder в `sdds-core/plugin_theme_builder` должен уметь генерировать Compose styles для `Answer`.

Минимальные ожидания:

- генерация `AnswerStyle`;
- генерация non-null `StatefulValue<T>` для visual-свойств;
- генерация `StatefulValue<Brush>` для color-like свойств;
- генерация или wiring nested styles: `NoteStyle`, `ButtonGroupStyle` для action-групп, `ChipGroupStyle` для suggestions, `SpinnerStyle` для loading indicator;
- поддержка `AnswerState` в stateful values;
- отсутствие необходимости вручную дописывать nullable fallback-и в generated styles.

## Fixtures, docs, samples

Нужно предусмотреть Compose fixtures/samples:

- `Default` answer с title, content, actionsStart, actionsEnd и suggestions;
- `Default` answer без части опциональных областей;
- `Loading` с default rendering;
- `Loading` с custom slot;
- `Error` с default `Note`;
- `Error` с custom slot;
- примеры style customization для nested `ButtonGroup`, `ChipGroup` и `Note`.

Документация должна объяснять, что:

- `Answer` не парсит markdown/rich text;
- actions и suggestions передаются как scoped slots;
- `Error` и `Loading` можно полностью переопределить custom slots;
- визуальная вариативность задается через `AnswerStyle`.

## Non-goals

- Не реализовывать markdown/rich text parser.
- Не вводить data model для LLM response, actions или suggestions.
- Не добавлять отдельные `loading: Boolean` или `view: AnswerView`.
- Не переносить Figma footer buttons/chips как обязательные data structures.
- Не выносить motion в `com.sdds.compose.uikit.motion.components.answer`.
- Не реализовывать Android View версию компонента в рамках этого change.

## Открытые вопросы

1. Нужно ли `AnswerScope` раскрывать только `state`, или также style/motion/interaction context? - Нужны style и motion
2. Должны ли `title` и `content` быть `AnswerScope` slots или обычными `@Composable () -> Unit`? - обычным composable слотом
3. Нужно ли разделять default error title/text slots отдельно от общего `error` override? - нет, нужен слот error с AnswerErrorScope, в котором будет использоватеть специальный подготовленный composable AnswerErrorScope.AnswerError().
4. Как финально назвать nested styles в `AnswerStyle`: коротко или максимально явно? - не максимально, но явно
5. Должен ли default loading layout использовать `Spinner` напрямую? - да
6. Если default loading layout использует `Spinner`, нужен ли отдельный `loadingSpinnerStyle` в `AnswerStyle`? - да
7. Нужны ли отдельные dimensions для content corner markers из Figma, или это внутренняя декоративная часть default content placeholder и не должна входить в API первой версии? - не должна, это только в figma
8. Нужно ли поддерживать отдельные slots для loading title/text, или достаточно полного `loading` override? - достаточно полного override, но с AnswerLoadingScope.
9. Нужно ли поддерживать отдельные slots для error title/text, или достаточно полного `error` override и default Note? - достаточно полного `error` override и default Note, который обернут в AnswerErrorScope.AnswerError()
