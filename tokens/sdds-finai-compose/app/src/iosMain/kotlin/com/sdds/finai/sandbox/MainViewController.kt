package com.sdds.finai.sandbox

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

/**
 * Creates the iOS root view controller for the Sdds FinAi sandbox host app.
 */
@Suppress("FunctionNaming")
fun MainViewController(): UIViewController {
    initializeSddsFinAiSandbox()
    return ComposeUIViewController {
        SddsFinAiSandboxApp()
    }
}
