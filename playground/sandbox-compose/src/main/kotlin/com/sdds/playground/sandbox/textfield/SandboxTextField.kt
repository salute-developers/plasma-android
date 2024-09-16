package com.sdds.playground.sandbox.textfield

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CoreTextField.DotBadge
import com.sdds.compose.uikit.CoreTextField.HelperTextPosition
import com.sdds.compose.uikit.CoreTextField.LabelPosition
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.textfield.SandboxTextField.InputState
import com.sdds.playground.sandbox.textfield.SandboxTextField.Size
import com.sdds.playground.sandbox.textfield.SandboxTextField.State
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.chipContainerShape
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.chipHeight
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.coreTextFieldPaddings
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.fieldAppearance
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.iconSize
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.scrollBarConfig
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldColors
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldStyles
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.toFieldType

/**
 * Поле ввода текста.
 * @param value текст в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelPosition тип отображения лэйбла: [LabelPosition.Outer] снаружи поля ввода, [LabelPosition.Inner] внутри поля ввода
 * @param fieldType тип текстового поля (обязательное или опциональное)
 * @param dotBadgePosition позиция индикатора-точки. См. [DotBadge.Position]
 * @param labelText текст лэйбла
 * @param optionalText текст надписи, свидетельствующей о том, что поле опциональное
 * @param state текущее состояние TextField
 * @param size высота поля ввода, по умолчанию
 * @param captionText текст подписи под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param chips контент с chip-элементами
 * @param interactionSource источник взаимодействий
 */
@Suppress("LongParameterList", "LongMethod")
@Composable
internal fun SandboxTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    singleLine: Boolean = true,
    isClear: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    placeholderText: String? = null,
    labelPosition: LabelPosition = LabelPosition.Outer,
    fieldType: SandboxTextField.FieldType = SandboxTextField.FieldType.Optional,
    helperTextPosition: HelperTextPosition = if (singleLine) HelperTextPosition.Outer else HelperTextPosition.Inner,
    dotBadgePosition: DotBadge.Position = DotBadge.Position.Start,
    labelText: String = "",
    optionalText: String = "",
    state: State = State.Default,
    size: Size = Size.L,
    captionText: String? = null,
    counterText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chips: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused = interactionSource.collectIsFocusedAsState().value
    val inputState = state.toInputState(enabled, isFocused, readOnly)

    val styles = textFieldStyles()
    val colors = textFieldColors()

    val label = if (size == Size.XS && labelPosition == LabelPosition.Inner) "" else labelText

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        placeholderText = placeholderText,
        labelPosition = labelPosition,
        fieldType = fieldType.toFieldType(
            labelPosition = labelPosition,
            position = dotBadgePosition,
            hasLabel = labelText.isNotEmpty(),
            optionalText = optionalText,
            size = size,
        ),
        labelText = label,
        captionText = captionText,
        counterText = counterText,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        chipsContent = chips,
        chipHeight = chipHeight(size),
        chipContainerShape = chipContainerShape(size),
        outerLabelStyle = styles.outerLabelStyle(size, colors, inputState).value,
        innerLabelStyle = styles.innerLabelStyle(
            size = size,
            inputState = inputState,
            isEmpty = value.text.isEmpty(),
            colors = colors,
        ).value,
        innerOptionalStyle = styles.innerOptionalStyle(
            size = size,
            inputState = inputState,
            isEmpty = value.text.isEmpty(),
            colors = colors,
        ).value,
        outerOptionalStyle = styles.outerOptionalStyle(
            size = size,
            colors = colors,
            inputState = inputState,
        ).value,
        valueStyle = styles.valueStyle(size, colors, inputState, isClear).value,
        innerCaptionStyle = styles.captionStyle(size, colors, inputState).value,
        outerCaptionStyle = styles.captionStyle(size, colors, inputState).value,
        innerCounterTextStyle = styles.counterStyle(size).value,
        outerCounterTextStyle = styles.counterStyle(size).value,
        placeHolderStyle = styles.placeholderStyle(size, colors, inputState, isClear).value,
        fieldAppearance = fieldAppearance(isClear, colors, inputState, size),
        cursorColor = colors.cursorColor(inputState).value,
        startContentColor = colors.startContentColor(inputState, isClear).value,
        paddings = coreTextFieldPaddings(
            size = size,
            labelPosition = labelPosition,
            helperTextPosition = helperTextPosition,
            singleLine = singleLine,
            isClear = isClear,
        ),
        iconSize = iconSize(size),
        interactionSource = interactionSource,
        scrollBarConfig = scrollBarConfig(isClear),
    )
}

/**
 * Параметры текстового поля
 */
internal object SandboxTextField {

    /**
     * Тип текстового поля
     */
    enum class FieldType {
        Optional,
        Required,
    }

    /**
     * Состояния текстового поля
     */
    enum class State {
        Default,
        Error,
        Warning,
        Success,
    }

    /**
     * Размеры текстового поля
     *
     * @property value значение размера
     */
    enum class Size(val value: Dp) {
        L(56.dp),
        M(48.dp),
        S(40.dp),
        XS(32.dp),
    }

    /**
     * Состояние текстового поля
     */
    internal enum class InputState {
        Normal,
        Focused,
        Error,
        Warning,
        Success,
        ReadOnly,
    }
}

private fun State.toInputState(
    enabled: Boolean,
    isFocused: Boolean,
    readOnly: Boolean,
): InputState {
    return when {
        readOnly -> InputState.ReadOnly
        isFocused -> InputState.Focused
        !enabled -> InputState.Normal
        else -> when (this) {
            State.Default -> InputState.Normal
            State.Error -> InputState.Error
            State.Warning -> InputState.Warning
            State.Success -> InputState.Success
        }
    }
}

/**
 * Превью [SandboxTextField]
 */
@Composable
@Preview(showBackground = true, backgroundColor = 0x0)
internal fun SandboxTextFieldPreview() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("value")) }

        SandboxTextField(
            value = value,
            captionText = "Сaption",
            labelText = "Label",
            fieldType = SandboxTextField.FieldType.Required,
            labelPosition = LabelPosition.Outer,
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_add_fill_24),
                    contentDescription = "",
                    tint = Color.Black,
                )
            },
            state = State.Warning,
            size = Size.S,
            dotBadgePosition = DotBadge.Position.End,
            chips = {
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.M,
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXsError() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            size = Size.XS,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
            state = State.Error,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLSuccess() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "Optional",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            size = Size.L,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Success,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewMWarning() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            size = Size.M,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Warning,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewInner() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Inner,
            size = Size.L,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLInactive() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Inner,
            size = Size.L,
            onValueChange = {},
            enabled = false,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewSDefault() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            fieldType = SandboxTextField.FieldType.Optional,
            size = Size.S,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLReadOnly() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            size = Size.L,
            onValueChange = {},
            enabled = true,
            readOnly = true,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLPlaceholder() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = ""),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            size = Size.L,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewHasDot() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Outer,
            fieldType = SandboxTextField.FieldType.Required,
            size = Size.L,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewHasDotInsideEnd() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            labelPosition = LabelPosition.Inner,
            fieldType = SandboxTextField.FieldType.Required,
            size = Size.M,
            onValueChange = {},
            enabled = true,
            readOnly = false,
            dotBadgePosition = DotBadge.Position.End,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            state = State.Default,
        )
    }
}
