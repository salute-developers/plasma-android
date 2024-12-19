package com.sdds.playground.sandbox.compose

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeLDefault
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeLDisabled
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeLIsLoading
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeLSecondary
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeLWhite
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeMAccent
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeMSpaceBetween
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeSLongText
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeSWarning
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeXSDark
import com.sdds.playground.sandbox.buttons.compose.SandboxButtonPreviewSizeXSNegative
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewIsLoading
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewLDefault
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewLDisabled
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewLSecondary
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewLWhiteDarkTheme
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewMAccent
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewMClear
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewSPositive
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewSWarning
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewXSDark
import com.sdds.playground.sandbox.buttons.compose.SandboxIconButtonPreviewXSNegative
import com.sdds.playground.sandbox.buttons.compose.SandboxLinkButtonPreviewSizeLDefault
import com.sdds.playground.sandbox.buttons.compose.SandboxLinkButtonPreviewSizeLDisabled
import com.sdds.playground.sandbox.buttons.compose.SandboxLinkButtonPreviewSizeLIsLoading
import com.sdds.playground.sandbox.buttons.compose.SandboxLinkButtonPreviewSizeMAccent
import com.sdds.playground.sandbox.buttons.compose.SandboxLinkButtonPreviewSizeSWarning
import com.sdds.playground.sandbox.buttons.compose.SandboxLinkButtonPreviewSizeXSAccent
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeButtonScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

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
    fun testButtonPreviewSizeXS() {
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
    fun testButtonPreviewSizeLWhite() {
        composeTestRule.setContent {
            SandboxTheme {
                SandboxButtonPreviewSizeLWhite()
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
    fun testIconButtonPreviewXs() {
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

    @Test
    fun testLinkButtonPreviewLDefault() {
        composeTestRule.setContent {
            SandboxLinkButtonPreviewSizeLDefault()
        }
    }

    @Test
    fun testLinkButtonPreviewSizeLIsLoading() {
        composeTestRule.setContent {
            SandboxLinkButtonPreviewSizeLIsLoading()
        }
    }

    @Test
    fun testLinkButtonPreviewSizeMAccent() {
        composeTestRule.setContent {
            SandboxLinkButtonPreviewSizeMAccent()
        }
    }

    @Test
    fun testLinkButtonPreviewSizeLDisabled() {
        composeTestRule.setContent {
            SandboxLinkButtonPreviewSizeLDisabled()
        }
    }

    @Test
    fun testLinkButtonPreviewSizeSWarning() {
        composeTestRule.setContent {
            SandboxLinkButtonPreviewSizeSWarning()
        }
    }

    @Test
    fun testLinkButtonPreviewSizeXSAccent() {
        composeTestRule.setContent {
            SandboxLinkButtonPreviewSizeXSAccent()
        }
    }
}
