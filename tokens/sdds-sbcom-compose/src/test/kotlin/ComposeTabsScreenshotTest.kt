package com.sdds.sbcom

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TabsDisabled
import com.sdds.compose.uikit.fixtures.testcases.TabsH1FiveValueScroll
import com.sdds.compose.uikit.fixtures.testcases.TabsH2TwoValueScroll
import com.sdds.compose.uikit.fixtures.testcases.TabsLHorizontalFiveHasDividerScroll
import com.sdds.compose.uikit.fixtures.testcases.TabsSHorizontalFiveIconEndStretch
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.tabs.Default
import com.sdds.sbcom.styles.tabs.TabsFolder
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
    fun testTabsHasDividerScroll() {
        composeTestRule.content {
            TabsLHorizontalFiveHasDividerScroll(TabsFolder.Default.style())
        }
        composeTestRule.onNodeWithText("Tab2").performClick()
    }

    @Test
    fun testTabsFiveIconEndStretch() {
        composeTestRule.content {
            TabsSHorizontalFiveIconEndStretch(TabsFolder.Default.style())
        }
    }

    @Test
    fun testTabsDisabled() {
        composeTestRule.content {
            TabsDisabled(TabsFolder.Default.style())
        }
    }

    @Test
    fun testTabsDefaultScroll() {
        composeTestRule.content {
            TabsH1FiveValueScroll(TabsFolder.Default.style())
        }
    }

    @Test
    fun testTabsDefault() {
        composeTestRule.content {
            TabsH2TwoValueScroll(TabsFolder.Default.style())
        }
        composeTestRule.onNodeWithText("Tab1").performClick()
    }

    @Test
    fun testTabsClick() {
        composeTestRule.content {
            TabsLHorizontalFiveHasDividerScroll(TabsFolder.Default.style())
        }
        composeTestRule.onNodeWithText("Tab0").performClick()
    }
}
