---
title: Wheel
---

Вертикальное колесо выбора. 
Используется для выбора одного значения из списка с визуальным фокусом на текущем значении.

```kotlin
Wheel(
    style = Wheel.H1.MixedAlign.style(),
    wheelCount = 2,
    visibleItemsCount = 3,
    onItemSelected = { wheelIndex, itemIndex ->
        println("item selected: $itemIndex in wheel $wheelIndex")
    },
) { wheelIndex ->
    WheelDataSet(
        dataSet = List(10) {
            WheelItemData(
                text = "Label$it",
                textAfter = "TA$it",
            )
        },
        description = wheelUiState.description,
    )
}
```

## Стиль Wheel

Стиль Wheel можно настроить с помощью WheelStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
WheelStyle.builder()
    .controlIconUp(com.sdds.icons.R.drawable.ic_disclosure_up_outline_36)
    .controlIconDown(com.sdds.icons.R.drawable.ic_disclosure_down_outline_36)
    .wheelCount(3)
    .visibleItemsCount(3)
    .colors {
        itemTextColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        itemTextAfterColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        descriptionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
        controlIconUpColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(
                setOf(InteractiveState.Focused)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        controlIconDownColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(
                setOf(InteractiveState.Focused)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        separatorColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(),
        )
    }
    .itemTextStyle({{ docs-theme-codeReference }}.typography.headerH1Bold)
    .itemTextAfterStyle({{ docs-theme-codeReference }}.typography.headerH1Bold)
    .descriptionStyle({{ docs-theme-codeReference }}.typography.bodySBold)
    .dimensions {
        itemTextAfterPadding(2.0.dp)
        descriptionPadding(8.0.dp)
        separatorSpacing(40.0.dp)
        itemMinSpacing(20.0.dp)
    }
    .itemAlignment(WheelAlignment.Center)
    .style()
```
