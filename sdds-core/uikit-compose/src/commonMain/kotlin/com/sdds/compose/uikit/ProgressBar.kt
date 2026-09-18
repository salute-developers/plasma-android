package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.BaseProgress
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.progressbar.ProgressBarMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState

/**
 * Компонент ProgressBar.
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param style стиль компонента
 * @param interactionSource источник взаимодействия
 */
@Composable
@NonRestartableComposable
fun ProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    style: ProgressBarStyle = LocalProgressBarStyle.current,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
) {
    val bg = style.colorValues.backgroundBrush ?: Color.Gray.asStatefulBrush()
    val bgProducer = bg.getValueAsState(interactionSource)
    val indicator = style.colorValues.indicatorBrush ?: Color.Black.asStatefulBrush()
    val indicatorProducer = indicator.getValueAsState(interactionSource)
    val indicatorStateHeight = style.dimensionValues.indicatorHeightValues.getValueAsState(interactionSource)
    val backgroundStateHeight = style.dimensionValues.backgroundHeightValues.getValueAsState(interactionSource)
    val indicatorStateShape = style.indicatorShapes.getValueAsState(interactionSource)
    val backgroundStateShape = style.backgroundShapes.getValueAsState(interactionSource)
    BaseProgress(
        progress = progress,
        modifier = modifier,
        indicatorBrush = { indicatorProducer.value },
        backgroundBrush = { bgProducer.value },
        indicatorStateHeight = indicatorStateHeight,
        backgroundStateHeight = backgroundStateHeight,
        indicatorStateShape = indicatorStateShape,
        backgroundStateShape = backgroundStateShape,
    )
}

/**
 * Компонент ProgressBar.
 * @param motion объект анимаций
 * @param progress значение прогресса от 0.0 до 1.0
 * @param modifier модификатор
 * @param style стиль компонента
 */
@Composable
@NonRestartableComposable
fun ProgressBar(
    motion: Motion<ProgressBarMotionStyle>,
    progress: Float,
    modifier: Modifier = Modifier,
    style: ProgressBarStyle = LocalProgressBarStyle.current,
) {
    val bg = style.colorValues.backgroundBrush ?: Color.Gray.asStatefulBrush()
    val bgProducer = bg.getBrushAsState(motion.context, motion.style.backgroundColor)
    val indicator = style.colorValues.indicatorBrush ?: Color.Black.asStatefulBrush()
    val indicatorProducer = indicator.getBrushAsState(motion.context, motion.style.indicatorColor)
    val indicatorStateHeight = style.dimensionValues.indicatorHeightValues.getValueAsState(motion.context)
    val backgroundStateHeight = style.dimensionValues.backgroundHeightValues.getValueAsState(motion.context)
    val indicatorStateShape = style.indicatorShapes.getValueAsState(motion.context)
    val backgroundStateShape = style.backgroundShapes.getValueAsState(motion.context)
    BaseProgress(
        progress = progress,
        modifier = modifier,
        indicatorBrush = { indicatorProducer.value },
        backgroundBrush = { bgProducer.value },
        indicatorStateHeight = indicatorStateHeight,
        backgroundStateHeight = backgroundStateHeight,
        indicatorStateShape = indicatorStateShape,
        backgroundStateShape = backgroundStateShape,
    )
}
