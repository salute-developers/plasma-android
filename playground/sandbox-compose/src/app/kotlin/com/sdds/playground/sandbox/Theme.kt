package com.sdds.playground.sandbox

import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import com.sdds.plasma.giga.app.theme.subthemes.Default
import com.sdds.plasma.giga.app.theme.subthemes.Inverse
import com.sdds.plasma.giga.app.theme.subthemes.OnDark
import com.sdds.plasma.giga.app.theme.subthemes.OnLight
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import com.sdds.plasma.giga.theme.subthemes.Default
import com.sdds.plasma.giga.theme.subthemes.Inverse
import com.sdds.plasma.giga.theme.subthemes.OnDark
import com.sdds.plasma.giga.theme.subthemes.OnLight
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.theme.subthemes.Default
import com.sdds.plasma.homeds.theme.subthemes.Inverse
import com.sdds.plasma.homeds.theme.subthemes.OnDark
import com.sdds.plasma.homeds.theme.subthemes.OnLight
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.theme.subthemes.Default
import com.sdds.plasma.sd.service.theme.subthemes.Inverse
import com.sdds.plasma.sd.service.theme.subthemes.OnDark
import com.sdds.plasma.sd.service.theme.subthemes.OnLight
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
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.subthemes.Default
import com.sdds.serv.theme.subthemes.Inverse
import com.sdds.serv.theme.subthemes.OnDark
import com.sdds.serv.theme.subthemes.OnLight

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
        subthemes = mapOf(
            SubTheme.DEFAULT to { SddsServTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { SddsServTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { SddsServTheme.OnDark(content = it) },
            SubTheme.INVERSE to { SddsServTheme.Inverse(content = it) },
        ),
    ),
    ThemeInfoCompose(
        theme = Theme.PlasmaSdService,
        components = PlasmaB2cComposeComponents,
        themeWrapper = { PlasmaSdServiceThemeWrapper(it) },
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaSdServiceTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaSdServiceTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaSdServiceTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaSdServiceTheme.Inverse(content = it) },
        ),
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
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaGigaTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaGigaTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaGigaTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaGigaTheme.Inverse(content = it) },
        ),
    ),
    ThemeInfoCompose(
        theme = Theme.PlasmaGigaApp,
        components = PlasmaGigaAppComposeComponents,
        themeWrapper = { PlasmaGigaAppThemeWrapper(it) },
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaGigaAppTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaGigaAppTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaGigaAppTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaGigaAppTheme.Inverse(content = it) },
        ),
    ),
    ThemeInfoCompose(
        theme = Theme.PlasmaHomeDs,
        components = PlasmaHomedsComposeComponents,
        themeWrapper = { PlasmaHomeDsThemeWrapper(it) },
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaHomeDsTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaHomeDsTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaHomeDsTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaHomeDsTheme.Inverse(content = it) },
        ),
    ),
)

internal val viewThemes: List<ThemeInfoView> = listOf(
    ThemeInfoView(
        theme = Theme.SddsServ,
        components = SddsServViewComponents,
        themeRes = com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight,
        subthemes = mapOf(
            SubTheme.DEFAULT to com.sdds.serv.R.style.Serv_Sdds_Default,
            SubTheme.ON_LIGHT to com.sdds.serv.R.style.Serv_Sdds_OnLight,
            SubTheme.ON_DARK to com.sdds.serv.R.style.Serv_Sdds_OnDark,
            SubTheme.INVERSE to com.sdds.serv.R.style.Serv_Sdds_Inverse,
        ),
    ),
    ThemeInfoView(
        theme = Theme.PlasmaSdService,
        components = PlasmaB2cViewComponents,
        themeRes = com.sdds.plasma.sd.service.R.style.Plasma_SdService_MaterialComponents_DayNight,
        subthemes = mapOf(
            SubTheme.DEFAULT to com.sdds.plasma.sd.service.R.style.Plasma_SdService_Default,
            SubTheme.ON_LIGHT to com.sdds.plasma.sd.service.R.style.Plasma_SdService_OnLight,
            SubTheme.ON_DARK to com.sdds.plasma.sd.service.R.style.Plasma_SdService_OnDark,
            SubTheme.INVERSE to com.sdds.plasma.sd.service.R.style.Plasma_SdService_Inverse,
        ),
    ),
    ThemeInfoView(
        theme = Theme.StylesSalute,
        components = StylesSaluteViewComponents,
        themeRes = com.sdds.stylessalute.R.style.Salute_StylesSalute_MaterialComponents_DayNight,
    ),
)
