// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.sbcom.theme.LocalSddsSbComColors
import com.sdds.sbcom.theme.LocalSddsSbComGradients
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема SddsSbComTheme.Default
 */
@Composable
public fun SddsSbComTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val currentColors = LocalSddsSbComColors.current
    val currentGradients = LocalSddsSbComGradients.current
    SddsSbComTheme(colors = currentColors, gradients = currentGradients, content = content)
}
