// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.compose.sandbox.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.sandbox.theme.darkSddsSandboxColors
import com.sdds.compose.sandbox.theme.darkSddsSandboxGradients
import com.sdds.compose.sandbox.theme.lightSddsSandboxColors
import com.sdds.compose.sandbox.theme.lightSddsSandboxGradients
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема SddsSandboxTheme.Default
 */
@Composable
public fun SddsSandboxTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val colors = if (isDark) {
        darkSddsSandboxColors()
    } else {
        lightSddsSandboxColors()
    }
    val gradients = if (isDark) {
        darkSddsSandboxGradients()
    } else {
        lightSddsSandboxGradients()
    }
    SddsSandboxTheme(colors = colors, gradients = gradients, content = content)
}
