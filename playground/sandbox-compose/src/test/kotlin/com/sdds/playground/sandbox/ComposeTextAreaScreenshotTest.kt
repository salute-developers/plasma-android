package com.sdds.playground.sandbox

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewDisabled
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewFocused
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewL
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewM
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewReadOnly
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewS
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewTextMovesToNextLines
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewTitleInsideNotVisible
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewTitleNotDisplayedWithChips
import com.sdds.playground.sandbox.textfield.SandboxTextAreaPreviewXs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeTextAreaScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testTextAreaPreviewL() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewL()
        }
    }

    @Test
    fun testTextAreaPreviewM() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewM()
        }
    }

    @Test
    fun testTextAreaPreviewS() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewS()
        }
    }

    @Test
    fun testTextAreaPreviewXs() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewXs()
        }
        composeTestRule.onNodeWithText("Placeholder")
            .performClick()
    }

    @Test
    fun testTextAreaPreviewDisabled() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewDisabled()
        }
    }

    @Test
    fun testTextAreaPreviewReadOnly() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewReadOnly()
        }
    }

    @Test
    fun testTextAreaPreviewFocused() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewFocused()
        }
        composeTestRule.onNodeWithText("Placeholder")
            .performClick()
    }

    @Test
    fun testTextAreaPreviewTitleInsideNotVisible() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewTitleInsideNotVisible()
        }
    }

    @Test
    fun testTextAreaPreviewTextMovesToNextLines() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewTextMovesToNextLines()
        }
    }

    @Test
    fun testTextAreaPreviewTitleNotDisplayedWithChips() {
        composeTestRule.setContent {
            SandboxTextAreaPreviewTitleNotDisplayedWithChips()
        }
    }
}
