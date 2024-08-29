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
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.DotBadge
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.chip.group.SandboxEmbeddedChipGroup
import com.sdds.playground.sandbox.textfield.SandboxTextField.InputState
import com.sdds.playground.sandbox.textfield.SandboxTextField.Size
import com.sdds.playground.sandbox.textfield.SandboxTextField.State
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.captionTopPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.chipContainerShape
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.chipGroupSize
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.horizontalContentPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.iconMargin
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.iconSize
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.innerLabelToValuePadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.outerLabelBottomPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textBottomPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldColors
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldShapeFor
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldStyles
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textTopPadding
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
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
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
@Suppress("LongParameterList")
@Composable
internal fun SandboxTextField(
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
    fieldType: SandboxTextField.FieldType = SandboxTextField.FieldType.Optional,
    dotBadgePosition: DotBadge.Position = DotBadge.Position.Start,
    labelText: String = "",
    optionalText: String = "Optional",
    state: State = State.Default,
    size: Size = Size.L,
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    chips: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused = interactionSource.collectIsFocusedAsState().value
    val inputState = state.toInputState(enabled, isFocused, readOnly)

    val styles = textFieldStyles()
    val colors = textFieldColors()

    val label = if (size == Size.XS && labelType == LabelType.Inner) "" else labelText

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        placeholderText = placeholderText,
        labelType = labelType,
        fieldType = fieldType.toFieldType(
            labelType = labelType,
            position = dotBadgePosition,
            hasLabel = labelText.isNotEmpty(),
            optionalText = optionalText,
        ),
        labelText = label,
        captionText = captionText,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        chipsContent = chips,
        chipsSpacing = 2.dp,
        chipContainerShape = chipContainerShape(size),
        outerLabelStyle = styles.outerLabelStyle(size, colors, inputState).value,
        innerLabelStyle = styles.innerLabelStyle(
            size = size,
            inputState = inputState,
            isEmpty = value.text.isEmpty(),
            colors = colors,
        ).value,
        valuesStyle = styles.valueStyle(size, colors, inputState).value,
        captionStyle = styles.captionStyle(size, colors, inputState).value,
        placeHolderStyle = styles.placeholderStyle(size, colors, inputState).value,
        backgroundColor = colors.backgroundColor(inputState).value,
        cursorColor = colors.cursorColor(inputState).value,
        startContentPadding = horizontalContentPadding(size),
        endContentPadding = horizontalContentPadding(size),
        iconMargin = iconMargin(size),
        textTopPadding = textTopPadding(size, labelType),
        textBottomPadding = textBottomPadding(size, labelType),
        innerLabelToValuePadding = innerLabelToValuePadding(size),
        outerLabelBottomPadding = outerLabelBottomPadding(size),
        captionTopPadding = captionTopPadding(size),
        iconSize = iconSize(size),
        shape = textFieldShapeFor(size = size),
        fieldHeight = size.value,
        interactionSource = interactionSource,
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

@Composable
internal fun ChipsContent(
    chips: List<String>?,
    size: Size,
    onChipClosePressed: ((String) -> Unit)?,
) {
    if (chips?.isNotEmpty() == true) {
        SandboxEmbeddedChipGroup(
            items = chips,
            shouldWrap = false,
            size = chipGroupSize(size),
            onChipClosedPressed = onChipClosePressed,
        )
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
            labelType = LabelType.Outer,
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
