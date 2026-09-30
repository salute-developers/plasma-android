package com.sdds.plasma.homeds

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.bubble.BUBBLE_BODY_BUTTON_TEST_TAG
import com.sdds.plasma.homeds.components.bubble.BUBBLE_CLOSE_BUTTON_TEST_TAG
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

    /**
     * PLASMA-T2891
     */
    @Test
    fun testBubbleTopStartProgress() {
        captureExpandedBubble(
            placement = BubblePlacement.Top,
            alignment = BubbleAlignment.Start,
            progress = 0.5f,
        )
    }

    /**
     * PLASMA-T2892
     */
    @Test
    fun testBubbleBottomCenterWithoutProgress() {
        captureExpandedBubble(
            placement = BubblePlacement.Bottom,
            alignment = BubbleAlignment.Center,
            progress = 0.5f,
            hasProgress = false,
        )
    }

    /**
     * PLASMA-T2893
     */
    @Test
    fun testBubbleStartEndFullProgress() {
        captureExpandedBubble(
            placement = BubblePlacement.Start,
            alignment = BubbleAlignment.End,
            progress = 1f,
        )
    }

    /**
     * PLASMA-T2894
     */
    @Test
    fun testBubbleEndStartProgress() {
        captureExpandedBubble(
            placement = BubblePlacement.End,
            alignment = BubbleAlignment.Start,
            progress = 0.5f,
        )
    }

    /**
     * PLASMA-T2895
     */
    @Test
    fun testBubbleTopEndProgress() {
        captureExpandedBubble(
            placement = BubblePlacement.Top,
            alignment = BubbleAlignment.End,
            progress = 0.5f,
        )
    }

    /**
     * PLASMA-T2896
     */
    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testBubbleCloseClickIsIgnoredDuringOpeningAnimation() {
        val expanded = mutableStateOf(true)
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.content {
            BubbleHost(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    BubbleTrigger(
                        onExpandedClick = { expanded.value = false },
                        expanded = expanded.value,
                        onTriggerClick = { expanded.value = true },
                        onDismissRequest = { expanded.value = false },
                        contentDescription = TriggerContentDescription,
                        style = Bubble.Default.style(),
                    ) {
                        Text(text = InteractionBodyText)
                    }
                }
            }
        }

        composeTestRule.mainClock.advanceTimeByFrame()
        composeTestRule.waitForIdle()
        composeTestRule.mainClock.advanceTimeBy(EXPAND_ANIMATION_SETTLE_MS)
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText(InteractionBodyText).assertExists()

        composeTestRule.onNodeWithTag(BUBBLE_BODY_BUTTON_TEST_TAG).performClick()
        composeTestRule.mainClock.advanceTimeByFrame()
        composeTestRule.waitForIdle()
        composeTestRule.mainClock.advanceTimeBy(EXPAND_ANIMATION_SETTLE_MS)
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText(InteractionBodyText).assertDoesNotExist()

        composeTestRule.onNodeWithContentDescription(TriggerContentDescription).performClick()
        composeTestRule.mainClock.advanceTimeByFrame()
        composeTestRule.waitForIdle()
        composeTestRule.mainClock.advanceTimeBy(MID_ANIMATION_MS)
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag(BUBBLE_CLOSE_BUTTON_TEST_TAG).performClick()

        composeTestRule.mainClock.advanceTimeBy(EXPAND_ANIMATION_SETTLE_MS)
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText(InteractionBodyText).assertExists()
    }

    /**
     * PLASMA-T2897
     * */
    @Test
    fun testBubbleAutoEndProgress() {
        captureExpandedBubble(
            placement = BubblePlacement.Auto,
            alignment = BubbleAlignment.End,
            progress = 0.5f,
        )
    }

    @OptIn(ExperimentalRoborazziApi::class)
    private fun captureExpandedBubble(
        placement: BubblePlacement,
        alignment: BubbleAlignment,
        progress: Float,
        hasProgress: Boolean = true,
    ) {
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.content {
            BubbleHost(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = true,
                        text = "Прокачать до 100%",
                        progress = progress,
                        hasProgress = hasProgress,
                        placement = placement,
                        alignment = alignment,
                        style = Bubble.Default.style(),
                        contentDescription = TriggerContentDescription,
                    )
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
    fun testCollapsedShowsBubbleStarIcon() {
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
private const val MID_ANIMATION_MS = 100L
private const val TriggerContentDescription = "Апсейл"
private const val InteractionBodyText = "Прокачать до 100%"
private const val NEIGHBOR_CARD_COUNT = 3
private val narrowCardSize = 90.dp
