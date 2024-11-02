package com.sdds.compose.uikit.internal.textfield

import android.util.Log
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.InteractionSource
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.Animation
import com.sdds.compose.uikit.TextField.FieldAppearance
import com.sdds.compose.uikit.TextField.FieldType
import com.sdds.compose.uikit.TextField.HelperTextPlacement
import com.sdds.compose.uikit.TextField.LabelPlacement
import com.sdds.compose.uikit.TextFieldColors
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.internal.common.IndicatorMode
import com.sdds.compose.uikit.internal.common.drawIndicator
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.prefixSuffixTransformation
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
 * @param labelPosition тип отображения лэйбла: [LabelPlacement.Outer] снаружи поля ввода, [LabelPlacement.Inner] внутри поля ввода
 * @param helperTextPosition тип отображения вспомогательного текста (caption/counter): [HelperTextPlacement.Outer] снаружи поля ввода, [HelperTextPlacement.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [LabelPlacement.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту, которая должна быть задана в параметре [chipHeight]
 * @param valueStyle стиль value
 * @param innerLabelStyle стиль лэйбла в режиме [labelPosition] == [LabelPlacement.Inner]
 * @param innerOptionalStyle стиль optional в режиме [labelPosition] == [LabelPlacement.Inner]
 * @param innerCaptionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPlacement.Inner]
 * @param innerCounterTextStyle стиль счетчика в режиме [helperTextPosition] == [HelperTextPlacement.Inner]
 * @param outerLabelStyle стиль лэйбла в режиме [labelPosition] == [LabelPlacement.Outer]
 * @param outerCaptionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPlacement.Outer]
 * @param outerOptionalStyle стиль optional в режиме [labelPosition] == [LabelPlacement.Outer]
 * @param outerCounterTextStyle стиль счетчика в режиме [helperTextPosition] == [HelperTextPlacement.Outer]
 * @param placeHolderStyle стиль placeholder
 * @param startContentColor цвет контента в начале
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы
 * @param chipHeight высота чипов
 * @param iconSize размер иконки
 * @param dimensions отступы [TextField]
 * @param scrollBarConfig настройки scroll bar для режима [singleLine] == true
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
    style: TextFieldStyle = LocalTextFieldStyle.current,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholderText: String? = null,
    labelText: String? = null,
    captionText: String? = null,
    counterText: String? = null,
    optionalText: String? = null,
    prefix: String? = null,
    suffix: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    animation: Animation = Animation(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = style.dimensions
    val colors = style.colors

    val fieldAppearance = style.fieldAppearance
    val fieldType = style.fieldType
    val labelPlacement = style.labelPlacement
    val helperTextPlacement = style.helperTextPlacement

    val labelStyle = style.labelStyle.applyColor(
        color = colors.labelColor(readOnly, labelPlacement),
    )
    val optionalStyle = style.optionalStyle.applyColor(
        color = colors.optionalColor,
    )
    val valueStyle = style.valueStyle.applyColor(
        color = colors.valueColor(isReadOnly = readOnly),
        interactionSource = interactionSource,
    )
    val captionStyle = style.captionStyle.applyColor(
        color = colors.captionColor(isReadOnly = readOnly),
        interactionSource = interactionSource,
    )
    val counterStyle = style.counterStyle.applyColor(
        color = colors.counterColor
    )
    val placeholderStyle = style.placeholderStyle.applyColor(
        color = colors.placeholderColor(isReadOnly = readOnly),
        interactionSource = interactionSource,
    )
    val singleLine = style.singleLine
    val enabledAlpha = 1f
    val disabledAlpha = colors.disabledAlpha
    val scrollBar = style.scrollBar
    val chipContainerShape = style.chipContainerShape

    val finalLabelText =
        if (style.dropInnerLabel && labelPlacement == LabelPlacement.Inner) "" else labelText
    val finalOptionalText =
        if (style.dropInnerLabel && labelPlacement == LabelPlacement.Inner) "" else optionalText

    val innerVisualTransformation = remember(prefix, suffix, visualTransformation) {
        if (prefix.isNullOrEmpty() && suffix.isNullOrEmpty()) visualTransformation
        else prefixSuffixTransformation(prefix, suffix, placeholderStyle, placeholderStyle)
    }

    Column(
        modifier = modifier
            .enable(enabled, enabledAlpha, disabledAlpha)
            .width(IntrinsicSize.Max)
            .applyIndicatorPadding(
                fieldType = fieldType,
                labelPlacement = labelPlacement,
                labelText = finalLabelText,
                dimensions = dimensions,
            ),
    ) {
        OuterTopContent(
            modifier = Modifier
                .padding(bottom = dimensions.outerLabelPadding)
                .applyLabelIndicator(fieldType, labelPlacement, colors, dimensions),
            labelPlacement = labelPlacement,
            fieldType = fieldType,
            labelText = finalLabelText,
            optionalText = finalOptionalText,
            labelTextStyle = labelStyle,
            optionalTextStyle = optionalStyle,
            horizontalSpacing = dimensions.optionalPadding,
        )

        val verticalScrollState = if (!singleLine) rememberScrollState() else null
        val horizontalScrollState = if (singleLine) rememberScrollState() else null
        LaunchedEffect(value.text) {
            horizontalScrollState?.scrollTo(value = Int.MAX_VALUE)
            verticalScrollState?.scrollTo(value = Int.MAX_VALUE)
        }
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .defaultMinSize(minHeight = dimensions.boxMinHeight)
                .fillMaxWidth()
                .applyFieldIndicator(
                    fieldType,
                    labelPlacement,
                    fieldAppearance,
                    dimensions,
                    colors,
                )
                .clip(if (fieldAppearance == FieldAppearance.Solid) style.shape else RectangleShape)
                .drawFieldAppearance(
                    fieldAppearance = fieldAppearance,
                    hasDivider = style.hasDivider,
                    backgroundColor = colors
                        .backgroundColor(readOnly)
                        .colorForInteraction(interactionSource),
                    dividerColor = colors
                        .dividerColor(readOnly)
                        .colorForInteraction(interactionSource),
                    dividerThickness = dimensions.dividerThickness,
                )
                .applyVerticalScrollBar(verticalScrollState, scrollBar),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = valueStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            visualTransformation = innerVisualTransformation,
            interactionSource = interactionSource,
            cursorBrush = SolidColor(colors.cursorColor),
        ) {
            val isFocused = interactionSource.collectIsFocusedAsState().value
            DecorationBox(
                value = value.text,
                innerTextField = it,
                visualTransformation = innerVisualTransformation,
                interactionSource = interactionSource,
                innerLabel = innerLabel(
                    label = finalLabelText,
                    labelPlacement = labelPlacement,
                    isFocused = isFocused,
                    value = value,
                    placeHolderStyle = placeholderStyle,
                    innerLabelStyle = labelStyle,
                    hasChips = chipsContent != null,
                ),
                innerOptional = innerOptional(
                    labelPlacement = labelPlacement,
                    optionalText = finalOptionalText,
                    isFocused = isFocused,
                    value = value,
                    placeHolderStyle = placeholderStyle,
                    innerOptionalStyle = optionalStyle,
                    hasChips = chipsContent != null,
                ),
                placeholder = placeholder(placeholderText, placeholderStyle),
                leadingIcon = leadingIcon(
                    leadingIcon,
                    colors
                        .startContentColor
                        .colorForInteraction(interactionSource)
                ),
                trailingIcon = trailingIcon,
                innerCaption = innerCaption(helperTextPlacement, captionText, captionStyle),
                innerCounter = innerCounter(helperTextPlacement, counterText, counterStyle),
                animation = animation,
                chips = chipsContent,
                chipGroupStyle = style.chipGroupStyle,
                chipContainerShape = chipContainerShape,
                dimensions = dimensions,
                verticalScrollState = verticalScrollState,
                horizontalScrollState = horizontalScrollState,
                singleLine = singleLine,
                isClearAppearance = fieldAppearance == FieldAppearance.Clear,
                valueTextStyle = valueStyle,
                innerLabelTextStyle = labelStyle,
            )
        }
        OuterBottomContent(
            helperTextPlacement = helperTextPlacement,
            helperTextPadding = dimensions.helperTextPaddingOuter,
            captionText = captionText,
            counterText = counterText,
            captionStyle = captionStyle,
            counterStyle = counterStyle,
        )
    }
}

private fun Modifier.drawFieldAppearance(
    fieldAppearance: FieldAppearance,
    hasDivider: Boolean,
    backgroundColor: Color,
    dividerColor: Color,
    dividerThickness: Dp,
): Modifier {
    return this.drawBehind {
        when (fieldAppearance) {
            FieldAppearance.Clear -> {
                if (hasDivider) {
                    drawLine(
                        color = dividerColor,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = dividerThickness.toPx(),
                        cap = StrokeCap.Round,
                    )
                }
            }

            FieldAppearance.Solid -> drawRect(backgroundColor)
        }
    }
}

private fun Modifier.applyVerticalScrollBar(
    scrollState: ScrollState?,
    scrollBarConfig: ScrollBar?,
): Modifier {
    return if (scrollState != null && scrollBarConfig != null) {
        this.scrollbar(
            state = scrollState,
            direction = Orientation.Vertical,
            indicatorThickness = scrollBarConfig.indicatorThickness,
            indicatorColor = scrollBarConfig.indicatorColor,
            alpha = scrollBarConfig.alpha
                ?: if (scrollState.isScrollInProgress) 0.8f else 0f,
            alphaAnimationSpec = scrollBarConfig.alphaAnimationSpec ?: tween(
                delayMillis = if (scrollState.isScrollInProgress) 0 else 1500,
                durationMillis = if (scrollState.isScrollInProgress) 150 else 500,
            ),
            padding = scrollBarConfig.padding,
        )
    } else {
        this
    }
}

private fun leadingIcon(
    leadingIcon: @Composable (() -> Unit)?,
    startContentColor: Color,
): @Composable (() -> Unit)? {
    return if (leadingIcon != null) {
        {
            CompositionLocalProvider(LocalTint provides startContentColor) {
                leadingIcon()
            }
        }
    } else {
        null
    }
}

private fun innerOptional(
    labelPlacement: LabelPlacement,
    optionalText: String?,
    isFocused: Boolean,
    value: TextFieldValue,
    placeHolderStyle: TextStyle,
    innerOptionalStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    return if (labelPlacement == LabelPlacement.Inner && !hasChips) {
        textOrNull(
            text = optionalText,
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
    helperTextPlacement: HelperTextPlacement,
    captionText: String?,
    innerCaptionStyle: TextStyle,
): (@Composable () -> Unit)? {
    return if (helperTextPlacement == HelperTextPlacement.Inner) {
        textOrNull(
            text = captionText,
            textStyle = innerCaptionStyle,
        )
    } else {
        null
    }
}

private fun innerCounter(
    helperTextPlacement: HelperTextPlacement,
    counterText: String?,
    innerCaptionStyle: TextStyle,
): (@Composable () -> Unit)? {
    return if (helperTextPlacement == HelperTextPlacement.Inner) {
        textOrNull(
            text = counterText,
            textStyle = innerCaptionStyle,
        )
    } else {
        null
    }
}

private fun Modifier.applyIndicatorPadding(
    fieldType: FieldType,
    labelPlacement: LabelPlacement,
    labelText: String?,
    dimensions: TextField.Dimensions,
): Modifier {
    val isLabelOuter = labelPlacement == LabelPlacement.Outer
    val isIndicatorStart = fieldType == FieldType.RequiredStart
    val shouldApply = isLabelOuter && isIndicatorStart && !labelText.isNullOrEmpty()
    return if (shouldApply) {
        val startPadding =
            dimensions.indicatorDimensions.labelIndicatorSize + dimensions.labelIndicatorHorizontalPadding(
                fieldType
            )
        this.padding(start = startPadding)
    } else {
        this
    }
}

private fun Modifier.applyFieldIndicator(
    fieldType: FieldType,
    labelPlacement: LabelPlacement,
    fieldAppearance: FieldAppearance,
    dimensions: TextField.Dimensions,
    colors: TextFieldColors,
): Modifier {
    if (fieldType == FieldType.Optional || labelPlacement != LabelPlacement.Inner) return this

    val alignment = fieldIndicatorAlignment(fieldType)
    val horizontalMode = fieldIndicatorHorizontalMode(fieldAppearance)
    val verticalAlignmentOffset: Dp = indicatorVerticalAlignmentOffset(
        fieldAppearance = fieldAppearance,
        alignmentLineHeight = dimensions.alignmentLineHeight,
        indicatorSize = dimensions.indicatorDimensions.fieldIndicatorSize,
    )

    return this.drawIndicator(
        alignment = alignment,
        color = colors.indicatorColor,
        horizontalPadding = dimensions.fieldIndicatorHorizontalPadding(fieldType),
        verticalPadding = dimensions.fieldIndicatorVerticalPadding(fieldType) + verticalAlignmentOffset,
        indicatorSize = dimensions.indicatorDimensions.fieldIndicatorSize,
        horizontalMode = horizontalMode,
        verticalMode = IndicatorMode.Inner,
    )
}

private fun fieldIndicatorAlignment(fieldType: FieldType): Alignment {
    return when (fieldType) {
        FieldType.RequiredStart -> Alignment.TopStart
        FieldType.RequiredEnd -> Alignment.TopEnd
        else -> Alignment.TopStart
    }
}

private fun fieldIndicatorHorizontalMode(fieldAppearance: FieldAppearance): IndicatorMode {
    return if (fieldAppearance == FieldAppearance.Solid) {
        IndicatorMode.Inner
    } else {
        IndicatorMode.Outer
    }
}

private fun indicatorVerticalAlignmentOffset(
    fieldAppearance: FieldAppearance,
    alignmentLineHeight: Dp,
    indicatorSize: Dp,
): Dp {
    return if (fieldAppearance == FieldAppearance.Clear) {
        (alignmentLineHeight - indicatorSize) / 2
    } else {
        0.dp
    }
}

private fun Modifier.applyLabelIndicator(
    fieldType: FieldType,
    labelPlacement: LabelPlacement,
    colors: TextFieldColors,
    dimensions: TextField.Dimensions,
): Modifier {
    if (fieldType == FieldType.Optional || labelPlacement != LabelPlacement.Outer) return this
    val alignment = outerLabelIndicatorAlignment(fieldType)

    return this.drawIndicator(
        alignment = alignment,
        color = colors.indicatorColor,
        horizontalPadding = dimensions.labelIndicatorHorizontalPadding(fieldType),
        verticalPadding = dimensions.labelIndicatorVerticalPadding(fieldType),
        indicatorSize = dimensions.indicatorDimensions.labelIndicatorSize,
        horizontalMode = IndicatorMode.Outer,
        verticalMode = IndicatorMode.Inner,
    )
}

private fun TextField.Dimensions.labelIndicatorHorizontalPadding(fieldType: FieldType): Dp =
    when (fieldType) {
        FieldType.RequiredStart -> {
            Log.e(
                "testtag",
                "startOuterHorizontalPadding=${indicatorDimensions.startLabelHorizontalPadding}"
            )
            indicatorDimensions.startLabelHorizontalPadding
        }

        FieldType.RequiredEnd -> {
            Log.e(
                "testtag",
                "endOuterHorizontalPadding=${indicatorDimensions.endLabelHorizontalPadding}"
            )
            indicatorDimensions.endLabelHorizontalPadding
        }

        FieldType.Optional -> 0.dp
    }

private fun TextField.Dimensions.labelIndicatorVerticalPadding(fieldType: FieldType): Dp =
    when (fieldType) {
        FieldType.RequiredStart -> indicatorDimensions.startLabelVerticalPadding
        FieldType.RequiredEnd -> indicatorDimensions.endLabelVerticalPadding
        FieldType.Optional -> 0.dp
    }

private fun TextField.Dimensions.fieldIndicatorHorizontalPadding(fieldType: FieldType): Dp =
    when (fieldType) {
        FieldType.RequiredStart -> indicatorDimensions.startFieldHorizontalPadding
        FieldType.RequiredEnd -> indicatorDimensions.endFieldHorizontalPadding
        FieldType.Optional -> 0.dp
    }

private fun TextField.Dimensions.fieldIndicatorVerticalPadding(fieldType: FieldType): Dp =
    when (fieldType) {
        FieldType.RequiredStart -> indicatorDimensions.startFieldVerticalPadding
        FieldType.RequiredEnd -> indicatorDimensions.endFieldVerticalPadding
        FieldType.Optional -> 0.dp
    }

private fun outerLabelIndicatorAlignment(fieldType: FieldType): Alignment {
    return when (fieldType) {
        FieldType.RequiredStart -> Alignment.CenterStart
        FieldType.RequiredEnd -> Alignment.TopEnd
        FieldType.Optional -> Alignment.CenterStart
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
    fieldType: FieldType,
    labelText: String?,
    optionalText: String?,
    labelTextStyle: TextStyle,
    optionalTextStyle: TextStyle,
    horizontalSpacing: Dp,
) {
    val hasContent =
        !labelText.isNullOrEmpty() || fieldType == FieldType.Optional && !optionalText.isNullOrEmpty()
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
        if (fieldType == FieldType.Optional) {
            TextOrEmpty(
                text = optionalText,
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
    helperTextPlacement: HelperTextPlacement,
    helperTextPadding: Dp,
) {
    val isEmpty = captionText.isNullOrEmpty() && counterText.isNullOrEmpty()
    if (helperTextPlacement != HelperTextPlacement.Outer || isEmpty) return
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

private fun TextStyle.applyColor(color: Color): TextStyle =
    this.copy(color = color)

@Composable
private fun TextStyle.applyColor(
    color: InteractiveColor,
    interactionSource: InteractionSource
): TextStyle =
    this.copy(color = color.colorForInteraction(interactionSource))