@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.BottomSheetHeaderFixedHandleOuter
import com.sdds.compose.uikit.fixtures.testcases.BottomSheetHeaderFooterFixedFitContentEdgeToEdge
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.bottomsheet.Default
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet
import kotlin.test.Test

internal class ComposeBottomSheetKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T1958
     */
    @Test
    fun testBottomSheetHeaderFixedHandleOuter() {
        content(::testBottomSheetHeaderFixedHandleOuter, captureRoot = ScreenshotCaptureRoot.Last) {
            BottomSheetHeaderFixedHandleOuter(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2768
     */
    @Test
    fun testBottomSheetHeaderFooterFixedFitContentEdgeToEdge() {
        content(::testBottomSheetHeaderFooterFixedFitContentEdgeToEdge, captureRoot = ScreenshotCaptureRoot.Last) {
            BottomSheetHeaderFooterFixedFitContentEdgeToEdge(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}
