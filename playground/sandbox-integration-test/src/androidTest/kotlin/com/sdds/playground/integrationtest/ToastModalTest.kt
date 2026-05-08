package com.sdds.playground.integrationtest

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.sdds.playground.integrationtest.testtags.LoginFormTags
import com.sdds.playground.integrationtest.testtags.ModalTags
import com.sdds.playground.integrationtest.testtags.ToastTags
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class ToastModalTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.TOAST_MODAL_LOGIN)

    @Test
    fun test_toast_modal_overlay() {
        composeTestRule.onNodeWithTag(ModalTags.FIRST_OPEN_BUTTON).performClick()
        composeTestRule.onNodeWithTag(LoginFormTags.EMAIL).performTextInput("demo")
        composeTestRule.onNodeWithTag(LoginFormTags.PASSWORD).performTextInput("demo")
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).performClick()
        composeTestRule.onNodeWithTag(ToastTags.CHECK_TOAST_AFTER_VALID_SUBMIT).assertIsDisplayed()
        composeTestRule.onNodeWithTag(ToastTags.TOAST).assertIsDisplayed()
    }
}
