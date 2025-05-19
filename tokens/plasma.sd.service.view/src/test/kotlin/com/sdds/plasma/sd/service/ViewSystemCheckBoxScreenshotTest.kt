package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.checkbox.CheckBoxTestCases
import org.hamcrest.Matchers.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCheckBoxScreenshotTest(
    theme: String,
) : CheckBoxTestCases(theme) {

    @Test
    override fun testCheckBoxSizeM() {
        themedComponent {
            checkBoxSizeM(R.style.Plasma_SdService_ComponentOverlays_CheckBoxM)
        }
    }

    @Test
    override fun testCheckBoxSizeSUnchecked() {
        themedComponent {
            checkBoxSizeSUnchecked(R.style.Plasma_SdService_ComponentOverlays_CheckBoxS)
        }
    }

    @Test
    override fun testCheckBoxNoLabelAndDesc() {
        themedComponent {
            checkBoxNoLabelAndDesc(R.style.Plasma_SdService_ComponentOverlays_CheckBoxM)
        }
    }

    @Test
    override fun testCheckBoxDisabled() {
        themedComponent {
            checkBoxDisabled(R.style.Plasma_SdService_ComponentOverlays_CheckBoxS)
        }
    }

    @Test
    override fun testCheckBoxSizeMIndeterminate() {
        themedComponent {
            checkBoxSizeMIndeterminate(R.style.Plasma_SdService_ComponentOverlays_CheckBoxM)
        }
    }

    @Test
    override fun testCheckBoxGroupSizeM() {
        themedComponent(
            action = {
                onView(allOf(withId(0), withText("Label")))
                    .perform(click())
            },
        ) {
            checkBoxGroupSizeM(R.style.Plasma_SdService_ComponentOverlays_CheckBoxGroupM)
        }
    }

    @Test
    override fun testCheckBoxGroupSizeS() {
        themedComponent(
            action = {
                onView(withId(1))
                    .perform(click())
            },
        ) {
            checkBoxGroupSizeS(R.style.Plasma_SdService_ComponentOverlays_CheckBoxGroupS)
        }
    }

    @Test
    override fun testCheckBoxGroupMDisabled() {
        themedComponent {
            checkBoxGroupMDisabled(R.style.Plasma_SdService_ComponentOverlays_CheckBoxGroupM)
        }
    }

    @Test
    fun testCheckBoxSizeLNegative() {
        themedComponent {
            checkBoxSizeLNegative(R.style.Plasma_SdService_ComponentOverlays_CheckBoxLNegative)
        }
    }

    @Test
    fun testCheckBoxSizeLNegativeLabelDesc() {
        themedComponent {
            checkBoxSizeLNegativeLabelDesc(R.style.Plasma_SdService_ComponentOverlays_CheckBoxLNegative)
        }
    }
}
