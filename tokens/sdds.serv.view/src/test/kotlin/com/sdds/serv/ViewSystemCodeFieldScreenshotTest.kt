package com.sdds.serv

import android.view.KeyEvent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressKey
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.codefield.CodeFieldTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCodeFieldScreenshotTest(
    theme: String,
) : CodeFieldTestCases(theme) {

    @Test
    override fun testCodeFieldLDefaultCodeLengthFour() {
        themedComponent(
            action = {
                onView((withId(it.id)))
                    .perform(click())
            },
        ) {
            codeFieldCodeLengthFour(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldMSegmented() {
        themedComponent {
            codeFieldCodeLengthFiveCaptionCenter(R.style.Serv_Sdds_ComponentOverlays_CodeFieldMSegmented)
        }
    }

    @Test
    override fun testCodeeFieldLCodeLengthSixNoCaption() {
        themedComponent(
            action = {
                onView((withId(it.id)))
                    .perform(click())
            },
        ) {
            codeFieldCodeLengthSixNoCaption(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldMSegmentedCodeLengthSix() {
        themedComponent(
            action = {
                onView((withId(it.id)))
                    .perform(click())
            },
        ) {
            codeFieldCodeLengthSix(R.style.Serv_Sdds_ComponentOverlays_CodeFieldMSegmented)
        }
    }

    @Test
    override fun testCodeFieldLHiddenCode() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(pressKey(KeyEvent.KEYCODE_1))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_4))
            },
        ) {
            codeFieldCodeHidden(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldLInputWrongCode() {
        themedComponent(
            action = {
                onView(withId(it.id)).apply {
                    repeat(4) {
                        perform(click())
                        perform(pressKey(KeyEvent.KEYCODE_2))
                    }
                }
            },
        ) {
            codeFieldCodeLengthFourKeep(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldLInputLetter() {
        themedComponent(
            action = {
                onView((withId(it.id)))
                    .perform(click())
                    .perform(pressKey(KeyEvent.KEYCODE_Q))
            },
        ) {
            codeFieldCodeLengthFourKeep(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldLongText() {
        themedComponent {
            codeFieldCodeLongText(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldLInputWrongCodeRemove() {
        themedComponent(
            action = {
                onView(withId(it.id)).apply {
                    repeat(4) {
                        perform(click())
                        perform(pressKey(KeyEvent.KEYCODE_2))
                    }
                }
            },
        ) {
            codeFieldCodeLengthFourRemove(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldDisabled() {
        themedComponent(
            action = {
                onView((withId(it.id)))
                    .perform(click())
            },
        ) {
            codeFieldDisabled(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }

    @Test
    override fun testCodeFieldLInputCorrectCode() {
        themedComponent(
            action = {
                onView((withId(it.id)))
                    .perform(click())
                    .perform(pressKey(KeyEvent.KEYCODE_1))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_4))
            },
        ) {
            codeFieldCodeLengthFourKeep(R.style.Serv_Sdds_ComponentOverlays_CodeFieldL)
        }
    }
}
