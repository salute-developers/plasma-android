package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.card.CardClear
import com.sdds.plasma.giga.app.styles.card.CardSolid
import com.sdds.plasma.giga.app.styles.card.L
import com.sdds.plasma.giga.app.styles.card.M
import com.sdds.plasma.giga.app.styles.card.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.card.CardHorizontal
import com.sdds.testing.compose.card.CardVertical
import com.sdds.testing.vs.SDK_NUMBER
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
