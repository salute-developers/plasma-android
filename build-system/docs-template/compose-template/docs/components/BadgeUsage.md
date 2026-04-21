---
title: Badge
---

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/badge/Badge_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.badge.Badge_Simple -->

## Стиль Badge

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/badge/Badge_Style.kt
```

## Иконка Badge

В левой или/и правой части badge можно отобразить иконку. Если нужен Badge с иконкой без текста, можно использовать либо startContent либо endContent, но лучше использовать компонент IconBadge.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/badge/Badge_WithoutLabel.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.badge.Badge_WithoutLabel -->

## IconBadge

То же, что и Badge, но предназначен для отображения только иконки, поэтому не имеет параметра "label".

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/badge/IconBadge_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.badge.IconBadge_Simple -->
