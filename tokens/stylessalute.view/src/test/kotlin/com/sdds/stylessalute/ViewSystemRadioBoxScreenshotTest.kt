package com.sdds.stylessalute

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.radiobox.RadioBoxTestCases
import org.hamcrest.core.AllOf.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemRadioBoxScreenshotTest(
    theme: String,
) : RadioBoxTestCases(theme) {

    @Test
    override fun testRadioBoxSizeM() {
        themedComponent {
            radioBoxSizeM(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxM)
        }
    }

    @Test
    override fun testRadioBoxSizeS() {
        themedComponent {
            radioBoxSizeS(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxS)
        }
    }

    @Test
    override fun testRadioBoxSizeMNoDescription() {
        themedComponent {
            radioBoxSizeMNoDescription(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxM)
        }
    }

    @Test
    override fun testRadioBoxDisabled() {
        themedComponent {
            radioBoxDisabled(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxM)
        }
    }

    @Test
    override fun testRadioBoxGroupSizeM() {
        themedComponent(
            action = {
                onView(allOf(withId(0)))
                    .perform(click())
            },
        ) {
            radioBoxGroupSizeM(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupM)
        }
    }

    @Test
    override fun testRadioBoxGroupSizeS() {
        themedComponent(
            action = {
                onView(allOf(withId(1)))
                    .perform(click())
            },
        ) {
            radioBoxGroupSizeS(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupS)
        }
    }

    @Test
    override fun testRadioBoxGroupSizeMDescription() {
        themedComponent(
            action = {
                onView(allOf(withId(0)))
                    .perform(click())
            },
        ) {
            radioBoxGroupSizeMDescription(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupM)
        }
    }

    @Test
    override fun testRadioBoxGroupSizeSLabel() {
        themedComponent(
            action = {
                onView(allOf(withId(1)))
                    .perform(click())
            },
        ) {
            radioBoxGroupSizeSLabel(R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupS)
        }
    }
}
