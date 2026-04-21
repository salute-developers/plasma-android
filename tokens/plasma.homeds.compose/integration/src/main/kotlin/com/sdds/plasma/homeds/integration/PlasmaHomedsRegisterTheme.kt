package com.sdds.plasma.homeds.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.darkPlasmaHomeDsGradients
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsColors
import com.sdds.plasma.homeds.theme.lightPlasmaHomeDsGradients
import com.sdds.plasma.homeds.theme.subthemes.Default
import com.sdds.plasma.homeds.theme.subthemes.Inverse
import com.sdds.plasma.homeds.theme.subthemes.OnDark
import com.sdds.plasma.homeds.theme.subthemes.OnLight
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager

fun SandboxActivity.registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "PlasmaHomeds",
        components = PlasmaHomedsComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            PlasmaHomeDsTheme(
                colors = if (isDark) darkPlasmaHomeDsColors() else lightPlasmaHomeDsColors(),
                gradients = if (isDark) darkPlasmaHomeDsGradients() else lightPlasmaHomeDsGradients(),
            ) {
                it()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { PlasmaHomeDsTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { PlasmaHomeDsTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { PlasmaHomeDsTheme.OnDark(content = it) },
            SubTheme.INVERSE to { PlasmaHomeDsTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
