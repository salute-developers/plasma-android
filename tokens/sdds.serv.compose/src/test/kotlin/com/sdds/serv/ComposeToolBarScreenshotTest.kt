package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.toolbar.HasShadow
import com.sdds.serv.styles.toolbar.L
import com.sdds.serv.styles.toolbar.M
import com.sdds.serv.styles.toolbar.S
import com.sdds.serv.styles.toolbar.ToolBarHorizontal
import com.sdds.serv.styles.toolbar.ToolBarVertical
import com.sdds.serv.styles.toolbar.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.toolbar.ToolBarHorizontal
import com.sdds.testing.compose.toolbar.ToolBarHorizontalDivider
import com.sdds.testing.compose.toolbar.ToolBarVertical
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeToolBarScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testToolBarLHorizontalHasShadow() {
        composeTestRule.content {
            ToolBarHorizontal(
                ToolBarHorizontal.L.HasShadow.style(),
                buttonStyle = BasicButton.M.Default.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testToolBarMVertical() {
        composeTestRule.content {
            ToolBarVertical(
                ToolBarVertical.M.style(),
                buttonStyle = BasicButton.M.Default.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }

    @Test
    fun testToolBarSHorizontal() {
        composeTestRule.content {
            ToolBarHorizontal(
                ToolBarHorizontal.S.style(),
                buttonStyle = BasicButton.S.Default.style(),
                iconButtonStyle = IconButton.S.Default.style(),
            )
        }
    }

    @Test
    fun testToolBarXsHorizontal() {
        composeTestRule.content {
            ToolBarHorizontal(
                ToolBarHorizontal.Xs.style(),
                buttonStyle = BasicButton.Xs.Default.style(),
                iconButtonStyle = IconButton.Xs.Default.style(),
            )
        }
    }

    @Test
    fun testToolBarLHorizontalDivider() {
        composeTestRule.content {
            ToolBarHorizontalDivider(
                ToolBarHorizontal.L.style(),
                buttonStyle = BasicButton.M.Default.style(),
                iconButtonStyle = IconButton.M.Default.style(),
            )
        }
    }
}
