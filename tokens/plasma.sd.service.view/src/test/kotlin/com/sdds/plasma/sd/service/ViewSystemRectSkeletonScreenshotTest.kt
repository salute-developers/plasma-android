package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.skeleton.RectSkeletonTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemRectSkeletonScreenshotTest(
    theme: String,
) : RectSkeletonTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testRectSkeleton() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            rectSkeletonTest(style = R.style.Plasma_SdService_ComponentOverlays_RectSkeleton)
        }
        captureScreenRoboImage()
    }
}
