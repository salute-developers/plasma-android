package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.CodeInputCodeLengthFourKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.CodeInputCodeLengthSixHiddenKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.L
import com.sdds.serv.styles.codeinput.M
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmCodeInputScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    @Test
    fun testCodeInputCodeLengthFour() {
        content {
            CodeInputCodeLengthFourKmp(style = CodeInput.L.style())
        }
    }

    @Test
    fun testCodeInputCodeLengthSixHidden() {
        content {
            CodeInputCodeLengthSixHiddenKmp(style = CodeInput.M.style())
        }
    }
}
