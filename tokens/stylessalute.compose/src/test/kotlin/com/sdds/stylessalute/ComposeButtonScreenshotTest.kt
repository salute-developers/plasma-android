package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.button.basic.Accent
import com.sdds.stylessalute.styles.button.basic.BasicButton
import com.sdds.stylessalute.styles.button.basic.Clear
import com.sdds.stylessalute.styles.button.basic.Dark
import com.sdds.stylessalute.styles.button.basic.Default
import com.sdds.stylessalute.styles.button.basic.L
import com.sdds.stylessalute.styles.button.basic.M
import com.sdds.stylessalute.styles.button.basic.Negative
import com.sdds.stylessalute.styles.button.basic.Positive
import com.sdds.stylessalute.styles.button.basic.S
import com.sdds.stylessalute.styles.button.basic.Secondary
import com.sdds.stylessalute.styles.button.basic.Warning
import com.sdds.stylessalute.styles.button.basic.White
import com.sdds.stylessalute.styles.button.basic.Xs
import com.sdds.stylessalute.styles.button.icon.Accent
import com.sdds.stylessalute.styles.button.icon.Clear
import com.sdds.stylessalute.styles.button.icon.Dark
import com.sdds.stylessalute.styles.button.icon.Default
import com.sdds.stylessalute.styles.button.icon.IconButton
import com.sdds.stylessalute.styles.button.icon.L
import com.sdds.stylessalute.styles.button.icon.M
import com.sdds.stylessalute.styles.button.icon.Negative
import com.sdds.stylessalute.styles.button.icon.Pilled
import com.sdds.stylessalute.styles.button.icon.Positive
import com.sdds.stylessalute.styles.button.icon.S
import com.sdds.stylessalute.styles.button.icon.Secondary
import com.sdds.stylessalute.styles.button.icon.Warning
import com.sdds.stylessalute.styles.button.icon.White
import com.sdds.stylessalute.styles.button.icon.Xs
import com.sdds.stylessalute.styles.button.link.Accent
import com.sdds.stylessalute.styles.button.link.Default
import com.sdds.stylessalute.styles.button.link.L
import com.sdds.stylessalute.styles.button.link.LinkButton
import com.sdds.stylessalute.styles.button.link.M
import com.sdds.stylessalute.styles.button.link.Negative
import com.sdds.stylessalute.styles.button.link.S
import com.sdds.stylessalute.styles.button.link.Secondary
import com.sdds.stylessalute.styles.button.link.Warning
import com.sdds.stylessalute.styles.button.link.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.button.ButtonSizeLDefault
import com.sdds.testing.compose.button.ButtonSizeLDisabled
import com.sdds.testing.compose.button.ButtonSizeLIsLoading
import com.sdds.testing.compose.button.ButtonSizeLSecondary
import com.sdds.testing.compose.button.ButtonSizeLWhite
import com.sdds.testing.compose.button.ButtonSizeMAccent
import com.sdds.testing.compose.button.ButtonSizeMSpaceBetween
import com.sdds.testing.compose.button.ButtonSizeSLongText
import com.sdds.testing.compose.button.ButtonSizeSWarning
import com.sdds.testing.compose.button.ButtonSizeXSDark
import com.sdds.testing.compose.button.ButtonSizeXSNegative
import com.sdds.testing.compose.button.IconButtonIsLoading
import com.sdds.testing.compose.button.IconButtonLDefault
import com.sdds.testing.compose.button.IconButtonLDisabled
import com.sdds.testing.compose.button.IconButtonLSecondary
import com.sdds.testing.compose.button.IconButtonLWhite
import com.sdds.testing.compose.button.IconButtonMAccent
import com.sdds.testing.compose.button.IconButtonMClear
import com.sdds.testing.compose.button.IconButtonSPositive
import com.sdds.testing.compose.button.IconButtonSWarning
import com.sdds.testing.compose.button.IconButtonXSNegative
import com.sdds.testing.compose.button.IconButtonXsDark
import com.sdds.testing.compose.button.LinkButtonSizeLDefault
import com.sdds.testing.compose.button.LinkButtonSizeLDisabled
import com.sdds.testing.compose.button.LinkButtonSizeLIsLoading
import com.sdds.testing.compose.button.LinkButtonSizeLSecondary
import com.sdds.testing.compose.button.LinkButtonSizeMAccent
import com.sdds.testing.compose.button.LinkButtonSizeSWarning
import com.sdds.testing.compose.button.LinkButtonSizeXSNegative
import com.sdds.testing.vs.SDK_NUMBER
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
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testButtonSizeLDefault() {
        composeTestRule.content {
            ButtonSizeLDefault(style = BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonSizeMAccent() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.M.Accent.style())
        }
    }

    @Test
    fun testButtonSizeSWarning() {
        composeTestRule.content {
            ButtonSizeSWarning(style = BasicButton.S.Warning.style())
        }
    }

    @Test
    fun testButtonSizeXS() {
        composeTestRule.content {
            ButtonSizeXSDark(style = BasicButton.Xs.Dark.style())
        }
    }

    @Test
    fun testButtonSizeLIsLoading() {
        composeTestRule.content {
            ButtonSizeLIsLoading(style = BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonSizeLDisabled() {
        composeTestRule.content {
            ButtonSizeLDisabled(style = BasicButton.L.Default.style())
        }
    }

    @Test
    fun testButtonSizeLSecondary() {
        composeTestRule.content {
            ButtonSizeLSecondary(style = BasicButton.L.Secondary.style())
        }
    }

    @Test
    fun testButtonSizeMSpaceBetween() {
        composeTestRule.content {
            ButtonSizeMSpaceBetween(style = BasicButton.M.Clear.style())
        }
    }

    @Test
    fun testButtonSizeSLongText() {
        composeTestRule.content {
            ButtonSizeSLongText(style = BasicButton.S.Positive.style())
        }
    }

    @Test
    fun testButtonSizeXSNegative() {
        composeTestRule.content {
            ButtonSizeXSNegative(style = BasicButton.Xs.Negative.style())
        }
    }

    @Test
    fun testButtonSizeLWhite() {
        composeTestRule.content {
            ButtonSizeLWhite(style = BasicButton.L.White.style())
        }
    }

    @Test
    fun testIconButtonLDefault() {
        composeTestRule.content {
            IconButtonLDefault(iconButtonStyle = IconButton.L.Default.style())
        }
    }

    @Test
    fun testIconButtonMAccent() {
        composeTestRule.content {
            IconButtonMAccent(iconButtonStyle = IconButton.M.Accent.style())
        }
    }

    @Test
    fun testIconButtonSWarning() {
        composeTestRule.content {
            IconButtonSWarning(iconButtonStyle = IconButton.S.Warning.style())
        }
    }

    @Test
    fun testIconButtonXs() {
        composeTestRule.content {
            IconButtonXsDark(iconButtonStyle = IconButton.Xs.Dark.style())
        }
    }

    @Test
    fun testIconButtonLIsLoading() {
        composeTestRule.content {
            IconButtonIsLoading(iconButtonStyle = IconButton.L.Default.style())
        }
    }

    @Test
    fun testIconButtonLDisabled() {
        composeTestRule.content {
            IconButtonLDisabled(iconButtonStyle = IconButton.L.Default.style())
        }
    }

    @Test
    fun testIconButtonLSecondary() {
        composeTestRule.content {
            IconButtonLSecondary(iconButtonStyle = IconButton.L.Pilled.Secondary.style())
        }
    }

    @Test
    fun testIconButtonMClear() {
        composeTestRule.content {
            IconButtonMClear(iconButtonStyle = IconButton.M.Clear.style())
        }
    }

    @Test
    fun testIconButtonSPositive() {
        composeTestRule.content {
            IconButtonSPositive(iconButtonStyle = IconButton.S.Positive.style())
        }
    }

    @Test
    fun testIconButtonXSNegative() {
        composeTestRule.content {
            IconButtonXSNegative(iconButtonStyle = IconButton.Xs.Pilled.Negative.style())
        }
    }

    @Test
    fun testIconButtonLWhite() {
        composeTestRule.content {
            IconButtonLWhite(iconButtonStyle = IconButton.L.White.style())
        }
    }

    @Test
    fun testLinkButtonSizeLDefault() {
        composeTestRule.content {
            LinkButtonSizeLDefault(linkButtonStyle = LinkButton.L.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeLIsLoading() {
        composeTestRule.content {
            LinkButtonSizeLIsLoading(linkButtonStyle = LinkButton.L.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeLSecondary() {
        composeTestRule.content {
            LinkButtonSizeLSecondary(linkButtonStyle = LinkButton.L.Secondary.style())
        }
    }

    @Test
    fun testLinkButtonSizeMAccent() {
        composeTestRule.content {
            LinkButtonSizeMAccent(linkButtonStyle = LinkButton.M.Accent.style())
        }
    }

    @Test
    fun testLinkButtonSizeLDisabled() {
        composeTestRule.content {
            LinkButtonSizeLDisabled(linkButtonStyle = LinkButton.L.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeSWarning() {
        composeTestRule.content {
            LinkButtonSizeSWarning(linkButtonStyle = LinkButton.S.Warning.style())
        }
    }

    @Test
    fun testLinkButtonSizeXSNegative() {
        composeTestRule.content {
            LinkButtonSizeXSNegative(linkButtonStyle = LinkButton.Xs.Negative.style())
        }
    }
}
