package com.sdds.playground.sandbox.vs

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.textfield.vs.ExampleChipData
import com.sdds.playground.sandbox.textfield.vs.TextAreaVariant
import com.sdds.playground.sandbox.textfield.vs.TextFieldUiState
import com.sdds.uikit.TextField
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
    fun testTextAreaLDefaultInnerRequiredLeft() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLInnerLabelRequiredStart,
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
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaMSuccessOuter() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMOuterLabel,
                state = TextField.FieldState.Positive,
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
            .captureRoboImage()
    }

    @Test
    fun testTextAreaSWarningInnerRequiredRight() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaSInnerLabelRequiredEnd,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                captionText = "",
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
    fun testTextAreaXsError() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaXS,
                state = TextField.FieldState.Negative,
                labelText = "",
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
            .captureRoboImage()
    }

    @Test
    fun testTextAreaLReadOnly() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLOuterLabelRequiredStart,
                state = TextField.FieldState.Positive,
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                captionText = "",
                counterText = "",
                icon = false,
                action = true,
                enabled = true,
                readOnly = true,
                prefix = "",
                suffix = "",
                hasChips = false,
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaMWarningInner() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMInnerLabel,
                state = TextField.FieldState.Warning,
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
    fun testTextAreaSDefaultInnerRight() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaSInnerLabelRequiredEnd,
                state = TextField.FieldState.Default,
                labelText = "",
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
            .captureRoboImage()
    }

    @Test
    fun testTextAreaXSSuccessOuter() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaXSOuterLabel,
                state = TextField.FieldState.Positive,
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
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaLDisabled() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLInnerLabelRequiredStart,
                state = TextField.FieldState.Default,
                labelText = "Label",
                placeholderText = "",
                valueText = "",
                captionText = "",
                counterText = "",
                icon = false,
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
    fun testTextAreaMErrorOuter() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMOuterLabel,
                state = TextField.FieldState.Negative,
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
                hasChips = false,
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaSFocused() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaSInnerLabelRequiredEnd,
                state = TextField.FieldState.Warning,
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
                hasChips = true,
            ),
        )
        onView(withId(R.id.textField))
            .perform(click())
        onView(withId(R.id.textField))
            .captureRoboImage()
    }

    @Test
    fun testTextAreaMSuccessChipsInner() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaMInnerLabel,
                state = TextField.FieldState.Positive,
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
    fun testTextAreaSDefaultChipsOuterRight() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaSOuterLabelRequiredEnd,
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

    @Test
    fun testTextAreaTextSLongText() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaSInnerLabel,
                state = TextField.FieldState.Warning,
                labelText = "Label",
                placeholderText = "Placeholder",
                valueText = "O Captain! my Captain! our fearful trip is done,\n" +
                    "The ship has weather’d every rack, the prize we sought is won,\n" +
                    "The port is near, the bells I hear, the people all exulting,\n" +
                    "While follow eyes the steady keel, the vessel grim and daring;\n" +
                    "But O heart! heart! heart!\n" +
                    "O the bleeding drops of red,\n" +
                    "Where on the deck my Captain lies,\n" +
                    "                                  Fallen cold and dead.",
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
            .captureRoboImage()
    }

    @Test
    fun testTextAreaLDefaultTBTA() {
        launchScreen(
            R.id.nav_textarea,
            TextFieldUiState(
                variant = TextAreaVariant.TextAreaLInnerLabelRequiredEnd,
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
                prefix = "TB1!",
                suffix = "TB2@",
                hasChips = false,
            ),
        )
        onView(withId(R.id.textField))
            .captureRoboImage()
    }
}
