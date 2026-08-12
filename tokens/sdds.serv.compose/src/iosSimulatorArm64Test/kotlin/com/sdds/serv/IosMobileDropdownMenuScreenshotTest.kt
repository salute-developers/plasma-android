package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
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

abstract class IosMobileDropdownMenuScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2085
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testDropDownMenuXsStrictCenter() {
        content(
            ::testDropDownMenuXsStrictCenter,
            capture = { captureLastRootRoboImage(it) },
        ) {
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
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testDropDownMenuXlLooseTopEndDivider() {
        content(
            ::testDropDownMenuXlLooseTopEndDivider,
            capture = { captureLastRootRoboImage(it) },
        ) {
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
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testDropDownMenuXlAmountTenStrictCenterEnd() {
        content(
            ::testDropDownMenuXlAmountTenStrictCenterEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            DropDownMenuXlAmountTenStrictCenterEnd(
                style = DropdownMenuNormal.Xl.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialOpened = true,
            )
        }
    }
}

class IosMobileDropdownMenuScreenshotLightTest : IosMobileDropdownMenuScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileDropdownMenuScreenshotDarkTest : IosMobileDropdownMenuScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
