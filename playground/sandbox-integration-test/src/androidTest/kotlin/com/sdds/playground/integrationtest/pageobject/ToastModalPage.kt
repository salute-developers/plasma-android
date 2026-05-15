package com.sdds.playground.integrationtest.pageobject

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.ToastTags

class ToastModalPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>
) {

    fun checkToastIsVisible() = apply {
        composeTestRule.onNodeWithTag(ToastTags.TOAST).assertIsDisplayed()
    }
    fun checkToastIsVisibleAfterSubmit() = apply {
        composeTestRule.onNodeWithTag(ToastTags.CHECK_TOAST_AFTER_VALID_SUBMIT).assertIsDisplayed()
    }
}