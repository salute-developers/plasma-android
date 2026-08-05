package com.sdds.serv.sandbox

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

/**
 * Creates the iOS root view controller for the Sdds Serv sandbox host app.
 */
@Suppress("FunctionNaming")
fun MainViewController(): UIViewController {
    initializeSddsServSandbox()
    return ComposeUIViewController {
        SddsServSandboxApp()
    }
}
