@file:Suppress("LongParameterList", "LongMethod")

package com.sdds.compose.uikit.internal.textfield

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
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
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.FieldType
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.textfield.common.DotBadge
import com.sdds.compose.uikit.internal.textfield.common.OuterLabel
import com.sdds.compose.uikit.internal.textfield.common.innerLabel
import com.sdds.compose.uikit.internal.textfield.common.placeDotBadge
import com.sdds.compose.uikit.internal.textfield.common.textFieldStartPadding
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.max

/**
 * Базовый composable текстового поля
 *
 * @param value текст в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
 * @param fieldType тип текстового поля (обязательное или опциональное). См. [TextField.FieldType]
 * @param labelText текст лэйбла
 * @param captionText текст подписи под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param outerLabelStyle стиль лэйбла в режиме [labelType] == [LabelType.Outer]
 * @param innerLabelStyle стиль лэйбла в режиме [labelType] == [LabelType.Inner]
 * @param valuesStyle стиль value
 * @param captionStyle стиль caption
 * @param placeHolderStyle стиль placeholder
 * @param backgroundColor цвет бэкграунда текстового поля
 * @param cursorColor цвет курсора
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param iconSize размер иконки
 * @param fieldHeight высота текстового поля
 * @param fieldHeight высота текстового поля
 * @param animation параметры анимации [TextField.Animation]
 * @param chipsContent контент с chip-элементами
 * @param chipContainerShape позволяет скруглять контейнер, в котором находятся чипы и текстовое поля.
 * Имеет смысл выставлять этот параметр равным радиусу скругления чипов.
 * @param interactionSource источник взаимодействия с полем
 */
@Composable
internal fun BaseTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    placeholderText: String? = null,
    labelType: LabelType = LabelType.Outer,
    fieldType: FieldType? = null,
    labelText: String = "",
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle = TextStyle(),
    innerLabelStyle: TextStyle = TextStyle(),
    valuesStyle: TextStyle = TextStyle(),
    captionStyle: TextStyle = TextStyle(),
    placeHolderStyle: TextStyle = TextStyle(),
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape,
    iconSize: Dp = 24.dp,
    fieldHeight: Dp = 46.dp,
    paddings: TextField.Paddings = TextField.Paddings(),
    animation: TextField.Animation = TextField.Animation(),
    chipsContent: @Composable (() -> Unit)? = null,
    chipContainerShape: CornerBasedShape? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dotBadge = (fieldType as? FieldType.Required)?.dotBadge
    val measurePolicy = remember(
        paddings.outerLabelBottomPadding,
        paddings.captionTopPadding,
        dotBadge,
        labelType,
    ) {
        TextFieldMeasurePolicy(
            outerLabelBottomPadding = paddings.outerLabelBottomPadding,
            captionTopPadding = paddings.captionTopPadding,
            dotBadge = dotBadge,
            hasLabel = labelText.isNotEmpty(),
            labelType = labelType,
        )
    }
    val label = if (chipsContent != null && labelType == LabelType.Inner) "" else labelText

    Layout(
        modifier = modifier
            .textFieldStartPadding(fieldType, labelType, paddings.keepDotBadgeStartPadding)
            .graphicsLayer {
                alpha = if (enabled) enabledAlpha else disabledAlpha
            },
        content = {
            if (labelType == LabelType.Outer && label.isNotEmpty()) {
                OuterLabel(
                    modifier = Modifier.layoutId(OUTER_LABEL),
                    labelText = label,
                    labelTextStyle = outerLabelStyle,
                    optional = fieldType as? FieldType.Optional,
                )
            }
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                    .layoutId(FIELD)
                    .clip(shape)
                    .height(fieldHeight)
                    .drawBehind { drawRect(backgroundColor) }
                    .padding(start = paddings.startContentPadding, end = paddings.endContentPadding),
                enabled = enabled,
                readOnly = readOnly,
                textStyle = valuesStyle,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                singleLine = true,
                visualTransformation = visualTransformation,
                interactionSource = interactionSource,
                cursorBrush = SolidColor(cursorColor),
            ) {
                CommonDecorationBox(
                    value = value.text,
                    innerTextField = it,
                    textTopPadding = paddings.valueTopPadding,
                    textBottomPadding = paddings.valueBottomPadding,
                    visualTransformation = visualTransformation,
                    interactionSource = interactionSource,
                    label = innerLabel(
                        labelType = labelType,
                        labelText = label,
                        labelTextStyle = innerLabelStyle,
                        optional = fieldType as? FieldType.Optional,
                    ),
                    placeholder = placeholder(
                        placeholderText,
                        placeHolderStyle,
                    ),
                    leadingIcon = leadingIcon(
                        leadingIcon,
                        iconSize,
                        paddings.iconHorizontalPadding,
                    ),
                    trailingIcon = trailingIcon(
                        trailingIcon,
                        iconSize,
                        paddings.iconHorizontalPadding,
                    ),
                    animation = animation,
                    labelToValuePadding = paddings.innerLabelToValuePadding,
                    iconSize = iconSize,
                    chips = chipsContent,
                    chipsSpacing = paddings.chipsSpacing,
                    chipContainerShape = chipContainerShape,
                )
            }
            CaptionText(
                modifier = Modifier.layoutId(CAPTION),
                captionText = captionText,
                style = captionStyle,
                animationDuration = animation.animationDuration,
            )
            if (fieldType is FieldType.Required) {
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
    )
}

private fun trailingIcon(
    trailingIcon: @Composable (() -> Unit)?,
    size: Dp,
    iconMargin: Dp,
): @Composable (() -> Unit)? {
    if (trailingIcon == null) return null
    return {
        Box(
            modifier = Modifier
                .padding(start = iconMargin)
                .size(size),
        ) {
            trailingIcon.invoke()
        }
    }
}

private fun leadingIcon(
    leadingIcon: @Composable (() -> Unit)?,
    size: Dp,
    iconMargin: Dp,
): @Composable (() -> Unit)? {
    if (leadingIcon == null) return null
    return {
        Box(
            modifier = Modifier
                .padding(end = iconMargin)
                .size(size),
        ) {
            leadingIcon.invoke()
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

@Composable
private fun CaptionText(
    modifier: Modifier,
    captionText: String?,
    style: TextStyle,
    animationDuration: Int,
) {
    val isVisible by remember(captionText) { mutableStateOf(captionText != null) }
    val density = LocalDensity.current
    AnimatedVisibility(
        modifier = modifier,
        visible = isVisible,
        enter = slideInVertically(
            initialOffsetY = { with(density) { -6.dp.roundToPx() } },
            animationSpec = tween(
                durationMillis = animationDuration,
                easing = EaseOut,
            ),
        ) + fadeIn(
            initialAlpha = 0f,
            animationSpec = tween(
                durationMillis = animationDuration,
                easing = EaseOut,
            ),
        ),
        exit = slideOutVertically(
            targetOffsetY = { with(density) { -6.dp.roundToPx() } },
            animationSpec = tween(
                durationMillis = animationDuration,
                easing = EaseOut,
            ),
        ) + fadeOut(
            targetAlpha = 0f,
            animationSpec = tween(
                durationMillis = animationDuration,
                easing = EaseOut,
            ),
        ),
    ) {
        Text(
            text = captionText.orEmpty(),
            style = style,
        )
    }
}

private class TextFieldMeasurePolicy(
    private val outerLabelBottomPadding: Dp,
    private val dotBadge: TextField.DotBadge?,
    private val captionTopPadding: Dp,
    private val hasLabel: Boolean,
    private val labelType: LabelType,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val outerLabelBottomPaddingPx = outerLabelBottomPadding.roundToPx()
        val captionTopPaddingPx = captionTopPadding.roundToPx()

        // measure outer label
        val outerLabelPlaceable =
            measurables.find { it.layoutId == OUTER_LABEL }?.measure(looseConstraints)
        val badgePlaceable = measurables.find { it.layoutId == BADGE }?.measure(looseConstraints)

        // measure dot badge
        val dotBadgeStartOffset =
            if (hasLabel && labelType == LabelType.Outer && dotBadge?.position == TextField.DotBadge.Position.Start) {
                badgePlaceable.widthOrZero()
            } else {
                0
            }

        // measure caption
        val captionPlaceable =
            measurables.find { it.layoutId == CAPTION }?.measure(looseConstraints)

        val outerLabelWithPaddingHeight =
            outerLabelPlaceable?.let { it.height + outerLabelBottomPaddingPx } ?: 0
        val captionWithPaddingHeight =
            captionPlaceable?.let { it.height + captionTopPaddingPx } ?: 0

        // measure field
        val fieldPlaceable = measurables.find { it.layoutId == FIELD }?.measure(
            constraints.offset(
                vertical = -outerLabelWithPaddingHeight,
                horizontal = -dotBadgeStartOffset,
            ),
        )

        val desiredWidth = max(
            fieldPlaceable.widthOrZero() + dotBadgeStartOffset,
            outerLabelPlaceable.widthOrZero(),
        )
        val desiredHeight =
            fieldPlaceable.heightOrZero() + outerLabelWithPaddingHeight + captionWithPaddingHeight

        val width = looseConstraints.constrainWidth(desiredWidth)
        val height = looseConstraints.constrainHeight(desiredHeight)

        return layout(width, height) {
            outerLabelPlaceable?.placeRelative(dotBadgeStartOffset, 0)
            fieldPlaceable?.placeRelative(dotBadgeStartOffset, outerLabelWithPaddingHeight)
            placeDotBadge(
                badgePlaceable = badgePlaceable,
                dotBadge = dotBadge,
                labelType = labelType,
                hasLabel = hasLabel,
                outerLabelPlaceable = outerLabelPlaceable,
                width = width,
            )
            captionPlaceable?.placeRelative(
                x = dotBadgeStartOffset,
                y = height - captionPlaceable.heightOrZero(),
            )
        }
    }
}

private const val FIELD = "field"
private const val BADGE = "badge"
private const val CAPTION = "caption"
private const val OUTER_LABEL = "outerLabel"
