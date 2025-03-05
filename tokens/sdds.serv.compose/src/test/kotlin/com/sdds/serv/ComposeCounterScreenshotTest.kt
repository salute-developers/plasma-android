package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.counter.Accent
import com.sdds.serv.styles.counter.Default
import com.sdds.serv.styles.counter.L
import com.sdds.serv.styles.counter.M
import com.sdds.serv.styles.counter.Negative
import com.sdds.serv.styles.counter.Positive
import com.sdds.serv.styles.counter.S
import com.sdds.serv.styles.counter.Warning
import com.sdds.serv.styles.counter.White
import com.sdds.serv.styles.counter.Xs
import com.sdds.serv.styles.counter.Xxs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.counter.CounterCommon
import com.sdds.testing.compose.counter.CounterSizeLWhite
import com.sdds.testing.compose.counter.CounterSizeSPositiveLongNumber
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCounterScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

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
