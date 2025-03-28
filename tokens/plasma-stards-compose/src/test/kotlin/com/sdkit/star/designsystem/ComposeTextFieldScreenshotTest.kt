package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.textfield.TextFieldClearLErrorInnerOptional
import com.sdds.testing.compose.textfield.TextFieldClearLErrorTBTA
import com.sdds.testing.compose.textfield.TextFieldClearMWarningInnerRequiredLeft
import com.sdds.testing.compose.textfield.TextFieldClearSDefaultOuterOptional
import com.sdds.testing.compose.textfield.TextFieldClearXSSuccessOuterRequiredRightFocused
import com.sdds.testing.compose.textfield.TextFieldLDisabled
import com.sdds.testing.compose.textfield.TextFieldLDisabledOuterLeft
import com.sdds.testing.compose.textfield.TextFieldLInputText
import com.sdds.testing.compose.textfield.TextFieldLSuffixPrefix
import com.sdds.testing.compose.textfield.TextFieldLSuffixPrefixCyrillic
import com.sdds.testing.compose.textfield.TextFieldLSuffixPrefixNoValue
import com.sdds.testing.compose.textfield.TextFieldMErrorOuterLabelOptional
import com.sdds.testing.compose.textfield.TextFieldMSuccessOuterLabel
import com.sdds.testing.compose.textfield.TextFieldMWarningInnerLabelOptional
import com.sdds.testing.compose.textfield.TextFieldSReadOnly
import com.sdds.testing.compose.textfield.TextFieldSWarningInnerLabelRightFocused
import com.sdds.testing.compose.textfield.TextFieldWarningInnerRight
import com.sdds.testing.compose.textfield.TextFieldXSErrorInner
import com.sdds.testing.compose.textfield.TextFieldXSSuccessOuterLabelOptional
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextField
import com.sdkit.star.designsystem.styles.textfield.Xs
import com.sdkit.star.designsystem.styles.textfield.clear.Default
import com.sdkit.star.designsystem.styles.textfield.clear.Error
import com.sdkit.star.designsystem.styles.textfield.clear.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.clear.M
import com.sdkit.star.designsystem.styles.textfield.clear.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.clear.S
import com.sdkit.star.designsystem.styles.textfield.clear.TextFieldClear
import com.sdkit.star.designsystem.styles.textfield.clear.Xs
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeTextFieldScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testTextFieldMOuterLabel() {
        composeTestRule.content {
            TextFieldMSuccessOuterLabel(style = TextField.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldSInnerLabel() {
        composeTestRule.content {
            TextFieldWarningInnerRight(style = TextField.S.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldXSErrorInner() {
        composeTestRule.content {
            TextFieldXSErrorInner(style = TextField.Xs.Error.style())
        }
    }

    @Test
    fun testTextFieldMInnerLabelOptional() {
        composeTestRule.content {
            TextFieldMWarningInnerLabelOptional(style = TextField.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldReadOnly() {
        composeTestRule.content {
            TextFieldSReadOnly(style = TextField.S.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldXSOuterLabelOptional() {
        composeTestRule.content {
            TextFieldXSSuccessOuterLabelOptional(style = TextField.Xs.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldDisabled() {
        composeTestRule.content {
            TextFieldLDisabled(style = TextField.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldMErrorOuterLabelOptional() {
        composeTestRule.content {
            TextFieldMErrorOuterLabelOptional(style = TextField.M.OuterLabel.Error.style())
        }
    }

    @Ignore("Посмотреть почему работает скейл при активейтед")
    @Test
    fun testTextFieldFocused() {
        composeTestRule.content {
            TextFieldSWarningInnerLabelRightFocused(style = TextField.S.InnerLabel.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("Value")
    }

    @Ignore("Посмотреть почему работает скейл при активейтед")
    @Test
    fun testTextFieldMInputText() {
        composeTestRule.content {
            TextFieldLInputText(style = TextField.M.InnerLabel.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldMSuffixPrefix() {
        composeTestRule.content {
            TextFieldLSuffixPrefix(style = TextField.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldClearMErrorInnerOptional() {
        composeTestRule.content {
            TextFieldClearLErrorInnerOptional(style = TextFieldClear.M.InnerLabel.Error.style())
        }
    }

    @Test
    fun testTextFieldClearMDefaultInnerLabel() {
        composeTestRule.content {
            TextFieldClearMWarningInnerRequiredLeft(style = TextFieldClear.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldClearSDefaultOuterOptional() {
        composeTestRule.content {
            TextFieldClearSDefaultOuterOptional(style = TextFieldClear.S.OuterLabel.Default.style())
        }
    }

    @Ignore("Посмотреть почему работает скейл при активейтед")
    @Test
    fun testTextFieldClearXSDefaultOuterLabelFocused() {
        composeTestRule.content {
            TextFieldClearXSSuccessOuterRequiredRightFocused(
                style = TextFieldClear.Xs.OuterLabel.Default.style(),
            )
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
    }

    @Test
    fun testTextFieldMSuffixPrefixCyrillic() {
        composeTestRule.content {
            TextFieldLSuffixPrefixCyrillic(style = TextField.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldMDisabledOuterLeft() {
        composeTestRule.content {
            TextFieldLDisabledOuterLeft(style = TextField.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldClearMErrorTBTA() {
        composeTestRule.content {
            TextFieldClearLErrorTBTA(style = TextFieldClear.M.Error.style())
        }
    }

    @Test
    fun testTextFieldTBTANoValue() {
        composeTestRule.content {
            TextFieldLSuffixPrefixNoValue(style = TextField.M.Default.style())
        }
    }
}
