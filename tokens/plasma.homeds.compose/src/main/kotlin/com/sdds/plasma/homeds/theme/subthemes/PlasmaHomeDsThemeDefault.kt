// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.homeds.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.homeds.theme.LocalPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.LocalPlasmaHomeDsGradients
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема PlasmaHomeDsTheme.Default
 */
@Composable
public fun PlasmaHomeDsTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val currentColors = LocalPlasmaHomeDsColors.current
    val currentGradients = LocalPlasmaHomeDsGradients.current
    PlasmaHomeDsTheme(colors = currentColors, gradients = currentGradients, content = content)
}
