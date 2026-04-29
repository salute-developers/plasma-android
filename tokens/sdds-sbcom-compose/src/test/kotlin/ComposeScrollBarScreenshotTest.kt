package com.sdds.sbcom

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTouchInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ScrollBarM
import com.sdds.compose.uikit.fixtures.testcases.ScrollBarS
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.scrollbar.Default
import com.sdds.sbcom.styles.scrollbar.ScrollBar
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeScrollBarScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testScrollBarM() {
        composeTestRule.content {
            ScrollBarM(style = ScrollBar.Default.style())
        }
        composeTestRule.onNodeWithTag("scrollBar").performTouchInput {
            down(center)
            advanceEventTime(500L)
            up()
        }
    }

    @Test
    fun testScrollBarS() {
        composeTestRule.content {
            ScrollBarS(style = ScrollBar.Default.style())
        }
        composeTestRule.onNodeWithTag("scrollBar").performTouchInput {
            down(center)
            advanceEventTime(500L)
            moveBy(Offset(0f, 300f))
            up()
        }
    }
}
