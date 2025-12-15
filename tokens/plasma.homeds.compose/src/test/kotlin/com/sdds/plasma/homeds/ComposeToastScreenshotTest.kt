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
import com.sdds.plasma.homeds.styles.toast.Default
import com.sdds.plasma.homeds.styles.toast.Negative
import com.sdds.plasma.homeds.styles.toast.Positive
import com.sdds.plasma.homeds.styles.toast.Toast
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.toast.ToastPilledDefaultCenterStart
import com.sdds.testing.compose.toast.ToastPilledNegativeCenterHasContentStartEnd
import com.sdds.testing.compose.toast.ToastPilledPositiveCenterEndHasContentStartEnd
import com.sdds.testing.compose.toast.ToastRoundedDefaultBottomCenterHasContentStartEnd
import com.sdds.testing.compose.toast.ToastRoundedDefaultBottomEndHasContentStartEnd
import com.sdds.testing.compose.toast.ToastRoundedDefaultBottomStartHasContentEnd
import com.sdds.testing.compose.toast.ToastRoundedDefaultTopStartHasContentStartEnd
import com.sdds.testing.compose.toast.ToastRoundedNegativeTopCenterHasContentStart
import com.sdds.testing.compose.toast.ToastRoundedPositiveTopEndHasContentStartEnd
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeToastScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastDefaultTopStartHasContentStartHasContentEnd() {
        composeTestRule.content {
            ToastRoundedDefaultTopStartHasContentStartEnd(
                style = Toast.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastNegativeTopCenterHasContentStart() {
        composeTestRule.content {
            ToastRoundedNegativeTopCenterHasContentStart(
                style = Toast.Negative.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastPositiveTopEndHasContentStartEnd() {
        composeTestRule.content {
            ToastRoundedPositiveTopEndHasContentStartEnd(
                style = Toast.Positive.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastDefaultCenterStart() {
        composeTestRule.content {
            ToastPilledDefaultCenterStart(
                style = Toast.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastNegativeCenterHasContentStartEnd() {
        composeTestRule.content {
            ToastPilledNegativeCenterHasContentStartEnd(
                style = Toast.Negative.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastPositiveCenterEndHasContentStartEnd() {
        composeTestRule.content {
            ToastPilledPositiveCenterEndHasContentStartEnd(
                style = Toast.Positive.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastDefaultBottomStartHasContentEnd() {
        composeTestRule.content {
            ToastRoundedDefaultBottomStartHasContentEnd(
                style = Toast.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastDefaultBottomCenterHasContentStartEnd() {
        composeTestRule.content {
            ToastRoundedDefaultBottomCenterHasContentStartEnd(
                style = Toast.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastDefaultBottomEndHasContentStartEnd() {
        composeTestRule.content {
            ToastRoundedDefaultBottomEndHasContentStartEnd(
                style = Toast.Default.style(),
                buttonStyle = BasicButton.M.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
