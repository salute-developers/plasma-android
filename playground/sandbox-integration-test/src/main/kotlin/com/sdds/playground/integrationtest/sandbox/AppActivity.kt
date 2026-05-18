package com.sdds.playground.integrationtest.sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.sdds.playground.integrationtest.app.IntegrationSandboxApp

/**
 * Activity для приложения
 */
@Suppress("UndocumentedPublicProperty")
class AppActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val initialScenarioId = intent.getStringExtra(EXTRA_SCENARIO_ID)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            IntegrationSandboxApp(initialScenarioId = initialScenarioId)
        }
    }

    /**
     * Id сценария
     */
    companion object {
        const val EXTRA_SCENARIO_ID = "scenario_id"
    }
}
