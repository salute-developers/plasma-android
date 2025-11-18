package com.sdds.serv

import android.view.KeyEvent
import android.widget.EditText
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressKey
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.serv.colorstate.TextFieldColorState
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.mask.MaskTestCases
import org.hamcrest.CoreMatchers.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemMaskScreenshotTest(
    theme: String,
) : MaskTestCases(theme) {

    @Test
    override fun testMaskDefaultLOuterLabelMaskPlaceholderPhone() {
        themedComponent {
            maskPhoneDisplayAlways(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskSuccessMOuterLabelMaskPlaceholderPhone() {
        themedComponent {
            maskPhoneDisplayAlways(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testMaskWarningSRequiredRightPlaceholderPhone() {
        themedComponent {
            maskPhoneDisplayAlways(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testMaskErrorXsRequiredLeftPlaceholderPhone() {
        themedComponent {
            margins {
                maskPhoneDisplayAlways(
                    R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
                    TextFieldColorState.ERROR,
                )
            }
        }
    }

    @Test
    override fun testMaskDisabledIconAction() {
        themedComponent {
            maskDisabledIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskReadOnlyIconAction() {
        themedComponent {
            maskReadOnlyIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskXlDefaultOuterLabelDateIconAction() {
        themedComponent {
            maskDateShortDateAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldXlOuterLabelDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskLSuccessRequiredLeftInnerLabelTimeAlwaysIcon() {
        themedComponent {
            maskTimeAlwaysIcon(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testMaskMWarningRequiredRightOuterLabelNumberAlwaysAction() {
        themedComponent {
            maskNumberAlwaysAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testMaskErrorSuffixPrefixPhone() {
        themedComponent {
            maskSuffixPrefixPhone(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldSError,
                TextFieldColorState.ERROR,
            )
        }
    }

    @Test
    override fun testMaskXsDefaultRequiredLeftPhoneOnInputIconAction() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("")))

                onView(withId(it.id)).perform(click())

                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("+7 ")))
            },
        ) {
            maskPhoneOnInputIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredStart,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTypeLettersInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("a"))
            },
        ) {
            maskPhoneDisplayAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTypeNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("7"))
            },
        ) {
            maskPhoneDisplayAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTypeAnyOtherNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("495"))
            },
        ) {
            maskPhoneDisplayAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskDeleteNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("495"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(clearText())
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskInputFullNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("1234567890"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("a")).check(matches(withText("+7 123 456-78-90")))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskInputLettersAndNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("!w123ф%е45"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("+7 123 45")))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskInputPartiallyFilledNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("123456"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("+7 123 456-")))
                    .perform(pressKey(KeyEvent.KEYCODE_W))
                    .perform(pressKey(KeyEvent.KEYCODE_1))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_4))
                    .perform(pressKey(KeyEvent.KEYCODE_F))
                    .perform(pressKey(KeyEvent.KEYCODE_E))
                    .check(matches(withText("+7 123 456-12-34")))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskInputFullyFilledNumberInTelephone() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("1234567890"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("+7 123 456-78-90")))
                    .perform(pressKey(KeyEvent.KEYCODE_W))
                    .perform(pressKey(KeyEvent.KEYCODE_1))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_F))
                    .perform(pressKey(KeyEvent.KEYCODE_E))
                    .check(matches(withText("+7 123 456-78-90")))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskShortDateInput() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("121212"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12.12.12")))
            },
        ) {
            maskDateShortDateAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskShortDateInputNotFull() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("1212"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12.12.")))
            },
        ) {
            maskDateShortDateAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskFullDateInput() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("12122012"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12.12.2012")))
            },
        ) {
            maskDateMediumDateAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTimeInput() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("1234"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12:34")))
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTimeInputStartWithZero() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("0830"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("08:30")))
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTimeInputMaxNumber() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("9999"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("99:99")))
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskTimeInputWithLetter() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("12a34"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12:34")))
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskNumberInput() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("12345,00"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12 345,00")))
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskNumberInputMaxNumber() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("999999999999999999,99999"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("999 999 999 999 999 999,99999")))
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskNumberInputOneNumber() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("1"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("1")))
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskNumberInputSymbolsAndLetters() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(typeText("!w123ф%е45"))
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).check(matches(withText("12 345")))
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Serv_Sdds_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }
}
