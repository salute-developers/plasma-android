package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CounterCommon
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.MuteNo
import com.sdds.sbcom.styles.counter.MuteYes
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
    fun testCounterMuteYes() {
        composeTestRule.content {
            CounterCommon(style = Counter.MuteYes.style())
        }
    }

    @Test
    fun testCounterMuteNo() {
        composeTestRule.content {
            CounterCommon(style = Counter.MuteNo.style())
        }
    }
}
