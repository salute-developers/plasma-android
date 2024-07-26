package com.sdds.playground.sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity

/**
 * Активити демо-приложения на View
 */
class SandboxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}
