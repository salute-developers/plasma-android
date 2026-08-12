package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
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
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmModalScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2497
     */
    @Test
    fun testModalTopStart() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
    @Test
    fun testModalTopEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
    @Test
    fun testModalCenterEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
    @Test
    fun testModalBottomStart() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ModalBottomStart(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialShow = true,
            )
        }
    }
}
