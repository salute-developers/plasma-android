package com.sdds.stylessalute

import android.view.KeyEvent
import android.widget.EditText
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.pressKey
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.stylessalute.colorstate.TextFieldColorState
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
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabel,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskSuccessMOuterLabelMaskPlaceholderPhone() {
        themedComponent {
            maskPhoneDisplayAlways(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabel,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testMaskWarningSRequiredRightPlaceholderPhone() {
        themedComponent {
            maskPhoneDisplayAlways(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testMaskErrorXsRequiredLeftPlaceholderPhone() {
        themedComponent {
            margins {
                maskPhoneDisplayAlways(
                    R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
                    TextFieldColorState.ERROR,
                )
            }
        }
    }

    @Test
    override fun testMaskDisabledIconAction() {
        themedComponent {
            maskDisabledIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskReadOnlyIconAction() {
        themedComponent {
            maskReadOnlyIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskXlDefaultOuterLabelDateIconAction() {
        themedComponent {
            maskDateShortDateAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testMaskLSuccessRequiredLeftInnerLabelTimeAlwaysIcon() {
        themedComponent {
            maskTimeAlwaysIcon(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
                TextFieldColorState.SUCCESS,
            )
        }
    }

    @Test
    override fun testMaskMWarningRequiredRightOuterLabelNumberAlwaysAction() {
        themedComponent {
            maskNumberAlwaysAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
                TextFieldColorState.WARNING,
            )
        }
    }

    @Test
    override fun testMaskErrorSuffixPrefixPhone() {
        themedComponent {
            maskSuffixPrefixPhone(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSError,
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
                ).perform(typeText("9"))
            },
        ) {
            maskPhoneOnInputIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsRequiredStart,
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
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                ).perform(typeText("a"))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                ).perform(pressKey(KeyEvent.KEYCODE_W))
                    .perform(pressKey(KeyEvent.KEYCODE_1))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_4))
                    .perform(pressKey(KeyEvent.KEYCODE_F))
                    .perform(pressKey(KeyEvent.KEYCODE_E))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                ).perform(pressKey(KeyEvent.KEYCODE_W))
                    .perform(pressKey(KeyEvent.KEYCODE_1))
                    .perform(pressKey(KeyEvent.KEYCODE_2))
                    .perform(pressKey(KeyEvent.KEYCODE_3))
                    .perform(pressKey(KeyEvent.KEYCODE_F))
                    .perform(pressKey(KeyEvent.KEYCODE_E))
            },
        ) {
            maskPhoneDisplayAlwaysIconActionNoPlaceholder(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskDateShortDateAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskDateShortDateAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskDateMediumDateAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskTimeAlwaysIconAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
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
                )
            },
        ) {
            maskNumberAlwaysAction(
                R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLDefault,
                TextFieldColorState.DEFAULT,
            )
        }
    }
}
