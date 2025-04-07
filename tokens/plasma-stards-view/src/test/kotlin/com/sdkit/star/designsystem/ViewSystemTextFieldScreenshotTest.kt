package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.textfield.TextFieldTestCases
import com.sdkit.star.designsystem.colorstate.TextFieldColorState
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemTextFieldScreenshotTest : TextFieldTestCases("+night") {

    @Test
    fun testTextFieldMDefaultInnerLabel() {
        themedComponent {
            textFieldLDefaultInnerLeft(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    fun testTextFieldMDefaultOuterLabel() {
        themedComponent {
            textFieldMSuccessOuterLabel(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    fun testTextFieldSDefaultInnerLabel() {
        themedComponent {
            textFieldSWarningInnerRight(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldXsError() {
        themedComponent {
            textFieldXsError(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldXs,
                TextFieldColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextFieldSDefaultReadOnly() {
        themedComponent {
            textFieldSDefaultReadOnly(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    fun testTextFieldXSDefaultOuterLabel() {
        themedComponent {
            textFieldXSSuccessOuterLabel(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsOuterLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldLDisabled() {
        themedComponent {
            textFieldLDisabled(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldMErrorOuterLabel() {
        themedComponent {
            textFieldMErrorOuterLabel(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.ERROR,
            )
        }
    }

    @Test
    fun testTextFieldSDefaultInnerLabelFocused() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
        ) {
            textFieldSWarningInnerLabelRightFocused(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldLInputText() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
        ) {
            textFieldLInputText(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    fun testTextFieldMSuffixPrefix() {
        themedComponent {
            margins {
                textFieldLSuffixPrefix(
                    R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
                    TextFieldColorState.DEFAULT,
                )
            }
        }
    }

    @Test
    override fun testTextFieldTBTACyrillic() {
        themedComponent {
            textFieldTBTACyrillic(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextFieldLDisabledOuterLabelStart() {
        themedComponent {
            margins {
                textFieldLDisabledOuterLabelStart(
                    R.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
                    TextFieldColorState.DEFAULT,
                )
            }
        }
    }

    @Test
    override fun testTextFieldSuffixPrefixNoValue() {
        themedComponent {
            textFieldLSuffixPrefixNoValue(
                R.style.Sdkit_StarDs_ComponentOverlays_TextFieldM,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldLSuffixPrefix() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldLDefaultInnerLeft() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldMSuccessOuterLabel() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldSWarningInnerRight() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldMSuccessInnerLabelChips() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldSWarningInnerLabelRightFocused() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldSDefaultOuterLabelRightChips() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldXSSuccessOuterLabel() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldLSuccessRequiredOuterLabel() {
    }

    @Ignore("Not yet implemented")
    override fun testTextFieldMWarningInnerLabel() {
    }
}
