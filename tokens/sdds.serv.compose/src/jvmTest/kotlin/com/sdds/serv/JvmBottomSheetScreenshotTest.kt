package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.BottomSheetHeaderFixedHandleOuterKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.BottomSheetHeaderFooterFixedFitContentEdgeToEdgeKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.bottomsheet.Default
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmBottomSheetScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T1958
     */
    @Test
    fun testBottomSheetHeaderFixedHandleOuter() {
        content(capture = { captureLastRootRoboImage(it) }) {
            BottomSheetHeaderFixedHandleOuterKmp(ModalBottomSheet.Default.style())
        }
    }

    /**
     * PLASMA-T2768
     */
    @Test
    fun testBottomSheetHeaderFooterFixedFitContentEdgeToEdge() {
        content(capture = { captureLastRootRoboImage(it) }) {
            BottomSheetHeaderFooterFixedFitContentEdgeToEdgeKmp(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}
