@file:JvmName("RoborazziConfigComposeJvmKt")

package com.sdds.compose.uikit.fixtures

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.runDesktopComposeUiTest
import io.github.takahirom.roborazzi.captureRoboImage

/** Конфигурация Roborazzi для JVM. */
@Suppress("UnnecessaryAbstractClass")
actual abstract class RoborazziConfigCompose actual constructor(
    theme: String?,
    internal val screenshotTheme: RoborazziScreenshotTheme?,
)

/** Запускает и снимает общий скриншотный тест на JVM. */
@OptIn(ExperimentalTestApi::class)
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
    JvmScreenshotTheme.entries.forEach { theme ->
        runDesktopComposeUiTest {
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
                    "screenshots-kmp/kmp/jvm/${testName}_${theme.suffix}_jvm.png",
                )
            } catch (failure: AssertionError) {
                screenshotFailures += failure
            }
        }
    }
    screenshotFailures.firstOrNull()?.let { throw it }
}

private enum class JvmScreenshotTheme(
    val suffix: String,
    val dark: Boolean,
) {
    Light(suffix = "light", dark = false),
    Dark(suffix = "dark", dark = true),
}
