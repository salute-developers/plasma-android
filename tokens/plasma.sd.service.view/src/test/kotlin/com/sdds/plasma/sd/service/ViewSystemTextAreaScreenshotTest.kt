package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.colorstate.TextAreaColorState
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
                R.style.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaMDefaultOuter() {
        themedComponent {
            textAreaMDefaultOuter(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaSWarningInnerRequiredRight() {
        themedComponent {
            textAreaSWarningInnerRequiredRight(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaXsError() {
        themedComponent {
            textAreaXsError(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaXs,
                TextAreaColorState.ERROR,
            )
        }
    }

    @Test
    override fun testTextAreaLReadOnly() {
        themedComponent {
            margins {
                textAreaLReadOnly(
                    R.style.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
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
                R.style.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabel,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaSDefaultInnerRight() {
        themedComponent {
            textAreaSDefaultInnerRight(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaXSDefaultOuter() {
        themedComponent {
            textAreaXSDefaultOuter(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaLDisabled() {
        themedComponent {
            textAreaLDisabled(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaMErrorOuter() {
        themedComponent {
            textAreaMErrorOuter(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabel,
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
                R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaMDefaultChipsInner() {
        themedComponent {
            textAreaMDefaultChipsInner(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaSDefaultChipsOuterRight() {
        themedComponent {
            textAreaSDefaultChipsOuterRight(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaTextSLongText() {
        themedComponent {
            textAreaTextSLongText(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabel,
                TextAreaColorState.WARNING,
            )
        }
    }

    @Test
    override fun testTextAreaLDefaultTBTA() {
        themedComponent {
            textAreaLDefaultTBTA(
                R.style.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
                TextAreaColorState.DEFAULT,
            )
        }
    }
}
