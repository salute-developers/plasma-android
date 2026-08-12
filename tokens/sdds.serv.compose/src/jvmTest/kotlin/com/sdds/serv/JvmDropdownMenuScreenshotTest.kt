package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
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
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmDropdownMenuScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2085
     */
    @Test
    fun testDropDownMenuXsStrictCenter() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
            DropDownMenuXlAmountTenStrictCenterEnd(
                style = DropdownMenuNormal.Xl.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialOpened = true,
            )
        }
    }
}
