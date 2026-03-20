package com.sdds.serv

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.PopoverMAccentStrictTopCenterCenterStart
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseStartBottomCenter
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseStartCenter
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseStartCenterBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseStartCenterEnd
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseTopEnd
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultStrictBottomEndTopStart
import com.sdds.compose.uikit.fixtures.testcases.PopoverSAccentStrictBottomStartTopCenter
import com.sdds.compose.uikit.fixtures.testcases.PopoverSDefaultLooseEndBottomStart
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.popover.Accent
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import com.sdds.serv.styles.popover.S
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
