package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.counter.Accent
import com.sdds.plasma.sd.service.styles.counter.Counter
import com.sdds.plasma.sd.service.styles.counter.Default
import com.sdds.plasma.sd.service.styles.counter.L
import com.sdds.plasma.sd.service.styles.counter.M
import com.sdds.plasma.sd.service.styles.counter.Negative
import com.sdds.plasma.sd.service.styles.counter.Positive
import com.sdds.plasma.sd.service.styles.counter.S
import com.sdds.plasma.sd.service.styles.counter.Warning
import com.sdds.plasma.sd.service.styles.counter.White
import com.sdds.plasma.sd.service.styles.counter.Xs
import com.sdds.plasma.sd.service.styles.counter.Xxs
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
