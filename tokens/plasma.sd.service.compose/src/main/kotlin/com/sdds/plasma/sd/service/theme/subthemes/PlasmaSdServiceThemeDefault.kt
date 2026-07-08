// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.sd.service.theme.LocalPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.LocalPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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
    val currentColors = LocalPlasmaSdServiceColors.current
    val currentGradients = LocalPlasmaSdServiceGradients.current
    PlasmaSdServiceTheme(colors = currentColors, gradients = currentGradients, content = content)
}
