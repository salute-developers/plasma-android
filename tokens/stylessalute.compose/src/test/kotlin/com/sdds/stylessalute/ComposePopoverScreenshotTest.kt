package com.sdds.stylessalute

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.basicbutton.BasicButton
import com.sdds.stylessalute.styles.basicbutton.Default
import com.sdds.stylessalute.styles.basicbutton.S
import com.sdds.stylessalute.styles.popover.Accent
import com.sdds.stylessalute.styles.popover.Default
import com.sdds.stylessalute.styles.popover.M
import com.sdds.stylessalute.styles.popover.Popover
import com.sdds.stylessalute.styles.popover.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.popover.PopoverMAccentStrictTopCenterCenterStart
import com.sdds.testing.compose.popover.PopoverMDefaultLooseStartBottomCenter
import com.sdds.testing.compose.popover.PopoverMDefaultLooseStartCenter
import com.sdds.testing.compose.popover.PopoverMDefaultLooseStartCenterBottomEnd
import com.sdds.testing.compose.popover.PopoverMDefaultLooseStartCenterEnd
import com.sdds.testing.compose.popover.PopoverMDefaultLooseTopEnd
import com.sdds.testing.compose.popover.PopoverMDefaultStrictBottomEndTopStart
import com.sdds.testing.compose.popover.PopoverSAccentStrictBottomStartTopCenter
import com.sdds.testing.compose.popover.PopoverSDefaultLooseEndBottomStart
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposePopoverScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultStrictBottomEndTopStart() {
        composeTestRule.content {
            PopoverMDefaultStrictBottomEndTopStart(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMAccentStrictTopCenterCenterStart() {
        composeTestRule.content {
            PopoverMAccentStrictTopCenterCenterStart(
                style = Popover.M.Accent.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverSDefaultLooseEndBottomStart() {
        composeTestRule.content {
            PopoverSDefaultLooseEndBottomStart(
                style = Popover.S.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverSAccentStrictBottomStartTopCenter() {
        composeTestRule.content {
            PopoverSAccentStrictBottomStartTopCenter(
                style = Popover.S.Accent.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultLooseStartCenter() {
        composeTestRule.content {
            PopoverMDefaultLooseStartCenter(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultLooseStartBottomCenter() {
        composeTestRule.content {
            PopoverMDefaultLooseStartBottomCenter(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @Ignore
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultLooseTopEnd() {
        composeTestRule.content {
            PopoverMDefaultLooseTopEnd(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultLooseStartCenterEnd() {
        composeTestRule.content {
            PopoverMDefaultLooseStartCenterEnd(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultLooseStartCenterBottomEnd() {
        composeTestRule.content {
            PopoverMDefaultLooseStartCenterBottomEnd(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
