package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.NotificationCompactLCenterStartNoTextHasClose
import com.sdds.compose.uikit.fixtures.testcases.NotificationCompactLTopStartHasCloseText
import com.sdds.compose.uikit.fixtures.testcases.NotificationCompactMTopCenterHasCloseActionButton
import com.sdds.compose.uikit.fixtures.testcases.NotificationCompactSTopEndText
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseLBottomCenterTextHasClose
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseLBottomEndTextHasCloseActionButton
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseLCenterTextHasClose
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseMCenterEndTextHasClose
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseSBottomStartText
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.notification.L
import com.sdkit.star.designsystem.styles.notification.M
import com.sdkit.star.designsystem.styles.notification.NotificationCompact
import com.sdkit.star.designsystem.styles.notification.NotificationLoose
import com.sdkit.star.designsystem.styles.notification.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeNotificationScreenshotTest : RoborazziConfigCompose("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationCompactLTopStartHasContentStartEnd() {
        composeTestRule.content {
            NotificationCompactLTopStartHasCloseText(
                NotificationCompact.L.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationCompactMTopCenterHasCloseActionButton() {
        composeTestRule.content {
            NotificationCompactMTopCenterHasCloseActionButton(
                NotificationCompact.M.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationCompactSTopEndText() {
        composeTestRule.content {
            NotificationCompactSTopEndText(
                NotificationCompact.S.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationCompactLCenterStartNoTextHasClose() {
        composeTestRule.content {
            NotificationCompactLCenterStartNoTextHasClose(
                NotificationCompact.L.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationLooseLCenterTextHasClose() {
        composeTestRule.content {
            NotificationLooseLCenterTextHasClose(
                NotificationLoose.L.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationLooseMCenterEndTextHasClose() {
        composeTestRule.content {
            NotificationLooseMCenterEndTextHasClose(
                NotificationLoose.M.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationLooseSBottomStartText() {
        composeTestRule.content {
            NotificationLooseSBottomStartText(
                NotificationLoose.S.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationLooseLBottomCenterTextHasClose() {
        composeTestRule.content {
            NotificationLooseLBottomCenterTextHasClose(
                NotificationLoose.L.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testNotificationLooseLBottomEndTextHasCloseActionButton() {
        composeTestRule.content {
            NotificationLooseLBottomEndTextHasCloseActionButton(
                NotificationLoose.L.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
