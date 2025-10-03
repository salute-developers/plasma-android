package com.sdkit.star.designsystem

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.wheel.WheelCountFourDescriptionDots
import com.sdds.testing.compose.wheel.WheelCountOneSeparatorNone
import com.sdds.testing.compose.wheel.WheelCountThreeDescriptionDivider
import com.sdds.testing.compose.wheel.WheelThreeVisibleEntriesFiveLabelHasControls
import com.sdds.testing.compose.wheel.WheelTwoVisibleEntriesNineTADivider
import com.sdds.testing.compose.wheel.WheelTwoVisibleEntriesOneDescriptionDots
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.wheel.CenterAlign
import com.sdkit.star.designsystem.styles.wheel.H1
import com.sdkit.star.designsystem.styles.wheel.LeftAlign
import com.sdkit.star.designsystem.styles.wheel.MixedAlign
import com.sdkit.star.designsystem.styles.wheel.RightAlign
import com.sdkit.star.designsystem.styles.wheel.Wheel
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeWheelScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testWheelH1MixedAlignThreeVisibleEntriesFive() {
        composeTestRule.content {
            WheelThreeVisibleEntriesFiveLabelHasControls(Wheel.H1.MixedAlign.style())
        }
        composeTestRule.waitForIdle()
        composeTestRule.onAllNodesWithTag("wheel", useUnmergedTree = true)
        composeTestRule.onAllNodesWithTag("bottom_control")[0].performClick()
        composeTestRule.onAllNodesWithTag("bottom_control")[0].assertHasClickAction()
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
