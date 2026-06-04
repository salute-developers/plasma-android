---
title: AiHeader
---
Компонент шапки для AI-интерфейсов.

Содержит два опциональных слота для кнопок по краям и текстовый блок с заголовком и подзаголовком между ними.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiheader/AiHeader_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.aiheader.AiHeader_Simple -->

## Стиль AiHeader

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiheader/AiHeader_Style.kt
```

## Заголовок и подзаголовок

Заголовок передаётся в слот `titleContent`, подзаголовок — в `subtitleContent`. Если `subtitleContent` равен `null`, отступ между заголовком и подзаголовком не добавляется.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiheader/AiHeader_WithSubtitle.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.aiheader.AiHeader_WithSubtitle -->

## AiHeaderTitleAlignment

Горизонтальное выравнивание текстового блока задаётся через параметр `titleAlignment`.
Возможные значения:

- `Start` — текст выровнен по левому краю (по умолчанию)
- `Center` — текст выровнен по центру
- `End` — текст выровнен по правому краю

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiheader/AiHeader_TitleAlignment.kt
```

## Кнопки

Кнопки слева и справа управляются флагами `hasStartButton` и `hasEndButton`. Иконки и стили кнопок задаются в `AiHeaderStyle` через `startButtonIcon`, `startButtonStyle`, `endButtonIcon` и `endButtonStyle`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiheader/AiHeader_WithButtons.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.aiheader.AiHeader_WithButtons -->

## Разделитель

Разделитель по нижнему краю компонента включается флагом `hasDivider`. Цвет и толщина разделителя задаются в стиле через `AiHeaderColors.dividerBrush` и `AiHeaderDimensions.dividerThickness`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/aiheader/AiHeader_WithDivider.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.aiheader.AiHeader_WithDivider -->
