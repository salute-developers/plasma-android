package com.sdds.serv

import android.view.View
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.referentialEqualityPolicy
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.toPixelMap
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertWidthIsEqualTo
import androidx.compose.ui.test.getUnclippedBoundsInRoot
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.isPopup
import androidx.compose.ui.test.onLast
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.fetchImage
import com.sdds.compose.uikit.ComboBox
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.ComboBoxTextField
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.ImageSource
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.ActivateInteraction
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.motion.components.dropdownmenu.rememberDropdownMenuMotion
import com.sdds.compose.uikit.motion.components.textfield.LocalTextFieldMotionStyle
import com.sdds.compose.uikit.motion.components.textfield.TextFieldMotionStyle
import com.sdds.compose.uikit.motion.components.textfield.rememberTextFieldMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.transition
import kotlinx.coroutines.flow.Flow
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.util.ReflectionHelpers

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [SDK_NUMBER], qualifiers = "w411dp-h891dp-mdpi")
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class ComboBoxMotionTest : MotionTestBase() {
    @Test
    fun replacingSourceAndEquallyOpenStateReconnectsActivationAndSubscription() {
        val first = RecordingSource()
        val second = RecordingSource()
        var source by mutableStateOf(first)
        val oldState = SelectState(true)
        val replacement = SelectState(true)
        var state by mutableStateOf(oldState, referentialEqualityPolicy())
        var show by mutableStateOf(true)
        compose.setContent {
            if (show) {
                ComboBox(
                    state = state,
                    trigger = {
                        ComboBoxTextField(
                            motion = rememberTextFieldMotion(motionContext = rememberMotionContext(source)),
                            value = "",
                            onValueChange = {},
                            focusSelectorSettings = FocusSelectorSettings.None,
                        )
                    },
                    listContent = { item { Text("Entry") } },
                )
            }
        }
        compose.runOnIdle {
            assertEquals(1, first.activeCount())
            source = second
        }
        compose.runOnIdle {
            assertEquals(0, first.activeCount())
            assertEquals(1, second.activeCount())
            state = replacement
        }
        compose.runOnIdle {
            oldState.close()
            assertTrue(replacement.isOpened)
            replacement.close()
        }
        compose.runOnIdle {
            assertEquals(0, second.activeCount())
            second.tryEmit(FocusInteraction.Focus())
        }
        compose.runOnIdle {
            assertTrue(replacement.isOpened)
            assertFalse(oldState.isOpened)
            show = false
        }
        compose.runOnIdle { assertEquals(0, second.activeCount()) }
    }

    @Test
    fun legacyStringInputAndPhoneFocusUseOriginalSource() {
        val state = SelectState()
        val source = RecordingSource()
        var value by mutableStateOf("")
        compose.setContent {
            ComboBox(state = state, trigger = {
                ComboBoxTextField(
                    value,
                    { value = it },
                    modifier = Modifier.testTag("field"),
                    interactionSource = source,
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            }, listContent = { item { Text("Entry") } })
        }
        compose.runOnIdle { source.tryEmit(FocusInteraction.Focus()) }
        compose.runOnIdle {
            assertTrue(state.isOpened)
            state.close()
        }
        compose.onNodeWithTag("field").performTextInput("query")
        compose.runOnIdle {
            assertEquals("query", value)
            assertTrue(state.isOpened)
        }
    }

    @Test
    fun textFieldValueRetainsSelectionAndCompositionAndOpensAfterEditing() {
        val state = SelectState()
        var value by mutableStateOf(TextFieldValue("abcd", TextRange(1, 3), TextRange(0, 4)))
        compose.setContent {
            ComboBox(state = state, trigger = {
                ComboBoxTextField(
                    motion = rememberTextFieldMotion(),
                    value = value,
                    onValueChange = { value = it },
                    modifier = Modifier.testTag("field"),
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            }, listContent = { item { Text("Entry") } })
        }
        compose.onNodeWithTag("field").assert(
            SemanticsMatcher.expectValue(SemanticsProperties.TextSelectionRange, TextRange(1, 3)),
        )
        compose.runOnIdle { assertEquals(TextRange(0, 4), value.composition) }
        compose.onNodeWithTag("field").performTextInput("Z")
        compose.runOnIdle {
            assertEquals("aZd", value.text)
            assertEquals(TextRange(2), value.selection)
            assertTrue(state.isOpened)
        }
    }

    @Test
    fun tvActivationAndReadonlySubscriptionFollowCurrentSettings() {
        val state = SelectState()
        val source = RecordingSource()
        var readOnly by mutableStateOf(false)
        compose.setContent {
            ComboBox(state = state, readOnly = readOnly, trigger = {
                ComboBoxTextField(
                    motion = rememberTextFieldMotion(motionContext = rememberMotionContext(source)),
                    value = "",
                    onValueChange = {},
                    readOnly = readOnly,
                    focusSelectorSettings = FocusSelectorSettings.builder().build(),
                )
            }, listContent = { item { Text("Entry") } })
        }
        compose.runOnIdle { source.tryEmit(FocusInteraction.Focus()) }
        compose.runOnIdle {
            assertFalse(state.isOpened)
            source.tryEmit(ActivateInteraction.Activate())
        }
        compose.runOnIdle {
            assertTrue(state.isOpened)
            state.close()
            readOnly = true
        }
        compose.runOnIdle { source.tryEmit(ActivateInteraction.Activate()) }
        compose.runOnIdle { assertFalse(state.isOpened) }
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
    }

    @Test
    fun iconTogglesAndDisabledReadonlyGatePopup() {
        val state = SelectState()
        var enabled by mutableStateOf(true)
        var readOnly by mutableStateOf(false)
        val icon = ImageSource { ColorPainter(Color.Black) }
        compose.setContent {
            ComboBox(state = state, enabled = enabled, readOnly = readOnly, trigger = {
                ComboBoxTextField(
                    value = "",
                    onValueChange = {},
                    iconOpened = icon,
                    iconClosed = icon,
                    enabled = enabled,
                    readOnly = readOnly,
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            }, listContent = { item { Text("Entry") } })
        }
        fun clickIcon() = compose.onAllNodes(hasClickAction(), useUnmergedTree = true).onLast().performClick()
        clickIcon()
        compose.runOnIdle { assertTrue(state.isOpened) }
        clickIcon()
        compose.runOnIdle {
            assertFalse(state.isOpened)
            enabled = false
            state.open()
        }
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
        compose.runOnIdle {
            enabled = true
            readOnly = true
        }
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
        compose.runOnIdle { readOnly = false }
        compose.onNodeWithText("Entry").assertExists()
    }

    @Test
    fun localTextFieldMotionAnimatesSupportedBackgroundThroughComboBox() {
        val state = SelectState()
        val semantic = MutableSemanticStateSource()
        val motionStyle = TextFieldMotionStyle.builder()
            .backgroundColor(transition { segment {} changesWith { finite(tween(1_000)) } }).style()
        compose.setContent {
            CompositionLocalProvider(LocalTextFieldMotionStyle provides motionStyle) {
                ComboBox(state = state, trigger = {
                    ComboBoxTextField(
                        motion = rememberTextFieldMotion(motionContext = rememberMotionContext(semantic)),
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.width(200.dp).testTag("field"),
                        style = TextFieldStyle.builder().colors {
                            backgroundColor(
                                Color.Red.asStatefulBrush(setOf(InteractiveState.Selected) to Color.Blue),
                            )
                        }.style(),
                        focusSelectorSettings = FocusSelectorSettings.None,
                    )
                }, listContent = {})
            }
        }
        fun background(): Color {
            val image = pixels("field")
            return image[image.width / 2, image.height / 2]
        }
        assertEquals(Color.Red, background())
        compose.mainClock.autoAdvance = false
        compose.runOnIdle { semantic.set(InteractiveState.Selected, true) }
        advanceTransition()
        assertFalse(background() in listOf(Color.Red, Color.Blue))
        compose.mainClock.advanceTimeBy(1_100)
        assertEquals(Color.Blue, background())
    }

    @Test
    fun dropdownMotionReachesSemanticBorderAndKeepsSizingHeaderFooterEmptyState() {
        val state = SelectState(true)
        val semantic = MutableSemanticStateSource()
        var empty by mutableStateOf(false)
        var exact by mutableStateOf(false)
        compose.setContent {
            ComboBox(
                dropdownMotion = rememberDropdownMenuMotion(motionContext = rememberMotionContext(semantic)),
                state = state,
                style = ComboBoxStyle.builder().dropdownStyle(
                    DropdownMenuStyle.builder()
                        .colors {
                            strokeColor(Color.Red.asStatefulBrush(setOf(InteractiveState.Selected) to Color.Blue))
                        }
                        .dimensions { strokeWidth(4.dp) }.style(),
                ).style(),
                dropdownProperties = DropdownProperties(
                    width = if (exact) {
                        DropdownProperties.Width.Exactly(160.dp)
                    } else {
                        DropdownProperties.Width.TriggerWidth
                    },
                ),
                trigger = { Box(Modifier.size(200.dp, 40.dp).testTag("trigger")) },
                listContent = {
                    item {
                        SelectItem(checked = false, onClick = {}, titleContent = { Text("Entry") })
                    }
                },
                header = { Text("Header") }, footer = { Text("Footer") },
                showEmptyState = empty, emptyState = { Text("Empty") },
            )
        }
        compose.onNode(isPopup()).assertWidthIsEqualTo(200.dp)
        assertTrue(popupHasColor(Color.Red))
        val header = compose.onNodeWithText("Header").getUnclippedBoundsInRoot()
        val entry = compose.onNodeWithText("Entry").getUnclippedBoundsInRoot()
        val footer = compose.onNodeWithText("Footer").getUnclippedBoundsInRoot()
        assertTrue(header.bottom <= entry.top && entry.bottom <= footer.top)
        compose.runOnIdle {
            semantic.set(InteractiveState.Selected, true)
            exact = true
        }
        compose.onNode(isPopup()).assertWidthIsEqualTo(160.dp)
        assertTrue(popupHasColor(Color.Blue))
        assertFalse(popupHasColor(Color.Red))
        compose.runOnIdle { empty = true }
        compose.onNodeWithText("Empty").assertExists()
        compose.onNodeWithText("Entry").assertDoesNotExist()
        compose.runOnIdle { state.close() }
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
    }

    private fun popupHasColor(color: Color): Boolean {
        val global = Class.forName("android.view.WindowManagerGlobal").getMethod("getInstance").invoke(null)
        val views = ReflectionHelpers.getField<ArrayList<View>>(global, "mViews")
        val popup = views.last { it.javaClass.simpleName == "PopupLayout" }
        val image = requireNotNull(popup.fetchImage(RoborazziOptions.RecordOptions())).asImageBitmap().toPixelMap()
        return (0 until image.width).any { x -> (0 until image.height).any { y -> image[x, y] == color } }
    }

    private class RecordingSource : MutableInteractionSource {
        private val delegate = MutableInteractionSource()
        private val events = mutableListOf<Interaction>()
        override val interactions: Flow<Interaction> = delegate.interactions
        override suspend fun emit(interaction: Interaction) {
            events.add(interaction)
            delegate.emit(interaction)
        }
        override fun tryEmit(interaction: Interaction): Boolean {
            events.add(interaction)
            return delegate.tryEmit(interaction)
        }
        fun activeCount(): Int {
            val active = mutableSetOf<ActivateInteraction.Activate>()
            events.forEach {
                when (it) {
                    is ActivateInteraction.Activate -> active.add(it)
                    is ActivateInteraction.Deactivate -> active.remove(it.activate)
                }
            }
            return active.size
        }
    }
}
