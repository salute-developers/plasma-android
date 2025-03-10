package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.indicator.IndicatorTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemIndicatorScreenshotTest(
    theme: String,
) : IndicatorTestCases(theme) {

    @Test
    override fun testIndicatorSizeLDefault() {
        themedComponent {
            commonIndicator(R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLDefault)
        }
    }

    @Test
    override fun testIndicatorSizeMAccent() {
        themedComponent {
            commonIndicator(R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMAccent)
        }
    }

    @Test
    override fun testIndicatorSizeSInactive() {
        themedComponent {
            commonIndicator(R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSInactive)
        }
    }

    @Test
    override fun testIndicatorLPositive() {
        themedComponent {
            commonIndicator(R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLPositive)
        }
    }

    @Test
    override fun testIndicatorLWarning() {
        themedComponent {
            commonIndicator(R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLWarning)
        }
    }

    @Test
    override fun testIndicatorLNegative() {
        themedComponent {
            commonIndicator(R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLNegative)
        }
    }
}
