package com.sdds.plasma.sd.service

import android.view.ViewGroup
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.overlay.OverlayTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemOverlayScreenshotTest(
    theme: String,
) : OverlayTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testOverlay() {
        themedComponent(
            action = { container ->
                val triggerButton = (container as ViewGroup).getChildAt(0)
                triggerButton.performClick()
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            overlayBase(R.style.Plasma_SdService_ComponentOverlays_OverlayView)
        }
        captureScreenRoboImage()
    }
}
