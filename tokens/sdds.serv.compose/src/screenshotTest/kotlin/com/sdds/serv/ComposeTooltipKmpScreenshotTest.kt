@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.TooltipMLooseStartCenterBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.TooltipMLooseTopEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.tooltip.M
import com.sdds.serv.styles.tooltip.Tooltip
import kotlin.test.Test

internal class ComposeTooltipKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2022
     */
    @Test
    fun testTooltipMLooseTopEnd() {
        content(::testTooltipMLooseTopEnd, captureRoot = ScreenshotCaptureRoot.Last) {
            TooltipMLooseTopEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2024
     */
    @Test
    fun testTooltipMLooseStartCenterBottomEnd() {
        content(::testTooltipMLooseStartCenterBottomEnd, captureRoot = ScreenshotCaptureRoot.Last) {
            TooltipMLooseStartCenterBottomEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }
}
