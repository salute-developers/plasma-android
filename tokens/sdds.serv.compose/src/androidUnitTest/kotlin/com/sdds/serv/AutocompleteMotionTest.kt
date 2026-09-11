package com.sdds.serv

import android.view.KeyEvent
import android.view.View
import android.view.WindowManager
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PixelMap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.toPixelMap
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertWidthIsEqualTo
import androidx.compose.ui.test.getUnclippedBoundsInRoot
import androidx.compose.ui.test.isPopup
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.fetchImage
import com.sdds.compose.uikit.Autocomplete
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.motion.components.dropdownmenu.DropdownMenuMotionStyle
import com.sdds.compose.uikit.motion.components.dropdownmenu.LocalDropdownMenuMotionStyle
import com.sdds.compose.uikit.motion.components.dropdownmenu.rememberDropdownMenuMotion
import com.sdds.compose.uikit.motion.components.list.rememberListItemMotion
import com.sdds.compose.uikit.motion.components.textfield.LocalTextFieldMotionStyle
import com.sdds.compose.uikit.motion.components.textfield.TextFieldMotionStyle
import com.sdds.compose.uikit.motion.components.textfield.rememberTextFieldMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.transition
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
class AutocompleteMotionTest : MotionTestBase() {
    @Test
    fun replacingOpenMenuContextAndStyleKeepsFieldAndRowIndependent() {
        val first = MutableSemanticStateSource()
        val second = MutableSemanticStateSource()
        val field = MutableSemanticStateSource()
        val row = MutableSemanticStateSource()
        var menuSource by mutableStateOf(first)
        var selectedBorder by mutableStateOf(Color.Blue)
        compose.setContent {
            Autocomplete(
                dropdownMotion = rememberDropdownMenuMotion(motionContext = rememberMotionContext(menuSource)),
                style = AutocompleteStyle.builder().dropdownStyle(borderStyle(selectedBorder)).style(),
                showDropdown = true,
                field = {
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.width(220.dp).testTag("field"),
                        style = TextFieldStyle.builder().colors {
                            backgroundColor(
                                Color.Green.asStatefulBrush(setOf(InteractiveState.Selected) to Color.Yellow),
                            )
                        }.style(),
                        focusSelectorSettings = FocusSelectorSettings.None,
                        motion = rememberTextFieldMotion(motionContext = rememberMotionContext(field)),
                    )
                },
                listContent = {
                    item {
                        ListItem(
                            motion = rememberListItemMotion(motionContext = rememberMotionContext(row)),
                            titleContent = { Text("Row") },
                            modifier = Modifier.size(180.dp, 40.dp),
                            style = ListItemStyle.builder().colors {
                                backgroundColor(
                                    Color.Cyan.asStatefulBrush(setOf(InteractiveState.Selected) to Color.Magenta),
                                )
                            }.style(),
                            disclosureEnabled = false,
                        )
                    }
                },
            )
        }
        assertTrue(popupHasColor(Color.Red))
        compose.runOnIdle { first.set(InteractiveState.Selected, true) }
        assertTrue(popupHasColor(Color.Blue))
        assertEquals(Color.Green, fieldBackground())
        assertTrue(popupHasColor(Color.Cyan))
        assertFalse(popupHasColor(Color.Magenta))
        compose.runOnIdle { menuSource = second }
        assertTrue(popupHasColor(Color.Red))
        compose.runOnIdle { first.set(InteractiveState.Selected, false) }
        compose.runOnIdle { first.set(InteractiveState.Selected, true) }
        assertTrue(popupHasColor(Color.Red))
        assertFalse(popupHasColor(Color.Blue))
        compose.runOnIdle { second.set(InteractiveState.Selected, true) }
        assertTrue(popupHasColor(Color.Blue))
        compose.runOnIdle { selectedBorder = Color.DarkGray }
        assertTrue(popupHasColor(Color.DarkGray))
        assertFalse(popupHasColor(Color.Blue))
        compose.runOnIdle {
            field.set(InteractiveState.Selected, true)
            row.set(InteractiveState.Selected, true)
        }
        assertEquals(Color.Yellow, fieldBackground())
        assertTrue(popupHasColor(Color.Magenta))
        assertTrue(popupHasColor(Color.DarkGray))
    }

    @Test
    fun nestedFieldStyleUsesLocalMotionAndSwitchesToNoMotion() {
        val semantic = MutableSemanticStateSource()
        var motionStyle by mutableStateOf(
            TextFieldMotionStyle.builder().backgroundColor(
                transition { segment {} changesWith { finite(tween(1_000)) } },
            ).style(),
        )
        compose.setContent {
            CompositionLocalProvider(LocalTextFieldMotionStyle provides motionStyle) {
                Autocomplete(
                    dropdownMotion = rememberDropdownMenuMotion(),
                    style = AutocompleteStyle.builder().textFieldStyle(
                        TextFieldStyle.builder().colors {
                            backgroundColor(Color.Red.asStatefulBrush(setOf(InteractiveState.Selected) to Color.Blue))
                        }.style(),
                    ).style(),
                    field = {
                        TextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier.width(200.dp).testTag("field"),
                            focusSelectorSettings = FocusSelectorSettings.None,
                            motion = rememberTextFieldMotion(motionContext = rememberMotionContext(semantic)),
                        )
                    },
                )
            }
        }
        assertEquals(Color.Red, fieldBackground())
        compose.mainClock.autoAdvance = false
        compose.runOnIdle { semantic.set(InteractiveState.Selected, true) }
        advanceTransition()
        assertFalse(fieldBackground() in listOf(Color.Red, Color.Blue))
        compose.mainClock.advanceTimeBy(1_100)
        assertEquals(Color.Blue, fieldBackground())
        compose.runOnIdle { motionStyle = TextFieldMotionStyle.builder().style() }
        compose.mainClock.advanceTimeByFrame()
        compose.runOnIdle { semantic.set(InteractiveState.Selected, false) }
        compose.mainClock.advanceTimeByFrame()
        compose.mainClock.advanceTimeByFrame()
        assertEquals(Color.Red, fieldBackground())
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
    }

    @Test
    fun legacyPositionalCallSupportsStringFilteringAndSingleSelection() {
        var value by mutableStateOf("")
        var opened by mutableStateOf(false)
        var selections = 0
        val localMotion = DropdownMenuMotionStyle.builder().style()
        compose.setContent {
            CompositionLocalProvider(LocalDropdownMenuMotionStyle provides localMotion) {
                Autocomplete(
                    Modifier,
                    AutocompleteStyle.builder().style(),
                    {
                        TextField(
                            value = value,
                            onValueChange = {
                                value = it
                                opened = true
                            },
                            modifier = Modifier.width(200.dp).testTag("field"),
                            focusSelectorSettings = FocusSelectorSettings.None,
                        )
                    },
                    opened,
                    { opened = false },
                ) {
                    items(listOf("Alpha", "Beta").filter { it.startsWith(value) }.size) {
                        ListItem(
                            text = "Alpha",
                            modifier = Modifier.clickable {
                                selections++
                                value = "Alpha"
                                opened = false
                            },
                        )
                    }
                }
            }
        }
        compose.onNodeWithTag("field").performClick()
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
        compose.onNodeWithTag("field").performTextInput("Al")
        compose.onNodeWithText("Alpha").performClick()
        compose.runOnIdle {
            assertEquals("Alpha", value)
            assertEquals(1, selections)
            assertFalse(opened)
        }
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
    }

    @Test
    fun textFieldValueAndEditingFlagsRemainControlledByTheCaller() {
        val initial = TextFieldValue("Alpha", TextRange(1, 3), TextRange(0, 4))
        var value by mutableStateOf(initial)
        var opened by mutableStateOf(false)
        var enabled by mutableStateOf(true)
        var readOnly by mutableStateOf(false)
        compose.setContent {
            Autocomplete(
                dropdownMotion = rememberDropdownMenuMotion(),
                showDropdown = opened,
                field = {
                    TextField(
                        value = value,
                        onValueChange = {
                            if (value.text != it.text) opened = true
                            value = it
                        },
                        modifier = Modifier.width(200.dp).testTag("field"),
                        enabled = enabled,
                        readOnly = readOnly,
                        focusSelectorSettings = FocusSelectorSettings.None,
                        motion = rememberTextFieldMotion(),
                    )
                },
                listContent = { item { Text("Suggestion") } },
            )
        }
        compose.onNodeWithTag("field").assert(
            SemanticsMatcher.expectValue(SemanticsProperties.TextSelectionRange, initial.selection),
        )
        compose.runOnIdle {
            assertEquals(initial, value)
            assertEquals(TextRange(0, 4), value.composition)
            readOnly = true
        }
        compose.onNodeWithTag("field").performClick()
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
        compose.runOnIdle {
            enabled = false
            opened = true
        }
        compose.onNodeWithText("Suggestion").assertExists()
        compose.runOnIdle {
            enabled = true
            readOnly = false
            opened = false
            value = initial
        }
        compose.onNodeWithTag("field").performTextInput("Z")
        compose.runOnIdle {
            assertEquals("AZha", value.text)
            assertTrue(opened)
        }
        compose.onNodeWithText("Suggestion").assertExists()
    }

    @Test
    fun dismissalUsesCurrentCallbackAndRequiresExternalVisibilityUpdate() {
        var version by mutableStateOf(1)
        var opened by mutableStateOf(true)
        val requests = mutableListOf<Int>()
        compose.setContent {
            val currentVersion = version
            Autocomplete(
                dropdownMotion = rememberDropdownMenuMotion(),
                field = { Box(Modifier.size(200.dp, 40.dp)) },
                showDropdown = opened,
                onDismissRequest = { requests.add(currentVersion) },
                dropdownProperties = DropdownProperties(popupProperties = PopupProperties(focusable = true)),
                listContent = { item { Text("Suggestion") } },
            )
        }
        compose.onNodeWithText("Suggestion").assertExists()
        compose.runOnIdle { version = 2 }
        val popup = popupView()
        compose.runOnIdle {
            popup.dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK))
            popup.dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_BACK))
        }
        compose.runOnIdle {
            assertEquals(listOf(2), requests)
            assertTrue(opened)
        }
        compose.onNodeWithText("Suggestion").assertExists()
        compose.runOnIdle { opened = false }
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
    }

    @Test
    fun popupKeepsSizingMovementFooterEmptyStateAndFallback() {
        var width by mutableStateOf(200.dp)
        var exact by mutableStateOf(false)
        var shifted by mutableStateOf(false)
        var empty by mutableStateOf(false)
        var provideEmpty by mutableStateOf(true)
        compose.setContent {
            Box(Modifier.fillMaxSize()) {
                Autocomplete(
                    dropdownMotion = rememberDropdownMenuMotion(),
                    modifier = Modifier.offset(x = if (shifted) 24.dp else 0.dp, y = if (shifted) 32.dp else 0.dp),
                    field = { Box(Modifier.size(width, 40.dp).testTag("trigger")) },
                    showDropdown = true,
                    dropdownProperties = DropdownProperties(
                        width = if (exact) {
                            DropdownProperties.Width.Exactly(
                                160.dp,
                            )
                        } else {
                            DropdownProperties.Width.TriggerWidth
                        },
                        height = DropdownProperties.Height.Constrained(120.dp),
                    ),
                    showEmptyState = empty,
                    emptyState = if (provideEmpty) { { Text("Empty") } } else null,
                    footer = { Text("Footer") },
                    listContent = { items(10) { Text("Entry $it", modifier = Modifier.size(100.dp, 40.dp)) } },
                )
            }
        }
        compose.onNode(isPopup()).assertWidthIsEqualTo(200.dp)
        val bounds = compose.onNode(isPopup()).getUnclippedBoundsInRoot()
        assertTrue(bounds.bottom - bounds.top <= 120.dp)
        val entry = compose.onNodeWithText("Entry 0").getUnclippedBoundsInRoot()
        val footer = compose.onNodeWithText("Footer").getUnclippedBoundsInRoot()
        assertTrue(entry.bottom <= footer.top)
        compose.runOnIdle { width = 220.dp }
        compose.onNode(isPopup()).assertWidthIsEqualTo(220.dp)
        val before = popupLocation()
        compose.runOnIdle { shifted = true }
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        val after = popupLocation()
        assertEquals(24, after[0] - before[0])
        assertEquals(32, after[1] - before[1])
        compose.runOnIdle { exact = true }
        compose.onNode(isPopup()).assertWidthIsEqualTo(160.dp)
        compose.runOnIdle { empty = true }
        compose.onNodeWithText("Empty").assertExists()
        compose.onNodeWithText("Entry 0").assertDoesNotExist()
        compose.onNodeWithText("Footer").assertDoesNotExist()
        compose.runOnIdle { provideEmpty = false }
        compose.onNodeWithText("Entry 0").assertExists()
        compose.onNodeWithText("Footer").assertExists()
    }

    @Test
    fun defaultPropertyMotionPreservesPopupFadeInAndFadeOut() {
        var opened by mutableStateOf(false)
        compose.setContent {
            Autocomplete(
                dropdownMotion = rememberDropdownMenuMotion(),
                style = AutocompleteStyle.builder().dropdownStyle(borderStyle(Color.Blue)).style(),
                field = { Box(Modifier.size(200.dp, 40.dp)) },
                showDropdown = opened,
                listContent = { item { Text("Entry") } },
            )
        }
        compose.mainClock.autoAdvance = false
        compose.runOnIdle { opened = true }
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        compose.mainClock.advanceTimeBy(64)
        assertEquals(1, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
        assertFalse(popupHasColor(Color.Red))
        compose.mainClock.advanceTimeBy(500)
        assertTrue(popupHasColor(Color.Red))
        compose.runOnIdle { opened = false }
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        compose.mainClock.advanceTimeBy(64)
        assertEquals(1, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
        assertFalse(popupHasColor(Color.Red))
        compose.mainClock.advanceTimeBy(500)
        assertEquals(0, compose.onAllNodes(isPopup()).fetchSemanticsNodes().size)
    }

    @Composable
    private fun borderStyle(selected: Color): DropdownMenuStyle = DropdownMenuStyle.builder()
        .colors { strokeColor(Color.Red.asStatefulBrush(setOf(InteractiveState.Selected) to selected)) }
        .dimensions { strokeWidth(4.dp) }.style()

    private fun fieldBackground(): Color {
        val image = pixels("field")
        return image[image.width / 2, image.height / 2]
    }

    private fun popupView(): View {
        val global = Class.forName("android.view.WindowManagerGlobal").getMethod("getInstance").invoke(null)
        val views = ReflectionHelpers.getField<ArrayList<View>>(global, "mViews")
        return views.last { it.javaClass.simpleName == "PopupLayout" }
    }

    private fun popupLocation(): IntArray = IntArray(2).also { position ->
        val popup = popupView()
        compose.runOnIdle {
            val params = popup.layoutParams as WindowManager.LayoutParams
            position[0] = params.x
            position[1] = params.y
        }
    }

    private fun popupHasColor(color: Color): Boolean {
        compose.waitForIdle()
        val image: PixelMap = requireNotNull(popupView().fetchImage(RoborazziOptions.RecordOptions()))
            .asImageBitmap().toPixelMap()
        return (0 until image.width).any { x -> (0 until image.height).any { y -> image[x, y] == color } }
    }
}
