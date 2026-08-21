@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalDisabled
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalMTopCenter
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalReadOnly
import com.sdds.compose.uikit.fixtures.testcases.SelectSingleNormalXlTopStart
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.SelectMultipleNormal
import com.sdds.serv.styles.select.SelectSingleNormal
import com.sdds.serv.styles.select.Xl
import kotlin.test.Test

internal class ComposeSelectKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2578
     */
    @Test
    fun testSelectSingleNormalXlTopStart() {
        content(::testSelectSingleNormalXlTopStart, captureRoot = ScreenshotCaptureRoot.Last) {
            SelectSingleNormalXlTopStart(
                style = SelectSingleNormal.Xl.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2580
     */
    @Test
    fun testSelectMultipleNormalMTopCenter() {
        content(::testSelectMultipleNormalMTopCenter, captureRoot = ScreenshotCaptureRoot.Last) {
            SelectMultipleNormalMTopCenter(
                style = SelectMultipleNormal.M.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2586
     */
    @Test
    fun testSelectMultipleNormalDisabled() {
        content(::testSelectMultipleNormalDisabled, captureRoot = ScreenshotCaptureRoot.Last) {
            SelectMultipleNormalDisabled(
                style = SelectMultipleNormal.L.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2592
     */
    @Test
    fun testSelectMultipleNormalReadOnly() {
        content(::testSelectMultipleNormalReadOnly, captureRoot = ScreenshotCaptureRoot.Last) {
            SelectMultipleNormalReadOnly(
                style = SelectMultipleNormal.L.style(),
                initialOpened = true,
            )
        }
    }
}
