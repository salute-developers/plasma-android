package com.sdds.playground.sandbox

import com.sdds.playground.sandbox.plasma.giga.integration.PlasmaGigaComposeComponents
import com.sdds.playground.sandbox.plasma.giga.integration.PlasmaGigaThemeWrapper
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceComposeComponents
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceThemeWrapper
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceViewComponents
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServComposeComponents
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServThemeWrapper
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServViewComponents
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteComposeComponents
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteThemeWrapper
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteViewComponents

internal enum class Theme {
    SddsServ,
    PlasmaSdService,
    StylesSalute,
    PlasmaGiga,
    ;

    internal companion object {
        val Default = SddsServ
    }
}

internal val composeThemes: List<ThemeInfoCompose> = listOf(
    ThemeInfoCompose(
        theme = Theme.SddsServ,
        components = SddsServComposeComponents,
        themeWrapper = { SddsServThemeWrapper(it) },
    ),
    ThemeInfoCompose(
        theme = Theme.PlasmaSdService,
        components = PlasmaSdServiceComposeComponents,
        themeWrapper = { PlasmaSdServiceThemeWrapper(it) },
    ),
    ThemeInfoCompose(
        theme = Theme.StylesSalute,
        components = StylesSaluteComposeComponents,
        themeWrapper = { StylesSaluteThemeWrapper(it) },
    ),
    ThemeInfoCompose(
        theme = Theme.PlasmaGiga,
        components = PlasmaGigaComposeComponents,
        themeWrapper = { PlasmaGigaThemeWrapper(it) },
    ),
)

internal val viewThemes: List<ThemeInfoView> = listOf(
    ThemeInfoView(
        theme = Theme.SddsServ,
        components = SddsServViewComponents,
        themeRes = com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight,
    ),
    ThemeInfoView(
        theme = Theme.PlasmaSdService,
        components = PlasmaSdServiceViewComponents,
        themeRes = com.sdds.plasma.sd.service.R.style.Plasma_SdService_MaterialComponents_DayNight,
    ),
    ThemeInfoView(
        theme = Theme.StylesSalute,
        components = StylesSaluteViewComponents,
        themeRes = com.sdds.stylessalute.R.style.Salute_StylesSalute_MaterialComponents_DayNight,
    ),
)
