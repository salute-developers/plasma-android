package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLDisabled
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeLIsLoading
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMAccent
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeMSpaceBetween
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeSLongText
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeSWarning
import com.sdds.compose.uikit.fixtures.testcases.ButtonSizeXSDark
import com.sdds.compose.uikit.fixtures.testcases.IconButtonIsLoading
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLDefault
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLDisabled
import com.sdds.compose.uikit.fixtures.testcases.IconButtonLSecondary
import com.sdds.compose.uikit.fixtures.testcases.IconButtonMAccent
import com.sdds.compose.uikit.fixtures.testcases.IconButtonSWarning
import com.sdds.compose.uikit.fixtures.testcases.IconButtonXsDark
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.basicbutton.S
import com.sdkit.star.designsystem.styles.basicbutton.Xs
import com.sdkit.star.designsystem.styles.iconbutton.IconButton
import com.sdkit.star.designsystem.styles.iconbutton.L
import com.sdkit.star.designsystem.styles.iconbutton.M
import com.sdkit.star.designsystem.styles.iconbutton.Pilled
import com.sdkit.star.designsystem.styles.iconbutton.S
import com.sdkit.star.designsystem.styles.iconbutton.Xs
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
