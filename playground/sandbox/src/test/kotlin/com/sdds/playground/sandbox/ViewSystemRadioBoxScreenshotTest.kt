package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.radiobox.RadioBoxUiState
import com.sdds.playground.sandbox.radiobox.RadioBoxVariant
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemRadioBoxScreenshotTest : RoborazziConfig() {

    @Test
    fun testRadioBoxSizeM() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = true,
                label = "label",
                description = "description",
                enabled = true,
            ),
        )
        onView(withId(R.id.radioBox))
            .captureRoboImage()
    }

    @Config(qualifiers = "+night")
    @Test
    fun testRadioBoxSizeS() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxS,
                checked = true,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.radioBox))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxUnchecked() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = false,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.radioBox))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxOff() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = false,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )
        onView(withId(R.id.radioBox))
            .captureRoboImage()
    }
}
