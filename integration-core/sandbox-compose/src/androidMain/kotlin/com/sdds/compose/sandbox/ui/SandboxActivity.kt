package com.sdds.compose.sandbox.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import com.sdds.compose.sandbox.SandboxApp

/**
 * Активити демо-приложения на compose
 */
open class SandboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        onBeforeSandboxContent()
        setContent {
            SandboxContent()
        }
    }

    /**
     * Called before the sandbox composable tree is rendered.
     */
    protected open fun onBeforeSandboxContent() = Unit

    /**
     * Android entrypoint for platform-specific applications that render a common sandbox root.
     */
    @Composable
    protected open fun SandboxContent() {
        SandboxApp()
    }
}
