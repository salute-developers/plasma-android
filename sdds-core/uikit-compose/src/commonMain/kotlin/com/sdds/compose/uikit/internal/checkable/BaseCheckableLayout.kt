@file:Suppress("TopLevelPropertyNaming")

package com.sdds.compose.uikit.internal.checkable

import androidx.compose.runtime.Composable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import com.sdds.compose.uikit.Text
import kotlin.math.max

/**
 * Контейнер для Checkable элементов [control] с поддержкой отображения
 * названия [label] и описания [description]
 * @param control Checkable элемент
 * @param label название
 * @param description описание
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между [control] и текстом ([label] или [description])
 * @param modifier модификатор
 */
@Composable
internal fun BaseCheckableLayout(
    control: @Composable (Modifier) -> Unit,
    label: (@Composable (Modifier) -> Unit)?,
    description: (@Composable (Modifier) -> Unit)?,
    verticalSpacing: Dp,
    horizontalSpacing: Dp,
    modifier: Modifier = Modifier,
) {
    val measurePolicy = with(LocalDensity.current) {
        remember(verticalSpacing, horizontalSpacing) {
            BaseCheckableMeasurePolicy(
                verticalSpacing = verticalSpacing.roundToPx(),
                horizontalSpacing = horizontalSpacing.roundToPx(),
            )
        }
    }

    Layout(
        modifier = modifier,
        content = {
            control(Modifier.layoutId(ControlId))
            label?.invoke(Modifier.layoutId(LabelId))
            description?.invoke(Modifier.layoutId(DescriptionId))
        },
        measurePolicy = measurePolicy,
    )
}

/**
 * Создает Composable для названия (label) в [BaseCheckableLayout].
 * Возвращает null, если [value] - null
 * @param value название
 */
internal fun checkableLabel(
    value: String?,
    textStyle: TextStyle,
    color: Color,
): @Composable ((Modifier) -> Unit)? =
    if (value != null) {
        {
            Text(
                text = value,
                modifier = it,
                style = textStyle.copy(color = color),
            )
        }
    } else {
        null
    }

/**
 * Создает Composable для описания (description) в [BaseCheckableLayout].
 * Возвращает null, если [value] - null
 * @param value название
 */
internal fun checkableDescription(
    value: String?,
    textStyle: TextStyle,
    color: Color,
): @Composable ((Modifier) -> Unit)? =
    if (value != null) {
        {
            Text(
                text = value,
                modifier = it,
                style = textStyle.copy(color = color),
            )
        }
    } else {
        null
    }

private class BaseCheckableMeasurePolicy(
    private val horizontalSpacing: Int,
    private val verticalSpacing: Int,
) : MeasurePolicy {
    override fun MeasureScope.measure(measurables: List<Measurable>, constraints: Constraints): MeasureResult {
        val controlConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val control = measurables
            .first { it.layoutId == ControlId }
            .measure(controlConstraints)

        val labelConstraints = controlConstraints.copy(
            minWidth = 0,
            maxWidth = addMaxWithMinimum(constraints.maxWidth, horizontalSpacing - control.width),
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
        )

        val description = measurables
            .firstOrNull { it.layoutId == DescriptionId }
            ?.measure(descriptionConstraints)

        val labelY = label?.let { Alignment.CenterVertically.align(it.height, control.height) }
            .orZero()

        val descriptionY = label?.let { labelY + it.height + verticalSpacing }
            ?: description?.let { Alignment.CenterVertically.align(it.height, control.height) }.orZero()

        val textBottom = when {
            label != null && description != null -> labelY + label.height + verticalSpacing + description.height
            label != null -> labelY + label.height
            description != null -> descriptionY + description.height
            else -> 0
        }
        val textEnd = if (label != null || description != null) {
            max(label?.width.orZero(), description?.width.orZero()) + horizontalSpacing
        } else {
            0
        }

        val desiredWidth = control.width + textEnd
        val desiredHeight = max(control.height, textBottom)
        return layout(constraints.constrainWidth(desiredWidth), constraints.constrainHeight(desiredHeight)) {
            control.placeRelative(0, 0)
            label?.placeRelative(control.width + horizontalSpacing, labelY)
            description?.placeRelative(control.width + horizontalSpacing, descriptionY)
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

private const val ControlId = "Control"
private const val LabelId = "Label"
private const val DescriptionId = "Description"
