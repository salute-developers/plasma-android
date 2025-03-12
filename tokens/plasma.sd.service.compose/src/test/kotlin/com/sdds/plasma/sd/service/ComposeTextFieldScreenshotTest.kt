package com.sdds.plasma.sd.service

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
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
import com.sdds.plasma.sd.service.styles.textfield.Warning
import com.sdds.plasma.sd.service.styles.textfield.Xl
import com.sdds.plasma.sd.service.styles.textfield.Xs
import com.sdds.plasma.sd.service.styles.textfield.clear.Default
import com.sdds.plasma.sd.service.styles.textfield.clear.Error
import com.sdds.plasma.sd.service.styles.textfield.clear.InnerLabel
import com.sdds.plasma.sd.service.styles.textfield.clear.L
import com.sdds.plasma.sd.service.styles.textfield.clear.M
import com.sdds.plasma.sd.service.styles.textfield.clear.OuterLabel
import com.sdds.plasma.sd.service.styles.textfield.clear.RequiredEnd
import com.sdds.plasma.sd.service.styles.textfield.clear.RequiredStart
import com.sdds.plasma.sd.service.styles.textfield.clear.S
import com.sdds.plasma.sd.service.styles.textfield.clear.Success
import com.sdds.plasma.sd.service.styles.textfield.clear.Warning
import com.sdds.plasma.sd.service.styles.textfield.clear.Xl
import com.sdds.plasma.sd.service.styles.textfield.clear.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.textfield.TextFieldClearLDefaultInnerRequiredRight
import com.sdds.testing.compose.textfield.TextFieldClearLErrorInnerOptional
import com.sdds.testing.compose.textfield.TextFieldClearLErrorTBTA
import com.sdds.testing.compose.textfield.TextFieldClearMErrorInnerRequiredLeft
import com.sdds.testing.compose.textfield.TextFieldClearMWarningInnerRequiredLeft
import com.sdds.testing.compose.textfield.TextFieldClearSDefaultOuterOptional
import com.sdds.testing.compose.textfield.TextFieldClearXSSuccessOuterRequiredRightFocused
import com.sdds.testing.compose.textfield.TextFieldLDefaultInnerLeft
import com.sdds.testing.compose.textfield.TextFieldLDisabled
import com.sdds.testing.compose.textfield.TextFieldLDisabledOuterLeft
import com.sdds.testing.compose.textfield.TextFieldLInputText
import com.sdds.testing.compose.textfield.TextFieldLSuccessRequiredLeftOuter
import com.sdds.testing.compose.textfield.TextFieldLSuffixPrefix
import com.sdds.testing.compose.textfield.TextFieldLSuffixPrefixCyrillic
import com.sdds.testing.compose.textfield.TextFieldLSuffixPrefixNoValue
import com.sdds.testing.compose.textfield.TextFieldMErrorOuterLabelOptional
import com.sdds.testing.compose.textfield.TextFieldMSuccessInnerLabelChips
import com.sdds.testing.compose.textfield.TextFieldMSuccessOuterLabel
import com.sdds.testing.compose.textfield.TextFieldMWarningInnerLabelOptional
import com.sdds.testing.compose.textfield.TextFieldSOuterLabelRightChips
import com.sdds.testing.compose.textfield.TextFieldSReadOnly
import com.sdds.testing.compose.textfield.TextFieldSWarningInnerLabelRightFocused
import com.sdds.testing.compose.textfield.TextFieldWarningInnerRight
import com.sdds.testing.compose.textfield.TextFieldXSErrorInner
import com.sdds.testing.compose.textfield.TextFieldXSSuccessOuterLabelOptional
import com.sdds.testing.compose.textfield.TextFieldXlDefault
import com.sdds.testing.vs.SDK_NUMBER
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
