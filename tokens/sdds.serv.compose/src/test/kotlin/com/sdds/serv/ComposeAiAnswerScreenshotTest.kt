package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AiAnswerErrorState
import com.sdds.compose.uikit.fixtures.testcases.AiAnswerHasActionsStartEnd
import com.sdds.compose.uikit.fixtures.testcases.AiAnswerHasActionsStartEndSuggestions
import com.sdds.compose.uikit.fixtures.testcases.AiAnswerLoadingState
import com.sdds.compose.uikit.fixtures.testcases.AiAnswerLongTitleHasActionsStartHasSuggestions
import com.sdds.compose.uikit.fixtures.testcases.AiAnswerNoTitleHasActionsEndHasSuggestions
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.aianswer.AiAnswer
import com.sdds.serv.styles.aianswer.L
import com.sdds.serv.styles.aianswer.M
import com.sdds.serv.styles.aianswer.S
import com.sdds.serv.styles.aianswer.Xl
import com.sdds.serv.styles.aianswer.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAiAnswerScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAiAnswerXlHasActionsStartEndSuggestions() {
        composeTestRule.content {
            AiAnswerHasActionsStartEndSuggestions(AiAnswer.Xl.style())
        }
    }

    @Test
    fun testAiAnswerLError() {
        composeTestRule.content {
            AiAnswerErrorState(AiAnswer.L.style())
        }
    }

    @Test
    fun testAiAnswerMLoading() {
        composeTestRule.content {
            AiAnswerLoadingState(AiAnswer.M.style())
        }
    }

    @Test
    fun testAiAnswerSNoTitleHasActionsEndHasSuggestions() {
        composeTestRule.content {
            AiAnswerNoTitleHasActionsEndHasSuggestions(AiAnswer.S.style())
        }
    }

    @Test
    fun testAiAnswerXsLongTitleHasActionsStartHasSuggestions() {
        composeTestRule.content {
            AiAnswerLongTitleHasActionsStartHasSuggestions(AiAnswer.Xs.style())
        }
    }

    @Test
    fun testAiAnswerLHasActionsStartEnd() {
        composeTestRule.content {
            AiAnswerHasActionsStartEnd(AiAnswer.L.style())
        }
    }

    @Test
    fun testAiAnswerLHasActionsStartEndSuggestions() {
        composeTestRule.content {
            AiAnswerHasActionsStartEndSuggestions(AiAnswer.L.style())
        }
    }
}
