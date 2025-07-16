# Package com.sdds.compose.uikit

## SegmentItem

```kotlin
SegmentItem(
    isSelected = true,
    style = SegmentItem.Xl.Primary.style(),
    label = "Label",
    value = "Value",
    startIcon =  painterResource(id = R.drawable.ic_scribble_diagonal_24),
    counter = "55",
    enabled = true
)
```

## Стиль SegmentItem

Стиль SegmentItem можно настроить с помощью SegmentItemStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
SegmentItemStyle.builder()
    .colors {
        labelColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(
                setOf(InteractiveState.Hovered)
                    to SddsServTheme.colors.textDefaultPrimaryHover,
                ...
            ),
        )
        valueColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(
                setOf(InteractiveState.Hovered)
                    to SddsServTheme.colors.textDefaultSecondaryHover,
                ...
            ),
        )
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                setOf(InteractiveState.Hovered)
                    to SddsServTheme.colors.surfaceDefaultClearHover,
                ...
            ),
        )
        startContentColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(
                setOf(InteractiveState.Hovered)
                    to SddsServTheme.colors.textDefaultPrimaryHover,
                ...
            ),
        )
        endContentColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(
                setOf(InteractiveState.Hovered)
                    to SddsServTheme.colors.textDefaultPrimaryHover,
                ...
            ),
        )
    }
    .shape(SddsServTheme.shapes.roundL.adjustBy(all = 0.0.dp))
    .labelStyle(SddsServTheme.typography.bodyLBold)
    .valueStyle(SddsServTheme.typography.bodyLBold)
    .dimensions {
        minWidth(110.0.dp)
        minHeight(64.0.dp)
        paddingStart(28.0.dp)
        paddingEnd(28.0.dp)
        startContentSize(24.0.dp)
        endContentSize(24.0.dp)
        valueMargin(6.0.dp)
    }
    .counterStyle(Counter.S.Accent.style())
    .style()
```
