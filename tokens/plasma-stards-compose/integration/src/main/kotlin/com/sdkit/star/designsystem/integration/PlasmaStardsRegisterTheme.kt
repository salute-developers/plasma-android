package com.sdkit.star.designsystem.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.darkStarDsColors
import com.sdkit.star.designsystem.theme.darkStarDsGradients
import com.sdkit.star.designsystem.theme.lightStarDsColors
import com.sdkit.star.designsystem.theme.lightStarDsGradients
import com.sdkit.star.designsystem.theme.subthemes.Default
import com.sdkit.star.designsystem.theme.subthemes.Inverse
import com.sdkit.star.designsystem.theme.subthemes.OnDark
import com.sdkit.star.designsystem.theme.subthemes.OnLight

fun SandboxActivity.registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "PlasmaStards",
        components = PlasmaStardsComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            StarDsTheme(
                colors = if (isDark) darkStarDsColors() else lightStarDsColors(),
                gradients = if (isDark) darkStarDsGradients() else lightStarDsGradients(),
            ) {
                it()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { StarDsTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { StarDsTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { StarDsTheme.OnDark(content = it) },
            SubTheme.INVERSE to { StarDsTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
