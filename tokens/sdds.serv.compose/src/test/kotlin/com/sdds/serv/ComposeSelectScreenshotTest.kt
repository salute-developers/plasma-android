package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeLeft
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.S
import com.sdds.serv.styles.select.SelectMultipleNormal
import com.sdds.serv.styles.select.SelectMultipleTight
import com.sdds.serv.styles.select.SelectSingleNormal
import com.sdds.serv.styles.select.SelectSingleTight
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.spinner.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.select.SelectMultipleNormalDisabled
import com.sdds.testing.compose.select.SelectMultipleNormalLShowLoadingBottomStart
import com.sdds.testing.compose.select.SelectMultipleNormalMTopCenter
import com.sdds.testing.compose.select.SelectMultipleNormalReadOnly
import com.sdds.testing.compose.select.SelectMultipleTightLBottomEnd
import com.sdds.testing.compose.select.SelectMultipleTightSCenter
import com.sdds.testing.compose.select.SelectSingleNormalXlTopStart
import com.sdds.testing.compose.select.SelectSingleNormalXsCenterStart
import com.sdds.testing.compose.select.SelectSingleTightLCenterEnd
import com.sdds.testing.compose.select.SelectSingleTightLTopEnd
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeSelectScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectSingleNormalXlTopStart() {
        composeTestRule.content {
            SelectSingleNormalXlTopStart(style = SelectSingleNormal.Xl.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectSingleTightLTopEnd() {
        composeTestRule.content {
            SelectSingleTightLTopEnd(style = SelectSingleTight.L.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Иван Иванов").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalMTopCenter() {
        composeTestRule.content {
            SelectMultipleNormalMTopCenter(style = SelectMultipleNormal.M.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleTightSCenter() {
        composeTestRule.content {
            SelectMultipleTightSCenter(style = SelectMultipleTight.S.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.onNodeWithText("Иван Иванов").performClick()
        composeTestRule.onNodeWithText("Пётр Петров").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectSingleNormalXsCenterStart() {
        composeTestRule.content {
            SelectSingleNormalXsCenterStart(style = SelectSingleNormal.Xs.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.onNodeWithText("Иван Иванов").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectSingleTightLCenterEnd() {
        composeTestRule.content {
            SelectSingleTightLCenterEnd(style = SelectSingleTight.L.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.onNodeWithText("Value").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalLShowLoadingBottomStart() {
        composeTestRule.content {
            SelectMultipleNormalLShowLoadingBottomStart(
                style = SelectMultipleNormal.L.style(),
                spinnerStyle = Spinner.Xs.Default.style(),
            )
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.onNodeWithText("Иван Иванов").performClick()
        composeTestRule.onNodeWithText("Пётр Петров").performClick()
        composeTestRule.onNodeWithText("Сергей Сергеев").performClick()
        composeTestRule.waitForIdle()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleTightLBottomEnd() {
        composeTestRule.content {
            SelectMultipleTightLBottomEnd(style = SelectMultipleTight.L.style())
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalDisabled() {
        composeTestRule.content {
            SelectMultipleNormalDisabled(style = SelectMultipleNormal.L.style())
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalReadOnly() {
        composeTestRule.content {
            SelectMultipleNormalReadOnly(style = SelectMultipleNormal.L.style())
        }
        composeTestRule.onNodeWithText("Иван Иванов", useUnmergedTree = true)
            .performTouchInput { swipeLeft() }
        captureScreenRoboImage()
    }
}
