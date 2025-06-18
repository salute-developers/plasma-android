package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
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
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactLTopStartHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactMTopCenterHasCloseFocusable() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactMTopCenterHasCloseFocusable(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactM)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactSTopEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactSTopEnd(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactS)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationCompactLCenterStartHasClose() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationCompactLCenterStartHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseLCenterHasClose() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseLCenterHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseMCenterEndHasClose() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseMCenterEndHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseSBottomStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseSBottomStart(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseBottomCenterHasCloseFocusable() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseBottomCenterHasCloseFocusable(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testNotificationLooseLBottomEndHasClose() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            notificationLooseLBottomEndHasClose(R.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(100)
        captureScreenRoboImage()
    }
}
