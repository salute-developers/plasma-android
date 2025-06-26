package com.sdds.serv

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.serv.styles.dropdownmenu.DropdownMenuTight
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.S
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.dropdownmenu.DropDownMenuLStrictCenterStart
import com.sdds.testing.compose.dropdownmenu.DropDownMenuMStrictBottomStart
import com.sdds.testing.compose.dropdownmenu.DropDownMenuSStrictTopCenter
import com.sdds.testing.compose.dropdownmenu.DropDownMenuTightXsStrictCenter
import com.sdds.testing.compose.dropdownmenu.DropDownMenuXlAmountTenLooseBottomCenter
import com.sdds.testing.compose.dropdownmenu.DropDownMenuXlAmountTenStrictCenterEnd
import com.sdds.testing.compose.dropdownmenu.DropDownMenuXlHasDisclosureTopStart
import com.sdds.testing.compose.dropdownmenu.DropDownMenuXlLooseBottomEnd
import com.sdds.testing.compose.dropdownmenu.DropDownMenuXlLooseTopEndDivider
import com.sdds.testing.compose.dropdownmenu.DropDownMenuXsStrictCenter
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeDropDownMenuScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXlHasDisclosureTopStart() {
        composeTestRule.content {
            DropDownMenuXlHasDisclosureTopStart(
                DropdownMenuNormal.Xl.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuLStrictCenterStart() {
        composeTestRule.content {
            DropDownMenuLStrictCenterStart(
                DropdownMenuNormal.L.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuMStrictBottomStart() {
        composeTestRule.content {
            DropDownMenuMStrictBottomStart(
                DropdownMenuNormal.M.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuSStrictTopCenter() {
        composeTestRule.content {
            DropDownMenuSStrictTopCenter(
                DropdownMenuNormal.S.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXsStrictCenter() {
        composeTestRule.content {
            DropDownMenuXsStrictCenter(
                DropdownMenuNormal.Xs.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXlAmountTenLooseBottomCenter() {
        composeTestRule.content {
            DropDownMenuXlAmountTenLooseBottomCenter(
                DropdownMenuNormal.Xl.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXlLooseTopEndDivider() {
        composeTestRule.content {
            DropDownMenuXlLooseTopEndDivider(
                DropdownMenuNormal.Xl.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXlAmountTenStrictCenterEnd() {
        composeTestRule.content {
            DropDownMenuXlAmountTenStrictCenterEnd(
                DropdownMenuNormal.Xl.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @Ignore("Такая же проблема как и в Popover")
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXlLooseBottomEnd() {
        composeTestRule.content {
            DropDownMenuXlLooseBottomEnd(
                DropdownMenuNormal.Xl.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuTightXsStrictCenter() {
        composeTestRule.content {
            DropDownMenuTightXsStrictCenter(
                DropdownMenuTight.Xs.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
