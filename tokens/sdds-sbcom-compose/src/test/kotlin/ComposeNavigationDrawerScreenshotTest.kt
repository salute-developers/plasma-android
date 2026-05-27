package com.sdds.sbcom

import androidx.compose.ui.input.key.Key
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.test.pressKey
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.NavigationDrawerAmountFifty
import com.sdds.compose.uikit.fixtures.testcases.NavigationDrawerCollapsed
import com.sdds.compose.uikit.fixtures.testcases.NavigationDrawerCounter
import com.sdds.compose.uikit.fixtures.testcases.NavigationDrawerItemFiveNoTitle
import com.sdds.compose.uikit.fixtures.testcases.NavigationDrawerItemOne
import com.sdds.compose.uikit.fixtures.testcases.NavigationDrawerNoHeader
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.navigationdrawer.Default
import com.sdds.sbcom.styles.navigationdrawer.NavigationDrawer
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeNavigationDrawerScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testNavigationDrawerAmountOne() {
        composeTestRule.content {
            NavigationDrawerItemOne(style = NavigationDrawer.Default.style())
        }
        composeTestRule.onRoot().performKeyInput {
            pressKey(Key.Tab)
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testNavigationDrawerItemFiveNoTitle() {
        composeTestRule.content {
            NavigationDrawerItemFiveNoTitle(style = NavigationDrawer.Default.style())
        }
        composeTestRule.onRoot().performKeyInput {
            pressKey(Key.Tab)
        }
    }

    @Test
    fun testNavigationDrawerCollapsed() {
        composeTestRule.content {
            NavigationDrawerCollapsed(style = NavigationDrawer.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testNavigationDrawerNoHeader() {
        composeTestRule.content {
            NavigationDrawerNoHeader(style = NavigationDrawer.Default.style())
        }
        composeTestRule.onRoot().performKeyInput {
            pressKey(Key.Tab)
        }
        composeTestRule.onNodeWithText("Title 1").performClick()
    }

    @Test
    fun testNavigationDrawerCounter() {
        composeTestRule.content {
            NavigationDrawerCounter(style = NavigationDrawer.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testNavigationDrawerAmountFifty() {
        composeTestRule.content {
            NavigationDrawerAmountFifty(style = NavigationDrawer.Default.style())
        }
        composeTestRule.onRoot().performKeyInput {
            pressKey(Key.Tab)
        }
        composeTestRule.onNodeWithText("Title 10").performClick()
    }
}
