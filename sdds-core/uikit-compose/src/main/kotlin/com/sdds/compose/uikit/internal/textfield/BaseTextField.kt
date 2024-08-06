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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.compose.layoutId
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.LabelType

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
 * @param placeholderText заглушка если пустое [value] и тип [SandboxTextField.LabelType.Outer]
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
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
 * @param labelOptionalAlpha альфа optional текста в лэйбле
 * @param enabledAlpha альфа, когда компонент в режиме [enabled] == true
 * @param disabledAlpha альфа, когда компонент в режиме [enabled] == false
 * @param shape форма текстового поля
 * @param startContentPadding отступ в начале текстового поля
 * @param endContentPadding отступ в конце текстового поля
 * @param iconMargin отступ от иконки до текста
 * @param textTopPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [LabelType.Inner]
 * @param textBottomPadding отступ от value до верхней границы текстового поля в режиме [labelType] == [LabelType.Inner]
 * @param innerLabelToValuePadding отступ между лэйблом и value в режиме [labelType] == [LabelType.Inner]
 * @param outerLabelBottomPadding отступ между лэйблом и текстовым полем в режиме [labelType] == [LabelType.Outer]
 * @param captionTopPadding отступ между текстовым полем и caption
 * @param optionalTextPadding горизонтальный отступ до optional части label
 * @param iconSize размер иконки
 * @param fieldHeight высота текстового поля
 * @param fieldHeight высота текстового поля
 * @param animation параметры анимации [TextField.Animation]
 * @param dotBadge параметры бэйджа-точки [DotBadge]
 * @param keepDotBadgeStartPadding позволяет выставить отступ слева, для случаев, когда нужно сохранить отступ, эквивалентный ширине [dotBadge].
 * Например, когда TextField используется в списке и состояние [dotBadge] меняется у разных элементов,
 * может появиться необходимость сохранить отступ слева, когда бэйдж скрывается.
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
    labelText: String = "",
    labelOptionalText: String = "",
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    outerLabelStyle: TextStyle,
    innerLabelStyle: TextStyle,
    valuesStyle: TextStyle,
    captionStyle: TextStyle,
    placeHolderStyle: TextStyle,
    backgroundColor: Color = Color.White,
    cursorColor: Color = Color.Blue,
    labelOptionalAlpha: Float,
    enabledAlpha: Float = 1.0f,
    disabledAlpha: Float = 0.4f,
    shape: CornerBasedShape,
    startContentPadding: Dp = 16.dp,
    endContentPadding: Dp = 16.dp,
    iconMargin: Dp,
    textTopPadding: Dp = 25.dp,
    textBottomPadding: Dp = 9.dp,
    innerLabelToValuePadding: Dp = 2.dp,
    outerLabelBottomPadding: Dp = 12.dp,
    captionTopPadding: Dp = 4.dp,
    optionalTextPadding: Dp = 4.dp,
    iconSize: Dp,
    fieldHeight: Dp,
    animation: TextField.Animation,
    dotBadge: TextField.DotBadge?,
    keepDotBadgeStartPadding: Dp? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    ConstraintLayout(
        constraintSet = getConstraintSet(
            labelType = labelType,
            dotBadge = dotBadge,
            labelText = labelText,
            captionText = captionText,
            captionTopPadding = captionTopPadding,
            outerLabelBottomPadding = outerLabelBottomPadding,
        ),
        modifier = modifier
            .padding(
                start = if (dotBadge == null && keepDotBadgeStartPadding != null && labelType == LabelType.Outer) {
                    keepDotBadgeStartPadding
                } else {
                    0.dp
                },
            )
            .fillMaxWidth()
            .graphicsLayer {
                alpha =
                    if (enabled) enabledAlpha else disabledAlpha
            },
    ) {
        if (labelType == LabelType.Outer && labelText.isNotEmpty()) {
            OuterLabel(
                modifier = Modifier.layoutId(OUTER_LABEL),
                labelText = labelText,
                labelTextStyle = outerLabelStyle,
                labelOptionalText = labelOptionalText,
                labelOptionalTextStyle = outerLabelStyle.copy(
                    color = outerLabelStyle.color.copy(
                        alpha = labelOptionalAlpha,
                    ),
                ),
                optionalPadding = optionalTextPadding,
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
                .padding(start = startContentPadding, end = endContentPadding),
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
                textTopPadding = textTopPadding,
                textBottomPadding = textBottomPadding,
                singleLine = true,
                visualTransformation = visualTransformation,
                interactionSource = interactionSource,
                label = innerLabel(
                    labelType = labelType,
                    labelText = labelText,
                    labelOptionalText = labelOptionalText,
                    labelTextStyle = innerLabelStyle,
                    labelOptionalTextStyle = innerLabelStyle.copy(
                        color = innerLabelStyle.color.copy(
                            alpha = labelOptionalAlpha,
                        ),
                    ),
                    labelOptionalTextPadding = optionalTextPadding,
                ),
                placeholder = placeholder(
                    placeholderText,
                    placeHolderStyle,
                ),
                leadingIcon = leadingIcon(
                    leadingIcon,
                    iconSize,
                    iconMargin,
                ),
                trailingIcon = trailingIcon(
                    trailingIcon,
                    iconSize,
                    iconMargin,
                ),
                animation = animation,
                labelToValuePadding = innerLabelToValuePadding,
                iconSize = iconSize,
            )
        }
        CaptionText(
            modifier = Modifier.layoutId(CAPTION),
            captionText = captionText,
            style = captionStyle,
            animationDuration = animation.animationDuration,
        )
        if (dotBadge != null && labelText.isNotEmpty()) {
            DotBadge(
                size = dotBadge.size,
                modifier = Modifier
                    .layoutId(BADGE)
                    .padding(dotBadge.paddingValues),
                color = dotBadge.color,
            )
        }
    }
}

private fun getConstraintSet(
    labelType: LabelType,
    dotBadge: TextField.DotBadge?,
    labelText: String,
    captionText: String?,
    captionTopPadding: Dp,
    outerLabelBottomPadding: Dp,
): ConstraintSet = when (labelType) {
    LabelType.Outer -> outerLabelConstraintSet(
        dotBadge = dotBadge,
        hasLabel = labelText.isNotEmpty(),
        hasCaption = captionText.isNullOrEmpty().not(),
        captionTopPadding,
        outerLabelBottomPadding,
    )

    LabelType.Inner -> innerLabelConstraintSet(
        dotBadge,
        captionText.isNullOrEmpty().not(),
        captionTopPadding,
        outerLabelBottomPadding,
    )
}

@Composable
private fun OuterLabel(
    modifier: Modifier,
    labelText: String,
    labelOptionalText: String,
    labelTextStyle: TextStyle,
    labelOptionalTextStyle: TextStyle,
    optionalPadding: Dp,
) {
    Row(modifier = modifier) {
        Text(
            text = labelText,
            style = labelTextStyle,
        )
        if (labelOptionalText.isNotEmpty()) {
            Spacer(modifier = Modifier.size(optionalPadding))
            Text(
                text = labelOptionalText,
                style = labelOptionalTextStyle,
            )
        }
    }
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

private fun innerLabel(
    labelType: LabelType,
    labelText: String,
    labelOptionalText: String,
    labelTextStyle: TextStyle,
    labelOptionalTextStyle: TextStyle,
    labelOptionalTextPadding: Dp,
): @Composable (() -> Unit)? {
    if (labelType != LabelType.Inner || labelText.isEmpty()) return null
    return {
        Row {
            Text(
                text = labelText,
                style = labelTextStyle,
            )
            if (labelOptionalText.isNotEmpty()) {
                Spacer(modifier = Modifier.size(labelOptionalTextPadding))
                Text(
                    text = labelOptionalText,
                    style = labelOptionalTextStyle,
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

private fun outerLabelConstraintSet(
    dotBadge: TextField.DotBadge?,
    hasLabel: Boolean,
    hasCaption: Boolean,
    captionTopPadding: Dp,
    outerLabelBottomPadding: Dp,
): ConstraintSet {
    return ConstraintSet {
        val outerLabel = if (hasLabel) createRefFor(OUTER_LABEL) else null
        val caption = if (hasCaption) createRefFor(CAPTION) else null
        val field = createRefFor(FIELD)
        val badge = createRefFor(BADGE)
        val badgeBarrier = createEndBarrier(badge)

        dotBadge?.let {
            when (it.position) {
                TextField.DotBadge.Position.End -> {
                    outerLabel?.let {
                        constrain(badge) {
                            start.linkTo(outerLabel.end)
                            top.linkTo(outerLabel.top)
                        }
                    }
                }

                TextField.DotBadge.Position.Start -> {
                    outerLabel?.let {
                        constrain(badge) {
                            start.linkTo(parent.start)
                            bottom.linkTo(outerLabel.bottom)
                            top.linkTo(outerLabel.top)
                        }
                    }
                }
            }
        }
        outerLabel?.let {
            constrain(it) {
                top.linkTo(parent.top)
                bottom.linkTo(field.top, margin = outerLabelBottomPadding)
                start.linkTo(badgeBarrier)
            }
        }
        constrain(field) {
            width = Dimension.fillToConstraints
            start.linkTo(badgeBarrier)
            end.linkTo(parent.end)
            top.linkTo(outerLabel?.bottom ?: parent.top)
            bottom.linkTo(caption?.top ?: parent.bottom)
        }
        caption?.let {
            constrain(it) {
                top.linkTo(field.bottom, margin = captionTopPadding)
                bottom.linkTo(parent.bottom)
                start.linkTo(badgeBarrier)
            }
        }
    }
}

private fun innerLabelConstraintSet(
    dotBadge: TextField.DotBadge?,
    hasCaption: Boolean,
    captionTopPadding: Dp,
    outerLabelBottomPadding: Dp,
): ConstraintSet {
    return ConstraintSet {
        val caption = if (hasCaption) createRefFor(CAPTION) else null
        val field = createRefFor(FIELD)
        val badge = createRefFor(BADGE)

        dotBadge?.let {
            when (it.position) {
                TextField.DotBadge.Position.End -> {
                    constrain(badge) {
                        end.linkTo(field.end)
                        top.linkTo(field.top)
                    }
                }

                TextField.DotBadge.Position.Start -> {
                    constrain(badge) {
                        start.linkTo(field.start)
                        top.linkTo(field.top)
                    }
                }
            }
        }
        constrain(field) {
            width = Dimension.fillToConstraints
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(caption?.top ?: parent.bottom)
        }
        caption?.let {
            constrain(it) {
                top.linkTo(field.bottom, margin = captionTopPadding)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
            }
        }
    }
}

private const val FIELD = "field"
private const val BADGE = "badge"
private const val CAPTION = "caption"
private const val OUTER_LABEL = "outerLabel"
