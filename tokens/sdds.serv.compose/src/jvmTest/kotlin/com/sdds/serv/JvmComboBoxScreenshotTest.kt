package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.ComboBoxMultipleNormalBottomStartPlacementEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ComboBoxMultipleNormalTopCenterShowLoadingPlacementEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ComboBoxSingleNormalTopStartPlacementStartLooseKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ComboBoxSingleTightTopEndPlacementTopLooseKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.combobox.ComboBoxMultipleNormal
import com.sdds.serv.styles.combobox.ComboBoxSingleNormal
import com.sdds.serv.styles.combobox.ComboBoxSingleTight
import com.sdds.serv.styles.combobox.L
import com.sdds.serv.styles.combobox.M
import com.sdds.serv.styles.combobox.Xl
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.spinner.Xs
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmComboBoxScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2643
     */
    @Test
    fun testComboBoxSingleNormalTopStartPlacementStartLoose() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxSingleNormalTopStartPlacementStartLooseKmp(ComboBoxSingleNormal.Xl.style())
        }
    }

    /**
     * PLASMA-T2648
     */
    @Test
    fun testComboBoxSingleTightTopEndPlacementTopLoose() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxSingleTightTopEndPlacementTopLooseKmp(ComboBoxSingleTight.L.style())
        }
    }

    /**
     * PLASMA-T2649
     */
    @Test
    fun testComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxMultipleNormalTopCenterShowLoadingPlacementEndKmp(
                style = ComboBoxMultipleNormal.M.style(),
                spinnerStyle = Spinner.Xs.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2653
     */
    @Test
    fun testComboBoxMultipleNormalBottomStartPlacementEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxMultipleNormalBottomStartPlacementEndKmp(ComboBoxMultipleNormal.M.style())
        }
    }
}
