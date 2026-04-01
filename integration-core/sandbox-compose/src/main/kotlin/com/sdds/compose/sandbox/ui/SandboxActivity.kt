package com.sdds.compose.sandbox.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.sdds.compose.sandbox.internal.MainContent
import com.sdds.compose.sandbox.internal.SandboxTheme
import com.sdds.compose.uikit.overlay.OverlayHost

/**
 * Активити демо-приложения на compose
 */
open class SandboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            SandboxTheme {
                OverlayHost {
                    MainContent()
                }
            }
        }
    }
}
