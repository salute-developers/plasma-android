package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.notification.NotificationTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.shadows.ShadowLooper

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemNotificationScreenshotTest(
    theme: String,
) : NotificationTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactLTopStartHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactLTopStartHasClose(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactMTopCenterHasCloseFocusable() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactMTopCenterHasCloseFocusable(
                R.style.Plasma_SdService_ComponentOverlays_NotificationCompactM,
            )
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactSTopEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactSTopEnd(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactS)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactLCenterStartHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactLCenterStartHasClose(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseLCenterHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseLCenterHasClose(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseMCenterEndHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseMCenterEndHasClose(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseSBottomStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseSBottomStart(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseBottomCenterHasCloseFocusable() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseBottomCenterHasCloseFocusable(
                R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL,
            )
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseLBottomEndHasClose() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseLBottomEndHasClose(R.style.Plasma_SdService_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }
}
