---
title: TextField
--- 

```kotlin
var value by remember { mutableStateOf(TextFieldValue("value")) }
TextField(
    value = value,
    captionText = "Caption",
    labelText = "Label",
    style = TextField.S.OuterLabel.RequiredStart.Warning.style(),
    placeholderText = "Placeholder",
    onValueChange = { value = it },
    startContent = {
        Icon(
            painter = painterResource(id = R.drawable.ic_add_fill_24),
            contentDescription = "",
            tint = Color.Black,
        )
    },
    chipsContent = { Chip(label = "Chip") },
)
```

## Стиль TextField

Стиль TextField можно настроить с помощью TextFieldStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
TextFieldStyle.builder()
    .colors {
        captionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultWarning.asInteractive(
                setOf(InteractiveState.Activated)
                    to {{ docs-theme-codeReference }}.colors.textDefaultSecondary,
            ),
        )
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultTransparentWarning.asInteractive(
                setOf(InteractiveState.Activated)
                    to {{ docs-theme-codeReference }}.colors.surfaceDefaultTransparentSecondary,
            ),
        )
        optionalColor(
            {{ docs-theme-codeReference }}.colors.textDefaultTertiary.asInteractive(),
        )
        valueColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        placeholderColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(
                setOf(InteractiveState.Activated)
                    to {{ docs-theme-codeReference }}.colors.textDefaultTertiary,
            ),
        )
        indicatorColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultNegative.asInteractive(),
        )
        startContentColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        endContentColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(
                setOf(InteractiveState.Pressed)
                    to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(InteractiveState.Hovered)
                    to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
            ),
        )
        endContentColorReadOnly(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.multiplyAlpha(0.4f).asInteractive(),
        )
        captionColorReadOnly(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        counterColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        backgroundColorReadOnly(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidPrimary.multiplyAlpha(0.4f).asInteractive(),
        )
        cursorColor(
            {{ docs-theme-codeReference }}.colors.textDefaultAccent.asInteractive(),
        )
        prefixColor(
            {{ docs-theme-codeReference }}.colors.textDefaultTertiary.asInteractive(),
        )
        suffixColor(
            {{ docs-theme-codeReference }}.colors.textDefaultTertiary.asInteractive(),
        )
    }
    .singleLine(true)
    .shape({{ docs-theme-codeReference }}.shapes.roundS.adjustBy(all = 0.0.dp))
    .dimensions {
        optionalPadding(4.0.dp)
        helperTextPadding(4.0.dp)
        chipsPadding(6.0.dp)
        boxPaddingStart(8.0.dp)
        boxPaddingEnd(8.0.dp)
        boxPaddingTop(8.0.dp)
        boxPaddingBottom(8.0.dp)
        boxMinHeight(32.0.dp)
        alignmentLineHeight(32.0.dp)
        startContentPadding(4.0.dp)
        endContentPadding(4.0.dp)
        startContentSize(16.0.dp)
        endContentSize(16.0.dp)
    }
    .captionStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .counterStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .captionPlacement(TextFieldHelperTextPlacement.Outer)
    .counterPlacement(TextFieldHelperTextPlacement.Outer)
    .valueStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .prefixStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .suffixStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .placeholderStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .chipGroupStyle(EmbeddedChipGroupDense.Xs.Secondary.style())
    .labelPlacement(TextFieldLabelPlacement.None)
    .style()
```

## TextField readOnly

При включении этого параметра компоннет сатновится доступным только для чтения,
изменение текстовых полей невозможно.

## TextField value

Параметр value в Textfield ожидает значение типа TextFieldValue, с помощью которого
возможно контролировать позицию курсора при вводе текста, а так же выделять диапазон
символов. Если текст для value не задан, будет отображен текст, который задан в placeholder,
в качестве hint.

## TextField иконки в поле ввода

С помощью пармаетров startContent и endContent можно установить иконку в начале
и/или в конце поля ввода.

## Расположение Label

Задается стилем компонента, а именно функцией билдера стиля - labelPlacement(),
в качестве параметра ожидается значение enum TextFieldLabelPlacement

```kotlin
TextFieldStyle.builder()
.labelPlacement(TextFieldLabelPlacement.Outer)
style()
```

## Расположение Indicator (RequireStart, RequireEnd)

Задается стилем компонента, а именно функцией билдера стиля - .indicatorAlignmentMode()
в качестве параметра ожидается значение enum TextFieldIndicatorAlignmentMode

```kotlin
TextFieldStyle.builder()
.indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.Inside)
style()
```

## Тип текстового поля (обязательное или опциональное)

Задается стилем компонента, а именно функцией билдера стиля - .fieldType()
в качестве параметра ожидается значение enum TextFieldType

```kotlin
TextFieldStyle.builder()
.fieldType(TextFieldType.RequiredStart)
style()
```

## Расположение Caption

Задается стилем компонента, а именно функцией билдера стиля - .captionPlacement()
в качестве параметра ожидается значение enum TextFieldHelperTextPlacement

```kotlin
TextFieldStyle.builder()
.captionPlacement(TextFieldHelperTextPlacement.Outer)
style()
```
