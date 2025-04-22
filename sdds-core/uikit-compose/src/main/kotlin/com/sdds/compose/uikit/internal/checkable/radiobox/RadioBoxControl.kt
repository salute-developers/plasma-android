package com.sdds.compose.uikit.internal.checkable.radiobox

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxColorValues
import com.sdds.compose.uikit.RadioBoxDimensionValues
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.interactions.getValue

/**
 * Control вида RadioBox для [BaseCheckableLayout]
 * @param checked флаг-индикатор выбора
 * @param modifier модификатор
 * @param dimensions размеры и отступы
 * @param animationDuration длительность анимации
 * @param colors цвета RadioBox
 */
@Composable
internal fun RadioBoxControl(
    checked: Boolean,
    modifier: Modifier = Modifier,
    dimensions: RadioBoxDimensionValues,
    animationDuration: Int,
    colors: RadioBoxColorValues,
    shape: CornerBasedShape,
    iconContent: (@Composable () -> Unit)?,
    interactionSource: MutableInteractionSource,
) {
    val stateSet = remember(checked) { if (checked) setOf(RadioBoxStates.Checked) else emptySet() }

    val iconXTranslate = iconXTranslate(checked, dimensions, animationDuration)
    val iconYTranslate = iconYTranslate(checked, dimensions, animationDuration)
    val iconWidth = iconWidth(checked, dimensions, animationDuration)
    val iconHeight = iconHeight(checked, dimensions, animationDuration)

    val toggleBorderWidth = dimensions.toggleBorderWidth.getValue(interactionSource, stateSet)
    val toggleBorderOffset = dimensions.toggleBorderOffset.getValue(interactionSource, stateSet)
    val toggleColor = colors.toggleColor.colorForInteraction(interactionSource, stateSet)
    val borderColor = colors.toggleBorderColor.colorForInteraction(interactionSource, stateSet)
    val iconColor = colors.toggleIconColor.colorForInteraction(interactionSource, stateSet)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .wrapContentSize(Alignment.Center)
            .requiredWidth(dimensions.toggleWidth)
            .requiredHeight(dimensions.toggleHeight)
            .padding(dimensions.togglePadding)
            .drawWithCache {
                val toggleOutline = createToggleOutline(shape)
                val toggleBorderOutline = createBorderOutline(shape, toggleBorderWidth, toggleBorderOffset)
                val toggleIconOutline = createIconOutline(CircleShape, iconWidth, iconHeight, iconContent)

                onDrawBehind {
                    drawOutline(toggleOutline, toggleColor, style = Fill)
                    translate(
                        left = getBorderOutlineTranslate(toggleBorderWidth, toggleBorderOffset),
                        top = getBorderOutlineTranslate(toggleBorderWidth, toggleBorderOffset),
                    ) {
                        drawOutline(
                            outline = toggleBorderOutline,
                            color = borderColor,
                            style = Stroke(width = toggleBorderWidth.toPx()),
                        )
                    }
                    toggleIconOutline?.let {
                        translate(
                            left = getIconHorizontalTranslate(dimensions) + iconXTranslate.value.toPx(),
                            top = getIconVerticalTranslate(dimensions) + iconYTranslate.value.toPx(),
                        ) {
                            drawOutline(
                                outline = toggleIconOutline,
                                color = iconColor,
                                style = Fill,
                            )
                        }
                    }
                }
            },
    ) {
        iconContent?.let { if (checked) IconContent(iconContent, iconWidth, iconHeight) }
    }
}

@Composable
private fun iconXTranslate(
    checked: Boolean,
    dimensions: RadioBoxDimensionValues,
    animationDuration: Int,
): State<Dp> {
    return animateDpAsState(
        targetValue = if (checked) 0.dp else dimensions.toggleIconWidth / 2,
        animationSpec = tween(durationMillis = animationDuration),
        label = "iconXTranslate",
    )
}

@Composable
private fun iconYTranslate(
    checked: Boolean,
    dimensions: RadioBoxDimensionValues,
    animationDuration: Int,
): State<Dp> {
    return animateDpAsState(
        targetValue = if (checked) 0.dp else dimensions.toggleIconHeight / 2,
        animationSpec = tween(durationMillis = animationDuration),
        label = "iconYTranslate",
    )
}

@Composable
private fun iconWidth(
    checked: Boolean,
    dimensions: RadioBoxDimensionValues,
    animationDuration: Int,
): State<Dp> {
    return animateDpAsState(
        targetValue = if (checked) dimensions.toggleIconWidth else 0.dp,
        animationSpec = tween(durationMillis = animationDuration),
        label = "toggleIconWidth",
    )
}

@Composable
private fun iconHeight(
    checked: Boolean,
    dimensions: RadioBoxDimensionValues,
    animationDuration: Int,
): State<Dp> {
    return animateDpAsState(
        targetValue = if (checked) dimensions.toggleIconHeight else 0.dp,
        animationSpec = tween(durationMillis = animationDuration),
        label = "toggleIconHeight",
    )
}

@Composable
private fun IconContent(
    iconContent: @Composable () -> Unit,
    iconWidth: State<Dp>,
    iconHeight: State<Dp>,
) {
    Box(
        modifier = Modifier
            .width(iconWidth.value)
            .height(iconHeight.value),
        propagateMinConstraints = true,
    ) {
        iconContent.invoke()
    }
}

private fun DrawScope.getIconHorizontalTranslate(dimensions: RadioBoxDimensionValues): Float {
    return (size.width / 2 - dimensions.toggleIconWidth.toPx() / 2)
}

private fun DrawScope.getIconVerticalTranslate(dimensions: RadioBoxDimensionValues): Float {
    return (size.width / 2 - dimensions.toggleIconHeight.toPx() / 2)
}

private fun DrawScope.getBorderOutlineTranslate(
    toggleBorderWidth: Dp,
    toggleBorderOffset: Dp,
): Float {
    return -(toggleBorderOffset - toggleBorderWidth / 2).toPx()
}

private fun CacheDrawScope.createToggleOutline(
    shape: CornerBasedShape,
): Outline {
    return shape.createOutline(
        size = size,
        layoutDirection = layoutDirection,
        density = this,
    )
}

private fun CacheDrawScope.createBorderOutline(
    shape: Shape,
    toggleBorderWidth: Dp,
    toggleBorderOffset: Dp,
): Outline {
    val borderBoundsWidth = size.width + toggleBorderOffset.toPx() * 2 - toggleBorderWidth.toPx()
    val borderBoundsHeight = size.height + toggleBorderOffset.toPx() * 2 - toggleBorderWidth.toPx()
    return shape.createOutline(
        size = Size(
            borderBoundsWidth,
            borderBoundsHeight,
        ),
        layoutDirection = layoutDirection,
        density = this,
    )
}

private fun CacheDrawScope.createIconOutline(
    shape: Shape,
    iconWidth: State<Dp>,
    iconHeight: State<Dp>,
    iconContent: (@Composable () -> Unit)?,
): Outline? {
    return if (iconContent == null) {
        shape.createOutline(
            size = Size(
                iconWidth.value.toPx(),
                iconHeight.value.toPx(),
            ),
            layoutDirection = layoutDirection,
            density = this,
        )
    } else {
        null
    }
}
