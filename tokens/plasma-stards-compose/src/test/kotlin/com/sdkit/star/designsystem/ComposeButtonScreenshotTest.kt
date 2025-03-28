package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.button.ButtonSizeLDefault
import com.sdds.testing.compose.button.ButtonSizeLDisabled
import com.sdds.testing.compose.button.ButtonSizeLIsLoading
import com.sdds.testing.compose.button.ButtonSizeMAccent
import com.sdds.testing.compose.button.ButtonSizeMSpaceBetween
import com.sdds.testing.compose.button.ButtonSizeSLongText
import com.sdds.testing.compose.button.ButtonSizeSWarning
import com.sdds.testing.compose.button.ButtonSizeXSDark
import com.sdds.testing.compose.button.IconButtonIsLoading
import com.sdds.testing.compose.button.IconButtonLDefault
import com.sdds.testing.compose.button.IconButtonLDisabled
import com.sdds.testing.compose.button.IconButtonLSecondary
import com.sdds.testing.compose.button.IconButtonMAccent
import com.sdds.testing.compose.button.IconButtonSWarning
import com.sdds.testing.compose.button.IconButtonXsDark
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.button.basic.BasicButton
import com.sdkit.star.designsystem.styles.button.basic.L
import com.sdkit.star.designsystem.styles.button.basic.M
import com.sdkit.star.designsystem.styles.button.basic.S
import com.sdkit.star.designsystem.styles.button.basic.Xs
import com.sdkit.star.designsystem.styles.button.icon.IconButton
import com.sdkit.star.designsystem.styles.button.icon.L
import com.sdkit.star.designsystem.styles.button.icon.M
import com.sdkit.star.designsystem.styles.button.icon.Pilled
import com.sdkit.star.designsystem.styles.button.icon.S
import com.sdkit.star.designsystem.styles.button.icon.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeButtonScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testButtonSizeL() {
        composeTestRule.content {
            ButtonSizeLDefault(style = BasicButton.L.style())
        }
    }

    @Test
    fun testButtonSizeM() {
        composeTestRule.content {
            ButtonSizeMAccent(style = BasicButton.M.style())
        }
    }

    @Test
    fun testButtonSizeS() {
        composeTestRule.content {
            ButtonSizeSWarning(style = BasicButton.S.style())
        }
    }

    @Test
    fun testButtonSizeXS() {
        composeTestRule.content {
            ButtonSizeXSDark(style = BasicButton.Xs.style())
        }
    }

    @Test
    fun testButtonSizeLIsLoading() {
        composeTestRule.content {
            ButtonSizeLIsLoading(style = BasicButton.L.style())
        }
    }

    @Test
    fun testButtonSizeLDisabled() {
        composeTestRule.content {
            ButtonSizeLDisabled(style = BasicButton.L.style())
        }
    }

    @Test
    fun testButtonSizeMSpaceBetween() {
        composeTestRule.content {
            ButtonSizeMSpaceBetween(style = BasicButton.M.style())
        }
    }

    @Test
    fun testButtonSizeSLongText() {
        composeTestRule.content {
            ButtonSizeSLongText(style = BasicButton.S.style())
        }
    }

    @Test
    fun testIconButtonL() {
        composeTestRule.content {
            IconButtonLDefault(iconButtonStyle = IconButton.L.style())
        }
    }

    @Test
    fun testIconButtonM() {
        composeTestRule.content {
            IconButtonMAccent(iconButtonStyle = IconButton.M.style())
        }
    }

    @Test
    fun testIconButtonS() {
        composeTestRule.content {
            IconButtonSWarning(iconButtonStyle = IconButton.S.style())
        }
    }

    @Test
    fun testIconButtonXs() {
        composeTestRule.content {
            IconButtonXsDark(iconButtonStyle = IconButton.Xs.style())
        }
    }

    @Test
    fun testIconButtonLIsLoading() {
        composeTestRule.content {
            IconButtonIsLoading(iconButtonStyle = IconButton.L.style())
        }
    }

    @Test
    fun testIconButtonLDisabled() {
        composeTestRule.content {
            IconButtonLDisabled(iconButtonStyle = IconButton.L.style())
        }
    }

    @Test
    fun testIconButtonLPilled() {
        composeTestRule.content {
            IconButtonLSecondary(iconButtonStyle = IconButton.L.Pilled.style())
        }
    }
}
