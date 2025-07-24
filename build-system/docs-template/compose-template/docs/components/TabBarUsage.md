---
title: TabBar
---

Компонент для навигации между разделами интерфейса
В качестве контента принимает либо [TabBarItem](#tabbaritem) либо произвольный контент.
В качестве extra ожидает [Counter](CounterUsage.md), [Badge](BadgeUsage.md), [Indicator](IndicatorUsage.md) либо произвольный контент.

```kotlin
TabBar(style = TabBarHasLabelSolid.L.Divider.Rounded.Default.style()) {
    tabBarViewModel.items.map {
        tabItem {
            TabBarItem(
                isSelected = tabBarViewModel.isSelected(it.id),
                defaultIcon = R.drawable.ic_smile_outline_36,
                selectedIcon = R.drawable.ic_smile_fill_36,
                label = "Label $it",
                extra = getExtra(uiState.extraType),
                onClick = {
                    tabBarViewModel.onSelect(it.id)
                },
            )
        }
    }
}
```

## Стиль TabBar

Для TabBar существует набор сгенерированных стилей. Также стиль можно настроить с помощью TabBarStyle.builder().

### Создание стиля с помощью builder()

```kotlin
TabBarStyle.builder()
    .tabBarItemStyle(TabBarItemSolid.M.Label.Default.style())
    .topShape(CircleShape)
    .shadow({{ docs-theme-codeReference }}.shadows.upSoftM)
    .colors {
        backgroundColor({{ docs-theme-codeReference }}.colors.surfaceDefaultSolidCard)
    }
    .dimensions {
        paddingStart(8.dp)
        paddingEnd(8.dp)
        contentPaddingStart(2.0.dp)
        contentPaddingEnd(2.0.dp)
        contentPaddingTop(2.0.dp)
        contentPaddingBottom(2.0.dp)
        itemSpacing(2.0.dp)
    }
    .style()
```

## TabBarItem

Элемент панели навигации TabBar. При использовании в TabBar TabBarItem стилизуется автоматически. Также можно настроить стиль элемента с помощью TabBarItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
TabBarItemStyle.builder()
    .shape({{ docs-theme-codeReference }}.shapes.roundL)
    .labelStyle({{ docs-theme-codeReference }}.typography.bodyMNormal)
    .labelPlacement(TabBarLabelPlacement.Bottom)
    .colors {
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultClear.asStatefulValue(
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault,
            ),
        )
        labelColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textInversePrimary,
            ),
        )
        iconColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textInversePrimary,
            ),
        )
    }
    .dimensions {
        paddingTop(10.dp)
        paddingBottom(10.dp)
        iconSize(32.dp)
        minHeight(48.dp)
        labelPadding(2.dp)
    }
    .counterStyle(Counter.Xs.Negative.style())
    .badgeStyle(BadgeSolid.Xs.Pilled.Negative.style())
    .indicatorStyle(Indicator.S.Negative.style()
    .style()
```
