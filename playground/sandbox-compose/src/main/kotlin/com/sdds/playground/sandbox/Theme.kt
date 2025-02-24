package com.sdds.playground.sandbox

import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.core.integration.StylesProviderCompose
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceComposeStylesProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceThemeWrapper
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceViewStylesProvider
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsComposeStylesProvider
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsThemeWrapper
import com.sdds.playground.sandbox.plasma.stards.integration.StarDsViewStylesProvider
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServComposeStylesProvider
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServThemeWrapper
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServViewStylesProvider
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteComposeStylesProvider
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteThemeWrapper
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteViewStylesProvider

internal enum class Theme(
    val compose: ThemeInfoCompose,
    val view: ThemeInfoView,
) {
    SddsServ(
        compose = ThemeInfoCompose(
            stylesProvider = SddsServComposeStylesProvider,
            themeWrapper = { SddsServThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            stylesProvider = SddsServViewStylesProvider,
            themeRes = com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight,
        ),
    ),
    PlasmaSdService(
        compose = ThemeInfoCompose(
            stylesProvider = PlasmaSdServiceComposeStylesProvider,
            themeWrapper = { PlasmaSdServiceThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            stylesProvider = PlasmaSdServiceViewStylesProvider,
            themeRes = com.sdds.plasma.sd.service.R.style.Plasma_SdService_MaterialComponents_DayNight,
        ),
    ),
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
    StylesSalute(
        compose = ThemeInfoCompose(
            stylesProvider = StylesSaluteComposeStylesProvider,
            themeWrapper = { StylesSaluteThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            stylesProvider = StylesSaluteViewStylesProvider,
            themeRes = com.sdds.stylessalute.R.style.Salute_StylesSalute_MaterialComponents_DayNight,
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
        val viewDefault = SddsServ
        val composeDefault = SddsServ.compose
    }
}
