package com.sdds.serv

import android.app.Application
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.view.View
import androidx.activity.ComponentActivity
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.toPixelMap
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertHeightIsEqualTo
import androidx.compose.ui.test.assertWidthIsEqualTo
import androidx.compose.ui.test.getUnclippedBoundsInRoot
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.fetchImage
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.DividerOrientation
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalDividerOrientation
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentVertical
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fs.FocusSelectorBorder
import com.sdds.compose.uikit.fs.FocusSelectorBorders
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.motion.components.button.rememberButtonMotion
import com.sdds.compose.uikit.motion.components.segment.LocalSegmentItemMotionStyle
import com.sdds.compose.uikit.motion.components.segment.LocalSegmentMotionStyle
import com.sdds.compose.uikit.motion.components.segment.SegmentItemMotionStyle
import com.sdds.compose.uikit.motion.components.segment.SegmentMotionStyle
import com.sdds.compose.uikit.motion.components.segment.rememberSegmentItemMotion
import com.sdds.compose.uikit.motion.components.segment.rememberSegmentMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.transition
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import kotlin.math.roundToInt

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [SDK_NUMBER], qualifiers = "w411dp-h891dp-mdpi")
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class SegmentMotionTest {

    @get:Rule(order = 0)
    val activityRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            val application = ApplicationProvider.getApplicationContext<Application>()
            shadowOf(application.packageManager).addOrUpdateActivity(
                ActivityInfo().apply {
                    name = ComponentActivity::class.java.name
                    packageName = application.packageName
                },
            )
        }
    }

    @get:Rule(order = 1)
    val compose = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun selectionUpdatesValueMarginAndIndependentSlotSizes() {
        var selected by mutableStateOf(false)
        compose.setContent {
            SegmentItem(
                labelContent = { Box(Modifier.size(10.dp).testTag("label")) },
                valueContent = { Box(Modifier.size(10.dp).testTag("value")) },
                isSelected = selected,
                style = itemStyle(),
                modifier = Modifier.testTag("item"),
                startContent = { Icon(ColorPainter(Color.White), "start", Modifier.testTag("start")) },
                endContent = { Icon(ColorPainter(Color.White), "end", Modifier.testTag("end")) },
            )
        }
        assertMargin(4.dp)
        compose.onNodeWithTag("start").assertWidthIsEqualTo(16.dp)
        compose.onNodeWithTag("end").assertWidthIsEqualTo(24.dp)
        compose.onNodeWithTag("item").assertHeightIsEqualTo(32.dp)
        compose.runOnIdle { selected = true }
        assertMargin(12.dp)
        compose.onNodeWithTag("end").assertWidthIsEqualTo(32.dp)
        compose.onNodeWithTag("start").assertWidthIsEqualTo(16.dp)
        compose.onNodeWithTag("item").assertHeightIsEqualTo(48.dp)
    }

    @Test
    fun painterOverloadUsesEndSizeAndKeepsIconPriority() {
        var selected by mutableStateOf(false)
        compose.setContent {
            SegmentItem(
                motion = rememberSegmentItemMotion(),
                label = "",
                isSelected = selected,
                style = itemStyle(),
                modifier = Modifier.testTag("item"),
                startIcon = ColorPainter(Color.Red),
                endIcon = ColorPainter(Color.Blue),
                counter = "99",
            )
        }
        compose.onNodeWithText("99").assertDoesNotExist()
        assertEquals(16, colorWidth(Color.Red))
        assertEquals(24, colorWidth(Color.Blue))
        compose.runOnIdle { selected = true }
        assertEquals(16, colorWidth(Color.Red))
        assertEquals(32, colorWidth(Color.Blue))
    }

    @Test
    fun combinedStatesAndStyleReplacementUseOriginalSources() {
        var selected by mutableStateOf(true)
        var baseColor by mutableStateOf(Color.Red)
        val interaction = MutableInteractionSource()
        val semantic = MutableSemanticStateSource()
        val press = PressInteraction.Press(Offset.Zero)
        val focus = FocusInteraction.Focus()
        compose.setContent {
            val currentColor = baseColor
            SegmentItem(
                label = "",
                style = SegmentItemStyle.builder().colors {
                    backgroundColor(
                        currentColor.asStatefulBrush(
                            Selected to Color.Green,
                            (Selected + InteractiveState.Pressed) to Color.Blue,
                            setOf(InteractiveState.Focused) to Color.Yellow,
                        ),
                    )
                }.style(),
                isSelected = selected,
                modifier = Modifier.testTag("item"),
                interactionSource = interaction,
                semanticStateSource = semantic,
            )
        }
        assertItemColor(Color.Green)
        compose.runOnIdle { interaction.tryEmit(press) }
        assertItemColor(Color.Blue)
        compose.runOnIdle { interaction.tryEmit(PressInteraction.Release(press)) }
        assertItemColor(Color.Green)
        compose.runOnIdle {
            interaction.tryEmit(focus)
            selected = false
        }
        assertItemColor(Color.Yellow)
        compose.runOnIdle { interaction.tryEmit(FocusInteraction.Unfocus(focus)) }
        assertItemColor(Color.Red)
        compose.runOnIdle { baseColor = Color.Magenta }
        assertItemColor(Color.Magenta)
    }

    @Test
    fun localMotionAnimatesItemWidthColorTypographyAndValueMargin() {
        var selected by mutableStateOf(false)
        val duration = 1_000
        var fontSize = 0.sp
        var tint = Color.Unspecified
        val motionStyle = SegmentItemMotionStyle.builder()
            .minWidth(transition { segment {} changesWith { finite(tween(duration, easing = LinearEasing)) } })
            .backgroundColor(transition { segment {} changesWith { finite(tween(duration)) } })
            .valueMargin(transition { segment {} changesWith { finite(tween(duration, easing = LinearEasing)) } })
            .labelStyle(transition { segment {} changesWith { finite(tween(duration)) } })
            .startContentColor(transition { segment {} changesWith { finite(tween(duration)) } })
            .style()
        compose.setContent {
            CompositionLocalProvider(LocalSegmentItemMotionStyle provides motionStyle) {
                SegmentItem(
                    motion = rememberSegmentItemMotion(),
                    isSelected = selected,
                    modifier = Modifier.testTag("item"),
                    style = SegmentItemStyle.builder()
                        .colors {
                            backgroundColor(Color.Red.asStatefulBrush(Selected to Color.Blue))
                            startContentColor(Color.Red.asStatefulBrush(Selected to Color.Blue))
                        }
                        .labelStyle(
                            TextStyle(fontSize = 12.sp).asStatefulValue(Selected to TextStyle(fontSize = 24.sp)),
                        )
                        .dimensions {
                            minWidth(120.dp.asStatefulValue(Selected to 240.dp))
                            paddingStart(0.dp)
                            paddingEnd(0.dp)
                            valueMargin(4.dp.asStatefulValue(Selected to 24.dp))
                        }.style(),
                    labelContent = {
                        fontSize = LocalTextStyle.current.fontSize
                        Box(Modifier.size(10.dp).testTag("label"))
                    },
                    valueContent = { Box(Modifier.size(10.dp).testTag("value")) },
                    startContent = { tint = (LocalTintBrushProducer.current!!.invoke() as SolidColor).value },
                )
            }
        }
        compose.onNodeWithTag("item").assertWidthIsEqualTo(120.dp)
        compose.mainClock.autoAdvance = false
        compose.runOnIdle { selected = true }
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        compose.mainClock.advanceTimeByFrame()
        compose.mainClock.advanceTimeBy(400)
        val bounds = compose.onNodeWithTag("item").getUnclippedBoundsInRoot()
        val intermediateWidth = bounds.right - bounds.left
        assertTrue("Intermediate width: $intermediateWidth", intermediateWidth > 120.dp && intermediateWidth < 240.dp)
        val intermediateMargin = margin()
        assertTrue(intermediateMargin > 4.dp && intermediateMargin < 24.dp)
        val intermediateColor = itemColor()
        assertFalse(intermediateColor == Color.Red || intermediateColor == Color.Blue)
        compose.runOnIdle {
            assertTrue(fontSize.value > 12f && fontSize.value < 24f)
            assertFalse(tint == Color.Red || tint == Color.Blue)
        }
        compose.mainClock.advanceTimeBy(1_100)
        compose.onNodeWithTag("item").assertWidthIsEqualTo(240.dp)
        assertMargin(24.dp)
        assertItemColor(Color.Blue)
        compose.runOnIdle {
            assertEquals(24.sp, fontSize)
            assertEquals(Color.Blue, tint)
        }
    }

    @Test
    fun containersResolveGapPaddingAndDividerOrientation() {
        val semantic = MutableSemanticStateSource()
        var horizontalDivider: DividerOrientation? = null
        var verticalDivider: DividerOrientation? = null
        compose.setContent {
            val style = SegmentStyle.builder().dimensions {
                gap(Dp.Unspecified.asStatefulValue(Selected to 8.dp))
                paddingStart(2.dp.asStatefulValue(Selected to 6.dp))
                paddingEnd(2.dp.asStatefulValue(Selected to 6.dp))
                dividerPaddingStart(0.dp)
                dividerPaddingEnd(0.dp)
            }.style()
            val motion = rememberSegmentMotion(motionContext = rememberMotionContext(semantic))
            Column {
                SegmentHorizontal(motion, Modifier.testTag("horizontal"), style, stretch = false) {
                    segmentItem { Box(Modifier.size(10.dp).testTag("h1")) }
                    segmentItem { Box(Modifier.size(10.dp).testTag("h2")) }
                    divider { horizontalDivider = LocalDividerOrientation.current }
                }
                SegmentVertical(motion, Modifier.testTag("vertical"), style, hasBackground = false) {
                    segmentItem { Box(Modifier.size(10.dp).testTag("v1")) }
                    segmentItem { Box(Modifier.size(10.dp).testTag("v2")) }
                    divider { verticalDivider = LocalDividerOrientation.current }
                }
            }
        }
        assertEquals(0.dp, horizontalGap())
        assertEquals(0.dp, verticalGap())
        compose.runOnIdle { semantic.set(InteractiveState.Selected, true) }
        assertEquals(8.dp, horizontalGap())
        assertEquals(8.dp, verticalGap())
        compose.runOnIdle {
            assertEquals(DividerOrientation.Vertical, horizontalDivider)
            assertEquals(DividerOrientation.Horizontal, verticalDivider)
        }
    }

    @Test
    fun containerMotionAnimatesGapAndBackgroundFromLocalStyle() {
        val semantic = MutableSemanticStateSource()
        val localMotion = SegmentMotionStyle.builder()
            .gap(transition { segment {} changesWith { finite(tween(1_000, easing = LinearEasing)) } })
            .backgroundColor(transition { segment {} changesWith { finite(tween(1_000)) } })
            .style()
        compose.setContent {
            CompositionLocalProvider(LocalSegmentMotionStyle provides localMotion) {
                SegmentHorizontal(
                    motion = rememberSegmentMotion(motionContext = rememberMotionContext(semantic)),
                    style = SegmentStyle.builder()
                        .colors { backgroundColor(Color.Red.asStatefulBrush(Selected to Color.Blue)) }
                        .dimensions { gap(0.dp.asStatefulValue(Selected to 40.dp)) }.style(),
                    stretch = false,
                ) {
                    segmentItem { Box(Modifier.size(10.dp).testTag("h1")) }
                    segmentItem { Box(Modifier.size(10.dp).testTag("h2")) }
                }
            }
        }
        assertEquals(0.dp, horizontalGap())
        compose.mainClock.autoAdvance = false
        compose.runOnIdle { semantic.set(InteractiveState.Selected, true) }
        compose.mainClock.advanceTimeByFrame()
        compose.mainClock.advanceTimeByFrame()
        compose.mainClock.advanceTimeBy(400)
        assertTrue(horizontalGap() > 0.dp && horizontalGap() < 40.dp)
        compose.mainClock.advanceTimeBy(1_100)
        assertEquals(40.dp, horizontalGap())
    }

    @Test
    fun builtInCounterSharesSelectionAndInteractionWithoutAffectingSibling() {
        var selected by mutableStateOf(false)
        val interaction = MutableInteractionSource()
        val press = PressInteraction.Press(Offset.Zero)
        compose.setContent {
            val counter = CounterStyle.builder().colors {
                backgroundBrush(
                    Color.Red.asStatefulBrush(
                        Selected to Color.Green,
                        (Selected + InteractiveState.Pressed) to Color.Blue,
                    ),
                )
            }.style()
            val style = SegmentItemStyle.builder().counterStyle(counter)
                .colors { backgroundColor(Color.White) }.style()
            Column {
                SegmentItem(
                    motion = rememberSegmentItemMotion(motionContext = rememberMotionContext(interaction)),
                    modifier = Modifier.testTag("item"),
                    label = "",
                    counter = "7",
                    style = style,
                    isSelected = selected,
                )
                SegmentItem(label = "", modifier = Modifier.testTag("sibling"), counter = "8", style = style)
            }
        }
        assertTrue(colorWidth(Color.Red) > 0)
        compose.runOnIdle { selected = true }
        assertTrue(colorWidth(Color.Green) > 0)
        assertTrue(colorWidth(Color.Red, "sibling") > 0)
        compose.runOnIdle { interaction.tryEmit(press) }
        assertTrue(colorWidth(Color.Blue) > 0)
        assertTrue(colorWidth(Color.Red, "sibling") > 0)
    }

    @Test
    fun gradientBackgroundAndDisabledAlphaAreRendered() {
        compose.setContent {
            Box(Modifier.background(Color.White)) {
                SegmentItem(
                    label = "",
                    enabled = false,
                    counter = "",
                    style = SegmentItemStyle.builder()
                        .colors { backgroundColor(Brush.horizontalGradient(listOf(Color.Red, Color.Blue))) }
                        .disabledAlpha(0.5f)
                        .dimensions {
                            minWidth(100.dp)
                            minHeight(40.dp)
                        }.style(),
                    modifier = Modifier.testTag("item"),
                )
            }
        }
        val pixels = pixels("item")
        val left = pixels[5, 20]
        val right = pixels[94, 20]
        assertTrue(left.red > left.blue)
        assertTrue(right.blue > right.red)
        assertEquals(0.5f, left.green, 0.01f)
        assertEquals(0.5f, right.green, 0.01f)
    }

    @Test
    fun selectedShapeUpdatesBackgroundAndFocusedSelectorTogether() {
        var selected by mutableStateOf(false)
        val interaction = MutableInteractionSource()
        val square: CornerBasedShape = RoundedCornerShape(0.dp)
        val rounded: CornerBasedShape = RoundedCornerShape(16.dp)
        var focusedShape: Shape? = null
        val border = object : FocusSelectorBorder by FocusSelectorBorders.none() {
            override fun Modifier.applyBorderToModifier(
                scale: Float,
                componentShape: Shape?,
                isFocused: () -> Boolean,
            ): Modifier {
                if (isFocused()) focusedShape = componentShape
                return this
            }
        }
        val settings = FocusSelectorSettings.builder().border(border).build()
        compose.setContent {
            CompositionLocalProvider(LocalFocusSelectorSettings provides settings) {
                Box(Modifier.background(Color.White)) {
                    SegmentItem(
                        label = "",
                        isSelected = selected,
                        interactionSource = interaction,
                        style = SegmentItemStyle.builder()
                            .shape(square.asStatefulValue(Selected to rounded))
                            .colors { backgroundColor(Color.Red) }
                            .dimensions {
                                minWidth(100.dp)
                                minHeight(40.dp)
                            }.style(),
                        modifier = Modifier.testTag("item"),
                    )
                }
            }
        }
        compose.runOnIdle { interaction.tryEmit(FocusInteraction.Focus()) }
        assertItemColor(Color.Red)
        compose.runOnIdle {
            assertEquals(square, focusedShape)
            selected = true
        }
        assertItemColor(Color.White)
        compose.runOnIdle { assertEquals(rounded, focusedShape) }
        assertEquals(Color.Red, pixels("item")[50, 20])
    }

    @Test
    fun buttonTextMarginUsesSemanticSelection() {
        val semantic = MutableSemanticStateSource()
        compose.setContent {
            Button(
                label = "Label",
                value = "Value",
                onClick = {},
                motion = rememberButtonMotion(motionContext = rememberMotionContext(semantic)),
                style = ButtonStyle.basicButtonBuilder().dimensions {
                    valueMargin(4.dp.asStatefulValue(Selected to 20.dp))
                }.style(),
            )
        }
        fun textMargin(): Dp = compose.onNodeWithText("Value", useUnmergedTree = true)
            .getUnclippedBoundsInRoot().left - compose.onNodeWithText("Label", useUnmergedTree = true)
            .getUnclippedBoundsInRoot().right
        assertEquals(4.dp, textMargin())
        compose.runOnIdle { semantic.set(InteractiveState.Selected, true) }
        assertEquals(20.dp, textMargin())
    }

    @Composable
    private fun itemStyle(): SegmentItemStyle = SegmentItemStyle.builder()
        .colors {
            backgroundColor(Color.White)
            startContentColor(Color.Red)
            endContentColor(Color.Blue)
        }
        .dimensions {
            minHeight(32.dp.asStatefulValue(Selected to 48.dp))
            minWidth(160.dp)
            paddingStart(0.dp)
            paddingEnd(0.dp)
            startContentSize(16.dp)
            endContentSize(24.dp.asStatefulValue(Selected to 32.dp))
            valueMargin(4.dp.asStatefulValue(Selected to 12.dp))
        }.style()

    private fun margin(): Dp = compose.onNodeWithTag("value").getUnclippedBoundsInRoot().left -
        compose.onNodeWithTag("label").getUnclippedBoundsInRoot().right

    private fun assertMargin(expected: Dp) = assertEquals(expected, margin())

    private fun horizontalGap(): Dp = compose.onNodeWithTag("h2").getUnclippedBoundsInRoot().left -
        compose.onNodeWithTag("h1").getUnclippedBoundsInRoot().right

    private fun verticalGap(): Dp = compose.onNodeWithTag("v2").getUnclippedBoundsInRoot().top -
        compose.onNodeWithTag("v1").getUnclippedBoundsInRoot().bottom

    private fun itemColor(): Color = pixels("item")[0, 0]

    private fun assertItemColor(expected: Color) = assertEquals(expected, itemColor())

    private fun colorWidth(color: Color, tag: String = "item"): Int {
        val pixels = pixels(tag)
        return (0 until pixels.width).count { x -> (0 until pixels.height).any { y -> pixels[x, y] == color } }
    }

    private fun pixels(tag: String): androidx.compose.ui.graphics.PixelMap {
        val bounds = compose.onNodeWithTag(tag).fetchSemanticsNode().boundsInWindow
        val view = compose.activity.findViewById<View>(android.R.id.content)
        val location = IntArray(2)
        compose.runOnIdle { view.getLocationInWindow(location) }
        val bitmap = requireNotNull(view.fetchImage(RoborazziOptions.RecordOptions()))
        return Bitmap.createBitmap(
            bitmap,
            bounds.left.roundToInt() - location[0],
            bounds.top.roundToInt() - location[1],
            bounds.width.roundToInt(),
            bounds.height.roundToInt(),
        ).asImageBitmap().toPixelMap()
    }

    private companion object {
        val Selected = setOf(InteractiveState.Selected)
    }
}
