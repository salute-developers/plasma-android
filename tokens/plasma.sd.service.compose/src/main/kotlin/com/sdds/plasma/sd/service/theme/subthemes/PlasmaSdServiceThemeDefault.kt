// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceGradients
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема PlasmaSdServiceTheme.Default
 */
@Composable
public fun PlasmaSdServiceTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (isDark) {
        darkPlasmaSdServiceColors()
    } else {
        lightPlasmaSdServiceColors()
    }
    val gradients = if (isDark) {
        darkPlasmaSdServiceGradients()
    } else {
        lightPlasmaSdServiceGradients()
    }
    PlasmaSdServiceTheme(colors = colors, gradients = gradients, content = content)
}
