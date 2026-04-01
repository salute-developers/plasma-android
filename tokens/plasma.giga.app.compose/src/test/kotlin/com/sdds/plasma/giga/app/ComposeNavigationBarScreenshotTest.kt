package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarContentBottomStart
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarInlineRelative
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarLongTextBottomStartInline
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarLongTextContentInlineCenterBottom
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarTextContentBottomCenterBottom
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarTextContentInlineCenter
import com.sdds.compose.uikit.fixtures.testcases.NavigationBarTextHasActionEndInlineEndBottom
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.navigationbar.HasBackground
import com.sdds.plasma.giga.app.styles.navigationbar.NavigationBarInternalPage
import com.sdds.plasma.giga.app.styles.navigationbar.NavigationBarMainPage
import com.sdds.plasma.giga.app.styles.navigationbar.NoBackground
import com.sdds.plasma.giga.app.styles.navigationbar.Rounded
import com.sdds.plasma.giga.app.styles.navigationbar.Shadow
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
            NavigationBarTextContentInlineCenter(NavigationBarMainPage.NoBackground.style())
        }
    }

    @Test
    fun testNavBarNoBackgroundRounded() {
        composeTestRule.content {
            NavigationBarContentBottomStart(NavigationBarInternalPage.NoBackground.Rounded.style())
        }
    }

    @Test
    fun testNavBarHasBackground() {
        composeTestRule.content {
            NavigationBarLongTextContentInlineCenterBottom(NavigationBarInternalPage.HasBackground.style())
        }
    }

    @Test
    fun testNavBarHasBackgroundRounded() {
        composeTestRule.content {
            NavigationBarTextHasActionEndInlineEndBottom(NavigationBarInternalPage.HasBackground.Rounded.style())
        }
    }

    @Test
    fun testNavBarHasBackgroundShadow() {
        composeTestRule.content {
            NavigationBarLongTextBottomStartInline(NavigationBarInternalPage.HasBackground.Shadow.style())
        }
    }

    @Test
    fun testNavBarHasBackgroundShadowRounded() {
        composeTestRule.content {
            NavigationBarTextContentBottomCenterBottom(NavigationBarInternalPage.HasBackground.Shadow.Rounded.style())
        }
    }

    @Test
    fun testNavigationBarInlineRelative() {
        composeTestRule.content {
            NavigationBarInlineRelative(NavigationBarMainPage.NoBackground.style())
        }
    }
}
