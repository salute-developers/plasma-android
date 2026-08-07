package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectMultipleNormalDisabledKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectMultipleNormalMTopCenterKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectMultipleNormalReadOnlyKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.SelectSingleNormalXlTopStartKmp
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
            SelectSingleNormalXlTopStartKmp(SelectSingleNormal.Xl.style())
        }
    }

    /**
     * PLASMA-T2580
     */
    @Test
    fun testSelectMultipleNormalMTopCenter() {
        content(capture = { captureLastRootRoboImage(it) }) {
            SelectMultipleNormalMTopCenterKmp(SelectMultipleNormal.M.style())
        }
    }

    /**
     * PLASMA-T2586
     */
    @Test
    fun testSelectMultipleNormalDisabled() {
        content(capture = { captureLastRootRoboImage(it) }) {
            SelectMultipleNormalDisabledKmp(SelectMultipleNormal.L.style())
        }
    }

    /**
     * PLASMA-T2592
     */
    @Test
    fun testSelectMultipleNormalReadOnly() {
        content(capture = { captureLastRootRoboImage(it) }) {
            SelectMultipleNormalReadOnlyKmp(SelectMultipleNormal.L.style())
        }
    }
}
