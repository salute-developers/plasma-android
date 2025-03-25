package com.sdds.playground.sandbox

import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsComposeComponents
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsThemeWrapper
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsViewComponents

internal enum class Theme(
    val compose: ThemeInfoCompose,
    val view: ThemeInfoView,
) {
    PlasmaStarDs(
        compose = ThemeInfoCompose(
            components = StarDsComposeComponents,
            themeWrapper = { StarDsThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            components = StarDsViewComponents,
            themeRes = com.sdkit.star.designsystem.R.style.Sdkit_AppTheme,
        ),
    ),
    ;

    internal class ThemeInfoCompose(
        val components: ComponentsProviderCompose,
        val themeWrapper: @Composable (@Composable () -> Unit) -> Unit,
    )

    internal class ThemeInfoView(
        val components: ComponentsProviderView,
        @StyleRes val themeRes: Int,
    )

    internal companion object {
        val Default = PlasmaStarDs
    }
}
