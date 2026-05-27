package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.LoginFormPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class BottomSheetTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.LOGIN_FORM)

    @Test
    fun test_bottom_sheet_closes_on_tap_outside() {
        LoginFormPage(composeTestRule)
            .openSheet()
            .assertContinueDisabled()
            .typeEmail("demo")
            .typePassword("demo")
            .assertContinueEnabled()
            .clickOutsideBottomSheet()
            .assertSheetIsNotDisplayed()
    }

    @Test
    fun test_bottom_sheet_stays_open_on_tap_inside() {
        LoginFormPage(composeTestRule)
            .openSheet()
            .assertContinueDisabled()
            .typeEmail("demo")
            .typePassword("demo")
            .assertContinueEnabled()
            .clickInsideBottomSheet()
            .assertSheetIsDisplayed()
    }
}
