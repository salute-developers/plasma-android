package com.sdds.plasma.homeds

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textfield.Default
import com.sdds.plasma.homeds.styles.textfield.Error
import com.sdds.plasma.homeds.styles.textfield.InnerLabel
import com.sdds.plasma.homeds.styles.textfield.L
import com.sdds.plasma.homeds.styles.textfield.M
import com.sdds.plasma.homeds.styles.textfield.RequiredEnd
import com.sdds.plasma.homeds.styles.textfield.RequiredStart
import com.sdds.plasma.homeds.styles.textfield.S
import com.sdds.plasma.homeds.styles.textfield.TextField
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.mask.MaskDisabledIconAction
import com.sdds.testing.compose.mask.MaskLongDateAlwaysIconAction
import com.sdds.testing.compose.mask.MaskNumberAlwaysAction
import com.sdds.testing.compose.mask.MaskNumberIconAction
import com.sdds.testing.compose.mask.MaskPhoneDisplayAlwaysPlaceholder
import com.sdds.testing.compose.mask.MaskPhoneOnInput
import com.sdds.testing.compose.mask.MaskPhoneType
import com.sdds.testing.compose.mask.MaskReadOnlyIconAction
import com.sdds.testing.compose.mask.MaskShortDateAlwaysIconAction
import com.sdds.testing.compose.mask.MaskTimeAlwaysIcon
import com.sdds.testing.compose.mask.MaskTimeAlwaysTBTA
import com.sdds.testing.compose.mask.MaskTimeIconAction
import com.sdds.testing.vs.SDK_NUMBER
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
    fun testMaskLDefaultPhoneDisplayAlwaysPlaceholder() {
        composeTestRule.content {
            MaskPhoneDisplayAlwaysPlaceholder(TextField.L.Default.style())
        }
    }

    @Test
    fun testMaskMDefaultPhoneDisplayAlwaysPlaceholder() {
        composeTestRule.content {
            MaskPhoneDisplayAlwaysPlaceholder(TextField.M.Default.style())
        }
    }

    @Test
    fun testMaskSWarningRequiredRightPhoneDisplayAlwaysPlaceholder() {
        composeTestRule.content {
            MaskPhoneDisplayAlwaysPlaceholder(TextField.S.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testMaskXsErrorRequiredLeftPhoneDisplayAlwaysPlaceholder() {
        composeTestRule.content {
            MaskPhoneDisplayAlwaysPlaceholder(TextField.S.RequiredStart.Error.style())
        }
    }

    @Test
    fun testMaskDisabledIconAction() {
        composeTestRule.content {
            MaskDisabledIconAction(TextField.L.Default.style())
        }
    }

    @Test
    fun testMaskReadOnlyIconAction() {
        composeTestRule.content {
            MaskReadOnlyIconAction(TextField.L.Default.style())
        }
    }

    @Test
    fun testMaskLDefaultShortDateAlwaysIconAction() {
        composeTestRule.content {
            MaskShortDateAlwaysIconAction(TextField.L.Default.style())
        }
    }

    @Test
    fun testMaskLDefaultRequiredLeftInnerTimeAlwaysIconAction() {
        composeTestRule.content {
            MaskTimeAlwaysIcon(TextField.L.InnerLabel.RequiredStart.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performClick()
    }

    @Test
    fun testMaskMDefaultRequiredRightOuterNumberAlwaysAction() {
        composeTestRule.content {
            MaskNumberAlwaysAction(TextField.M.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testMaskSErrorTimeAlwaysTBTA() {
        composeTestRule.content {
            MaskTimeAlwaysTBTA(TextField.S.Error.style())
        }
    }

    @Test
    fun testMaskLDefaultRequiredLeftPhoneOnInput() {
        composeTestRule.content {
            MaskPhoneOnInput(TextField.L.RequiredStart.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performClick()
            .performTextInput("9")
    }

    @Test
    fun testMaskTypeLetterInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performClick()
            .performTextInput("a0")
    }

    @Test
    fun testMaskTypeNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performClick()
            .performTextInput("7")
    }

    @Test
    fun testMaskTypeAnyOtherNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField")
            .performTextInput("495")
    }

    @Test
    fun testMaskDeleteNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("495")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextClearance()
    }

    @Test
    fun testMaskInputFullNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1234567890")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("a")
    }

    @Test
    fun testMaskInputLetterAndNumbersInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("!w123ф%е45")
    }

    @Test
    fun testMaskInputPartiallyFilledNumberInTelephone() {
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("123456")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("!w123ф%е45")
    }

    @Test
    fun testMaskInputFullyFilledNumberInTelephone() {
        val pasteText = "!w123ф%е45"
        composeTestRule.content {
            MaskPhoneType(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1234567890")
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput(pasteText)
    }

    @Test
    fun testMaskShortDateInput() {
        composeTestRule.content {
            MaskShortDateAlwaysIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("121212")
    }

    @Test
    fun testMaskShortDateInputNotFull() {
        composeTestRule.content {
            MaskShortDateAlwaysIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1212")
    }

    @Test
    fun testMaskFullDateInput() {
        composeTestRule.content {
            MaskLongDateAlwaysIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("12122012")
    }

    @Test
    fun testMaskTimeInput() {
        composeTestRule.content {
            MaskTimeIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1234")
    }

    @Test
    fun testMaskTimeInputStartWithZero() {
        composeTestRule.content {
            MaskTimeIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("0830")
    }

    @Test
    fun testMaskTimeInputMaxNumber() {
        composeTestRule.content {
            MaskTimeIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("9999")
    }

    @Test
    fun testMaskTimeInputWithLetter() {
        val pasteText = "12a34"
        composeTestRule.content {
            MaskTimeIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput(pasteText)
    }

    @Test
    fun testMaskNumberInput() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("12345,00")
    }

    @Test
    fun testMaskNumberInputMaxNumber() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("999999999999999999,99999")
    }

    @Test
    fun testMaskNumberInputOneNumber() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("1")
    }

    @Test
    fun testMaskNumberInputSymbolsAndLetters() {
        composeTestRule.content {
            MaskNumberIconAction(TextField.L.Default.style())
        }
        composeTestRule.onNodeWithTag("MaskedTextField").performTextInput("!w123ф%е45")
    }
}
