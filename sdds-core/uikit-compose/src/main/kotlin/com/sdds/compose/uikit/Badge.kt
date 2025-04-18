package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.icontext.BaseIconText

/**
 * Компонент Badge с текстом и иконкой
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param label текст
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Badge(
    modifier: Modifier = Modifier,
    style: BadgeStyle = LocalBadgeStyle.current,
    label: String = "",
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val labelStyle = style.labelStyle
    val dimens = style.dimensions.toDimensionsSet()
    val colors = style.colors.toColorsSet()
    val background = style.colors.backgroundColor.colorForInteractionAsState(interactionSource)
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shape,
            backgroundColor = { SolidColor(background.value) },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        colorsSet = colors,
        labelContent = label,
        labelStyle = labelStyle,
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
 */
@Composable
fun Badge(
    modifier: Modifier = Modifier,
    style: BadgeStyle = LocalBadgeStyle.current,
    label: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimens = style.dimensions.toDimensionsSet()
    val colors = style.colors.toColorsSet()
    val background = style.colors.backgroundColor.colorForInteractionAsState(interactionSource)
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shape,
            backgroundColor = { SolidColor(background.value) },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        colorsSet = colors,
        labelContent = label,
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
 */
@Composable
fun IconBadge(
    modifier: Modifier = Modifier,
    style: BadgeStyle = LocalIconBadgeStyle.current,
    content: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimens = style.dimensions.toDimensionsSet()
    val colors = style.colors.toColorsSet()
    val background = style.colors.backgroundColor.colorForInteractionAsState(interactionSource)
    BaseIconText(
        modifier = modifier.surface(
            shape = style.shape,
            backgroundColor = { SolidColor(background.value) },
            interactionSource = interactionSource,
        ),
        dimensionsSet = dimens,
        colorsSet = colors,
        startContent = content,
        interactionSource = interactionSource,
    )
}

internal fun BadgeDimensions.toDimensionsSet(): BaseIconText.Dimensions {
    return BaseIconText.Dimensions(
        height = this.height,
        endContentSize = this.endContentSize,
        startContentSize = this.startContentSize,
        endContentMargin = this.endContentMargin,
        startContentMargin = this.startContentMargin,
        endPadding = this.endPadding,
        startPadding = this.startPadding,
    )
}

internal fun BadgeColors.toColorsSet(): BaseIconText.Colors {
    return BaseIconText.Colors(
        contentColor = this.contentColor,
        labelColor = this.labelColor,
        startContentColor = this.startContentColor,
        endContentColor = this.endContentColor,
    )
}
