package com.sdds.serv

import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.compose.uikit.fixtures.samples.RoborazziConfigDocs
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeDocScreenshotTest(composableSample: ComposableSampleInfo) : RoborazziConfigDocs(composableSample) {

    @Test
    fun docs_screenshot_test() {
        try {
            composeTestRule.content {
                composableSample.sample.reference.invoke()
            }
            composeTestRule.waitForIdle()
            composeTestRule.onRoot().captureRoboImage()
        } catch (e: Throwable) {
            throw AssertionError(
                "Screenshot test failed: \n${composableSample.id}",
                e,
            )
        }
    }
}
