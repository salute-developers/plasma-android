---
title: Cell
---

Компонент ячейки представляет собой стилизованные слоты для контента.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/cell/Cell_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.cell.Cell_Simple -->

## Стиль Cell

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через соответствующий builder. Подробнее о том, как работают `Style`, `StyleBuilder` и stateful-параметры стиля, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/cell/Cell_Style.kt
```

## Cell Gravity

Выравнивание контента по вертикали возможно установить спомощью параметра gravity.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/cell/Cell_Gravity.kt
```

## Cell Disclosure

С помощью параметра disclosureEnabled возможно отобразить иконку "раскрытия" контента, а так же disclosureText текст - описание.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/cell/Cell_Disclosure.kt
```

## Cell Content

В качестве startContent и endContent предусматривается использование функций
Avatar(),  Switch(), CheckBox(), RadioBox(), IconButton() или иконка, а так же функций из RowScope.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/cell/Cell_AvatarSwitch.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.cell.Cell_AvatarSwitch -->
