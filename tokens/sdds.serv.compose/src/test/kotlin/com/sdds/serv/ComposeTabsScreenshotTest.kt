package com.sdds.serv

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabs.H1
import com.sdds.serv.styles.tabs.H2
import com.sdds.serv.styles.tabs.H3
import com.sdds.serv.styles.tabs.H4
import com.sdds.serv.styles.tabs.H5
import com.sdds.serv.styles.tabs.Horizontal
import com.sdds.serv.styles.tabs.IconTabs
import com.sdds.serv.styles.tabs.L
import com.sdds.serv.styles.tabs.M
import com.sdds.serv.styles.tabs.S
import com.sdds.serv.styles.tabs.TabsDefault
import com.sdds.serv.styles.tabs.TabsHeader
import com.sdds.serv.styles.tabs.Vertical
import com.sdds.serv.styles.tabs.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.tabs.IconTabsLHorizontalFiveHasActionScroll
import com.sdds.testing.compose.tabs.IconTabsMVerticalFiveHasActionStretchCounter
import com.sdds.testing.compose.tabs.IconTabsSHorizontalFiveHasActionStretchCounter
import com.sdds.testing.compose.tabs.IconTabsXsVerticalScrollCounter
import com.sdds.testing.compose.tabs.TabsDisabled
import com.sdds.testing.compose.tabs.TabsH1FiveValueScroll
import com.sdds.testing.compose.tabs.TabsH2TwoValueScroll
import com.sdds.testing.compose.tabs.TabsH3OneHasAction
import com.sdds.testing.compose.tabs.TabsH4FiveHasActionIconEnd
import com.sdds.testing.compose.tabs.TabsH5FiftyValueShowAll
import com.sdds.testing.compose.tabs.TabsLHorizontalFiveHasDividerScroll
import com.sdds.testing.compose.tabs.TabsLVerticalStretchFive
import com.sdds.testing.compose.tabs.TabsMVerticalTwentyIconStartValueHasActionCounter
import com.sdds.testing.compose.tabs.TabsSHorizontalFiveIconEndStretch
import com.sdds.testing.compose.tabs.TabsXsHorizontalTenShowAll
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTabsScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testTabsLHorizontalFiveHasDividerScroll() {
        composeTestRule.content {
            TabsLHorizontalFiveHasDividerScroll(TabsDefault.L.Horizontal.style())
        }
        composeTestRule.onNodeWithText("Tab2").performClick()
    }

    @Test
    fun testTabsMVerticalTwentyIconStartValueHasActionCounter() {
        composeTestRule.content {
            TabsMVerticalTwentyIconStartValueHasActionCounter(TabsDefault.M.Vertical.style())
        }
        composeTestRule.onNodeWithText("Label16").performClick()
    }

    @Test
    fun testTabsSHorizontalFiveIconEndStretch() {
        composeTestRule.content {
            TabsSHorizontalFiveIconEndStretch(TabsDefault.S.Horizontal.style())
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTabsXsHorizontalTenShowAll() {
        composeTestRule.content {
            TabsXsHorizontalTenShowAll(TabsDefault.Xs.Horizontal.style())
        }
        composeTestRule.onNodeWithText("ShowAll").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @Test
    fun testTabsLVerticalStretchFive() {
        composeTestRule.content {
            TabsLVerticalStretchFive(TabsDefault.L.Vertical.style())
        }
        composeTestRule.onNodeWithText("Tab2").performClick()
    }

    @Test
    fun testTabsDisabled() {
        composeTestRule.content {
            TabsDisabled(TabsDefault.L.Horizontal.style())
        }
    }

    @Test
    fun testTabsH1FiveValueScroll() {
        composeTestRule.content {
            TabsH1FiveValueScroll(TabsHeader.H1.style())
        }
    }

    @Test
    fun testTabsH2TwoValueScroll() {
        composeTestRule.content {
            TabsH2TwoValueScroll(TabsHeader.H2.style())
        }
        composeTestRule.onNodeWithText("Tab1").performClick()
    }

    @Test
    fun testTabsH3OneHasAction() {
        composeTestRule.content {
            TabsH3OneHasAction(TabsHeader.H3.style())
        }
    }

    @Test
    fun testTabsH4FiveHasActionIconEnd() {
        composeTestRule.content {
            TabsH4FiveHasActionIconEnd(TabsHeader.H4.style())
        }
        composeTestRule.onNodeWithText("Tab0").performClick()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTabsH5FiftyValueShowAll() {
        composeTestRule.content {
            TabsH5FiftyValueShowAll(TabsHeader.H5.style())
        }
        composeTestRule.onNodeWithText("Tab1").performClick()
        composeTestRule.onNodeWithText("ShowAll").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @Test
    fun testIconTabsLHorizontalFiveHasActionScroll() {
        composeTestRule.content {
            IconTabsLHorizontalFiveHasActionScroll(IconTabs.L.Horizontal.style())
        }
    }

    @Test
    fun testIconTabsMVerticalFiveHasActionStretchCounter() {
        composeTestRule.content {
            IconTabsMVerticalFiveHasActionStretchCounter(IconTabs.M.Vertical.style())
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testIconTabsSHorizontalFiveHasActionStretchCounter() {
        composeTestRule.content {
            IconTabsSHorizontalFiveHasActionStretchCounter(IconTabs.S.Horizontal.style())
        }
        composeTestRule.onNodeWithText("ShowAll").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @Test
    fun testIconTabsXsVerticalScrollCounter() {
        composeTestRule.content {
            IconTabsXsVerticalScrollCounter(IconTabs.Xs.Vertical.style())
        }
    }
}
