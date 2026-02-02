---
title: TextField — Маски ввода
---

## Что такое маска
Маска ввода — это шаблон форматирования текста внутри `TextField`, который управляет тем, **как пользователь вводит и видит** символы (телефон, дата, время, число и т.п.).

Чтобы применить маску, нужно использовать функцию MaskedTextField() и передать параметр mask. 
MaskedTextField является оберткой над [TextField](TextFieldUsage.md) и имеет единственное отличие в api - обязательный параметр `mask: TextFieldMask` вместо параметра `visualTransformation`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/Mask_Simple.kt
```

## Предустановленные маски
В `MaskedTextField` доступны следующие типы масок (имплементации интерфейса `TextFieldMask`):

### Телефон - `PhoneMask`

Параметры:

- `mask` - строка, описывающая формат телефона
- `digitPlaceholder` - символ подсказки для еще не введенных символов
- `maskMode` - режим отображения маски [TextFieldMaskMode](#textfieldmaskmode---режим-отображения-маски)

```kotlin
// Использование по-умолчанию
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskPhone_Simple.kt

// Кастомизация
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskPhone_Custom.kt
```

### Дата - `DateMask`

Параметры:

- `pattern` - паттерн форматирования даты
- `separator` - разделитель
- `maskMode` - режим отображения маски [TextFieldMaskMode](#textfieldmaskmode---режим-отображения-маски)

```kotlin
// Использование по-умолчанию
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskDate_Simple.kt

// Кастомизация
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskDate_Custom.kt
```

### Время - `TimeMask`

Параметры:

- `pattern` - паттерн форматирования времени
- `separator` - разделитель
- `maskMode` - режим отображения маски [TextFieldMaskMode](#textfieldmaskmode---режим-отображения-маски)

```kotlin
// Использование по-умолчанию
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskTime_Simple.kt

// Кастомизация
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskTime_Custom.kt
```

### Число - `NumberMask`

Параметры:

- `decimalScale` - количество знаков после запятой
- `decimalSeparator` - разделитель дробной части
- `decimalSeparatorAliases` - список допустимых разделителей. При вводе разделителя из этого списка, он будет заменен на `decimalSeparator`
- `thousandGroupSeparator` - разделитель разрядов
- `digitsPerGroup` - количество цифр в группе разрядов

```kotlin
// Использование по-умолчанию
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskNumber_Simple.kt

// Кастомизация
// @sample: com/sdds/compose/uikit/fixtures/samples/mask/MaskNumber_Custom.kt
```

### TextFieldMaskMode - режим отображения маски

Значения:
- Always - Маска отображается всегда
- OnInput - Маска отображается при вводе данных
