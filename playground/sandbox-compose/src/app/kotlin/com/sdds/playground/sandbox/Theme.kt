package com.sdds.playground.sandbox

import android.util.Log
import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
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

internal class ThemeInfoCompose(
    val theme: Theme,
    val components: ComponentsProviderCompose,
    val themeWrapper: @Composable (@Composable () -> Unit) -> Unit,
)

internal class ThemeInfoView(
    val theme: Theme,
    val components: ComponentsProviderView,
    @StyleRes val themeRes: Int,
)


internal object ThemeContainer {

    private val composeThemes: Set<ThemeInfoCompose> = setOf(
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

    private val viewThemes: Set<ThemeInfoView> = setOf(
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

    internal fun composeTheme(theme: Theme): ThemeInfoCompose =
        composeThemes.firstOrNull { it.theme == theme }
            ?: composeThemes
                .firstOrNull { it.theme == Theme.Default }
                .also {
                    Log.e(
                        "Sdds sandbox",
                        "Compose theme $theme not found, default theme ${Theme.Default} will be used",
                    )
                }
            ?: throw NoSuchElementException("Compose theme not found")

    internal fun viewTheme(theme: Theme): ThemeInfoView =
        viewThemes.firstOrNull { it.theme == theme }
            ?: viewThemes
                .firstOrNull { it.theme == Theme.Default }
                .also {
                    Log.e(
                        "Sdds sandbox",
                        "View theme $theme not found, default theme ${Theme.Default} will be used",
                    )
                }
            ?: throw NoSuchElementException("View theme not found")

    internal val allComposeThemes: List<Theme>
        get() = composeThemes.toList().map { it.theme }

    internal val allViewThemes: List<Theme>
        get() = viewThemes.toList().map { it.theme }
}
