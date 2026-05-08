package com.sdds.playground.integrationtest

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeUp
import com.sdds.playground.integrationtest.testtags.ModalTags
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class ModalScrollbarTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.MODAL_SCROLLBAR)

    @Test
    fun test_modal_scroll_after_close() {
        composeTestRule.onNodeWithTag(ModalTags.FIRST_OPEN_BUTTON).performClick()
        composeTestRule.onNodeWithTag(ModalTags.CHECK_FIRST_OPENED).isDisplayed()
        composeTestRule.onNodeWithTag(ModalTags.FIRST_CLOSE_BUTTON).performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag(ModalTags.FIRST_SCROLL_CONTAINER).performTouchInput {
            repeat(5) {
                swipeUp()
            }
        }
        composeTestRule.onNodeWithText("scroll passed").assertIsDisplayed()
    }
}
