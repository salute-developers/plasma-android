package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
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
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.button.ButtonSizeLDisabled
import com.sdds.testing.compose.button.ButtonSizeLIsLoading
import com.sdds.testing.compose.button.ButtonSizeLSecondary
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
import com.sdds.testing.compose.button.IconButtonMClear
import com.sdds.testing.compose.button.IconButtonSWarning
import com.sdds.testing.compose.button.IconButtonXSNegative
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
}
