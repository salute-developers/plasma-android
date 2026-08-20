@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLErrorInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDefaultInnerLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabled
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuccessRequiredLeftOuter
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSReadOnly
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.OuterLabel
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.RequiredStart
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.TextField
import com.sdds.serv.styles.textfield.TextFieldClear
import kotlin.test.Test

internal class ComposeTextFieldKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T1501
     */
    @Test
    fun testTextFieldLDefault() {
        content(::testTextFieldLDefault) {
            TextFieldLDefaultInnerLeft(TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    /**
     * PLASMA-T1556
     */
    @Test
    fun testTextFieldLSuccessRequiredLeftOuter() {
        content(::testTextFieldLSuccessRequiredLeftOuter) {
            TextFieldLSuccessRequiredLeftOuter(TextField.L.OuterLabel.RequiredStart.Success.style())
        }
    }

    /**
     * PLASMA-T1558
     */
    @Test
    fun testTextFieldSReadOnly() {
        content(::testTextFieldSReadOnly) {
            TextFieldSReadOnly(TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    /**
     * PLASMA-T1560
     */
    @Test
    fun testTextFieldLDisabled() {
        content(::testTextFieldLDisabled) {
            TextFieldLDisabled(TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    /**
     * PLASMA-T1566
     */
    @Test
    fun testTextFieldClearLErrorInnerOptional() {
        content(::testTextFieldClearLErrorInnerOptional) {
            TextFieldClearLErrorInnerOptional(
                TextFieldClear.L.InnerLabel.Error.style(),
            )
        }
    }
}
