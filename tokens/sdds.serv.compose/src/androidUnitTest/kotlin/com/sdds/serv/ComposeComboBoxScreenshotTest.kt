package com.sdds.serv

import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeLeft
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxDisabled
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxMultipleNormalBottomStartPlacementEnd
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxMultipleTightCenterPlacementBottom
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxMultipleTightReadOnly
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleNormalBottomCenterPlacementStart
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleNormalCenterStartPlacementStart
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleNormalTopStartPlacementStartLoose
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleTightCenterEndPlacementTopStrict
import com.sdds.compose.uikit.fixtures.testcases.ComboBoxSingleTightTopEndPlacementTopLoose
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.combobox.ComboBoxMultipleNormal
import com.sdds.serv.styles.combobox.ComboBoxMultipleTight
import com.sdds.serv.styles.combobox.ComboBoxSingleNormal
import com.sdds.serv.styles.combobox.ComboBoxSingleTight
import com.sdds.serv.styles.combobox.L
import com.sdds.serv.styles.combobox.M
import com.sdds.serv.styles.combobox.S
import com.sdds.serv.styles.combobox.Xl
import com.sdds.serv.styles.combobox.Xs
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
class ComposeComboBoxScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testComboBoxXlSingleNormalTopStartPlacementStartLoose() {
        composeTestRule.content {
            ComboBoxSingleNormalTopStartPlacementStartLoose(ComboBoxSingleNormal.Xl.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxSingle", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performClick()
    }

    @Test
    fun testComboBoxSingleLTightTopEndPlacementTopLoose() {
        composeTestRule.content {
            ComboBoxSingleTightTopEndPlacementTopLoose(ComboBoxSingleTight.L.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxSingle", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onNodeWithText("Иван Иванов")
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd() {
        composeTestRule.content {
            ComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd(
                ComboBoxMultipleNormal.M.style(),
                spinnerStyle = Spinner.Xs.Default.style(),
            )
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxMultiple", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onNodeWithText("Иван Иванов")
            .performClick()
        composeTestRule
            .onNodeWithText("Пётр Петров")
            .performClick()
        composeTestRule
            .onNodeWithText("Сергей Сергеев")
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxSMultipleTightCenterPlacementBottom() {
        composeTestRule.content {
            ComboBoxMultipleTightCenterPlacementBottom(ComboBoxMultipleTight.S.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxMultiple", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onNodeWithText("Иван Иванов")
            .performClick()
        composeTestRule
            .onNodeWithText("Пётр Петров")
            .performClick()
        composeTestRule
            .onNodeWithText("Сергей Сергеев")
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxXsSingleNormalCenterStartPlacementStart() {
        composeTestRule.content {
            ComboBoxSingleNormalCenterStartPlacementStart(ComboBoxSingleNormal.Xs.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxSingleTightCenterEndPlacementTopStrict() {
        composeTestRule.content {
            ComboBoxSingleTightCenterEndPlacementTopStrict(ComboBoxSingleTight.M.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxSingle", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performTextInput("Иван")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxMultipleNormalBottomStartPlacementEnd() {
        composeTestRule.content {
            ComboBoxMultipleNormalBottomStartPlacementEnd(ComboBoxMultipleNormal.M.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onNodeWithText("Иван Иванов")
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performTextInput("П")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxMultipleTightReadOnly() {
        composeTestRule.content {
            ComboBoxMultipleTightReadOnly(ComboBoxMultipleTight.M.style())
        }
        composeTestRule
            .onNodeWithText("Сергей Сергеев", useUnmergedTree = true)
            .performTouchInput { swipeLeft() }
    }

    @Test
    fun testComboBoxSingleNormalBottomCenterPlacementStart() {
        composeTestRule.content {
            ComboBoxSingleNormalBottomCenterPlacementStart(ComboBoxSingleNormal.M.style())
        }
        composeTestRule
            .onAllNodesWithTag("comboBoxSingle", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule
            .onAllNodesWithTag("comboBoxTextField", useUnmergedTree = true)[0]
            .performTextInput("1234")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testComboBoxDisabled() {
        composeTestRule.content {
            ComboBoxDisabled(ComboBoxMultipleNormal.M.style())
        }
    }
}
