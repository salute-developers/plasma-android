package com.sdds.compose.uikit

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
    val dimens = style.dimensions.toDimensionsSet()
    val colors = style.colors.toBadgeColorsSet()
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shapes.getValue(interactionSource),
            backgroundColor = { background.value },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        brushesSet = colors,
        labelContent = label,
        labelStyle = style.labelStyles,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
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
    val dimens = style.dimensions.toDimensionsSet()
    val colors = style.colors.toBadgeColorsSet()
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shapes.getValue(interactionSource),
            backgroundColor = { background.value },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        brushesSet = colors,
        labelContent = label,
        labelStyle = style.labelStyles,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
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
    val dimens = style.dimensions.toDimensionsSet()
    val colors = style.colors.toIconBadgeColorsSet()
    val background = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shapes.getValue(interactionSource),
            backgroundColor = { background.value },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        brushesSet = colors,
        startContent = content,
        interactionSource = interactionSource,
    )
}

@Composable
internal fun BadgeDimensions.toDimensionsSet(): BaseIconText.Dimensions {
    return BaseIconText.Dimensions(
        height = this.heightValues,
        endContentSize = this.endContentSizeValues,
        startContentSize = this.startContentSizeValues,
        endContentMargin = this.endContentMarginValues,
        startContentMargin = this.startContentMarginValues,
        endPadding = this.endPaddingValues,
        startPadding = this.startPaddingValues,
    )
}

@Composable
internal fun BadgeColors.toBadgeColorsSet() = BaseIconText.Brushes(
    contentBrush = this.contentBrush,
    labelBrush = this.labelBrush,
    startContentBrush = this.startContentBrush,
    endContentBrush = this.endContentBrush,
)

@Composable
internal fun BadgeColors.toIconBadgeColorsSet() = BaseIconText.Brushes(
    contentBrush = this.startContentBrush,
    startContentBrush = this.startContentBrush,
)
