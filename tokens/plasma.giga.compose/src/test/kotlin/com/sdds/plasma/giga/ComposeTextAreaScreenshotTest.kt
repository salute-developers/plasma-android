package com.sdds.plasma.giga

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.TextAreaClearLDefaultChipsInnerRequiredEnd
import com.sdds.compose.uikit.fixtures.testcases.TextAreaClearLErrorInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaClearMErrorInnerRequiredStart
import com.sdds.compose.uikit.fixtures.testcases.TextAreaClearMWarningRequiredStartInner
import com.sdds.compose.uikit.fixtures.testcases.TextAreaClearSDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaClearXsDefaultOuterRequireEndFocused
import com.sdds.compose.uikit.fixtures.testcases.TextAreaLDefaultInnerLeft
import com.sdds.compose.uikit.fixtures.testcases.TextAreaLDefaultTBTA
import com.sdds.compose.uikit.fixtures.testcases.TextAreaLDisabled
import com.sdds.compose.uikit.fixtures.testcases.TextAreaLReadOnly
import com.sdds.compose.uikit.fixtures.testcases.TextAreaMDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaMErrorOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaMInnerOptionalChips
import com.sdds.compose.uikit.fixtures.testcases.TextAreaMWarningInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSDefaultInnerRight
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSDefaultOuterRightChips
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSLongText
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSWarningInnerRight
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSWarningInnerRightFocused
import com.sdds.compose.uikit.fixtures.testcases.TextAreaXSDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaXlDefault
import com.sdds.compose.uikit.fixtures.testcases.TextAreaXsErrorInnerOptional
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.textarea.Default
import com.sdds.plasma.giga.styles.textarea.Error
import com.sdds.plasma.giga.styles.textarea.InnerLabel
import com.sdds.plasma.giga.styles.textarea.L
import com.sdds.plasma.giga.styles.textarea.M
import com.sdds.plasma.giga.styles.textarea.OuterLabel
import com.sdds.plasma.giga.styles.textarea.RequiredEnd
import com.sdds.plasma.giga.styles.textarea.RequiredStart
import com.sdds.plasma.giga.styles.textarea.S
import com.sdds.plasma.giga.styles.textarea.TextArea
import com.sdds.plasma.giga.styles.textarea.TextAreaClear
import com.sdds.plasma.giga.styles.textarea.Warning
import com.sdds.plasma.giga.styles.textarea.Xl
import com.sdds.plasma.giga.styles.textarea.Xs
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

    @Test
    fun testTextAreaXlDefault() {
        composeTestRule.content {
            TextAreaXlDefault(style = TextArea.Xl.Default.style())
        }
    }
}
