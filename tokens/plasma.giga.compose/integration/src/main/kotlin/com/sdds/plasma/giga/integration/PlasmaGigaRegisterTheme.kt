package com.sdds.plasma.giga.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import com.sdds.plasma.giga.theme.darkPlasmaGigaColors
import com.sdds.plasma.giga.theme.darkPlasmaGigaGradients
import com.sdds.plasma.giga.theme.lightPlasmaGigaColors
import com.sdds.plasma.giga.theme.lightPlasmaGigaGradients
import com.sdds.plasma.giga.theme.subthemes.Default
import com.sdds.plasma.giga.theme.subthemes.Inverse
import com.sdds.plasma.giga.theme.subthemes.OnDark
import com.sdds.plasma.giga.theme.subthemes.OnLight
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager

fun SandboxActivity.registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "PlasmaGiga",
        components = PlasmaGigaComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            PlasmaGigaTheme(
                colors = if (isDark) darkPlasmaGigaColors() else lightPlasmaGigaColors(),
                gradients = if (isDark) darkPlasmaGigaGradients() else lightPlasmaGigaGradients(),
            ) {
                it()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaGigaTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaGigaTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaGigaTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaGigaTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
