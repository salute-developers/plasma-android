package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.counter.CounterTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemCounterScreenshotTest : CounterTestCases("+night") {

    @Test
    override fun testCounterSizeLDefault() {
        themedComponent {
            counterCommon(R.style.Sdkit_StarDs_ComponentOverlays_CounterLDefault)
        }
    }

    @Test
    override fun testCounterSizeMAccent() {
        themedComponent {
            counterCommon(R.style.Sdkit_StarDs_ComponentOverlays_CounterMAccent)
        }
    }

    @Test
    override fun testCounterSizeSPositive() {
        themedComponent {
            counterPositiveLongNumber(R.style.Sdkit_StarDs_ComponentOverlays_CounterSPositive)
        }
    }

    @Test
    override fun testCounterSizeXsWarning() {
        themedComponent {
            counterCommon(R.style.Sdkit_StarDs_ComponentOverlays_CounterXsWarning)
        }
    }

    @Test
    override fun testCounterSizeXxsNegative() {
        themedComponent {
            counterCommon(R.style.Sdkit_StarDs_ComponentOverlays_CounterXxsNegative)
        }
    }

    @Test
    override fun testCounterSizeLWhite() {
        themedComponent {
            counterSizeLWhite(R.style.Sdkit_StarDs_ComponentOverlays_CounterLWhite)
        }
    }

    @Test
    override fun testCounterSizeLDisabled() {
        themedComponent {
            counterDisabled(R.style.Sdkit_StarDs_ComponentOverlays_CounterLNegative)
        }
    }
}
