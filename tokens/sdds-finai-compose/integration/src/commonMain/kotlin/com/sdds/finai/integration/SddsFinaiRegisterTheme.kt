package com.sdds.finai.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.finai.theme.SddsFinAiTheme
import com.sdds.finai.theme.darkSddsFinAiColors
import com.sdds.finai.theme.darkSddsFinAiGradients
import com.sdds.finai.theme.lightSddsFinAiColors
import com.sdds.finai.theme.lightSddsFinAiGradients
import com.sdds.finai.theme.subthemes.Default
import com.sdds.finai.theme.subthemes.Inverse
import com.sdds.finai.theme.subthemes.OnDark
import com.sdds.finai.theme.subthemes.OnLight
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager

fun registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "SddsFinai",
        components = SddsFinaiComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            SddsFinAiTheme(
                colors = if (isDark) darkSddsFinAiColors() else lightSddsFinAiColors(),
                gradients = if (isDark) darkSddsFinAiGradients() else lightSddsFinAiGradients(),
            ) {
                it()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { SddsFinAiTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { SddsFinAiTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { SddsFinAiTheme.OnDark(content = it) },
            SubTheme.INVERSE to { SddsFinAiTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
