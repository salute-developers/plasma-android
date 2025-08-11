package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.loader.LoaderTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemLoaderScreenshotTest : LoaderTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testLoaderSpinner() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            loaderSpinner(R.style.Sdkit_StarDs_ComponentOverlays_Loader)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testLoaderProgress() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            loaderProgress(R.style.Sdkit_StarDs_ComponentOverlays_Loader)
        }
        captureScreenRoboImage()
    }
}
