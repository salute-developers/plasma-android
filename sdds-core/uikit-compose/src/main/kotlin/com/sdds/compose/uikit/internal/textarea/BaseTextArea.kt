@file:Suppress("LongParameterList", "LongMethod")

package com.sdds.compose.uikit.internal.textarea

import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.ScrollBarConfig
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.DotBadge.Position
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.textfield.DotBadge
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.scrollbar
import kotlin.math.max

/**
 * Базовый composable многострочного поля ввода текста
 *
 * @param value значение в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param fieldType тип текстового поля - обязательное или опциональное (см. [TextField.FieldType])
 * @param labelType тип отображения лэйбла: [TextField.LabelType.Outer] снаружи поля ввода, [TextField.LabelType.Inner] внутри поля ввода
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param counterText текст счетчика
 * @param icon иконка, которая будет находиться в конце поля ввода
 * @param chips контент с chip-элементами
 * @param outerLabelStyle стиль лэйбла в режиме [labelType] == [TextField.LabelType.Outer]
 * @param innerLabelStyle стиль лэйбла в режиме [labelType] == [TextField.LabelType.Inner]
 * @param valuesStyle стиль value
 * @param captionStyle стиль caption
 * @param placeHolderStyle стиль placeholder
 * @param counterStyle стиль counter
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param chipsSpacing пространство между чипами
 * @param startContentPadding отступ в начале текстового поля
 * @param endContentPadding отступ в конце текстового поля
 * @param iconStartPadding отступ от текста до иконки
 * @param textTopPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [TextField.LabelType.Inner]
 * @param textBottomPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [TextField.LabelType.Inner]
 * @param innerLabelToValuePadding отступ между лэйблом и value в режиме [labelType] == [TextField.LabelType.Inner]
 * @param outerLabelBottomPadding отступ между лэйблом и текстовым полем в режиме [labelType] == [TextField.LabelType.Outer]
 * @param bottomTextBottomPadding отступ между текстовым полем и нижним текстом (caption и counter)
 * @param iconTopPadding отступ иконки сверху
 * @param iconSize размер иконки
 * @param animation параметры анимации [TextField.Animation]
 * @param keepDotBadgeStartPadding позволяет выставить отступ слева, для случаев, когда нужно сохранить отступ, эквивалентный ширине индикатора обязательного поля.
 * Например, когда TextField используется в списке и состояние [fieldType] меняется у разных элементов,
 * может появиться необходимость сохранить отступ слева, когда индикатор обзательного поля скрывается.
 * @param scrollBarConfig настройки скроллбара
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param interactionSource источник взаимодействия с полем
 */
@Composable
internal fun BaseTextArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    fieldType: TextField.FieldType? = null,
    labelType: LabelType = LabelType.Outer,
    placeholderText: String? = null,
    labelText: String = "",
    captionText: String? = null,
    counterText: String? = null,
    icon: @Composable (() -> Unit)? = null,
    chips: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    valuesStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    counterStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape,
    startContentPadding: Dp = 16.dp,
    endContentPadding: Dp = 16.dp,
    textTopPadding: Dp = 25.dp,
    textBottomPadding: Dp = 9.dp,
    innerLabelToValuePadding: Dp = 2.dp,
    outerLabelBottomPadding: Dp = 12.dp,
    iconTopPadding: Dp = 16.dp,
    iconSize: Dp = 24.dp,
    iconStartPadding: Dp = 2.dp,
    bottomTextBottomPadding: Dp = 4.dp,
    chipsSpacing: Dp = 2.dp,
    keepDotBadgeStartPadding: Dp? = null,
    animation: TextField.Animation = TextField.Animation(),
    scrollBarConfig: ScrollBarConfig = ScrollBarConfig(),
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dotBadge = (fieldType as? TextField.FieldType.Required)?.dotBadge
    val measurePolicy = remember(
        outerLabelBottomPadding,
        dotBadge,
        labelType,
    ) {
        TextAreaMeasurePolicy(
            outerLabelBottomPadding,
            dotBadge,
            labelType,
        )
    }

    Layout(
        content = {
            if (labelType == LabelType.Outer && labelText.isNotEmpty()) {
                OuterLabel(
                    modifier = Modifier.layoutId(OUTER_LABEL),
                    labelText = labelText,
                    labelTextStyle = outerLabelStyle,
                    optional = fieldType as? TextField.FieldType.Optional,
                )
            }

            val scrollState = rememberScrollState()
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                    .layoutId(FIELD)
                    .clip(shape)
                    .drawBehind { drawRect(backgroundColor) }
                    .scrollbar(
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
                    .padding(start = startContentPadding, end = endContentPadding),
                enabled = enabled,
                readOnly = readOnly,
                textStyle = valuesStyle,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                visualTransformation = visualTransformation,
                interactionSource = interactionSource,
                cursorBrush = SolidColor(cursorColor),
            ) {
                TextAreaDecorationBox(
                    value = value.text,
                    scrollState = scrollState,
                    innerTextField = it,
                    textTopPadding = textTopPadding,
                    textBottomPadding = textBottomPadding,
                    iconTopPadding = iconTopPadding,
                    iconStartPadding = iconStartPadding,
                    icon = icon,
                    iconSize = iconSize,
                    visualTransformation = visualTransformation,
                    interactionSource = interactionSource,
                    label = innerLabel(
                        labelType = labelType,
                        labelText = labelText,
                        labelTextStyle = innerLabelStyle,
                        optional = fieldType as? TextField.FieldType.Optional,
                    ),
                    placeholder = placeholder(
                        placeholderText,
                        placeHolderStyle,
                    ),
                    captionText = captionText(captionText, captionStyle),
                    counterText = counterText(counterText, counterStyle),
                    bottomTextBottomPadding = bottomTextBottomPadding,
                    animation = animation,
                    labelToValuePadding = innerLabelToValuePadding,
                    chips = chips,
                    chipsSpacing = chipsSpacing,
                )
            }
            if (fieldType is TextField.FieldType.Required) {
                DotBadge(
                    size = fieldType.dotBadge.size,
                    modifier = Modifier
                        .layoutId(BADGE)
                        .padding(fieldType.dotBadge.paddingValues),
                    color = fieldType.dotBadge.color,
                )
            }
        },
        measurePolicy = measurePolicy,
        modifier = modifier
            .padding(
                start = if (fieldType !is TextField.FieldType.Required &&
                    keepDotBadgeStartPadding != null &&
                    labelType == LabelType.Outer
                ) {
                    keepDotBadgeStartPadding
                } else {
                    0.dp
                },
            )
            .graphicsLayer { alpha = if (enabled) enabledAlpha else disabledAlpha },
    )
}

@Composable
private fun OuterLabel(
    modifier: Modifier,
    labelText: String,
    labelTextStyle: TextStyle,
    optional: TextField.FieldType.Optional? = null,
) {
    Row(modifier = modifier) {
        Text(
            text = labelText,
            style = labelTextStyle,
        )
        if (optional != null && optional.optionalText.isNotEmpty()) {
            Text(
                modifier = Modifier.padding(start = optional.startMargin),
                text = optional.optionalText,
                style = labelTextStyle.copy(
                    color = labelTextStyle.color.copy(alpha = optional.labelOptionalAlpha),
                ),
            )
        }
    }
}

private fun captionText(
    caption: String?,
    captionTextStyle: TextStyle,
): @Composable (() -> Unit)? {
    return if (!caption.isNullOrEmpty()) {
        {
            Text(
                text = caption,
                style = captionTextStyle,
            )
        }
    } else {
        null
    }
}

private fun counterText(
    counter: String?,
    counterTextStyle: TextStyle,
): @Composable (() -> Unit)? {
    return if (!counter.isNullOrEmpty()) {
        {
            Text(
                text = counter,
                style = counterTextStyle,
            )
        }
    } else {
        null
    }
}

private fun innerLabel(
    labelType: LabelType,
    labelText: String,
    labelTextStyle: TextStyle,
    optional: TextField.FieldType.Optional?,
): @Composable (() -> Unit)? {
    if (labelType != LabelType.Inner || labelText.isEmpty()) return null
    return {
        Row {
            Text(
                text = labelText,
                style = labelTextStyle,
            )
            if (optional != null && optional.optionalText.isNotEmpty()) {
                Text(
                    modifier = Modifier.padding(start = optional.startMargin),
                    text = optional.optionalText,
                    style = labelTextStyle.copy(
                        color = labelTextStyle.color.copy(alpha = optional.labelOptionalAlpha),
                    ),
                )
            }
        }
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

private class TextAreaMeasurePolicy(
    private val outerLabelBottomPadding: Dp,
    private val dotBadge: TextField.DotBadge?,
    private val labelType: LabelType,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val outerLabelBottomPaddingPx = outerLabelBottomPadding.roundToPx()

        // measure outer label
        val outerLabelPlaceable =
            measurables.find { it.layoutId == OUTER_LABEL }?.measure(looseConstraints)
        val badgePlaceable = measurables.find { it.layoutId == BADGE }?.measure(looseConstraints)

        // measure dot badge
        val dotBadgeStartOffset =
            if (labelType == LabelType.Outer && dotBadge?.position == Position.Start) {
                badgePlaceable.widthOrZero()
            } else {
                0
            }

        // measure field
        val fieldPlaceable = measurables.find { it.layoutId == FIELD }?.measure(
            constraints.offset(
                vertical = -(
                    outerLabelPlaceable?.let { it.height + outerLabelBottomPaddingPx } ?: 0
                    ),
                horizontal = -dotBadgeStartOffset,
            ),
        )

        val desiredWidth = max(
            fieldPlaceable.widthOrZero() + dotBadgeStartOffset,
            outerLabelPlaceable.widthOrZero(),
        )
        val desiredHeight =
            fieldPlaceable.heightOrZero() + (
                outerLabelPlaceable?.let { it.height + outerLabelBottomPaddingPx } ?: 0
                )
        val fieldY = outerLabelPlaceable?.let { it.height + outerLabelBottomPaddingPx } ?: 0

        val width = looseConstraints.constrainWidth(desiredWidth)
        val height = looseConstraints.constrainHeight(desiredHeight)

        return layout(width, height) {
            outerLabelPlaceable?.placeRelative(dotBadgeStartOffset, 0)
            fieldPlaceable?.placeRelative(dotBadgeStartOffset, fieldY)
            placeDotBadge(
                badgePlaceable = badgePlaceable,
                dotBadge = dotBadge,
                labelType = labelType,
                outerLabelPlaceable = outerLabelPlaceable,
                width = width,
            )
        }
    }
}

private fun Placeable.PlacementScope.placeDotBadge(
    badgePlaceable: Placeable?,
    dotBadge: TextField.DotBadge?,
    labelType: LabelType,
    outerLabelPlaceable: Placeable?,
    width: Int,
) {
    dotBadge?.let {
        when (it.position) {
            Position.Start -> {
                when (labelType) {
                    LabelType.Outer -> badgePlaceable?.placeRelative(
                        0,
                        Alignment.CenterVertically.align(
                            size = badgePlaceable.height,
                            space = outerLabelPlaceable.heightOrZero(),
                        ),
                    )

                    LabelType.Inner -> badgePlaceable?.placeRelative(0, 0)
                }
            }

            Position.End -> {
                when (labelType) {
                    LabelType.Outer -> badgePlaceable?.placeRelative(
                        outerLabelPlaceable.widthOrZero(),
                        0,
                    )

                    LabelType.Inner -> badgePlaceable?.placeRelative(
                        width - badgePlaceable.widthOrZero(),
                        0,
                    )
                }
            }
        }
    }
}

private const val FIELD = "field"
private const val BADGE = "badge"
private const val OUTER_LABEL = "outerLabel"
