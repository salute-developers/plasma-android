package com.sdds.compose.uikit.internal.textfield

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.Animation
import com.sdds.compose.uikit.TextField.FieldAppearance
import com.sdds.compose.uikit.TextField.FieldType
import com.sdds.compose.uikit.TextField.HelperTextPosition
import com.sdds.compose.uikit.TextField.Indicator
import com.sdds.compose.uikit.TextField.LabelPlacement
import com.sdds.compose.uikit.internal.common.IndicatorPlacement
import com.sdds.compose.uikit.internal.common.drawIndicator
import com.sdds.compose.uikit.scrollbar

/**
 * Поле ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param singleLine однострочный или многострочный режим
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldAppearance внешний вид поля (с фоном или без)
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [FieldType])
 * @param labelPlacement тип отображения лэйбла: [LabelPlacement.Outer] снаружи поля ввода, [LabelPlacement.Inner] внутри поля ввода
 * @param helperTextPosition тип отображения вспомогательного текста (caption/counter): [HelperTextPosition.Outer] снаружи поля ввода, [HelperTextPosition.Inner] внутри поля ввода
 * @param placeholder заглушка если пустое [value] и тип [LabelPlacement.Outer]
 * @param label текст лэйбла
 * @param caption текст подписи под полем ввода
 * @param counter текст счетчика под полем ввода
 * @param contentStart иконка, которая будет находиться в начале поля ввода
 * @param contentEnd иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту, которая должна быть задана в параметре [chipHeight]
 * @param valueStyle стиль value
 * @param labelStyle стиль лэйбла в режиме [labelPlacement] == [LabelPlacement.Inner]
 * @param optionalStyle стиль optional в режиме [labelPlacement] == [LabelPlacement.Inner]
 * @param captionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPosition.Inner]
 * @param counterStyle стиль счетчика в режиме [helperTextPosition] == [HelperTextPosition.Inner]
 * @param placeHolderStyle стиль placeholder
 * @param startContentColor цвет контента в начале
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы
 * @param chipHeight высота чипов
 * @param iconSize размер иконки
 * @param paddings отступы [TextField]
 * @param scrollBar настройки scroll bar для режима [singleLine] == true
 * @param animation параметры анимации [Animation]
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param interactionSource источник взаимодействия с полем
 */
@Composable
@Suppress("LongMethod")
internal fun BaseTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    singleLine: Boolean,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldAppearance: FieldAppearance = FieldAppearance.Solid(),
    fieldType: FieldType? = null,
    labelPlacement: LabelPlacement = LabelPlacement.Outer,
    helperTextPosition: HelperTextPosition = if (singleLine || fieldAppearance is FieldAppearance.Clear) {
        HelperTextPosition.Outer
    } else {
        HelperTextPosition.Inner
    },
    placeholder: String? = null,
    label: String? = null,
    caption: String? = null,
    counter: String? = null,
    contentStart: @Composable (() -> Unit)? = null,
    contentEnd: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    chipHeight: Dp,
    boxMinHeight: Dp,
    alignmentLineHeight: Dp,
    labelStyle: TextStyle = TextStyle(),
    optionalStyle: TextStyle = TextStyle(),
    valueStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    counterStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    cursorColor: Color = Color.Blue,
    startContentColor: Color,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    chipContainerShape: CornerBasedShape? = null,
    paddings: TextField.Paddings = TextField.Paddings(),
    iconSize: Dp = 24.dp,
    scrollBar: ScrollBar? = null,
    animation: Animation = Animation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val optionalField = fieldType as? FieldType.Optional
    val requiredField = fieldType as? FieldType.Required

    Column(
        modifier = modifier
            .graphicsLayer {
                alpha = if (enabled) enabledAlpha else disabledAlpha
            }
            .width(IntrinsicSize.Max)
            .applyIndicatorPadding(
                requiredField = requiredField,
                labelPlacement = labelPlacement,
                labelText = label,
                keepIndicatorStartPadding = paddings.keepIndicatorStartPadding,
            ),
    ) {
        OuterTopContent(
            modifier = Modifier
                .padding(bottom = paddings.labelPadding)
                .applyOuterLabelIndicator(requiredField, labelPlacement),
            labelPlacement = labelPlacement,
            fieldType = fieldType,
            labelText = label,
            labelTextStyle = labelStyle,
            optionalTextStyle = optionalStyle,
            horizontalSpacing = paddings.optionalPadding,
        )

        val scrollState = rememberScrollState()
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .defaultMinSize(minHeight = boxMinHeight)
                .fillMaxWidth()
                .applyFieldIndicator(
                    requiredField,
                    labelPlacement,
                    fieldAppearance,
                    alignmentLineHeight,
                )
                .clip(if (fieldAppearance is FieldAppearance.Solid) fieldAppearance.shape else RectangleShape)
                .drawFieldAppearance(fieldAppearance)
                .applyScrollBar(scrollState, scrollBar),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = valueStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            cursorBrush = SolidColor(cursorColor),
        ) {
            val isFocused = interactionSource.collectIsFocusedAsState().value
            DecorationBox(
                value = value.text,
                innerTextField = it,
                visualTransformation = visualTransformation,
                interactionSource = interactionSource,
                innerLabel = innerLabel(
                    label = label,
                    labelPlacement = labelPlacement,
                    isFocused = isFocused,
                    value = value,
                    placeHolderStyle = placeHolderStyle,
                    innerLabelStyle = labelStyle,
                    hasChips = chipsContent != null,
                ),
                innerOptional = innerOptional(
                    labelPlacement = labelPlacement,
                    optionalField = optionalField,
                    isFocused = isFocused,
                    value = value,
                    placeHolderStyle = placeHolderStyle,
                    innerOptionalStyle = optionalStyle,
                    hasChips = chipsContent != null,
                ),
                placeholder = placeholder(placeholder, placeHolderStyle),
                contentStart = contentStart(contentStart, startContentColor),
                contentEnd = contentEnd,
                innerCaption = innerCaption(helperTextPosition, caption, captionStyle),
                innerCounter = innerCounter(helperTextPosition, counter, counterStyle),
                animation = animation,
                chips = chipsContent,
                chipHeight = chipHeight,
                alignmentLineHeight = alignmentLineHeight,
                chipContainerShape = chipContainerShape,
                iconSize = iconSize,
                paddings = paddings,
                verticalScrollState = if (!singleLine) scrollState else null,
                singleLine = singleLine,
                isClearAppearance = fieldAppearance is FieldAppearance.Clear,
                valueTextStyle = valueStyle,
                innerLabelTextStyle = labelStyle,
            )
        }
        OuterBottomContent(
            helperTextPosition = helperTextPosition,
            helperTextPadding = paddings.helperTextPadding,
            captionText = caption,
            counterText = counter,
            captionStyle = captionStyle,
            counterStyle = counterStyle,
        )
    }
}

private fun Modifier.drawFieldAppearance(fieldAppearance: FieldAppearance): Modifier {
    return this.drawBehind {
        when (fieldAppearance) {
            is FieldAppearance.Clear -> {
                val verticalOffset = fieldAppearance.dividerVerticalOffset.roundToPx()
                drawLine(
                    color = fieldAppearance.dividerColor,
                    start = Offset(0f, size.height - verticalOffset),
                    end = Offset(size.width, size.height - verticalOffset),
                    strokeWidth = fieldAppearance.dividerThickness.toPx(),
                    cap = StrokeCap.Round,
                )
            }

            is FieldAppearance.Solid -> drawRect(fieldAppearance.backgroundColor)
        }
    }
}

private fun Modifier.applyScrollBar(
    scrollState: ScrollState,
    scrollBar: ScrollBar?,
): Modifier {
    return scrollBar?.let {
        this.scrollbar(
            state = scrollState,
            direction = Orientation.Vertical,
            indicatorThickness = scrollBar.indicatorThickness,
            indicatorColor = scrollBar.indicatorColor,
            alpha = scrollBar.alpha
                ?: if (scrollState.isScrollInProgress) 0.8f else 0f,
            alphaAnimationSpec = scrollBar.alphaAnimationSpec ?: tween(
                delayMillis = if (scrollState.isScrollInProgress) 0 else 1500,
                durationMillis = if (scrollState.isScrollInProgress) 150 else 500,
            ),
            padding = scrollBar.padding,
        )
    } ?: this
}

private fun contentStart(
    contentStart: @Composable (() -> Unit)?,
    startContentColor: Color,
): @Composable (() -> Unit)? {
    return if (contentStart != null) {
        {
            CompositionLocalProvider(LocalTint provides startContentColor) {
                contentStart()
            }
        }
    } else {
        null
    }
}

private fun innerOptional(
    labelPlacement: LabelPlacement,
    optionalField: FieldType.Optional?,
    isFocused: Boolean,
    value: TextFieldValue,
    placeHolderStyle: TextStyle,
    innerOptionalStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    return if (labelPlacement == LabelPlacement.Inner && !hasChips) {
        textOrNull(
            text = optionalField?.optionalText,
            textStyle = if (!isFocused && value.text.isEmpty()) {
                placeHolderStyle.copy(color = innerOptionalStyle.color)
            } else {
                innerOptionalStyle
            },
        )
    } else {
        null
    }
}

private fun innerLabel(
    label: String?,
    labelPlacement: LabelPlacement,
    isFocused: Boolean,
    value: TextFieldValue,
    placeHolderStyle: TextStyle,
    innerLabelStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    return if (labelPlacement == LabelPlacement.Inner && !hasChips) {
        textOrNull(
            text = label,
            textStyle = if (!isFocused && value.text.isEmpty()) {
                placeHolderStyle
            } else {
                innerLabelStyle
            },
        )
    } else {
        null
    }
}

private fun innerCaption(
    helperTextPosition: HelperTextPosition,
    captionText: String?,
    innerCaptionStyle: TextStyle,
): (@Composable () -> Unit)? {
    return if (helperTextPosition == HelperTextPosition.Inner) {
        textOrNull(
            text = captionText,
            textStyle = innerCaptionStyle,
        )
    } else {
        null
    }
}

private fun innerCounter(
    helperTextPosition: HelperTextPosition,
    counterText: String?,
    innerCaptionStyle: TextStyle,
): (@Composable () -> Unit)? {
    return if (helperTextPosition == HelperTextPosition.Inner) {
        textOrNull(
            text = counterText,
            textStyle = innerCaptionStyle,
        )
    } else {
        null
    }
}

private fun Modifier.applyIndicatorPadding(
    requiredField: FieldType.Required?,
    labelPlacement: LabelPlacement,
    labelText: String?,
    keepIndicatorStartPadding: Dp?,
): Modifier {
    val isLabelOuter = labelPlacement == LabelPlacement.Outer
    val isIndicatorStart = requiredField?.indicator?.placement == Indicator.Placement.Start
    val shouldApply = isLabelOuter && isIndicatorStart && !labelText.isNullOrEmpty() ||
        keepIndicatorStartPadding != null
    return if (shouldApply) {
        val startPadding = requiredField?.let { it.indicator.size + it.indicator.horizontalPadding }
            ?: keepIndicatorStartPadding
            ?: 0.dp
        this.padding(start = startPadding)
    } else {
        this
    }
}

private fun Modifier.applyFieldIndicator(
    requiredFieldType: FieldType.Required?,
    labelPlacement: LabelPlacement,
    fieldAppearance: FieldAppearance,
    alignmentLineHeight: Dp,
): Modifier {
    if (requiredFieldType == null || labelPlacement == LabelPlacement.Outer) return this

    val indicator = requiredFieldType.indicator
    val alignment = fieldIndicatorAlignment(indicator.placement)
    val horizontalMode = fieldIndicatorHorizontalMode(fieldAppearance)
    val verticalAlignmentOffset: Dp = indicatorVerticalAlignmentOffset(
        fieldAppearance = fieldAppearance,
        alignmentLineHeight = alignmentLineHeight,
        size = indicator.size,
    )

    return this.drawIndicator(
        alignment = alignment,
        color = indicator.color,
        horizontalPadding = indicator.horizontalPadding,
        verticalPadding = indicator.verticalPadding + verticalAlignmentOffset,
        size = indicator.size,
        horizontalMode = horizontalMode,
        verticalMode = IndicatorPlacement.Inner,
    )
}

private fun fieldIndicatorAlignment(badgePlacement: Indicator.Placement): Alignment {
    return when (badgePlacement) {
        Indicator.Placement.Start -> Alignment.TopStart
        Indicator.Placement.End -> Alignment.TopEnd
    }
}

private fun fieldIndicatorHorizontalMode(fieldAppearance: FieldAppearance): IndicatorPlacement {
    return if (fieldAppearance is FieldAppearance.Solid) {
        IndicatorPlacement.Inner
    } else {
        IndicatorPlacement.Outer
    }
}

private fun indicatorVerticalAlignmentOffset(
    fieldAppearance: FieldAppearance,
    alignmentLineHeight: Dp,
    size: Dp,
): Dp {
    return if (fieldAppearance is FieldAppearance.Clear) {
        (alignmentLineHeight - size) / 2
    } else {
        0.dp
    }
}

private fun Modifier.applyOuterLabelIndicator(
    requiredFieldType: FieldType.Required?,
    labelPlacement: LabelPlacement,
): Modifier {
    if (requiredFieldType == null || labelPlacement != LabelPlacement.Outer) return this
    val indicator = requiredFieldType.indicator
    val alignment = outerLabelIndicatorAlignment(indicator.placement)

    return this.drawIndicator(
        alignment = alignment,
        color = indicator.color,
        horizontalPadding = indicator.horizontalPadding,
        verticalPadding = indicator.verticalPadding,
        size = indicator.size,
        horizontalMode = IndicatorPlacement.Outer,
        verticalMode = IndicatorPlacement.Inner,
    )
}

private fun outerLabelIndicatorAlignment(badgePlacement: Indicator.Placement): Alignment {
    return when (badgePlacement) {
        Indicator.Placement.Start -> Alignment.CenterStart
        Indicator.Placement.End -> Alignment.TopEnd
    }
}

private fun placeholder(
    placeholder: String?,
    textStyle: TextStyle,
): @Composable (() -> Unit)? {
    if (placeholder == null) return null
    return {
        Text(
            text = placeholder,
            style = textStyle,
        )
    }
}

private fun textOrNull(
    text: String?,
    textStyle: TextStyle?,
): @Composable (() -> Unit)? {
    return if (!text.isNullOrEmpty() && textStyle != null) {
        {
            Text(
                text = text,
                style = textStyle,
            )
        }
    } else {
        null
    }
}

@Composable
private fun OuterTopContent(
    modifier: Modifier,
    labelPlacement: LabelPlacement,
    fieldType: FieldType?,
    labelText: String?,
    labelTextStyle: TextStyle,
    optionalTextStyle: TextStyle,
    horizontalSpacing: Dp,
) {
    val hasContent =
        !labelText.isNullOrEmpty() || fieldType is FieldType.Optional && fieldType.optionalText.isNotEmpty()
    val shouldShowTopContent = labelPlacement == LabelPlacement.Outer && hasContent
    if (!shouldShowTopContent) return

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(horizontalSpacing),
    ) {
        TextOrEmpty(
            text = labelText,
            textStyle = labelTextStyle,
        )
        if (fieldType is FieldType.Optional) {
            TextOrEmpty(
                text = fieldType.optionalText,
                textStyle = optionalTextStyle,
            )
        }
    }
}

@Composable
private fun OuterBottomContent(
    captionText: String?,
    counterText: String?,
    captionStyle: TextStyle,
    counterStyle: TextStyle,
    helperTextPosition: HelperTextPosition,
    helperTextPadding: Dp,
) {
    val isEmpty = captionText.isNullOrEmpty() && counterText.isNullOrEmpty()
    if (helperTextPosition != HelperTextPosition.Outer || isEmpty) return
    Row(
        modifier = Modifier
            .padding(top = helperTextPadding)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        TextOrEmpty(
            text = captionText,
            textStyle = captionStyle,
        )
        TextOrEmpty(
            text = counterText,
            textStyle = counterStyle,
        )
    }
}

@Composable
private fun TextOrEmpty(
    modifier: Modifier = Modifier,
    text: String?,
    textStyle: TextStyle,
) {
    if (text.isNullOrEmpty()) return
    Text(
        modifier = modifier,
        text = text,
        style = textStyle,
    )
}
