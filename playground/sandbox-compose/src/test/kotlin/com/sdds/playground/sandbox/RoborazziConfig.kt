package com.sdds.playground.sandbox

import android.app.Application
import android.content.pm.ActivityInfo
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import org.junit.Rule
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.robolectric.Shadows.shadowOf
import java.io.File

open class RoborazziConfig {

    /**
     * Правило для регистрации Activity до запуска тестов
     */
    @get:Rule(order = 0)
    val addActivityToRobolectricRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            super.starting(description)
            val appContext: Application = ApplicationProvider.getApplicationContext()
            val activityInfo = ActivityInfo().apply {
                name = ComponentActivity::class.java.name
                packageName = appContext.packageName
            }
            shadowOf(appContext.packageManager).addOrUpdateActivity(activityInfo)
        }
    }

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    /**
     * Правило для запуска тестов и сохранения скриншотов в папку screenshots
     */
    @OptIn(ExperimentalRoborazziApi::class)
    @get:Rule(order = 2)
    val roborazziRule = RoborazziRule(
        composeRule = composeTestRule,
        captureRoot = composeTestRule.onRoot(),
        options = RoborazziRule.Options(
            captureType = RoborazziRule.CaptureType.LastImage(onlyFail = false),
            outputDirectoryPath = directoryPath,
            outputFileProvider = { description, outputDirectory, fileExtension ->
                File(
                    outputDirectory,
                    "${description.methodName}.$fileExtension",
                )
            },
            roborazziOptions = RoborazziOptions(
                compareOptions = RoborazziOptions.CompareOptions(
                    changeThreshold = 0.01f,
                ),
            ),
        ),
    )

    companion object {
        const val directoryPath = "screenshots"
    }
}