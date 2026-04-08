package com.sdkit.star.designsystem

import android.os.Looper
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.uikit.fixtures.SDK_NUMBER
import com.sdds.uikit.fixtures.samples.RoborazziConfigDocsXml
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemDocScreenshotTest(viewSample: ViewSampleInfo) :
    RoborazziConfigDocsXml(viewSample) {

    @Test
    fun docs_view_screenshot_test() {
        try {
            themedComponentStyleProvided(
                sampleId = viewSample.id,
                factory = {
                    viewSample.sample.reference(context)
                },
            )
            shadowOf(Looper.getMainLooper()).idle()
            shadowOf(Looper.getMainLooper()).runToEndOfTasks()
        } catch (e: Throwable) {
            throw AssertionError("FAILED: ${viewSample.id}", e)
        }
    }
}
