@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.TextAreaMDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSLongText
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textarea.Default
import com.sdds.serv.styles.textarea.InnerLabel
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.OuterLabel
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.TextArea
import com.sdds.serv.styles.textarea.Warning
import kotlin.test.Test

internal class ComposeTextAreaKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T1918
     */
    @Test
    fun testTextAreaMDefaultOuterOptional() {
        content(::testTextAreaMDefaultOuterOptional) {
            TextAreaMDefaultOuterOptional(TextArea.M.OuterLabel.Default.style())
        }
    }

    /**
     * PLASMA-T1219
     */
    @Test
    fun testTextAreaSLongText() {
        content(::testTextAreaSLongText) {
            TextAreaSLongText(TextArea.S.InnerLabel.Warning.style())
        }
    }
}
