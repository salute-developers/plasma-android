package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.CodeInputCodeLengthFourKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.CodeInputCodeLengthSixHiddenKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.L
import com.sdds.serv.styles.codeinput.M
import kotlin.test.Test

abstract class IosMobileCodeInputScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testCodeInputCodeLengthFour() {
        content(::testCodeInputCodeLengthFour) {
            CodeInputCodeLengthFourKmp(style = CodeInput.L.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testCodeInputCodeLengthSixHidden() {
        content(::testCodeInputCodeLengthSixHidden) {
            CodeInputCodeLengthSixHiddenKmp(style = CodeInput.M.style())
        }
    }
}

class IosMobileCodeInputScreenshotLightTest : IosMobileCodeInputScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileCodeInputScreenshotDarkTest : IosMobileCodeInputScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
