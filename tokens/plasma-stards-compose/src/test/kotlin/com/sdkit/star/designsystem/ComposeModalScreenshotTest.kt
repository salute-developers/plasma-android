package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ModalBottomCenter
import com.sdds.compose.uikit.fixtures.testcases.ModalBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.ModalBottomStart
import com.sdds.compose.uikit.fixtures.testcases.ModalCenter
import com.sdds.compose.uikit.fixtures.testcases.ModalCenterEnd
import com.sdds.compose.uikit.fixtures.testcases.ModalCenterStart
import com.sdds.compose.uikit.fixtures.testcases.ModalNativeBlackoutHasClose
import com.sdds.compose.uikit.fixtures.testcases.ModalTopCenter
import com.sdds.compose.uikit.fixtures.testcases.ModalTopEnd
import com.sdds.compose.uikit.fixtures.testcases.ModalTopStart
import com.sdds.compose.uikit.fixtures.testcases.ModalWithoutNativeBlackout
import com.sdds.compose.uikit.style.style
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
