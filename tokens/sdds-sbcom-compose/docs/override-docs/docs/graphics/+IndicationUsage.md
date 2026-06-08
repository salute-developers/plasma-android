## RippleIndication в SddsSbCom

В `sdds-sbcom-compose` доступна готовая indication для риппла:
`rememberRippleIndication()`.

Её можно передать через `LocalIndication`, чтобы переопределить поведение всех
кликабельных UIKit-компонентов внутри поддерева:

```kotlin
val indication = rememberRippleIndication(
    rippleSize = RippleSize.MaxDimension,
    blurRadius = BlurRadius.Percent(0.4f),
    drawOrder = DrawOrder.DrawOver,
)

CompositionLocalProvider(
    LocalIndication provides indication,
) {
    Button(
        label = "Button",
        onClick = {},
    )
}
```

Для фиксированного размера используйте `RippleSize.Dp(...)`, а для blur с фиксированным
радиусом - `BlurRadius.Dp(...)`:

```kotlin
val indication = rememberRippleIndication(
    rippleSize = RippleSize.Dp(1000.dp),
    blurRadius = BlurRadius.Dp(40.dp),
)
```

`BlurRadius.Percent(...)` считается от итогового радиуса риппла. Например, `0.4f`
означает 40% от радиуса, независимо от того, задан размер через `Dp`, `MaxDimension`
или `MinDimension`.
