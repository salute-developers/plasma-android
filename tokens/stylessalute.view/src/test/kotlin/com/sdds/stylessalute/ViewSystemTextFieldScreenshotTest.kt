package com.sdds.stylessalute

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.stylessalute.colorstate.TextFieldColorState
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.textfield.TextFieldTestCases
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
) : TextFieldTestCases(theme) {

    @Test
    override fun testTextFieldLDefaultInnerLeft() {
        themedComponent {
            textFieldLDefaultInnerLeft(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldMSuccessOuterLabel() {
        themedComponent {
            textFieldMSuccessOuterLabel(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testTextFieldSWarningInnerRight() {
        themedComponent {
            textFieldSWarningInnerRight(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldXsError() {
        themedComponent {
            textFieldXsError(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXs,
                TextFieldColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextFieldLSuccessRequiredOuterLabel() {
        themedComponent {
            margins {
                textFieldLSuccessRequiredOuterLabel(
                    R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
                    TextFieldColorState.SUCCESS,
                )
            }
        }
        // TODO capture container
    }

    @Test
    override fun testTextFieldMWarningInnerLabel() {
        themedComponent {
            textFieldMWarningInnerLabel(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldSDefaultReadOnly() {
        themedComponent {
            textFieldSDefaultReadOnly(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldXSSuccessOuterLabel() {
        themedComponent {
            textFieldXSSuccessOuterLabel(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testTextFieldLDisabled() {
        themedComponent {
            textFieldLDisabled(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldMErrorOuterLabel() {
        themedComponent {
            textFieldMErrorOuterLabel(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextFieldSWarningInnerLabelRightFocused() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
        ) {
            textFieldSWarningInnerLabelRightFocused(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldMSuccessInnerLabelChips() {
        themedComponent {
            textFieldMSuccessInnerLabelChips(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testTextFieldSDefaultOuterLabelRightChips() {
        themedComponent {
            textFieldSDefaultOuterLabelRightChips(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldLInputText() {
        themedComponent {
            textFieldLInputText(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabel,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldLSuffixPrefix() {
        themedComponent {
            margins {
                textFieldLSuffixPrefix(
                    R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
                    TextFieldColorState.DEFAULT,
                )
            }
        }
    }

    @Test
    override fun testTextFieldTBTACyrillic() {
        themedComponent {
            textFieldTBTACyrillic(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldLDisabledOuterLabelStart() {
        themedComponent {
            margins {
                textFieldLDisabledOuterLabelStart(
                    R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
                    TextFieldColorState.DEFAULT,
                )
            }
        }
    }
}
