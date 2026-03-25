package com.sdds.plasma.sd.service

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
import com.sdds.plasma.sd.service.styles.textfield.Default
import com.sdds.plasma.sd.service.styles.textfield.Error
import com.sdds.plasma.sd.service.styles.textfield.InnerLabel
import com.sdds.plasma.sd.service.styles.textfield.L
import com.sdds.plasma.sd.service.styles.textfield.M
import com.sdds.plasma.sd.service.styles.textfield.OuterLabel
import com.sdds.plasma.sd.service.styles.textfield.RequiredEnd
import com.sdds.plasma.sd.service.styles.textfield.RequiredStart
import com.sdds.plasma.sd.service.styles.textfield.S
import com.sdds.plasma.sd.service.styles.textfield.Success
import com.sdds.plasma.sd.service.styles.textfield.TextField
import com.sdds.plasma.sd.service.styles.textfield.TextFieldClear
import com.sdds.plasma.sd.service.styles.textfield.Warning
import com.sdds.plasma.sd.service.styles.textfield.Xl
import com.sdds.plasma.sd.service.styles.textfield.Xs
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
    fun testTextFieldLDefaultInnerLeft() {
        composeTestRule.content {
            TextFieldLDefaultInnerLeft(style = TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldMSuccessOuterLabel() {
        composeTestRule.content {
            TextFieldMSuccessOuterLabel(style = TextField.M.OuterLabel.Success.style())
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
    fun testTextFieldLSuccessRequiredLeftOuter() {
        composeTestRule.content {
            TextFieldLSuccessRequiredLeftOuter(style = TextField.L.OuterLabel.RequiredStart.Success.style())
        }
    }

    @Test
    fun testTextFieldMWarningInnerLabelOptional() {
        composeTestRule.content {
            TextFieldMWarningInnerLabelOptional(style = TextField.M.InnerLabel.Warning.style())
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
            TextFieldLDisabled(style = TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldMErrorOuterLabelOptional() {
        composeTestRule.content {
            TextFieldMErrorOuterLabelOptional(style = TextField.M.OuterLabel.Error.style())
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
            TextFieldMSuccessInnerLabelChips(style = TextField.M.InnerLabel.Success.style())
        }
    }

    @Test
    fun testTextFieldSOuterLabelRightChips() {
        composeTestRule.content {
            TextFieldSOuterLabelRightChips(style = TextField.S.OuterLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldLInputText() {
        composeTestRule.content {
            TextFieldLInputText(style = TextField.L.InnerLabel.Warning.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldLSuffixPrefix() {
        composeTestRule.content {
            TextFieldLSuffixPrefix(style = TextField.L.OuterLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldClearLErrorInnerOptional() {
        composeTestRule.content {
            TextFieldClearLErrorInnerOptional(style = TextFieldClear.L.InnerLabel.Error.style())
        }
    }

    @Test
    fun testTextFieldClearMWarningInnerRequiredLeft() {
        composeTestRule.content {
            TextFieldClearMWarningInnerRequiredLeft(style = TextFieldClear.M.InnerLabel.RequiredStart.Warning.style())
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
    fun testTextFieldClearLDefaultInnerRequiredRight() {
        composeTestRule.content {
            TextFieldClearLDefaultInnerRequiredRight(style = TextFieldClear.L.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldClearMErrorInnerRequiredLeft() {
        composeTestRule.content {
            TextFieldClearMErrorInnerRequiredLeft(style = TextFieldClear.M.InnerLabel.RequiredStart.Error.style())
        }
    }

    @Test
    fun testTextFieldLSuffixPrefixCyrillic() {
        composeTestRule.content {
            TextFieldLSuffixPrefixCyrillic(style = TextField.L.OuterLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldLDisabledOuterLeft() {
        composeTestRule.content {
            TextFieldLDisabledOuterLeft(style = TextField.L.OuterLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldClearLErrorTBTA() {
        composeTestRule.content {
            TextFieldClearLErrorTBTA(style = TextFieldClear.L.RequiredStart.Error.style())
        }
    }

    @Test
    fun testTextFieldTBTANoValue() {
        composeTestRule.content {
            TextFieldLSuffixPrefixNoValue(style = TextField.L.Default.style())
        }
    }

    @Test
    fun testTextFieldXlDefault() {
        composeTestRule.content {
            TextFieldXlDefault(style = TextField.Xl.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldClearXlDefault() {
        composeTestRule.content {
            TextFieldXlDefault(style = TextFieldClear.Xl.Default.style())
        }
    }
}
