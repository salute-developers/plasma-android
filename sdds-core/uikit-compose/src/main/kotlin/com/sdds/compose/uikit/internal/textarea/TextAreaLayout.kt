@file:Suppress("TopLevelPropertyNaming")

package com.sdds.compose.uikit.internal.textarea

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Layout декоратора многострочного текстового поля
 *
 * @param modifier модификатор
 * @param textField текстовое поле
 * @param label лейбл
 * @param placeholder composable заглушки
 * @param icon composable иконки
 * @param captionText composable подписи
 * @param counterText composable счетчика
 * @param chips контент с chip-элементами
 * @param chipsSpacing расстояние между chip-элементами
 * @param textTopPadding отступ от текста сверху
 * @param textBottomPadding отступ от текста снизу
 * @param labelToValuePadding отступ от лэйбла до значения поля
 * @param bottomTextBottomPadding отступ снизу от caption и counter
 * @param iconSize размер иконки
 * @param iconTopPadding отступ иконки сверху
 * @param iconStartPadding отступ иконки в начале
 * @param animationProgress прогресс анимации лейбла и заглушки
 * @param scrollState состояние скролла
 */
@Composable
@Suppress("LongMethod")
internal fun TextAreaLayout(
    modifier: Modifier,
    textField: @Composable () -> Unit,
    label: @Composable (() -> Unit)?,
    placeholder: @Composable (() -> Unit)?,
    icon: @Composable (() -> Unit)?,
    captionText: @Composable (() -> Unit)?,
    counterText: @Composable (() -> Unit)?,
    chips: @Composable (() -> Unit)?,
    iconSize: Dp,
    paddings: TextArea.Paddings,
    animationProgress: Float,
    scrollState: ScrollState,
) {
    val hasChips = chips != null
    val measurePolicy = remember(
        animationProgress,
        paddings.valueTopPadding,
        paddings.valueBottomPadding,
        paddings.innerLabelToValuePadding,
        paddings.unfocusedInnerLabelTopPadding,
        hasChips,
    ) {
        TextAreaLayoutMeasurePolicy(
            animationProgress = animationProgress,
            textTopPadding = paddings.valueTopPadding,
            textBottomPadding = paddings.valueBottomPadding,
            labelToValuePadding = paddings.innerLabelToValuePadding,
            unfocusedInnerLabelTopPadding = paddings.unfocusedInnerLabelTopPadding,
            hasChips = hasChips,
        )
    }

    Layout(
        modifier = modifier,
        content = {
            LabelContent(
                modifier = Modifier
                    .padding(start = paddings.startContentPadding)
                    .layoutId(LabelId),
                label = label,
            )
            TrailingContent(
                modifier = Modifier.layoutId(TrailingId),
                trailing = icon,
                iconSize = iconSize,
                topPadding = paddings.iconTopPadding,
                startPadding = paddings.iconStartPadding,
                endPadding = paddings.endContentPadding,
            )
            CaptionTextContent(
                modifier = Modifier.layoutId(CaptionTextId),
                captionText = captionText,
                bottomPadding = paddings.bottomTextBottomPadding,
                startPadding = paddings.bottomTextHorizontalPadding,
            )
            CounterTextContent(
                modifier = Modifier.layoutId(CounterTextId),
                counterText = counterText,
                bottomPadding = paddings.bottomTextBottomPadding,
                endPadding = paddings.bottomTextHorizontalPadding,
            )
            CompositeTextFieldContent(
                modifier = Modifier.layoutId(TextFieldId),
                textField = textField,
                placeholder = placeholder,
                chips = chips,
                chipsSpacing = paddings.chipsSpacing,
                topChipsPadding = paddings.topChipsPadding,
                startContentPadding = paddings.startContentPadding,
                scrollState = scrollState,
            )
        },
        measurePolicy = measurePolicy,
    )
}

@Composable
private fun TrailingContent(
    modifier: Modifier,
    trailing: @Composable (() -> Unit)?,
    iconSize: Dp,
    topPadding: Dp,
    startPadding: Dp,
    endPadding: Dp,
) {
    if (trailing != null) {
        Box(
            modifier = modifier
                .padding(
                    top = topPadding,
                    start = startPadding,
                    end = endPadding,
                )
                .size(iconSize)
                .defaultMinSize(iconSize, iconSize),
            contentAlignment = Alignment.Center,
        ) { trailing() }
    }
}

@Composable
private fun CaptionTextContent(
    modifier: Modifier,
    captionText: @Composable (() -> Unit)?,
    bottomPadding: Dp,
    startPadding: Dp,
) {
    if (captionText != null) {
        Box(
            modifier.padding(
                bottom = bottomPadding,
                start = startPadding,
            ),
        ) {
            captionText()
        }
    }
}

@Composable
private fun CounterTextContent(
    modifier: Modifier,
    counterText: @Composable (() -> Unit)?,
    bottomPadding: Dp,
    endPadding: Dp,
) {
    if (counterText != null) {
        Box(
            modifier.padding(
                bottom = bottomPadding,
                end = endPadding,
            ),
        ) {
            counterText()
        }
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
    topChipsPadding: Dp,
    startContentPadding: Dp,
    scrollState: ScrollState,
) {
    Column(
        modifier = modifier
            .padding(
                top = if (chips != null) topChipsPadding else 0.dp,
                start = startContentPadding,
            )
            .verticalScroll(scrollState),
    ) {
        if (chips != null) {
            ChipGroup(
                modifier = Modifier.padding(bottom = chipsSpacing),
                horizontalSpacing = chipsSpacing,
                verticalSpacing = chipsSpacing,
            ) {
                chips.invoke()
            }
        }
        Box {
            if (placeholder != null) {
                Box(Modifier.layoutId(PlaceholderId)) { placeholder() }
            }
            textField()
        }
    }
}

private class TextAreaLayoutMeasurePolicy(
    private val animationProgress: Float,
    private val textBottomPadding: Dp,
    private val labelToValuePadding: Dp,
    private val unfocusedInnerLabelTopPadding: Dp,
    textTopPadding: Dp,
    hasChips: Boolean,
) : MeasurePolicy {

    private val textTopPaddingOrZero = if (hasChips) 0.dp else textTopPadding

    @Suppress("LongMethod")
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val topPaddingValue = textTopPaddingOrZero.roundToPx()
        val bottomPaddingValue = textBottomPadding.roundToPx()
        val unfocusedInnerLabelTopPaddingPx = unfocusedInnerLabelTopPadding.roundToPx()

        // padding between label and input text
        val labelToValuePaddingPx = labelToValuePadding.roundToPx()
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        // measure trailing icon
        var occupiedSpaceHorizontally = 0
        val trailingPlaceable = measurables.find { it.layoutId == TrailingId }
            ?.measure(looseConstraints)
        occupiedSpaceHorizontally += trailingPlaceable.widthOrZero()

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

        // measure captionText
        val captionTextPlaceable = measurables
            .find { it.layoutId == CaptionTextId }
            ?.measure(looseConstraints)
        val captionTextHeight = captionTextPlaceable.heightOrZero()

        // measure counterText
        val counterTextPlaceable = measurables
            .find { it.layoutId == CounterTextId }
            ?.measure(looseConstraints)
        val counterTextHeight = counterTextPlaceable.heightOrZero()
        val maxHelperTextHeight = max(captionTextHeight, counterTextHeight)

        // measure input field
        val verticalConstraintOffset = if (labelPlaceable != null) {
            -bottomPaddingValue - effectiveLabelBaseline - maxHelperTextHeight
        } else {
            -topPaddingValue - bottomPaddingValue - maxHelperTextHeight
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
            textFieldWidth = textFieldPlaceable.width,
            trailingWidth = trailingPlaceable.widthOrZero(),
            labelWidth = labelPlaceable.widthOrZero(),
            placeholderWidth = placeholderPlaceable.widthOrZero(),
            constraints = constraints,
        )
        val height = calculateHeight(
            textFieldHeight = textFieldPlaceable.height,
            trailingHeight = trailingPlaceable.heightOrZero(),
            placeholderHeight = placeholderPlaceable.heightOrZero(),
            captionTextHeight = captionTextHeight,
            counterTextHeight = counterTextHeight,
            constraints = constraints,
            density = density,
            textTopPadding = textTopPaddingOrZero,
            textBottomPadding = textBottomPadding,
        )

        return layout(constraints.constrainWidth(width), constraints.constrainHeight(height)) {
            if (labelPlaceable != null) {
                // label's final position is always relative to the baseline
                val labelEndPosition = (topPaddingValue - lastBaseline - labelToValuePaddingPx)
                    .coerceAtLeast(0)
                placeWithLabel(
                    height = height,
                    width = width,
                    trailingPlaceable = trailingPlaceable,
                    textFieldPlaceable = textFieldPlaceable,
                    captionTextPlaceable = captionTextPlaceable,
                    counterTextPlaceable = counterTextPlaceable,
                    labelPlaceable = labelPlaceable,
                    labelEndPosition = labelEndPosition,
                    unfocusedInnerLabelPosition = unfocusedInnerLabelTopPaddingPx,
                    textPosition = topPaddingValue,
                    animationProgress = animationProgress,
                )
            } else {
                placeWithoutLabel(
                    height = height,
                    width = width,
                    textPlaceable = textFieldPlaceable,
                    trailingPlaceable = trailingPlaceable,
                    captionTextPlaceable = captionTextPlaceable,
                    counterTextPlaceable = counterTextPlaceable,
                    density = density,
                    textTopPadding = textTopPaddingOrZero,
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
        val placeholderWidth = measurables.find { it.layoutId == PlaceholderId }?.let {
            intrinsicMeasurer(it, height)
        } ?: 0
        val trailingWidth = measurables.find { it.layoutId == TrailingId }?.let {
            intrinsicMeasurer(it, height)
        } ?: 0
        return calculateWidth(
            textFieldWidth = textFieldWidth,
            trailingWidth = trailingWidth,
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
        val placeholderHeight = measurables.find { it.layoutId == PlaceholderId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        val trailingHeight = measurables.find { it.layoutId == TrailingId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        val captionTextHeight = measurables.find { it.layoutId == CaptionTextId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        val counterTextHeight = measurables.find { it.layoutId == CounterTextId }?.let {
            intrinsicMeasurer(it, width)
        } ?: 0
        return calculateHeight(
            textFieldHeight = textFieldHeight,
            trailingHeight = trailingHeight,
            placeholderHeight = placeholderHeight,
            captionTextHeight = captionTextHeight,
            counterTextHeight = counterTextHeight,
            constraints = ZeroConstraints,
            density = density,
            textTopPadding = textTopPaddingOrZero,
            textBottomPadding = textBottomPadding,
        )
    }
}

private fun calculateWidth(
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
    val wrappedWidth = middleSection + trailingWidth
    return max(wrappedWidth, constraints.minWidth)
}

private fun calculateHeight(
    textFieldHeight: Int,
    trailingHeight: Int,
    placeholderHeight: Int,
    captionTextHeight: Int,
    counterTextHeight: Int,
    constraints: Constraints,
    density: Float,
    textTopPadding: Dp,
    textBottomPadding: Dp,
): Int {
    val topPaddingValue = textTopPadding.value * density
    val bottomPaddingValue = textBottomPadding.value * density

    val inputFieldHeight = max(textFieldHeight, placeholderHeight)
    val maxHelperTextHeight = max(captionTextHeight, counterTextHeight)
    val middleSectionHeight =
        topPaddingValue + inputFieldHeight + bottomPaddingValue + maxHelperTextHeight
    return maxOf(
        middleSectionHeight.roundToInt(),
        trailingHeight,
        constraints.minHeight,
    )
}

private fun Placeable.PlacementScope.placeWithLabel(
    width: Int,
    height: Int,
    textFieldPlaceable: Placeable,
    captionTextPlaceable: Placeable?,
    counterTextPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    labelPlaceable: Placeable?,
    labelEndPosition: Int,
    textPosition: Int,
    animationProgress: Float,
    unfocusedInnerLabelPosition: Int,
) {
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        0,
    )
    labelPlaceable?.let {
        val distance = unfocusedInnerLabelPosition - labelEndPosition
        val positionY = unfocusedInnerLabelPosition - (distance * animationProgress).roundToInt()
        it.placeRelative(0, positionY)
    }
    textFieldPlaceable.placeRelative(0, textPosition)
    captionTextPlaceable?.placeRelative(0, height - captionTextPlaceable.height)
    counterTextPlaceable?.placeRelative(
        width - counterTextPlaceable.width,
        height - counterTextPlaceable.height,
    )
}

private fun Placeable.PlacementScope.placeWithoutLabel(
    height: Int,
    width: Int,
    textPlaceable: Placeable,
    trailingPlaceable: Placeable?,
    captionTextPlaceable: Placeable?,
    counterTextPlaceable: Placeable?,
    density: Float,
    textTopPadding: Dp,
) {
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        0,
    )
    val topPadding = (textTopPadding.value * density).roundToInt()
    textPlaceable.placeRelative(0, topPadding)
    captionTextPlaceable?.placeRelative(0, height - captionTextPlaceable.height)
    counterTextPlaceable?.placeRelative(
        width - counterTextPlaceable.width,
        height - counterTextPlaceable.height,
    )
}

private val IntrinsicMeasurable.layoutId: Any?
    get() = (parentData as? LayoutIdParentData)?.layoutId

private val ZeroConstraints = Constraints(0, 0, 0, 0)

internal const val TextFieldId = "TextField"
internal const val TrailingId = "TrailingIcon"
internal const val CaptionTextId = "CaptionText"
internal const val CounterTextId = "CounterText"
internal const val PlaceholderId = "Hint"
internal const val LabelId = "Label"
