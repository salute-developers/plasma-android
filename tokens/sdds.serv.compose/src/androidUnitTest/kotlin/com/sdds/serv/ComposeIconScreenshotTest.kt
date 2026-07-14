package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.IconFillBrush
import com.sdds.compose.uikit.fixtures.testcases.IconFillColor
import com.sdds.compose.uikit.fixtures.testcases.IconTint
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeIconScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testIconFillColor() {
        composeTestRule.content {
            IconFillColor()
        }
    }

    @Test
    fun testIconTint() {
        composeTestRule.content {
            IconTint()
        }
    }

    @Test
    fun testIconFillBrush() {
        composeTestRule.content {
            IconFillBrush()
        }
    }
}
