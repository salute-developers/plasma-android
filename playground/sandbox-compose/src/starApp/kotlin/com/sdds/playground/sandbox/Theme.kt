package com.sdds.playground.sandbox

import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.core.integration.StylesProviderCompose
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsComposeStylesProvider
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsThemeWrapper
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsViewStylesProvider

internal enum class Theme(
    val compose: ThemeInfoCompose,
    val view: ThemeInfoView,
) {
    PlasmaStarDs(
        compose = ThemeInfoCompose(
            stylesProvider = StarDsComposeStylesProvider,
            themeWrapper = { StarDsThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            stylesProvider = StarDsViewStylesProvider,
            themeRes = com.sdkit.star.designsystem.R.style.Sdkit_AppTheme,
        ),
    ),
    ;

    internal class ThemeInfoCompose(
        val stylesProvider: StylesProviderCompose,
        val themeWrapper: @Composable (@Composable () -> Unit) -> Unit,
    )

    internal class ThemeInfoView(
        val stylesProvider: StylesProviderView,
        @StyleRes val themeRes: Int,
    )

    internal companion object {
        val viewDefault = PlasmaStarDs
        val composeDefault = PlasmaStarDs.compose
    }
}
