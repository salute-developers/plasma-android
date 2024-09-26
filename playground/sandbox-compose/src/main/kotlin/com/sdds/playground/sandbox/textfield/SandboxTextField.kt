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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.HelperTextPosition
import com.sdds.compose.uikit.TextField.Indicator
import com.sdds.compose.uikit.TextField.LabelPlacement
import com.sdds.compose.uikit.prefixSuffixTransformation
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.textfield.SandboxTextField.InputState
import com.sdds.playground.sandbox.textfield.SandboxTextField.Size
import com.sdds.playground.sandbox.textfield.SandboxTextField.State
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.boxMinHeight
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
 * @param placeholderText заглушка если пустое [value] и тип [TextField.LabelType.Outer]
 * @param labelPlacement тип отображения лэйбла: [LabelPlacement.Outer] снаружи поля ввода, [LabelPlacement.Inner] внутри поля ввода
 * @param fieldType тип текстового поля (обязательное или опциональное)
 * @param indicatorPlacement позиция индикатора-точки. См. [Indicator.Placement]
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
    hasDivider: Boolean = true,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    placeholderText: String? = null,
    labelPlacement: LabelPlacement = LabelPlacement.Outer,
    fieldType: SandboxTextField.FieldType = SandboxTextField.FieldType.Optional,
    helperTextPosition: HelperTextPosition = if (singleLine) HelperTextPosition.Outer else HelperTextPosition.Inner,
    indicatorPlacement: Indicator.Placement = Indicator.Placement.Start,
    labelText: String = "",
    optionalText: String = "",
    prefix: String = "",
    suffix: String = "",
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

    val fieldAppearance = fieldAppearance(isClear, colors, inputState, size, hasDivider)

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = prefixSuffixTransformation(
            prefix = prefix,
            suffix = suffix,
            textStyle = styles.placeholderStyle(
                size = size,
                colors = colors,
                inputState = inputState,
                isClear = isClear,
            ).value,
        ),
        placeholder = placeholderText,
        labelPlacement = labelPlacement,
        fieldAppearance = fieldAppearance,
        fieldType = fieldType.toFieldType(
            labelPlacement = labelPlacement,
            placement = indicatorPlacement,
            hasLabel = labelText.isNotEmpty(),
            optionalText = optionalText.dropInnerForSizeXS(size, labelPlacement),
            size = size,
            fieldAppearance = fieldAppearance,
        ),
        label = labelText.dropInnerForSizeXS(size, labelPlacement),
        counter = counterText,
        caption = captionText,
        contentStart = leadingIcon,
        contentEnd = trailingIcon,
        chipsContent = chips,
        chipHeight = chipHeight(size),
        boxMinHeight = boxMinHeight(size),
        alignmentLineHeight = boxMinHeight(size),
        chipContainerShape = chipContainerShape(size),
        labelStyle = styles.labelStyle(
            size = size,
            inputState = inputState,
            isEmpty = value.text.isEmpty(),
            colors = colors,
            labelPlacement = labelPlacement,
        ).value,
        optionalStyle = styles.optionalStyle(
            size = size,
            inputState = inputState,
            isEmpty = value.text.isEmpty(),
            colors = colors,
            labelPlacement = labelPlacement,
        ).value,
        valueStyle = styles.valueStyle(size, colors, inputState, isClear).value,
        captionStyle = styles.captionStyle(size, colors, inputState).value,
        counterStyle = styles.counterStyle(size).value,
        placeHolderStyle = styles.placeholderStyle(size, colors, inputState, isClear).value,
        cursorColor = colors.cursorColor(inputState).value,
        startContentColor = colors.startContentColor(inputState, isClear).value,
        paddings = coreTextFieldPaddings(
            size = size,
            labelPlacement = labelPlacement,
            helperTextPosition = helperTextPosition,
            singleLine = singleLine,
            isClear = isClear,
        ),
        iconSize = iconSize(size),
        interactionSource = interactionSource,
        scrollBar = scrollBarConfig(isClear),
    )
}

private fun String.dropInnerForSizeXS(size: Size, labelPlacement: LabelPlacement): String {
    return if (size == Size.XS && labelPlacement == LabelPlacement.Inner) "" else this
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
            labelPlacement = LabelPlacement.Outer,
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
            size = Size.M,
            indicatorPlacement = Indicator.Placement.End,
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
internal fun SandboxTextFieldPreviewXS() {
    SandboxTheme(darkTheme = true) {
        SandboxTextField(
            size = Size.XS,
            state = State.Default,
            value = TextFieldValue(text = ""),
            labelPlacement = LabelPlacement.Outer,
            indicatorPlacement = Indicator.Placement.End,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            placeholderText = "Placeholder",
            captionText = "Caption",
            onValueChange = {},
            enabled = true,
            chips = {
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.XS,
                    state = SandboxEmbeddedChip.State.Secondary,
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.XS,
                    state = SandboxEmbeddedChip.State.Secondary,
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
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
            size = Size.XS,
            state = State.Error,
            value = TextFieldValue(text = ""),
            labelPlacement = LabelPlacement.Outer,
            captionText = "Caption",
            labelText = "Label",
            placeholderText = "Placeholder",
            optionalText = "optional",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            indicatorPlacement = Indicator.Placement.Start,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLSuccess() {
    SandboxTheme {
        SandboxTextField(
            state = State.Success,
            size = Size.L,
            value = TextFieldValue(text = "Value"),
            labelPlacement = LabelPlacement.Outer,
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.Start,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewMWarning() {
    SandboxTheme {
        SandboxTextField(
            size = Size.M,
            state = State.Warning,
            value = TextFieldValue(text = "Value"),
            labelPlacement = LabelPlacement.Outer,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.End,
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewSDisabled() {
    SandboxTheme {
        SandboxTextField(
            size = Size.S,
            state = State.Default,
            value = TextFieldValue(text = "Value"),
            labelPlacement = LabelPlacement.Inner,
            indicatorPlacement = Indicator.Placement.End,
            fieldType = SandboxTextField.FieldType.Required,
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = false,
            readOnly = false,
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
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewSSuccess() {
    SandboxTheme {
        SandboxTextField(
            size = Size.S,
            state = State.Success,
            value = TextFieldValue(text = "Value"),
            labelPlacement = LabelPlacement.Outer,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewSReadOnly() {
    SandboxTheme {
        SandboxTextField(
            size = Size.S,
            state = State.Error,
            value = TextFieldValue(text = "Value"),
            labelPlacement = LabelPlacement.Inner,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = true,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLInputText() {
    SandboxTheme {
        SandboxTextField(
            size = Size.L,
            state = State.Warning,
            value = TextFieldValue(text = "абвгдежзabcdefg@#643!#\$"),
            labelPlacement = LabelPlacement.Inner,
            fieldType = SandboxTextField.FieldType.Optional,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXsInputText() {
    SandboxTheme {
        SandboxTextField(
            size = Size.XS,
            state = State.Success,
            value = TextFieldValue(text = "абвгдежзabcdefg@#643!#\$"),
            labelPlacement = LabelPlacement.Outer,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXsIndicatorOutside() {
    SandboxTheme {
        SandboxTextField(
            size = Size.XS,
            state = State.Warning,
            value = TextFieldValue(text = ""),
            labelPlacement = LabelPlacement.Outer,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_16),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewMIndicatorInside() {
    SandboxTheme {
        SandboxTextField(
            size = Size.M,
            state = State.Error,
            value = TextFieldValue(text = ""),
            labelPlacement = LabelPlacement.Inner,
            fieldType = SandboxTextField.FieldType.Required,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            chips = {
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.M,
                    state = SandboxEmbeddedChip.State.Secondary,
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.M,
                    state = SandboxEmbeddedChip.State.Secondary,
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXsChipsInside() {
    SandboxTheme {
        SandboxTextField(
            size = Size.XS,
            state = State.Warning,
            value = TextFieldValue(text = ""),
            labelPlacement = LabelPlacement.Outer,
            fieldType = SandboxTextField.FieldType.Optional,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
            chips = {
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.XS,
                    state = SandboxEmbeddedChip.State.Secondary,
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
                SandboxEmbeddedChip(
                    label = "Chip",
                    size = SandboxEmbeddedChip.Size.XS,
                    state = SandboxEmbeddedChip.State.Secondary,
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLSuffixPrefix() {
    SandboxTheme {
        SandboxTextField(
            size = Size.L,
            state = State.Default,
            value = TextFieldValue(text = "Value"),
            labelPlacement = LabelPlacement.Inner,
            fieldType = SandboxTextField.FieldType.Optional,
            indicatorPlacement = Indicator.Placement.Start,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "TB Prefix",
            suffix = "TA Suffix",
            onValueChange = {},
            enabled = true,
            readOnly = false,
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
        )
    }
}
