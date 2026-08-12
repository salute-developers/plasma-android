package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseStartCenterBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultLooseTopEnd
import com.sdds.compose.uikit.fixtures.testcases.PopoverMDefaultStrictBottomEndTopStart
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmPopoverScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2007
     */
    @Test
    fun testPopoverMDefaultStrictBottomEndTopStart() {
        content(capture = { captureLastRootRoboImage(it) }) {
            PopoverMDefaultStrictBottomEndTopStart(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2013
     */
    @Test
    fun testPopoverMDefaultLooseTopEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            PopoverMDefaultLooseTopEnd(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2015
     */
    @Test
    fun testPopoverMDefaultLooseStartCenterBottomEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            PopoverMDefaultLooseStartCenterBottomEnd(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }
}
