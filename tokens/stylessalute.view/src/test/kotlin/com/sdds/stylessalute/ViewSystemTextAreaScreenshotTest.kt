package com.sdds.stylessalute

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.stylessalute.colorstate.TextAreaColorState
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.textfield.TextAreaTestCases
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
) : TextAreaTestCases(theme) {

    @Test
    override fun testTextAreaLDefaultInnerRequiredLeft() {
        themedComponent {
            textAreaLDefaultInnerRequiredLeft(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaMDefaultOuter() {
        themedComponent {
            textAreaMDefaultOuter(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaSWarningInnerRequiredRight() {
        themedComponent {
            textAreaSWarningInnerRequiredRight(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaXsError() {
        themedComponent {
            textAreaXsError(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXs,
                TextAreaColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextAreaLReadOnly() {
        themedComponent {
            margins {
                textAreaLReadOnly(
                    R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
                    TextAreaColorState.DEFAULT,
                )
            }
        }
        // todo capture container
    }

    @Test
    override fun testTextAreaMWarningInner() {
        themedComponent {
            textAreaMWarningInner(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabel,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaSDefaultInnerRight() {
        themedComponent {
            textAreaSDefaultInnerRight(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaXSDefaultOuter() {
        themedComponent {
            textAreaXSDefaultOuter(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaLDisabled() {
        themedComponent {
            textAreaLDisabled(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaMErrorOuter() {
        themedComponent {
            textAreaMErrorOuter(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabel,
                TextAreaColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextAreaSFocused() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
        ) {
            textAreaSFocused(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaMDefaultChipsInner() {
        themedComponent {
            textAreaMDefaultChipsInner(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaSDefaultChipsOuterRight() {
        themedComponent {
            textAreaSDefaultChipsOuterRight(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaTextSLongText() {
        themedComponent {
            textAreaTextSLongText(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabel,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaLDefaultTBTA() {
        themedComponent {
            textAreaLDefaultTBTA(
                R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
                TextAreaColorState.DEFAULT,
            )
        }
    }
}
