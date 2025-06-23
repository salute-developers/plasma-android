package com.sdds.stylessalute

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.basicbutton.BasicButton
import com.sdds.stylessalute.styles.basicbutton.Default
import com.sdds.stylessalute.styles.basicbutton.L
import com.sdds.stylessalute.styles.toast.Pilled
import com.sdds.stylessalute.styles.toast.Rounded
import com.sdds.stylessalute.styles.toast.Toast
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
    fun testToastRoundedDefaultTopStartHasContentStartHasContentEnd() {
        composeTestRule.content {
            ToastRoundedDefaultTopStartHasContentStartEnd(
                style = Toast.Rounded.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastRoundedNegativeTopCenterHasContentStart() {
        composeTestRule.content {
            ToastRoundedNegativeTopCenterHasContentStart(
                style = Toast.Rounded.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastRoundedPositiveTopEndHasContentStartEnd() {
        composeTestRule.content {
            ToastRoundedPositiveTopEndHasContentStartEnd(
                style = Toast.Rounded.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastPilledDefaultCenterStart() {
        composeTestRule.content {
            ToastPilledDefaultCenterStart(
                style = Toast.Pilled.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastPilledNegativeCenterHasContentStartEnd() {
        composeTestRule.content {
            ToastPilledNegativeCenterHasContentStartEnd(
                style = Toast.Pilled.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastPilledPositiveCenterEndHasContentStartEnd() {
        composeTestRule.content {
            ToastPilledPositiveCenterEndHasContentStartEnd(
                style = Toast.Pilled.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastRoundedDefaultBottomStartHasContentEnd() {
        composeTestRule.content {
            ToastRoundedDefaultBottomStartHasContentEnd(
                style = Toast.Rounded.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastRoundedDefaultBottomCenterHasContentStartEnd() {
        composeTestRule.content {
            ToastRoundedDefaultBottomCenterHasContentStartEnd(
                style = Toast.Rounded.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastRoundedDefaultBottomEndHasContentStartEnd() {
        composeTestRule.content {
            ToastRoundedDefaultBottomEndHasContentStartEnd(
                style = Toast.Rounded.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }
}
