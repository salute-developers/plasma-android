package com.sdds.plasma.homeds

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.bubble.BubbleAlignment
import com.sdds.plasma.homeds.components.bubble.BubbleHost
import com.sdds.plasma.homeds.components.bubble.BubblePlacement
import com.sdds.plasma.homeds.components.bubble.BubbleTrigger
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Bubble
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Default
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

/**
 * Скриншот-тесты controlled-состояний [BubbleTrigger]: collapsed и expanded.
 */
@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeBubbleScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testCollapsedShowsStarIcon() {
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.content {
            BubbleHost {
                Box(modifier = Modifier.padding(48.dp)) {
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = false,
                        style = Bubble.Default.style(),
                    ) {
                        Text(text = "Прокачать до 100%")
                    }
                }
            }
        }
        composeTestRule.mainClock.advanceTimeByFrame()
        composeTestRule.waitForIdle()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testExpandedShowsBubbleBody() {
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.content {
            BubbleHost {
                Box(modifier = Modifier.padding(48.dp)) {
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = true,
                        style = Bubble.Default.style(),
                        contentDescription = TriggerContentDescription,
                    ) {
                        Text(text = "Прокачать до 100%")
                    }
                }
            }
        }
        composeTestRule.mainClock.advanceTimeByFrame()
        composeTestRule.waitForIdle()
        composeTestRule.mainClock.advanceTimeBy(EXPAND_ANIMATION_SETTLE_MS)
        composeTestRule.waitForIdle()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testExpandedBubbleOverlapsNarrowNeighborCards() {
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.content {
            BubbleHost {
                Row(
                    modifier = Modifier.padding(48.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    repeat(NEIGHBOR_CARD_COUNT) { index ->
                        Box(
                            modifier = Modifier
                                .size(narrowCardSize)
                                .background(Color.DarkGray),
                        ) {
                            if (index == 0) {
                                BubbleTrigger(
                                    onExpandedClick = {},
                                    expanded = true,
                                    placement = BubblePlacement.Top,
                                    alignment = BubbleAlignment.End,
                                    style = Bubble.Default.style(),
                                    contentDescription = TriggerContentDescription,
                                    modifier = Modifier.align(Alignment.BottomEnd).padding(4.dp),
                                ) {
                                    Text(text = "Прокачать до 100%")
                                }
                            }
                        }
                    }
                }
            }
        }
        composeTestRule.mainClock.advanceTimeByFrame()
        composeTestRule.waitForIdle()
        composeTestRule.mainClock.advanceTimeBy(EXPAND_ANIMATION_SETTLE_MS)
        composeTestRule.waitForIdle()
    }
}

private const val EXPAND_ANIMATION_SETTLE_MS = 700L
private const val TriggerContentDescription = "Апсейл"
private const val NEIGHBOR_CARD_COUNT = 3
private val narrowCardSize = 90.dp
