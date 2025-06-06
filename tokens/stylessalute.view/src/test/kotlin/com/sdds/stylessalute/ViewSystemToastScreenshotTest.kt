package com.sdds.stylessalute

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
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultTopStart(R.style.Salute_StylesSalute_ComponentOverlays_ToastRounded)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedNegativeTopCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedNegativeTopCenter(R.style.Salute_StylesSalute_ComponentOverlays_ToastRounded)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedPositiveTopEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedPositiveTopEnd(R.style.Salute_StylesSalute_ComponentOverlays_ToastRounded)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledDefaultCenterStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledDefaultCenterStart(R.style.Salute_StylesSalute_ComponentOverlays_ToastPilled)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledNegativeCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledNegativeCenter(R.style.Salute_StylesSalute_ComponentOverlays_ToastPilled)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledPositiveCenterEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledPositiveCenterEnd(R.style.Salute_StylesSalute_ComponentOverlays_ToastPilled)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomStart(R.style.Salute_StylesSalute_ComponentOverlays_ToastRounded)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomCenter(R.style.Salute_StylesSalute_ComponentOverlays_ToastRounded)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomEnd(R.style.Salute_StylesSalute_ComponentOverlays_ToastRounded)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        Thread.sleep(1000)
        captureScreenRoboImage()
    }
}
