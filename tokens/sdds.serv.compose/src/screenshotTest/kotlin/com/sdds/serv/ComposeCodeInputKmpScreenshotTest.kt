@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.CodeInputCodeLengthFour
import com.sdds.compose.uikit.fixtures.testcases.CodeInputCodeLengthSixHidden
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.L
import com.sdds.serv.styles.codeinput.M
import kotlin.test.Test

internal class ComposeCodeInputKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    @Test
    fun testCodeInputCodeLengthFour() {
        content(::testCodeInputCodeLengthFour) {
            CodeInputCodeLengthFour(style = CodeInput.L.style())
        }
    }

    @Test
    fun testCodeInputCodeLengthSixHidden() {
        content(::testCodeInputCodeLengthSixHidden) {
            CodeInputCodeLengthSixHidden(style = CodeInput.M.style())
        }
    }
}
