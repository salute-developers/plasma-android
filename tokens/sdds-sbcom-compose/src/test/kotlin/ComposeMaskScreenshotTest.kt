package com.sdds.sbcom

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.MaskDisabledIconAction
import com.sdds.compose.uikit.fixtures.testcases.MaskLongDateAlwaysIconAction
import com.sdds.compose.uikit.fixtures.testcases.MaskNumberIconAction
import com.sdds.compose.uikit.fixtures.testcases.MaskPhoneOnInput
import com.sdds.compose.uikit.fixtures.testcases.MaskPhoneType
import com.sdds.compose.uikit.fixtures.testcases.MaskReadOnlyIconAction
import com.sdds.compose.uikit.fixtures.testcases.MaskShortDateAlwaysIconAction
import com.sdds.compose.uikit.fixtures.testcases.MaskTimeAlwaysIcon
import com.sdds.compose.uikit.fixtures.testcases.MaskTimeIconAction
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.TextField
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeMaskScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testMaskDisabledIconAction() {
        composeTestRule.content {
            MaskDisabledIconAction(TextField.Default.style())
        }
    }

    @Test
    fun testMaskReadOnlyIconAction() {
        composeTestRule.content {
            MaskReadOnlyIconAction(TextField.Default.style())
        }
    }

    @Test
    fun testMaskTimeAlwaysIconAction() {
        composeTestRule.content {
            MaskTimeAlwaysIcon(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performClick()
    }

    @Test
    fun testMaskPhoneOnInput() {
        composeTestRule.content {
            MaskPhoneOnInput(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performClick()
            .performTextInput("9")
    }

    @Test
    fun testMaskTypeLetterInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performClick()
            .performTextInput("a0")
    }

    @Test
    fun testMaskTypeNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performClick()
            .performTextInput("7")
    }

    @Test
    fun testMaskTypeAnyOtherNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performTextInput("495")
    }

    @Test
    fun testMaskDeleteNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("495")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextClearance()
    }

    @Test
    fun testMaskInputFullNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1234567890")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("a")
    }

    @Test
    fun testMaskInputLetterAndNumbersInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("!w123ф%е45")
    }

    @Test
    fun testMaskInputPartiallyFilledNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("123456")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("!w123ф%е45")
    }

    @Test
    fun testMaskInputFullyFilledNumberInTelephone() {
        val pasteText = "!w123ф%е45"
        composeTestRule.content {
            MaskPhoneType(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1234567890")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput(pasteText)
    }

    @Test
    fun testMaskShortDateInput() {
        composeTestRule.content {
            MaskShortDateAlwaysIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("121212")
    }

    @Test
    fun testMaskShortDateInputNotFull() {
        composeTestRule.content {
            MaskShortDateAlwaysIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1212")
    }

    @Test
    fun testMaskFullDateInput() {
        composeTestRule.content {
            MaskLongDateAlwaysIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("12122012")
    }

    @Test
    fun testMaskTimeInput() {
        composeTestRule.content {
            MaskTimeIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1234")
    }

    @Test
    fun testMaskTimeInputStartWithZero() {
        composeTestRule.content {
            MaskTimeIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("0830")
    }

    @Test
    fun testMaskTimeInputMaxNumber() {
        composeTestRule.content {
            MaskTimeIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("9999")
    }

    @Test
    fun testMaskTimeInputWithLetter() {
        val pasteText = "12a34"
        composeTestRule.content {
            MaskTimeIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput(pasteText)
    }

    @Test
    fun testMaskNumberInput() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("12345,00")
    }

    @Test
    fun testMaskNumberInputMaxNumber() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("999999999999999999,99999")
    }

    @Test
    fun testMaskNumberInputOneNumber() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1")
    }

    @Test
    fun testMaskNumberInputSymbolsAndLetters() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("!w123ф%е45")
    }
}
