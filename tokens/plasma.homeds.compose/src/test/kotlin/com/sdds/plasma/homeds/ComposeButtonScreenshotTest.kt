package com.sdds.plasma.homeds

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTouchInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLSecondary
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
import com.sdds.compose.uikit.fixtures.testcases.IconButtonMClear
import com.sdds.compose.uikit.fixtures.testcases.IconButtonSWarning
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXSNegative
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
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.Clear
import com.sdds.plasma.homeds.styles.basicbutton.Default
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.basicbutton.Negative
import com.sdds.plasma.homeds.styles.basicbutton.S
import com.sdds.plasma.homeds.styles.basicbutton.Secondary
import com.sdds.plasma.homeds.styles.basicbutton.Warning
import com.sdds.plasma.homeds.styles.iconbutton.Clear
import com.sdds.plasma.homeds.styles.iconbutton.Default
import com.sdds.plasma.homeds.styles.iconbutton.IconButton
import com.sdds.plasma.homeds.styles.iconbutton.M
import com.sdds.plasma.homeds.styles.iconbutton.Negative
import com.sdds.plasma.homeds.styles.iconbutton.S
import com.sdds.plasma.homeds.styles.iconbutton.Secondary
import com.sdds.plasma.homeds.styles.iconbutton.Warning
import com.sdds.plasma.homeds.styles.linkbutton.Accent
import com.sdds.plasma.homeds.styles.linkbutton.Default
import com.sdds.plasma.homeds.styles.linkbutton.L
import com.sdds.plasma.homeds.styles.linkbutton.LinkButton
import com.sdds.plasma.homeds.styles.linkbutton.M
import com.sdds.plasma.homeds.styles.linkbutton.Negative
import com.sdds.plasma.homeds.styles.linkbutton.S
import com.sdds.plasma.homeds.styles.linkbutton.Secondary
import com.sdds.plasma.homeds.styles.linkbutton.Warning
import com.sdds.plasma.homeds.styles.linkbutton.Xl
import com.sdds.plasma.homeds.styles.linkbutton.Xs
import com.sdds.plasma.homeds.styles.linkbutton.Xxs
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
    fun testButtonSizeMDefault() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.M.Default.style())
        }
    }

    @Test
    fun testButtonSizeSWarning() {
        composeTestRule.content {
            ButtonSizeSWarning(style = BasicButton.S.Warning.style())
        }
    }

    @Test
    fun testButtonSizeSClear() {
        composeTestRule.content {
            ButtonSizeXSDark(style = BasicButton.S.Clear.style())
        }
    }

    @Test
    fun testButtonSizeMIsLoading() {
        composeTestRule.content {
            ButtonSizeLIsLoading(style = BasicButton.M.Default.style())
        }
    }

    @Test
    fun testButtonSizeMDisabled() {
        composeTestRule.content {
            ButtonSizeLDisabled(style = BasicButton.M.Default.style())
        }
    }

    @Test
    fun testButtonSizeMSecondary() {
        composeTestRule.content {
            ButtonSizeLSecondary(style = BasicButton.M.Secondary.style())
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
            ButtonSizeSLongText(style = BasicButton.S.Default.style())
        }
    }

    @Test
    fun testButtonSizeSNegative() {
        composeTestRule.content {
            ButtonSizeXSNegative(style = BasicButton.S.Negative.style())
        }
    }

    @Test
    fun testButtonClearClick() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.M.Clear.style())
        }
        composeTestRule.onNodeWithText("Label").performTouchInput {
            down(center)
            advanceEventTime(1000)
        }
    }

    @Test
    fun testIconButtonMDefault() {
        composeTestRule.content {
            IconButtonLDefault(iconButtonStyle = IconButton.M.Default.style())
        }
    }

    @Test
    fun testIconButtonSWarning() {
        composeTestRule.content {
            IconButtonSWarning(iconButtonStyle = IconButton.S.Warning.style())
        }
    }

    @Test
    fun testIconButtonMIsLoading() {
        composeTestRule.content {
            IconButtonIsLoading(iconButtonStyle = IconButton.M.Default.style())
        }
    }

    @Test
    fun testIconButtonMDisabled() {
        composeTestRule.content {
            IconButtonLDisabled(iconButtonStyle = IconButton.M.Default.style())
        }
    }

    @Test
    fun testIconButtonMSecondary() {
        composeTestRule.content {
            IconButtonLSecondary(iconButtonStyle = IconButton.M.Secondary.style())
        }
    }

    @Test
    fun testIconButtonMClear() {
        composeTestRule.content {
            IconButtonMClear(iconButtonStyle = IconButton.M.Clear.style())
        }
    }

    @Test
    fun testIconButtonSNegative() {
        composeTestRule.content {
            IconButtonXSNegative(iconButtonStyle = IconButton.S.Negative.style())
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
