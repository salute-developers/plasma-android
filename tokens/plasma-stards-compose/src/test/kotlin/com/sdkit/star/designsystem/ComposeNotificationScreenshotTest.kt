package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.notification.NotificationCompactLCenterStartNoTextHasClose
import com.sdds.testing.compose.notification.NotificationCompactLTopStartHasCloseText
import com.sdds.testing.compose.notification.NotificationCompactMTopCenterHasCloseActionButton
import com.sdds.testing.compose.notification.NotificationCompactSTopEndText
import com.sdds.testing.compose.notification.NotificationLooseLBottomCenterTextHasClose
import com.sdds.testing.compose.notification.NotificationLooseLBottomEndTextHasCloseActionButton
import com.sdds.testing.compose.notification.NotificationLooseLCenterTextHasClose
import com.sdds.testing.compose.notification.NotificationLooseMCenterEndTextHasClose
import com.sdds.testing.compose.notification.NotificationLooseSBottomStartText
import com.sdds.testing.vs.SDK_NUMBER
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
