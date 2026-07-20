package com.sdds.serv.sandbox

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import platform.AppKit.NSApplication
import platform.AppKit.NSApplicationActivationPolicy
import platform.AppKit.NSApplicationDelegateProtocol
import platform.darwin.NSObject

/** Kotlin/Native macOS entrypoint for the SddsServ sandbox. */
fun main() {
    val application = NSApplication.sharedApplication
    application.setActivationPolicy(NSApplicationActivationPolicy.NSApplicationActivationPolicyRegular)
    application.delegate = sandboxApplicationDelegate
    application.activateIgnoringOtherApps(true)

    initializeSddsServSandbox()
    Window(
        title = "SddsServ Sandbox",
        size = DpSize(1440.dp, 960.dp),
    ) {
        SddsServSandboxApp()
    }
    application.run()
}

// NSApplication keeps its delegate weakly. Keep it alive for the entire event loop.
private val sandboxApplicationDelegate = SandboxApplicationDelegate()

private class SandboxApplicationDelegate : NSObject(), NSApplicationDelegateProtocol {
    override fun applicationShouldTerminateAfterLastWindowClosed(sender: NSApplication): Boolean = true
}
