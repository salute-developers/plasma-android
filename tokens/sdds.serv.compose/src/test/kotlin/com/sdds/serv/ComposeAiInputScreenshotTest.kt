package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AiInputHasActionsAfterHasMaxHeight
import com.sdds.compose.uikit.fixtures.testcases.AiInputHasActionsBefore
import com.sdds.compose.uikit.fixtures.testcases.AiInputHasActionsBeforeAfterHasMaxHeight
import com.sdds.compose.uikit.fixtures.testcases.AiInputHasContentHasActionsBeforeAfter
import com.sdds.compose.uikit.fixtures.testcases.AiInputLongPlaceholder
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.aiinput.AiInputCondensed
import com.sdds.serv.styles.aiinput.AiInputExtended
import com.sdds.serv.styles.aiinput.L
import com.sdds.serv.styles.aiinput.M
import com.sdds.serv.styles.aiinput.S
import com.sdds.serv.styles.aiinput.Xl
import com.sdds.serv.styles.aiinput.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAiInputScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAiInputCondensedXlHasContentHasActionsBeforeAfter() {
        composeTestRule.content {
            AiInputHasContentHasActionsBeforeAfter(AiInputCondensed.Xl.style())
        }
    }

    @Test
    fun testAiInputExtendedLHasContentHasActionsBeforeAfter() {
        composeTestRule.content {
            AiInputHasContentHasActionsBeforeAfter(AiInputExtended.L.style())
        }
    }

    @Test
    fun testAiInputCondensedMLongPlaceholder() {
        composeTestRule.content {
            AiInputLongPlaceholder(AiInputCondensed.M.style())
        }
    }

    @Test
    fun testAiInputExtendedSHasActionsAfterHasMaxHeight() {
        composeTestRule.content {
            AiInputHasActionsAfterHasMaxHeight(AiInputExtended.S.style())
        }
    }

    @Test
    fun testAiInputCondensedXsHasActionsBefore() {
        composeTestRule.content {
            AiInputHasActionsBefore(AiInputCondensed.Xs.style())
        }
    }

    @Test
    fun testAiInputCondensedLHasActionsBeforeAfterHasMaxHeight() {
        composeTestRule.content {
            AiInputHasActionsBeforeAfterHasMaxHeight(AiInputCondensed.L.style())
        }
    }

    @Test
    fun testAiInputExtendedLHasActionsBeforeAfterHasMaxHeight() {
        composeTestRule.content {
            AiInputHasActionsBeforeAfterHasMaxHeight(AiInputExtended.L.style())
        }
    }
}
