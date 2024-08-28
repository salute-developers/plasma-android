package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewHasDot
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewHasDotInsideEnd
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewInner
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLInactive
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLPlaceholder
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLReadOnly
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewLSuccess
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewMWarning
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewSDefault
import com.sdds.playground.sandbox.textfield.SandboxTextFieldPreviewXsError
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeTextFieldScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testTextFieldPreviewXsError() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXsError()
        }
    }

    @Test
    fun testTextFieldPreviewLSuccess() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuccess()
        }
    }

    @Test
    fun testTextFieldPreviewMWarning() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMWarning()
        }
    }

    @Test
    fun testTextFieldPreviewInner() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewInner()
        }
    }

    @Test
    fun testTextFieldPreviewLInactive() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLInactive()
        }
    }

    @Test
    fun testTextFieldPreviewSDefault() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSDefault()
        }
    }

    @Test
    fun testTextFieldPreviewLReadOnly() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLReadOnly()
        }
    }

    @Test
    fun testTextFieldPreviewLPlaceholder() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLPlaceholder()
        }
    }

    @Test
    fun testTextFieldPreviewHasDot() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewHasDot()
        }
    }

    @Test
    fun testTextFieldPreviewHasDotInsideEnd() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewHasDotInsideEnd()
        }
    }
}
