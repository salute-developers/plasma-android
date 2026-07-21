package com.sdds.serv.sandbox

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

/** JVM Desktop entrypoint for the SddsServ sandbox. */
fun main() = application {
    initializeSddsServSandbox()
    Window(
        onCloseRequest = ::exitApplication,
        title = "SddsServ Sandbox",
    ) {
        SddsServSandboxApp()
    }
}
