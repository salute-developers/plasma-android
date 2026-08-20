@file:JvmName("RoborazziConfigComposeAndroidKt")

package com.sdds.compose.uikit.fixtures

import android.app.Application
import android.content.pm.ActivityInfo
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import java.io.File

/** Конфигурация Roborazzi для Android. */
@Suppress("UnnecessaryAbstractClass")
@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
actual abstract class RoborazziConfigCompose actual constructor(
    private val theme: String?,
    internal val screenshotTheme: RoborazziScreenshotTheme?,
) {

    /**
     * Правило для регистрации Activity до запуска тестов
     */
    @get:Rule(order = 0)
    val addActivityToRobolectricRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            super.starting(description)
            theme?.let(RuntimeEnvironment::setQualifiers)
            val appContext: Application = ApplicationProvider.getApplicationContext()
            val activityInfo = ActivityInfo().apply {
                name = ComponentActivity::class.java.name
                packageName = appContext.packageName
            }
            shadowOf(appContext.packageManager).addOrUpdateActivity(activityInfo)
        }
    }

    /** Compose-правило с Activity для скриншотных тестов Android. */
    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    /** Снимает старые Android-тесты; общие KMP-тесты вызывают снимок явно. */
    @OptIn(ExperimentalRoborazziApi::class)
    @get:Rule(order = 2)
    val roborazziRule = RoborazziRule(
        composeRule = composeTestRule,
        captureRoot = composeTestRule.onRoot(),
        options = RoborazziRule.Options(
            captureType = if (theme == null) {
                RoborazziRule.CaptureType.None
            } else {
                RoborazziRule.CaptureType.LastImage(onlyFail = false)
            },
            outputDirectoryPath = directoryPath,
            outputFileProvider = { description, outputDirectory, fileExtension ->
                val themeSuffix = when (theme) {
                    "+notnight" -> "light"
                    else -> "dark"
                }
                File(
                    outputDirectory,
                    "${description.methodName.replace("[]", "")}_$themeSuffix.$fileExtension",
                )
            },
            roborazziOptions = RoborazziOptions(
                compareOptions = RoborazziOptions.CompareOptions(
                    changeThreshold = 0.005f,
                ),
            ),
        ),
    )

    companion object {
        /**
         * Папка для сохранения скриншотов
         */
        const val directoryPath = "screenshots-compose"

        /**
         * Темная/светлая тема
         */
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "")
        fun themeProvider(): Array<String> =
            arrayOf(
                "+night",
                "+notnight",
            )
    }
}

/** Запускает и снимает общий скриншотный тест на Android. */
@OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)
actual fun RoborazziConfigCompose.runPlatformScreenshotTest(
    testName: String,
    captureRoot: ScreenshotCaptureRoot,
    actions: SemanticsNodeInteractionsProvider.() -> Unit,
    content: @Composable () -> Unit,
) {
    val platformTheme = requireNotNull(screenshotTheme) {
        "A RoborazziScreenshotTheme is required for a common screenshot test"
    }
    var darkTheme by mutableStateOf(false)
    composeTestRule.setContent {
        configureComposeResourcesForRobolectric()
        platformTheme.content(darkTheme = darkTheme, content = content)
    }
    composeTestRule.waitForIdle()
    actions(composeTestRule)
    composeTestRule.waitForIdle()

    AndroidScreenshotTheme.entries.forEach { screenshotTheme ->
        composeTestRule.runOnIdle { darkTheme = screenshotTheme.dark }
        composeTestRule.waitForIdle()

        val roots = composeTestRule.onAllNodes(isRoot())
        val root = when (captureRoot) {
            ScreenshotCaptureRoot.Primary -> composeTestRule.onRoot()
            ScreenshotCaptureRoot.Last -> roots[roots.fetchSemanticsNodes().lastIndex]
        }
        root.captureRoboImage(
            "screenshots-kmp/kmp/android/${testName}_${screenshotTheme.suffix}.png",
        )
    }
}

private enum class AndroidScreenshotTheme(
    val suffix: String,
    val dark: Boolean,
) {
    Light(suffix = "light", dark = false),
    Dark(suffix = "dark", dark = true),
}
