package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalBottomStartKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalCenterEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalTopEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ModalTopStartKmp
import com.sdds.compose.uikit.style.style
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
            ModalTopStartKmp(Modal.Default.style())
        }
    }

    /**
     * PLASMA-T2499
     */
    @Test
    fun testModalTopEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ModalTopEndKmp(Modal.Default.style())
        }
    }

    /**
     * PLASMA-T2502
     */
    @Test
    fun testModalCenterEnd() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ModalCenterEndKmp(Modal.Default.style())
        }
    }

    /**
     * PLASMA-T2503
     */
    @Test
    fun testModalBottomStart() {
        content(capture = { captureLastRootRoboImage(it) }) {
            ModalBottomStartKmp(Modal.Default.style())
        }
    }
}
