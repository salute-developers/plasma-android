package com.sdds.plasma.giga.app

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuLStrictCenterStart
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuMStrictBottomStart
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuSStrictTopCenter
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuTightXsStrictCenter
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlAmountTenLooseBottomCenter
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlAmountTenStrictCenterEnd
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlHasDisclosureTopStart
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlLooseBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlLooseTopEndDivider
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXsStrictCenter
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.app.styles.basicbutton.Default
import com.sdds.plasma.giga.app.styles.basicbutton.M
import com.sdds.plasma.giga.app.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.giga.app.styles.dropdownmenu.DropdownMenuTight
import com.sdds.plasma.giga.app.styles.dropdownmenu.L
import com.sdds.plasma.giga.app.styles.dropdownmenu.M
import com.sdds.plasma.giga.app.styles.dropdownmenu.S
import com.sdds.plasma.giga.app.styles.dropdownmenu.Xl
import com.sdds.plasma.giga.app.styles.dropdownmenu.Xs
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
