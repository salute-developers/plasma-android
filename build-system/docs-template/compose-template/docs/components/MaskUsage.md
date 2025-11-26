---
title: TextField — Маски ввода
---

## Что такое маска
Маска ввода — это шаблон форматирования текста внутри `TextField`, который управляет тем, **как пользователь вводит и видит** символы (телефон, дата, время, число и т.п.).

Чтобы применить маску, нужно использовать функцию MaskedTextField() и передать параметр mask. 
MaskedTextField является оберткой над [TextField](TextFieldUsage.md) и имеет единственное отличие в api - обязательный параметр `mask: TextFieldMask` вместо параметра `visualTransformation`.

```kotlin
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember { PhoneMask() }, // маска для телефонных номеров
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите номер телефона",
    labelText = "Номер пользователя",
)
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
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember { PhoneMask() }, // Настройки по-умолчанию подходят под RU-формат
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите номер телефона",
)

// Кастомизация
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember { 
        PhoneMask(
            mask = "+365 (###) ###_##_##", // используем кастомный код и разделители '_',
            digitPlaceHolder = '1' // используем символ подсказки 1 вместо 0
        )
    },
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите номер телефона",
)
```

### Дата - `DateMask`

Параметры:

- `pattern` - паттерн форматирования даты
- `separator` - разделитель
- `maskMode` - режим отображения маски [TextFieldMaskMode](#textfieldmaskmode---режим-отображения-маски)

```kotlin
// Использование по-умолчанию
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember { DateMask() }, // Настройки по-умолчанию ДД:ММ:ГГ
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите дату рождения",
)

// Кастомизация
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember {
        DateMask(
            pattern = listOf("ММ", "ГГ"), // оставляем только месяц и год
            separator = '_', // используем кастомный разделитель
        )
    },
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите дату рождения",
)
```

### Время - `TimeMask`

Параметры:

- `pattern` - паттерн форматирования времени
- `separator` - разделитель
- `maskMode` - режим отображения маски [TextFieldMaskMode](#textfieldmaskmode---режим-отображения-маски)

```kotlin
// Использование по-умолчанию
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember { TimeMask() }, // Настройки по-умолчанию ЧЧ:ММ
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите дату рождения",
)

// Кастомизация
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember {
        TimeMask(
            pattern = listOf("ЧЧ", "ММ", "СС"), // добавляем секунды
            separator = '_', // используем кастомный разделитель
        ) 
    },
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите время",
)
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
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember { NumberMask() }, // Настройки по-умолчанию
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите сумму",
    suffix = "млн. руб",
)

// Кастомизация
var text by remember { mutableStateOf("") }
MaskedTextField(
    value = text,
    onValueChange = { text = it },
    mask = remember {
        NumberMask(
            decimalScale = 3, // изменяем количество знаков после запятой
            decimalSeparator = ".", // используем кастомный разделитель дробной части
            decimalSeparatorAliases = listOf(".", ","), // изменяем спиок допустимых разделителей
            thousandGroupSeparator = "_", // кастомный разделитель групп цифр
            digitsPerGroup = 2 // изменяем количество цифр в группе
        ) 
    },
    style = TextField.S.OuterLabel.RequiredStart.Default.style(),
    placeholderText = "Введите сумму",
    suffix = "млн. руб",
)
```

### TextFieldMaskMode - режим отображения маски

Значения:
- Always - Маска отображается всегда
- OnInput - Маска отображается при вводе данных
