package com.sdds.plasma.sd.service.sandbox.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextAreaClearStyleBuilder
import com.sdds.compose.uikit.TextAreaStyleBuilder
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldClearStyleBuilder
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.plasma.sd.service.styles.textarea.Default
import com.sdds.plasma.sd.service.styles.textarea.Error
import com.sdds.plasma.sd.service.styles.textarea.InnerLabel
import com.sdds.plasma.sd.service.styles.textarea.L
import com.sdds.plasma.sd.service.styles.textarea.M
import com.sdds.plasma.sd.service.styles.textarea.Optional
import com.sdds.plasma.sd.service.styles.textarea.OuterLabel
import com.sdds.plasma.sd.service.styles.textarea.RequiredEnd
import com.sdds.plasma.sd.service.styles.textarea.RequiredStart
import com.sdds.plasma.sd.service.styles.textarea.S
import com.sdds.plasma.sd.service.styles.textarea.Success
import com.sdds.plasma.sd.service.styles.textarea.Warning
import com.sdds.plasma.sd.service.styles.textarea.Xs
import com.sdds.plasma.sd.service.styles.textarea.clear.Default
import com.sdds.plasma.sd.service.styles.textarea.clear.Error
import com.sdds.plasma.sd.service.styles.textarea.clear.HasDivider
import com.sdds.plasma.sd.service.styles.textarea.clear.InnerLabel
import com.sdds.plasma.sd.service.styles.textarea.clear.L
import com.sdds.plasma.sd.service.styles.textarea.clear.M
import com.sdds.plasma.sd.service.styles.textarea.clear.NoDivider
import com.sdds.plasma.sd.service.styles.textarea.clear.Optional
import com.sdds.plasma.sd.service.styles.textarea.clear.OuterLabel
import com.sdds.plasma.sd.service.styles.textarea.clear.RequiredEnd
import com.sdds.plasma.sd.service.styles.textarea.clear.RequiredStart
import com.sdds.plasma.sd.service.styles.textarea.clear.S
import com.sdds.plasma.sd.service.styles.textarea.clear.Success
import com.sdds.plasma.sd.service.styles.textarea.clear.Warning
import com.sdds.plasma.sd.service.styles.textarea.clear.Xs
import com.sdds.plasma.sd.service.styles.textfield.Default
import com.sdds.plasma.sd.service.styles.textfield.Error
import com.sdds.plasma.sd.service.styles.textfield.InnerLabel
import com.sdds.plasma.sd.service.styles.textfield.L
import com.sdds.plasma.sd.service.styles.textfield.M
import com.sdds.plasma.sd.service.styles.textfield.Optional
import com.sdds.plasma.sd.service.styles.textfield.OuterLabel
import com.sdds.plasma.sd.service.styles.textfield.RequiredEnd
import com.sdds.plasma.sd.service.styles.textfield.RequiredStart
import com.sdds.plasma.sd.service.styles.textfield.S
import com.sdds.plasma.sd.service.styles.textfield.Success
import com.sdds.plasma.sd.service.styles.textfield.Warning
import com.sdds.plasma.sd.service.styles.textfield.Xs
import com.sdds.plasma.sd.service.styles.textfield.clear.Default
import com.sdds.plasma.sd.service.styles.textfield.clear.Error
import com.sdds.plasma.sd.service.styles.textfield.clear.HasDivider
import com.sdds.plasma.sd.service.styles.textfield.clear.InnerLabel
import com.sdds.plasma.sd.service.styles.textfield.clear.L
import com.sdds.plasma.sd.service.styles.textfield.clear.M
import com.sdds.plasma.sd.service.styles.textfield.clear.NoDivider
import com.sdds.plasma.sd.service.styles.textfield.clear.Optional
import com.sdds.plasma.sd.service.styles.textfield.clear.OuterLabel
import com.sdds.plasma.sd.service.styles.textfield.clear.RequiredEnd
import com.sdds.plasma.sd.service.styles.textfield.clear.RequiredStart
import com.sdds.plasma.sd.service.styles.textfield.clear.S
import com.sdds.plasma.sd.service.styles.textfield.clear.Success
import com.sdds.plasma.sd.service.styles.textfield.clear.Warning
import com.sdds.plasma.sd.service.styles.textfield.clear.Xs

internal data class TextFieldUiState(
    val singleLine: Boolean = true,
    val isClear: Boolean = false,
    val hasDivider: Boolean = true,
    val textFieldValue: TextFieldValue = TextFieldValue("Value"),
    val state: State = State.Default,
    val size: Size = Size.L,
    val labelPlacement: TextField.LabelPlacement = TextField.LabelPlacement.Outer,
    val fieldType: TextField.FieldType = TextField.FieldType.Optional,
    val labelText: String = "Label",
    val optionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val chips: List<String> = emptyList(),
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val suffix: String = "",
    val prefix: String = "",
)

internal enum class Size {
    XS, S, M, L
}

internal enum class State {
    Default, Error, Warning, Success
}

@Composable
internal fun TextFieldUiState.textFieldStyle(): TextFieldStyle {
    val builder = when {
        singleLine && !isClear -> getTextFieldStyleBuilder()
        singleLine && isClear -> getTextFieldClearStyleBuilder()
        !singleLine && !isClear -> getTextAreaStyleBuilder()
        else -> getTextAreaClearStyleBuilder()
    }

    return builder.style()
}

@Composable
private fun TextFieldUiState.getTextFieldStyleBuilder(): TextFieldStyleBuilder {
    return when (size) {
        Size.L -> TextField.L
        Size.M -> TextField.M
        Size.S -> TextField.S
        Size.XS -> TextField.Xs
    }.apply {
        when (state) {
            State.Default -> Default
            State.Error -> Error
            State.Warning -> Warning
            State.Success -> Success
        }
        when (labelPlacement) {
            TextField.LabelPlacement.Outer -> OuterLabel
            TextField.LabelPlacement.Inner -> InnerLabel
        }
        when (fieldType) {
            TextField.FieldType.RequiredStart -> RequiredStart
            TextField.FieldType.RequiredEnd -> RequiredEnd
            TextField.FieldType.Optional -> Optional
        }
    }
}

@Composable
private fun TextFieldUiState.getTextFieldClearStyleBuilder(): TextFieldClearStyleBuilder {
    return when (size) {
        Size.L -> TextFieldClear.L
        Size.M -> TextFieldClear.M
        Size.S -> TextFieldClear.S
        Size.XS -> TextFieldClear.Xs
    }.apply {
        when (state) {
            State.Default -> Default
            State.Error -> Error
            State.Warning -> Warning
            State.Success -> Success
        }
        when (labelPlacement) {
            TextField.LabelPlacement.Outer -> OuterLabel
            TextField.LabelPlacement.Inner -> InnerLabel
        }
        when (fieldType) {
            TextField.FieldType.RequiredStart -> RequiredStart
            TextField.FieldType.RequiredEnd -> RequiredEnd
            TextField.FieldType.Optional -> Optional
        }
        if (hasDivider) HasDivider else NoDivider
    }
}

@Composable
private fun TextFieldUiState.getTextAreaStyleBuilder(): TextAreaStyleBuilder {
    return when (size) {
        Size.L -> TextArea.L
        Size.M -> TextArea.M
        Size.S -> TextArea.S
        Size.XS -> TextArea.Xs
    }.apply {
        when (state) {
            State.Default -> Default
            State.Error -> Error
            State.Warning -> Warning
            State.Success -> Success
        }
        when (labelPlacement) {
            TextField.LabelPlacement.Outer -> OuterLabel
            TextField.LabelPlacement.Inner -> InnerLabel
        }
        when (fieldType) {
            TextField.FieldType.RequiredStart -> RequiredStart
            TextField.FieldType.RequiredEnd -> RequiredEnd
            TextField.FieldType.Optional -> Optional
        }
    }
}

@Composable
private fun TextFieldUiState.getTextAreaClearStyleBuilder(): TextAreaClearStyleBuilder {
    return when (size) {
        Size.L -> TextAreaClear.L
        Size.M -> TextAreaClear.M
        Size.S -> TextAreaClear.S
        Size.XS -> TextAreaClear.Xs
    }.apply {
        when (state) {
            State.Default -> Default
            State.Error -> Error
            State.Warning -> Warning
            State.Success -> Success
        }
        when (labelPlacement) {
            TextField.LabelPlacement.Outer -> OuterLabel
            TextField.LabelPlacement.Inner -> InnerLabel
        }
        when (fieldType) {
            TextField.FieldType.RequiredStart -> RequiredStart
            TextField.FieldType.RequiredEnd -> RequiredEnd
            TextField.FieldType.Optional -> Optional
        }
        if (hasDivider) HasDivider else NoDivider
    }
}
