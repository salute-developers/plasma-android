package com.sdds.playground.sandbox.activities.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.MainContent

/**
 * Активити демо-приложения на compose
 */
class SandboxActivityCompose : ComponentActivity() {
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

/**
 * Превью [SandboxContainer]
 */
@Preview(showBackground = true)
@Composable
fun SandboxContainerPreview() {
    SandboxTheme {
        MainContent()
    }
}
