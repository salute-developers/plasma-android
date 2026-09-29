@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
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

internal class ComposeModalKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2497
     */
    @Test
    fun testModalTopStart() {
        content(::testModalTopStart, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testModalTopEnd, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testModalCenterEnd, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testModalBottomStart, captureRoot = ScreenshotCaptureRoot.Last) {
            ModalBottomStart(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
                initialShow = true,
            )
        }
    }
}
