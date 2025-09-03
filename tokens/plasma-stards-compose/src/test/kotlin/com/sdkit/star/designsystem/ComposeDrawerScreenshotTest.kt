package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.drawer.DrawerCloseIconAbsolute
import com.sdds.testing.compose.drawer.DrawerCloseInnerMStartHeader
import com.sdds.testing.compose.drawer.DrawerCloseInnerNoShadowBottomEnd
import com.sdds.testing.compose.drawer.DrawerCloseInnerPeakOffSet
import com.sdds.testing.compose.drawer.DrawerCloseNoneEndStartHeaderFooter
import com.sdds.testing.compose.drawer.DrawerCloseOuterMShadowTopEndFooterHasOverlay
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.drawer.Drawer
import com.sdkit.star.designsystem.styles.drawer.HasBackground
import com.sdkit.star.designsystem.styles.drawer.NoBackground
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.ListItem
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeDrawerScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testDrawerNoBackgroundStartHeaderHasOverlay() {
        composeTestRule.content {
            DrawerCloseInnerMStartHeader(
                style = Drawer.NoBackground.style(),
                listItemStyle = ListItem.L.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Показать Drawer").performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerHasBackgroundTopEndFooterHasOverlayPeekOffSet() {
        composeTestRule.content {
            DrawerCloseOuterMShadowTopEndFooterHasOverlay(
                style = Drawer.HasBackground.style(),
                listItemStyle = ListItem.L.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithTag("Drawer").performTouchInput {
            swipeDown()
        }
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerNoBackgroundEndStartHeaderFooterHasClose() {
        composeTestRule.content {
            DrawerCloseNoneEndStartHeaderFooter(
                style = Drawer.NoBackground.style(),
                listItemStyle = ListItem.L.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithText("Показать Drawer").performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testDrawerNoBackgroundBottomEnd() {
        composeTestRule.content {
            DrawerCloseInnerNoShadowBottomEnd(
                style = Drawer.NoBackground.style(),
                listItemStyle = ListItem.L.style(),
                buttonStyle = BasicButton.L.style(),
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
                style = Drawer.HasBackground.style(),
                listItemStyle = ListItem.L.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
    }

    @Test
    fun testDrawerCloseIconAbsolute() {
        composeTestRule.content {
            DrawerCloseIconAbsolute(
                style = Drawer.NoBackground.style(),
                listItemStyle = ListItem.L.style(),
                buttonStyle = BasicButton.L.style(),
            )
        }
        composeTestRule.onNodeWithTag("DrawerButton").performClick()
    }
}
