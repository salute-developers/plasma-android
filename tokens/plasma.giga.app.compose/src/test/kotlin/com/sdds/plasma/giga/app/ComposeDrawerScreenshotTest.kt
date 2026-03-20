package com.sdds.plasma.giga.app

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.DrawerCloseIconAbsolute
import com.sdds.compose.uikit.fixtures.testcases.DrawerCloseInnerMStartHeader
import com.sdds.compose.uikit.fixtures.testcases.DrawerCloseInnerNoShadowBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.DrawerCloseInnerPeakOffSet
import com.sdds.compose.uikit.fixtures.testcases.DrawerCloseNoneEndStartHeaderFooter
import com.sdds.compose.uikit.fixtures.testcases.DrawerCloseOuterMShadowTopEndFooterHasOverlay
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.app.styles.basicbutton.Default
import com.sdds.plasma.giga.app.styles.basicbutton.L
import com.sdds.plasma.giga.app.styles.drawer.DrawerCloseInner
import com.sdds.plasma.giga.app.styles.drawer.DrawerCloseNone
import com.sdds.plasma.giga.app.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.giga.app.styles.drawer.HasShadow
import com.sdds.plasma.giga.app.styles.drawer.M
import com.sdds.plasma.giga.app.styles.listitem.L
import com.sdds.plasma.giga.app.styles.listitem.ListItemNormal
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
    fun testDrawerCloseInnerMStartHeader() {
        composeTestRule.content {
            DrawerCloseInnerMStartHeader(
                style = DrawerCloseInner.M.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Показать Drawer").performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerCloseOuterMShadowTopEndFooterHasOverlay() {
        composeTestRule.content {
            DrawerCloseOuterMShadowTopEndFooterHasOverlay(
                style = DrawerCloseOuter.M.HasShadow.style(),
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
    fun testDrawerCloseNoneEndStartHeaderFooter() {
        composeTestRule.content {
            DrawerCloseNoneEndStartHeaderFooter(
                style = DrawerCloseNone.M.style(),
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
            DrawerCloseInnerNoShadowBottomEnd(
                style = DrawerCloseInner.M.style(),
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
            DrawerCloseInnerPeakOffSet(
                style = DrawerCloseInner.M.HasShadow.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
    }

    @Test
    fun testDrawerCloseIconAbsolute() {
        composeTestRule.content {
            DrawerCloseIconAbsolute(
                style = DrawerCloseInner.M.style(),
                listItemStyle = ListItemNormal.L.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithTag("DrawerButton").performClick()
    }
}
