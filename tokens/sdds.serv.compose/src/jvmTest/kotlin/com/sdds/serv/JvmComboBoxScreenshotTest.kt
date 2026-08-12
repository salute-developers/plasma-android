package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxMultipleNormalBottomStartPlacementEnd
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleNormalTopStartPlacementStartLoose
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleTightTopEndPlacementTopLoose
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
            ComboBoxSingleNormalTopStartPlacementStartLoose(
                style = ComboBoxSingleNormal.Xl.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2648
     */
    @Test
    fun testComboBoxSingleTightTopEndPlacementTopLoose() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxSingleTightTopEndPlacementTopLoose(
                style = ComboBoxSingleTight.L.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2649
     */
    @Test
    fun testComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd(
                style = ComboBoxMultipleNormal.M.style(),
                spinnerStyle = Spinner.Xs.Default.style(),
                initialOpened = true,
            )
        }
    }

    /**
     * PLASMA-T2653
     */
    @Test
    fun testComboBoxMultipleNormalBottomStartPlacementEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ComboBoxMultipleNormalBottomStartPlacementEnd(
                style = ComboBoxMultipleNormal.M.style(),
                initialOpened = true,
            )
        }
    }
}
