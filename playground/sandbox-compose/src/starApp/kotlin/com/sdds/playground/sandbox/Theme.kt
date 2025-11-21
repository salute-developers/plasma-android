package com.sdds.playground.sandbox

import com.sdds.playground.sandbox.plasma.stards.integration.StarDsThemeWrapper
import com.sdds.playground.sandbox.plasma.stards.integration.compose.PlasmaStardsComposeComponents
import com.sdds.playground.sandbox.plasma.stards.integration.view.PlasmaStardsViewComponents
import com.sdkit.star.designsystem.theme.StarDsTheme
import com.sdkit.star.designsystem.theme.subthemes.Default
import com.sdkit.star.designsystem.theme.subthemes.Inverse
import com.sdkit.star.designsystem.theme.subthemes.OnDark
import com.sdkit.star.designsystem.theme.subthemes.OnLight

internal enum class Theme {
    PlasmaStarDs,
    ;

    internal companion object {
        val Default = PlasmaStarDs
    }
}

internal val composeThemes: List<ThemeInfoCompose> = listOf(
    ThemeInfoCompose(
        theme = Theme.PlasmaStarDs,
        components = PlasmaStardsComposeComponents,
        themeWrapper = { StarDsThemeWrapper(it) },
        subthemes = mapOf(
            SubTheme.DEFAULT to { StarDsTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { StarDsTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { StarDsTheme.OnDark(content = it) },
            SubTheme.INVERSE to { StarDsTheme.Inverse(content = it) },
        ),
    ),
)

internal val viewThemes: List<ThemeInfoView> = listOf(
    ThemeInfoView(
        theme = Theme.PlasmaStarDs,
        components = PlasmaStardsViewComponents,
        themeRes = com.sdkit.star.designsystem.R.style.Sdkit_AppTheme,
        subthemes = mapOf(
            SubTheme.DEFAULT to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_Default,
            SubTheme.ON_LIGHT to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_OnLight,
            SubTheme.ON_DARK to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_OnDark,
            SubTheme.INVERSE to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_Inverse,
        ),
    ),
)
