---
title: TextField
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/textfield/TextField_Simple.kt
```

## Стиль TextField

Стиль TextField можно настроить с помощью TextFieldStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/textfield/TextField_Style.kt
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
