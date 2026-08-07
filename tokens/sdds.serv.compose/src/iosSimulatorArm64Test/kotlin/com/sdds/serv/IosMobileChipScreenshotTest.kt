package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
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
import kotlin.test.Test

abstract class IosMobileChipScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testChipSizeLDefault() {
        content(::testChipSizeLDefault) {
            ChipSizeLDefaultKmp(style = Chip.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testChipDisabled() {
        content(::testChipDisabled) {
            ChipDisabledKmp(style = Chip.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testChipGroupSizeLDense() {
        content(::testChipGroupSizeLDense) {
            ChipGroupSizeLDenseKmp(style = ChipGroupDense.L.Default.style())
        }
    }
}

class IosMobileChipScreenshotLightTest : IosMobileChipScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileChipScreenshotDarkTest : IosMobileChipScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
