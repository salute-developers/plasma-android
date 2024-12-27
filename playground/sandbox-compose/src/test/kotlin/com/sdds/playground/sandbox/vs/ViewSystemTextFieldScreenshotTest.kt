package com.sdds.playground.sandbox.vs

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.textfield.vs.ExampleChipData
import com.sdds.playground.sandbox.textfield.vs.TextFieldUiState
import com.sdds.playground.sandbox.textfield.vs.TextFieldVariant
import com.sdds.uikit.TextField
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemTextFieldScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testTextFieldLDefaultInnerLeft() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLInnerLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                valueText = "Value",
                captionText = "Caption",
                placeholderText = "",
                icon = true,
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

    @Test
    fun testTextFieldMSuccessOuterLabel() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldMOuterLabel,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                valueText = "",
                captionText = "Caption",
                placeholderText = "Placeholder",
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

    @Test
    fun testTextFieldSWarningInnerRight() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSInnerLabelRequiredEnd,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                valueText = "",
                captionText = "Caption",
                placeholderText = "Placeholder",
                icon = true,
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
    fun testTextFieldXsError() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXS,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                valueText = "",
                captionText = "Caption",
                placeholderText = "Placeholder",
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
    fun testTextFieldLSuccessRequiredOuterLabel() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLOuterLabelRequiredStart,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
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
    fun testTextFieldMWarningInnerLabel() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldMInnerLabel,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
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

    @Test
    fun testTextFieldSDefaultReadOnly() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSInnerLabelRequiredEnd,
                state = TextField.FieldState.Default,
                labelText = "",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
                action = true,
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
    fun testTextFieldXSSuccessOuterLabel() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXSOuterLabel,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
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

    @Test
    fun testTextFieldLDisabled() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLInnerLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "",
                icon = true,
                action = true,
                enabled = false,
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
    fun testTextFieldMErrorOuterLabel() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldMOuterLabel,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
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

    @Test
    fun testTextFieldSWarningInnerLabelRightFocused() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSInnerLabelRequiredEnd,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                valueText = "Value",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
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
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldMSuccessInnerLabelChips() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldMInnerLabel,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                icon = true,
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
    fun testTextFieldSDefaultOuterLabelRightChips() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSOuterLabelRequiredEnd,
                state = TextField.FieldState.Default,
                labelText = "Label",
                valueText = "",
                placeholderText = "Placeholder",
                captionText = "Caption",
                icon = true,
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
    fun testTextFieldLInputText() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLInnerLabel,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                placeholderText = "",
                valueText = "абвгдежзabcdefg@#643!#\$",
                captionText = "",
                icon = true,
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
    fun testTextFieldLSuffixPrefix() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLOuterLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                valueText = "Value",
                placeholderText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                hasChips = false,
                prefix = "TB Prefix",
                suffix = "TA Suffix",
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }
}
