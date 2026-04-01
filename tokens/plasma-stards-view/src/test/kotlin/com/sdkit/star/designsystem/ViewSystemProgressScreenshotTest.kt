package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.uikit.fixtures.SDK_NUMBER
import com.sdds.uikit.fixtures.testcases.ProgressBarTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemProgressScreenshotTest : ProgressBarTestCases("+night") {

    @Test
    override fun testProgressDefault() {
        themedComponent {
            progressDefault(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarDefault)
        }
    }

    @Test
    override fun testProgressSecondary() {
        themedComponent {
            progressSecondary(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarSecondary)
        }
    }

    @Test
    override fun testProgressWarning() {
        themedComponent {
            progressWarning(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarWarning)
        }
    }

    @Test
    override fun testProgressPositive() {
        themedComponent {
            progressPositive(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarPositive)
        }
    }

    @Test
    override fun testProgressNegative() {
        themedComponent {
            progressNegative(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarNegative)
        }
    }

    @Test
    override fun testProgressAccent() {
        themedComponent {
            progressAccent(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarAccent)
        }
    }

    @Test
    override fun testProgressGradientAccent() {
        themedComponent {
            progressGradientAccent(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarGradient)
        }
    }

    @Test
    override fun testProgressDefaultValueOne() {
        themedComponent {
            progressDefaultValueOne(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarDefault)
        }
    }

    @Test
    fun testProgressInfo() {
        themedComponent {
            progressInfo(R.style.Sdkit_StarDs_ComponentOverlays_ProgressBarInfo)
        }
    }
}
