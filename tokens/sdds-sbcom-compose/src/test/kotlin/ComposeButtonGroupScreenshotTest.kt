package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupHorizontal
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupHorizontalMaxAmount
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupVertical
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.buttongroup.BasicButtonGroup
import com.sdds.sbcom.styles.buttongroup.Default
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeButtonGroupScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testButtonGroupDefault() {
        composeTestRule.content {
            ButtonGroupHorizontal(style = BasicButtonGroup.Default.style())
        }
    }

    @Test
    fun testButtonGroupVerticalDefault() {
        composeTestRule.content {
            ButtonGroupVertical(style = BasicButtonGroup.Default.style())
        }
    }

    @Test
    fun testButtonGroupMaxAmount() {
        composeTestRule.content {
            ButtonGroupHorizontalMaxAmount(style = BasicButtonGroup.Default.style())
        }
    }
}
