@file:Suppress("LongMethod")

package com.sdds.compose.uikit.internal.checkable.checkbox

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxColorValues
import com.sdds.compose.uikit.CheckBoxDimensionValues
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.lerp

/**
 * Control вида CheckBox для [BaseCheckableLayout]
 *
 * @param state состояние контрола [ToggleableState]
 * @param modifier модификатор
 * @param dimensions отступы и размеры CheckBox
 * @param colors цвета CheckBox
 * @param shape форма контрола Checkbox
 * @param icons иконки для состояний checked / indeterminate
 * @param animationDuration длительность анимации
 * @param interactionSource источник взаимодействий
 */
@Composable
internal fun CheckBoxControl(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    dimensions: CheckBoxDimensionValues,
    colors: CheckBoxColorValues,
    animationDuration: Int,
    shape: CornerBasedShape,
    icons: CheckBoxIcons?,
    interactionSource: MutableInteractionSource,
) {
    val stateSet = remember(state) { state.toStateSet() }
    val transition = updateTransition(state, label = "transition")
    val checkDrawFraction by transition.animateFloat(
        transitionSpec = {
            when {
                initialState == ToggleableState.Off -> tween(animationDuration)
                targetState == ToggleableState.Off -> snap(animationDuration)
                else -> spring()
            }
        },
        label = "checkDrawFraction",
    ) {
        checkDrawFraction(it)
    }

    val checkCenterGravitationShiftFraction by transition.animateFloat(
        transitionSpec = {
            when {
                initialState == ToggleableState.Off -> snap()
                targetState == ToggleableState.Off -> snap(animationDuration)
                else -> tween(durationMillis = animationDuration)
            }
        },
        label = "checkCenterGravitationShiftFraction",
    ) {
        checkCenterGravitationShiftFraction(it)
    }
    val toggleBorderWidth =
        dimensions.toggleBorderWidth.getValueAsState(interactionSource, stateSet)
    val toggleBorderOffset =
        dimensions.toggleBorderOffset.getValueAsState(interactionSource, stateSet)
    val toggleIconWidth = dimensions.toggleIconWidth.getValueAsState(interactionSource, stateSet)
    val toggleIconHeight = dimensions.toggleIconHeight.getValueAsState(interactionSource, stateSet)
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
                val checkCache = CheckDrawingCache()
                val toggleOutline = createToggleOutline(shape)
                val toggleBorderOutline =
                    createBorderOutline(shape, toggleBorderWidth, toggleBorderOffset)

                onDrawBehind {
                    drawOutline(toggleOutline, toggleColor, style = Fill)
                    translate(
                        left = getBorderOutlineTranslate(toggleBorderWidth, toggleBorderOffset),
                        top = getBorderOutlineTranslate(toggleBorderWidth, toggleBorderOffset),
                    ) {
                        drawOutline(
                            outline = toggleBorderOutline,
                            color = borderColor,
                            style = Stroke(width = toggleBorderWidth.value.toPx()),
                        )
                    }
                    if (icons == null) {
                        drawCheck(
                            checkColor = iconColor,
                            checkFraction = checkDrawFraction,
                            crossCenterGravitation = checkCenterGravitationShiftFraction,
                            strokeWidthPx = 2.dp.toPx(),
                            drawingCache = checkCache,
                        )
                    }
                }
            },
    ) {
        icons?.let { IconsContent(state, it, toggleIconWidth, toggleIconHeight) }
    }
}

/**
 * Соответствует ли [ToggleableState] состоянию checked
 */
internal val ToggleableState.checked: Boolean
    get() = this != ToggleableState.Off

internal class CheckBoxIcons(
    val checkedIconContent: (@Composable () -> Unit),
    val indeterminateIconContent: (@Composable () -> Unit),
)

private fun DrawScope.drawCheck(
    checkColor: Color,
    checkFraction: Float,
    crossCenterGravitation: Float,
    strokeWidthPx: Float,
    drawingCache: CheckDrawingCache,
) {
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Round)
    val width = size.width
    // M0.3,0.5L0.46,0.625,L0.71,0.375
    val checkCrossX = 0.46f
    val checkCrossY = 0.625f
    val leftX = 0.3f
    val leftY = 0.5f
    val rightX = 0.71f
    val rightY = 0.375f

    val gravitatedCrossX = lerp(checkCrossX, 0.5f, crossCenterGravitation)
    val gravitatedCrossY = lerp(checkCrossY, 0.5f, crossCenterGravitation)
    val gravitatedLeftY = lerp(leftY, 0.5f, crossCenterGravitation)
    val gravitatedRightY = lerp(rightY, 0.5f, crossCenterGravitation)

    with(drawingCache) {
        checkPath.reset()
        checkPath.moveTo(width * leftX, width * gravitatedLeftY)
        checkPath.lineTo(width * gravitatedCrossX, width * gravitatedCrossY)
        checkPath.lineTo(width * rightX, width * gravitatedRightY)
        pathMeasure.setPath(checkPath, false)
        pathToDraw.reset()
        pathMeasure.getSegment(0f, pathMeasure.length * checkFraction, pathToDraw, true)
    }
    drawPath(drawingCache.pathToDraw, checkColor, style = stroke)
}

@Composable
private fun IconsContent(
    state: ToggleableState,
    checkBoxIcons: CheckBoxIcons,
    toggleIconWidth: State<Dp>,
    toggleIconHeight: State<Dp>,
) {
    when (state) {
        ToggleableState.On ->
            IconContent(
                checkBoxIcons.checkedIconContent,
                toggleIconWidth,
                toggleIconHeight,
            )

        ToggleableState.Indeterminate ->
            IconContent(
                checkBoxIcons.indeterminateIconContent,
                toggleIconWidth,
                toggleIconHeight,
            )

        else -> {}
    }
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

private fun CacheDrawScope.createBorderOutline(
    shape: CornerBasedShape,
    toggleBorderWidth: State<Dp>,
    toggleBorderOffset: State<Dp>,
): Outline {
    val toggleBorderWidthPx = toggleBorderWidth.value.toPx()
    val toggleBorderOffsetPx = toggleBorderOffset.value.toPx()
    val borderBoundsWidth = size.width + toggleBorderOffsetPx * 2f - toggleBorderWidthPx
    val borderBoundsHeight = size.height + toggleBorderOffsetPx * 2f - toggleBorderWidthPx
    val adjustedShape = shape.adjustBy(toggleBorderOffsetPx - toggleBorderWidthPx / 2f)
    return adjustedShape.createOutline(
        size = Size(
            borderBoundsWidth,
            borderBoundsHeight,
        ),
        layoutDirection = layoutDirection,
        density = this,
    )
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

private fun DrawScope.getBorderOutlineTranslate(
    toggleBorderWidth: State<Dp>,
    toggleBorderOffset: State<Dp>,
): Float {
    return -(toggleBorderOffset.value - toggleBorderWidth.value / 2).toPx()
}

private fun ToggleableState.toStateSet(): Set<CheckBoxStates> {
    return when (this) {
        ToggleableState.On -> setOf(CheckBoxStates.Checked)
        ToggleableState.Off -> emptySet()
        ToggleableState.Indeterminate -> setOf(CheckBoxStates.Indeterminate)
    }
}

private fun checkDrawFraction(state: ToggleableState): Float {
    return when (state) {
        ToggleableState.On -> 1f
        ToggleableState.Off -> 0f
        ToggleableState.Indeterminate -> 1f
    }
}

private fun checkCenterGravitationShiftFraction(state: ToggleableState): Float {
    return when (state) {
        ToggleableState.On -> 0f
        ToggleableState.Off -> 0f
        ToggleableState.Indeterminate -> 1f
    }
}

@Immutable
private class CheckDrawingCache(
    val checkPath: Path = Path(),
    val pathMeasure: PathMeasure = PathMeasure(),
    val pathToDraw: Path = Path(),
)
