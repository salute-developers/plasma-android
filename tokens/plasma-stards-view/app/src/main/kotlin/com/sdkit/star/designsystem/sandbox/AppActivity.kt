package com.sdkit.star.designsystem.sandbox

import android.os.Bundle
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.uikit.fixtures.stories.registerCoreStories
import com.sdds.uikit.fixtures.stories.registerCoreTheme
import com.sdkit.star.designsystem.integration.PlasmaStardsViewComponents

internal class AppActivity : SandboxActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        registerCoreStories()
        registerCoreTheme(
            displayName = getString(R.string.app_name),
            themeRes = com.sdkit.star.designsystem.R.style.Sdkit_AppTheme,
            components = PlasmaStardsViewComponents,
            subThemeRes = mapOf(
                SubTheme.DEFAULT to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_Default,
                SubTheme.ON_DARK to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_OnDark,
                SubTheme.ON_LIGHT to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_OnLight,
                SubTheme.INVERSE to com.sdkit.star.designsystem.R.style.Sdkit_StarDs_Inverse,
            ),
        )
        super.onCreate(savedInstanceState)
    }
}
