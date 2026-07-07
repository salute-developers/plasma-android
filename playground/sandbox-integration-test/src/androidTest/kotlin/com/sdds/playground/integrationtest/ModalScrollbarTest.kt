package com.sdds.playground.integrationtest

import com.sdds.playground.integrationtest.pageobject.ModalScrollbarPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class ModalScrollbarTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.MODAL_SCROLLBAR)

    @Test
    fun test_modal_scroll_after_close() {
        ModalScrollbarPage(composeTestRule)
            .openFirstModal()
            .checkFirstModalOpened()
            .closeFirstModal()
            .scrollUntilPassedVisible()
            .assertScrollPassedVisible()
    }

    @Test
    fun test_modal_scroll_thumb() {
        ModalScrollbarPage(composeTestRule)
            .scrollThumbUntilPassedVisible()
            .assertScrollPassedVisible()
    }
}
