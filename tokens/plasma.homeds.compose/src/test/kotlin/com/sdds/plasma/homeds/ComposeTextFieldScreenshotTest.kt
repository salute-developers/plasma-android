package com.sdds.plasma.homeds

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDefaultInnerLeft
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLDisabled
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLInputText
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuccessRequiredLeftOuter
import com.sdds.compose.uikit.fixtures.testcases.TextFieldLSuffixPrefix
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
import com.sdds.plasma.homeds.styles.textfield.Default
import com.sdds.plasma.homeds.styles.textfield.Error
import com.sdds.plasma.homeds.styles.textfield.InnerLabel
import com.sdds.plasma.homeds.styles.textfield.L
import com.sdds.plasma.homeds.styles.textfield.M
import com.sdds.plasma.homeds.styles.textfield.RequiredEnd
import com.sdds.plasma.homeds.styles.textfield.RequiredStart
import com.sdds.plasma.homeds.styles.textfield.S
import com.sdds.plasma.homeds.styles.textfield.TextField
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
    fun testTextFieldMDefault() {
        composeTestRule.content {
            TextFieldMSuccessOuterLabel(style = TextField.M.Default.style())
        }
    }

    @Test
    fun testTextFieldSDefaultInnerRight() {
        composeTestRule.content {
            TextFieldWarningInnerRight(style = TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldSErrorInner() {
        composeTestRule.content {
            TextFieldXSErrorInner(style = TextField.S.Error.style())
        }
    }

    @Test
    fun testTextFieldLDefaultRequiredLeft() {
        composeTestRule.content {
            TextFieldLSuccessRequiredLeftOuter(style = TextField.L.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldMDefaultInnerLabelOptional() {
        composeTestRule.content {
            TextFieldMWarningInnerLabelOptional(style = TextField.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextFieldReadOnly() {
        composeTestRule.content {
            TextFieldSReadOnly(style = TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextFieldSDefault() {
        composeTestRule.content {
            TextFieldXSSuccessOuterLabelOptional(style = TextField.S.Default.style())
        }
    }

    @Test
    fun testTextFieldLDisabled() {
        composeTestRule.content {
            TextFieldLDisabled(style = TextField.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldMError() {
        composeTestRule.content {
            TextFieldMErrorOuterLabelOptional(style = TextField.M.Error.style())
        }
    }

    @Test
    fun testTextFieldFocused() {
        composeTestRule.content {
            TextFieldSWarningInnerLabelRightFocused(style = TextField.S.InnerLabel.RequiredEnd.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("Value")
    }

    @Test
    fun testTextFieldLInputText() {
        composeTestRule.content {
            TextFieldLInputText(style = TextField.L.InnerLabel.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldLSuffixPrefix() {
        composeTestRule.content {
            TextFieldLSuffixPrefix(style = TextField.L.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextFieldTBTANoValue() {
        composeTestRule.content {
            TextFieldLSuffixPrefixNoValue(style = TextField.L.Default.style())
        }
    }
}
