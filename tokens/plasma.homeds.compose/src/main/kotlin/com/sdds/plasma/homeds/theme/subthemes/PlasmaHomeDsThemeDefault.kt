// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.homeds.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsGradients
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsGradients
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
    val colors = if (isDark) {
        darkPlasmaHomeDsColors()
    } else {
        lightPlasmaHomeDsColors()
    }
    val gradients = if (isDark) {
        darkPlasmaHomeDsGradients()
    } else {
        lightPlasmaHomeDsGradients()
    }
    PlasmaHomeDsTheme(colors = colors, gradients = gradients, content = content)
}
