package com.sdds.playground.sandbox

import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceComposeComponents
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceThemeWrapper
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceViewComponents
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServComposeComponents
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServThemeWrapper
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServViewComponents
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteComposeComponents
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteThemeWrapper
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteViewComponents

internal enum class Theme(
    val compose: ThemeInfoCompose,
    val view: ThemeInfoView,
) {
    SddsServ(
        compose = ThemeInfoCompose(
            components = SddsServComposeComponents,
            themeWrapper = { SddsServThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            components = SddsServViewComponents,
            themeRes = com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight,
        ),
    ),
    PlasmaSdService(
        compose = ThemeInfoCompose(
            components = PlasmaSdServiceComposeComponents,
            themeWrapper = { PlasmaSdServiceThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            components = PlasmaSdServiceViewComponents,
            themeRes = com.sdds.plasma.sd.service.R.style.Plasma_SdService_MaterialComponents_DayNight,
        ),
    ),
    StylesSalute(
        compose = ThemeInfoCompose(
            components = StylesSaluteComposeComponents,
            themeWrapper = { StylesSaluteThemeWrapper(it) },
        ),
        view = ThemeInfoView(
            components = StylesSaluteViewComponents,
            themeRes = com.sdds.stylessalute.R.style.Salute_StylesSalute_MaterialComponents_DayNight,
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
        val Default = SddsServ
    }
}
