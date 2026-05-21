package com.sdds.playground.integrationtest

import android.os.ParcelFileDescriptor
import androidx.test.platform.app.InstrumentationRegistry
import com.sdds.playground.integrationtest.pageobject.LoginFormPage
import com.sdds.playground.sandboxhelper.SandboxScenariosIds
import com.sdds.playground.sandboxhelper.createSandboxComposeRule
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.io.readText

class BottomSheetTest {

    @get:Rule
    val composeTestRule = createSandboxComposeRule(SandboxScenariosIds.LOGIN_FORM)

    @Test
    fun test_bottom_sheet_onDismiss() {
        clearLogcat()
        LoginFormPage(composeTestRule)
            .openSheet()
            .assertContinueDisabled()
            .typeEmail("demo")
            .typePassword("demo")
            .assertContinueEnabled()
            .clickOutsideBottomSheet()
            .assertSheetIsNotDisplayed()
        composeTestRule.waitUntil(timeoutMillis = 3_000) {
            readLogcat().contains("onDismiss")
        }
        val log = readLogcat()
        assertTrue(
            "Logcat:\n$log",
            log.contains("LoginFormScenario: onDismiss"),
        )
    }

    @Test
    fun test_bottom_sheet_tap() {
        clearLogcat()
        LoginFormPage(composeTestRule)
            .openSheet()
            .assertContinueDisabled()
            .typeEmail("demo")
            .typePassword("demo")
            .assertContinueEnabled()
            .clickInsideBottomSheet()
            .assertSheetIsDisplayed()
    }

    private fun clearLogcat() {
        InstrumentationRegistry.getInstrumentation()
            .uiAutomation
            .executeShellCommand("logcat -c")
            .close()
    }

    private fun readLogcat(): String {
        val pfd = InstrumentationRegistry.getInstrumentation()
            .uiAutomation
            .executeShellCommand("logcat -d -s LoginFormScenario:D")

        return pfd.use {
            BufferedReader(
                InputStreamReader(
                    ParcelFileDescriptor.AutoCloseInputStream(it),
                ),
            ).readText()
        }
    }
}
