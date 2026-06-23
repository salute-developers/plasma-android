package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.TextFieldInvalidSelectionPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class TextFieldInvalidSelectionTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.TEXT_FIELD_INVALID_SELECTION)

    @Test
    fun test_text_field_scroll_to_caret_uses_stale_layout() {
        TextFieldInvalidSelectionPage(composeTestRule)
            .assertTextFieldIsDisplayed()
            .moveCaretToOriginalEnd()
            .assertCaretMovedCheckPassed()

        composeTestRule.waitForIdle()
    }
}
