package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.testcases.TooltipMLooseStartCenterBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.TooltipMLooseTopEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.tooltip.M
import com.sdds.serv.styles.tooltip.Tooltip
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmTooltipScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2022
     */
    @Test
    fun testTooltipMLooseTopEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
            TooltipMLooseStartCenterBottomEnd(
                style = Tooltip.M.style(),
                buttonStyle = BasicButton.S.Default.style(),
                initialOpened = true,
            )
        }
    }
}
