package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.checkbox.CheckBoxUiState
import com.sdds.playground.sandbox.checkbox.CheckBoxVariant
import com.sdds.uikit.CheckBox
import org.hamcrest.Matchers.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCheckBoxScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testCheckBoxSizeM() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxM,
                state = CheckBox.ToggleableState.ON,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxSizeMUnchecked() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxM,
                state = CheckBox.ToggleableState.OFF,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxNoLabelAndDesc() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxM,
                state = CheckBox.ToggleableState.ON,
                label = "",
                description = "",
                enabled = true,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxMediumNoDesc() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxM,
                state = CheckBox.ToggleableState.ON,
                label = "Label",
                description = "",
                enabled = true,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxMediumNoLabel() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxM,
                state = CheckBox.ToggleableState.ON,
                label = "",
                description = "Description",
                enabled = false,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxDisabled() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxS,
                state = CheckBox.ToggleableState.INDETERMINATE,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxSizeSDark() {
        launchScreen(
            R.id.nav_checkbox,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxS,
                state = CheckBox.ToggleableState.ON,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )
        onView(withId(R.id.checkBox))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxGroupSizeM() {
        launchScreen(
            R.id.nav_checkbox_group,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxM,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(allOf(withId(0), withText("Label")))
            .perform(click())
        onView(withId(R.id.checkBox_group))
            .captureRoboImage()
    }

    @Test
    fun testCheckBoxGroupSizeS() {
        launchScreen(
            R.id.nav_checkbox_group,
            CheckBoxUiState(
                variant = CheckBoxVariant.CheckBoxS,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.checkBox_group))
            .perform(click())
        onView(withId(R.id.checkBox_group))
            .captureRoboImage()
    }
}
