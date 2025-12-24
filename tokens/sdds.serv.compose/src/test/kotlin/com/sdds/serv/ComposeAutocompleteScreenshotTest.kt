package com.sdds.serv

import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.AutocompleteTight
import com.sdds.serv.styles.autocomplete.L
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.S
import com.sdds.serv.styles.autocomplete.Xl
import com.sdds.serv.styles.autocomplete.Xs
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.spinner.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.autocomplete.AutoCompleteBottomCenter
import com.sdds.testing.compose.autocomplete.AutoCompleteBottomEnd
import com.sdds.testing.compose.autocomplete.AutoCompleteBottomStart
import com.sdds.testing.compose.autocomplete.AutoCompleteCenter
import com.sdds.testing.compose.autocomplete.AutoCompleteCenterEnd
import com.sdds.testing.compose.autocomplete.AutoCompleteEmptyStateCenterStart
import com.sdds.testing.compose.autocomplete.AutoCompleteLoadingTopStart
import com.sdds.testing.compose.autocomplete.AutoCompleteTopCenter
import com.sdds.testing.compose.autocomplete.AutoCompleteTopEnd
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAutocompleteScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAutocompleteTightXlLoadingTopStart() {
        composeTestRule.content {
            AutoCompleteLoadingTopStart(
                AutocompleteTight.Xl.style(),
                spinnerStyle = Spinner.Xs.Default.style(),
            )
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("и")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightLEmptyStateCenterStart() {
        composeTestRule.content {
            AutoCompleteEmptyStateCenterStart(AutocompleteTight.L.style())
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("0")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightMBottomStart() {
        composeTestRule.content {
            AutoCompleteBottomStart(AutocompleteTight.M.style())
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("Иван")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightSTopCenter() {
        composeTestRule.content {
            AutoCompleteTopCenter(AutocompleteTight.S.style())
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("Иван")
        composeTestRule.waitForIdle()
        composeTestRule.onAllNodesWithText("Иван Иванов", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightXsCenter() {
        composeTestRule.content {
            AutoCompleteCenter(AutocompleteTight.Xs.style())
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("а")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightXlBottomCenter() {
        composeTestRule.content {
            AutoCompleteBottomCenter(AutocompleteTight.Xl.style())
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("123!@#%&")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightXlTopEnd() {
        composeTestRule.content {
            AutoCompleteTopEnd(AutocompleteNormal.Xl.style())
        }
        composeTestRule.onAllNodesWithTag("Autocomplete", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.onAllNodesWithTag("textField", useUnmergedTree = true)[0]
            .performTextInput("а")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAutocompleteTightXlCenterEnd() {
        composeTestRule.content {
            AutoCompleteCenterEnd(AutocompleteNormal.Xl.style())
        }
    }

    @Test
    fun testAutocompleteTightXlBottomEnd() {
        composeTestRule.content {
            AutoCompleteBottomEnd(AutocompleteNormal.Xl.style())
        }
    }
}
