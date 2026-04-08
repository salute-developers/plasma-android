package com.sdds.serv

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeLeft
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ToastMultiLine
import com.sdds.compose.uikit.fixtures.testcases.ToastPilledDefaultCenterStart
import com.sdds.compose.uikit.fixtures.testcases.ToastPilledNegativeCenterHasContentStartEnd
import com.sdds.compose.uikit.fixtures.testcases.ToastPilledPositiveCenterEndHasContentStartEnd
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedDefaultBottomCenterHasContentStartEnd
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedDefaultBottomEndHasContentStartEnd
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedDefaultBottomStartHasContentEnd
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedDefaultTopStartHasContentStartEnd
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedNegativeTopCenterHasContentStart
import com.sdds.compose.uikit.fixtures.testcases.ToastRoundedPositiveTopEndHasContentStartEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Negative
import com.sdds.serv.styles.toast.Pilled
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast
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
                style = Toast.Rounded.Default.style(),
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
                style = Toast.Rounded.Negative.style(),
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
                style = Toast.Rounded.Positive.style(),
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
                style = Toast.Pilled.Default.style(),
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
                style = Toast.Pilled.Negative.style(),
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
                style = Toast.Pilled.Positive.style(),
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
                style = Toast.Rounded.Default.style(),
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
                style = Toast.Rounded.Default.style(),
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
                style = Toast.Rounded.Default.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastMultiLine() {
        composeTestRule.content {
            ToastMultiLine(
                style = Toast.Rounded.Default.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testToastSwipeToClose() {
        composeTestRule.content {
            ToastPilledNegativeCenterHasContentStartEnd(
                style = Toast.Pilled.Negative.style(),
                buttonStyle = BasicButton.L.Default.style(),
            )
        }
        composeTestRule.onNodeWithText("Show").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Toast Text").performTouchInput { swipeLeft() }
        composeTestRule.waitForIdle()
    }
}
