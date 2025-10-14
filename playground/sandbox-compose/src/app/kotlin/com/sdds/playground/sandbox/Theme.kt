package com.sdds.playground.sandbox

import com.sdds.playground.sandbox.plasma.giga.app.integration.PlasmaGigaAppThemeWrapper
import com.sdds.playground.sandbox.plasma.giga.app.integration.compose.PlasmaGigaAppComposeComponents
import com.sdds.playground.sandbox.plasma.giga.integration.PlasmaGigaThemeWrapper
import com.sdds.playground.sandbox.plasma.giga.integration.compose.PlasmaGigaComposeComponents
import com.sdds.playground.sandbox.plasma.homeds.integration.PlasmaHomeDsThemeWrapper
import com.sdds.playground.sandbox.plasma.homeds.integration.compose.PlasmaHomedsComposeComponents
import com.sdds.playground.sandbox.plasma.sd.service.integration.PlasmaSdServiceThemeWrapper
import com.sdds.playground.sandbox.plasma.sd.service.integration.compose.PlasmaB2cComposeComponents
import com.sdds.playground.sandbox.plasma.sd.service.integration.view.PlasmaB2cViewComponents
import com.sdds.playground.sandbox.sdds.serv.integration.SddsServThemeWrapper
import com.sdds.playground.sandbox.sdds.serv.integration.compose.SddsServComposeComponents
import com.sdds.playground.sandbox.sdds.serv.integration.view.SddsServViewComponents
import com.sdds.playground.sandbox.stylessalute.integration.StylesSaluteThemeWrapper
import com.sdds.playground.sandbox.stylessalute.integration.compose.StylesSaluteComposeComponents
import com.sdds.playground.sandbox.stylessalute.integration.view.StylesSaluteViewComponents

internal enum class Theme {
    SddsServ,
    PlasmaSdService,
    StylesSalute,
    PlasmaGiga,
    PlasmaGigaApp,
    PlasmaHomeDs,
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
        components = PlasmaB2cComposeComponents,
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
    ThemeInfoCompose(
        theme = Theme.PlasmaGigaApp,
        components = PlasmaGigaAppComposeComponents,
        themeWrapper = { PlasmaGigaAppThemeWrapper(it) },
    ),
    ThemeInfoCompose(
        theme = Theme.PlasmaHomeDs,
        components = PlasmaHomedsComposeComponents,
        themeWrapper = { PlasmaHomeDsThemeWrapper(it) },
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
        components = PlasmaB2cViewComponents,
        themeRes = com.sdds.plasma.sd.service.R.style.Plasma_SdService_MaterialComponents_DayNight,
    ),
    ThemeInfoView(
        theme = Theme.StylesSalute,
        components = StylesSaluteViewComponents,
        themeRes = com.sdds.stylessalute.R.style.Salute_StylesSalute_MaterialComponents_DayNight,
    ),
)
