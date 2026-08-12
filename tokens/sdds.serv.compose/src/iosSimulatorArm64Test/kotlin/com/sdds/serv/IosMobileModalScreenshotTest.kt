package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.ModalBottomStart
import com.sdds.compose.uikit.fixtures.testcases.ModalCenterEnd
import com.sdds.compose.uikit.fixtures.testcases.ModalTopEnd
import com.sdds.compose.uikit.fixtures.testcases.ModalTopStart
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
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
            ModalTopStart(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialShow = true,
            )
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
            ModalTopEnd(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialShow = true,
            )
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
            ModalCenterEnd(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialShow = true,
            )
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
            ModalBottomStart(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialShow = true,
            )
        }
    }
}

class IosMobileModalScreenshotLightTest : IosMobileModalScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileModalScreenshotDarkTest : IosMobileModalScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
