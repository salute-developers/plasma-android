@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
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
import kotlin.test.Test

internal class ComposePopoverKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2007
     */
    @Test
    fun testPopoverMDefaultStrictBottomEndTopStart() {
        content(::testPopoverMDefaultStrictBottomEndTopStart, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testPopoverMDefaultLooseTopEnd, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testPopoverMDefaultLooseStartCenterBottomEnd, captureRoot = ScreenshotCaptureRoot.Last) {
            PopoverMDefaultLooseStartCenterBottomEnd(
                style = Popover.M.Default.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }
}
