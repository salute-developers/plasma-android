---
title: Card
---

Визуальный контейнер, который объединяет различные элементы, такие как изображения, текст и кнопки, в единый блок.
Настройка размера осуществляется явным образом или в зависимости от содержимого.
Компонент Card является базовым контейнером. CardContent используется для вложенного контента внутри Card, имеет свою форму.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/card/Card_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.card.Card_Simple -->

Еще один вариант функции Card, в компановку которой добавлены слоты для Label и Extra, возможность указать  
ориентацию (вид компановки контента внутри карточки) и отступы внутри слота Content.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/card/Card_Extra.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.card.Card_Extra -->

## Стиль Card

Стиль Card можно настроить с помощью CardStyle.builder(). Так же существует набор сгенерированных стилей.

## Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/card/Card_Style.kt
```

### Примечание

При установке contentPaddings, отступы будут применятся на внутренний контент, при этом слот extra  
будет игнорировать эти паддинги.  При смене orintation, контент будет размещаться в Row (для горизонталоной  
ориентации) или в Column (для вертикальной ориентации).
