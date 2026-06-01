## 1. sdds-core/uikit-compose Public API

- [x] 1.1 Создать пакет `com.sdds.compose.uikit.ai` для публичного runtime API Answer.
- [x] 1.2 Добавить `AnswerState : ValueState` со значениями `Default`, `Error`, `Loading`.
- [x] 1.3 Добавить публичный composable `Answer(...)` с параметрами `modifier`, `state`, `title`, `content`, `actionsStart`, `actionsEnd`, `suggestions`, `loading`, `error`, `style`, `motion`.
- [x] 1.4 Сделать `title` и `content` обычными nullable composable slots без `AnswerScope` receiver.
- [x] 1.5 Сделать `actionsStart` и `actionsEnd` slots с receiver `ButtonGroupScope`.
- [x] 1.6 Сделать `suggestions` slot с receiver `FlowRowScope`; отдельно решить, нужен ли public alias/wrapper для `FlowRowScope`.
- [x] 1.7 Добавить `AnswerErrorScope` и `AnswerLoadingScope` для custom `error` и `loading` slots.
- [x] 1.8 Добавить в scopes доступ к текущим `AnswerState`, `AnswerStyle` и `Motion<AnswerMotionStyle>`.
- [x] 1.9 Добавить helper composable `AnswerErrorScope.AnswerError(...)` для default Note-based error rendering.
- [x] 1.10 Добавить helper composable `AnswerLoadingScope.AnswerLoading(...)` для default Spinner-based loading rendering.
- [x] 1.11 Добавить KDoc для всех новых public API, scopes, state, style и motion entry points.

## 2. sdds-core/uikit-compose Internal Layout

- [x] 2.1 Создать internal package для Answer helpers, предпочтительно `com.sdds.compose.uikit.internal.ai`.
- [x] 2.2 Реализовать default branch layout для optional `title`, `content`, actions row и suggestions area.
- [x] 2.3 Рендерить `actionsStart` в отдельном `ButtonGroup` со стилем из `AnswerStyle`.
- [x] 2.4 Рендерить `actionsEnd` в отдельном `ButtonGroup` со стилем из `AnswerStyle`.
- [x] 2.5 Не рендерить отсутствующие action groups, если стиль явно не требует reserved space.
- [x] 2.6 Рендерить `suggestions` внутри `ChipGroup` со стилем из `AnswerStyle`.
- [x] 2.7 Не рендерить `ChipGroup`, когда `suggestions` отсутствует.
- [x] 2.8 В `Loading` branch рендерить custom loading slot или default `AnswerLoadingScope.AnswerLoading(...)`.
- [x] 2.9 В `Error` branch рендерить custom error slot или default `AnswerErrorScope.AnswerError(...)`.
- [x] 2.10 Убедиться, что `Loading` и `Error` branches не рендерят default title/content/actions/suggestions areas.
- [x] 2.11 Подключить `AnswerState` в state set для style resolution и MotionContext.

## 3. sdds-core/uikit-compose Styles

- [x] 3.1 Добавить `LocalAnswerStyle`, `AnswerStyle`, `AnswerStyleBuilder`, `AnswerColors`, `AnswerDimensions` и default implementation.
- [x] 3.2 Сделать все visual-свойства `AnswerStyle` non-null `StatefulValue<T>`.
- [x] 3.3 Сделать все color-like свойства `AnswerStyle` типом `StatefulValue<Brush>`.
- [x] 3.4 Добавить stateful typography свойства, включая как минимум title/loading text styles.
- [x] 3.5 Добавить stateful dimensions для spacing/padding/size значений default layout.
- [x] 3.6 Добавить nested `noteStyle: NoteStyle`.
- [x] 3.7 Добавить nested `loadingSpinnerStyle: SpinnerStyle`.
- [x] 3.8 Добавить nested style для `actionsStart` `ButtonGroup`.
- [x] 3.9 Добавить nested style для `actionsEnd` `ButtonGroup`.
- [x] 3.10 Добавить nested style для `suggestions` `ChipGroup`.
- [x] 3.11 Добавить builder overloads для `StatefulValue<Brush>`, `Brush`, `Color`, `InteractiveColor`.
- [x] 3.12 Добавить builder overloads для `StatefulValue<TextStyle>` и `TextStyle`.
- [x] 3.13 Добавить builder overloads для stateful dimensions и plain dimension values, например `Dp`.
- [x] 3.14 Добавить builder setters для nested `NoteStyle`, `SpinnerStyle`, `ButtonGroupStyle`, `ChipGroupStyle`.
- [x] 3.15 Обеспечить валидные default styles без nullable visual fallbacks.

## 4. sdds-core/uikit-compose Motion

- [x] 4.1 Создать пакет `com.sdds.compose.uikit.ai.motion`.
- [x] 4.2 Добавить `AnswerMotionStyle`, `AnswerMotionStyleBuilder`, `LocalAnswerMotionStyle`.
- [x] 4.3 Добавить `rememberAnswerMotion(...)`.
- [x] 4.4 Поддержать motion properties для dimensions, которые меняются между `AnswerState`.
- [x] 4.5 Поддержать motion properties для `Brush`.
- [x] 4.6 Поддержать motion properties для `TextStyle`.
- [x] 4.7 Не добавлять motion properties для unsupported property types в первой версии.
- [x] 4.8 Подключить `AnswerState` в MotionContext runtime rendering.
- [x] 4.9 Убедиться, что unsupported visual values разрешаются statefully без анимированной интерполяции.

## 5. sdds-core/plugin_theme_builder

- [x] 5.1 Найти существующие Compose style generators для близких компонентов (`Note`, `Spinner`, `ButtonGroup`, `ChipGroup`, `NavigationDrawerItem`) и определить точки расширения.
- [x] 5.2 Добавить конфигурацию Theme Builder для Compose `Answer`.
- [x] 5.3 Добавить генератор Compose `AnswerStyle`.
- [x] 5.4 Обеспечить генерацию `StatefulValue<Brush>` для color-like свойств.
- [x] 5.5 Обеспечить генерацию stateful dimensions и typography.
- [x] 5.6 Обеспечить поддержку `AnswerState.Default`, `AnswerState.Error`, `AnswerState.Loading` в generated stateful values.
- [x] 5.7 Обеспечить генерацию или wiring nested `NoteStyle`, `SpinnerStyle`, action `ButtonGroupStyle` values и suggestions `ChipGroupStyle`.
- [x] 5.8 Добавить или обновить generator tests/fixtures для `AnswerStyle`, если в этом модуле есть соответствующая тестовая инфраструктура.

## 6. Fixtures, Docs, and Samples

- [x] 6.1 Добавить Compose fixtures/samples для `AnswerState.Default` с title, content, actionsStart, actionsEnd и suggestions.
- [x] 6.2 Добавить sample для `Default` без части optional areas.
- [x] 6.3 Добавить sample для `Loading` с default rendering.
- [x] 6.4 Добавить sample для `Loading` с custom `AnswerLoadingScope`.
- [x] 6.5 Добавить sample для `Error` с default `Note`.
- [x] 6.6 Добавить sample для `Error` с custom `AnswerErrorScope`.
- [x] 6.7 Добавить examples для customization nested `ButtonGroup`, `ChipGroup`, `Note` и `Spinner` styles.
- [x] 6.8 Добавить или обновить docs template для Compose `AnswerUsage.md`.
- [x] 6.9 Добавить регистрацию компонента в sandbox/integration metadata, если это требуется для отображения в demo apps.

## 7. Validation

- [x] 7.1 Запустить focused validation для `sdds-core/uikit-compose` из корня репозитория.
- [x] 7.2 Запустить focused validation для `sdds-core/plugin_theme_builder` из корня репозитория.
- [x] 7.3 Запустить релевантные generator tests, если были изменены generator fixtures.
- [x] 7.4 Проверить, что существующие `ButtonGroup`, `ChipGroup`, `Note`, `Spinner` не изменены поведенчески.
- [x] 7.5 Перед merge запустить `./gradlew detektAll`, если изменения затронули generated outputs, shared style APIs или несколько модулей.
