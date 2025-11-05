---
title: TabBar
---

Компонент для навигации между разделами интерфейса.
В компоненте доступно отображение максимум 10 табов.
В качестве контента ожидает [TabItem](#tabitem) либо [IconTabItem](#icontabitem).

```kotlin
var selectedTab by remember { mutableIntStateOf(0) }
Tabs(
    style = TabsDefault.L.Horizontal.style(),
    selectedTabIndex = selectedTab,
    clip = TabsClip.Scroll,
    orientation = TabsOrientation.Horizontal,
    onTabClicked = {
        selectedTab = it
    },
    clip = TabsClip.Scroll,
) {
    repeat(5) { index ->
        val label = "Label$index"
        tab(dropdownAlias = label) { selected ->
            TabItem(
                isSelected = selected,
                label = label,
                helpText = "HelpText",
                count = "2",
                startContent = { 
                    Icon(
                        painter = painterResource(com.sdds.icons.R.drawable.ic_plasma_24),
                        contentDescription = "",
                    )
                },
                actionIcon = com.sdds.icons.R.drawable.ic_close_24,
                onActionClicked = {},
            )
        }
    }
}
```

## TabsClip

Способ расположения табов. Возможные значения: 
- **None** - табы размещаются как есть. Непоместившиеся табы уйдут за границу контейнера.
- **ShowMore** - табы размещаются, пока есть место в контейнере. Если все табы не помещаются, отображается disclosure-кнопка, по нажатию которой открывается список с непоместившимися табами.
- **Scroll** - табы размещаются в скроллящемся контейнере

## TabsOrientation

Ориентация табов. Возможные значения:
- **Vertical** - табы размещаются вертикально
- **Horizontal** - табы размещаются горизонтально

## Стиль Tabs

Для Tabs существует набор сгенерированных стилей. Также стиль можно настроить с помощью TabsStyle.builder().

### Создание стиля с помощью builder()

```kotlin
TabsStyle.builder()
    .colors {
        indicatorColor(
            {{ docs-theme-codeReference }}.colors.surfaceDefaultSolidDefault.asInteractive(),
        )
        overflowNextIconColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        overflowPrevIconColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asInteractive(),
        )
        disclosureColor(
            {{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive(
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryActive,
            ),
        )
    }
    .dimensions {
        indicatorThickness(2.0.dp)
        minSpacing(0.0.dp)
        minHeight(68.dp)
    }
    .orientation(TabsOrientation.Vertical)
    .dividerStyle(Divider.Default.style())
    .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
    .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
    .dividerEnabled(true)
    .indicatorEnabled(true)
    .dropdownMenuStyle(DropdownMenuNormal.L.style())
    .disclosureTextStyle({{ docs-theme-codeReference }}.typography.bodyLBold)
    .tabItemStyle(TabItemDefault.L.Vertical.style())
    .overflowNextIcon(com.sdds.icons.R.drawable.ic_disclosure_down_outline_24)
    .overflowPrevIcon(com.sdds.icons.R.drawable.ic_disclosure_up_outline_24)
    .style()
```

## TabItem

Элемент Tabs. При использовании в Tabs TabItem стилизуется автоматически. Также можно настроить стиль элемента с помощью TabItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
TabItemStyle.builder()
    .colors {
        labelColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryActive,
                setOf(
                    InteractiveState.Selected,
                    InteractiveState.Hovered,
                )
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryHover,
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        valueColor(
            {{ docs-theme-codeReference }}.colors.textDefaultTertiary.asStatefulValue(
                setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(
                    InteractiveState.Selected,
                    InteractiveState.Hovered,
                )
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultTertiaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultTertiaryActive,
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondary,
            ),
        )
        startContentColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryActive,
                setOf(
                    InteractiveState.Selected,
                    InteractiveState.Hovered,
                )
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryHover,
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        endContentColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryActive,
                setOf(
                    InteractiveState.Selected,
                    InteractiveState.Hovered,
                )
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryHover,
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        actionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
            ),
        )
    }
    .disableAlpha(0.4f)
    .labelStyle({{ docs-theme-codeReference }}.typography.bodyLBold)
    .valueStyle({{ docs-theme-codeReference }}.typography.bodyLBold)
    .dimensions {
        paddingStart(0.0.dp)
        paddingEnd(0.0.dp)
        minHeight(56.0.dp)
        startContentSize(24.0.dp)
        endContentSize(24.0.dp)
        counterPadding(8.0.dp)
        valuePadding(8.0.dp)
        actionPadding(10.0.dp)
    }
    .counterStyle(Counter.S.Accent.style())
    .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
    .style()
```

## IconTabItem

Элемент Tabs. При использовании в Tabs IconTabItem стилизуется автоматически. Также можно настроить стиль элемента с помощью TabItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
TabItemStyle.builder()
    .colors {
        startContentColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryActive,
                setOf(
                    InteractiveState.Selected,
                    InteractiveState.Hovered,
                )
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryHover,
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        endContentColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryActive,
                setOf(
                    InteractiveState.Selected,
                    InteractiveState.Hovered,
                )
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimaryHover,
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
                setOf(InteractiveState.Selected)
                        to {{ docs-theme-codeReference }}.colors.textDefaultPrimary,
            ),
        )
        actionColor(
            {{ docs-theme-codeReference }}.colors.textDefaultSecondary.asStatefulValue(
                setOf(InteractiveState.Hovered)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryHover,
                setOf(InteractiveState.Pressed)
                        to {{ docs-theme-codeReference }}.colors.textDefaultSecondaryActive,
            ),
        )
    }
    .disableAlpha(0.4f)
    .dimensions {
        minHeight(56.0.dp)
        paddingStart(18.0.dp)
        paddingEnd(18.0.dp)
        startContentSize(24.0.dp)
        endContentSize(24.0.dp)
        actionPadding(10.0.dp)
        counterPadding(0.0.dp)
        counterOffsetX(8.0.dp)
        counterOffsetY(8.0.dp)
    }
    .counterStyle(Counter.Xs.Negative.style())
    .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
    .style()
```
