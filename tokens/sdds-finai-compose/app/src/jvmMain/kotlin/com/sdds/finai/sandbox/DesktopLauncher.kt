package com.sdds.finai.sandbox

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

/** JVM Desktop entrypoint for the SddsServ sandbox. */
fun main() = application {
    initializeSddsFinAiSandbox()
    Window(
        onCloseRequest = ::exitApplication,
        title = "SddsServ Sandbox",
    ) {
        SddsFinAiSandboxApp()
    }
}
