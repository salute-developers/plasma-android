package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValueAsState
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
    val thickness by style.dimensions.thicknessValues.getValueAsState(motion.context)
    val bgColor = style.color.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val shape by style.shapes.getValueAsState(motion.context)
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    val orientationBasedModifier = when (orientation) {
        DividerOrientation.Horizontal -> Modifier.height(targetThickness)
        DividerOrientation.Vertical -> Modifier.width(targetThickness)
    }

    val lengthModifier = if (fillAvailableLength) {
        when (orientation) {
            DividerOrientation.Horizontal -> Modifier.fillMaxWidth()
            DividerOrientation.Vertical -> Modifier.fillMaxHeight()
        }
    } else {
        Modifier
    }
    Box(
        orientationBasedModifier
            .then(lengthModifier)
            .then(modifier)
            .backgroundBrush(
                brushProducer = { bgColor.value },
                shape = shape,
            ),
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
