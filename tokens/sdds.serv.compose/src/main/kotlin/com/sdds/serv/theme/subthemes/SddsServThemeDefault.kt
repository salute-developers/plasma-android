// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.serv.theme.LocalSddsServColors
import com.sdds.serv.theme.LocalSddsServGradients
import com.sdds.serv.theme.SddsServTheme
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
    val currentColors = LocalSddsServColors.current
    val currentGradients = LocalSddsServGradients.current
    SddsServTheme(colors = currentColors, gradients = currentGradients, content = content)
}
