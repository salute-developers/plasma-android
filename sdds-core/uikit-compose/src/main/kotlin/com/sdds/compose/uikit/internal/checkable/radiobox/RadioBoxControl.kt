package com.sdds.compose.uikit.internal.checkable.radiobox

import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
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
import com.sdds.compose.uikit.RadioBoxColorValues
import com.sdds.compose.uikit.RadioBoxDimensionValues
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.radiobox.RadioBoxMotionStyle
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.getFloatAsState
import com.sdds.compose.uikit.motion.transition

/**
 * Control вида RadioBox для [BaseCheckableLayout]
 * @param checked флаг-индикатор выбора
 * @param modifier модификатор
 * @param dimensions размеры и отступы
 * @param animationDuration длительность анимации
 * @param colors цвета RadioBox
 * @param shape формы
 * @param iconContent контент (иконка)
 * @param motion объект анимаций
 */
@Suppress("LongMethod")
@Composable
internal fun RadioBoxControl(
    checked: Boolean,
    modifier: Modifier = Modifier,
    dimensions: RadioBoxDimensionValues,
    animationDuration: Int,
    colors: RadioBoxColorValues,
    shape: StatefulValue<CornerBasedShape>,
    iconContent: (@Composable () -> Unit)?,
    motion: Motion<RadioBoxMotionStyle>,
) {
    SideEffect {
        motion.context.semanticStateSource.set(
            RadioBoxStates.Checked,
            checked,
        )
    }
    val widthMotionProperty = remember(animationDuration) {
        if (animationDuration == Int.MIN_VALUE) {
            motion.style.toggleIconWidth
        } else {
            dpTransitionMotion(animationDuration)
        }
    }

    val heightMotionProperty = remember(animationDuration) {
        if (animationDuration == Int.MIN_VALUE) {
            motion.style.toggleIconHeight
        } else {
            dpTransitionMotion(animationDuration)
        }
    }
    val iconWidth = dimensions.toggleIconWidthValues.getDpAsState(motion.context, widthMotionProperty)
    val iconHeight = dimensions.toggleIconHeightValues.getDpAsState(motion.context, heightMotionProperty)
    val progress = progress.getFloatAsState(motion.context, motion.style.toggleIconAlphaTransition)

    val toggleBorderWidth = dimensions.toggleBorderWidth.getValueAsState(motion.context)
    val toggleBorderOffset = dimensions.toggleBorderOffset.getValueAsState(motion.context)
    val toggleColor = colors.toggleBrush.getBrushAsState(motion.context, motion.style.toggleColor)
    val borderColor = colors.toggleBorderBrush.getBrushAsState(motion.context, motion.style.toggleBorderColor)
    val iconColor = colors.toggleIconBrush.getBrushAsState(motion.context, motion.style.toggleIconColor)
    val currentShape by shape.getValueAsState(motion.context)

    val requiredWidth by dimensions.toggleWidthValues.getValueAsState(motion.context)
    val requiredHeight by dimensions.toggleHeightValues.getValueAsState(motion.context)
    val paddings by dimensions.togglePaddingValues.getValueAsState(motion.context)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .wrapContentSize(Alignment.Center)
            .requiredWidth(requiredWidth)
            .requiredHeight(requiredHeight)
            .padding(paddings)
            .drawWithCache {
                val toggleOutline = createToggleOutline(currentShape)
                val toggleBorderOutline = createBorderOutline(currentShape, toggleBorderWidth, toggleBorderOffset)
                val toggleIconOutline = createIconOutline(CircleShape, iconWidth, iconHeight, iconContent)

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
                    toggleIconOutline?.let {
                        translate(
                            left = getIconHorizontalTranslate(iconWidth),
                            top = getIconVerticalTranslate(iconHeight),
                        ) {
                            drawOutline(
                                outline = toggleIconOutline,
                                brush = iconColor.value,
                                style = Fill,
                                alpha = progress.value,
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

private fun DrawScope.getIconHorizontalTranslate(iconWidth: State<Dp>): Float {
    return (size.width / 2 - iconWidth.value.toPx() / 2)
}

private fun DrawScope.getIconVerticalTranslate(iconHeight: State<Dp>): Float {
    return (size.height / 2 - iconHeight.value.toPx() / 2)
}

private fun DrawScope.getBorderOutlineTranslate(
    toggleBorderWidth: State<Dp>,
    toggleBorderOffset: State<Dp>,
): Float {
    return -(toggleBorderOffset.value - toggleBorderWidth.value / 2).toPx()
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

private val progress: StatefulValue<Float> = 0f.asStatefulValue(setOf(RadioBoxStates.Checked) to 1f)

private fun dpTransitionMotion(durationMillis: Int) = transition<Dp>(
    label = "RadioBoxDpTransition",
) {
    segment {
        condition { state -> state changes SwitchStates.Checked }
    } changesWith { finite(tween(durationMillis)) }

    segment {} changesWith { finite(snap()) }
}
