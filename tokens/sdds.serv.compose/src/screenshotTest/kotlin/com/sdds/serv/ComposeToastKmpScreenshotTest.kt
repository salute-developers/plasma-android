@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.ToastPilledPositiveCenterEndHasContentStartEndOpened
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedDefaultBottomStartHasContentEndOpened
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Pilled
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast
import kotlin.test.Test

internal class ComposeToastKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2041
     */
    @Test
    fun testToastPilledPositiveCenterEndHasContentStartEnd() {
        content(::testToastPilledPositiveCenterEndHasContentStartEnd) {
            ToastPilledPositiveCenterEndHasContentStartEndOpened(
                Toast.Pilled.Positive.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2042
     */
    @Test
    fun testToastRoundedDefaultBottomStartHasContentEnd() {
        content(::testToastRoundedDefaultBottomStartHasContentEnd) {
            ToastRoundedDefaultBottomStartHasContentEndOpened(
                Toast.Rounded.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}
