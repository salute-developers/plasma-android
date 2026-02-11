---
title: RectSkeleton
---
Компонент для анимированного отображения загрузки областей на экране любой формы.
Для текста лучше использовать [TextSkeleton](TextSkeletonUsage.md)

Поддерживает два типа анимации: перемещающийся градиент и фон, плавно изменюящий альфу.

### Простой пример использования
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/rectskeleton/RectSkeleton_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.rectskeleton.RectSkeleton_Simple -->

### Пример использования с кастомизацией параметров
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/rectskeleton/RectSkeleton_Custom.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.rectskeleton.RectSkeleton_Custom -->

> Параметр `brush` влияет на тип анимации. Если в brush установлен градиент, то скелетон будет выглядеть как перемещающийся в пространстве градиент.
> Если в brush передан SolidColor(), будет анимация мерцания - изменение альфы исходного цвета.

## Стиль RectSkeleton

Стиль RectSkeleton можно настроить с помощью RectSkeletonStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/rectskeleton/RectSkeleton_Style.kt
```