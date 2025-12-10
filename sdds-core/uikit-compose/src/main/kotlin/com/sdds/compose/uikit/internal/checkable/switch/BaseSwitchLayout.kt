@file:Suppress("TopLevelPropertyNaming")

package com.sdds.compose.uikit.internal.checkable.switch

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import com.sdds.compose.uikit.internal.common.StyledText
import kotlin.math.max

/**
 * Контейнер для Switch элементов: [switch] с поддержкой отображения
 * названия [label] и описания [description]
 * @param switch switch элемент
 * @param label название
 * @param description описание
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между [switch] и текстом ([label] или [description])
 * @param modifier модификатор
 */
@Composable
internal fun BaseSwitchLayout(
    switch: @Composable () -> Unit,
    label: (@Composable () -> Unit)?,
    description: (@Composable () -> Unit)?,
    verticalSpacing: Dp,
    horizontalSpacing: Dp,
    modifier: Modifier = Modifier,
) {
    val measurePolicy = with(LocalDensity.current) {
        remember(verticalSpacing, horizontalSpacing) {
            BaseSwitchMeasurePolicy(
                verticalSpacing = verticalSpacing.roundToPx(),
                horizontalSpacing = horizontalSpacing.roundToPx(),
            )
        }
    }

    Layout(
        modifier = modifier,
        content = {
            Box(Modifier.layoutId(SwitchId)) {
                switch()
            }
            if (label != null) {
                Box(Modifier.layoutId(LabelId)) {
                    label()
                }
            }
            if (description != null) {
                Box(Modifier.layoutId(DescriptionId)) {
                    description()
                }
            }
        },
        measurePolicy = measurePolicy,
    )
}

/**
 * Создает Composable для названия (label) в [BaseSwitchLayout].
 * Возвращает null, если [value] - null
 * @param value название
 */
internal fun switchText(
    value: String?,
    textStyle: TextStyle,
    color: State<Color>,
    maxLines: Int,
): @Composable (() -> Unit)? =
    if (value != null) {
        {
            StyledText(
                text = AnnotatedString(value),
                textStyle = textStyle,
                textColor = color.value,
                maxLines = maxLines,
                overflow = TextOverflow.Ellipsis,
            )
        }
    } else {
        null
    }

private class BaseSwitchMeasurePolicy(
    private val horizontalSpacing: Int,
    private val verticalSpacing: Int,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val switchConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val switch = measurables
            .first { it.layoutId == SwitchId }
            .measure(switchConstraints)

        val labelConstraints = switchConstraints.copy(
            minWidth = 0,
            maxWidth = addMaxWithMinimum(
                constraints.maxWidth,
                -horizontalSpacing - switch.width,
            ),
        )
        val label = measurables
            .firstOrNull { it.layoutId == LabelId }
            ?.measure(labelConstraints)

        val descriptionConstraints = labelConstraints.copy(
            minHeight = 0,
            maxHeight = addMaxWithMinimum(
                labelConstraints.maxHeight,
                label?.let { verticalSpacing - it.height }.orZero(),
            ),
            minWidth = 0,
            maxWidth = switchConstraints.maxWidth,
        )

        val description = measurables
            .firstOrNull { it.layoutId == DescriptionId }
            ?.measure(descriptionConstraints)

        val labelY = label?.let { Alignment.CenterVertically.align(it.height, switch.height) }
            .orZero()

        val descriptionY = label?.let { labelY + it.height + verticalSpacing }
            ?: description?.let { Alignment.CenterVertically.align(it.height, switch.height) }
                .orZero()

        val textBottom = when {
            label != null && description != null -> labelY + label.height + verticalSpacing + description.height
            label != null -> labelY + label.height
            description != null -> descriptionY + description.height
            else -> 0
        }
        val labelEnd = if (label != null) {
            label.width + horizontalSpacing
        } else {
            0
        }
        val descriptionEnd = description?.width.orZero()

        val desiredWidth = max(labelEnd + switch.width, descriptionEnd)
        val desiredHeight = max(switch.height, textBottom)
        val constrainedWidth = constraints.constrainWidth(desiredWidth)
        val constrainedHeight = constraints.constrainHeight(desiredHeight)
        return layout(constrainedWidth, constrainedHeight) {
            label?.placeRelative(0, labelY)
            description?.placeRelative(0, descriptionY)
            switch.placeRelative(constrainedWidth - switch.width, 0)
        }
    }

    private fun addMaxWithMinimum(max: Int, value: Int): Int {
        return if (max == Constraints.Infinity) {
            max
        } else {
            (max + value).coerceAtLeast(0)
        }
    }

    private fun Int?.orZero(): Int = this ?: 0
}

private const val SwitchId = "Switch"
private const val LabelId = "Label"
private const val DescriptionId = "Description"
