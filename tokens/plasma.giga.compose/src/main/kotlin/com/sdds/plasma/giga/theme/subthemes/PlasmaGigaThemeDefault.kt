// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import com.sdds.plasma.giga.theme.darkPlasmaGigaColors
import com.sdds.plasma.giga.theme.darkPlasmaGigaGradients
import com.sdds.plasma.giga.theme.lightPlasmaGigaColors
import com.sdds.plasma.giga.theme.lightPlasmaGigaGradients
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема PlasmaGigaTheme.Default
 */
@Composable
public fun PlasmaGigaTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val colors = if (isDark) {
        darkPlasmaGigaColors()
    } else {
        lightPlasmaGigaColors()
    }
    val gradients = if (isDark) {
        darkPlasmaGigaGradients()
    } else {
        lightPlasmaGigaGradients()
    }
    PlasmaGigaTheme(colors = colors, gradients = gradients, content = content)
}
