package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.toast.ToastTestCases
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemToastScreenshotTest(
    theme: String,
) : ToastTestCases(theme) {

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultTopStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultTopStart(R.style.Plasma_SdService_ComponentOverlays_ToastRoundedDefault)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedNegativeTopCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedNegativeTopCenter(R.style.Plasma_SdService_ComponentOverlays_ToastRoundedNegative)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedPositiveTopEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedPositiveTopEnd(R.style.Plasma_SdService_ComponentOverlays_ToastRoundedPositive)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledDefaultCenterStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledDefaultCenterStart(R.style.Plasma_SdService_ComponentOverlays_ToastPilledDefault)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledNegativeCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledNegativeCenter(R.style.Plasma_SdService_ComponentOverlays_ToastPilledNegative)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastPilledPositiveCenterEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastPilledPositiveCenterEnd(R.style.Plasma_SdService_ComponentOverlays_ToastPilledPositive)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomStart() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomStart(R.style.Plasma_SdService_ComponentOverlays_ToastRoundedDefault)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomCenter(R.style.Plasma_SdService_ComponentOverlays_ToastRoundedDefault)
        }
        captureScreenRoboImage()
    }

    @Ignore("Need disable animation to capture screenshot")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testToastRoundedDefaultBottomEnd() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            toastRoundedDefaultBottomEnd(R.style.Plasma_SdService_ComponentOverlays_ToastRoundedDefault)
        }
        captureScreenRoboImage()
    }
}
