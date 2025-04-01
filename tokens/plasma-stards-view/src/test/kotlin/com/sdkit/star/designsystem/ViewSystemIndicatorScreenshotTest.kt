package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.indicator.IndicatorTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemIndicatorScreenshotTest : IndicatorTestCases("+night") {

    @Test
    override fun testIndicatorSizeLDefault() {
        themedComponent {
            commonIndicator(R.style.Sdkit_StarDs_ComponentOverlays_IndicatorLDefault)
        }
    }

    @Test
    override fun testIndicatorSizeMAccent() {
        themedComponent {
            commonIndicator(R.style.Sdkit_StarDs_ComponentOverlays_IndicatorMAccent)
        }
    }

    @Test
    override fun testIndicatorSizeSInactive() {
        themedComponent {
            commonIndicator(R.style.Sdkit_StarDs_ComponentOverlays_IndicatorSInactive)
        }
    }

    @Test
    override fun testIndicatorLPositive() {
        themedComponent {
            commonIndicator(R.style.Sdkit_StarDs_ComponentOverlays_IndicatorLPositive)
        }
    }

    @Test
    override fun testIndicatorLWarning() {
        themedComponent {
            commonIndicator(R.style.Sdkit_StarDs_ComponentOverlays_IndicatorLWarning)
        }
    }

    @Test
    override fun testIndicatorLNegative() {
        themedComponent {
            commonIndicator(R.style.Sdkit_StarDs_ComponentOverlays_IndicatorLNegative)
        }
    }
}
