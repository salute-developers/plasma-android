---
title: Accordion
---
Вертикальный список с возможностью показать или скрыть связанный компонент.

В качестве контента ожидает AccordionItem и [Divider](DividerUsage.md#divider), стилизует их автоматически. 

```kotlin
Accordion(style = AccordionSolidActionStart.H3.style()) {
    repeat(4) {
        var opened by remember { mutableStateOf(false) }
        AccordionItem(
            opened = opened,
            onClick = { opened = !opened },
            title = "Title $it",
        ) { Text(text = "Content text $it") }
    }
}
```

## Стиль Accordion и AccordionItem

Для Accordion и AccordionItem существует набор сгенерированных стилей. 
Также стиль можно настроить с помощью AccordionStyle.builder() и AccordionItemStyle.builder().

### Создание стиля AccordionItemStyle с помощью builder()

```kotlin
AccordionItemStyle.builder()
    .iconPlacement(AccordionIconPlacement.End)
    .iconRotation(90.0f)
    .shape({{ docs-theme-codeReference }}.shapes.roundS)
    .titleStyle({{ docs-theme-codeReference }}.typography.bodyXsBold)
    .contentTextStyle({{ docs-theme-codeReference }}.typography.bodyXsNormal)
    .colors {
        backgroundColor({{ docs-theme-codeReference }}.colors.surfaceDefaultSolidCard.asInteractive())
        titleColor({{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive())
        contentTextColor({{ docs-theme-codeReference }}.colors.textDefaultPrimary.asInteractive())
    }
    .dimensions {
        contentPaddingStart(12.0.dp)
        contentPaddingEnd(12.0.dp)
        contentPaddingBottom(10.0.dp)
        paddingStart(12.0.dp)
        paddingEnd(12.0.dp)
        paddingTop(8.0.dp)
        paddingBottom(8.0.dp)
        iconPadding(10.0.dp)
    }
    .iconClosed(painterResource(com.sdds.icons.R.drawable.ic_plus_16))
    .iconOpened(painterResource(com.sdds.icons.R.drawable.ic_minus_16))
    .style()
```

### Создание стиля AccordionStyle с помощью builder()

```kotlin
AccordionStyle.builder()
    .accordionItemStyle(AccordionItemStyle.builder().style())
    .dividerStyle(DividerStyle.builder().style())
    .dimensions {
        itemSpacing(4.0.dp)
    }
    .style()
```
