// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdkit.star.designsystem.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients
import com.sdkit.star.designsystem.theme.lightStarDsColors
import com.sdkit.star.designsystem.theme.lightStarDsGradients
import kotlin.Boolean
import kotlin.Unit

/**
 * Подтема StarDsTheme.Default
 */
@Composable
public fun StarDsTheme.Default(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit,
) {
    val colors = if (isDark) {
        darkStarDsColors()
    } else {
        lightStarDsColors()
    }
    val gradients = if (isDark) {
        darkStarDsGradients()
    } else {
        lightStarDsGradients()
    }
    StarDsTheme(colors = colors, gradients = gradients, content = content)
}
