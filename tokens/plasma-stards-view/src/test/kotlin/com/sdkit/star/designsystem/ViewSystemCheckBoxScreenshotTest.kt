package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.checkbox.CheckBoxTestCases
import org.hamcrest.Matchers.allOf
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemCheckBoxScreenshotTest : CheckBoxTestCases("+night") {

    @Test
    override fun testCheckBoxSizeM() {
        themedComponent {
            checkBoxSizeM(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxM)
        }
    }

    @Test
    override fun testCheckBoxSizeSUnchecked() {
        themedComponent {
            checkBoxSizeSUnchecked(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxS)
        }
    }

    @Test
    override fun testCheckBoxNoLabelAndDesc() {
        themedComponent {
            checkBoxNoLabelAndDesc(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxM)
        }
    }

    @Test
    override fun testCheckBoxSizeMIndeterminate() {
        themedComponent {
            checkBoxSizeMIndeterminate(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxM)
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
            checkBoxGroupSizeM(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxGroupM)
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
            checkBoxGroupSizeS(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxGroupS)
        }
    }

    @Test
    fun testCheckBoxSizeLNegative() {
        themedComponent {
            checkBoxSizeLNegative(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxLNegative)
        }
    }

    @Test
    fun testCheckBoxSizeLNegativeLabelDesc() {
        themedComponent {
            checkBoxSizeLNegativeLabelDesc(R.style.Sdkit_StarDs_ComponentOverlays_CheckBoxLNegative)
        }
    }

    @Ignore("Not yet implemented")
    override fun testCheckBoxGroupMDisabled() {
    }

    @Ignore("Not yet implemented")
    override fun testCheckBoxDisabled() {
    }
}
