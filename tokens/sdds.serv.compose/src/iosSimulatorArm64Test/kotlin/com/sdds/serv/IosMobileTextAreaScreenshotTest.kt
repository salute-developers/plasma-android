package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.TextAreaMDefaultOuterOptionalKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.TextAreaSLongTextKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textarea.Default
import com.sdds.serv.styles.textarea.InnerLabel
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.OuterLabel
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.TextArea
import com.sdds.serv.styles.textarea.Warning
import kotlin.test.Test

abstract class IosMobileTextAreaScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T1918
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextAreaMDefaultOuterOptional() {
        content(::testTextAreaMDefaultOuterOptional) {
            TextAreaMDefaultOuterOptionalKmp(TextArea.M.OuterLabel.Default.style())
        }
    }

    /**
     * PLASMA-T1219
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextAreaSLongText() {
        content(::testTextAreaSLongText) {
            TextAreaSLongTextKmp(TextArea.S.InnerLabel.Warning.style())
        }
    }
}

class IosMobileTextAreaScreenshotLightTest : IosMobileTextAreaScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileTextAreaScreenshotDarkTest : IosMobileTextAreaScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
