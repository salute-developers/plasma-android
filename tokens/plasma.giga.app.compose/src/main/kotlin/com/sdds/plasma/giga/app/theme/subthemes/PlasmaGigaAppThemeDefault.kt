// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.app.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import com.sdds.plasma.giga.app.theme.darkPlasmaGigaAppColors
import com.sdds.plasma.giga.app.theme.darkPlasmaGigaAppGradients
import com.sdds.plasma.giga.app.theme.lightPlasmaGigaAppColors
import com.sdds.plasma.giga.app.theme.lightPlasmaGigaAppGradients
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема PlasmaGigaAppTheme.Default
 */
@Composable
public fun PlasmaGigaAppTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val colors = if (isDark) {
        darkPlasmaGigaAppColors()
    } else {
        lightPlasmaGigaAppColors()
    }
    val gradients = if (isDark) {
        darkPlasmaGigaAppGradients()
    } else {
        lightPlasmaGigaAppGradients()
    }
    PlasmaGigaAppTheme(colors = colors, gradients = gradients, content = content)
}
