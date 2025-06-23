package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
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
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.S
import com.sdkit.star.designsystem.styles.popover.Accent
import com.sdkit.star.designsystem.styles.popover.Default
import com.sdkit.star.designsystem.styles.popover.M
import com.sdkit.star.designsystem.styles.popover.Popover
import com.sdkit.star.designsystem.styles.popover.S
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposePopoverScreenshotTest : RoborazziConfigCompose("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testPopoverMDefaultStrictBottomEndTopStart() {
        composeTestRule.content {
            PopoverMDefaultStrictBottomEndTopStart(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
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
                buttonStyle = BasicButton.S.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
