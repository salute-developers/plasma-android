package com.sdds.playground.sandboxhelper

import android.content.Context
import android.content.Intent
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity

fun createSandboxComposeRule(
    scenarioId: String,
): AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity> {
    val context = ApplicationProvider.getApplicationContext<Context>()

    val intent = Intent(context, AppActivity::class.java).apply {
        putExtra(AppActivity.EXTRA_SCENARIO_ID, scenarioId)
    }

    return AndroidComposeTestRule(
        activityRule = ActivityScenarioRule<AppActivity>(intent),
        activityProvider = { rule ->
            var activity: AppActivity? = null
            rule.scenario.onActivity { activity = it }
            activity ?: error("Activity не запущен")
        },
    )
}

internal object SandboxScenariosIds {
    const val FOCUS_SELECTOR = "focus-selector-tabs"
    const val LOGIN_FORM = "login-form-basic"
    const val TOOLTIP_CLOSE = "popup-tooltip-basic"
    const val MODAL_SCROLLBAR = "modal-scrollbar-basic"
    const val TOAST_MODAL_LOGIN = "toast-modal-login-basic"
}
