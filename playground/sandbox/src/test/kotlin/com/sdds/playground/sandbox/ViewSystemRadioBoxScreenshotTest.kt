package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.radiobox.RadioBoxUiState
import com.sdds.playground.sandbox.radiobox.RadioBoxVariant
import org.hamcrest.core.AllOf.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemRadioBoxScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

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

    @Test
    fun testRadioBoxSizeS() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxS,
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
    fun testRadioBoxSizeMNoDescription() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = true,
                label = "Label",
                description = "",
                enabled = true,
            ),
        )
        onView(withId(R.id.radioBox))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxDisabled() {
        launchScreen(
            R.id.nav_radiobox,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = true,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )
        onView(withId(R.id.radioBox))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxGroupSizeM() {
        launchScreen(
            R.id.nav_radiobox_group,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = false,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(allOf(withId(0)))
            .perform(click())
        onView(withId(R.id.radioBox_group))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxGroupSizeS() {
        launchScreen(
            R.id.nav_radiobox_group,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxS,
                checked = true,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(allOf(withId(1)))
            .perform(click())
        onView(withId(R.id.radioBox_group))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxGroupSizeMDescription() {
        launchScreen(
            R.id.nav_radiobox_group,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxM,
                checked = false,
                label = "",
                description = "Description",
                enabled = true,
            ),
        )
        onView(allOf(withId(0)))
            .perform(click())
        onView(withId(R.id.radioBox_group))
            .captureRoboImage()
    }

    @Test
    fun testRadioBoxGroupSizeSLabel() {
        launchScreen(
            R.id.nav_radiobox_group,
            RadioBoxUiState(
                variant = RadioBoxVariant.RadioBoxS,
                checked = false,
                label = "Label",
                description = "",
                enabled = true,
            ),
        )
        onView(allOf(withId(1)))
            .perform(click())
        onView(withId(R.id.radioBox_group))
            .captureRoboImage()
    }
}
