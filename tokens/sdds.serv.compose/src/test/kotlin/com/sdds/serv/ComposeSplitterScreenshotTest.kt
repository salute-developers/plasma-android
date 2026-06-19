package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTouchInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.SplitterHorizontalHasHandle
import com.sdds.compose.uikit.fixtures.testcases.SplitterVertical
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.splitter.Default
import com.sdds.serv.styles.splitter.Splitter
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeSplitterScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testSplitterHorizontal() {
        composeTestRule.content {
            SplitterHorizontalHasHandle(Splitter.Default.style())
        }
    }

    @Test
    fun testSplitterHorizontalActive() {
        composeTestRule.content {
            SplitterHorizontalHasHandle(Splitter.Default.style())
        }
        composeTestRule.onNodeWithTag("Splitter").performTouchInput {
            down(center)
        }
        composeTestRule.waitForIdle()
    }

    @Test
    fun testSplitterVertical() {
        composeTestRule.content {
            SplitterVertical(Splitter.Default.style())
        }
    }
}
