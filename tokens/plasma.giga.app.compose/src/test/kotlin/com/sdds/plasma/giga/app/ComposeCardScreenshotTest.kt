package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CardHorizontal
import com.sdds.compose.uikit.fixtures.testcases.CardVertical
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.card.CardClear
import com.sdds.plasma.giga.app.styles.card.CardSolid
import com.sdds.plasma.giga.app.styles.card.L
import com.sdds.plasma.giga.app.styles.card.M
import com.sdds.plasma.giga.app.styles.card.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCardScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCardSizeLSolidHorizontal() {
        composeTestRule.content {
            CardHorizontal(style = CardSolid.L.style())
        }
    }

    @Test
    fun testCardSizeMSolidVertical() {
        composeTestRule.content {
            CardVertical(style = CardSolid.M.style())
        }
    }

    @Test
    fun testCardSizeSSolidHorizontal() {
        composeTestRule.content {
            CardHorizontal(style = CardSolid.S.style())
        }
    }

    @Test
    fun testCardSizeLClearVertical() {
        composeTestRule.content {
            CardVertical(style = CardClear.L.style())
        }
    }

    @Test
    fun testCardSizeMClearHorizontal() {
        composeTestRule.content {
            CardHorizontal(style = CardClear.M.style())
        }
    }

    @Test
    fun testCardSizeSClearVertical() {
        composeTestRule.content {
            CardVertical(style = CardClear.S.style())
        }
    }
}
