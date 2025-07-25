---
title: Counter
--- 

Компонент Counter - по сути небольшого размера Badge для отображения числовых значений (счетчик).
Параметр count может быть формата String, AnnotatedString, а так же composable лямбдой.

```kotlin
 Counter(
    style = Counter.L.Default.style(),
    count = "1",
)
        
```

## Стиль Counter

Стиль Counter можно настроить с помощью CounterStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
CounterStyle.builder()
    .colors {
        backgroundColor(
            {{ docs-theme-codeReference }}.colors.surfaceOnDarkSolidDefault.asInteractive(
                setOf(InteractiveState.Pressed)
                    to {{ docs-theme-codeReference }}.colors.surfaceOnDarkSolidDefaultActive,
                setOf(InteractiveState.Hovered)
                    to {{ docs-theme-codeReference }}.colors.surfaceOnDarkSolidDefaultHover,
            ),
        )
        textColor(
            {{ docs-theme-codeReference }}.colors.textOnLightPrimary.asInteractive(
                setOf(InteractiveState.Pressed)
                    to {{ docs-theme-codeReference }}.colors.textOnLightPrimaryActive,
                setOf(InteractiveState.Hovered)
                    to {{ docs-theme-codeReference }}.colors.textOnLightPrimaryHover,
            ),
        )
    }
    .textStyle({{ docs-theme-codeReference }}.typography.bodySNormal)
    .dimensions {
        minHeight(28.0.dp)
        minWidth(28.0.dp)
        paddingStart(10.0.dp)
        paddingEnd(10.0.dp)
    }
    .style()
```
