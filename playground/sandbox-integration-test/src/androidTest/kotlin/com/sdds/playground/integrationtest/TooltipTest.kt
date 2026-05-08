package com.sdds.playground.integrationtest

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.click
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.test.espresso.Espresso.pressBack
import com.sdds.playground.integrationtest.testtags.TooltipTags
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class TooltipTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.TOOLTIP_CLOSE)

    @Test
    fun test_close_tooltip_with_btn_in_shadow() {
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_OPEN_BUTTON).performClick()
        composeTestRule.onNodeWithTag(TooltipTags.CHECK_FIRST_OPENED).assertIsDisplayed()
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_CLOSE_BUTTON).performClick()
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_TOOLTIP).assertIsNotDisplayed()
    }

    @Test
    fun test_close_tooltip_with_tap_outside() {
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_OPEN_BUTTON).performClick()
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_TOOLTIP).assertIsDisplayed()
        composeTestRule.onNodeWithTag(TooltipTags.ROOT).performTouchInput {
            click(Offset(x = center.x, y = bottom - 10f))
        }
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_TOOLTIP).assertIsNotDisplayed()
    }

    @Test
    fun test_close_tooltip_with_pressBack() {
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_OPEN_BUTTON).performClick()
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_TOOLTIP).assertIsDisplayed()
        pressBack()
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_TOOLTIP).assertIsNotDisplayed()
    }
}
