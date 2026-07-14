package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeLeft
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalDisabled
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalLShowLoadingBottomStart
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalMTopCenter
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleNormalReadOnly
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleTightLBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.SelectMultipleTightSCenter
import com.sdds.compose.uikit.fixtures.testcases.SelectSingleNormalXlTopStart
import com.sdds.compose.uikit.fixtures.testcases.SelectSingleNormalXsCenterStart
import com.sdds.compose.uikit.fixtures.testcases.SelectSingleTightLCenterEnd
import com.sdds.compose.uikit.fixtures.testcases.SelectSingleTightLTopEnd
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
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalMTopCenter() {
        composeTestRule.content {
            SelectMultipleNormalMTopCenter(style = SelectMultipleNormal.M.style())
        }
        composeTestRule.onNodeWithTag("Select").performClick()
        composeTestRule.waitForIdle()
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
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleTightLBottomEnd() {
        composeTestRule.content {
            SelectMultipleTightLBottomEnd(style = SelectMultipleTight.L.style())
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalDisabled() {
        composeTestRule.content {
            SelectMultipleNormalDisabled(style = SelectMultipleNormal.L.style())
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testSelectMultipleNormalReadOnly() {
        composeTestRule.content {
            SelectMultipleNormalReadOnly(style = SelectMultipleNormal.L.style())
        }
        composeTestRule.onNodeWithText("Иван Иванов", useUnmergedTree = true)
            .performTouchInput { swipeLeft() }
    }
}
