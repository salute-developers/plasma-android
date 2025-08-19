package com.sdds.plasma.giga.app

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.app.styles.basicbutton.Default
import com.sdds.plasma.giga.app.styles.basicbutton.L
import com.sdds.plasma.giga.app.styles.drawer.Drawer
import com.sdds.plasma.giga.app.styles.drawer.HasShadow
import com.sdds.plasma.giga.app.styles.drawer.NoShadow
import com.sdds.plasma.giga.app.styles.listitem.L
import com.sdds.plasma.giga.app.styles.listitem.ListItemNormal
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.drawer.DrawerHasShadowTopEndFooterHasOverlayPeekOffSet
import com.sdds.testing.compose.drawer.DrawerNoShadowBottomStart
import com.sdds.testing.compose.drawer.DrawerNoShadowEndStartHeaderFooterHasClose
import com.sdds.testing.compose.drawer.DrawerNoShadowStartHeaderOverlayHasClose
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeDrawerScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testDrawerNoShadowStartHeaderHasOverlay() {
        composeTestRule.content {
            DrawerNoShadowStartHeaderOverlayHasClose(
                style = Drawer.NoShadow.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Показать Drawer").performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerHasShadowTopEndFooterHasOverlayPeekOffSet() {
        composeTestRule.content {
            DrawerHasShadowTopEndFooterHasOverlayPeekOffSet(
                style = Drawer.HasShadow.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithTag("Drawer").performTouchInput {
            swipeDown()
        }
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerNoShadowEndStartHeaderFooterHasClose() {
        composeTestRule.content {
            DrawerNoShadowEndStartHeaderFooterHasClose(
                style = Drawer.NoShadow.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Показать Drawer").performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerNoShadowBottomStart() {
        composeTestRule.content {
            DrawerNoShadowBottomStart(
                style = Drawer.NoShadow.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Показать Drawer").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("Drawer").performTouchInput {
            down(center)
            advanceEventTime(500L)
            up()
        }
    }

    @Test
    fun testDrawerHasPeakOffSet() {
        composeTestRule.content {
            DrawerHasShadowTopEndFooterHasOverlayPeekOffSet(
                style = Drawer.HasShadow.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
    }
}
