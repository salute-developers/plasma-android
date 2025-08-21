package com.sdds.serv

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.loader.LoaderTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemLoaderScreenshotTest(
    theme: String,
) : LoaderTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testLoaderSpinner() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            loaderSpinner(R.style.Serv_Sdds_ComponentOverlays_Loader)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testLoaderProgress() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            loaderProgress(R.style.Serv_Sdds_ComponentOverlays_Loader)
        }
        captureScreenRoboImage()
    }
}
