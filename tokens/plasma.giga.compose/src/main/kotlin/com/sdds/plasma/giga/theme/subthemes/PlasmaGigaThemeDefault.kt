// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.giga.theme.LocalPlasmaGigaColors
import com.sdds.plasma.giga.theme.LocalPlasmaGigaGradients
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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
    val currentColors = LocalPlasmaGigaColors.current
    val currentGradients = LocalPlasmaGigaGradients.current
    PlasmaGigaTheme(colors = currentColors, gradients = currentGradients, content = content)
}
