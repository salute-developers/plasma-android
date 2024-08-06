package com.sdds.playground.sandbox.textfield

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.DotBadge
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.textfield.SandboxTextField.Size
import com.sdds.playground.sandbox.textfield.SandboxTextField.State
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.captionTopPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.fieldHorizontalPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.iconSize
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.innerLabelToValuePadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.optionalTextPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.outerLabelBottomPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textContentFieldPadding
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldColors
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldShapeFor
import com.sdds.playground.sandbox.textfield.TextFieldDefaults.textFieldStyles

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
 * @param placeholderText заглушка если пустое [value] и тип [SandboxTextField.LabelType.Outer]
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
 * @param labelText текст лэйбла
 * @param state текущее состояние TextField
 * @param size высота поля ввода, по умолчанию
 * @param captionText текст подписи под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
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
    labelText: String = "",
    labelOptionalText: String = "",
    state: State = State.Default,
    size: Size = Size.L,
    hasDotBadge: Boolean = false,
    dotBadgePosition: DotBadge.Position = DotBadge.Position.End,
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused = interactionSource.collectIsFocusedAsState().value
    val inputState = state.toInputState(enabled, isFocused, readOnly)

    val styles = textFieldStyles()
    val colors = textFieldColors()

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
        labelText = labelText,
        labelOptionalText = labelOptionalText,
        captionText = captionText,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        dotBadge = if (hasDotBadge) {
            TextFieldDefaults.dotBadge(
                labelType,
                dotBadgePosition,
            )
        } else {
            null
        },
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
        textContentPaddings = textContentFieldPadding(size, labelType),
        iconHorizontalPadding = fieldHorizontalPadding(size),
        innerLabelToValuePadding = innerLabelToValuePadding(size),
        outerLabelBottomPadding = outerLabelBottomPadding(size),
        captionTopPadding = captionTopPadding(size),
        optionalTextPadding = optionalTextPadding(size),
        iconSize = iconSize(size),
        shape = textFieldShapeFor(size, 2.dp),
        fieldHeight = size.value,
        interactionSource = interactionSource,
    )
}

/**
 * Параметры текстового поля
 */
internal object SandboxTextField {

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
@Preview(showBackground = true)
fun SandboxTextFieldPreview() {
    SandboxTheme {
        SandboxTextField(
            value = TextFieldValue(text = "Value"),
            captionText = "Сaption",
            labelText = "Label",
            labelType = LabelType.Outer,
            onValueChange = {},
            leadingIcon = {
                Image(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_add_fill_24),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(Color.Black),
                )
            },
            state = State.Warning,
        )
    }
}
