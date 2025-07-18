package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.progress.CircularProgressTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCircularProgressScreenshotTest(
    theme: String,
) : CircularProgressTestCases(theme) {

    @Test
    override fun testCircularProgressXxlDefault() {
        themedComponent {
            circularProgress(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarXxlDefault)
        }
    }

    @Test
    override fun testCircularProgressXlSecondary() {
        themedComponent {
            circularProgress(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarXlSecondary)
        }
    }

    @Test
    override fun testCircularProgressLAccent() {
        themedComponent {
            circularProgress(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarLAccent)
        }
    }

    @Test
    override fun testCircularProgressMGradient() {
        themedComponent {
            circularProgressMax(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarMGradient)
        }
    }

    @Test
    override fun testCircularProgressSInfo() {
        themedComponent {
            circularProgress(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarSInfo)
        }
    }

    @Test
    override fun testCircularProgressXsPositive() {
        themedComponent {
            circularProgress(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarXsPositive)
        }
    }

    @Test
    override fun testCircularProgressXxsWarning() {
        themedComponent {
            circularProgress(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarXxsWarning)
        }
    }

    @Test
    override fun testCircularProgressXxlNegative() {
        themedComponent {
            circularProgressNoTrack(R.style.Serv_Sdds_ComponentOverlays_CircularProgressBarXxlNegative)
        }
    }
}
