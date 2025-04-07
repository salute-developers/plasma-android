package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Компонента Divider - разделитель
 * @param modifier модификатор
 * @param style стиль разделителя [DividerStyle]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Divider(
    modifier: Modifier = Modifier,
    style: DividerStyle = LocalDividerStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val thickness = style.dimensions.thickness
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    Box(
        modifier
            .fillMaxWidth()
            .height(targetThickness)
            .background(
                color = style.color.backgroundColor.colorForInteraction(interactionSource),
                shape = style.shape,
            ),
    )
}
