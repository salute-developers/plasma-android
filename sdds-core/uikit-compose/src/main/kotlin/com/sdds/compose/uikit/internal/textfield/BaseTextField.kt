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
import com.sdds.compose.uikit.CoreTextField
import com.sdds.compose.uikit.CoreTextField.Animation
import com.sdds.compose.uikit.CoreTextField.DotBadge
import com.sdds.compose.uikit.CoreTextField.FieldAppearance
import com.sdds.compose.uikit.CoreTextField.FieldType
import com.sdds.compose.uikit.CoreTextField.HelperTextPosition
import com.sdds.compose.uikit.CoreTextField.LabelPosition
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.ScrollBarConfig
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.internal.common.DotBadgeMode
import com.sdds.compose.uikit.internal.common.drawDotBadge
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
 * @param labelPosition тип отображения лэйбла: [LabelPosition.Outer] снаружи поля ввода, [LabelPosition.Inner] внутри поля ввода
 * @param helperTextPosition тип отображения вспомогательного текста (caption/counter): [HelperTextPosition.Outer] снаружи поля ввода, [HelperTextPosition.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [LabelPosition.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param chipsContent контент с chip-элементами. Chip должны иметь одинаковую высоту, которая должна быть задана в параметре [chipHeight]
 * @param valueStyle стиль value
 * @param innerLabelStyle стиль лэйбла в режиме [labelPosition] == [LabelPosition.Inner]
 * @param innerOptionalStyle стиль optional в режиме [labelPosition] == [LabelPosition.Inner]
 * @param innerCaptionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPosition.Inner]
 * @param innerCounterTextStyle стиль счетчика в режиме [helperTextPosition] == [HelperTextPosition.Inner]
 * @param outerLabelStyle стиль лэйбла в режиме [labelPosition] == [LabelPosition.Outer]
 * @param outerCaptionStyle стиль надписи в режиме [helperTextPosition] == [HelperTextPosition.Outer]
 * @param outerOptionalStyle стиль optional в режиме [labelPosition] == [LabelPosition.Outer]
 * @param outerCounterTextStyle стиль счетчика в режиме [helperTextPosition] == [HelperTextPosition.Outer]
 * @param placeHolderStyle стиль placeholder
 * @param startContentColor цвет контента в начале
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы
 * @param chipHeight высота чипов
 * @param iconSize размер иконки
 * @param paddings отступы [TextField]
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
    singleLine: Boolean,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldAppearance: FieldAppearance = FieldAppearance.Solid(),
    fieldType: FieldType? = null,
    labelPosition: LabelPosition = LabelPosition.Outer,
    helperTextPosition: HelperTextPosition = if (singleLine || fieldAppearance is FieldAppearance.Clear) {
        HelperTextPosition.Outer
    } else {
        HelperTextPosition.Inner
    },
    placeholderText: String? = null,
    labelText: String? = null,
    captionText: String? = null,
    counterText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chipsContent: @Composable (() -> Unit)? = null,
    chipHeight: Dp,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    innerOptionalStyle: TextStyle = TextStyle(),
    outerOptionalStyle: TextStyle = TextStyle(),
    valueStyle: TextStyle = TextStyle(),
    outerCaptionStyle: TextStyle = TextStyle(),
    innerCaptionStyle: TextStyle = TextStyle(),
    innerCounterTextStyle: TextStyle = TextStyle(),
    outerCounterTextStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    cursorColor: Color = Color.Blue,
    startContentColor: Color,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    chipContainerShape: CornerBasedShape? = null,
    paddings: CoreTextField.Paddings = CoreTextField.Paddings(),
    iconSize: Dp = 24.dp,
    scrollBarConfig: ScrollBarConfig? = null,
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
            .width(IntrinsicSize.Max)
            .applyDotBadgePadding(
                requiredField = requiredField,
                labelPosition = labelPosition,
                labelText = labelText,
                keepDotBadgeStartPadding = paddings.keepDotBadgeStartPadding,
            )
            .graphicsLayer {
                alpha = if (enabled) enabledAlpha else disabledAlpha
            },
    ) {
        OuterTopContent(
            modifier = Modifier
                .padding(bottom = paddings.labelPadding)
                .applyOuterLabelDotBadge(requiredField, labelPosition),
            labelPosition = labelPosition,
            fieldType = fieldType,
            labelText = labelText,
            labelTextStyle = outerLabelStyle,
            optionalTextStyle = outerOptionalStyle,
            horizontalSpacing = paddings.optionalPadding,
        )

        val scrollState = rememberScrollState()
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .applyFieldDotBadge(requiredField, labelPosition)
                .clip(if (fieldAppearance is FieldAppearance.Solid) fieldAppearance.shape else RectangleShape)
                .drawFieldAppearance(fieldAppearance)
                .applyScrollBar(scrollState, scrollBarConfig),
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
                    label = labelText,
                    labelPosition = labelPosition,
                    isFocused = isFocused,
                    value = value,
                    placeHolderStyle = placeHolderStyle,
                    innerLabelStyle = innerLabelStyle,
                    hasChips = chipsContent != null,
                ),
                innerOptional = innerOptional(
                    labelPosition = labelPosition,
                    optionalField = optionalField,
                    isFocused = isFocused,
                    value = value,
                    placeHolderStyle = placeHolderStyle,
                    innerOptionalStyle = innerOptionalStyle,
                    hasChips = chipsContent != null,
                ),
                placeholder = placeholder(placeholderText, placeHolderStyle),
                leadingIcon = leadingIcon(leadingIcon, startContentColor),
                trailingIcon = trailingIcon,
                innerCaption = innerCaption(helperTextPosition, captionText, innerCaptionStyle),
                innerCounter = innerCounter(helperTextPosition, counterText, innerCounterTextStyle),
                animation = animation,
                chips = chipsContent,
                chipHeight = chipHeight,
                chipContainerShape = chipContainerShape,
                iconSize = iconSize,
                paddings = paddings,
                verticalScrollState = if (!singleLine) scrollState else null,
                singleLine = singleLine,
                isClearAppearance = fieldAppearance is FieldAppearance.Clear,
                valueTextStyle = valueStyle,
                innerLabelTextStyle = innerLabelStyle,
            )
        }
        OuterBottomContent(
            modifier = Modifier
                .padding(top = paddings.helperTextPadding),
            helperTextPosition = helperTextPosition,
            captionText = captionText,
            counterText = counterText,
            captionStyle = outerCaptionStyle,
            counterStyle = outerCounterTextStyle,
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
    scrollBarConfig: ScrollBarConfig?,
): Modifier {
    return scrollBarConfig?.let {
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
    } ?: this
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
    labelPosition: LabelPosition,
    optionalField: FieldType.Optional?,
    isFocused: Boolean,
    value: TextFieldValue,
    placeHolderStyle: TextStyle,
    innerOptionalStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    return if (labelPosition == LabelPosition.Inner && !hasChips) {
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
    labelPosition: LabelPosition,
    isFocused: Boolean,
    value: TextFieldValue,
    placeHolderStyle: TextStyle,
    innerLabelStyle: TextStyle,
    hasChips: Boolean,
): (@Composable () -> Unit)? {
    return if (labelPosition == LabelPosition.Inner && !hasChips) {
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

private fun Modifier.applyDotBadgePadding(
    requiredField: FieldType.Required?,
    labelPosition: LabelPosition,
    labelText: String?,
    keepDotBadgeStartPadding: Dp?,
): Modifier {
    val isLabelOuter = labelPosition == LabelPosition.Outer
    val isDotStart = requiredField?.dotBadge?.position == DotBadge.Position.Start
    val shouldApply = isLabelOuter && isDotStart && !labelText.isNullOrEmpty() ||
            keepDotBadgeStartPadding != null
    return if (shouldApply) {
        val startPadding = requiredField?.let { it.dotBadge.size + it.dotBadge.horizontalPadding }
            ?: keepDotBadgeStartPadding
            ?: 0.dp
        this.padding(start = startPadding)
    } else {
        this
    }
}

private fun Modifier.applyFieldDotBadge(
    requiredFieldType: FieldType.Required?,
    labelPosition: LabelPosition,
): Modifier {
    if (requiredFieldType == null || labelPosition != LabelPosition.Inner) return this
    val dotBadge = requiredFieldType.dotBadge
    val alignment = fieldDotBadgeAlignment(dotBadge.position)

    return this.drawDotBadge(
        alignment = alignment,
        color = dotBadge.color,
        horizontalPadding = dotBadge.horizontalPadding,
        verticalPadding = dotBadge.verticalPadding,
        badgeSize = dotBadge.size,
        horizontalMode = DotBadgeMode.Inner,
        verticalMode = DotBadgeMode.Inner,
    )
}

private fun Modifier.applyOuterLabelDotBadge(
    requiredFieldType: FieldType.Required?,
    labelPosition: LabelPosition,
): Modifier {
    if (requiredFieldType == null || labelPosition != LabelPosition.Outer) return this
    val dotBadge = requiredFieldType.dotBadge
    val alignment = outerLabelDotBadgeAlignment(dotBadge.position)

    return this.drawDotBadge(
        alignment = alignment,
        color = dotBadge.color,
        horizontalPadding = dotBadge.horizontalPadding,
        verticalPadding = dotBadge.verticalPadding,
        badgeSize = dotBadge.size,
        horizontalMode = DotBadgeMode.Outer,
        verticalMode = DotBadgeMode.Inner,
    )
}

private fun outerLabelDotBadgeAlignment(badgePosition: DotBadge.Position): Alignment {
    return when (badgePosition) {
        DotBadge.Position.Start -> Alignment.CenterStart
        DotBadge.Position.End -> Alignment.TopEnd
    }
}

private fun fieldDotBadgeAlignment(badgePosition: DotBadge.Position): Alignment {
    return when (badgePosition) {
        DotBadge.Position.Start -> Alignment.TopStart
        DotBadge.Position.End -> Alignment.TopEnd
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
    labelPosition: LabelPosition,
    fieldType: FieldType?,
    labelText: String?,
    labelTextStyle: TextStyle,
    optionalTextStyle: TextStyle,
    horizontalSpacing: Dp,
) {
    val hasContent =
        !labelText.isNullOrEmpty() || fieldType is FieldType.Optional && fieldType.optionalText.isNotEmpty()
    val shouldShowTopContent = labelPosition == LabelPosition.Outer && hasContent
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
    modifier: Modifier,
    captionText: String?,
    counterText: String?,
    captionStyle: TextStyle,
    counterStyle: TextStyle,
    helperTextPosition: HelperTextPosition,
) {
    if (helperTextPosition != HelperTextPosition.Outer) return
    Row(
        modifier = modifier
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
