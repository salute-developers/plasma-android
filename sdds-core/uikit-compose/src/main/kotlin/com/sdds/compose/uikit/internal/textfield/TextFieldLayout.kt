@file:Suppress("TopLevelPropertyNaming")

package com.sdds.compose.uikit.internal.textfield

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.IntrinsicMeasurable
import androidx.compose.ui.layout.IntrinsicMeasureScope
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.LayoutIdParentData
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.offset
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Layout декоратора текстового поля
 *
 * @param modifier модификатор
 * @param textField текстовое поле
 * @param label лейбл
 * @param placeholder composable заглушки
 * @param leading composable начала поля (например, иконки)
 * @param trailing composable конца (например, иконки)
 * @param singleLine режим однострочного значения поля
 * @param animationProgress прогресс анимации лейбла и заглушки
 * @param textTopPadding отступ от текста сверху
 * @param textBottomPadding отступ от текста снизу
 * @param labelToValuePadding отступ от лэйбла до значения поля
 * @param iconSize размер иконки
 * @param chips контент с chip-элементами
 * @param chipsSpacing расстояние между chip-элементами
 * @param chipContainerCornerRadius радиус скругления контейнера, в котором содержатся чипы и текстовое поле
 */
@Composable
internal fun TextFieldLayout(
    modifier: Modifier,
    textField: @Composable () -> Unit,
    label: @Composable (() -> Unit)?,
    placeholder: @Composable (() -> Unit)?,
    leading: @Composable (() -> Unit)?,
    trailing: @Composable (() -> Unit)?,
    singleLine: Boolean,
    animationProgress: Float,
    textTopPadding: Dp,
    textBottomPadding: Dp,
    labelToValuePadding: Dp,
    iconSize: Dp,
    chips: (@Composable () -> Unit)?,
    chipsSpacing: Dp,
    chipContainerCornerRadius: Dp?,
) {
    val measurePolicy = remember(
        singleLine,
        animationProgress,
        textTopPadding,
        textBottomPadding,
        labelToValuePadding,
    ) {
        TextFieldMeasurePolicy(
            singleLine = singleLine,
            animationProgress = animationProgress,
            textTopPadding = textTopPadding,
            textBottomPadding = textBottomPadding,
            labelToValuePadding = labelToValuePadding,
        )
    }
    Layout(
        modifier = modifier,
        content = {
            LeadingContent(
                modifier = Modifier.layoutId(LeadingId),
                leading = leading,
                iconSize = iconSize,
            )
            TrailingContent(
                modifier = Modifier.layoutId(TrailingId),
                trailing = trailing,
                iconSize = iconSize,
            )
            LabelContent(
                modifier = Modifier.layoutId(LabelId),
                label = label,
            )
            CompositeTextFieldContent(
                modifier = Modifier.layoutId(TextFieldId),
                textField = textField,
                placeholder = placeholder,
                chips = chips,
                chipsSpacing = chipsSpacing,
                chipContainerCornerRadius = chipContainerCornerRadius,
            )
        },
        measurePolicy = measurePolicy,
    )
}

@Composable
private fun LeadingContent(
    modifier: Modifier,
    leading: @Composable (() -> Unit)?,
    iconSize: Dp,
) {
    if (leading != null) {
        Box(
            modifier = modifier.defaultMinSize(iconSize, iconSize),
            contentAlignment = Alignment.Center,
        ) { leading() }
    }
}

@Composable
private fun TrailingContent(
    modifier: Modifier,
    trailing: @Composable (() -> Unit)?,
    iconSize: Dp,
) {
    if (trailing != null) {
        Box(
            modifier = modifier
                .defaultMinSize(iconSize, iconSize),
            contentAlignment = Alignment.Center,
        ) { trailing() }
    }
}

@Composable
private fun LabelContent(
    modifier: Modifier,
    label: @Composable (() -> Unit)?,
) {
    if (label != null) {
        Box(modifier.layoutId(LabelId)) { label() }
    }
}

@Composable
private fun CompositeTextFieldContent(
    modifier: Modifier,
    textField: @Composable () -> Unit,
    placeholder: @Composable (() -> Unit)?,
    chips: @Composable (() -> Unit)?,
    chipsSpacing: Dp,
    chipContainerCornerRadius: Dp?,
) {
    Box(
        modifier = modifier,
        propagateMinConstraints = true,
    ) {
        Row(
            modifier = Modifier
                .fieldShapeDecoration(
                    hasChips = chips != null,
                    cornerRadius = chipContainerCornerRadius,
                )
                .horizontalScroll(rememberScrollState(0)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(chipsSpacing),
        ) {
            if (chips != null) {
                chips()
            }
            Box {
                if (placeholder != null) {
                    Box(Modifier.layoutId(PlaceholderId)) { placeholder() }
                }
                textField()
            }
        }
    }
}

private fun Modifier.fieldShapeDecoration(
    hasChips: Boolean,
    cornerRadius: Dp?,
): Modifier {
    return if (hasChips && cornerRadius != null) {
        this
            .clip(RoundedCornerShape(cornerRadius))
            .wrapContentHeight()
    } else {
        this
    }
}

private class TextFieldMeasurePolicy(
    private val singleLine: Boolean,
    private val animationProgress: Float,
    private val textTopPadding: Dp,
    private val textBottomPadding: Dp,
    private val labelToValuePadding: Dp,
) : MeasurePolicy {

    @Suppress("LongMethod")
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val topPaddingValue = textTopPadding.roundToPx()
        val bottomPaddingValue = textBottomPadding.roundToPx()

        // padding between label and input text
        val topPadding = labelToValuePadding.roundToPx()
        var occupiedSpaceHorizontally = 0

        // measure leading icon
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val leadingPlaceable =
            measurables.find { it.layoutId == LeadingId }?.measure(looseConstraints)
        occupiedSpaceHorizontally += widthOrZero(
            leadingPlaceable,
        )

        // measure trailing icon
        val trailingPlaceable = measurables.find { it.layoutId == TrailingId }
            ?.measure(looseConstraints.offset(horizontal = -occupiedSpaceHorizontally))
        occupiedSpaceHorizontally += widthOrZero(
            trailingPlaceable,
        )

        // measure label
        val labelConstraints = looseConstraints
            .offset(
                vertical = -bottomPaddingValue,
                horizontal = -occupiedSpaceHorizontally,
            )
        val labelPlaceable =
            measurables.find { it.layoutId == LabelId }?.measure(labelConstraints)
        val lastBaseline = labelPlaceable?.height ?: 0
        val effectiveLabelBaseline = max(lastBaseline, topPaddingValue)

        // measure input field
        val verticalConstraintOffset = if (labelPlaceable != null) {
            -bottomPaddingValue - effectiveLabelBaseline
        } else {
            -topPaddingValue - bottomPaddingValue
        }
        val textFieldConstraints = constraints
            .copy(minHeight = 0)
            .offset(
                vertical = verticalConstraintOffset,
                horizontal = -occupiedSpaceHorizontally,
            )
        val textFieldPlaceable = measurables
            .first { it.layoutId == TextFieldId }
            .measure(textFieldConstraints)

        // measure placeholder
        val placeholderConstraints = textFieldConstraints.copy(minWidth = 0)
        val placeholderPlaceable = measurables
            .find { it.layoutId == PlaceholderId }
            ?.measure(placeholderConstraints)

        val width = calculateWidth(
            leadingWidth = widthOrZero(leadingPlaceable),
            trailingWidth = widthOrZero(trailingPlaceable),
            textFieldWidth = textFieldPlaceable.width,
            labelWidth = widthOrZero(labelPlaceable),
            placeholderWidth = widthOrZero(placeholderPlaceable),
            constraints = constraints,
        )
        val height = calculateHeight(
            textFieldHeight = textFieldPlaceable.height,
            hasLabel = labelPlaceable != null,
            labelBaseline = effectiveLabelBaseline,
            leadingHeight = heightOrZero(leadingPlaceable),
            trailingHeight = heightOrZero(trailingPlaceable),
            placeholderHeight = heightOrZero(placeholderPlaceable),
            constraints = constraints,
            density = density,
            textTopPadding = textTopPadding,
            textBottomPadding = textBottomPadding,
        )

        return layout(width, height) {
            if (labelPlaceable != null) {
                // label's final position is always relative to the baseline
                val labelEndPosition = (topPaddingValue - lastBaseline - topPadding)
                    .coerceAtLeast(0)
                placeWithLabel(
                    width = width,
                    height = height,
                    textfieldPlaceable = textFieldPlaceable,
                    labelPlaceable = labelPlaceable,
                    leadingPlaceable = leadingPlaceable,
                    trailingPlaceable = trailingPlaceable,
                    labelEndPosition = labelEndPosition,
                    textPosition = effectiveLabelBaseline,
                    animationProgress = animationProgress,
                )
            } else {
                placeWithoutLabel(
                    width = width,
                    height = height,
                    textPlaceable = textFieldPlaceable,
                    leadingPlaceable = leadingPlaceable,
                    trailingPlaceable = trailingPlaceable,
                    singleLine = singleLine,
                    density = density,
                    textTopPadding = textTopPadding,
                )
            }
        }
    }

    override fun IntrinsicMeasureScope.maxIntrinsicHeight(
        measurables: List<IntrinsicMeasurable>,
        width: Int,
    ): Int {
        return intrinsicHeight(measurables, width) { intrinsicMeasurable, w ->
            intrinsicMeasurable.maxIntrinsicHeight(w)
        }
    }

    override fun IntrinsicMeasureScope.minIntrinsicHeight(
        measurables: List<IntrinsicMeasurable>,
        width: Int,
    ): Int {
        return intrinsicHeight(measurables, width) { intrinsicMeasurable, w ->
            intrinsicMeasurable.minIntrinsicHeight(w)
        }
    }

    override fun IntrinsicMeasureScope.maxIntrinsicWidth(
        measurables: List<IntrinsicMeasurable>,
        height: Int,
    ): Int {
        return intrinsicWidth(measurables, height) { intrinsicMeasurable, h ->
            intrinsicMeasurable.maxIntrinsicWidth(h)
        }
    }

    override fun IntrinsicMeasureScope.minIntrinsicWidth(
        measurables: List<IntrinsicMeasurable>,
        height: Int,
    ): Int {
        return intrinsicWidth(measurables, height) { intrinsicMeasurable, h ->
            intrinsicMeasurable.minIntrinsicWidth(h)
        }
    }

    private fun intrinsicWidth(
        measurables: List<IntrinsicMeasurable>,
        height: Int,
        intrinsicMeasurer: (IntrinsicMeasurable, Int) -> Int,
    ): Int {
        val textFieldWidth =
            intrinsicMeasurer(measurables.first { it.layoutId == TextFieldId }, height)
        val labelWidth = measurables.find { it.layoutId == LabelId }?.let {
            intrinsicMeasurer(it, height)
        } ?: 0
        val trailingWidth = measurables.find { it.layoutId == TrailingId }?.let {
            intrinsicMeasurer(it, height)
        } ?: 0
        val leadingWidth = measurables.find { it.layoutId == LeadingId }?.let {
            intrinsicMeasurer(it, height)
        } ?: 0
        val placeholderWidth = measurables.find { it.layoutId == PlaceholderId }?.let {
            intrinsicMeasurer(it, height)
        } ?: 0
        return calculateWidth(
            leadingWidth = leadingWidth,
            trailingWidth = trailingWidth,
            textFieldWidth = textFieldWidth,
            labelWidth = labelWidth,
            placeholderWidth = placeholderWidth,
            constraints = ZeroConstraints,
        )
    }

    private fun IntrinsicMeasureScope.intrinsicHeight(
        measurables: List<IntrinsicMeasurable>,
        width: Int,
        intrinsicMeasurer: (IntrinsicMeasurable, Int) -> Int,
    ): Int {
        val textFieldHeight =
            intrinsicMeasurer(measurables.first { it.layoutId == TextFieldId }, width)
        val labelHeight = measurables.find { it.layoutId == LabelId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        val trailingHeight = measurables.find { it.layoutId == TrailingId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        val leadingHeight = measurables.find { it.layoutId == LeadingId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        val placeholderHeight = measurables.find { it.layoutId == PlaceholderId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        return calculateHeight(
            textFieldHeight = textFieldHeight,
            hasLabel = labelHeight > 0,
            labelBaseline = labelHeight,
            leadingHeight = leadingHeight,
            trailingHeight = trailingHeight,
            placeholderHeight = placeholderHeight,
            constraints = ZeroConstraints,
            density = density,
            textTopPadding = textTopPadding,
            textBottomPadding = textBottomPadding,
        )
    }
}

private fun calculateWidth(
    leadingWidth: Int,
    trailingWidth: Int,
    textFieldWidth: Int,
    labelWidth: Int,
    placeholderWidth: Int,
    constraints: Constraints,
): Int {
    val middleSection = maxOf(
        textFieldWidth,
        labelWidth,
        placeholderWidth,
    )
    val wrappedWidth = leadingWidth + middleSection + trailingWidth
    return max(wrappedWidth, constraints.minWidth)
}

private fun calculateHeight(
    textFieldHeight: Int,
    hasLabel: Boolean,
    labelBaseline: Int,
    leadingHeight: Int,
    trailingHeight: Int,
    placeholderHeight: Int,
    constraints: Constraints,
    density: Float,
    textTopPadding: Dp,
    textBottomPadding: Dp,
): Int {
    val topPaddingValue = textTopPadding.value * density
    val bottomPaddingValue = textBottomPadding.value * density

    val inputFieldHeight = max(textFieldHeight, placeholderHeight)
    val middleSectionHeight = if (hasLabel) {
        labelBaseline + inputFieldHeight + bottomPaddingValue
    } else {
        topPaddingValue + inputFieldHeight + bottomPaddingValue
    }
    return maxOf(
        middleSectionHeight.roundToInt(),
        max(leadingHeight, trailingHeight),
        constraints.minHeight,
    )
}

private fun Placeable.PlacementScope.placeWithLabel(
    width: Int,
    height: Int,
    textfieldPlaceable: Placeable,
    labelPlaceable: Placeable?,
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    labelEndPosition: Int,
    textPosition: Int,
    animationProgress: Float,
) {
    leadingPlaceable?.placeRelative(
        0,
        Alignment.CenterVertically.align(leadingPlaceable.height, height),
    )
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        Alignment.CenterVertically.align(trailingPlaceable.height, height),
    )
    labelPlaceable?.let {
        val startPosition = Alignment.CenterVertically.align(it.height, height)
        val distance = startPosition - labelEndPosition
        val positionY = startPosition - (distance * animationProgress).roundToInt()
        it.placeRelative(widthOrZero(leadingPlaceable), positionY)
    }
    textfieldPlaceable.placeRelative(widthOrZero(leadingPlaceable), textPosition)
}

private fun Placeable.PlacementScope.placeWithoutLabel(
    width: Int,
    height: Int,
    textPlaceable: Placeable,
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    singleLine: Boolean,
    density: Float,
    textTopPadding: Dp,
) {
    val topPadding = (textTopPadding.value * density).roundToInt()

    leadingPlaceable?.placeRelative(
        0,
        Alignment.CenterVertically.align(leadingPlaceable.height, height),
    )
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        Alignment.CenterVertically.align(trailingPlaceable.height, height),
    )

    val textVerticalPosition = if (singleLine) {
        Alignment.CenterVertically.align(textPlaceable.height, height)
    } else {
        topPadding
    }
    textPlaceable.placeRelative(
        widthOrZero(leadingPlaceable),
        textVerticalPosition,
    )
}

private fun widthOrZero(placeable: Placeable?) = placeable?.width ?: 0

private fun heightOrZero(placeable: Placeable?) = placeable?.height ?: 0

private val IntrinsicMeasurable.layoutId: Any?
    get() = (parentData as? LayoutIdParentData)?.layoutId

private val ZeroConstraints = Constraints(0, 0, 0, 0)

internal const val TextFieldId = "TextField"
internal const val PlaceholderId = "Hint"
internal const val LabelId = "Label"
internal const val LeadingId = "Leading"
internal const val TrailingId = "Trailing"
