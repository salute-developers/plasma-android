package com.sdds.playground.sandbox.core.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param enabled доступен ли переключатель
 */
@Composable
fun SandboxSwitch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    enabled: Boolean = true,
) {
    BaseSwitch(
        active = active,
        modifier = modifier,
        enabled = enabled,
        onActiveChanged = onActiveChanged,
    )
}

/**
 * Превью [SandboxSwitch]
 */
@Composable
@Preview(showBackground = true)
fun SandboxSwitchPreview() {
    DefaultTheme {
        SandboxSwitch(active = true)
    }
}
