// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.compose.sandbox.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.theme.LocalSddsSandboxColors
import com.sdds.compose.sandbox.theme.LocalSddsSandboxGradients
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
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
    val currentColors = LocalSddsSandboxColors.current
    val currentGradients = LocalSddsSandboxGradients.current
    SddsSandboxTheme(colors = currentColors, gradients = currentGradients, content = content)
}
