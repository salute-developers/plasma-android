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
import org.junit.Ignore
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
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewXsError() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewXsError()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewLSuccess() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLSuccess()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewMWarning() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewMWarning()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewInner() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewInner()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewLInactive() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLInactive()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewSDefault() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewSDefault()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewLReadOnly() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLReadOnly()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewLPlaceholder() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewLPlaceholder()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewHasDot() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewHasDot()
        }
    }

    @Test
    @Ignore("Temporarily disabled")
    fun testTextFieldPreviewHasDotInsideEnd() {
        composeTestRule.setContent {
            SandboxTextFieldPreviewHasDotInsideEnd()
        }
    }
}
