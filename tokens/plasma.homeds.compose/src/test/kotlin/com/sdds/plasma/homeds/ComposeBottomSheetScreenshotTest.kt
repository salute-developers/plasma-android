package com.sdds.plasma.homeds

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.Default
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.bottomsheet.Default
import com.sdds.plasma.homeds.styles.bottomsheet.ModalBottomSheet
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.bottomsheet.BottomSheetFooterAuto
import com.sdds.testing.compose.bottomsheet.BottomSheetHeaderAuto
import com.sdds.testing.compose.bottomsheet.BottomSheetHeaderFixedHandleOuter
import com.sdds.testing.compose.bottomsheet.BottomSheetHeaderFooterFixedHandleInner
import com.sdds.testing.compose.bottomsheet.BottomSheetHeaderFooterFixedHandleNone
import com.sdds.testing.compose.bottomsheet.BottomSheetNoHeaderFooterAuto
import com.sdds.testing.vs.SDK_NUMBER
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
    fun testBottomSheetHeaderFooterFixedHandleInner() {
        composeTestRule.content {
            BottomSheetHeaderFooterFixedHandleInner(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetHeaderFixedHandleOuter() {
        composeTestRule.content {
            BottomSheetHeaderFixedHandleOuter(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetHeaderFooterFixedHandleNone() {
        composeTestRule.content {
            BottomSheetHeaderFooterFixedHandleNone(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetFooterAuto() {
        composeTestRule.content {
            BottomSheetFooterAuto(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetHeaderAuto() {
        composeTestRule.content {
            BottomSheetHeaderAuto(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBottomSheetNoHeaderFooterAuto() {
        composeTestRule.content {
            BottomSheetNoHeaderFooterAuto(
                ModalBottomSheet.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
