@file:Suppress("TopLevelPropertyNaming")

package com.sdds.compose.uikit.internal.textfield

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.CoreTextField
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Layout декоратора многострочного текстового поляs
 */
@OptIn(ExperimentalTextApi::class)
@Composable
@Suppress("LongMethod")
internal fun TextFieldLayout(
    modifier: Modifier,
    singleLine: Boolean,
    textField: @Composable () -> Unit,
    innerLabel: @Composable (() -> Unit)?,
    innerOptional: @Composable (() -> Unit)?,
    placeholder: @Composable (() -> Unit)?,
    startIcon: @Composable (() -> Unit)?,
    endIcon: @Composable (() -> Unit)?,
    captionText: @Composable (() -> Unit)?,
    counterText: @Composable (() -> Unit)?,
    chips: @Composable (() -> Unit)?,
    chipHeight: Dp,
    alignmentLineHeight: Dp,
    chipContainerShape: CornerBasedShape?,
    iconSize: Dp,
    valueTextStyle: TextStyle,
    innerLabelTextStyle: TextStyle,
    paddings: CoreTextField.Paddings,
    animationProgress: Float,
    verticalScrollState: ScrollState?,
) {
    val hasChips = chips != null
    val minTextHeight = alignmentLineHeight - paddings.boxPaddingTop * 2
    val textMeasurer = rememberTextMeasurer()
    val measurePolicy = remember(
        animationProgress,
        valueTextStyle,
        innerLabelTextStyle,
        chipHeight,
        minTextHeight,
        hasChips,
    ) {
        CoreTextFieldLayoutMeasurePolicy(
            textMeasurer = textMeasurer,
            valueTextStyle = valueTextStyle,
            innerLabelTextStyle = innerLabelTextStyle,
            animationProgress = animationProgress,
            chipHeight = chipHeight,
            minTextHeight = minTextHeight,
            hasChips = hasChips,
        )
    }
    Layout(
        modifier = modifier
            .padding(
                start = if (hasChips) paddings.chipsPadding else paddings.boxPaddingStart,
                end = paddings.boxPaddingEnd,
                top = if (hasChips) paddings.chipsPadding else paddings.boxPaddingTop,
                bottom = if (hasChips) paddings.chipsPadding else paddings.boxPaddingBottom,
            ),
        content = {
            LabelContent(
                modifier = Modifier
                    .layoutId(LabelId),
                innerLabel = innerLabel,
                innerOptional = innerOptional,
                horizontalPadding = paddings.optionalPadding,
            )
            IconContent(
                modifier = Modifier
                    .layoutId(LeadingId)
                    .padding(end = paddings.startContentEndPadding)
                    .size(iconSize)
                    .defaultMinSize(iconSize, iconSize),
                icon = startIcon,
            )
            IconContent(
                modifier = Modifier
                    .layoutId(TrailingId)
                    .padding(start = paddings.endContentStartPadding)
                    .size(iconSize)
                    .defaultMinSize(iconSize, iconSize),
                icon = endIcon,
            )
            CaptionTextContent(
                modifier = Modifier
                    .layoutId(CaptionTextId)
                    .padding(
                        top = paddings.helperTextPadding,
                        start = adjustStartPaddingWhenHasChips(
                            hasChips = hasChips,
                            startPadding = paddings.boxPaddingStart,
                            chipsPadding = paddings.chipsPadding,
                        ),
                    ),
                captionText = captionText,
            )
            CounterTextContent(
                modifier = Modifier
                    .layoutId(CounterTextId)
                    .padding(top = paddings.helperTextPadding),
                counterText = counterText,
            )
            CompositeTextFieldContent(
                modifier = Modifier.layoutId(TextFieldId),
                textField = textField,
                placeholder = placeholder,
                chips = chips,
                chipContainerShape = chipContainerShape,
                paddings = paddings,
                scrollState = verticalScrollState,
                singleLine = singleLine,
            )
        },
        measurePolicy = measurePolicy,
    )
}

private fun adjustStartPaddingWhenHasChips(
    hasChips: Boolean,
    startPadding: Dp,
    chipsPadding: Dp,
): Dp {
    return if (hasChips) startPadding - chipsPadding else 0.dp
}

@Composable
private fun IconContent(
    modifier: Modifier,
    icon: @Composable (() -> Unit)?,
) {
    if (icon != null) {
        Box(
            modifier = modifier,
            contentAlignment = Alignment.Center,
        ) { icon() }
    }
}

@Composable
private fun CaptionTextContent(
    modifier: Modifier,
    captionText: @Composable (() -> Unit)?,
) {
    if (captionText != null) {
        Box(modifier = modifier) {
            captionText()
        }
    }
}

@Composable
private fun CounterTextContent(
    modifier: Modifier,
    counterText: @Composable (() -> Unit)?,
) {
    if (counterText != null) {
        Box(modifier) {
            counterText()
        }
    }
}

@Composable
private fun LabelContent(
    modifier: Modifier,
    innerLabel: @Composable (() -> Unit)?,
    innerOptional: @Composable (() -> Unit)?,
    horizontalPadding: Dp,
) {
    if (innerLabel == null && innerOptional == null) return
    Row(modifier.layoutId(LabelId)) {
        innerLabel?.invoke()
        innerOptional?.let {
            Spacer(modifier = Modifier.size(horizontalPadding))
            it.invoke()
        }
    }
}

@Composable
private fun CompositeTextFieldContent(
    modifier: Modifier,
    textField: @Composable () -> Unit,
    placeholder: @Composable (() -> Unit)?,
    chips: @Composable (() -> Unit)?,
    paddings: CoreTextField.Paddings,
    scrollState: ScrollState?,
    singleLine: Boolean,
    chipContainerShape: CornerBasedShape?,
) {
    val textContent: @Composable () -> Unit = {
        Box {
            if (placeholder != null) {
                Box(Modifier.layoutId(PlaceholderId)) { placeholder() }
            }
            textField()
        }
    }
    if (!singleLine) {
        TextAreaContent(
            modifier = modifier,
            textContent = textContent,
            chips = chips,
            paddings = paddings,
            scrollState = scrollState,
            chipContainerShape = chipContainerShape,
        )
    } else {
        TextFieldContent(
            modifier = modifier,
            textContent = textContent,
            chips = chips,
            paddings = paddings,
            chipContainerShape = chipContainerShape,
        )
    }
}

@Composable
private fun TextAreaContent(
    modifier: Modifier,
    textContent: @Composable (() -> Unit),
    chips: @Composable (() -> Unit)?,
    paddings: CoreTextField.Paddings,
    scrollState: ScrollState?,
    chipContainerShape: CornerBasedShape?,
) {
    Column(
        modifier = modifier
            .fieldShapeDecoration(
                hasChips = chips != null,
                chipContainerShape = chipContainerShape,
            )
            .then(
                scrollState?.let { Modifier.verticalScroll(it) } ?: Modifier,
            ),
        verticalArrangement = Arrangement.spacedBy(paddings.boxPaddingTop),
        content = {
            if (chips != null) {
                ChipGroup(
                    horizontalSpacing = paddings.chipsSpacing,
                    verticalSpacing = paddings.chipsSpacing,
                    overflowMode = ChipGroup.OverflowMode.Wrap,
                ) {
                    chips.invoke()
                }
            }
            Box(
                modifier = Modifier.padding(
                    start = adjustStartPaddingWhenHasChips(
                        hasChips = chips != null,
                        startPadding = paddings.boxPaddingStart,
                        chipsPadding = paddings.chipsPadding,
                    ),
                ),
            ) {
                textContent()
            }
        },
    )
}

@Composable
private fun TextFieldContent(
    modifier: Modifier,
    textContent: @Composable (() -> Unit),
    chips: @Composable (() -> Unit)?,
    paddings: CoreTextField.Paddings,
    chipContainerShape: CornerBasedShape?,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(paddings.chipsSpacing),
        modifier = modifier
            .fieldShapeDecoration(
                hasChips = chips != null,
                chipContainerShape = chipContainerShape,
            )
            .horizontalScroll(rememberScrollState()),
        content = {
            if (chips != null) {
                ChipGroup(
                    modifier = Modifier
                        .padding(end = paddings.boxPaddingStart + paddings.chipsSpacing),
                    horizontalSpacing = paddings.chipsSpacing,
                    verticalSpacing = paddings.chipsSpacing,
                    overflowMode = ChipGroup.OverflowMode.Unlimited,
                ) {
                    chips.invoke()
                }
            }
            textContent()
        },
    )
}

private fun Modifier.fieldShapeDecoration(
    hasChips: Boolean,
    chipContainerShape: CornerBasedShape?,
): Modifier {
    return if (hasChips && chipContainerShape != null) {
        this.clip(chipContainerShape)
    } else {
        this
    }
}

private class CoreTextFieldLayoutMeasurePolicy
@OptIn(ExperimentalTextApi::class)
constructor(
    private val valueTextStyle: TextStyle,
    private val innerLabelTextStyle: TextStyle,
    private val textMeasurer: TextMeasurer,
    private val animationProgress: Float,
    private val chipHeight: Dp,
    private val minTextHeight: Dp,
    private val hasChips: Boolean,
) : MeasurePolicy {

    @OptIn(ExperimentalTextApi::class)
    @Suppress("LongMethod")
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

        var occupiedSpaceHorizontally = 0
        // measure leading icon
        val leadingPlaceable = measurables.find { it.layoutId == LeadingId }
            ?.measure(looseConstraints)
        occupiedSpaceHorizontally += leadingPlaceable.widthOrZero()

        // measure trailing icon
        val trailingPlaceable = measurables.find { it.layoutId == TrailingId }
            ?.measure(looseConstraints)
        occupiedSpaceHorizontally += trailingPlaceable.widthOrZero()

        // measure label
        val labelConstraints = looseConstraints.offset(horizontal = -occupiedSpaceHorizontally)
        val labelPlaceable =
            measurables.find { it.layoutId == LabelId }?.measure(labelConstraints)

        // measure captionText
        val captionTextPlaceable = measurables
            .find { it.layoutId == CaptionTextId }
            ?.measure(looseConstraints)

        // measure counterText
        val counterTextPlaceable = measurables
            .find { it.layoutId == CounterTextId }
            ?.measure(looseConstraints.offset(horizontal = -captionTextPlaceable.widthOrZero()))
        val counterTextHeight = counterTextPlaceable.heightOrZero()

        // measure input field
        val labelHeight = labelPlaceable.heightOrZero()
        val captionTextHeight = captionTextPlaceable.heightOrZero()
        val maxHelperTextHeight = max(captionTextHeight, counterTextHeight)
        val verticalConstraintOffset = if (labelPlaceable != null) {
            -labelHeight - maxHelperTextHeight
        } else {
            -maxHelperTextHeight
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

        val firstValueLineHeight = getLineHeight(textMeasurer, valueTextStyle)
        val smallLabelTextHeight = getLabelLineHeight(
            hasLabel = labelPlaceable != null,
            textMeasurer = textMeasurer,
            textStyle = innerLabelTextStyle,
        )
        val chipsHeightOrZero = if (hasChips) chipHeight.roundToPx() else 0
        // расчет высоты первой строки контента (icons/innerLabel + 1 строка value/chips)
        val firstLineHeight = maxOf(
            firstValueLineHeight + smallLabelTextHeight,
            leadingPlaceable.heightOrZero(),
            trailingPlaceable.heightOrZero(),
            chipsHeightOrZero,
            minTextHeight.roundToPx(),
        )

        val width = calculateWidth(
            textFieldWidth = textFieldPlaceable.width,
            leadingWidth = leadingPlaceable.widthOrZero(),
            trailingWidth = trailingPlaceable.widthOrZero(),
            labelWidth = labelPlaceable.widthOrZero(),
            captionWidth = captionTextPlaceable.widthOrZero(),
            counterWidth = counterTextPlaceable.widthOrZero(),
            placeholderWidth = placeholderPlaceable.widthOrZero(),
            constraints = constraints,
        )
        val height = calculateHeight(
            textFieldHeight = textFieldPlaceable.height,
            firstLineHeight = firstLineHeight,
            labelHeight = labelPlaceable?.let { smallLabelTextHeight } ?: 0,
            placeholderHeight = placeholderPlaceable.heightOrZero(),
            captionTextHeight = captionTextHeight,
            counterTextHeight = counterTextHeight,
            constraints = constraints,
        )

        return layout(constraints.constrainWidth(width), constraints.constrainHeight(height)) {
            if (labelPlaceable != null) {
                placeWithLabel(
                    height = height,
                    width = width,
                    leadingPlaceable = leadingPlaceable,
                    trailingPlaceable = trailingPlaceable,
                    textFieldPlaceable = textFieldPlaceable,
                    captionTextPlaceable = captionTextPlaceable,
                    counterTextPlaceable = counterTextPlaceable,
                    labelPlaceable = labelPlaceable,
                    animationProgress = animationProgress,
                    firstLineHeight = firstLineHeight,
                )
            } else {
                placeWithoutLabel(
                    height = height,
                    width = width,
                    textPlaceable = textFieldPlaceable,
                    leadingPlaceable = leadingPlaceable,
                    trailingPlaceable = trailingPlaceable,
                    captionTextPlaceable = captionTextPlaceable,
                    counterTextPlaceable = counterTextPlaceable,
                    firstValueLineHeight = firstValueLineHeight,
                    firstLineHeight = firstLineHeight,
                    hasChips = hasChips,
                )
            }
        }
    }
}

@OptIn(ExperimentalTextApi::class)
private fun getLineHeight(textMeasurer: TextMeasurer, textStyle: TextStyle): Int {
    val valueLayoutResult = textMeasurer.measureStyle(textStyle)
    val valueLineBottom = valueLayoutResult.getLineBottom(0)
    val valueLineTop = valueLayoutResult.getLineTop(0)
    return (valueLineBottom - valueLineTop).roundToInt()
}

@OptIn(ExperimentalTextApi::class)
private fun TextMeasurer.measureStyle(textStyle: TextStyle): TextLayoutResult {
    return measure(AnnotatedString(DUMMY_TEXT), textStyle)
}

@OptIn(ExperimentalTextApi::class)
private fun getLabelLineHeight(
    hasLabel: Boolean,
    textMeasurer: TextMeasurer,
    textStyle: TextStyle,
): Int {
    return if (hasLabel) { getLineHeight(textMeasurer, textStyle) } else 0
}

private fun calculateWidth(
    leadingWidth: Int,
    trailingWidth: Int,
    textFieldWidth: Int,
    labelWidth: Int,
    placeholderWidth: Int,
    constraints: Constraints,
    captionWidth: Int,
    counterWidth: Int,
): Int {
    val middleSection = maxOf(
        textFieldWidth,
        labelWidth,
        placeholderWidth,
    )
    val wrappedWidth = leadingWidth + middleSection + trailingWidth
    val bottomSection = captionWidth + counterWidth
    return maxOf(wrappedWidth, bottomSection, constraints.minWidth)
}

private fun calculateHeight(
    textFieldHeight: Int,
    labelHeight: Int,
    firstLineHeight: Int,
    placeholderHeight: Int,
    captionTextHeight: Int,
    counterTextHeight: Int,
    constraints: Constraints,
): Int {
    val inputFieldHeight = max(textFieldHeight, placeholderHeight)
    val maxHelperTextHeight = max(captionTextHeight, counterTextHeight)
    val mainContentHeight = maxOf(
        inputFieldHeight + labelHeight,
        firstLineHeight,
    )
    val contentHeight = mainContentHeight + maxHelperTextHeight
    return max(constraints.minHeight, contentHeight)
}

private fun Placeable.PlacementScope.placeWithLabel(
    width: Int,
    height: Int,
    firstLineHeight: Int,
    textFieldPlaceable: Placeable,
    captionTextPlaceable: Placeable?,
    counterTextPlaceable: Placeable?,
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    labelPlaceable: Placeable?,
    animationProgress: Float,
) {
    // размещение контента в начале
    val leadingVerticalPosition =
        Alignment.CenterVertically.align(leadingPlaceable.heightOrZero(), firstLineHeight)
    leadingPlaceable?.placeRelative(
        0,
        leadingVerticalPosition,
    )
    // размещение контента в конце
    val trailingVerticalPosition =
        Alignment.CenterVertically.align(trailingPlaceable.heightOrZero(), firstLineHeight)
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        trailingVerticalPosition,
    )

    // размещение лэйбла
    labelPlaceable?.let {
        val startLabelVerticalPosition =
            Alignment.CenterVertically.align(labelPlaceable.heightOrZero(), firstLineHeight)
        val positionY =
            startLabelVerticalPosition - (startLabelVerticalPosition * animationProgress).roundToInt()
        it.placeRelative(leadingPlaceable.widthOrZero(), positionY)
    }

    // размещение текста
    textFieldPlaceable.placeRelative(leadingPlaceable.widthOrZero(), labelPlaceable.heightOrZero())

    // размещение нижних надписей
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
    leadingPlaceable: Placeable?,
    trailingPlaceable: Placeable?,
    captionTextPlaceable: Placeable?,
    counterTextPlaceable: Placeable?,
    firstValueLineHeight: Int,
    firstLineHeight: Int,
    hasChips: Boolean,
) {
    // размещение контента в начале
    val leadingVerticalPosition =
        Alignment.CenterVertically.align(leadingPlaceable.heightOrZero(), firstLineHeight)
    leadingPlaceable?.placeRelative(
        0,
        leadingVerticalPosition,
    )
    // размещение контента в конце
    val trailingVerticalPosition =
        Alignment.CenterVertically.align(trailingPlaceable.heightOrZero(), firstLineHeight)
    trailingPlaceable?.placeRelative(
        width - trailingPlaceable.width,
        trailingVerticalPosition,
    )

    // размещение текста
    val textVerticalPosition =
        if (hasChips) 0 else Alignment.CenterVertically.align(firstValueLineHeight, firstLineHeight)
    textPlaceable.placeRelative(leadingPlaceable.widthOrZero(), textVerticalPosition)

    // размещение нижних надписей
    captionTextPlaceable?.placeRelative(0, height - captionTextPlaceable.height)
    counterTextPlaceable?.placeRelative(
        width - counterTextPlaceable.width,
        height - counterTextPlaceable.height,
    )
}

private const val TextFieldId = "TextField"
private const val TrailingId = "TrailingIcon"
private const val LeadingId = "LeadingIcon"
private const val CaptionTextId = "CaptionText"
private const val CounterTextId = "CounterText"
private const val PlaceholderId = "Hint"
private const val LabelId = "Label"
private const val DUMMY_TEXT = "Text"
