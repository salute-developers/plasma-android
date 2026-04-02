package com.sdds.plasma.sd.service

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTouchInput
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
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeXlDefault
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeXxsDefault
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
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXlDefault
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXsDark
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXxsDefault
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeLSecondary
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeMAccent
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeSWarning
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeXSNegative
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeXlDefault
import com.sdds.compose.uikit.fixtures.testcases.LinkButtonSizeXxsDefault
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.basicbutton.Accent
import com.sdds.plasma.sd.service.styles.basicbutton.BasicButton
import com.sdds.plasma.sd.service.styles.basicbutton.Clear
import com.sdds.plasma.sd.service.styles.basicbutton.Dark
import com.sdds.plasma.sd.service.styles.basicbutton.Default
import com.sdds.plasma.sd.service.styles.basicbutton.L
import com.sdds.plasma.sd.service.styles.basicbutton.M
import com.sdds.plasma.sd.service.styles.basicbutton.Negative
import com.sdds.plasma.sd.service.styles.basicbutton.Positive
import com.sdds.plasma.sd.service.styles.basicbutton.S
import com.sdds.plasma.sd.service.styles.basicbutton.Secondary
import com.sdds.plasma.sd.service.styles.basicbutton.Warning
import com.sdds.plasma.sd.service.styles.basicbutton.White
import com.sdds.plasma.sd.service.styles.basicbutton.Xl
import com.sdds.plasma.sd.service.styles.basicbutton.Xs
import com.sdds.plasma.sd.service.styles.basicbutton.Xxs
import com.sdds.plasma.sd.service.styles.iconbutton.Accent
import com.sdds.plasma.sd.service.styles.iconbutton.Clear
import com.sdds.plasma.sd.service.styles.iconbutton.Dark
import com.sdds.plasma.sd.service.styles.iconbutton.Default
import com.sdds.plasma.sd.service.styles.iconbutton.IconButton
import com.sdds.plasma.sd.service.styles.iconbutton.L
import com.sdds.plasma.sd.service.styles.iconbutton.M
import com.sdds.plasma.sd.service.styles.iconbutton.Negative
import com.sdds.plasma.sd.service.styles.iconbutton.Pilled
import com.sdds.plasma.sd.service.styles.iconbutton.Positive
import com.sdds.plasma.sd.service.styles.iconbutton.S
import com.sdds.plasma.sd.service.styles.iconbutton.Secondary
import com.sdds.plasma.sd.service.styles.iconbutton.Warning
import com.sdds.plasma.sd.service.styles.iconbutton.White
import com.sdds.plasma.sd.service.styles.iconbutton.Xl
import com.sdds.plasma.sd.service.styles.iconbutton.Xs
import com.sdds.plasma.sd.service.styles.iconbutton.Xxs
import com.sdds.plasma.sd.service.styles.linkbutton.Accent
import com.sdds.plasma.sd.service.styles.linkbutton.Default
import com.sdds.plasma.sd.service.styles.linkbutton.L
import com.sdds.plasma.sd.service.styles.linkbutton.LinkButton
import com.sdds.plasma.sd.service.styles.linkbutton.M
import com.sdds.plasma.sd.service.styles.linkbutton.Negative
import com.sdds.plasma.sd.service.styles.linkbutton.S
import com.sdds.plasma.sd.service.styles.linkbutton.Secondary
import com.sdds.plasma.sd.service.styles.linkbutton.Warning
import com.sdds.plasma.sd.service.styles.linkbutton.Xl
import com.sdds.plasma.sd.service.styles.linkbutton.Xs
import com.sdds.plasma.sd.service.styles.linkbutton.Xxs
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
    fun testButtonClearClick() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.L.Clear.style())
        }
        composeTestRule.onNodeWithText("Label").performTouchInput {
            down(center)
            advanceEventTime(1000)
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
