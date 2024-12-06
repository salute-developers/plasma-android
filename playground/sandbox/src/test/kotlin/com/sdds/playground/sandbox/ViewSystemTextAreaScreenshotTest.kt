package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.textfield.ExampleChipData
import com.sdds.playground.sandbox.textfield.TextAreaVariant
import com.sdds.playground.sandbox.textfield.TextFieldUiState
import com.sdds.uikit.TextField
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemTextAreaScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testTextAreaL() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLOuterLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaM() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMInnerLabelRequiredEnd,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaS() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaS,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                placeholderText = "Placeholder",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = true,
                chipData = listOf(
                    ExampleChipData(text = "Chip"),
                    ExampleChipData(text = "Chip"),
                ),
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaXs() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaXSOuterLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.textField))
            .perform(click())
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Ignore("Red indicator is not visible. Generate screen after fix")
    @Test
    fun testTextAreaDisabled() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLOuterLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = false,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaReadOnly() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMOuterLabel,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                counterText = "Caption",
                icon = false,
                action = false,
                enabled = true,
                readOnly = true,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaFocused() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaSInnerLabelRequiredEnd,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                placeholderText = "Placeholder",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = true,
                chipData = listOf(
                    ExampleChipData(text = "Chip"),
                    ExampleChipData(text = "Chip"),
                ),
            ),
        )
        onView(withId(R.id.textField))
            .perform(click())
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaTitleInsideNotVisible() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaXS,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Ignore("Red indicator goes beyond container. Generate screen after fix")
    @Test
    fun testTextAreaTextMovesToNextLines() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMOuterLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "O Captain! my Captain! our fearful " +
                    "trip is done,\n" +
                    "The ship has weather’d every rack, " +
                    "the prize we sought is won",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaTitleNotDisplayedWithChips() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLInnerLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                counterText = "Counter",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
                hasChips = true,
                chipData = listOf(
                    ExampleChipData(text = "Chip"),
                    ExampleChipData(text = "Chip"),
                ),
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }
}
