package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalBottomStartKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalCenterEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalTopEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalTopStartKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.modal.Default
import com.sdds.serv.styles.modal.Modal
import kotlin.test.Test

abstract class IosMobileModalScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2497
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testModalTopStart() {
        content(
            ::testModalTopStart,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ModalTopStartKmp(Modal.Default.style())
        }
    }

    /**
     * PLASMA-T2499
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testModalTopEnd() {
        content(
            ::testModalTopEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ModalTopEndKmp(Modal.Default.style())
        }
    }

    /**
     * PLASMA-T2502
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testModalCenterEnd() {
        content(
            ::testModalCenterEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ModalCenterEndKmp(Modal.Default.style())
        }
    }

    /**
     * PLASMA-T2503
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testModalBottomStart() {
        content(
            ::testModalBottomStart,
            capture = { captureLastRootRoboImage(it) },
        ) {
            ModalBottomStartKmp(Modal.Default.style())
        }
    }
}

class IosMobileModalScreenshotLightTest : IosMobileModalScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileModalScreenshotDarkTest : IosMobileModalScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
