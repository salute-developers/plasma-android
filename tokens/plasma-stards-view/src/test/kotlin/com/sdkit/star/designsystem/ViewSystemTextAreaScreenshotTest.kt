package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.textfield.TextAreaTestCases
import com.sdkit.star.designsystem.colorstate.TextAreaColorState
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemTextAreaScreenshotTest : TextAreaTestCases("+night") {

    @Test
    fun testTextAreaMDefaultInnerLabel() {
        themedComponent {
            textAreaLDefaultInnerRequiredLeft(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaMDefaultOuter() {
        themedComponent {
            textAreaMDefaultOuter(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    fun testTextAreaSDefaultInnerLabel() {
        themedComponent {
            textAreaSWarningInnerRequiredRight(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaXsError() {
        themedComponent {
            textAreaXsError(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaXs,
                TextAreaColorState.ERROR,
            )
        }
    }

    @Test
    fun testTextAreaMReadOnly() {
        themedComponent {
            margins {
                textAreaLReadOnly(
                    R.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabel,
                    TextAreaColorState.DEFAULT,
                )
            }
        }
        // todo capture container
    }

    @Test
    override fun testTextAreaXSDefaultOuter() {
        themedComponent {
            textAreaXSDefaultOuter(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsOuterLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaLDisabled() {
        themedComponent {
            textAreaLDisabled(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaMErrorOuter() {
        themedComponent {
            textAreaMErrorOuter(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabel,
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
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaTextSLongText() {
        themedComponent {
            textAreaTextSLongText(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabel,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Test
    override fun testTextAreaLDefaultTBTA() {
        themedComponent {
            textAreaLDefaultTBTA(
                R.style.Sdkit_StarDs_ComponentOverlays_TextAreaM,
                TextAreaColorState.DEFAULT,
            )
        }
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaMDefaultChipsInner() {
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaSDefaultChipsOuterRight() {
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaLDefaultInnerRequiredLeft() {
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaLReadOnly() {
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaMWarningInner() {
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaSDefaultInnerRight() {
    }

    @Ignore("Not yet implemented")
    override fun testTextAreaSWarningInnerRequiredRight() {
    }
}
