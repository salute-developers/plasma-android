package com.sdds.finai

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLDefaultInnerRequiredRight
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLErrorInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLErrorTBTA
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearMErrorInnerRequiredLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearMWarningInnerRequiredLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearSDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearXSSuccessOuterRequiredRightFocused
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDefaultInnerLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabled
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabledOuterLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLInputText
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuccessRequiredLeftOuter
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefix
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefixCyrillic
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefixNoValue
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMErrorOuterLabelOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMSuccessInnerLabelChips
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMSuccessOuterLabel
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMWarningInnerLabelOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSOuterLabelRightChips
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSReadOnly
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSWarningInnerLabelRightFocused
import com.sdds.compose.uikit.fixtures.testcases.TextFieldWarningInnerRight
import com.sdds.compose.uikit.fixtures.testcases.TextFieldXSErrorInner
import com.sdds.compose.uikit.fixtures.testcases.TextFieldXSSuccessOuterLabelOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldXlDefault
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.textfield.Default
import com.sdds.finai.styles.textfield.Error
import com.sdds.finai.styles.textfield.InnerLabel
import com.sdds.finai.styles.textfield.OuterLabel
import com.sdds.finai.styles.textfield.RequiredEnd
import com.sdds.finai.styles.textfield.S
import com.sdds.finai.styles.textfield.Success
import com.sdds.finai.styles.textfield.TextField
import com.sdds.finai.styles.textfield.TextFieldClear
import com.sdds.finai.styles.textfield.Warning
import com.sdds.finai.styles.textfield.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTextFieldScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testTextFieldLDefaultInnerEnd() {
        composeTestRule.content {
            TextFieldLDefaultInnerLeft(style = TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldSSuccessOuterLabel() {
        composeTestRule.content {
            TextFieldMSuccessOuterLabel(style = TextField.S.OuterLabel.Success.style())
        }
    }

    @Test
    fun testTextFieldSWarningInnerRight() {
        composeTestRule.content {
            TextFieldWarningInnerRight(style = TextField.S.InnerLabel.RequiredEnd.Warning.style())
        }
    }

    @Test
    fun testTextFieldXSErrorInner() {
        composeTestRule.content {
            TextFieldXSErrorInner(style = TextField.Xs.Error.style())
        }
    }

    @Test
    fun testTextFieldSSuccessRequiredEndOuter() {
        composeTestRule.content {
            TextFieldLSuccessRequiredLeftOuter(style = TextField.S.OuterLabel.RequiredEnd.Success.style())
        }
    }

    @Test
    fun testTextFieldSWarningInnerLabelOptional() {
        composeTestRule.content {
            TextFieldMWarningInnerLabelOptional(style = TextField.S.InnerLabel.Warning.style())
        }
    }

    @Test
    fun testTextFieldReadOnly() {
        composeTestRule.content {
            TextFieldSReadOnly(style = TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldXSSuccessOuterLabelOptional() {
        composeTestRule.content {
            TextFieldXSSuccessOuterLabelOptional(style = TextField.Xs.OuterLabel.Success.style())
        }
    }

    @Test
    fun testTextFieldLDisabled() {
        composeTestRule.content {
            TextFieldLDisabled(style = TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldMErrorOuterLabelOptional() {
        composeTestRule.content {
            TextFieldMErrorOuterLabelOptional(style = TextField.S.OuterLabel.Error.style())
        }
    }

    @Test
    fun testTextFieldFocused() {
        composeTestRule.content {
            TextFieldSWarningInnerLabelRightFocused(style = TextField.S.InnerLabel.RequiredEnd.Warning.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("Value")
    }

    @Test
    fun testTextFieldMSuccessInnerLabelChips() {
        composeTestRule.content {
            TextFieldMSuccessInnerLabelChips(style = TextField.S.InnerLabel.Success.style())
        }
    }

    @Test
    fun testTextFieldSOuterLabelRightChips() {
        composeTestRule.content {
            TextFieldSOuterLabelRightChips(style = TextField.S.OuterLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldSInputText() {
        composeTestRule.content {
            TextFieldLInputText(style = TextField.S.InnerLabel.Warning.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldSSuffixPrefix() {
        composeTestRule.content {
            TextFieldLSuffixPrefix(style = TextField.S.OuterLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldClearSErrorInnerOptional() {
        composeTestRule.content {
            TextFieldClearLErrorInnerOptional(style = TextFieldClear.S.InnerLabel.Error.style())
        }
    }

    @Test
    fun testTextFieldClearSWarningInnerRequiredLeft() {
        composeTestRule.content {
            TextFieldClearMWarningInnerRequiredLeft(style = TextFieldClear.S.InnerLabel.RequiredEnd.Warning.style())
        }
    }

    @Test
    fun testTextFieldClearSDefaultOuterOptional() {
        composeTestRule.content {
            TextFieldClearSDefaultOuterOptional(style = TextFieldClear.S.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldClearXSSuccessOuterRequiredRightFocused() {
        composeTestRule.content {
            TextFieldClearXSSuccessOuterRequiredRightFocused(
                style = TextFieldClear.Xs.OuterLabel.RequiredEnd.Success.style(),
            )
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
    }

    @Test
    fun testTextFieldClearSDefaultInnerRequiredRight() {
        composeTestRule.content {
            TextFieldClearLDefaultInnerRequiredRight(style = TextFieldClear.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldClearSErrorInnerRequiredLeft() {
        composeTestRule.content {
            TextFieldClearMErrorInnerRequiredLeft(style = TextFieldClear.S.InnerLabel.RequiredEnd.Error.style())
        }
    }

    @Test
    fun testTextFieldSSuffixPrefixCyrillic() {
        composeTestRule.content {
            TextFieldLSuffixPrefixCyrillic(style = TextField.S.OuterLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldSDisabledOuterLeft() {
        composeTestRule.content {
            TextFieldLDisabledOuterLeft(style = TextField.S.OuterLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldClearSErrorTBTA() {
        composeTestRule.content {
            TextFieldClearLErrorTBTA(style = TextFieldClear.S.RequiredEnd.Error.style())
        }
    }

    @Test
    fun testTextFieldTBTANoValue() {
        composeTestRule.content {
            TextFieldLSuffixPrefixNoValue(style = TextField.S.Default.style())
        }
    }

    @Test
    fun testTextFieldSDefault() {
        composeTestRule.content {
            TextFieldXlDefault(style = TextField.S.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldClearSDefault() {
        composeTestRule.content {
            TextFieldXlDefault(style = TextFieldClear.S.Default.style())
        }
    }
}
