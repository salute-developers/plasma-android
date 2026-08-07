package com.sdds.compose.uikit.fixtures.kmp

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.test.ComposeUiTest
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.runSkikoComposeUiTest
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import io.github.takahirom.roborazzi.CompareOptions
import io.github.takahirom.roborazzi.RoborazziOptions
import io.github.takahirom.roborazzi.captureRoboImage
import kotlin.reflect.KFunction

@OptIn(ExperimentalTestApi::class, ExperimentalRoborazziApi::class)
/**
 * iOS screenshot config
 */
open class RoborazziConfigIos(
    private val theme: RoborazziScreenshotTheme,
    private val themeMode: RoborazziScreenshotThemeMode,
    private val directoryPath: String = "kmp/ios",
    compareDirectoryPath: String = "build/outputs/roborazzi/ios",
    private val screenshotSize: Size = Size(390f, 844f),
) {

    private val roborazziOptions = RoborazziOptions(
        compareOptions = CompareOptions(
            outputDirectoryPath = compareDirectoryPath,
        ),
    )

    protected fun content(
        testMethod: KFunction<*>,
        actions: ComposeUiTest.() -> Unit = {},
        capture: ComposeUiTest.(filePath: String) -> Unit = {
            onRoot().captureIosRoboImage(
                composeUiTest = this,
                filePath = it,
            )
        },
        content: @Composable () -> Unit,
    ) {
        runSkikoComposeUiTest(size = screenshotSize) {
            setContent {
                theme.content(darkTheme = themeMode.darkTheme) {
                    content()
                }
            }

            waitForIdle()
            actions()
            waitForIdle()

            capture("$directoryPath/${testMethod.name}_${themeMode.suffix}_ios.png")
        }
    }

    protected fun ComposeUiTest.captureLastRootRoboImage(filePath: String) {
        val roots = onAllNodes(isRoot())
        val rootIndex = roots.fetchSemanticsNodes().lastIndex
        roots[rootIndex].captureIosRoboImage(
            composeUiTest = this,
            filePath = filePath,
        )
    }

    private fun SemanticsNodeInteraction.captureIosRoboImage(
        composeUiTest: ComposeUiTest,
        filePath: String,
    ) {
        captureRoboImage(
            composeUiTest = composeUiTest,
            filePath = filePath,
            roborazziOptions = roborazziOptions,
        )
    }
}
