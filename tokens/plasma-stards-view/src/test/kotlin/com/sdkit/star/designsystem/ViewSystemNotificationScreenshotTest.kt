package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.notification.NotificationTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.shadows.ShadowLooper

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemNotificationScreenshotTest : NotificationTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactLTopStartHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactLTopStartHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactMTopCenterHasCloseFocusable() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactMTopCenterHasCloseFocusable(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactM)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactSTopEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactSTopEnd(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactS)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactLCenterStartHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactLCenterStartHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseLCenterHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseLCenterHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseMCenterEndHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseMCenterEndHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseSBottomStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseSBottomStart(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseBottomCenterHasCloseFocusable() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseBottomCenterHasCloseFocusable(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseLBottomEndHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseLBottomEndHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }
}
