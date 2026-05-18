package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.click
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.TooltipTags

class TooltipPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>,
) {
    fun clickFirstOpenButton() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_OPEN_BUTTON).performClick()
    }

    fun checkFirstOpenedTooltip() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.CHECK_FIRST_OPENED).assertExists()
    }

    fun clickCloseButton() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_CLOSE_BUTTON).performClick()
    }

    fun checkFirstTooltipIsDisplayed() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_TOOLTIP).assertIsDisplayed()
    }

    fun checkFirstTooltipIsNotDisplayed() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.FIRST_TOOLTIP).assertIsNotDisplayed()
    }

    fun clickSecondOpenButton() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_OPEN_BUTTON).performClick()
    }

    fun checkSecondOpenedTooltip() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.CHECK_SECOND_OPENED).assertExists()
    }

    fun tapOutsideTooltip() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.ROOT).performTouchInput {
            click(Offset(x = center.x, y = bottom - 10f))
        }
    }

    fun checkSecondTooltipIsDisplayed() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_TOOLTIP).assertIsDisplayed()
    }

    fun checkSecondTooltipIsNotDisplayed() = apply {
        composeTestRule.onNodeWithTag(TooltipTags.SECOND_TOOLTIP).assertIsNotDisplayed()
    }
}
