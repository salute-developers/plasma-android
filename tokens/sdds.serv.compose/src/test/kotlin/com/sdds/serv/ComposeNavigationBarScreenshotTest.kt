package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.navigationbar.HasBackground
import com.sdds.serv.styles.navigationbar.NavigationBarInternalPage
import com.sdds.serv.styles.navigationbar.NavigationBarMainPage
import com.sdds.serv.styles.navigationbar.NoBackground
import com.sdds.serv.styles.navigationbar.Rounded
import com.sdds.serv.styles.navigationbar.Shadow
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.navigationbar.NavigationBarContentBottomStart
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
}
