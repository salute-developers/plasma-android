@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMSpaceBetween
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import kotlin.test.Test

internal class ComposeButtonKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    @Test
    fun testButtonLDefault() {
        content(::testButtonLDefault) {
            ButtonSizeLDefault(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonLDisabled() {
        content(::testButtonLDisabled) {
            ButtonSizeLDisabled(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonLIsLoading() {
        content(::testButtonLIsLoading) {
            ButtonSizeLIsLoading(BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonMSpaceBetween() {
        content(::testButtonMSpaceBetween) {
            ButtonSizeMSpaceBetween(BasicButton.M.Default.style())
        }
    }
}
