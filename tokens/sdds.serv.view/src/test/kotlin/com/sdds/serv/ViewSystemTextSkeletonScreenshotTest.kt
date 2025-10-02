package com.sdds.serv

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.skeleton.TextSkeletonTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemTextSkeletonScreenshotTest(
    theme: String,
) : TextSkeletonTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTextSkeletonDefaultNoTextRandom() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Serv_Sdds_ComponentOverlays_TextSkeletonDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTextSkeletonDefaultFullWidth() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountTenTextFullWidth(R.style.Serv_Sdds_ComponentOverlays_TextSkeletonDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTextSkeletonLighterNoTextRandom() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Serv_Sdds_ComponentOverlays_TextSkeletonLighter)
        }
        captureScreenRoboImage()
    }

    override fun testTextSkeleton() {
        TODO("Not yet implemented")
    }
}
