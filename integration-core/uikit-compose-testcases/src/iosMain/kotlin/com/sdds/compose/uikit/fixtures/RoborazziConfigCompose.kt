package com.sdds.compose.uikit.fixtures

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.runSkikoComposeUiTest
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import io.github.takahirom.roborazzi.CompareOptions
import io.github.takahirom.roborazzi.RoborazziOptions
import io.github.takahirom.roborazzi.captureRoboImage

/** Конфигурация Roborazzi для iOS. */
@Suppress("UnnecessaryAbstractClass")
actual abstract class RoborazziConfigCompose actual constructor(
    theme: String?,
    internal val screenshotTheme: RoborazziScreenshotTheme?,
)

/** Запускает и снимает общий скриншотный тест на iOS. */
@OptIn(ExperimentalTestApi::class, ExperimentalRoborazziApi::class)
actual fun RoborazziConfigCompose.runPlatformScreenshotTest(
    testName: String,
    captureRoot: ScreenshotCaptureRoot,
    actions: SemanticsNodeInteractionsProvider.() -> Unit,
    content: @Composable () -> Unit,
) {
    val platformTheme = requireNotNull(screenshotTheme) {
        "A RoborazziScreenshotTheme is required for a common screenshot test"
    }
    val screenshotFailures = mutableListOf<AssertionError>()
    IosScreenshotTheme.entries.forEach { theme ->
        runSkikoComposeUiTest(size = Size(390f, 844f)) {
            setContent {
                platformTheme.content(darkTheme = theme.dark, content = content)
            }
            waitForIdle()
            actions()
            waitForIdle()

            val roots = onAllNodes(isRoot())
            val root = when (captureRoot) {
                ScreenshotCaptureRoot.Primary -> onRoot()
                ScreenshotCaptureRoot.Last -> roots[roots.fetchSemanticsNodes().lastIndex]
            }
            try {
                root.captureRoboImage(
                    composeUiTest = this,
                    filePath = "kmp/ios/${testName}_${theme.suffix}_ios.png",
                    roborazziOptions = RoborazziOptions(
                        compareOptions = CompareOptions(
                            outputDirectoryPath = "build/outputs/roborazzi/ios",
                        ),
                    ),
                )
            } catch (failure: AssertionError) {
                screenshotFailures += failure
            }
        }
    }
    screenshotFailures.firstOrNull()?.let { throw it }
}

private enum class IosScreenshotTheme(
    val suffix: String,
    val dark: Boolean,
) {
    Light(suffix = "light", dark = false),
    Dark(suffix = "dark", dark = true),
}
