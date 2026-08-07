package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeLDefaultKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeLDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeLIsLoadingKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ButtonSizeMSpaceBetweenKmp
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
            ButtonSizeLDefaultKmp(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonLDisabled() {
        content {
            ButtonSizeLDisabledKmp(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonLIsLoading() {
        content {
            ButtonSizeLIsLoadingKmp(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonMSpaceBetween() {
        content {
            ButtonSizeMSpaceBetweenKmp(BasicButton.M.Default.style())
        }
    }
}
