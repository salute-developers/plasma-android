package com.sdds.stylessalute

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
            progressDefault(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarDefault)
        }
    }

    @Test
    override fun testProgressSecondary() {
        themedComponent {
            progressSecondary(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarSecondary)
        }
    }

    @Test
    override fun testProgressWarning() {
        themedComponent {
            progressWarning(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarWarning)
        }
    }

    @Test
    override fun testProgressPositive() {
        themedComponent {
            progressPositive(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarPositive)
        }
    }

    @Test
    override fun testProgressNegative() {
        themedComponent {
            progressNegative(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarNegative)
        }
    }

    @Test
    override fun testProgressAccent() {
        themedComponent {
            progressAccent(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarAccent)
        }
    }

    @Test
    override fun testProgressGradientAccent() {
        themedComponent {
            progressGradientAccent(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarGradient)
        }
    }

    @Test
    override fun testProgressDefaultValueOne() {
        themedComponent {
            progressDefaultValueOne(R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarDefault)
        }
    }
}
