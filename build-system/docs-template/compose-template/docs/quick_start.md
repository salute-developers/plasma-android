---
id: quick_start
title: Быстрый старт
sidebar_position: 1
slug: /
---

1. Добавить в build.gradle файл следующие зависимости
```kotlin
implementation("io.github.salute-developers:{{ docs-artifactId }}:{{ docs-artifactVersion }}")
implementation("io.github.salute-developers:sdds-uikit-compose:{{ docs-uikitComposeVersion }}")
```
Дополнительно, если Вам нужен набор иконок:
```kotlin
implementation("io.github.salute-developers:sdds-icons:{{ docs-iconsVersion }}")
```

2. Добавить в тему вашего приложения тему `{{ docs-theme-codeReference }}`, например:
```kotlin
private val DarkColors = dark{{ docs-theme-prefix }}Colors()
private val LightColors = light{{ docs-theme-prefix }}Colors()
private val DarkGradients = dark{{ docs-theme-prefix }}Gradients()
private val LightGradients = light{{ docs-theme-prefix }}Gradients()

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
    {{ docs-theme-codeReference }}(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = content,
    )
}
```

3. Готово