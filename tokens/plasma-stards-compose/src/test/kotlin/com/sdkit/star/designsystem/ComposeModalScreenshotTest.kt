package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.modal.ModalBottomCenter
import com.sdds.testing.compose.modal.ModalBottomEnd
import com.sdds.testing.compose.modal.ModalBottomStart
import com.sdds.testing.compose.modal.ModalCenter
import com.sdds.testing.compose.modal.ModalCenterEnd
import com.sdds.testing.compose.modal.ModalCenterStart
import com.sdds.testing.compose.modal.ModalNativeBlackoutHasClose
import com.sdds.testing.compose.modal.ModalTopCenter
import com.sdds.testing.compose.modal.ModalTopEnd
import com.sdds.testing.compose.modal.ModalTopStart
import com.sdds.testing.compose.modal.ModalWithoutNativeBlackout
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.Default
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.modal.Default
import com.sdkit.star.designsystem.styles.modal.Modal
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeModalScreenshotTest : RoborazziConfigCompose("+night") {

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

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testModalTopStart() {
        composeTestRule.content {
            ModalTopStart(
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
    fun testModalTopCenter() {
        composeTestRule.content {
            ModalTopCenter(
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
    fun testModalTopEnd() {
        composeTestRule.content {
            ModalTopEnd(
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
    fun testModalCenterStart() {
        composeTestRule.content {
            ModalCenterStart(
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
    fun testModalCenter() {
        composeTestRule.content {
            ModalCenter(
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
    fun testModalCenterEnd() {
        composeTestRule.content {
            ModalCenterEnd(
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
    fun testModalBottomStart() {
        composeTestRule.content {
            ModalBottomStart(
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
    fun testModalBottomCenter() {
        composeTestRule.content {
            ModalBottomCenter(
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
    fun testModalBottomEnd() {
        composeTestRule.content {
            ModalBottomEnd(
                style = Modal.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
