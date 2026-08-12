package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
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
            ComboBoxSingleNormalTopStartPlacementStartLoose(
                style = ComboBoxSingleNormal.Xl.style(),
                initialOpened = true,
            )
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
            ComboBoxSingleTightTopEndPlacementTopLoose(
                style = ComboBoxSingleTight.L.style(),
                initialOpened = true,
            )
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
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testComboBoxMultipleNormalBottomStartPlacementEnd() {
        content(
            ::testComboBoxMultipleNormalBottomStartPlacementEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ComboBoxMultipleNormalBottomStartPlacementEnd(
                style = ComboBoxMultipleNormal.M.style(),
                initialOpened = true,
            )
        }
    }
}

class IosMobileComboBoxScreenshotLightTest : IosMobileComboBoxScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileComboBoxScreenshotDarkTest : IosMobileComboBoxScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
