package com.sdds.playground.sandbox

import com.sdds.playground.sandbox.plasma.stards.integration.StarDsThemeWrapper
import com.sdds.playground.sandbox.plasma.stards.integration.compose.PlasmaStardsComposeComponents
import com.sdds.playground.sandbox.plasma.stards.integration.view.PlasmaStardsViewComponents

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
    ),
)

internal val viewThemes: List<ThemeInfoView> = listOf(
    ThemeInfoView(
        theme = Theme.PlasmaStarDs,
        components = PlasmaStardsViewComponents,
        themeRes = com.sdkit.star.designsystem.R.style.Sdkit_AppTheme,
    ),
)
