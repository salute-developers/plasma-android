package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.Accent
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Clear
import com.sdds.serv.styles.basicbutton.Dark
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.Negative
import com.sdds.serv.styles.basicbutton.Positive
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Warning
import com.sdds.serv.styles.basicbutton.White
import com.sdds.serv.styles.basicbutton.Xl
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.basicbutton.Xxs
import com.sdds.serv.styles.iconbutton.Accent
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.Dark
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.Negative
import com.sdds.serv.styles.iconbutton.Pilled
import com.sdds.serv.styles.iconbutton.Positive
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.iconbutton.Warning
import com.sdds.serv.styles.iconbutton.White
import com.sdds.serv.styles.iconbutton.Xl
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.iconbutton.Xxs
import com.sdds.serv.styles.linkbutton.Accent
import com.sdds.serv.styles.linkbutton.Default
import com.sdds.serv.styles.linkbutton.L
import com.sdds.serv.styles.linkbutton.LinkButton
import com.sdds.serv.styles.linkbutton.M
import com.sdds.serv.styles.linkbutton.Negative
import com.sdds.serv.styles.linkbutton.S
import com.sdds.serv.styles.linkbutton.Secondary
import com.sdds.serv.styles.linkbutton.Warning
import com.sdds.serv.styles.linkbutton.Xl
import com.sdds.serv.styles.linkbutton.Xs
import com.sdds.serv.styles.linkbutton.Xxs
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
import com.sdds.testing.compose.button.ButtonSizeXlDefault
import com.sdds.testing.compose.button.ButtonSizeXxsDefault
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
import com.sdds.testing.compose.button.IconButtonXlDefault
import com.sdds.testing.compose.button.IconButtonXsDark
import com.sdds.testing.compose.button.IconButtonXxsDefault
import com.sdds.testing.compose.button.LinkButtonSizeLDefault
import com.sdds.testing.compose.button.LinkButtonSizeLDisabled
import com.sdds.testing.compose.button.LinkButtonSizeLIsLoading
import com.sdds.testing.compose.button.LinkButtonSizeLSecondary
import com.sdds.testing.compose.button.LinkButtonSizeMAccent
import com.sdds.testing.compose.button.LinkButtonSizeSWarning
import com.sdds.testing.compose.button.LinkButtonSizeXSNegative
import com.sdds.testing.compose.button.LinkButtonSizeXlDefault
import com.sdds.testing.compose.button.LinkButtonSizeXxsDefault
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
    fun testButtonSizeXlDefault() {
        composeTestRule.content {
            ButtonSizeXlDefault(style = BasicButton.Xl.Default.style())
        }
    }

    @Test
    fun testButtonSizeXxsDefault() {
        composeTestRule.content {
            ButtonSizeXxsDefault(style = BasicButton.Xxs.Default.style())
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
    fun testIconButtonXlDefault() {
        composeTestRule.content {
            IconButtonXlDefault(iconButtonStyle = IconButton.Xl.Default.style())
        }
    }

    @Test
    fun testIconButtonXxsDefault() {
        composeTestRule.content {
            IconButtonXxsDefault(iconButtonStyle = IconButton.Xxs.Default.style())
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

    @Test
    fun testLinkButtonSizeXlDefault() {
        composeTestRule.content {
            LinkButtonSizeXlDefault(linkButtonStyle = LinkButton.Xl.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeXxsDefault() {
        composeTestRule.content {
            LinkButtonSizeXxsDefault(linkButtonStyle = LinkButton.Xxs.Default.style())
        }
    }
}
