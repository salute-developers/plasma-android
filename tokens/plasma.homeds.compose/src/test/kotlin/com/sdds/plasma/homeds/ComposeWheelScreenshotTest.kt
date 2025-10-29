package com.sdds.plasma.homeds

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.wheel.CenterAlign
import com.sdds.plasma.homeds.styles.wheel.H1
import com.sdds.plasma.homeds.styles.wheel.LeftAlign
import com.sdds.plasma.homeds.styles.wheel.MixedAlign
import com.sdds.plasma.homeds.styles.wheel.RightAlign
import com.sdds.plasma.homeds.styles.wheel.Wheel
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.wheel.WheelCountFourDescriptionDots
import com.sdds.testing.compose.wheel.WheelCountOneSeparatorNone
import com.sdds.testing.compose.wheel.WheelCountThreeDescriptionDivider
import com.sdds.testing.compose.wheel.WheelThreeVisibleEntriesFiveLabelHasControls
import com.sdds.testing.compose.wheel.WheelTwoVisibleEntriesNineTADivider
import com.sdds.testing.compose.wheel.WheelTwoVisibleEntriesOneDescriptionDots
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeWheelScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testWheelH1MixedAlignThreeVisibleEntriesFive() {
        composeTestRule.content {
            WheelThreeVisibleEntriesFiveLabelHasControls(Wheel.H1.MixedAlign.style())
        }
        composeTestRule.onAllNodesWithTag("wheel", useUnmergedTree = true)
        composeTestRule.onAllNodesWithTag("top_control")[0].performClick()
        composeTestRule.onAllNodesWithTag("top_control")[0].assertHasClickAction()
    }

    @Test
    fun testWheelH1LeftAlignTwoVisibleEntriesNineTADivider() {
        composeTestRule.content {
            WheelTwoVisibleEntriesNineTADivider(Wheel.H1.LeftAlign.style())
        }
    }

    @Test
    fun testWheelH1CenterAlignWheelTwoVisibleEntriesOneDescriptionDots() {
        composeTestRule.content {
            WheelTwoVisibleEntriesOneDescriptionDots(Wheel.H1.CenterAlign.style())
        }
    }

    @Test
    fun testWheelH1RightAlignCountOneSeparatorNone() {
        composeTestRule.content {
            WheelCountOneSeparatorNone(Wheel.H1.RightAlign.style())
        }
    }

    @Config(qualifiers = "land")
    @Test
    fun testWheelH1CenterAlignWheelCountFourDescriptionDots() {
        composeTestRule.content {
            WheelCountFourDescriptionDots(Wheel.H1.CenterAlign.style())
        }
    }

    @Test
    fun testWheelCountThreeDescriptionDivider() {
        composeTestRule.content {
            WheelCountThreeDescriptionDivider(Wheel.H1.CenterAlign.style())
        }
    }
}
