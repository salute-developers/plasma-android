package com.sdds.playground.sandbox.activities.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.fragment.app.FragmentActivity
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.MainContent

/**
 * Активити демо-приложения на compose
 */
class SandboxActivityCompose : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            SandboxTheme {
                MainContent()
            }
        }
    }
}
