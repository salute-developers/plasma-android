package com.sdds.finai

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
import com.sdds.finai.styles.basicbutton.Accent
import com.sdds.finai.styles.basicbutton.BasicButton
import com.sdds.finai.styles.basicbutton.Clear
import com.sdds.finai.styles.basicbutton.Dark
import com.sdds.finai.styles.basicbutton.Default
import com.sdds.finai.styles.basicbutton.Negative
import com.sdds.finai.styles.basicbutton.Positive
import com.sdds.finai.styles.basicbutton.S
import com.sdds.finai.styles.basicbutton.Secondary
import com.sdds.finai.styles.basicbutton.Warning
import com.sdds.finai.styles.basicbutton.White
import com.sdds.finai.styles.basicbutton.Xs
import com.sdds.finai.styles.basicbutton.Xxs
import com.sdds.finai.styles.iconbutton.Accent
import com.sdds.finai.styles.iconbutton.Clear
import com.sdds.finai.styles.iconbutton.Dark
import com.sdds.finai.styles.iconbutton.Default
import com.sdds.finai.styles.iconbutton.IconButton
import com.sdds.finai.styles.iconbutton.Negative
import com.sdds.finai.styles.iconbutton.Pilled
import com.sdds.finai.styles.iconbutton.Positive
import com.sdds.finai.styles.iconbutton.S
import com.sdds.finai.styles.iconbutton.Secondary
import com.sdds.finai.styles.iconbutton.Warning
import com.sdds.finai.styles.iconbutton.White
import com.sdds.finai.styles.iconbutton.Xs
import com.sdds.finai.styles.iconbutton.Xxs
import com.sdds.finai.styles.linkbutton.Accent
import com.sdds.finai.styles.linkbutton.Default
import com.sdds.finai.styles.linkbutton.LinkButton
import com.sdds.finai.styles.linkbutton.Negative
import com.sdds.finai.styles.linkbutton.S
import com.sdds.finai.styles.linkbutton.Secondary
import com.sdds.finai.styles.linkbutton.Warning
import com.sdds.finai.styles.linkbutton.Xs
import com.sdds.finai.styles.linkbutton.Xxs
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
    fun testButtonSizeSDefault() {
        composeTestRule.content {
            ButtonSizeLDefault(style = BasicButton.S.Default.style())
        }
    }

    @Test
    fun testButtonSizeSAccent() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.S.Accent.style())
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
    fun testButtonSizeSIsLoading() {
        composeTestRule.content {
            ButtonSizeLIsLoading(style = BasicButton.S.Default.style())
        }
    }

    @Test
    fun testButtonSizeSDisabled() {
        composeTestRule.content {
            ButtonSizeLDisabled(style = BasicButton.S.Default.style())
        }
    }

    @Test
    fun testButtonSizeSSecondary() {
        composeTestRule.content {
            ButtonSizeLSecondary(style = BasicButton.S.Secondary.style())
        }
    }

    @Test
    fun testButtonSizeSSpaceBetween() {
        composeTestRule.content {
            ButtonSizeMSpaceBetween(style = BasicButton.S.Clear.style())
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
    fun testButtonSizeSWhite() {
        composeTestRule.content {
            ButtonSizeLWhite(style = BasicButton.S.White.style())
        }
    }

    @Test
    fun testButtonSizeXxsDefault() {
        composeTestRule.content {
            ButtonSizeXxsDefault(style = BasicButton.Xxs.Default.style())
        }
    }

    @Test
    fun testButtonClearClick() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.S.Clear.style())
        }
        composeTestRule.onNodeWithText("Label").performTouchInput {
            down(center)
            advanceEventTime(1000)
        }
    }

    @Test
    fun testIconButtonSDefault() {
        composeTestRule.content {
            IconButtonLDefault(iconButtonStyle = IconButton.S.Default.style())
        }
    }

    @Test
    fun testIconButtonSAccent() {
        composeTestRule.content {
            IconButtonMAccent(iconButtonStyle = IconButton.S.Accent.style())
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
    fun testIconButtonSIsLoading() {
        composeTestRule.content {
            IconButtonIsLoading(iconButtonStyle = IconButton.S.Default.style())
        }
    }

    @Test
    fun testIconButtonSDisabled() {
        composeTestRule.content {
            IconButtonLDisabled(iconButtonStyle = IconButton.S.Default.style())
        }
    }

    @Test
    fun testIconButtonSSecondary() {
        composeTestRule.content {
            IconButtonLSecondary(iconButtonStyle = IconButton.S.Pilled.Secondary.style())
        }
    }

    @Test
    fun testIconButtonSClear() {
        composeTestRule.content {
            IconButtonMClear(iconButtonStyle = IconButton.S.Clear.style())
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
    fun testIconButtonSWhite() {
        composeTestRule.content {
            IconButtonLWhite(iconButtonStyle = IconButton.S.White.style())
        }
    }

    @Test
    fun testIconButtonXxsDefault() {
        composeTestRule.content {
            IconButtonXxsDefault(iconButtonStyle = IconButton.Xxs.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeSDefault() {
        composeTestRule.content {
            LinkButtonSizeLDefault(linkButtonStyle = LinkButton.S.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeSIsLoading() {
        composeTestRule.content {
            LinkButtonSizeLIsLoading(linkButtonStyle = LinkButton.S.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeSSecondary() {
        composeTestRule.content {
            LinkButtonSizeLSecondary(linkButtonStyle = LinkButton.S.Secondary.style())
        }
    }

    @Test
    fun testLinkButtonSizeSAccent() {
        composeTestRule.content {
            LinkButtonSizeMAccent(linkButtonStyle = LinkButton.S.Accent.style())
        }
    }

    @Test
    fun testLinkButtonSizeSDisabled() {
        composeTestRule.content {
            LinkButtonSizeLDisabled(linkButtonStyle = LinkButton.S.Default.style())
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
            LinkButtonSizeXlDefault(linkButtonStyle = LinkButton.S.Default.style())
        }
    }

    @Test
    fun testLinkButtonSizeXxsDefault() {
        composeTestRule.content {
            LinkButtonSizeXxsDefault(linkButtonStyle = LinkButton.Xxs.Default.style())
        }
    }
}
