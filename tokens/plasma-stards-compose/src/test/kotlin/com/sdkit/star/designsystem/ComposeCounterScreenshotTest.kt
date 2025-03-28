package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.counter.CounterCommon
import com.sdds.testing.compose.counter.CounterSizeLWhite
import com.sdds.testing.compose.counter.CounterSizeSPositiveLongNumber
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.counter.Accent
import com.sdkit.star.designsystem.styles.counter.Counter
import com.sdkit.star.designsystem.styles.counter.Default
import com.sdkit.star.designsystem.styles.counter.L
import com.sdkit.star.designsystem.styles.counter.M
import com.sdkit.star.designsystem.styles.counter.Negative
import com.sdkit.star.designsystem.styles.counter.Positive
import com.sdkit.star.designsystem.styles.counter.S
import com.sdkit.star.designsystem.styles.counter.Warning
import com.sdkit.star.designsystem.styles.counter.White
import com.sdkit.star.designsystem.styles.counter.Xs
import com.sdkit.star.designsystem.styles.counter.Xxs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeCounterScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testCounterSizeLDefault() {
        composeTestRule.content {
            CounterCommon(style = Counter.L.Default.style())
        }
    }

    @Test
    fun testCounterSizeMAccent() {
        composeTestRule.content {
            CounterCommon(style = Counter.M.Accent.style())
        }
    }

    @Test
    fun testCounterSizeSPositive() {
        composeTestRule.content {
            CounterSizeSPositiveLongNumber(style = Counter.S.Positive.style())
        }
    }

    @Test
    fun testCounterSizeXsWarning() {
        composeTestRule.content {
            CounterCommon(style = Counter.Xs.Warning.style())
        }
    }

    @Test
    fun testCounterSizeLWhite() {
        composeTestRule.content {
            CounterSizeLWhite(style = Counter.L.White.style())
        }
    }

    @Test
    fun testCounterSizeXxsNegative() {
        composeTestRule.content {
            CounterCommon(style = Counter.Xxs.Negative.style())
        }
    }
}
