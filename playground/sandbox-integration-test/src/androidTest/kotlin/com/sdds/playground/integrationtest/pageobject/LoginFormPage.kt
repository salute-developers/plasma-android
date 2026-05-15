package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
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
}
