package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.toast.ToastTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.shadows.ShadowLooper

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemToastScreenshotTest(
    theme: String,
) : ToastTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultTopStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultTopStart(R.style.Serv_Sdds_ComponentOverlays_ToastRoundedDefault)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedNegativeTopCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedNegativeTopCenter(R.style.Serv_Sdds_ComponentOverlays_ToastRoundedNegative)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedPositiveTopEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedPositiveTopEnd(R.style.Serv_Sdds_ComponentOverlays_ToastRoundedPositive)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledDefaultCenterStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledDefaultCenterStart(R.style.Serv_Sdds_ComponentOverlays_ToastPilledDefault)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledNegativeCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledNegativeCenter(R.style.Serv_Sdds_ComponentOverlays_ToastPilledNegative)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledPositiveCenterEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledPositiveCenterEnd(R.style.Serv_Sdds_ComponentOverlays_ToastPilledPositive)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomStart(R.style.Serv_Sdds_ComponentOverlays_ToastRoundedDefault)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomCenter(R.style.Serv_Sdds_ComponentOverlays_ToastRoundedDefault)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomEnd(R.style.Serv_Sdds_ComponentOverlays_ToastRoundedDefault)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }
}
