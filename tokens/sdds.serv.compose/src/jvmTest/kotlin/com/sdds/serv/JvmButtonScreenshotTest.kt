package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMSpaceBetween
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmButtonScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    @Test
    fun testButtonLDefault() {
        content {
            ButtonSizeLDefault(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonLDisabled() {
        content {
            ButtonSizeLDisabled(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonLIsLoading() {
        content {
            ButtonSizeLIsLoading(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonMSpaceBetween() {
        content {
            ButtonSizeMSpaceBetween(BasicButton.M.Default.style())
        }
    }
}
