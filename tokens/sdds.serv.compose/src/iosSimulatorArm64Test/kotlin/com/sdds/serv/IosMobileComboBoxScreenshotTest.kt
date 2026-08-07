package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
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
import kotlin.test.Test

abstract class IosMobileComboBoxScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2643
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testComboBoxSingleNormalTopStartPlacementStartLoose() {
        content(
            ::testComboBoxSingleNormalTopStartPlacementStartLoose,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ComboBoxSingleNormalTopStartPlacementStartLooseKmp(ComboBoxSingleNormal.Xl.style())
        }
    }

    /**
     * PLASMA-T2648
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testComboBoxSingleTightTopEndPlacementTopLoose() {
        content(
            ::testComboBoxSingleTightTopEndPlacementTopLoose,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ComboBoxSingleTightTopEndPlacementTopLooseKmp(ComboBoxSingleTight.L.style())
        }
    }

    /**
     * PLASMA-T2649
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd() {
        content(
            ::testComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ComboBoxMultipleNormalTopCenterShowLoadingPlacementEndKmp(
                style = ComboBoxMultipleNormal.M.style(),
                spinnerStyle = Spinner.Xs.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2653
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testComboBoxMultipleNormalBottomStartPlacementEnd() {
        content(
            ::testComboBoxMultipleNormalBottomStartPlacementEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ComboBoxMultipleNormalBottomStartPlacementEndKmp(ComboBoxMultipleNormal.M.style())
        }
    }
}

class IosMobileComboBoxScreenshotLightTest : IosMobileComboBoxScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileComboBoxScreenshotDarkTest : IosMobileComboBoxScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
