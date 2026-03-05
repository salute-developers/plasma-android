---
title: IconButton
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_Simple.kt
```

## Стиль IconButton

Стиль IconButton можно настроить с помощью ButtonStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_IconButtonStyle.kt
```

## IconButton Loading

Имеется возможность отобразить состояние загрузки (спиннер), вместо контента, с помощью параметра loading.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_isLoading.kt
```

## Произвольный контент в IconButton

Вместо указания ресурса иконки, имеется возможность передать самостоятельно настроенный контент.  
При этом если в качестве контента используется [Icon](./IconUsage.md) и для контента не задан явно размер и  
цвет - будут применены размер и цвет указанный в стиле.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/button/IconButton_IconContent.kt
```
