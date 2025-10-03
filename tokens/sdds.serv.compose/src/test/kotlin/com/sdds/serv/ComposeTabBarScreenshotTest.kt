package com.sdds.serv

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabbar.Accent
import com.sdds.serv.styles.tabbar.Default
import com.sdds.serv.styles.tabbar.Divider
import com.sdds.serv.styles.tabbar.L
import com.sdds.serv.styles.tabbar.M
import com.sdds.serv.styles.tabbar.Rounded
import com.sdds.serv.styles.tabbar.Secondary
import com.sdds.serv.styles.tabbar.Shadow
import com.sdds.serv.styles.tabbar.TabBarClear
import com.sdds.serv.styles.tabbar.TabBarHasLabelClear
import com.sdds.serv.styles.tabbar.TabBarHasLabelSolid
import com.sdds.serv.styles.tabbar.TabBarIslandClear
import com.sdds.serv.styles.tabbar.TabBarIslandHasLabelSolid
import com.sdds.serv.styles.tabbar.TabBarIslandSolid
import com.sdds.serv.styles.tabbar.TabBarSolid
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.tabbar.TabBarCounter
import com.sdds.testing.compose.tabbar.TabBarCounterCountSix
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
    fun testTabBarClearLDefaultNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBarClear.L.Default.style())
        }
    }

    @Test
    fun testTabBarHasLabelClearMSecondaryCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBarHasLabelClear.M.Secondary.style())
        }
    }

    @Test
    fun testTabBarHasLabelSolidLAccentIndicator() {
        composeTestRule.content {
            TabBarIndicator(style = TabBarHasLabelSolid.L.Accent.style())
        }
    }

    @Test
    fun testTabBarIslandClearLShadowDefaultExtraNone() {
        composeTestRule.content {
            Box(
                modifier = Modifier.requiredSize(400.dp, 200.dp),
                contentAlignment = Alignment.Center,
            ) {
                TabBarExtraNone(
                    style = TabBarIslandClear.L.Default.style(),
                )
            }
        }
    }

    @Test
    fun testTabBarIslandHasLabelClearLShadowSecondaryCounter() {
        composeTestRule.content {
            Box(
                modifier = Modifier.requiredSize(400.dp, 200.dp),
                contentAlignment = Alignment.Center,
            ) {
                TabBarCounter(
                    style = TabBarIslandClear.L.Shadow.Secondary.style(),
                )
            }
        }
    }

    @Test
    fun testTabBarIslandHasLabelSolidShadowAccentCounter() {
        composeTestRule.content {
            Box(
                modifier = Modifier.requiredSize(400.dp, 200.dp),
                contentAlignment = Alignment.Center,
            ) {
                TabBarCounter(
                    style = TabBarIslandHasLabelSolid.L.Shadow.Accent.style(),
                )
            }
        }
    }

    @Test
    fun testTabBarIslandSolidLDefaultCountSixCounter() {
        composeTestRule.content {
            TabBarCounterCountSix(style = TabBarIslandSolid.L.Default.style())
        }
    }

    @Test
    fun testTabBarSolidLRoundedDefaultIndicator() {
        composeTestRule.content {
            TabBarIndicator(style = TabBarSolid.L.Rounded.Default.style())
        }
    }

    @Test
    fun testTabBarClearMRoundedSecondaryCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBarClear.M.Rounded.Secondary.style())
        }
    }

    @Test
    fun testTabBarHasLabelClearLRoundedAccentCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBarHasLabelClear.L.Rounded.Accent.style())
        }
    }

    @Test
    fun testTabBarHasLabelSolidLDividerDefaultCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBarHasLabelSolid.L.Divider.Default.style())
        }
    }

    @Test
    fun testTabBarSolidLDividerSecondaryCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBarSolid.L.Divider.Secondary.style())
        }
    }

    @Test
    fun testTabBarClearLDividerAccentCounter() {
        composeTestRule.content {
            TabBarCounter(style = TabBarClear.L.Divider.Accent.style())
        }
    }

    @Test
    fun testTabBarClearLDividerRoundedDefaultExtraNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBarClear.L.Divider.Rounded.Default.style())
        }
    }

    @Test
    fun testTabBarClearLDividerRoundedSecondaryExtraNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBarClear.L.Divider.Rounded.Secondary.style())
        }
    }

    @Test
    fun testTabBarSolidDividerRoundedAccentExtraNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBarSolid.L.Divider.Rounded.Accent.style())
        }
        composeTestRule.onAllNodesWithTag("TabBar", useUnmergedTree = true)[1]
            .performClick()
    }

    @Test
    fun testTabBarSolidLDividerRoundedAccentExtraNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBarSolid.L.Divider.Rounded.Accent.style())
        }
    }

    @Test
    fun testTabBarSolidShadowRoundedSecondaryExtraNone() {
        composeTestRule.content {
            Box(
                modifier = Modifier.requiredSize(400.dp, 200.dp),
                contentAlignment = Alignment.Center,
            ) {
                TabBarExtraNone(style = TabBarSolid.L.Shadow.Rounded.Secondary.style())
            }
        }
    }

    @Test
    fun testTabBarSolidShadowRoundedDefaultExtraNone() {
        composeTestRule.content {
            TabBarExtraNone(style = TabBarSolid.L.Shadow.Rounded.Default.style())
        }
    }

    @Test
    fun testTabBarCustomWeight() {
        composeTestRule.content {
            TabBarCustomWeight(style = TabBarIslandSolid.L.Default.style())
        }
    }
}
