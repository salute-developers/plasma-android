package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.spinner.SpinnerTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemSpinnerScreenshotTest : SpinnerTestCases("+night") {

    @Test
    fun testSpinnerXxlDefault() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_Xxl_Default)
        }
    }

    @Test
    fun testSpinnerXlSecondary() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_Xl_Secondary)
        }
    }

    @Test
    fun testSpinnerLAccent() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_L_Accent)
        }
    }

    @Test
    fun testSpinnerMPositive() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_M_Positive)
        }
    }

    @Test
    fun testSpinnerSNegative() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_S_Negative)
        }
    }

    @Test
    fun testSpinnerXsWarning() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_Xs_Warning)
        }
    }

    @Test
    fun testSpinnerXxsInfo() {
        themedComponent {
            spinnerTest(style = R.style.Sdkit_StarDs_Components_Spinner_Xxs_Info)
        }
    }
}
