package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLDefault
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLDisabled
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLIsLoading
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLSecondary
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeLWhiteDarkTheme
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeMAccent
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeMSpaceBetween
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeSLongText
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeSWarning
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeXSDark
import com.sdds.playground.sandbox.buttons.SandboxButtonPreviewSizeXSNegative
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewIsLoading
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewLDefault
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewLDisabled
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewLSecondary
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewLWhiteDarkTheme
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewMAccent
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewMClear
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewSPositive
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewSWarning
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewXSDark
import com.sdds.playground.sandbox.buttons.SandboxIconButtonPreviewXSNegative
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeButtonScreenshotTest : RoborazziConfig() {

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Test
    fun testButtonPreviewSizeLDefault() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeLDefault()
        }
    }

    @Test
    fun testButtonPreviewSizeMAccent() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeMAccent()
        }
    }

    @Test
    fun testButtonPreviewSizeSWarning() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeSWarning()
        }
    }

    @Test
    fun testButtonPreviewSizeXSDark() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeXSDark()
        }
    }

    @Test
    fun testButtonPreviewSizeLIsLoading() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeLIsLoading()
        }
    }

    @Test
    fun testButtonPreviewSizeLDisabled() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeLDisabled()
        }
    }

    @Test
    fun testButtonPreviewSizeLSecondary() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeLSecondary()
        }
    }

    @Test
    fun testButtonPreviewSizeMSpaceBetween() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeMSpaceBetween()
        }
    }

    @Test
    fun testButtonPreviewSizeSLongText() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeSLongText()
        }
    }

    @Test
    fun testButtonPreviewSizeXSNegative() {
        composeTestRule.setContent {
            SandboxButtonPreviewSizeXSNegative()
        }
    }

    @Test
    fun testButtonPreviewSizeLWhiteDarkTheme() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                SandboxButtonPreviewSizeLWhiteDarkTheme()
            }
        }
    }

    @Test
    fun testIconButtonPreviewLDefault() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewLDefault()
        }
    }

    @Test
    fun testIconButtonPreviewMAccent() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewMAccent()
        }
    }

    @Test
    fun testIconButtonPreviewSWarning() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewSWarning()
        }
    }

    @Test
    fun testIconButtonPreviewXsDark() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewXSDark()
        }
    }

    @Test
    fun testIconButtonPreviewLIsLoading() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewIsLoading()
        }
    }

    @Test
    fun testIconButtonPreviewLDisabled() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewLDisabled()
        }
    }

    @Test
    fun testIconButtonPreviewLSecondary() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewLSecondary()
        }
    }

    @Test
    fun testIconButtonPreviewMClear() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewMClear()
        }
    }

    @Test
    fun testIconButtonPreviewSPositive() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewSPositive()
        }
    }

    @Test
    fun testIconButtonPreviewXSNegative() {
        composeTestRule.setContent {
            SandboxIconButtonPreviewXSNegative()
        }
    }

    @Test
    fun testIconButtonPreviewLWhiteDarkTheme() {
        composeTestRule.setContent {
            SandboxTheme(darkTheme = true) {
                SandboxIconButtonPreviewLWhiteDarkTheme()
            }
        }
    }
}
