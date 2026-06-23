---
title: AiUserMessage
---

Компонент AiUserMessage используется для отображения запроса пользователя в ИИ-сценариях.

В `isInEdit` отображает редактируемое поле в виде компонента [Editable](EditableUsage.md), 
при переходе в этот режим, Editable захватывает фокус и активизируется ввод текста.
В обычном режиме текст отображается посредстов мкомпонента [Text](TextUsage.md). С помощью `actions`  
и `editableActions` передайте контент для взаимодействия [ButtonGroup](ButtonGroupUsage.md) кнопки в 
группах стилизуются автоматически. Для отображения загружаемого пользователем контента используйте  
`uploadingContent` компоненты File и Image так же будут стилизованы автоматически.


## Простой пример использования

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiusermessage/AiUserMessage_Simple.kt
```

## Пример использования с контентом для взаимодействия

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiusermessage/AiUserMessage_WithActions.kt
```

## Пример использования с контентом для взаимодействия отображающимся в редактируемом режиме

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiusermessage/AiUserMessage_WithEditableActions.kt
```

## Полный пример использования 

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiusermessage/AiUserMessage_FullUsage.kt
```


## Стиль AiUserMessage

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать  
собственный стиль через метод `builder()`. Подробнее о том, как работают `Style`, `StyleBuilder`  
и параметры стиля с состояниями, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiusermessage/AiUserMessage_Style.kt
```

## Слоты

- `value` - начальное значение отображаемого текста.
- `onValueChange` - поведение при изменении текстового значания.
- `isInEdit` - переводит компонент в режим редактирования.
- `actions` и `editableActions` - слоты с областью видимости `ButtonGroupScope`, каждый отрисовывается в отдельном ButtonGroup.
- `uploadingContent` - слот с областью видимости `ColumnScope`, отрисовывается внутри Column.
