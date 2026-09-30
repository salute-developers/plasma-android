package com.sdds.plasma.homeds

import androidx.compose.runtime.Composable
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyle
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.M
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.S
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import com.sdds.plasma.homeds.components.numberpanel.NumberPanel as NumberPanelView

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeNumberPanelScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testNumberPanelXs() {
        composeTestRule.content {
            NumberPanelTestView(NumberPanel.Xs.style())
        }
    }

    @Test
    fun testNumberPanelS() {
        composeTestRule.content {
            NumberPanelTestView(NumberPanel.S.style())
        }
    }

    @Test
    fun testNumberPanelM() {
        composeTestRule.content {
            NumberPanelTestView(NumberPanel.M.style())
        }
    }

    @Test
    fun testNumberPanelXsHumidity() {
        composeTestRule.content {
            NumberPanelTestView(NumberPanel.Xs.Humidity.style())
        }
    }

    @Test
    fun testNumberPanelSHumidity() {
        composeTestRule.content {
            NumberPanelTestView(NumberPanel.S.Humidity.style())
        }
    }

    @Test
    fun testNumberPanelMHumidity() {
        composeTestRule.content {
            NumberPanelTestView(NumberPanel.M.Humidity.style())
        }
    }

    @Test
    fun testNumberPanelMDisabled() {
        composeTestRule.content {
            NumberPanelTestView(
                style = NumberPanel.M.style(),
                enabled = false,
            )
        }
    }
}

@Composable
private fun NumberPanelTestView(
    style: NumberPanelStyle,
    enabled: Boolean = true,
) {
    NumberPanelView(
        value = 23.4f,
        style = style,
        enabled = enabled,
    )
}
