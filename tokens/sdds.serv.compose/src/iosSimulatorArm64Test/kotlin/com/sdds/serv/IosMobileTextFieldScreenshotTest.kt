package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLErrorInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDefaultInnerLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabled
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSReadOnly
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.TextField
import com.sdds.serv.styles.textfield.TextFieldClear
import kotlin.test.Test

abstract class IosMobileTextFieldScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldLDefault() {
        content(::testTextFieldLDefault) {
            TextFieldLDefaultInnerLeft(TextField.L.Default.style())
        }
    }

    /**
     * PLASMA-T1558
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldSReadOnly() {
        content(::testTextFieldSReadOnly) {
            TextFieldSReadOnly(TextField.S.Default.style())
        }
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldLDisabled() {
        content(::testTextFieldLDisabled) {
            TextFieldLDisabled(TextField.L.Default.style())
        }
    }

    /**
     * PLASMA-T1566
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testTextFieldClearLErrorInnerOptional() {
        content(::testTextFieldClearLErrorInnerOptional) {
            TextFieldClearLErrorInnerOptional(
                TextFieldClear.L.InnerLabel.Error.style(),
            )
        }
    }
}

class IosMobileTextFieldScreenshotLightTest : IosMobileTextFieldScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileTextFieldScreenshotDarkTest : IosMobileTextFieldScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
