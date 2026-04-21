---
title: Стилизация компонентов
---

Стили в `uikit-compose` описывают внешний вид компонента как отдельный объект, который компонент получает целиком и затем читает из него форму, цвета, типографику, размеры и другие параметры. Это позволяет:

- переиспользовать один и тот же стиль в разных местах,
- переопределять отдельные части стиля без переписывания компонента,
- выносить тему и вариации компонентов в отдельный слой.

Ниже разберём, как это устроено на примере `Button`.

## Базовые сущности: `Style` и `StyleBuilder`

`com.sdds.compose.uikit.style.Style` — это маркерный интерфейс. Он ничего не требует сам по себе, но обозначает: "этот объект является стилем компонента".

```kotlin
interface Style
```

Конкретный стиль расширяет его и объявляет набор параметров, которые нужны компоненту. Для кнопки это делает `ButtonStyle`:

```kotlin
interface ButtonStyle : Style {
    val shape: CornerBasedShape
    val colors: ButtonColors
    val labelStyle: TextStyle
    val valueStyle: TextStyle
    val dimensions: ButtonDimensions
    val disableAlpha: Float
    val loadingAlpha: Float
}
```

`StyleBuilder<T : Style>` — это общий контракт для сборки такого стиля.

```kotlin
interface StyleBuilder<T : Style> {
    val receiver: Any? get() = null
    fun style(): T
}
```

Смысл у него простой:

- builder накапливает параметры стиля;
- `style()` создаёт готовый неизменяемый объект стиля;
- `receiver` нужен, если один и тот же builder должен по-разному применяться к разным получателям стиля.

Дополнительно в пакете `style` есть helper-функции `applyFor(...)` и `applyExclude(...)`. Они позволяют применять часть конфигурации только для конкретного `receiver` или для всех, кроме него.

## Как это выглядит на примере `Button`

Для кнопки есть отдельный интерфейс стиля `ButtonStyle` и builder `BasicButtonStyleBuilder`.

### 1. Компонент читает уже готовый стиль

В `Button` стиль приходит параметром:

```kotlin
@Composable
fun Button(
    label: String,
    onClick: () -> Unit,
    style: ButtonStyle = LocalButtonStyle.current,
    ...
)
```

Если стиль явно не передан, используется `LocalButtonStyle.current`, то есть значение из `CompositionLocal`.

Дальше компонент просто читает из стиля нужные свойства:

- `style.shape` для формы,
- `style.dimensions` для высоты, отступов и размеров иконок,
- `style.labelStyle` и `style.valueStyle` для текста,
- `style.colors.*` для цветов,
- `style.disableAlpha` и `style.loadingAlpha` для служебного поведения.

Например, цвет текста и иконки вычисляется из стиля во время рендера:

```kotlin
val labelColor = colors.labelColor.colorForInteraction(interactionSource)
val valueColor = colors.valueColor.colorForInteraction(interactionSource)
```

То есть сам компонент не знает, какой именно цвет должен быть у кнопки в `pressed`, `focused` или `hovered` состоянии. Он знает только, что у него есть `InteractiveColor`, который умеет вернуть актуальное значение для текущего состояния.

### 2. Значение по умолчанию поставляется через `CompositionLocal`

Для базовой кнопки есть локал:

```kotlin
val LocalButtonStyle = compositionLocalOf {
    ButtonStyle.basicButtonBuilder().style()
}
```

Это важный паттерн всей библиотеки:

- у компонента есть default-style через `CompositionLocal`,
- стиль можно передать напрямую в параметре `style`,
- стиль можно переопределить выше по дереву через `CompositionLocalProvider`.

За счёт этого один и тот же компонент может:

- работать "из коробки",
- участвовать в теме,
- локально переопределяться внутри отдельного блока интерфейса.

### 3. `StyleBuilder` собирает финальный объект стиля

Builder для кнопки создаётся так:

```kotlin
fun ButtonStyle.basicButtonBuilder(
    receiver: Any? = null,
): BasicButtonStyleBuilder = BasicButtonStyleBuilderImpl(receiver)
```

`BasicButtonStyleBuilder` реализует `StyleBuilder<ButtonStyle>` и предоставляет API для настройки:

- `shape(...)`,
- `colors { ... }`,
- `labelStyle(...)`,
- `valueStyle(...)`,
- `dimensions { ... }`,
- `disableAlpha(...)`,
- `loadingAlpha(...)`.

Когда вызывается `style()`, builder создаёт готовый immutable-объект:

```kotlin
override fun style(): ButtonStyle {
    return DefaultBasicButtonStyle(
        shape = shape ?: RoundedCornerShape(25),
        colors = colorsBuilder.build(),
        labelStyle = labelStyle ?: TextStyle.Default,
        valueStyle = valueStyle ?: TextStyle.Default,
        dimensions = dimensionsBuilder.build(),
        disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
        loadingAlpha = loadingAlpha ?: LOADING_BUTTON_ALPHA,
    )
}
```

Именно здесь происходит финализация стиля:

- если параметр не задан, подставляется значение по умолчанию;
- после `style()` наружу уходит уже не builder, а готовый `ButtonStyle`.

### 4. Вложенные builder'ы собирают части стиля

У кнопки стиль состоит из вложенных сущностей:

- `ButtonColors`,
- `ButtonDimensions`.

Поэтому у `BasicButtonStyleBuilder` есть вложенные DSL-блоки:

```kotlin
ButtonStyle.basicButtonBuilder()
    .colors {
        backgroundColor(...)
        labelColor(...)
        valueColor(...)
        iconColor(...)
        spinnerColor(...)
    }
    .dimensions {
        height(...)
        paddingStart(...)
        paddingEnd(...)
        iconSize(...)
    }
    .style()
```

Это типичный паттерн в `uikit-compose`:

- корневой builder собирает стиль компонента,
- вложенные builder'ы собирают отдельные группы параметров,
- каждый вложенный builder умеет вернуть свою законченную структуру через `build()`.

## Ментальная модель: как "течёт" стиль

На практике поток такой:

1. Мы описываем интерфейс стиля компонента, например `ButtonStyle`.
2. Мы создаём builder, который умеет собрать этот стиль, например `BasicButtonStyleBuilder`.
3. Builder возвращает готовый immutable-style через `style()`.
4. Этот стиль кладётся в `CompositionLocal` или передаётся напрямую в компонент.
5. Компонент не вычисляет внешний вид сам, а читает значения из стиля.
6. Если часть стиля зависит от интеракций, компонент обращается к `InteractiveColor` или `StatefulValue`.

Именно поэтому `Style` и `StyleBuilder` удобно воспринимать как два слоя:

- `Style` — финальный контракт данных, которые читает компонент;
- `StyleBuilder` — API, через который эти данные удобно собрать и переопределить.

## Пример создания собственного стиля кнопки

```kotlin
val customButtonStyle = ButtonStyle.basicButtonBuilder()
    .shape(RoundedCornerShape(16.dp))
    .labelStyle(TextStyle.Default)
    .valueStyle(TextStyle.Default)
    .colors {
        backgroundColor(
            Color(0xFF2E6BF6).asInteractive(
                pressed = Color(0xFF1E56D9),
            ),
        )
        labelColor(Color.White)
        valueColor(Color(0xFFD6E0FF))
        iconColor(Color.White)
        spinnerColor(Color.White)
    }
    .dimensions {
        height(48.dp)
        paddingStart(16.dp)
        paddingEnd(16.dp)
        minWidth(96.dp)
        iconSize(24.dp)
        spinnerSize(22.dp)
        spinnerStrokeWidth(2.dp)
        iconMargin(8.dp)
        valueMargin(4.dp)
    }
    .disableAlpha(0.4f)
    .loadingAlpha(0f)
    .style()
```

Использование:

```kotlin
Button(
    label = "Продолжить",
    onClick = {},
    style = customButtonStyle,
)
```

Если нужно переопределить стиль для группы компонентов, удобнее сделать это через `CompositionLocalProvider`.

## `StatefulValue`: значение, зависящее от состояния

`StatefulValue<T>` — это контейнер, который хранит разные значения одного типа для разных наборов состояний.

Он нужен, когда какое-то свойство компонента меняется не всегда одинаково, а зависит от:

- интерактивных состояний (`Pressed`, `Focused`, `Hovered`, `Activated`, `Selected`),
- дополнительных пользовательских состояний через `ValueState`,
- комбинации нескольких состояний сразу.

Пример идеи:

```kotlin
val alpha = 1f.asStatefulValue(
    setOf(InteractiveState.Pressed) to 0.6f,
    setOf(InteractiveState.Focused) to 0.8f,
)
```

Здесь:

- `1f` — значение по умолчанию,
- при `Pressed` будет возвращаться `0.6f`,
- при `Focused` будет возвращаться `0.8f`.

Получить актуальное значение можно двумя способами:

- напрямую по набору состояний: `getValue(stateSet)`,
- из `InteractionSource`: `getValue(interactionSource)`.

Второй вариант особенно важен в Compose-компонентах, потому что `StatefulValue` сам считывает текущее состояние из `InteractionSource`.

### Когда использовать `StatefulValue`

`StatefulValue` подходит для любых свойств, которые должны зависеть от состояния, а не только для цветов. Например:

- `Float`,
- `Dp`,
- `Brush`,
- `Shape`,
- любые собственные типы.

Это базовый универсальный механизм state-dependent значений.

## `InteractiveColor`: частный случай stateful-значения для цвета

`InteractiveColor` — это специализированная абстракция для цвета, который зависит от интеракций.

```kotlin
interface InteractiveColor {
    @Composable
    fun colorForInteraction(interactionSource: InteractionSource): Color
}
```

По сути, это более удобный API поверх stateful-поведения именно для `Color`.

Создать его можно двумя основными способами.

### Вариант 1. Простой: отдельные цвета для основных интеракций

```kotlin
val interactive = defaultColor.asInteractive(
    focused = focusedColor,
    hovered = hoveredColor,
    pressed = pressedColor,
    activated = activatedColor,
    selected = selectedColor,
)
```

Этот вариант удобен, когда достаточно одного цвета на каждое типовое интерактивное состояние.

### Вариант 2. Гибкий: через наборы состояний

```kotlin
val interactive = defaultColor.asInteractive(
    setOf(InteractiveState.Pressed) to pressedColor,
    setOf(InteractiveState.Selected) to selectedColor,
    setOf(InteractiveState.Selected, InteractiveState.Pressed) to selectedPressedColor,
)
```

Этот способ стоит использовать, когда:

- нужно обработать комбинации состояний,
- нужны не только базовые `pressed/hovered/focused`,
- важно тонко контролировать приоритет состояний.

## Как использовать `StatefulValue` и `InteractiveColor` в стиле

В `ButtonStyle` цвета объявлены как `InteractiveColor`:

```kotlin
interface ButtonColors {
    val backgroundColor: InteractiveColor
    val labelColor: InteractiveColor
    val valueColor: InteractiveColor
    val iconColor: InteractiveColor
    val spinnerColor: InteractiveColor
}
```

Это значит, что стиль описывает не просто "обычный" цвет, а правило получения цвета для разных состояний.

Пример для кнопки:

```kotlin
val buttonStyle = ButtonStyle.basicButtonBuilder()
    .colors {
        backgroundColor(
            Color(0xFF2E6BF6).asInteractive(
                setOf(InteractiveState.Pressed) to
                    Color(0xFF1E56D9),
                setOf(InteractiveState.Focused) to
                    Color(0xFF4D82FF),
            ),
        )
        labelColor(
            Color.White.asInteractive(
                pressed = Color.White,
            ),
        )
        iconColor(Color.White)
        valueColor(Color(0xFFD6E0FF))
        spinnerColor(Color.White)
    }
    .style()
```

Внутри компонента это будет использовано так:

```kotlin
val labelColor = style.colors.labelColor.colorForInteraction(interactionSource)
```

Компоненту не нужно вручную проверять `pressed`, `focused` и другие флаги. Эту задачу берёт на себя `InteractiveColor`.

### Когда в стиле нужен `StatefulValue`, а когда `InteractiveColor`

- Используйте `InteractiveColor`, когда свойство является цветом и должно зависеть от интеракций.
- Используйте `StatefulValue<T>`, когда от состояния зависит не цвет, а любое другое значение.
- Если нужен stateful-color, но в более общем виде, `InteractiveColor` можно преобразовать в `StatefulValue<Color>` через `asStatefulColor()`.

## Практические рекомендации

- Компонент должен читать значения из стиля, а не вычислять визуальные параметры сам.
- В интерфейс стиля выносите только те свойства, которые реально управляют внешним видом компонента.
- Для сложного стиля лучше группировать параметры во вложенные сущности вроде `Colors`, `Dimensions`, `Typography`.
- Для цветов интерактивных состояний используйте `InteractiveColor`, а не отдельные `if (pressed) ...` внутри компонента.
- Для любых других значений, зависящих от состояния, используйте `StatefulValue<T>`.
- Значения по умолчанию лучше задавать на этапе `style()`, чтобы компонент всегда получал валидный и полный стиль.

## Кратко

- `Style` — это финальный объект стиля, который читает компонент.
- `StyleBuilder` — это способ собрать и переопределить этот стиль.
- `CompositionLocal` поставляет default-style для компонента.
- `InteractiveColor` отвечает за цвета, зависящие от интеракций.
- `StatefulValue<T>` — общий механизм для любых значений, зависящих от состояния.
