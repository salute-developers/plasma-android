package com.sdds.compose.uikit

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulColor
import com.sdds.compose.uikit.interactions.asStatefulValue
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

@Suppress("DEPRECATION")
class SelectItemStyleTest {

    @Test
    fun `defaults and arbitrary shape retain the previous contract`() {
        val style = SelectItemStyle.builder().style()
        assertEquals(RectangleShape, style.shapes.getDefaultValue())
        assertEquals(SelectItemType.Multiple, style.itemType)
        assertEquals(0.4f, style.disableAlpha)
        assertNull(style.iconSource)
        assertEquals(24.dp, style.dimensions.controlSize)
        assertEquals(8.dp, style.dimensions.controlMargin)
        assertEquals(48.dp, style.dimensions.height)
        assertEquals(SolidColor(Color.Gray), style.colors.iconBrush.getDefaultValue())
        assertEquals(SolidColor(Color.Transparent), style.colors.backgroundBrush.getDefaultValue())
        assertEquals(
            SolidColor(Color.LightGray),
            style.colors.backgroundBrush.getValue(setOf(InteractiveState.Focused)),
        )
        val triangle: Shape = GenericShape { size, _ ->
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        assertEquals(triangle, SelectItemStyle.builder().shape(triangle).style().shape)
        val stateful = SelectItemStyle.builder()
            .shape(RectangleShape.asStatefulValue(Selected to triangle)).style()
        assertEquals(RectangleShape, stateful.shape)
        assertEquals(triangle, stateful.shapes.getValue(Selected))
    }

    @Test
    fun `all dimension builders support static and stateful values without normalizing nonfinite dp`() {
        val static = SelectItemDimensions.builder().controlSize(1.dp).controlMargin(2.dp)
            .paddingStart(3.dp).paddingEnd(4.dp).paddingTop(5.dp).paddingBottom(6.dp).height(7.dp).build()
        assertEquals(
            (1..7).map { it.dp },
            listOf(
                static.controlSize,
                static.controlMargin,
                static.paddingStart,
                static.paddingEnd,
                static.paddingTop,
                static.paddingBottom,
                static.height,
            ),
        )
        val values = 10.dp.asStatefulValue(Selected to 20.dp)
        val stateful = SelectItemDimensions.builder().controlSize(values).controlMargin(values)
            .paddingStart(values).paddingEnd(values).paddingTop(values).paddingBottom(values).height(values).build()
        listOf(
            stateful.controlSizeValues,
            stateful.controlMarginValues,
            stateful.paddingStartValues,
            stateful.paddingEndValues,
            stateful.paddingTopValues,
            stateful.paddingBottomValues,
            stateful.heightValues,
        ).forEach {
            assertEquals(10.dp, it.getDefaultValue())
            assertEquals(20.dp, it.getValue(Selected))
        }
        val unspecified = SelectItemDimensions.builder().height(Dp.Unspecified).controlSize(Dp.Infinity).build()
        assertEquals(Dp.Unspecified, unspecified.heightValues.getDefaultValue())
        assertEquals(Dp.Infinity, unspecified.controlSizeValues.getDefaultValue())
    }

    @Test
    fun `legacy color builders retain all states in brushes while old getters are transparent`() {
        val pressed = Selected + InteractiveState.Pressed
        val original = Color.Red.asInteractive(Selected to Color.Green, pressed to Color.Blue)
        val colors = SelectItemColors.builder().backgroundColor(original).iconColor(original).build()
        listOf(colors.backgroundBrush, colors.iconBrush).forEach {
            assertEquals(SolidColor(Color.Red), it.getDefaultValue())
            assertEquals(SolidColor(Color.Green), it.getValue(Selected))
            assertEquals(SolidColor(Color.Blue), it.getValue(pressed))
        }
        listOf(colors.backgroundColor, colors.iconColor).forEach {
            val legacy = it.asStatefulColor()
            assertEquals(Color.Transparent, legacy.getDefaultValue())
            assertEquals(Color.Transparent, legacy.getValue(Selected))
            assertEquals(Color.Transparent, legacy.getValue(pressed))
        }
        assertEquals(
            Color.Transparent,
            SelectItemColors.builder().iconColor(Color.Red).build().iconColor.asStatefulColor().getDefaultValue(),
        )
    }

    @Test
    fun `gradient fallback affects only legacy getters`() {
        val gradient = Brush.horizontalGradient(listOf(Color.Red, Color.Blue))
        val base: Brush = SolidColor(Color.Green)
        val colors = SelectItemColors.builder()
            .backgroundColor(base.asStatefulValue(Selected to gradient)).iconColor(gradient).build()
        assertEquals(gradient, colors.backgroundBrush.getValue(Selected))
        assertEquals(gradient, colors.iconBrush.getDefaultValue())
        assertEquals(Color.Transparent, colors.backgroundColor.asStatefulColor().getDefaultValue())
        assertEquals(Color.Transparent, colors.backgroundColor.asStatefulColor().getValue(Selected))
        assertEquals(Color.Transparent, colors.iconColor.asStatefulColor().getDefaultValue())
    }

    private companion object {
        val Selected = setOf(InteractiveState.Selected)
    }
}
