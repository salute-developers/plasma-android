// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdkit.star.designsystem.theme.subthemes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.sdkit.star.designsystem.theme.LocalStarDsColors
import com.sdkit.star.designsystem.theme.LocalStarDsGradients
import com.sdkit.star.designsystem.theme.StarDsTheme
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
    val currentColors = LocalStarDsColors.current
    val currentGradients = LocalStarDsGradients.current
    StarDsTheme(colors = currentColors, gradients = currentGradients, content = content)
}
