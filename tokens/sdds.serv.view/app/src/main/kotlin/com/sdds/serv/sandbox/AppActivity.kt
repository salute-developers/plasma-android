package com.sdds.serv.sandbox

import android.os.Bundle
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.serv.integration.SddsServViewComponents
import com.sdds.uikit.fixtures.stories.registerCoreStories
import com.sdds.uikit.fixtures.stories.registerCoreTheme

internal class AppActivity : SandboxActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        registerCoreStories()
        registerCoreTheme(
            displayName = getString(R.string.app_name),
            themeRes = com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight,
            components = SddsServViewComponents,
            subThemeRes = mapOf(
                SubTheme.DEFAULT to com.sdds.serv.R.style.Serv_Sdds_Default,
                SubTheme.ON_DARK to com.sdds.serv.R.style.Serv_Sdds_OnDark,
                SubTheme.ON_LIGHT to com.sdds.serv.R.style.Serv_Sdds_OnLight,
                SubTheme.INVERSE to com.sdds.serv.R.style.Serv_Sdds_Inverse,
            ),
        )
        super.onCreate(savedInstanceState)
    }
}
