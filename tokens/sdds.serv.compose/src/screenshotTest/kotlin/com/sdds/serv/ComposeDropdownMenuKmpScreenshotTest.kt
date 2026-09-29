@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlAmountTenStrictCenterEnd
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXlLooseTopEndDivider
import com.sdds.compose.uikit.fixtures.testcases.DropDownMenuXsStrictCenter
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs
import kotlin.test.Test

internal class ComposeDropdownMenuKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2085
     */
    @Test
    fun testDropDownMenuXsStrictCenter() {
        content(::testDropDownMenuXsStrictCenter, captureRoot = ScreenshotCaptureRoot.Last) {
            DropDownMenuXsStrictCenter(
                style = DropdownMenuNormal.Xs.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2087
     */
    @Test
    fun testDropDownMenuXlLooseTopEndDivider() {
        content(::testDropDownMenuXlLooseTopEndDivider, captureRoot = ScreenshotCaptureRoot.Last) {
            DropDownMenuXlLooseTopEndDivider(
                style = DropdownMenuNormal.Xl.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2088
     */
    @Test
    fun testDropDownMenuXlAmountTenStrictCenterEnd() {
        content(::testDropDownMenuXlAmountTenStrictCenterEnd, captureRoot = ScreenshotCaptureRoot.Last) {
            DropDownMenuXlAmountTenStrictCenterEnd(
                style = DropdownMenuNormal.Xl.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialOpened = true,
            )
        }
    }
}
