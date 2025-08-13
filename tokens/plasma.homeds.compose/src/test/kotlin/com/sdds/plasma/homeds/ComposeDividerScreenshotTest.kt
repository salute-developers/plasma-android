package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.divider.DividerDefault
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeDividerScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testDividerDefault() {
        composeTestRule.content {
            DividerDefault(style = Divider.Default.style())
        }
    }
}
