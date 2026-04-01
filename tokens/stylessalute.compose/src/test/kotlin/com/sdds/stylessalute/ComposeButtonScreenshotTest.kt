package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLSecondary
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLWhite
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMAccent
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMSpaceBetween
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeSLongText
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeSWarning
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeXSDark
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeXSNegative
import com.sdds.compose.uikit.fixtures.testcases.IconButtonIsLoading
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLDefault
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLDisabled
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLSecondary
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLWhite
import com.sdds.compose.uikit.fixtures.testcases.IconButtonMAccent
import com.sdds.compose.uikit.fixtures.testcases.IconButtonMClear
import com.sdds.compose.uikit.fixtures.testcases.IconButtonSPositive
import com.sdds.compose.uikit.fixtures.testcases.IconButtonSWarning
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXSNegative
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXsDark
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLSecondary
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeMAccent
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeSWarning
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeXSNegative
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.basicbutton.Accent
import com.sdds.stylessalute.styles.basicbutton.BasicButton
import com.sdds.stylessalute.styles.basicbutton.Clear
import com.sdds.stylessalute.styles.basicbutton.Dark
import com.sdds.stylessalute.styles.basicbutton.Default
import com.sdds.stylessalute.styles.basicbutton.L
import com.sdds.stylessalute.styles.basicbutton.M
import com.sdds.stylessalute.styles.basicbutton.Negative
import com.sdds.stylessalute.styles.basicbutton.Positive
import com.sdds.stylessalute.styles.basicbutton.S
import com.sdds.stylessalute.styles.basicbutton.Secondary
import com.sdds.stylessalute.styles.basicbutton.Warning
import com.sdds.stylessalute.styles.basicbutton.White
import com.sdds.stylessalute.styles.basicbutton.Xs
import com.sdds.stylessalute.styles.iconbutton.Accent
import com.sdds.stylessalute.styles.iconbutton.Clear
import com.sdds.stylessalute.styles.iconbutton.Dark
import com.sdds.stylessalute.styles.iconbutton.Default
import com.sdds.stylessalute.styles.iconbutton.IconButton
import com.sdds.stylessalute.styles.iconbutton.L
import com.sdds.stylessalute.styles.iconbutton.M
import com.sdds.stylessalute.styles.iconbutton.Negative
import com.sdds.stylessalute.styles.iconbutton.Pilled
import com.sdds.stylessalute.styles.iconbutton.Positive
import com.sdds.stylessalute.styles.iconbutton.S
import com.sdds.stylessalute.styles.iconbutton.Secondary
import com.sdds.stylessalute.styles.iconbutton.Warning
import com.sdds.stylessalute.styles.iconbutton.White
import com.sdds.stylessalute.styles.iconbutton.Xs
import com.sdds.stylessalute.styles.linkbutton.Accent
import com.sdds.stylessalute.styles.linkbutton.Default
import com.sdds.stylessalute.styles.linkbutton.L
import com.sdds.stylessalute.styles.linkbutton.LinkButton
import com.sdds.stylessalute.styles.linkbutton.M
import com.sdds.stylessalute.styles.linkbutton.Negative
import com.sdds.stylessalute.styles.linkbutton.S
import com.sdds.stylessalute.styles.linkbutton.Secondary
import com.sdds.stylessalute.styles.linkbutton.Warning
import com.sdds.stylessalute.styles.linkbutton.Xs
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
