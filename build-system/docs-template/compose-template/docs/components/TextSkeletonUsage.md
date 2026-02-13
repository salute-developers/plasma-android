---
title: TextSkeleton
---
Компонент представляет из себя контейнер (Column),
в котором может отображаться указанное количество строк-заглушек с анимированным мерцанием,  
представленных компонентом [RectSkeleton](RectSkeletonUsage.md), поверх которых возможно наложение текста.  
Высота строк и оступы между строками высчитываются на основе переданного стиля текста.  
Ширина строк настраивается провайдером SkeletonLineWidthProvider и может быть двух видов -  
на всю ширину контейнера или с учетом псевдо отклонения от ширины (имитируется неравномерность, как при написании текста).

Для заглушек произвольной формы используй [RectSkeleton](RectSkeletonUsage.md)

Поддерживает два типа анимации: перемещающийся градиент и фон, плавно изменюящий альфу.

### Простой пример использования
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/textskeleton/TextSkeleton_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.textskeleton.TextSkeleton_Simple -->

### Пример использования с кастомизацией
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/textskeleton/TextSkeleton_Custom.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.textskeleton.TextSkeleton_Custom -->

> Параметр `brush` влияет на тип анимации. Если в brush установлен градиент, то скелетон будет выглядеть как перемещающийся в пространстве градиент.
> Если в brush передан SolidColor(), будет анимация мерцания - изменение альфы исходного цвета.

## Стиль TextSkeleton

Стиль TextSkeleton можно настроить с помощью TextSkeletonStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/textskeleton/TextSkeleton_Style.kt
```