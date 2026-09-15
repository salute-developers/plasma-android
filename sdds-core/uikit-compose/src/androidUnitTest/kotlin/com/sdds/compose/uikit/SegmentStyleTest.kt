package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulColor
import com.sdds.compose.uikit.interactions.asStatefulValue
import org.junit.Assert.assertEquals
import org.junit.Test

@Suppress("DEPRECATION")
class SegmentStyleTest {

    @Test
    fun `legacy static builders and getters retain their values`() {
        val shape = RoundedCornerShape(12.dp)
        val typography = TextStyle(fontSize = 18.sp)
        val container = SegmentStyle.builder().shape(shape).style()
        val item = SegmentItemStyle.builder().shape(shape).labelStyle(typography).valueStyle(typography).style()
        val dimensions = SegmentItemDimensions.builder().minHeight(48.dp).startContentSize(16.dp)
            .endContentSize(24.dp).valueMargin(8.dp).build()

        assertEquals(shape, container.shape)
        assertEquals(shape, item.shape)
        assertEquals(typography, item.labelStyle)
        assertEquals(typography, item.valueStyle)
        assertEquals(48.dp, dimensions.minHeight)
        assertEquals(16.dp, dimensions.startContentSize)
        assertEquals(24.dp, dimensions.endContentSize)
        assertEquals(8.dp, dimensions.valueMargin)
        assertEquals(0.4f, item.disabledAlpha)
        assertEquals(CircleShape, SegmentStyle.builder().style().shapes.getDefaultValue())
    }

    @Test
    fun `legacy getters use default values while new properties preserve selection`() {
        val selected = setOf(InteractiveState.Selected)
        val defaultShape = RoundedCornerShape(4.dp)
        val selectedShape = RoundedCornerShape(16.dp)
        val item = SegmentItemStyle.builder()
            .shape(defaultShape.asStatefulValue(selected to selectedShape))
            .style()
        val dimensions = SegmentDimensions.builder().gap(4.dp.asStatefulValue(selected to 12.dp)).build()

        assertEquals(defaultShape, item.shape)
        assertEquals(selectedShape, item.shapes.getValue(selected))
        assertEquals(4.dp, dimensions.gap)
        assertEquals(12.dp, dimensions.gapValues.getValue(selected))
    }

    @Test
    fun `interactive color adapters retain selected and combined states`() {
        val selected = setOf(InteractiveState.Selected)
        val pressed = selected + InteractiveState.Pressed
        val original = Color.Red.asInteractive(selected to Color.Green, pressed to Color.Blue)
        val container = SegmentColors.builder().backgroundColor(original).build()
        val item = SegmentItemColors.builder().backgroundColor(original).labelColor(original)
            .valueColor(original).startContentColor(original).endContentColor(original).build()
        val brushes = listOf(
            container.backgroundBrush,
            item.backgroundBrush,
            item.labelBrush,
            item.valueBrush,
            item.startContentBrush,
            item.endContentBrush,
        )
        val legacy = listOf(
            container.backgroundColor,
            item.backgroundColor,
            item.labelColor,
            item.valueColor,
            item.startContentColor,
            item.endContentColor,
        )
        brushes.forEach {
            assertEquals(SolidColor(Color.Red), it.getDefaultValue())
            assertEquals(SolidColor(Color.Green), it.getValue(selected))
            assertEquals(SolidColor(Color.Blue), it.getValue(pressed))
        }
        legacy.forEach {
            val colors = it.asStatefulColor()
            assertEquals(Color.Red, colors.getDefaultValue())
            assertEquals(Color.Green, colors.getValue(selected))
            assertEquals(Color.Blue, colors.getValue(pressed))
        }
    }

    @Test
    fun `gradient stays intact and only legacy color uses transparent fallback`() {
        val selected = setOf(InteractiveState.Selected)
        val gradient = Brush.horizontalGradient(listOf(Color.Red, Color.Blue))
        val brush: Brush = SolidColor(Color.Green)
        val colors = SegmentItemColors.builder()
            .backgroundColor(brush.asStatefulValue(selected to gradient))
            .build()

        assertEquals(gradient, colors.backgroundBrush.getValue(selected))
        assertEquals(Color.Green, colors.backgroundColor.asStatefulColor().getDefaultValue())
        assertEquals(Color.Transparent, colors.backgroundColor.asStatefulColor().getValue(selected))
    }
}
