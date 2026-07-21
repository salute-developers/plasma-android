package com.sdds.serv.sandbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sdds.compose.sandbox.SandboxApp
import com.sdds.compose.uikit.fixtures.stories.registerCoreStories
import com.sdds.serv.integration.registerTheme

/**
 * Registers stories and SddsServ theme before the sandbox UI is rendered.
 *
 * Safe to invoke more than once: stories are registered by key and the theme
 * is replaced in the global manager.
 */
fun initializeSddsServSandbox() {
    registerCoreStories()
    registerTheme()
}

/**
 * Common SddsServ sandbox application root.
 */
@Composable
fun SddsServSandboxApp(
    navigationIntegration: @Composable (NavHostController) -> Unit = {},
) {
    SandboxApp(
        navigationIntegration = navigationIntegration,
    )
}
