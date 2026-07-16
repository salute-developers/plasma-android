package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.internal.MainContent
import com.sdds.compose.sandbox.internal.SandboxTheme
import com.sdds.compose.uikit.overlay.OverlayHost

/**
 * Общий корень Compose-песочницы.
 *
 * Platform launcher-ы должны вызывать эту функцию из своих entrypoint-ов, а
 * platform-specific работу с окном, Activity или installer-ом оставлять в
 * соответствующих source set.
 */
@Composable
fun SandboxApp() {
    SandboxTheme {
        OverlayHost {
            MainContent()
        }
    }
}
