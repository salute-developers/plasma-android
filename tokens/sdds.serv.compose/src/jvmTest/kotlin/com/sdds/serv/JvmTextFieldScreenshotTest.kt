package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
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
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmTextFieldScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T1501
     */
    @Test
    fun testTextFieldLDefault() {
        content {
            TextFieldLDefaultInnerLeft(TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    /**
     * PLASMA-T1556
     */
    @Test
    fun testTextFieldLSuccessRequiredLeftOuter() {
        content {
            TextFieldLSuccessRequiredLeftOuter(TextField.L.OuterLabel.RequiredStart.Success.style())
        }
    }

    /**
     * PLASMA-T1558
     */
    @Test
    fun testTextFieldSReadOnly() {
        content {
            TextFieldSReadOnly(TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    /**
     * PLASMA-T1560
     */
    @Test
    fun testTextFieldLDisabled() {
        content {
            TextFieldLDisabled(TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    /**
     * PLASMA-T1566
     */
    @Test
    fun testTextFieldClearLErrorInnerOptional() {
        content {
            TextFieldClearLErrorInnerOptional(
                TextFieldClear.L.InnerLabel.Error.style(),
            )
        }
    }
}
