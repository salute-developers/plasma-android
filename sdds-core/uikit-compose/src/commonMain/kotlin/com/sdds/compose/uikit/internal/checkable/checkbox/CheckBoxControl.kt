@file:Suppress("LongMethod")

package com.sdds.compose.uikit.internal.checkable.checkbox

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxColorValues
import com.sdds.compose.uikit.CheckBoxDimensionValues
import com.sdds.compose.uikit.CheckBoxValue
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.lerp
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.checkbox.CheckBoxMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState

/**
 * Control вида CheckBox для [BaseCheckableLayout]
 *
 * @param value значение контрола [CheckBoxValue]
 * @param modifier модификатор
 * @param dimensions отступы и размеры CheckBox
 * @param colors цвета CheckBox
 * @param shape форма контрола Checkbox
 * @param icons иконки для состояний checked / indeterminate
 * @param animationDuration длительность анимации
 * @param motion объект анимаций
 */
@Composable
internal fun CheckBoxControl(
    value: CheckBoxValue,
    modifier: Modifier = Modifier,
    dimensions: CheckBoxDimensionValues,
    colors: CheckBoxColorValues,
    animationDuration: Int,
    shape: StatefulValue<CornerBasedShape>,
    icons: CheckBoxIcons?,
    motion: Motion<CheckBoxMotionStyle>,
) {
    val transition = updateTransition(value, label = "transition")
    val checkDrawFraction = transition.animateFloat(
        transitionSpec = {
            when {
                initialState == CheckBoxValue.Off -> tween(animationDuration)
                targetState == CheckBoxValue.Off -> tween(animationDuration)
                else -> spring()
            }
        },
        label = "checkDrawFraction",
    ) {
        it.glyphSpec.checkDrawTarget
    }
    val checkCenterGravitationShiftFraction = transition.animateFloat(
        transitionSpec = {
            when {
                initialState == CheckBoxValue.Off -> snap()
                targetState == CheckBoxValue.Off -> snap(animationDuration)
                else -> tween(durationMillis = animationDuration)
            }
        },
        label = "checkCenterGravitationShiftFraction",
    ) {
        it.glyphSpec.gravitationTarget
    }
    val checkAlpha = transition.animateFloat(
        transitionSpec = { tween(animationDuration) },
        label = "checkAlpha",
    ) {
        if (it.glyphSpec.family == CheckBoxGlyphFamily.Check) 1f else 0f
    }
    val crossDrawFraction = transition.animateFloat(
        transitionSpec = { tween(animationDuration) },
        label = "crossDrawFraction",
    ) {
        it.glyphSpec.crossDrawTarget
    }
    val crossAlpha = transition.animateFloat(
        transitionSpec = { tween(animationDuration) },
        label = "crossAlpha",
    ) {
        if (it.glyphSpec.family == CheckBoxGlyphFamily.Cross) 1f else 0f
    }
    val currentShape by shape.getValueAsState(motion.context)
    val toggleBorderWidth = dimensions.toggleBorderWidth.getValueAsState(motion.context)
    val toggleBorderOffset = dimensions.toggleBorderOffset.getValueAsState(motion.context)
    val toggleIconWidth = dimensions.toggleIconWidth.getValueAsState(motion.context)
    val toggleIconHeight = dimensions.toggleIconHeight.getValueAsState(motion.context)

    val toggleColor = colors.toggleBrush.getBrushAsState(motion.context, motion.style.toggleColor)
    val borderColor = colors.toggleBorderBrush.getBrushAsState(motion.context, motion.style.toggleBorderColor)
    val iconColor = colors.toggleIconBrush.getBrushAsState(motion.context, motion.style.toggleIconColor)

    val requireWidth by dimensions.toggleWidthValues.getValueAsState(motion.context)
    val requiredHeight by dimensions.toggleHeightValues.getValueAsState(motion.context)
    val paddings by dimensions.togglePaddingValues.getValueAsState(motion.context)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .wrapContentSize(Alignment.Center)
            .requiredWidth(requireWidth)
            .requiredHeight(requiredHeight)
            .padding(paddings)
            .drawWithCache {
                val checkCache = CheckDrawingCache()
                val crossCache = CrossDrawingCache()
                val toggleOutline = createToggleOutline(currentShape)
                val toggleBorderOutline =
                    createBorderOutline(currentShape, toggleBorderWidth, toggleBorderOffset)

                onDrawBehind {
                    translate(
                        left = getBorderOutlineTranslate(toggleBorderWidth, toggleBorderOffset),
                        top = getBorderOutlineTranslate(toggleBorderWidth, toggleBorderOffset),
                    ) {
                        drawOutline(
                            outline = toggleBorderOutline,
                            brush = borderColor.value,
                            style = Stroke(width = toggleBorderWidth.value.toPx()),
                        )
                    }
                    drawOutline(toggleOutline, toggleColor.value, style = Fill)
                    if (icons == null) {
                        drawCheck(
                            checkColor = iconColor.value,
                            checkFraction = checkDrawFraction.value,
                            crossCenterGravitation = checkCenterGravitationShiftFraction.value,
                            strokeWidthPx = DEFAULT_CHECKBOX_LINE_WIDTH.dp.toPx(),
                            alpha = checkAlpha.value,
                            drawingCache = checkCache,
                        )
                        drawCross(
                            crossColor = iconColor.value,
                            crossFraction = crossDrawFraction.value,
                            alpha = crossAlpha.value,
                            strokeWidthPx = DEFAULT_CHECKBOX_LINE_WIDTH.dp.toPx(),
                            drawingCache = crossCache,
                        )
                    }
                }
            },
    ) {
        icons?.let { IconsContent(value, it, toggleIconWidth, toggleIconHeight) }
    }
}

/**
 * Соответствует ли [CheckBoxValue] состоянию checked
 */
internal val CheckBoxValue.checked: Boolean
    get() = this != CheckBoxValue.Off

/**
 * "Семья" глифа [CheckBoxValue] — глифы одной семьи анимированно морфятся друг в друга
 * (общий путь отрисовки), глифы разных семей переключаются кроссфейдом.
 */
private enum class CheckBoxGlyphFamily { None, Check, Cross }

/**
 * Рецепт отрисовки глифа для конкретного [CheckBoxValue] — единая точка сопоставления
 * значения состояния с параметрами анимации, вместо разрозненных `when`-блоков.
 */
private class CheckBoxGlyphSpec(
    val family: CheckBoxGlyphFamily,
    val checkDrawTarget: Float,
    val gravitationTarget: Float,
    val crossDrawTarget: Float,
)

private val CheckBoxValue.glyphSpec: CheckBoxGlyphSpec
    get() = when (this) {
        CheckBoxValue.Off -> CheckBoxGlyphSpec(
            family = CheckBoxGlyphFamily.None,
            checkDrawTarget = 0f,
            gravitationTarget = 0f,
            crossDrawTarget = 0f,
        )

        CheckBoxValue.On -> CheckBoxGlyphSpec(
            family = CheckBoxGlyphFamily.Check,
            checkDrawTarget = 1f,
            gravitationTarget = 0f,
            crossDrawTarget = 1f,
        )

        CheckBoxValue.Indeterminate -> CheckBoxGlyphSpec(
            family = CheckBoxGlyphFamily.Check,
            checkDrawTarget = 1f,
            gravitationTarget = 1f,
            crossDrawTarget = 1f,
        )

        CheckBoxValue.Error -> CheckBoxGlyphSpec(
            family = CheckBoxGlyphFamily.Cross,
            checkDrawTarget = 1f,
            gravitationTarget = 0f,
            crossDrawTarget = 1f,
        )
    }

internal class CheckBoxIcons(
    val checkedIconContent: (@Composable () -> Unit),
    val indeterminateIconContent: (@Composable () -> Unit),
)

private fun DrawScope.drawCheck(
    checkColor: Brush,
    checkFraction: Float,
    crossCenterGravitation: Float,
    strokeWidthPx: Float,
    alpha: Float,
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
    drawPath(drawingCache.pathToDraw, checkColor, style = stroke, alpha = alpha)
}

/**
 * Рисует глиф состояния [CheckBoxValue.Error] — крестик из двух независимых диагоналей
 * в той же рамке (`0.3…0.71`), что использует [drawCheck], для одинакового визуального веса.
 */
private fun DrawScope.drawCross(
    crossColor: Brush,
    crossFraction: Float,
    strokeWidthPx: Float,
    alpha: Float,
    drawingCache: CrossDrawingCache,
) {
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Round)
    val width = size.width
    val start = 0.3f
    val end = 0.71f

    with(drawingCache) {
        diagonal1.reset()
        diagonal1.moveTo(width * start, width * start)
        diagonal1.lineTo(width * end, width * end)
        measure1.setPath(diagonal1, false)
        segment1.reset()
        measure1.getSegment(0f, measure1.length * crossFraction, segment1, true)

        diagonal2.reset()
        diagonal2.moveTo(width * end, width * start)
        diagonal2.lineTo(width * start, width * end)
        measure2.setPath(diagonal2, false)
        segment2.reset()
        measure2.getSegment(0f, measure2.length * crossFraction, segment2, true)
    }
    drawPath(drawingCache.segment1, crossColor, style = stroke, alpha = alpha)
    drawPath(drawingCache.segment2, crossColor, style = stroke, alpha = alpha)
}

@Composable
private fun IconsContent(
    value: CheckBoxValue,
    checkBoxIcons: CheckBoxIcons,
    toggleIconWidth: State<Dp>,
    toggleIconHeight: State<Dp>,
) {
    when (value) {
        CheckBoxValue.On ->
            IconContent(
                checkBoxIcons.checkedIconContent,
                toggleIconWidth,
                toggleIconHeight,
            )

        CheckBoxValue.Indeterminate ->
            IconContent(
                checkBoxIcons.indeterminateIconContent,
                toggleIconWidth,
                toggleIconHeight,
            )

        CheckBoxValue.Off, CheckBoxValue.Error -> {}
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

@Immutable
private class CheckDrawingCache(
    val checkPath: Path = Path(),
    val pathMeasure: PathMeasure = PathMeasure(),
    val pathToDraw: Path = Path(),
)

@Immutable
private class CrossDrawingCache(
    val diagonal1: Path = Path(),
    val diagonal2: Path = Path(),
    val measure1: PathMeasure = PathMeasure(),
    val measure2: PathMeasure = PathMeasure(),
    val segment1: Path = Path(),
    val segment2: Path = Path(),
)

private const val DEFAULT_CHECKBOX_LINE_WIDTH = 2
