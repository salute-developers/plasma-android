package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.samples.RoborazziConfigDocs
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
            ifNeedScreenshot()
        } catch (e: Throwable) {
            throw AssertionError(
                "Screenshot test failed: \n${composableSample.id}",
                e,
            )
        }
    }
}
