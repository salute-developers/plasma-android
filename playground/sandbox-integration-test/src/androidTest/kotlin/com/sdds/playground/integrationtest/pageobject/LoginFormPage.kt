package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.click
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTouchInput
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.LoginFormTags
import com.sdds.playground.integrationtest.testtags.ModalTags

class LoginFormPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>,
) {
    fun openSheet() = apply {
        composeTestRule.onNodeWithTag("login_form_open_sheet").performClick()
    }

    fun openModal() = apply {
        composeTestRule.onNodeWithTag(ModalTags.FIRST_OPEN_BUTTON).performClick()
    }

    fun closeSheet() = apply {
        composeTestRule.onNodeWithTag("login_form_close_sheet_btn").performClick()
    }

    fun typeEmail(value: String) = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.EMAIL).performTextInput(value)
    }

    fun typePassword(value: String) = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.PASSWORD).performTextInput(value)
    }

    fun clickContinue() = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).performClick()
    }

    fun assertContinueEnabled() = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).assertIsEnabled()
    }

    fun assertContinueDisabled() = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).assertIsNotEnabled()
    }

    fun assertExistsLoadingHint() = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.LOADING_HINT).assertExists()
    }

    fun assertExistsError() = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.ERROR).assertExists()
    }

    fun clickOutsideBottomSheet() = apply {
        composeTestRule.onAllNodes(isRoot())[1].performTouchInput {
            click(Offset(x = center.x, y = 40f))
        }
        composeTestRule.waitForIdle()
    }

    fun clickInsideBottomSheet() = apply {
        composeTestRule.onAllNodes(isRoot())[1].performTouchInput {
            click(Offset(x = center.x, y = bottom - 120f))
        }
        composeTestRule.waitForIdle()
    }

    fun assertSheetIsDisplayed() = apply {
        composeTestRule.onNodeWithTag("login_form_close_sheet_btn").assertIsDisplayed()
    }

    fun assertSheetIsNotDisplayed() = apply {
        composeTestRule.onNodeWithTag(LoginFormTags.EMAIL).assertDoesNotExist()
    }
}
