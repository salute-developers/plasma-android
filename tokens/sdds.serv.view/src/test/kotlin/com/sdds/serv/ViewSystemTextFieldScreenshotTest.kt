package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.serv.colorstate.TextFieldColorState
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
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldMSuccessOuterLabel() {
        themedComponent {
            textFieldMSuccessOuterLabel(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testTextFieldSWarningInnerRight() {
        themedComponent {
            textFieldSWarningInnerRight(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldXsError() {
        themedComponent {
            textFieldXsError(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldXs,
                TextFieldColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextFieldLSuccessRequiredOuterLabel() {
        themedComponent {
            margins {
                textFieldLSuccessRequiredOuterLabel(
                    R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
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
                R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldSDefaultReadOnly() {
        themedComponent {
            textFieldSDefaultReadOnly(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldXSSuccessOuterLabel() {
        themedComponent {
            textFieldXSSuccessOuterLabel(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testTextFieldLDisabled() {
        themedComponent {
            textFieldLDisabled(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldMErrorOuterLabel() {
        themedComponent {
            textFieldMErrorOuterLabel(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabel,
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
                R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldMSuccessInnerLabelChips() {
        themedComponent {
            textFieldMSuccessInnerLabelChips(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testTextFieldSDefaultOuterLabelRightChips() {
        themedComponent {
            textFieldSDefaultOuterLabelRightChips(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldLInputText() {
        themedComponent {
            textFieldLInputText(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabel,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextFieldLSuffixPrefix() {
        themedComponent {
            margins {
                textFieldLInputText(
                    R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
                    TextFieldColorState.DEFAULT,
                )
            }
        }
        // TODO capture container
    }
}
