package com.sdkit.star.designsystem

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
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
import com.sdds.compose.uikit.fixtures.testcases.TextAreaMWarningInnerOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSLongText
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSWarningInnerRight
import com.sdds.compose.uikit.fixtures.testcases.TextAreaSWarningInnerRightFocused
import com.sdds.compose.uikit.fixtures.testcases.TextAreaXSDefaultOuterOptional
import com.sdds.compose.uikit.fixtures.testcases.TextAreaXsErrorInnerOptional
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.textarea.Default
import com.sdkit.star.designsystem.styles.textarea.Error
import com.sdkit.star.designsystem.styles.textarea.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextArea
import com.sdkit.star.designsystem.styles.textarea.TextAreaClear
import com.sdkit.star.designsystem.styles.textarea.Xs
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeTextAreaScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testTextAreaMDefaultInnerLabel() {
        composeTestRule.content {
            TextAreaLDefaultInnerLeft(style = TextArea.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaMDefaultOuterOptional() {
        composeTestRule.content {
            TextAreaMDefaultOuterOptional(style = TextArea.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaSDefaultInnerLabel() {
        composeTestRule.content {
            TextAreaSWarningInnerRight(style = TextArea.S.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaXsErrorInnerOptional() {
        composeTestRule.content {
            TextAreaXsErrorInnerOptional(style = TextArea.Xs.Error.style())
        }
    }

    @Test
    fun testTextAreaMReadOnly() {
        composeTestRule.content {
            TextAreaLReadOnly(style = TextArea.M.OuterLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaMDefaultInnerOptional() {
        composeTestRule.content {
            TextAreaMWarningInnerOptional(style = TextArea.M.InnerLabel.Default.style())
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
            TextAreaLDisabled(style = TextArea.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaMErrorOuterOptional() {
        composeTestRule.content {
            TextAreaMErrorOuterOptional(style = TextArea.M.OuterLabel.Error.style())
        }
    }

    @Ignore("Посмотреть почему работает скейл при активейтед")
    @Test
    fun testTextAreaSDefaultInnerLabelFocused() {
        composeTestRule.content {
            TextAreaSWarningInnerRightFocused(style = TextArea.S.InnerLabel.Default.style())
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testTextAreaSLongText() {
        composeTestRule.content {
            TextAreaSLongText(style = TextArea.S.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaMDefaultTBTA() {
        composeTestRule.content {
            TextAreaLDefaultTBTA(style = TextArea.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaClearMErrorInnerOptional() {
        composeTestRule.content {
            TextAreaClearLErrorInnerOptional(style = TextAreaClear.M.InnerLabel.Error.style())
        }
    }

    @Test
    fun testTextAreaClearMDefault() {
        composeTestRule.content {
            TextAreaClearMWarningRequiredStartInner(style = TextAreaClear.M.InnerLabel.Default.style())
        }
    }

    @Test
    fun testTextAreaClearSDefaultOuterOptional() {
        composeTestRule.content {
            TextAreaClearSDefaultOuterOptional(style = TextAreaClear.S.OuterLabel.Default.style())
        }
    }

    @Ignore("Поправить скейл при активейтед")
    @Test
    fun testTextAreaClearXsDefaultOuterLabelFocused() {
        composeTestRule.content {
            TextAreaClearXsDefaultOuterRequireEndFocused(
                style = TextAreaClear.Xs.OuterLabel.Default.style(),
            )
        }
        composeTestRule.onNodeWithTag("textField")
            .performClick()
            .performTextInput("Value")
        composeTestRule.mainClock.advanceTimeByFrame()
    }

    @Test
    fun testTextAreaClearMErrorInnerLabel() {
        composeTestRule.content {
            TextAreaClearMErrorInnerRequiredStart(style = TextAreaClear.M.InnerLabel.Error.style())
        }
    }
}
