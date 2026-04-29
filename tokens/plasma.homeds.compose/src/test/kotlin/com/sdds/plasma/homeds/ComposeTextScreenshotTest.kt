package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TextClipFillBrush
import com.sdds.compose.uikit.fixtures.testcases.TextEllipsisFillColor
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTextScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testTextEllipsisFillColor() {
        composeTestRule.content {
            TextEllipsisFillColor()
        }
    }

    @Test
    fun testTextClipFillBrush() {
        composeTestRule.content {
            TextClipFillBrush()
        }
    }
}
