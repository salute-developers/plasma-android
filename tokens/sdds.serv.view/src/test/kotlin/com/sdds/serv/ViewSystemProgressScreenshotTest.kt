package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.progress.ProgressBarTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemProgressScreenshotTest(
    theme: String,
) : ProgressBarTestCases(theme) {

    @Test
    override fun testProgressDefault() {
        themedComponent {
            progressDefault(R.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault)
        }
    }

    @Test
    override fun testProgressSecondary() {
        themedComponent {
            progressSecondary(R.style.Serv_Sdds_ComponentOverlays_ProgressBarSecondary)
        }
    }

    @Test
    override fun testProgressWarning() {
        themedComponent {
            progressWarning(R.style.Serv_Sdds_ComponentOverlays_ProgressBarWarning)
        }
    }

    @Test
    override fun testProgressPositive() {
        themedComponent {
            progressPositive(R.style.Serv_Sdds_ComponentOverlays_ProgressBarPositive)
        }
    }

    @Test
    override fun testProgressNegative() {
        themedComponent {
            progressNegative(R.style.Serv_Sdds_ComponentOverlays_ProgressBarNegative)
        }
    }

    @Test
    override fun testProgressAccent() {
        themedComponent {
            progressAccent(R.style.Serv_Sdds_ComponentOverlays_ProgressBarAccent)
        }
    }

    @Test
    override fun testProgressGradientAccent() {
        themedComponent {
            progressGradientAccent(R.style.Serv_Sdds_ComponentOverlays_ProgressBarGradient)
        }
    }

    @Test
    override fun testProgressDefaultValueOne() {
        themedComponent {
            progressDefaultValueOne(R.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault)
        }
    }

    @Test
    fun testProgressInfo() {
        themedComponent {
            progressInfo(R.style.Serv_Sdds_ComponentOverlays_ProgressBarInfo)
        }
    }
}
