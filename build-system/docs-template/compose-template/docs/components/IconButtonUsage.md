---
title: IconButton
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.button.IconButton_Simple -->

## Стиль IconButton

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_IconButtonStyle.kt
```

## IconButton Loading

Имеется возможность отобразить состояние загрузки (спиннер), вместо контента, с помощью параметра loading.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_isLoading.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.button.IconButton.isLoading -->

## Произвольный контент в IconButton

Вместо указания ресурса иконки, имеется возможность передать самостоятельно настроенный контент.  
При этом если в качестве контента используется [Icon](./IconUsage.md) и для контента не задан явно размер и  
цвет - будут применены размер и цвет указанный в стиле.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_IconContent.kt
```
