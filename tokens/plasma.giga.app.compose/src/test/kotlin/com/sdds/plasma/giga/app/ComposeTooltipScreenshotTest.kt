package com.sdds.plasma.giga.app

import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.app.styles.basicbutton.Default
import com.sdds.plasma.giga.app.styles.basicbutton.L
import com.sdds.plasma.giga.app.styles.tooltip.M
import com.sdds.plasma.giga.app.styles.tooltip.S
import com.sdds.plasma.giga.app.styles.tooltip.Tooltip
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
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTooltipScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTooltipMStrictBottomEndTopStart() {
        composeTestRule.content {
            TooltipMStrictBottomEndTopStart(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
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
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("Tooltip").assertIsNotDisplayed()
    }
}
