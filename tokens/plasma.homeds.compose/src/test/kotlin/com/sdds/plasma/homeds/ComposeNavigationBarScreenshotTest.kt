package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.navigationbar.Default
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarInternalPage
import com.sdds.plasma.homeds.styles.navigationbar.NavigationBarMainPage
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.navigationbar.NavigationBarContentBottomStart
import com.sdds.testing.compose.navigationbar.NavigationBarInlineRelative
import com.sdds.testing.compose.navigationbar.NavigationBarLongTextBottomStartInline
import com.sdds.testing.compose.navigationbar.NavigationBarLongTextContentInlineCenterBottom
import com.sdds.testing.compose.navigationbar.NavigationBarTextContentBottomCenterBottom
import com.sdds.testing.compose.navigationbar.NavigationBarTextContentInlineCenter
import com.sdds.testing.compose.navigationbar.NavigationBarTextHasActionEndInlineEndBottom
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeNavigationBarScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testNavBarMainPageNoBackGround() {
        composeTestRule.content {
            NavigationBarTextContentInlineCenter(NavigationBarMainPage.Default.style())
        }
    }

    @Test
    fun testNavBarNoBackgroundRounded() {
        composeTestRule.content {
            NavigationBarContentBottomStart(NavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testNavBarHasBackground() {
        composeTestRule.content {
            NavigationBarLongTextContentInlineCenterBottom(NavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testNavBarHasBackgroundRounded() {
        composeTestRule.content {
            NavigationBarTextHasActionEndInlineEndBottom(NavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testNavBarHasBackgroundShadow() {
        composeTestRule.content {
            NavigationBarLongTextBottomStartInline(NavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testNavBarHasBackgroundShadowRounded() {
        composeTestRule.content {
            NavigationBarTextContentBottomCenterBottom(NavigationBarInternalPage.Default.style())
        }
    }

    @Test
    fun testNavigationBarInlineRelative() {
        composeTestRule.content {
            NavigationBarInlineRelative(NavigationBarMainPage.Default.style())
        }
    }
}
