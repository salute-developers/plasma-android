package com.sdds.sbcom.integration

import androidx.compose.foundation.isSystemInDarkTheme
import com.sdds.compose.sandbox.ComposeTheme
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.sandbox.ComponentProvider
import com.sdds.sandbox.ComponentProviderUtils.plus
import com.sdds.sandbox.ThemeManager
import com.sdds.sbcom.theme.SddsSbComTheme
import com.sdds.sbcom.theme.darkSddsSbComColors
import com.sdds.sbcom.theme.darkSddsSbComGradients
import com.sdds.sbcom.theme.lightSddsSbComColors
import com.sdds.sbcom.theme.lightSddsSbComGradients
import com.sdds.sbcom.theme.subthemes.Default
import com.sdds.sbcom.theme.subthemes.Inverse
import com.sdds.sbcom.theme.subthemes.OnDark
import com.sdds.sbcom.theme.subthemes.OnLight

fun SandboxActivity.registerTheme(componentProvider: ComponentProvider = ComponentProvider.Empty) {
    val theme = ComposeTheme(
        displayName = "SddsSbcom",
        components = SddsSbcomComposeComponents + componentProvider,
        themeWrapper = {
            val isDark = isSystemInDarkTheme()
            SddsSbComTheme(
                colors = if (isDark) darkSddsSbComColors() else lightSddsSbComColors(),
                gradients = if (isDark) darkSddsSbComGradients() else lightSddsSbComGradients(),
            ) {
                it()
            }
        },
        subthemes = mapOf(
            SubTheme.DEFAULT to { SddsSbComTheme.Default(content = it) },
            SubTheme.ON_LIGHT to { SddsSbComTheme.OnLight(content = it) },
            SubTheme.ON_DARK to { SddsSbComTheme.OnDark(content = it) },
            SubTheme.INVERSE to { SddsSbComTheme.Inverse(content = it) },
        ),
    )
    ThemeManager.updateTheme(theme)
}
