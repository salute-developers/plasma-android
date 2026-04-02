package com.sdds.serv.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.darkSddsServGradients
import com.sdds.serv.theme.lightSddsServColors
import com.sdds.serv.theme.lightSddsServGradients
import com.sdds.serv.theme.subthemes.Default
import com.sdds.serv.theme.subthemes.Inverse
import com.sdds.serv.theme.subthemes.OnDark
import com.sdds.serv.theme.subthemes.OnLight

fun SandboxActivity.registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "SddsServ",
        components = SddsServComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            SddsServTheme(
                colors = if (isDark) darkSddsServColors() else lightSddsServColors(),
                gradients = if (isDark) darkSddsServGradients() else lightSddsServGradients(),
            ) {
                it.invoke()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { SddsServTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { SddsServTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { SddsServTheme.OnDark(content = it) },
            SubTheme.INVERSE to { SddsServTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
