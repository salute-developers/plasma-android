package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.LoginFormPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class LoginFormTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.LOGIN_FORM)

    @Test
    fun test_input_correct() {
        LoginFormPage(composeTestRule)
            .openSheet()
            .assertContinueDisabled()
            .typeEmail("demo")
            .typePassword("demo")
            .assertContinueEnabled()
            .clickContinue()
            .assertExistsLoadingHint()
            .closeSheet()
    }

    @Test
    fun test_input_incorrect() {
        LoginFormPage(composeTestRule)
            .openSheet()
            .assertContinueDisabled()
            .typeEmail("demodemo")
            .typePassword("demodemo")
            .assertContinueEnabled()
            .clickContinue()
            .assertExistsError()
            .closeSheet()
    }
}
