package com.sdds.playground.integrationtest
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performImeAction
import androidx.compose.ui.test.performTextInput
import com.sdds.playground.integrationtest.testtags.LoginFormTags
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class LoginFormTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.LOGIN_FORM)

    @Test
    fun test_input_correct() {
        composeTestRule.onNodeWithTag("login_form_open_sheet").performClick()
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).assertIsNotEnabled()
        composeTestRule.onNodeWithTag(LoginFormTags.EMAIL).performTextInput("demo")
        composeTestRule.onNodeWithTag(LoginFormTags.PASSWORD).performTextInput("demo")
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).assertIsEnabled()
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).performClick()
        composeTestRule.onNodeWithTag(LoginFormTags.LOADING_HINT).assertExists()
    }

    @Test
    fun test_input_incorrect() {
        composeTestRule.onNodeWithTag("login_form_open_sheet").performClick()
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).assertIsNotEnabled()
        composeTestRule.onNodeWithTag(LoginFormTags.EMAIL).performTextInput("demodemo")
        composeTestRule.onNodeWithTag(LoginFormTags.PASSWORD).performTextInput("demodemo")
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).assertIsEnabled()
        composeTestRule.onNodeWithTag(LoginFormTags.CONTINUE).performClick()
        composeTestRule.onNodeWithTag(LoginFormTags.PASSWORD).performImeAction()
        composeTestRule.onNodeWithTag(LoginFormTags.ERROR).assertIsDisplayed()
    }
}
