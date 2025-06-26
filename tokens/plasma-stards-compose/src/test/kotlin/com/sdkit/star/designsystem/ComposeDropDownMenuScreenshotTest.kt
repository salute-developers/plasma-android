package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
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
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenu
import com.sdkit.star.designsystem.styles.dropdownmenu.L
import com.sdkit.star.designsystem.styles.dropdownmenu.M
import com.sdkit.star.designsystem.styles.dropdownmenu.S
import com.sdkit.star.designsystem.styles.dropdownmenu.Xl
import com.sdkit.star.designsystem.styles.dropdownmenu.Xs
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeDropDownMenuScreenshotTest : RoborazziConfigCompose("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDropDownMenuXlHasDisclosureTopStart() {
        composeTestRule.content {
            DropDownMenuXlHasDisclosureTopStart(
                DropdownMenu.Xl.style(),
                BasicButton.M.style(),
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
                DropdownMenu.L.style(),
                BasicButton.M.style(),
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
                DropdownMenu.M.style(),
                BasicButton.M.style(),
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
                DropdownMenu.S.style(),
                BasicButton.M.style(),
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
                DropdownMenu.Xs.style(),
                BasicButton.M.style(),
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
                DropdownMenu.Xl.style(),
                BasicButton.M.style(),
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
                DropdownMenu.Xl.style(),
                BasicButton.M.style(),
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
                DropdownMenu.Xl.style(),
                BasicButton.M.style(),
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
                DropdownMenu.Xl.style(),
                BasicButton.M.style(),
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
                DropdownMenu.Xs.style(),
                BasicButton.M.style(),
            )
        }
        composeTestRule.onNodeWithText("Show DropDownMenu").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
