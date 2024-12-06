package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeLDefault
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeLDisabled
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeLIsLoading
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeLSecondary
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeLWhite
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeMAccent
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeMSpaceBetween
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeSLongText
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeSWarning
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeXSDark
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxButtonPreviewSizeXSNegative
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewIsLoading
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewLDefault
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewLDisabled
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewLSecondary
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewLWhiteDarkTheme
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewMAccent
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewMClear
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewSPositive
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewSWarning
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewXSDark
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxIconButtonPreviewXSNegative
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxLinkButtonPreviewSizeLDefault
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxLinkButtonPreviewSizeLDisabled
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxLinkButtonPreviewSizeLIsLoading
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxLinkButtonPreviewSizeMAccent
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxLinkButtonPreviewSizeSWarning
import com.sdds.plasma.sd.service.sandbox.buttons.SandboxLinkButtonPreviewSizeXSAccent
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
