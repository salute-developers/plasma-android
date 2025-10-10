package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.tabbar.Default
import com.sdds.plasma.homeds.styles.tabbar.TabBar
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.tabbar.TabBarCounter
import com.sdds.testing.compose.tabbar.TabBarCustomWeight
import com.sdds.testing.compose.tabbar.TabBarExtraNone
import com.sdds.testing.compose.tabbar.TabBarIndicator
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTabBarScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testTabBarDefaultNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBar.Default.style())
        }
    }

    @Test
    fun testTabBarCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBar.Default.style())
        }
    }

    @Test
    fun testTabBarIndicator() {
        composeTestRule.content {
            TabBarIndicator(style = TabBar.Default.style())
        }
    }

    @Test
    fun testTabBarCustomWeight() {
        composeTestRule.content {
            TabBarCustomWeight(style = TabBar.Default.style())
        }
    }
}
