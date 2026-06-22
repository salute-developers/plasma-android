# AiInput

Compose-компонент ввода для AI-интерфейсов. Объединяет текстовое поле, область вложений и набор контролов слева, справа и кнопку отправки.

## Режимы отображения

Режим задаётся через `AiInputStyle.mode: AiInputMode` — является частью стиля, а не параметром компонента.

### Condensed (по умолчанию)

Поле ввода располагается в одну горизонтальную строку с контролами, пока текст однострочный. Как только текст становится многострочным, поле переносится над контролами. При удалении текста до одной строки компоновка возвращается к горизонтальной.

```
Однострочный:  [ startControls | field | endControls | sendButton ]
Многострочный: [ field                                            ]
               [ startControls | endControls | sendButton         ]
```

### Extended

Поле ввода всегда располагается над контролами, независимо от количества строк.

```
[ field                                            ]
[ startControls | endControls | sendButton         ]
```

## Структура компонента

```
[ content (слот для File-компонентов и другого контента) ]
[ поле ввода / контролы (зависит от режима) ]
```

- **content** — слот контента (например, компоненты `File`), отображается выше поля ввода с горизонтальным скроллом и нижним отступом `contentPadding`. Внутри провайдится `LocalFileStyle` из `AiInputStyle.fileStyle`.
- **startControls** — слот для левой группы кнопок. Провайдит `LocalButtonGroupStyle` и `LocalButtonStyle` из стиля.
- **endControls** — слот для правой группы кнопок. Аналогично startControls.
- **sendButton** — слот кнопки отправки, располагается правее `endControls`. Провайдит `LocalButtonStyle` из `AiInputStyle.sendButtonStyle`.
- **placeholder** — отображается при пустом поле ввода, скрывается при вводе текста.

## Скроллбар

В многострочном режиме поле ввода становится вертикально прокручиваемым. При `hasScrollBar = true` (по умолчанию) справа от текста отображается `ScrollBar`, который появляется при прокрутке и исчезает после её остановки. Скроллбар показывается только когда контент реально не помещается (высота поля ограничена родителем).

Скроллбар накладывается поверх поля и **не влияет на размеры строки** — его появление/исчезновение не сдвигает текст. Расположение задаётся через `AiInputDimensions`:

- **scrollBarPaddingStart** — горизонтальный отступ скроллбара от правой границы текстового поля (после `textFieldPaddingEnd`).
- **scrollBarPaddingTop / scrollBarPaddingBottom** — отступы трека внутрь от верхней/нижней границы области текста.

Стиль скроллбара задаётся через `AiInputStyle.scrollBarStyle`.

## Простой пример

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiinput/AiInput_Simple.kt
```

## С контролами и кнопкой отправки

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiinput/AiInput_WithControls.kt
```

## С контентом

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiinput/AiInput_WithContent.kt
```

## Режим Extended

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiinput/AiInput_Extended.kt
```

## Стилизация

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiinput/AiInput_Style.kt
```

## Параметры компонента

| Параметр              | Тип                      | Описание                                              |
|-----------------------|--------------------------|-------------------------------------------------------|
| `value`               | `TextFieldValue`         | Текущее значение поля ввода                           |
| `onValueChange`       | `(TextFieldValue) -> Unit` | Колбэк изменения значения                           |
| `style`               | `AiInputStyle`           | Стиль компонента                                      |
| `motion`              | `Motion<AiInputMotionStyle>` | Объект анимаций                                  |
| `enabled`             | `Boolean`                | Доступность для взаимодействия                        |
| `readOnly`            | `Boolean`                | Режим только для чтения                               |
| `keyboardOptions`     | `KeyboardOptions`        | Параметры клавиатуры                                  |
| `keyboardActions`     | `KeyboardActions`        | Обработчики действий клавиатуры (напр. onSend)        |
| `visualTransformation`| `VisualTransformation`   | Трансформация отображаемого текста                    |
| `hasScrollBar`        | `Boolean`                | Показывать ли скроллбар в многострочном режиме        |
| `interactionSource`   | `MutableInteractionSource` | Источник взаимодействий                             |
| `placeholder`         | `(@Composable () -> Unit)?` | Слот placeholder                                 |
| `content`             | `(@Composable RowScope.() -> Unit)?`    | Слот контента над полем ввода        |
| `startControls`       | `(@Composable () -> Unit)?` | Слот левых контролов                             |
| `endControls`         | `(@Composable () -> Unit)?` | Слот правых контролов                            |
| `sendButton`          | `(@Composable () -> Unit)?` | Слот кнопки отправки                             |

## Стиль AiInputStyle

Стиль конфигурируется через `AiInputStyle.builder()`:

| Свойство                | Тип                   | Описание                                |
|-------------------------|-----------------------|-----------------------------------------|
| `shape`                 | `StatefulValue<Shape>`| Форма компонента                        |
| `mode`                  | `AiInputMode`         | Режим отображения: Condensed / Extended |
| `inputStyle`            | `StatefulValue<TextStyle>` | Типографика вводимого текста       |
| `placeholderStyle`      | `StatefulValue<TextStyle>` | Типографика placeholder            |
| `colors.backgroundColor`| `StatefulValue<Brush>`| Кисть фона компонента                  |
| `colors.inputColor`     | `StatefulValue<Brush>`| Кисть вводимого текста                 |
| `colors.placeholderColor`| `StatefulValue<Brush>`| Кисть placeholder                     |
| `colors.cursorColor`    | `StatefulValue<Brush>`| Кисть курсора                          |
| `fileStyle`             | `FileStyle`           | Стиль для дочерних компонентов File    |
| `startButtonGroupStyle` | `ButtonGroupStyle`    | Стиль группы кнопок в startControls    |
| `endButtonGroupStyle`   | `ButtonGroupStyle`    | Стиль группы кнопок в endControls      |
| `sendButtonStyle`       | `ButtonStyle`         | Стиль кнопки отправки                  |
| `scrollBarStyle`        | `ScrollBarStyle`      | Стиль скроллбара в многострочном режиме|
