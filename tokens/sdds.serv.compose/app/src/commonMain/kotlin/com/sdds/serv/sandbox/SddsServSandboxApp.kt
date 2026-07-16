package com.sdds.serv.sandbox

import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.SandboxApp
import com.sdds.compose.uikit.fixtures.stories.registerCoreStories
import com.sdds.serv.integration.registerTheme

/**
 * Registers stories and SddsServ theme before the sandbox UI is rendered.
 */
fun initializeSddsServSandbox() {
    registerCoreStories()
    registerTheme()
}

/**
 * Common SddsServ sandbox application root.
 */
@Composable
fun SddsServSandboxApp() {
    SandboxApp()
}
