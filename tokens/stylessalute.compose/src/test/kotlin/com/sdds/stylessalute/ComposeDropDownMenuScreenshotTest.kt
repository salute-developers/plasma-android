package com.sdds.stylessalute

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
import com.sdds.stylessalute.styles.basicbutton.BasicButton
import com.sdds.stylessalute.styles.basicbutton.Default
import com.sdds.stylessalute.styles.basicbutton.M
import com.sdds.stylessalute.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.stylessalute.styles.dropdownmenu.DropdownMenuTight
import com.sdds.stylessalute.styles.dropdownmenu.L
import com.sdds.stylessalute.styles.dropdownmenu.M
import com.sdds.stylessalute.styles.dropdownmenu.S
import com.sdds.stylessalute.styles.dropdownmenu.Xs
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
    fun testDropDownMenuLHasDisclosureTopStart() {
        composeTestRule.content {
            DropDownMenuXlHasDisclosureTopStart(
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
    fun testDropDownMenuLAmountTenLooseBottomCenter() {
        composeTestRule.content {
            DropDownMenuXlAmountTenLooseBottomCenter(
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
    fun testDropDownMenuLLooseTopEndDivider() {
        composeTestRule.content {
            DropDownMenuXlLooseTopEndDivider(
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
    fun testDropDownMenuLAmountTenStrictCenterEnd() {
        composeTestRule.content {
            DropDownMenuXlAmountTenStrictCenterEnd(
                DropdownMenuNormal.L.style(),
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
    fun testDropDownMenuLLooseBottomEnd() {
        composeTestRule.content {
            DropDownMenuXlLooseBottomEnd(
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
