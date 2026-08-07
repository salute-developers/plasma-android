package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.ChipDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ChipGroupSizeLDenseKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ChipSizeLDefaultKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.chip.Chip
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chipgroup.ChipGroupDense
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.L
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmChipScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    @Test
    fun testChipSizeLDefault() {
        content {
            ChipSizeLDefaultKmp(style = Chip.L.Default.style())
        }
    }

    @Test
    fun testChipDisabled() {
        content {
            ChipDisabledKmp(style = Chip.L.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeLDense() {
        content {
            ChipGroupSizeLDenseKmp(style = ChipGroupDense.L.Default.style())
        }
    }
}
