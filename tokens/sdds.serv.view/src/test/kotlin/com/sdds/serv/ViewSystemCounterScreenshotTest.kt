package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.counter.CounterTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCounterScreenshotTest(
    theme: String,
) : CounterTestCases(theme) {

    @Test
    override fun testCounterSizeLDefault() {
        themedComponent {
            counterCommon(R.style.Serv_Sdds_ComponentOverlays_CounterLDefault)
        }
    }

    @Test
    override fun testCounterSizeMAccent() {
        themedComponent {
            counterCommon(R.style.Serv_Sdds_ComponentOverlays_CounterMAccent)
        }
    }

    @Test
    override fun testCounterSizeSPositive() {
        themedComponent {
            counterPositiveLongNumber(R.style.Serv_Sdds_ComponentOverlays_CounterSPositive)
        }
    }

    @Test
    override fun testCounterSizeXsWarning() {
        themedComponent {
            counterCommon(R.style.Serv_Sdds_ComponentOverlays_CounterXsWarning)
        }
    }

    @Test
    override fun testCounterSizeXxsNegative() {
        themedComponent {
            counterCommon(R.style.Serv_Sdds_ComponentOverlays_CounterXxsNegative)
        }
    }

    @Test
    override fun testCounterSizeLWhite() {
        themedComponent {
            counterSizeLWhite(R.style.Serv_Sdds_ComponentOverlays_CounterLWhite)
        }
    }

    @Test
    override fun testCounterSizeLDisabled() {
        themedComponent {
            counterDisabled(R.style.Serv_Sdds_ComponentOverlays_CounterLNegative)
        }
    }
}
