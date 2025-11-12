package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

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
    orientation: DividerOrientation = DividerOrientation.Horizontal,
) {
    val thickness = style.dimensions.thickness
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    val orientationBasedModifier = when (orientation) {
        DividerOrientation.Horizontal ->
            Modifier
                .fillMaxWidth()
                .height(targetThickness)
        DividerOrientation.Vertical ->
            Modifier
                .fillMaxHeight()
                .width(targetThickness)
    }
    Box(
        modifier
            .then(orientationBasedModifier)
            .background(
                color = style.color.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
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
