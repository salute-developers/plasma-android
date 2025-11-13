package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.toolbar.ToolBarTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemToolBarScreenshotTest(
    theme: String,
) : ToolBarTestCases(theme) {

    @Test
    override fun testToolbarLHorizontalHasShadow() {
        themedComponent {
            toolbarTestCase(R.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalLHasShadow)
        }
    }

    @Test
    override fun testToolBarMVertical() {
        themedComponent {
            toolbarTestCase(R.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalM)
        }
    }

    @Test
    override fun testToolBarSHorizontal() {
        themedComponent {
            toolbarTestCase(R.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalS)
        }
    }

    @Test
    override fun testToolBarXsHorizontal() {
        themedComponent {
            toolbarTestCase(R.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalXs)
        }
    }

    @Test
    override fun testToolBarDivider() {
        themedComponent {
            toolbarTestDivider(R.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalL)
        }
    }
}
