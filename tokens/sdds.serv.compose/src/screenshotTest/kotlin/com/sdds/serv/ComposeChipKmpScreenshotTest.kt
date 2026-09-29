@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.ChipDisabled
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeLDense
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeLDefault
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.chip.Chip
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chipgroup.ChipGroupDense
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.L
import kotlin.test.Test

internal class ComposeChipKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    @Test
    fun testChipSizeLDefault() {
        content(::testChipSizeLDefault) {
            ChipSizeLDefault(style = Chip.L.Default.style())
        }
    }

    @Test
    fun testChipDisabled() {
        content(::testChipDisabled) {
            ChipDisabled(style = Chip.L.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeLDense() {
        content(::testChipGroupSizeLDense) {
            ChipGroupSizeLDense(style = ChipGroupDense.L.Default.style())
        }
    }
}
