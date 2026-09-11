package com.sdds.plasma.homeds

import android.app.Application
import android.content.pm.ActivityInfo
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.bubble.BubbleHost
import com.sdds.plasma.homeds.components.bubble.BubbleTrigger
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Bubble
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Default
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeBubbleBehaviorTest {

    @get:Rule(order = 0)
    val addActivityToRobolectricRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            super.starting(description)
            val appContext: Application = ApplicationProvider.getApplicationContext()
            val activityInfo = ActivityInfo().apply {
                name = ComponentActivity::class.java.name
                packageName = appContext.packageName
            }
            shadowOf(appContext.packageManager).addOrUpdateActivity(activityInfo)
        }
    }

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun triggerClickDoesNotChangeExpandedState() {
        var triggerClickCount = 0
        composeTestRule.content {
            BubbleHost(modifier = Modifier.size(100.dp)) {
                BubbleTrigger(
                    onExpandedClick = {},
                    expanded = false,
                    onTriggerClick = { triggerClickCount++ },
                    contentDescription = TRIGGER_DESCRIPTION,
                    style = Bubble.Default.style(),
                ) {
                    Text(text = BODY_TEXT)
                }
            }
        }

        composeTestRule.onNodeWithContentDescription(TRIGGER_DESCRIPTION).performClick()
        composeTestRule.waitForIdle()

        assertEquals(1, triggerClickCount)
        composeTestRule.onNodeWithText(BODY_TEXT).assertDoesNotExist()
    }

    @Test
    fun multipleExpandedTriggersAreDisplayedIndependently() {
        composeTestRule.mainClock.autoAdvance = false
        composeTestRule.content {
            BubbleHost(modifier = Modifier.size(240.dp)) {
                Row {
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = true,
                        style = Bubble.Default.style(),
                    ) {
                        Text(text = FIRST_BODY_TEXT)
                    }
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = true,
                        style = Bubble.Default.style(),
                    ) {
                        Text(text = SECOND_BODY_TEXT)
                    }
                }
            }
        }

        composeTestRule.mainClock.advanceTimeBy(ANIMATION_SETTLE_MS)
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithText(FIRST_BODY_TEXT).assertExists()
        composeTestRule.onNodeWithText(SECOND_BODY_TEXT).assertExists()
    }

    @Test
    fun visibilityIsDistinctAndBecomesFalseWhenTriggerIsRemoved() {
        val offset = mutableStateOf(0.dp)
        val show = mutableStateOf(true)
        val visibilityEvents = mutableListOf<Boolean>()
        composeTestRule.content {
            BubbleHost(modifier = Modifier.size(100.dp)) {
                Box(modifier = Modifier.size(100.dp)) {
                    if (show.value) {
                        BubbleTrigger(
                            onExpandedClick = {},
                            expanded = false,
                            onTriggerVisibilityChange = visibilityEvents::add,
                            style = Bubble.Default.style(),
                            modifier = Modifier.offset(x = offset.value),
                        ) {
                            Text(text = BODY_TEXT)
                        }
                    }
                }
            }
        }

        composeTestRule.waitForIdle()
        composeTestRule.runOnIdle { offset.value = 10.dp }
        composeTestRule.waitForIdle()
        composeTestRule.runOnIdle { offset.value = 80.dp }
        composeTestRule.waitForIdle()
        composeTestRule.runOnIdle { offset.value = 60.dp }
        composeTestRule.waitForIdle()
        composeTestRule.runOnIdle { show.value = false }
        composeTestRule.waitForIdle()

        assertEquals(listOf(true, false, true, false), visibilityEvents)
    }

    @Test
    fun visibleTriggersReportIndependently() {
        val firstEvents = mutableListOf<Boolean>()
        val secondEvents = mutableListOf<Boolean>()
        composeTestRule.content {
            BubbleHost(modifier = Modifier.size(100.dp)) {
                Row {
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = false,
                        onTriggerVisibilityChange = firstEvents::add,
                        style = Bubble.Default.style(),
                    ) {
                        Text(text = FIRST_BODY_TEXT)
                    }
                    BubbleTrigger(
                        onExpandedClick = {},
                        expanded = false,
                        onTriggerVisibilityChange = secondEvents::add,
                        style = Bubble.Default.style(),
                    ) {
                        Text(text = SECOND_BODY_TEXT)
                    }
                }
            }
        }

        composeTestRule.waitForIdle()

        assertEquals(listOf(true), firstEvents)
        assertEquals(listOf(true), secondEvents)
    }
}

private const val TRIGGER_DESCRIPTION = "Bubble trigger"
private const val BODY_TEXT = "Bubble body"
private const val FIRST_BODY_TEXT = "First bubble body"
private const val SECOND_BODY_TEXT = "Second bubble body"
private const val ANIMATION_SETTLE_MS = 700L
