package com.sdds.plasma.giga

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ModalNativeBlackoutHasClose
import com.sdds.compose.uikit.fixtures.testcases.ModalWithoutNativeBlackout
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.styles.basicbutton.Default
import com.sdds.plasma.giga.styles.basicbutton.M
import com.sdds.plasma.giga.styles.modal.Default
import com.sdds.plasma.giga.styles.modal.Modal
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeModalScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testModalNativeBlackoutHasClose() {
        composeTestRule.content {
            ModalNativeBlackoutHasClose(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testModalWithoutNativeBlackout() {
        composeTestRule.content {
            ModalWithoutNativeBlackout(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
