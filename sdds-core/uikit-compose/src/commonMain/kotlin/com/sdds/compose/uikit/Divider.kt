package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.common.drawOutline
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.divider.DividerMotionStyle
import com.sdds.compose.uikit.motion.components.divider.rememberDividerMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * CompositionLocal для [DividerOrientation]
 */
val LocalDividerOrientation = compositionLocalOf { DividerOrientation.Horizontal }

/**
 * Компонент Divider - разделитель
 * @param modifier модификатор
 * @param style стиль разделителя [DividerStyle]
 * @param interactionSource источник взаимодействий
 * @param orientation ориентация разделителя [DividerOrientation]
 */
@Composable
fun Divider(
    modifier: Modifier = Modifier,
    style: DividerStyle = LocalDividerStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    orientation: DividerOrientation = LocalDividerOrientation.current,
    fillAvailableLength: Boolean = true,
    motion: Motion<DividerMotionStyle> = rememberDividerMotion(
        motionContext = rememberMotionContext { interactionSource },
    ),
) {
    val size by style.dimensions.size.getValueAsState(motion.context)
    val thickness by style.dimensions.thicknessValues.getValueAsState(motion.context)
    val bgColor = style.color.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val shape by style.shapes.getValueAsState(motion.context)
    val targetSize = if (size == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        size
    }
    val orientationBasedModifier = when (orientation) {
        DividerOrientation.Horizontal -> Modifier.height(targetSize)
        DividerOrientation.Vertical -> Modifier.width(targetSize)
    }

    val lengthModifier = if (fillAvailableLength) {
        when (orientation) {
            DividerOrientation.Horizontal -> Modifier.fillMaxWidth()
            DividerOrientation.Vertical -> Modifier.fillMaxHeight()
        }
    } else {
        Modifier
    }
    val lineModifier = if (thickness == size) {
        Modifier.backgroundBrush(
            brushProducer = { bgColor.value },
            shape = shape,
        )
    } else {
        Modifier.drawDivider(
            orientation = orientation,
            lineThickness = thickness,
            brush = { bgColor.value },
            shape = shape,
        )
    }
    Box(
        orientationBasedModifier
            .then(lengthModifier)
            .then(modifier)
            .then(lineModifier),
    )
}

/**
 * Ориентация раздлелителя
 */
enum class DividerOrientation {
    /**
     * Горизонтальный разделитель
     */
    Horizontal,

    /**
     * Вертикальный разделитель
     */
    Vertical,
}

private fun Modifier.drawDivider(
    orientation: DividerOrientation,
    lineThickness: Dp,
    brush: BrushProducer,
    shape: CornerBasedShape,
): Modifier = drawWithCache {
    val thicknessPx = lineThickness.toPx()
    val lineSize: Size
    val offset: Offset

    when (orientation) {
        DividerOrientation.Horizontal -> {
            lineSize = Size(width = size.width, height = thicknessPx)
            offset = Offset(x = 0f, y = (size.height - thicknessPx) / 2)
        }

        DividerOrientation.Vertical -> {
            lineSize = Size(thicknessPx, height = size.height)
            offset = Offset(x = (size.width - thicknessPx) / 2, y = 0f)
        }
    }
    val outline = shape.createOutline(lineSize, layoutDirection, this)
    onDrawBehind {
        withTransform(
            {
                translate(offset.x, offset.y)
            },
        ) {
            drawOutline(outline = outline, brush = brush())
        }
    }
}
