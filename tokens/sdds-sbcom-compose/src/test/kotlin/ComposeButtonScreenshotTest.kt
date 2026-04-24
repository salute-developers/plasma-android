package com.sdds.sbcom

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
import com.sdds.compose.uikit.fixtures.testcases.IconButtonIsLoading
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLDefault
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLDisabled
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLSecondary
import com.sdds.compose.uikit.fixtures.testcases.IconButtonMAccent
import com.sdds.compose.uikit.fixtures.testcases.IconButtonMClear
import com.sdds.compose.uikit.fixtures.testcases.IconButtonSWarning
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXsDark
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.BgNo
import com.sdds.sbcom.styles.basicbutton.ModeAccentFilled
import com.sdds.sbcom.styles.basicbutton.ModeAccentGrey
import com.sdds.sbcom.styles.basicbutton.ModeAccentWhite
import com.sdds.sbcom.styles.basicbutton.ModeDangerTint
import com.sdds.sbcom.styles.basicbutton.ModePrimary
import com.sdds.sbcom.styles.basicbutton.Size24
import com.sdds.sbcom.styles.basicbutton.Size32
import com.sdds.sbcom.styles.basicbutton.Size40
import com.sdds.sbcom.styles.basicbutton.Size48
import com.sdds.sbcom.styles.iconbutton.BgNo
import com.sdds.sbcom.styles.iconbutton.IconButton
import com.sdds.sbcom.styles.iconbutton.ModeAccentFilled
import com.sdds.sbcom.styles.iconbutton.ModeAccentGrey
import com.sdds.sbcom.styles.iconbutton.ModeDangerTint
import com.sdds.sbcom.styles.iconbutton.Size24
import com.sdds.sbcom.styles.iconbutton.Size32
import com.sdds.sbcom.styles.iconbutton.Size40
import com.sdds.sbcom.styles.iconbutton.Size48
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
    fun testButtonSize48ModePrimary() {
        composeTestRule.content {
            ButtonSizeLDefault(style = BasicButton.Size48.ModePrimary.style())
        }
    }

    @Test
    fun testButtonSize40ModeAccentFilled() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.Size40.ModeAccentFilled.style())
        }
    }

    @Test
    fun testButtonSize32ModeAccentWhite() {
        composeTestRule.content {
            ButtonSizeSWarning(style = BasicButton.Size32.ModeAccentWhite.style())
        }
    }

    @Test
    fun testButtonSize24ModeAccentGrey() {
        composeTestRule.content {
            ButtonSizeXSDark(style = BasicButton.Size24.ModeAccentGrey.style())
        }
    }

    @Test
    fun testButtonIsLoading() {
        composeTestRule.content {
            ButtonSizeLIsLoading(style = BasicButton.Size48.ModePrimary.style())
        }
    }

    @Test
    fun testButtonDisabled() {
        composeTestRule.content {
            ButtonSizeLDisabled(style = BasicButton.Size48.ModePrimary.style())
        }
    }

    @Test
    fun testButtonSize48ModeDangerTint() {
        composeTestRule.content {
            ButtonSizeLSecondary(style = BasicButton.Size48.ModeDangerTint.style())
        }
    }

    @Test
    fun testButtonSize40SpaceBetween() {
        composeTestRule.content {
            ButtonSizeMSpaceBetween(style = BasicButton.Size40.BgNo.ModePrimary.style())
        }
    }

    @Test
    fun testButtonSizeSLongText() {
        composeTestRule.content {
            ButtonSizeSLongText(style = BasicButton.Size32.BgNo.ModeAccentFilled.style())
        }
    }

    @Test
    fun testButtonSize24BgNoModeAccentWhite() {
        composeTestRule.content {
            ButtonSizeXSNegative(style = BasicButton.Size24.BgNo.ModeAccentWhite.style())
        }
    }

    @Test
    fun testButtonSize48BgNoModeAccentGrey() {
        composeTestRule.content {
            ButtonSizeLWhite(style = BasicButton.Size48.BgNo.ModeAccentGrey.style())
        }
    }

    @Test
    fun testButtonSize48BgNoModeDangerTint() {
        composeTestRule.content {
            ButtonSizeXlDefault(style = BasicButton.Size48.BgNo.ModeDangerTint.style())
        }
    }

    @Test
    fun testButtonModeDangerTintClick() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.Size48.ModeDangerTint.style())
        }
        composeTestRule.onNodeWithText("Label").performTouchInput {
            down(center)
            advanceEventTime(1000)
        }
    }

    @Test
    fun testIconButtonSize48ModeAccentFilled() {
        composeTestRule.content {
            IconButtonLDefault(iconButtonStyle = IconButton.Size48.ModeAccentFilled.style())
        }
    }

    @Test
    fun testIconButtonSize40ModeAccentGrey() {
        composeTestRule.content {
            IconButtonMAccent(iconButtonStyle = IconButton.Size40.ModeAccentGrey.style())
        }
    }

    @Test
    fun testIconButtonSize32ModeDangerTint() {
        composeTestRule.content {
            IconButtonSWarning(iconButtonStyle = IconButton.Size32.ModeDangerTint.style())
        }
    }

    @Test
    fun testIconButtonSize24BgNoModeAccentFilled() {
        composeTestRule.content {
            IconButtonXsDark(iconButtonStyle = IconButton.Size24.BgNo.ModeAccentFilled.style())
        }
    }

    @Test
    fun testIconButtonIsLoading() {
        composeTestRule.content {
            IconButtonIsLoading(iconButtonStyle = IconButton.Size48.ModeAccentFilled.style())
        }
    }

    @Test
    fun testIconButtonDisabled() {
        composeTestRule.content {
            IconButtonLDisabled(iconButtonStyle = IconButton.Size48.ModeAccentFilled.style())
        }
    }

    @Test
    fun testIconButtonSize48BgNoModeAccentGrey() {
        composeTestRule.content {
            IconButtonLSecondary(iconButtonStyle = IconButton.Size48.BgNo.ModeAccentGrey.style())
        }
    }

    @Test
    fun testIconButtonSize40BgNoModeDangerTint() {
        composeTestRule.content {
            IconButtonMClear(iconButtonStyle = IconButton.Size40.BgNo.ModeDangerTint.style())
        }
    }
}
