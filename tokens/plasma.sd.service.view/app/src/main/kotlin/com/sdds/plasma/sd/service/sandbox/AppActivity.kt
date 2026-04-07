package com.sdds.plasma.sd.service.sandbox

import android.os.Bundle
import com.plasma.sd.service.integration.PlasmaB2cViewComponents
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.plasma.sd.service.R
import com.sdds.uikit.fixtures.stories.registerCoreStories
import com.sdds.uikit.fixtures.stories.registerCoreTheme

internal class AppActivity : SandboxActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        registerCoreStories()
        registerCoreTheme(
            displayName = getString(com.sdds.plasma.sd.service.sandbox.R.string.app_name),
            themeRes = R.style.Plasma_SdService_MaterialComponents_DayNight,
            components = PlasmaB2cViewComponents,
            subThemeRes = mapOf(
                SubTheme.DEFAULT to R.style.Plasma_SdService_Default,
                SubTheme.ON_DARK to R.style.Plasma_SdService_OnDark,
                SubTheme.ON_LIGHT to R.style.Plasma_SdService_OnLight,
                SubTheme.INVERSE to R.style.Plasma_SdService_Inverse,
            ),
        )
        super.onCreate(savedInstanceState)
    }
}
