package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.LoginFormPage
import com.sdds.playground.integrationtest.pageobject.ToastModalPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class ToastModalTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.TOAST_MODAL_LOGIN)

    @Test
    fun test_toast_modal_overlay() {
        LoginFormPage(composeTestRule)
            .openModal()
            .typeEmail("demo")
            .typePassword("demo")
            .clickContinue()
        ToastModalPage(composeTestRule)
            .checkToastIsVisibleAfterSubmit()
            .checkToastIsVisible()
    }
}
