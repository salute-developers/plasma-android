package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
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
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmTextAreaScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T1918
     */
    @Test
    fun testTextAreaMDefaultOuterOptional() {
        content {
            TextAreaMDefaultOuterOptionalKmp(TextArea.M.OuterLabel.Default.style())
        }
    }

    /**
     * PLASMA-T1219
     */
    @Test
    fun testTextAreaSLongText() {
        content {
            TextAreaSLongTextKmp(TextArea.S.InnerLabel.Warning.style())
        }
    }
}
