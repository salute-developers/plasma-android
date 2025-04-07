## Быстрый старт
1. Добавить в build.gradle файл следующие зависимости
```kotlin
    implementation("io.github.salute-developers:stylessalute-compose:$saluteVersion")
    implementation("io.github.salute-developers:sdds-uikit-compose:$uikitVersion")
```

Дополнительно, если Вам нужен набор иконок:
```kotlin
    implementation("io.github.salute-developers:sdds-icons:$iconsVersion")
```

2. Добавить в тему вашего приложения тему `StylesSaluteTheme`, например:
```kotlin
private val DarkColors = darkStylesSaluteColors()
private val LightColors = lightStylesSaluteColors()
private val DarkGradients = darkStylesSaluteGradients()
private val LightGradients = lightStylesSaluteGradients()

/**
 * Тема приложения
 */
@Composable
fun YourAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColors
        else -> LightColors
    }
    StylesSaluteTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = content,
    )
}
```

3. Done

## Как использовать токены цвета и градиента
Токены цвета делятся на несколько логических групп, согласно назначению элемента: `text`, `surface`, `background` и `outline`.

Эти группы в свою очередь делятся на подтемы:
- `Default` - По умолчанию, значения токенов меняются в зависимости от темы
- `OnDark` - Статические значения токенов из тёмной темы, не меняются при переключении темы,
- `OnLight` - Статические значения токенов из светлой темы, не меняются при переключении темы,
- `Inverse` Инвертированные значения токенов подтемы `Default`.

Токены цвета представляют из себя экземпляры класса `androidx.compose.ui.graphics.Color`, токены градиента - экземпляры класса `List<androidx.compose.ui.graphics.ShaderBrush>`, т.к. градиенты могут быть многослойными.
Чтобы применить многослойный бэкграунд можно использовать модификатор `Modifier.compositeGradient()`.
Для применения градиента к тексту используется первый слой токена градиента, например, `StylesSaluteTheme.gradients.textDefaultAccentGradient.first()`.

### Структура именования токена цвета
```
область применения + подтема + название состояния
```

Например,
- Figma токену с названием `🌕 Surfaces Default/Accent/surfaceAccent` в коде будет соответствовать аттрибут `StylesSaluteTheme.colors.surfaceDefaultAccent`.
- Figma токену c названием `🌕 Surfaces Default/Transparent/surfaceTransparentSecondary` в коде будет соответствовать аттрибут `StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary`

>Использовать токены цвета и градиентов необходимо через объект `com.sdds.serv.theme.StylesSaluteTheme`.

## Как использовать токены скруглений
Токены скруглений представляют из себя экземпляры класса `androidx.compose.foundation.shape.CornerBasedShape`. А значит их можно использовать везде, где ожидается экземпляр класса `androidx.compose.ui.graphics.Shape` - например, `Modifier.shape()`, `Modifier.background()`, `Modifier.clip()` и т.д.
 Большинство компонентов из `sdds-uikit-compose` также поддерживают установку аттрибута `shape` в стилях.

Использовать токены скруглений необходимо через объект `com.sdds.serv.theme.StylesSaluteTheme`.

Токены скруглений разделяются на группы согласно размеру скругления: Xxs, Xs, S, M, L, Xl, Xxl и Rounded. Токен скругления в фигма имеет следующую структуру названия:
```
CornerRadius/cR<название размера>
```

Допускаются также вычисляемые значения:
```
CornerRadius/calc:[cR<название размера> - 2]
```

Т.е. Figma токену `CornerRadius/cRm` будет соответствовать в коде аттрибут `StylesSaluteTheme.shapes.shapeRoundM`.

А Figma токену `CornerRadius/calc:[cRl - 2]` будет соответствовать в коде аттрибут с дополнительным вызововов функции `StylesSaluteTheme.shapes.shapeRoundL.adjustBy((-2).dp)`.


## Как использовать токены начертаний:
В Figma токены типографики делятся на группы: `Display`, `Body`, `Header`, `Text`.
И на подгруппы: `Large Screens`, `Medium Screens`, `Small Screens`.

## Структура названия токена начертания
```
Группа + Подгруппа + Уникальное название токена
```

Figma токену с названием `Body/BodyL B` будет соответствовать в коде аттрибут `StylesSaluteTheme.typography.bodyLBold`.

>Важно отметить, что выбор подгруппы `Large Screens`, `Medium Screens`, `Small Screens` происходит автоматически.


## Как использовать стилизованные компоненты
TBD
