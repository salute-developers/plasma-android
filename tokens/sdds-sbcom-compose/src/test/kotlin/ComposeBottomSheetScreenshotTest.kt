package com.sdds.sbcom

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.BottomSheetNoHeaderFooterAuto
import com.sdds.compose.uikit.fixtures.testcases.BottomSheetNoHeaderFooterHalfExpanded
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.ModePrimary
import com.sdds.sbcom.styles.basicbutton.Size48
import com.sdds.sbcom.styles.bottomsheet.Default
import com.sdds.sbcom.styles.bottomsheet.ModalBottomSheet
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeBottomSheetScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetHalfExpanded() {
        composeTestRule.content {
            BottomSheetNoHeaderFooterHalfExpanded(
                ModalBottomSheet.Default.style(),
                BasicButton.Size48.ModePrimary.style(),
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetNoHeaderFooterAuto() {
        composeTestRule.content {
            BottomSheetNoHeaderFooterAuto(
                ModalBottomSheet.Default.style(),
                BasicButton.Size48.ModePrimary.style(),
            )
        }
        captureScreenRoboImage()
    }
}
