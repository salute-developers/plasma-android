package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
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
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmSelectScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2578
     */
    @Test
    fun testSelectSingleNormalXlTopStart() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
            SelectMultipleNormalReadOnly(
                style = SelectMultipleNormal.L.style(),
                initialOpened = true,
            )
        }
    }
}
