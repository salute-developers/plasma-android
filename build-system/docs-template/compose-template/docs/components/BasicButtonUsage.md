---
title: Button
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/BasicButton_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.button.BasicButton_Simple -->

## Стиль Button

Стиль Button можно настроить с помощью ButtonStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/BasicButton_BasicButtonStyle.kt
```

## Расположение контента внутри Button

Расположение контента задается при помощи параметра spacing. 
Может быть Packed (контент центрирован, лишние оступы располагаются по краям):

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/BasicButton_LabelValue_Packed.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.button.BasicButton_LabelValue_Packed -->

или SpaceBetween (Контент отобразится по всей ширине, отступы будут добавлены между элементами контента): 
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/BasicButton_LabelValue_SpaceBetween.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.button.BasicButton_LabelValue_SpaceBetween -->

## Button Loading

Имеется возможность отобразить состояние загрузки (спиннер), вместо контента, с помощью параметра loading.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/BasicButton_isLoading.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.button.BasicButton_isLoading -->
