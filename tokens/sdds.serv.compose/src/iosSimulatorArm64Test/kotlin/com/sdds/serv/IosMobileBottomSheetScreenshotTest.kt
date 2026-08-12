package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.BottomSheetHeaderFixedHandleOuter
import com.sdds.compose.uikit.fixtures.testcases.BottomSheetHeaderFooterFixedFitContentEdgeToEdge
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.bottomsheet.Default
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet
import kotlin.test.Test

abstract class IosMobileBottomSheetScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testBottomSheetHeaderFixedHandleOuter() {
        content(
            ::testBottomSheetHeaderFixedHandleOuter,
            capture = { captureLastRootRoboImage(it) },
        ) {
            BottomSheetHeaderFixedHandleOuter(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2768
     */
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testBottomSheetHeaderFooterFixedFitContentEdgeToEdge() {
        content(
            ::testBottomSheetHeaderFooterFixedFitContentEdgeToEdge,
            capture = { captureLastRootRoboImage(it) },
        ) {
            BottomSheetHeaderFooterFixedFitContentEdgeToEdge(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}

class IosMobileBottomSheetScreenshotTestLight : IosMobileBottomSheetScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileBottomSheetScreenshotTestDark : IosMobileBottomSheetScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
