package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ToolBarHorizontal
import com.sdds.compose.uikit.fixtures.testcases.ToolBarHorizontalDivider
import com.sdds.compose.uikit.fixtures.testcases.ToolBarVertical
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.basicbutton.BasicButton
import com.sdds.plasma.sd.service.styles.basicbutton.Default
import com.sdds.plasma.sd.service.styles.basicbutton.M
import com.sdds.plasma.sd.service.styles.basicbutton.S
import com.sdds.plasma.sd.service.styles.basicbutton.Xs
import com.sdds.plasma.sd.service.styles.iconbutton.Default
import com.sdds.plasma.sd.service.styles.iconbutton.IconButton
import com.sdds.plasma.sd.service.styles.iconbutton.M
import com.sdds.plasma.sd.service.styles.iconbutton.S
import com.sdds.plasma.sd.service.styles.iconbutton.Xs
import com.sdds.plasma.sd.service.styles.toolbar.HasShadow
import com.sdds.plasma.sd.service.styles.toolbar.L
import com.sdds.plasma.sd.service.styles.toolbar.M
import com.sdds.plasma.sd.service.styles.toolbar.S
import com.sdds.plasma.sd.service.styles.toolbar.ToolBarHorizontal
import com.sdds.plasma.sd.service.styles.toolbar.ToolBarVertical
import com.sdds.plasma.sd.service.styles.toolbar.Xs
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
