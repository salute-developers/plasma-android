package com.sdds.serv

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationNodeFactory
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.node.DelegatableNode
import androidx.compose.ui.node.DrawModifierNode
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertHeightIsEqualTo
import androidx.compose.ui.test.assertWidthIsEqualTo
import androidx.compose.ui.test.getUnclippedBoundsInRoot
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.ImageSource
import com.sdds.compose.uikit.LocalTextBrushProducer
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.ShapeableIndication
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.SelectInteraction
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.motion.components.select.LocalSelectItemMotionStyle
import com.sdds.compose.uikit.motion.components.select.SelectItemMotionStyle
import com.sdds.compose.uikit.motion.components.select.rememberSelectItemMotion
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

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [SDK_NUMBER], qualifiers = "w411dp-h891dp-mdpi")
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class SelectItemMotionTest : MotionTestBase() {
    @Test
    fun checkedCombinesWithInteractionsAndStyleReplacementWithoutSelectEvents() {
        var checked by mutableStateOf(false)
        var color by mutableStateOf(Color.Red)
        val source = MutableInteractionSource()
        val semantic = MutableSemanticStateSource()
        val events = mutableListOf<Interaction>()
        val press = PressInteraction.Press(Offset.Zero)
        val hover = HoverInteraction.Enter()
        val focus = FocusInteraction.Focus()
        compose.setContent {
            val base = color
            LaunchedEffect(source) { source.interactions.collect { events.add(it) } }
            SelectItem(
                motion = rememberSelectItemMotion(motionContext = rememberMotionContext(semantic, source)),
                checked = checked,
                onClick = {},
                modifier = Modifier.testTag("item"),
                style = SelectItemStyle.builder().itemType(SelectItemType.Single).colors {
                    backgroundColor(
                        base.asStatefulBrush(
                            Selected to Color.Green,
                            (Selected + InteractiveState.Pressed) to Color.Blue,
                            (Selected + InteractiveState.Hovered) to Color.Yellow,
                            (Selected + InteractiveState.Focused) to Color.Cyan,
                        ),
                    )
                }.style(),
                content = {},
            )
        }
        assertColor(Color.Red)
        compose.runOnIdle { checked = true }
        assertColor(Color.Green)
        listOf(press to Color.Blue, hover to Color.Yellow, focus to Color.Cyan).forEach { (event, expected) ->
            compose.runOnIdle { source.tryEmit(event) }
            assertColor(expected)
            compose.runOnIdle {
                source.tryEmit(
                    when (event) {
                        is PressInteraction.Press -> PressInteraction.Release(event)
                        is HoverInteraction.Enter -> HoverInteraction.Exit(event)
                        else -> FocusInteraction.Unfocus(focus)
                    },
                )
            }
            assertColor(Color.Green)
        }
        compose.runOnIdle {
            semantic.set(InteractiveState.Activated, true)
            checked = false
            color = Color.Magenta
        }
        assertColor(Color.Magenta)
        compose.runOnIdle {
            assertFalse(InteractiveState.Selected in semantic.states.value)
            assertTrue(InteractiveState.Activated in semantic.states.value)
            assertTrue(events.none { it is SelectInteraction })
        }
    }

    @Test
    fun noMotionUpdatesEveryDimensionAndReservesMissingIconSlot() {
        var checked by mutableStateOf(false)
        compose.setContent {
            Box(Modifier.testTag("frame")) {
                SelectItem(
                    checked = checked,
                    onClick = {},
                    modifier = Modifier.testTag("item"),
                    style = SelectItemStyle.builder().itemType(SelectItemType.Single).dimensions {
                        controlSize(10.dp.asStatefulValue(Selected to 20.dp))
                        controlMargin(2.dp.asStatefulValue(Selected to 4.dp))
                        paddingStart(3.dp.asStatefulValue(Selected to 6.dp))
                        paddingEnd(5.dp.asStatefulValue(Selected to 10.dp))
                        paddingTop(7.dp.asStatefulValue(Selected to 14.dp))
                        paddingBottom(9.dp.asStatefulValue(Selected to 18.dp))
                        height(40.dp.asStatefulValue(Selected to 80.dp))
                    }.style(),
                    content = { Box(Modifier.size(10.dp).testTag("content")) },
                )
            }
        }
        compose.onNodeWithTag("frame").assertWidthIsEqualTo(30.dp).assertHeightIsEqualTo(40.dp)
        assertEquals(15.dp, contentLeft("frame"))
        compose.runOnIdle { checked = true }
        compose.onNodeWithTag("frame").assertWidthIsEqualTo(50.dp).assertHeightIsEqualTo(80.dp)
        assertEquals(30.dp, contentLeft("frame"))
    }

    @Test
    fun localMotionAnimatesBrushesWhileDimensionsSwitchImmediately() {
        val motionStyle = SelectItemMotionStyle.builder()
            .backgroundColor(transition { segment {} changesWith { finite(tween(1_000)) } })
            .iconColor(transition { segment {} changesWith { finite(tween(1_000)) } }).style()
        // An external semantic state lets the selected icon remain visible for the whole transition.
        val semantic = MutableSemanticStateSource()
        val state = setOf(InteractiveState.Activated)
        compose.setContent {
            CompositionLocalProvider(LocalSelectItemMotionStyle provides motionStyle) {
                Box(Modifier.testTag("frame")) {
                    SelectItem(
                        motion = rememberSelectItemMotion(motionContext = rememberMotionContext(semantic)),
                        checked = true,
                        onClick = {},
                        modifier = Modifier.testTag("item"),
                        style = SelectItemStyle.builder().itemType(SelectItemType.Single)
                            .icon(ImageSource { ColorPainter(Color.White) })
                            .colors {
                                backgroundColor(Color.Red.asStatefulBrush(state to Color.Blue))
                                iconColor(Color.Green.asStatefulBrush(state to Color.Magenta))
                            }.dimensions {
                                height(48.dp.asStatefulValue(state to 96.dp))
                                controlSize(16.dp.asStatefulValue(state to 32.dp))
                                controlMargin(4.dp.asStatefulValue(state to 24.dp))
                            }.style(),
                        content = { Box(Modifier.size(10.dp).testTag("content")) },
                    )
                }
            }
        }
        compose.onNodeWithTag("frame").assertHeightIsEqualTo(48.dp)
        assertTrue(hasColor(Color.Green))
        compose.mainClock.autoAdvance = false
        compose.runOnIdle { semantic.set(InteractiveState.Activated, true) }
        advanceTransition()
        compose.onNodeWithTag("frame").assertHeightIsEqualTo(96.dp)
        assertEquals(64.dp, contentLeft("frame"))
        assertFalse(pixels("item")[0, 0] in listOf(Color.Red, Color.Blue))
        assertFalse(hasColor(Color.Green) || hasColor(Color.Magenta))
        compose.mainClock.advanceTimeBy(1_100)
        compose.onNodeWithTag("frame").assertHeightIsEqualTo(96.dp)
        assertEquals(64.dp, contentLeft("frame"))
        assertColor(Color.Blue)
        assertTrue(hasColor(Color.Magenta))
    }

    @Test
    fun builtInCellAndCheckBoxShareContextAndSiblingsRemainIndependent() {
        var checked by mutableStateOf(false)
        var clicks = 0
        var titleColor = Color.Unspecified
        var siblingColor = Color.Unspecified
        val source = MutableInteractionSource()
        val press = PressInteraction.Press(Offset.Zero)
        compose.setContent {
            val cell = CellStyle.builder().colors {
                titleColor(
                    Color.Red.asStatefulBrush(
                        Selected to Color.Green,
                        (Selected + InteractiveState.Pressed) to Color.Blue,
                    ),
                )
            }.style()
            val checkbox = CheckBoxStyle.builder().colorValues {
                toggleColor(
                    Color.Red.asStatefulBrush(
                        Selected to Color.Green,
                        (Selected + InteractiveState.Pressed) to Color.Blue,
                    ),
                )
            }.style()
            val style = SelectItemStyle.builder().cellStyle(cell).checkboxStyle(checkbox).style()
            Column {
                SelectItem(
                    checked = checked,
                    onClick = {
                        clicks++
                        checked = !checked
                    },
                    modifier = Modifier.testTag("item"),
                    style = style,
                    interactionSource = source,
                    titleContent = {
                        titleColor = (LocalTextBrushProducer.current!!.invoke() as SolidColor).value
                        Box(Modifier.size(10.dp))
                    },
                )
                SelectItem(
                    checked = false,
                    onClick = {},
                    modifier = Modifier.testTag("sibling"),
                    style = style,
                    titleContent = {
                        siblingColor = (LocalTextBrushProducer.current!!.invoke() as SolidColor).value
                        Box(Modifier.size(10.dp))
                    },
                )
            }
        }
        compose.onNodeWithTag("item").performClick()
        compose.runOnIdle {
            assertEquals(1, clicks)
            assertEquals(Color.Green, titleColor)
            assertEquals(Color.Red, siblingColor)
        }
        assertTrue(hasColor(Color.Green))
        compose.runOnIdle { source.tryEmit(press) }
        compose.runOnIdle {
            assertEquals(Color.Blue, titleColor)
            assertEquals(Color.Red, siblingColor)
        }
        assertTrue(hasColor(Color.Blue))
    }

    @Test
    fun gradientArbitraryShapeAndIndicationUseTheSameResolvedShape() {
        var checked by mutableStateOf(false)
        val triangle: Shape = GenericShape { size, _ ->
            moveTo(size.width / 2, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        var indicationShape: Shape? = null
        val indication = RecordingIndication { indicationShape = it }
        compose.setContent {
            CompositionLocalProvider(LocalIndication provides indication) {
                Box(Modifier.background(Color.White).testTag("frame")) {
                    SelectItem(
                        checked = checked,
                        onClick = {},
                        modifier = Modifier.width(100.dp).testTag("item"),
                        style = SelectItemStyle.builder().itemType(SelectItemType.Single)
                            .shape(RectangleShape.asStatefulValue(Selected to triangle))
                            .colors {
                                backgroundColor(Brush.horizontalGradient(listOf(Color.Red, Color.Blue)))
                            }.style(),
                        content = {},
                    )
                }
            }
        }
        compose.runOnIdle {
            assertEquals(RectangleShape, indicationShape)
            checked = true
        }
        compose.runOnIdle { assertEquals(triangle, indicationShape) }
        val pixels = pixels("frame")
        assertEquals(Color.White, pixels[0, 0])
        assertTrue(pixels[20, 40].red > pixels[20, 40].blue)
        assertTrue(pixels[80, 40].blue > pixels[80, 40].red)
    }

    @Test
    fun disabledAlphaAndNonfiniteHeightKeepLayoutAndBlockClicks() {
        var checked by mutableStateOf(false)
        var clicks = 0
        compose.setContent {
            Box(Modifier.background(Color.White).testTag("frame")) {
                SelectItem(
                    checked = checked,
                    onClick = { clicks++ },
                    enabled = false,
                    modifier = Modifier.width(100.dp).testTag("item"),
                    style = SelectItemStyle.builder().disableAlpha(0.5f).itemType(SelectItemType.Single)
                        .colors { backgroundColor(Color.Red) }
                        .dimensions { height(Dp.Unspecified.asStatefulValue(Selected to 80.dp)) }.style(),
                    content = {},
                )
            }
        }
        compose.onNodeWithTag("item").performClick()
        compose.runOnIdle {
            assertEquals(0, clicks)
            checked = true
        }
        compose.onNodeWithTag("frame").assertHeightIsEqualTo(80.dp)
        assertEquals(0.5f, pixels("item")[0, 0].green, 0.01f)
    }

    private fun contentLeft(tag: String = "item"): Dp =
        compose.onNodeWithTag("content", useUnmergedTree = true).getUnclippedBoundsInRoot().left -
            compose.onNodeWithTag(tag).getUnclippedBoundsInRoot().left

    private fun assertColor(color: Color) = assertEquals(color, pixels("item")[0, 0])

    private fun hasColor(color: Color): Boolean {
        val image = pixels("item")
        return (0 until image.width).any { x -> (0 until image.height).any { y -> image[x, y] == color } }
    }

    private class RecordingIndication(val record: (Shape) -> Unit) : IndicationNodeFactory, ShapeableIndication {
        override fun withShape(shape: Shape): Indication {
            record(shape)
            return this
        }

        override fun create(interactionSource: InteractionSource): DelegatableNode =
            object : Modifier.Node(), DrawModifierNode {
                override fun ContentDrawScope.draw() { drawContent() }
            }

        override fun equals(other: Any?): Boolean = this === other

        override fun hashCode(): Int = record.hashCode()
    }

    private companion object {
        val Selected = setOf(InteractiveState.Selected)
    }
}
