package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.HasInnerPaddings
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.card.S
import com.sdds.plasma.homeds.styles.card.Xl
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.card.CardHorizontal
import com.sdds.testing.compose.card.CardHorizontalExtra
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
    fun testCardSizeLHorizontal() {
        composeTestRule.content {
            CardHorizontal(style = Card.L.style())
        }
    }

    @Test
    fun testCardSizeMVertical() {
        composeTestRule.content {
            CardVertical(style = Card.M.style())
        }
    }

    @Test
    fun testCardSizeSHorizontal() {
        composeTestRule.content {
            CardHorizontal(style = Card.S.style())
        }
    }

    @Test
    fun testCardSizeLVertical() {
        composeTestRule.content {
            CardVertical(style = Card.L.style())
        }
    }

    @Test
    fun testCardSizeMHorizontal() {
        composeTestRule.content {
            CardHorizontal(style = Card.M.style())
        }
    }

    @Test
    fun testCardSizeSVertical() {
        composeTestRule.content {
            CardVertical(style = Card.S.style())
        }
    }

    @Test
    fun testCardSizeXLHorizontal() {
        composeTestRule.content {
            CardHorizontalExtra(style = Card.Xl.style())
        }
    }

    @Test
    fun testCardSizeXLInnerPaddingsVertical() {
        composeTestRule.content {
            CardVertical(style = Card.Xl.HasInnerPaddings.style())
        }
    }
}
