package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.icontext.BaseIconText
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.badge.BadgeMotionStyle
import com.sdds.compose.uikit.motion.components.badge.IconBadgeMotionStyle
import com.sdds.compose.uikit.motion.components.badge.rememberBadgeMotion
import com.sdds.compose.uikit.motion.components.badge.rememberIconBadgeMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент Badge с текстом и иконкой
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param label текст
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param interactionSource источник взаимодействий
 * @param motion объект анимаций
 */
@Composable
fun Badge(
    modifier: Modifier = Modifier,
    style: BadgeStyle = LocalBadgeStyle.current,
    label: String = "",
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<BadgeMotionStyle> = rememberBadgeMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val labelStyle = style.labelStyles.getTextStyleAsState(
        motion.context,
        motion.style.labelStyle,
    )
    val dimens = style.dimensions.toDimensionsSet(interactionSource)
    val colors = style.colors.toBadgeColorsSet(motion)
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shape,
            backgroundColor = { background.value },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        colorsSet = colors,
        labelContent = label,
        labelStyle = labelStyle.value,
        startContent = startContent,
        endContent = endContent,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Badge с кастомным контентом в центре и иконкой
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param label контент в центре
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param interactionSource источник взаимодействий
 * @param motion объект анимаций
 */
@Composable
fun Badge(
    modifier: Modifier = Modifier,
    style: BadgeStyle = LocalBadgeStyle.current,
    label: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<BadgeMotionStyle> = rememberBadgeMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val dimens = style.dimensions.toDimensionsSet(interactionSource)
    val colors = style.colors.toBadgeColorsSet(motion)
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shape,
            backgroundColor = { background.value },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        colorsSet = colors,
        labelContent = label,
        labelStyle = style.labelStyle,
        startContent = startContent,
        endContent = endContent,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Badge c иконкой
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param content контент (иконка)
 * @param interactionSource источник взаимодействий
 * @param motion объект анимаций
 */
@Composable
fun IconBadge(
    modifier: Modifier = Modifier,
    style: BadgeStyle = LocalIconBadgeStyle.current,
    content: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<IconBadgeMotionStyle> = rememberIconBadgeMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val dimens = style.dimensions.toDimensionsSet(interactionSource)
    val colors = style.colors.toIconBadgeColorsSet(motion)
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shape,
            backgroundColor = { background.value },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        colorsSet = colors,
        startContent = content,
        interactionSource = interactionSource,
    )
}

@Composable
internal fun BadgeDimensions.toDimensionsSet(
    interactionSource: InteractionSource,
): BaseIconText.Dimensions {
    // В будущем нужно будет получить из BadgeMotionStyle
    // Dp values и прокинуть их в маппер
    return BaseIconText.Dimensions(
        height = this.heightValues.getValue(interactionSource),
        endContentSize = this.endContentSizeValues.getValue(interactionSource),
        startContentSize = this.startContentSizeValues.getValue(interactionSource),
        endContentMargin = this.endContentMarginValues.getValue(interactionSource),
        startContentMargin = this.startContentMarginValues.getValue(interactionSource),
        endPadding = this.endPaddingValues,
        startPadding = this.startPaddingValues,
    )
}

@Composable
internal fun BadgeColors.toBadgeColorsSet(
    motion: Motion<BadgeMotionStyle>,
): BaseIconText.Brushes {
    return BaseIconText.Brushes(
        contentBrush = this.contentBrush.getBrushAsState(
            motion.context,
            motion.style.contentColor,
        ).value,
        labelBrush = this.labelBrush.getBrushAsState(
            motion.context,
            motion.style.labelColor,
        ).value,
        startContentBrush = this.startContentBrush.getBrushAsState(
            motion.context,
            motion.style.startContentColor,
        ).value,
        endContentBrush = this.endContentBrush.getBrushAsState(
            motion.context,
            motion.style.endContentColor,
        ).value,
    )
}

@Composable
internal fun BadgeColors.toIconBadgeColorsSet(
    motion: Motion<IconBadgeMotionStyle>,
): BaseIconText.Brushes {
    return BaseIconText.Brushes(
        contentBrush = this.startContentBrush.getBrushAsState(
            motion.context,
            motion.style.startContentColor,
        ).value,
        startContentBrush = this.startContentBrush.getBrushAsState(
            motion.context,
            motion.style.startContentColor,
        ).value,
    )
}
