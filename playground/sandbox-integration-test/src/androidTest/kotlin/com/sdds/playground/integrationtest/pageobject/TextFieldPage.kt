package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.TextFieldInvalidSelectionTags

class TextFieldInvalidSelectionPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>,
) {
    fun assertTextFieldIsDisplayed() = apply {
        composeTestRule
            .onNodeWithTag(TextFieldInvalidSelectionTags.FIELD)
            .assertIsDisplayed()
    }

    fun moveCaretToOriginalEnd() = apply {
        composeTestRule
            .onNodeWithTag(TextFieldInvalidSelectionTags.MOVE_CARET_BUTTON)
            .performClick()
    }

    fun assertCaretMovedCheckPassed() = apply {
        composeTestRule
            .onNodeWithTag(TextFieldInvalidSelectionTags.CHECK_CARET_MOVED)
            .assertTextContains("PASS", substring = true)
    }
}
