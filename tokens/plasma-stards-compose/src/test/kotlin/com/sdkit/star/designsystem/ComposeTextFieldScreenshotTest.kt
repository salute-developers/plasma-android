package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLErrorInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearLErrorTBTA
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearMWarningInnerRequiredLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearSDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldClearXSSuccessOuterRequiredRightFocused
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabled
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabledOuterLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLInputText
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefix
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefixCyrillic
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefixNoValue
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMErrorOuterLabelOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMSuccessOuterLabel
import com.sdds.compose.uikit.fixtures.testcases.TextFieldMWarningInnerLabelOptional
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSReadOnly
import com.sdds.compose.uikit.fixtures.testcases.TextFieldSWarningInnerLabelRightFocused
import com.sdds.compose.uikit.fixtures.testcases.TextFieldWarningInnerRight
import com.sdds.compose.uikit.fixtures.testcases.TextFieldXSErrorInner
import com.sdds.compose.uikit.fixtures.testcases.TextFieldXSSuccessOuterLabelOptional
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextField
import com.sdkit.star.designsystem.styles.textfield.TextFieldClear
import com.sdkit.star.designsystem.styles.textfield.Xs
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
