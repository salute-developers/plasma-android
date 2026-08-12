package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMSpaceBetween
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
            ButtonSizeLDefault(BasicButton.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeLDisabled() {
        content(::testButtonSizeLDisabled) {
            ButtonSizeLDisabled(BasicButton.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeLIsLoading() {
        content(::testButtonSizeLIsLoading) {
            ButtonSizeLIsLoading(BasicButton.L.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testButtonSizeMSpaceBetween() {
        content(::testButtonSizeMSpaceBetween) {
            ButtonSizeMSpaceBetween(BasicButton.M.Default.style())
        }
    }
}

class IosMobileButtonLightScreenshotTest : IosMobileButtonScreenshotTest(
    themeMode = RoborazziScreenshotThemeMode.Light,
)

class IosMobileButtonDarkScreenshotTest : IosMobileButtonScreenshotTest(
    themeMode = RoborazziScreenshotThemeMode.Dark,
)
