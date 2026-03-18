// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.sbcom.theme.SddsSbComTheme
import com.sdds.sbcom.theme.darkSddsSbComColors
import com.sdds.sbcom.theme.darkSddsSbComGradients
import com.sdds.sbcom.theme.lightSddsSbComColors
import com.sdds.sbcom.theme.lightSddsSbComGradients
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
    val colors = if (isDark) {
        darkSddsSbComColors()
    } else {
        lightSddsSbComColors()
    }
    val gradients = if (isDark) {
        darkSddsSbComGradients()
    } else {
        lightSddsSbComGradients()
    }
    SddsSbComTheme(colors = colors, gradients = gradients, content = content)
}
