---
title: Cell
---

Компонент ячейки представляет собой стилизованные слоты для контента.

```kotlin
val interactionSource = remember { MutableInteractionSource() }
val isFocused = interactionSource.collectIsFocusedAsState()
Cell(
    modifier = Modifier
        .focusable(interactionSource = interactionSource)
        .focusSelector(
            settings = LocalFocusSelectorSettings.current,
        ) { isFocused.value },
    style = Cell.M.Style(),
    title = AnnotatedString("Title"),
    subtitle = AnnotatedString("Subtitle"),
    label = AnnotatedString("Label"),
    disclosureEnabled = true,
    startContent =  Icon(
        painter = painterResource(id = R.drawable.ic_plasma_16),
        contentDescription = "",
    ),
    endContent = Icon(
        painter = painterResource(id = R.drawable.ic_plasma_16),
        contentDescription = "",
    ),
    interactionSource = interactionSource,
)
```

## Стиль Cell

Стиль Cell можно настроить с помощью CellStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
CellStyle.builder()
    .colors {
        labelColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
        titleColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(),
        )
        subtitleColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
        disclosureTextColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
        disclosureIconColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(),
        )
    }
    .labelStyle(SddsServTheme.typography.bodyMNormal)
    .titleStyle(SddsServTheme.typography.bodyLNormal)
    .subtitleStyle(SddsServTheme.typography.bodyMNormal)
    .disclosureTextStyle(SddsServTheme.typography.bodyMNormal)
    .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
    .dimensions {
        contentPaddingStart(8.0.dp)
        contentPaddingEnd(8.0.dp)
    }
    .avatarStyle(Avatar.L.style())
    .iconButtonStyle(IconButton.L.Clear.style())
    .checkBoxStyle(CheckBox.M.Default.style())
    .radioBoxStyle(RadioBox.M.style())
    .switchStyle(Switch.L.style())
    .style()
```

## Cell Gravity

Выравнивание контента по вертикали возможно установить спомощью параметра gravity.

```kotlin
fun Cell(
    modifier: Modifier = Modifier,
    style: CellStyle,
    gravity: CellGravity = CellGravity.Center,
    ...
)
```

## Cell Disclosure

С помощью параметра disclosureEnabled возможно отобразить иконку "раскрытия" контента, а так же disclosureText текст - описание.

```kotlin
fun Cell(
    modifier: Modifier = Modifier,
    style: CellStyle,
    gravity: CellGravity = CellGravity.Center,
    disclosureEnabled = true,
    disclosureText = AnnotatedString("Discription"),
    ...
)
```

## Cell Content

В качестве startContent и endContent предусматривается использование функций
Avatar(),  Switch(), CheckBox(), RadioBox(), IconButton() или иконка, а так же функций из RowScope.

```kotlin
Cell(
    ...
    disclosureEnabled = true,
    startContent =  Avatar(
        painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24)
    ),
    endContent = @Composable {
        var active by remember { mutableStateOf(false) }
        Switch(active = active, onActiveChanged = { active = it })
    }
    ...
)
```
