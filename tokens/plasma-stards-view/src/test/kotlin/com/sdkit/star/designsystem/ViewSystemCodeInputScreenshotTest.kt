package com.sdkit.star.designsystem

import android.view.KeyEvent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressKey
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.codeinput.CodeInputTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemCodeInputScreenshotTest : CodeInputTestCases("+night") {

    @Test
    override fun testCodeInputLCodeLengthFourCaptionLeft() {
        themedComponent {
            codeInputCodeLengthFourCaptionLeft(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }

    @Test
    override fun testCodeInputMCodeLengthFiveCaptionCenter() {
        themedComponent {
            codeInputCodeLengthFiveCaptionCenter(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputM)
        }
    }

    @Test
    override fun testCodeInputSCodeLengthSixCaptionCenter() {
        themedComponent {
            codeInputCodeLengthSixCaptionCenter(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputS)
        }
    }

    @Test
    override fun testCodeInputLCodeLengthSixNoCaption() {
        themedComponent {
            codeInputCodeLengthSixNoCaption(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }

    @Test
    override fun testCodeInputCodeMLengthSixHidden() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(pressKey(KeyEvent.KEYCODE_1))
            },
        ) {
            codeInputCodeLengthSixHidden(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputM)
        }
    }

    @Test
    override fun testCodeInputLCodeLengthSixRemoveSymbol() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(pressKey(KeyEvent.KEYCODE_Q))
            },
        ) {
            codeInputCodeLengthSixRemoveSymbol(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }

    @Test
    override fun testCodeInputLCodeLengthSixRemoveCode() {
        themedComponent(
            action = {
                onView(withId(it.id)).apply {
                    repeat(6) {
                        perform(click())
                        perform(pressKey(KeyEvent.KEYCODE_1))
                    }
                }
            },
        ) {
            codeInputCodeLengthSixRemoveSymbol(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }

    @Test
    override fun testCodeInputLCodeLengthSixErrorKeep() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
            },
        ) {
            codeInputCodeLengthSixCaptionCenter(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }

    @Test
    override fun testCodeInputLCorrectCode() {
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
            codeInputCodeLengthFourCaptionLeft(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }

    @Test
    override fun testCodeInputLLongText() {
        themedComponent {
            codeInputCodeLengthFourCaptionCenter(R.style.Sdkit_StarDs_ComponentOverlays_CodeInputL)
        }
    }
}
