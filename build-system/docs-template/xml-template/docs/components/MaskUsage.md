---
title: TextField — Маски ввода
---

## Что такое маска
Маска ввода — это шаблон форматирования текста внутри `TextField`, который управляет тем, **как пользователь вводит и видит** символы (телефон, дата, время, число и т.п.).

В `TextField` маски задаются **программно** методом:

```kotlin
textField.setMask(mask: TextField.Mask?, displayMode: Int)
```

- `mask` — предустановленная или кастомная маска (см. ниже). Передайте `null`, чтобы убрать маску.
- `displayMode` — режим отображения маски:
  - `TextField.MASK_DISPLAY_MODE_ALWAYS` — маска видна постоянно (если одновременно задан `placeholder`, приоритет у маски).
  - `TextField.MASK_DISPLAY_MODE_ON_INPUT` — маска появляется только во время ввода.

> Примечание: Маски применимы как к `TextField`, так и к `TextArea` (поведение идентично, отличаются только визуально).

---

## Быстрый старт
```xml
<!-- @sample: com/sdds/uikit/fixtures/Mask_Phone.xml -->
```

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Phone.kt
```

---

## Предустановленные маски
В `TextField` доступны следующие типы масок (sealed class `TextField.Mask`):

### 1) Телефон — `TextField.Mask.Phone`
Маска телефонного номера. Состоит из `prefix` и `suffix`.

Значения по умолчанию подходят под RU-формат
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Phone.kt
```

Кастомизация, например, под международный формат
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Phone_CustomFormat.kt
```

- `prefix` — префикс (например, код страны).
- `suffix` — шаблон основной части номера.

> Символы шаблона интерпретируются системой масок).

### 2) Дата — `TextField.Mask.Date`
Маска даты.

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Date.kt
```

### 3) Время — `TextField.Mask.Time`
Маска времени `часы:минуты`.

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Time.kt
```

### 4) Число — `TextField.Mask.Number`
Маска числового ввода: группировка и десятичная часть.

Параметры:
- `decimalMinCount` — минимальное число знаков после разделителя (по умолчанию 2)
- `decimalMaxCount` — максимальное число знаков после разделителя (по умолчанию 5)
- `groupSeparator` — разделитель групп разрядов (по умолчанию пробел)
- `decimalSeparator` — десятичный разделитель (по умолчанию запятая)

Денежный формат: 2–2 знака после разделителя, пробел как групповой, запятая как десятичный
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Number.kt
```

### 5) Кастомная — `TextField.Mask.Custom`
Произвольный шаблон маски.
Пример произвольного шаблона: AA-#### (буквы/цифры — для примера)
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Custom.kt
```

---

## Режимы отображения маски (displayMode)
- **ALWAYS** (`TextField.MASK_DISPLAY_MODE_ALWAYS`) — маска отображается постоянно.
- **ON_INPUT** (`TextField.MASK_DISPLAY_MODE_ON_INPUT`) — маска видна только во время ввода пользователем.

Всегда показывать структуру телефонного номера
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Phone_Always.kt
```

Показывать маску только при вводе
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Phone.kt
```

---

## Совместная работа с другими свойствами `TextField`
- **`placeholder`**: при режиме `ALWAYS` визуал маски имеет приоритет над плейсхолдером.
- **`prefixText` / `suffixText` и соответствующие `Drawable`**: маска форматирует **внутренний текст** значения и не конфликтует с префиксом/суффиксом.
- **`isReadOnly`**: в режиме только для чтения отображается уже отформатированное значение; ввод недоступен.
- **`value`**: при установке значения вне ввода оно будет автоматически приведено к формату маски (если возможно).

---

## Удаление маски
Чтобы отключить маску и вернуть обычный ввод:

```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Disabled.kt
```

---

## Полный пример
```xml
<!-- @sample: com/sdds/uikit/fixtures/Mask_Number.xml -->
```

Числовая маска с двумя знаками после разделителя, маска видна постоянно.
```kotlin
// @sample: com/sdds/uikit/fixtures/samples/mask/Mask_Sum_Always_Display.kt
```

---

## Частые вопросы
**Могу ли я использовать маску через XML-атрибут?**  
Нет, маска задаётся программно методом `setMask(...)`.

**Как задать другой формат для телефона/даты/времени?**  
Используйте соответствующие параметры (`Phone(prefix, suffix)`) либо `Mask.Custom(pattern)`.

**Как убрать маску на уже созданном поле?**  
Вызовите `textField.setMask(null)`.