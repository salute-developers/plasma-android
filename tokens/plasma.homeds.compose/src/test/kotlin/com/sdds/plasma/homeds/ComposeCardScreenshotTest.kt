package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CardHorizontal
import com.sdds.compose.uikit.fixtures.testcases.CardHorizontalExtra
import com.sdds.compose.uikit.fixtures.testcases.CardVertical
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.HasInnerPaddings
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.card.S
import com.sdds.plasma.homeds.styles.card.Xl
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
