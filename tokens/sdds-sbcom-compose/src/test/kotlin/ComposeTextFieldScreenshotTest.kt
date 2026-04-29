package com.sdds.sbcom

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TextFieldIconRight
import com.sdds.compose.uikit.fixtures.testcases.TextFieldIconRightDisabled
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
class ComposeTextFieldScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testTextFieldDefault() {
        composeTestRule.content {
            TextFieldIconRight(style = TextField.Default.style())
        }
    }

    @Test
    fun testTextFieldFocused() {
        composeTestRule.content {
            TextFieldIconRight(style = TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("Value")
    }

    @Test
    fun testTextFieldLongText() {
        composeTestRule.content {
            TextFieldIconRight(style = TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput(
                "Lorem Ipsum is simply dummy text of the printing and " +
                    "typesetting industry. Lorem Ipsum has been the industry's standard dummy " +
                    "text ever since the 1500s, when an unknown printer took a galley of type and " +
                    "scrambled it to make a type specimen book. It has survived not only five " +
                    "centuries, but also the leap into electronic typesetting, remaining " +
                    "essentially unchanged. It was popularised in the 1960s with the release " +
                    "of Letraset sheets containing Lorem Ipsum passages, and more recently " +
                    "with desktop publishing software like Aldus PageMaker including versions " +
                    "of Lorem Ipsum.",
            )
    }

    @Test
    fun testTextFieldLInputText() {
        composeTestRule.content {
            TextFieldIconRight(style = TextField.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("абвгдежзabcdefg@#643!#\$")
    }

    @Test
    fun testTextFieldLDisabled() {
        composeTestRule.content {
            TextFieldIconRightDisabled(style = TextField.Default.style())
        }
    }
}
