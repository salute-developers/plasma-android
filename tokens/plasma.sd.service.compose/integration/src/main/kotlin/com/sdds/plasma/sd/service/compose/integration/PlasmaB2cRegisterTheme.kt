package com.sdds.plasma.sd.service.compose.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.darkPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceColors
import com.sdds.plasma.sd.service.theme.lightPlasmaSdServiceGradients
import com.sdds.plasma.sd.service.theme.subthemes.Default
import com.sdds.plasma.sd.service.theme.subthemes.Inverse
import com.sdds.plasma.sd.service.theme.subthemes.OnDark
import com.sdds.plasma.sd.service.theme.subthemes.OnLight
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager

fun SandboxActivity.registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "PlasmaB2c",
        components = PlasmaB2cComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            PlasmaSdServiceTheme(
                colors = if (isDark) darkPlasmaSdServiceColors() else lightPlasmaSdServiceColors(),
                gradients = if (isDark) darkPlasmaSdServiceGradients() else lightPlasmaSdServiceGradients(),
            ) {
                it()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaSdServiceTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaSdServiceTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaSdServiceTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaSdServiceTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
