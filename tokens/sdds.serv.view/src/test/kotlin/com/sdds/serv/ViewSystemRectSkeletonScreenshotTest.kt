package com.sdds.serv

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.uikit.fixtures.SDK_NUMBER
import com.sdds.uikit.fixtures.testcases.RectSkeletonTestCases
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
            rectSkeletonTest(style = R.style.Serv_Sdds_ComponentOverlays_RectSkeletonDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testRectSkeletonLighter() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            rectSkeletonTest(style = R.style.Serv_Sdds_ComponentOverlays_RectSkeletonLighter)
        }
        captureScreenRoboImage()
    }
}
