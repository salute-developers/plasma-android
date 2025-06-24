package com.sdkit.star.designsystem

import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.tooltip.TooltipMLooseStartBottomCenter
import com.sdds.testing.compose.tooltip.TooltipMLooseStartCenter
import com.sdds.testing.compose.tooltip.TooltipMLooseStartCenterBottomEnd
import com.sdds.testing.compose.tooltip.TooltipMLooseStartCenterEnd
import com.sdds.testing.compose.tooltip.TooltipMLooseTopEnd
import com.sdds.testing.compose.tooltip.TooltipMLooseTopEndNotVisible
import com.sdds.testing.compose.tooltip.TooltipMStrictBottomEndTopStart
import com.sdds.testing.compose.tooltip.TooltipMStrictTopCenterCenterStart
import com.sdds.testing.compose.tooltip.TooltipSLooseEndBottomStart
import com.sdds.testing.compose.tooltip.TooltipSStrictBottomStartTopCenter
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.tooltip.M
import com.sdkit.star.designsystem.styles.tooltip.S
import com.sdkit.star.designsystem.styles.tooltip.Tooltip
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeTooltipScreenshotTest : RoborazziConfigCompose("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMStrictBottomEndTopStart() {
        composeTestRule.content {
            TooltipMStrictBottomEndTopStart(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMStrictTopCenterCenterStart() {
        composeTestRule.content {
            TooltipMStrictTopCenterCenterStart(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipSLooseEndBottomStart() {
        composeTestRule.content {
            TooltipSLooseEndBottomStart(
                style = Tooltip.S.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipSStrictBottomStartTopCenter() {
        composeTestRule.content {
            TooltipSStrictBottomStartTopCenter(
                style = Tooltip.S.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMLooseTopEnd() {
        composeTestRule.content {
            TooltipMLooseTopEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMLooseStartCenter() {
        composeTestRule.content {
            TooltipMLooseStartCenter(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMLooseStartBottomCenter() {
        composeTestRule.content {
            TooltipMLooseStartBottomCenter(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMLooseStartCenterEnd() {
        composeTestRule.content {
            TooltipMLooseStartCenterEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMLooseStartCenterBottomEnd() {
        composeTestRule.content {
            TooltipMLooseStartCenterBottomEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @Test
    fun testTooltipMLooseTopEndNotVisible() {
        composeTestRule.content {
            TooltipMLooseTopEndNotVisible(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("Tooltip").assertIsNotDisplayed()
    }
}
