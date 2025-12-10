// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.darkSddsServGradients
import com.sdds.serv.theme.lightSddsServColors
import com.sdds.serv.theme.lightSddsServGradients
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема SddsServTheme.Default
 */
@Composable
public fun SddsServTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val colors = if (isDark) {
        darkSddsServColors()
    } else {
        lightSddsServColors()
    }
    val gradients = if (isDark) {
        darkSddsServGradients()
    } else {
        lightSddsServGradients()
    }
    SddsServTheme(colors = colors, gradients = gradients, content = content)
}
