package com.sdds.playground.sandbox

import android.view.KeyEvent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressKey
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.textfield.ExampleChipData
import com.sdds.playground.sandbox.textfield.TextFieldUiState
import com.sdds.playground.sandbox.textfield.TextFieldVariant
import com.sdds.uikit.TextField
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemTextFieldScreenshotTest : RoborazziConfig() {

    @Config(qualifiers = "+night")
    @Test
    fun testTextFieldXs() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXSOuterLabelRequiredEnd,
                state = TextField.FieldState.Default,
                labelText = "Label",
                hasChips = true,
                placeholderText = "Placeholder",
                valueText = "",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
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
    fun testTextFieldXsError() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXSOuterLabel, // no optional
                state = TextField.FieldState.Negative,
                labelText = "Label",
                hasChips = true,
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                icon = true,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldLSuccess() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLOuterLabelRequiredStart,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "Value",
                captionText = "",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldMWarning() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldMOuterLabelRequiredEnd,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "Value",
                captionText = "",
                counterText = "",
                icon = true,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
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
                variant = TextFieldVariant.TextFieldMInnerLabel,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "абвгдежзabcdefg@#643!#\$",
                captionText = "",
                icon = true,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldSDisabled() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSInnerLabelRequiredEnd,
                state = TextField.FieldState.Default,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "Value",
                captionText = "",
                icon = true,
                action = true,
                enabled = false,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldSSuccess() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSOuterLabelRequiredEnd,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                hasChips = true,
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldSReadOnly() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldSInnerLabelRequiredStart,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "Value",
                captionText = "Caption",
                icon = true,
                action = false,
                enabled = true,
                readOnly = true,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldXsInputText() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXSOuterLabelRequiredEnd,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "абвгдежзabcdefg@#643!#\$",
                captionText = "",
                icon = false,
                action = false,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldXsDotBadgeOutside() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXSOuterLabelRequiredStart,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                hasChips = true,
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldDotBadgeInside() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldMInnerLabelRequiredEnd,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                hasChips = true,
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
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
    fun testTextFieldXsChipsInside() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldXSOuterLabel,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                hasChips = true,
                placeholderText = "Placeholder",
                valueText = "Value",
                captionText = "Caption",
                icon = false,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
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
    fun testTextFieldLSuffixPrefix() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLInnerLabel,
                state = TextField.FieldState.Default,
                labelText = "Label",
                hasChips = true,
                placeholderText = "",
                valueText = "Value",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "TB Prefix",
                suffix = "TA Suffix",
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldFocused() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLInnerLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                hasChips = false,
                placeholderText = "Placeholder",
                valueText = "",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .perform(click())
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextFieldTextDeletes() {
        launchScreen(
            R.id.nav_textfield,
            TextFieldUiState(
                variant = TextFieldVariant.TextFieldLInnerLabelRequiredEnd,
                state = TextField.FieldState.Negative,
                labelText = "Label",
                hasChips = false,
                placeholderText = "",
                valueText = "Value",
                captionText = "Caption",
                icon = true,
                action = true,
                enabled = true,
                readOnly = false,
                prefix = "",
                suffix = "",
            ),
        )
        onView(withId(R.id.textField))
            .perform(click())
            .perform(pressKey(KeyEvent.KEYCODE_DEL))
        onView(withId(R.id.textField))
            .captureRoboImage()
    }
}
