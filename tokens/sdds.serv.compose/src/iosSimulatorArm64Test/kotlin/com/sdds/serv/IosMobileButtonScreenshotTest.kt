package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeLDefaultKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeLDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeLIsLoadingKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeMSpaceBetweenKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import kotlin.test.Test

abstract class IosMobileButtonScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeLDefault() {
        content(::testButtonSizeLDefault) {
            ButtonSizeLDefaultKmp(BasicButton.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeLDisabled() {
        content(::testButtonSizeLDisabled) {
            ButtonSizeLDisabledKmp(BasicButton.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeLIsLoading() {
        content(::testButtonSizeLIsLoading) {
            ButtonSizeLIsLoadingKmp(BasicButton.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeMSpaceBetween() {
        content(::testButtonSizeMSpaceBetween) {
            ButtonSizeMSpaceBetweenKmp(BasicButton.M.Default.style())
        }
    }
}

class IosMobileButtonLightScreenshotTest : IosMobileButtonScreenshotTest(
    themeMode = RoborazziScreenshotThemeMode.Light,
)

class IosMobileButtonDarkScreenshotTest : IosMobileButtonScreenshotTest(
    themeMode = RoborazziScreenshotThemeMode.Dark,
)
