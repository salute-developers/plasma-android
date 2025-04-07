package com.sdds.stylessalute

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.textarea.Default
import com.sdds.stylessalute.styles.textarea.Error
import com.sdds.stylessalute.styles.textarea.InnerLabel
import com.sdds.stylessalute.styles.textarea.L
import com.sdds.stylessalute.styles.textarea.M
import com.sdds.stylessalute.styles.textarea.OuterLabel
import com.sdds.stylessalute.styles.textarea.RequiredEnd
import com.sdds.stylessalute.styles.textarea.RequiredStart
import com.sdds.stylessalute.styles.textarea.S
import com.sdds.stylessalute.styles.textarea.TextArea
import com.sdds.stylessalute.styles.textarea.TextAreaClear
import com.sdds.stylessalute.styles.textarea.Warning
import com.sdds.stylessalute.styles.textarea.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.textarea.TextAreaClearLDefaultChipsInnerRequiredEnd
import com.sdds.testing.compose.textarea.TextAreaClearLErrorInnerOptional
import com.sdds.testing.compose.textarea.TextAreaClearMErrorInnerRequiredStart
import com.sdds.testing.compose.textarea.TextAreaClearMWarningRequiredStartInner
import com.sdds.testing.compose.textarea.TextAreaClearSDefaultOuterOptional
import com.sdds.testing.compose.textarea.TextAreaClearXsDefaultOuterRequireEndFocused
import com.sdds.testing.compose.textarea.TextAreaLDefaultInnerLeft
import com.sdds.testing.compose.textarea.TextAreaLDefaultTBTA
import com.sdds.testing.compose.textarea.TextAreaLDisabled
import com.sdds.testing.compose.textarea.TextAreaLReadOnly
import com.sdds.testing.compose.textarea.TextAreaMDefaultOuterOptional
import com.sdds.testing.compose.textarea.TextAreaMErrorOuterOptional
import com.sdds.testing.compose.textarea.TextAreaMInnerOptionalChips
import com.sdds.testing.compose.textarea.TextAreaMWarningInnerOptional
import com.sdds.testing.compose.textarea.TextAreaSDefaultInnerRight
import com.sdds.testing.compose.textarea.TextAreaSDefaultOuterRightChips
import com.sdds.testing.compose.textarea.TextAreaSLongText
import com.sdds.testing.compose.textarea.TextAreaSWarningInnerRight
import com.sdds.testing.compose.textarea.TextAreaSWarningInnerRightFocused
import com.sdds.testing.compose.textarea.TextAreaXSDefaultOuterOptional
import com.sdds.testing.compose.textarea.TextAreaXsErrorInnerOptional
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTextAreaScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testTextAreaLDefaultInnerLeft() {
        composeTestRule.content {
            TextAreaLDefaultInnerLeft(style = TextArea.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextAreaMDefaultOuterOptional() {
        composeTestRule.content {
            TextAreaMDefaultOuterOptional(style = TextArea.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaSWarningInnerRight() {
        composeTestRule.content {
            TextAreaSWarningInnerRight(style = TextArea.S.InnerLabel.RequiredEnd.Warning.style())
        }
    }

    @Test
    fun testTextAreaXsErrorInnerOptional() {
        composeTestRule.content {
            TextAreaXsErrorInnerOptional(style = TextArea.Xs.Error.style())
        }
    }

    @Test
    fun testTextAreaLReadOnly() {
        composeTestRule.content {
            TextAreaLReadOnly(style = TextArea.L.OuterLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextAreaMWarningInnerOptional() {
        composeTestRule.content {
            TextAreaMWarningInnerOptional(style = TextArea.M.InnerLabel.Warning.style())
        }
    }

    @Test
    fun testTextAreaSDefaultInnerRight() {
        composeTestRule.content {
            TextAreaSDefaultInnerRight(style = TextArea.S.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextAreaXSDefaultOuterOptional() {
        composeTestRule.content {
            TextAreaXSDefaultOuterOptional(style = TextArea.Xs.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaDisabled() {
        composeTestRule.content {
            TextAreaLDisabled(style = TextArea.L.InnerLabel.RequiredStart.Default.style())
        }
    }

    @Test
    fun testTextAreaMErrorOuterOptional() {
        composeTestRule.content {
            TextAreaMErrorOuterOptional(style = TextArea.M.OuterLabel.Error.style())
        }
    }

    @Test
    fun testTextAreaSWarningInnerRightFocused() {
        composeTestRule.content {
            TextAreaSWarningInnerRightFocused(style = TextArea.S.InnerLabel.RequiredEnd.Warning.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testTextAreaMInnerOptionalChips() {
        composeTestRule.content {
            TextAreaMInnerOptionalChips(style = TextArea.M.Default.style())
        }
    }

    @Test
    fun testTextAreaSDefaultOuterRightChips() {
        composeTestRule.content {
            TextAreaSDefaultOuterRightChips(style = TextArea.S.OuterLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextAreaSLongText() {
        composeTestRule.content {
            TextAreaSLongText(style = TextArea.S.InnerLabel.Warning.style())
        }
    }

    @Test
    fun testTextAreaLDefaultTBTA() {
        composeTestRule.content {
            TextAreaLDefaultTBTA(style = TextArea.L.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextAreaClearLErrorInnerOptional() {
        composeTestRule.content {
            TextAreaClearLErrorInnerOptional(style = TextAreaClear.L.InnerLabel.Error.style())
        }
    }

    @Test
    fun testTextAreaClearMWarningRequiredStartInner() {
        composeTestRule.content {
            TextAreaClearMWarningRequiredStartInner(style = TextAreaClear.M.InnerLabel.RequiredStart.Warning.style())
        }
    }

    @Test
    fun testTextAreaClearSDefaultOuterOptional() {
        composeTestRule.content {
            TextAreaClearSDefaultOuterOptional(style = TextAreaClear.S.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaClearXsDefaultOuterRequireEndFocused() {
        composeTestRule.content {
            TextAreaClearXsDefaultOuterRequireEndFocused(
                style = TextAreaClear.Xs.OuterLabel.RequiredEnd.Default.style(),
            )
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("Value")
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testTextAreaClearLDefaultChipsInnerRequiredEnd() {
        composeTestRule.content {
            TextAreaClearLDefaultChipsInnerRequiredEnd(style = TextAreaClear.L.InnerLabel.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testTextAreaClearMErrorInnerRequiredStart() {
        composeTestRule.content {
            TextAreaClearMErrorInnerRequiredStart(style = TextAreaClear.M.InnerLabel.RequiredStart.Error.style())
        }
    }
}
