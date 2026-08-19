// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.finai.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdds.finai.theme.LocalSddsFinAiColors
import com.sdds.finai.theme.LocalSddsFinAiGradients
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема SddsFinAiTheme.Default
 */
@Composable
public fun SddsFinAiTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val currentColors = LocalSddsFinAiColors.current
    val currentGradients = LocalSddsFinAiGradients.current
    SddsFinAiTheme(colors = currentColors, gradients = currentGradients, content = content)
}
