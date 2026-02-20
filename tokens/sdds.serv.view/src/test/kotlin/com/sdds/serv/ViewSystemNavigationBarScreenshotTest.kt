package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.navigationbar.NavigationBarTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemNavigationBarScreenshotTest(
    theme: String,
) : NavigationBarTestCases(theme) {

    @Test
    override fun testNavigationBarMainPageNoBackground() {
        themedComponent {
            navigationBarInnerCenterNoDescription(R.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageNoBackground)
        }
    }

    @Test
    override fun testNavigationBarInternalPageNoBackgroundRounded() {
        themedComponent {
            navigationBarNoTextNoDescription(
                R.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageNoBackgroundRounded,
            )
        }
    }

    @Test
    override fun testNavigationBarInternalPageHasBackgroundLongText() {
        themedComponent {
            navigationBarLongTitleLongContent(
                R.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackground,
            )
        }
    }

    @Test
    override fun testNavigationHasBackgroundRounded() {
        themedComponent {
            navigationBarNoContentInnerEndBottom(
                R.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackgroundRounded,
            )
        }
    }

    @Test
    override fun testNavigationBarHasBackgroundShadow() {
        themedComponent {
            navigationBarLongTitle(R.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackgroundShadow)
        }
    }

    @Test
    override fun testNavigationBarHasBackgroundShadowRounded() {
        themedComponent {
            navigationBarBottomCenter(
                R.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackgroundShadowRounded,
            )
        }
    }

    @Test
    override fun testNavigationBarInnerRelative() {
        themedComponent {
            navigationBarInnerRelative(R.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageNoBackground)
        }
    }

    @Test
    override fun testNavigationBarLongDescription() {
        themedComponent {
            navigationBarLongDescription(R.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageNoBackground)
        }
    }
}
