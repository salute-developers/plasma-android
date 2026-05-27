package com.sdds.playground.integrationtest

import androidx.test.espresso.Espresso.pressBack
import com.sdds.playground.integrationtest.pageobject.TooltipPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Rule
import org.junit.Test

class TooltipTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.TOOLTIP_CLOSE)

    @Test
    fun test_close_tooltip_with_btn_in_shadow() {
        TooltipPage(composeTestRule)
            .clickFirstOpenButton()
            .checkFirstOpenedTooltip()
            .checkFirstTooltipIsDisplayed()
            .clickCloseButton()
            .checkFirstTooltipIsNotDisplayed()
    }

    @Test
    fun test_close_tooltip_with_tap_outside() {
        TooltipPage(composeTestRule)
            .clickSecondOpenButton()
            .checkSecondOpenedTooltip()
            .checkSecondTooltipIsDisplayed()
            .tapOutsideTooltip()
            .checkSecondTooltipIsNotDisplayed()
    }

    @Test
    fun test_close_tooltip_with_pressBack() {
        TooltipPage(composeTestRule)
            .clickSecondOpenButton()
            .checkSecondTooltipIsDisplayed()
        pressBack()
        TooltipPage(composeTestRule)
            .checkSecondTooltipIsNotDisplayed()
    }
}
