@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
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
import kotlin.test.Test

internal class ComposeComboBoxKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2643
     */
    @Test
    fun testComboBoxSingleNormalTopStartPlacementStartLoose() {
        content(::testComboBoxSingleNormalTopStartPlacementStartLoose, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testComboBoxSingleTightTopEndPlacementTopLoose, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(
            ::testComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd,
            captureRoot = ScreenshotCaptureRoot.Last,
        ) {
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
        content(::testComboBoxMultipleNormalBottomStartPlacementEnd, captureRoot = ScreenshotCaptureRoot.Last) {
            ComboBoxMultipleNormalBottomStartPlacementEnd(
                style = ComboBoxMultipleNormal.M.style(),
                initialOpened = true,
            )
        }
    }
}
