package com.sdds.stylessalute

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTouchInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.scrollbar.M
import com.sdds.stylessalute.styles.scrollbar.S
import com.sdds.stylessalute.styles.scrollbar.ScrollBar
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.scrollbar.ScrollBarM
import com.sdds.testing.compose.scrollbar.ScrollBarS
import com.sdds.testing.vs.SDK_NUMBER
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
            ScrollBarM(style = ScrollBar.M.style())
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
            ScrollBarS(style = ScrollBar.S.style())
        }
        composeTestRule.onNodeWithTag("scrollBar").performTouchInput {
            down(center)
            advanceEventTime(500L)
            moveBy(Offset(0f, 300f))
            up()
        }
    }
}
