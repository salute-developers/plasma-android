@file:Suppress("LongMethod")

package com.sdds.compose.uikit.internal.checkable

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.lerp
import kotlin.math.floor

/**
 * Control вида CheckBox для [BaseCheckableLayout]
 * @param state состояние контрола [ToggleableState]
 * @param focused флаг-индикатор состояния фокуса
 * @param modifier модификатор
 * @param controlSize размер заполняющего круга контрола
 * @param controlRadius радиус скруглений контрола
 * @param strokeWidth ширина линий
 * @param checkedStrokeWidth ширина линий границ в состоянии checked
 * @param innerCheckBoxPadding внутренний отступ между фокусной границей и контролом
 * @param colors цвета CheckBox
 * @param animationDuration длительность анимации
 */
@Composable
internal fun CheckBoxControl(
    state: ToggleableState,
    focused: Boolean,
    modifier: Modifier = Modifier,
    controlSize: Dp,
    controlRadius: Dp,
    strokeWidth: Dp,
    checkedStrokeWidth: Dp,
    innerCheckBoxPadding: Dp,
    colors: CheckBoxColors,
    animationDuration: Int,
) {
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
        when (it) {
            ToggleableState.On -> 1f
            ToggleableState.Off -> 0f
            ToggleableState.Indeterminate -> 1f
        }
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
        when (it) {
            ToggleableState.On -> 0f
            ToggleableState.Off -> 0f
            ToggleableState.Indeterminate -> 1f
        }
    }
    val checked = state != ToggleableState.Off
    val checkCache = remember { CheckDrawingCache() }
    val checkColor by colors.baseColor()
    val boxColor by colors.fillColor(checked)
    val borderColor by colors.borderColor(checked, focused)
    Canvas(
        modifier
            .wrapContentSize(Alignment.Center)
            .requiredSize(controlSize),
    ) {
        drawBox(
            checked = checked,
            focused = focused,
            boxColor = boxColor,
            borderColor = borderColor,
            radius = controlRadius.toPx(),
            strokeWidth = floor(if (checked) checkedStrokeWidth.toPx() else strokeWidth.toPx()),
            padding = innerCheckBoxPadding.roundToPx(),
        )
        drawCheck(
            checkColor = checkColor,
            checkFraction = checkDrawFraction,
            crossCenterGravitation = checkCenterGravitationShiftFraction,
            strokeWidthPx = floor(strokeWidth.toPx()),
            drawingCache = checkCache,
            padding = innerCheckBoxPadding.toPx(),
        )
    }
}

/**
 * Соответствует ли [ToggleableState] состоянию checked
 */
internal val ToggleableState.checked: Boolean
    get() = this != ToggleableState.Off

private fun DrawScope.drawBox(
    checked: Boolean,
    focused: Boolean,
    boxColor: Color,
    borderColor: Color,
    radius: Float,
    strokeWidth: Float,
    padding: Int,
) {
    val stroke = Stroke(strokeWidth)
    val checkedSize =
        Size(size.width - 2 * padding - strokeWidth, size.height - 2 * padding - strokeWidth)
    val borderSize = if (focused) {
        Size(size.width - strokeWidth, size.height - strokeWidth)
    } else {
        checkedSize
    }
    val borderRadius = if (focused) radius + 2.dp.toPx() else radius
    if ((checked && focused) || !checked) {
        drawRoundRect(
            borderColor,
            topLeft = (size.center - borderSize.center),
            size = borderSize,
            cornerRadius = CornerRadius(borderRadius),
            style = stroke,
        )
    }

    if (checked) {
        drawRoundRect(
            boxColor,
            topLeft = (size.center - checkedSize.center),
            size = checkedSize,
            cornerRadius = CornerRadius(radius),
            style = Fill,
        )
    }
}

private fun DrawScope.drawCheck(
    checkColor: Color,
    checkFraction: Float,
    crossCenterGravitation: Float,
    strokeWidthPx: Float,
    drawingCache: CheckDrawingCache,
    padding: Float,
) {
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Round)
    val width = size.width - 2 * padding
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
    translate(padding, padding) {
        drawPath(drawingCache.pathToDraw, checkColor, style = stroke)
    }
}

@Immutable
private class CheckDrawingCache(
    val checkPath: Path = Path(),
    val pathMeasure: PathMeasure = PathMeasure(),
    val pathToDraw: Path = Path(),
)
