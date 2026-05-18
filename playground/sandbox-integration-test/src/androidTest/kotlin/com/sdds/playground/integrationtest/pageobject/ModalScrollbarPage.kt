package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeUp
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.ModalTags

class ModalScrollbarPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>,
) {
    fun openFirstModal() = apply {
        composeTestRule.onNodeWithTag(ModalTags.FIRST_OPEN_BUTTON).performClick()
    }

    fun checkFirstModalOpened() = apply {
        composeTestRule.onNodeWithTag(ModalTags.CHECK_FIRST_OPENED).isDisplayed()
    }

    fun closeFirstModal() = apply {
        composeTestRule.onNodeWithTag(ModalTags.FIRST_CLOSE_BUTTON).performClick()
    }

    fun scrollUntilPassedVisible(maxSwipes: Int = 10) = apply {
        repeat(maxSwipes) {
            val isDisplayed = runCatching {
                composeTestRule.onNodeWithText("scroll passed").assertIsDisplayed()
            }.isSuccess
            if (isDisplayed) return@repeat
            composeTestRule.onNodeWithTag(ModalTags.FIRST_SCROLL_CONTAINER).performTouchInput {
                swipeUp()
            }
            composeTestRule.waitForIdle()
        }
    }

    fun assertScrollPassedVisible() = apply {
        composeTestRule.onNodeWithText("scroll passed").assertIsDisplayed()
    }
}