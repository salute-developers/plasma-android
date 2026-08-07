package com.sdds.compose.uikit.fixtures.kmp

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.ComposeUiTest
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.runDesktopComposeUiTest
import io.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.rules.TestName

@OptIn(ExperimentalTestApi::class)
/**
 * RoborazziConfigJvm
 */
open class RoborazziConfigJvm(
    private val theme: RoborazziScreenshotTheme,
    private val directoryPath: String = "screenshots-kmp/kmp/jvm",
) {

    /**
     * TestName
     */
    @get:Rule
    val testName = TestName()

    protected fun content(
        darkTheme: Boolean = true,
        actions: ComposeUiTest.() -> Unit = {},
        capture: ComposeUiTest.(filePath: String) -> Unit = { onRoot().captureRoboImage(it) },
        content: @Composable () -> Unit,
    ) = runDesktopComposeUiTest {
        setContent {
            theme.content(darkTheme = darkTheme) {
                content()
            }
        }

        waitForIdle()
        actions()
        waitForIdle()

        capture("$directoryPath/${testName.methodName}_jvm.png")
    }

    protected fun ComposeUiTest.captureLastRootRoboImage(filePath: String) {
        val roots = onAllNodes(isRoot())
        val rootIndex = roots.fetchSemanticsNodes().lastIndex
        roots[rootIndex].captureRoboImage(filePath)
    }
}
