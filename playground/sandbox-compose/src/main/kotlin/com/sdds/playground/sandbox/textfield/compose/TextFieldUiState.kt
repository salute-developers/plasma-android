package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.serv.styles.textarea.L
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.Xs
import com.sdds.serv.styles.textarea.clear.L
import com.sdds.serv.styles.textarea.clear.M
import com.sdds.serv.styles.textarea.clear.S
import com.sdds.serv.styles.textarea.clear.Xs
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.Optional
import com.sdds.serv.styles.textfield.OuterLabel
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.RequiredStart
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.Warning
import com.sdds.serv.styles.textfield.Xs
import com.sdds.serv.styles.textfield.clear.HasDivider
import com.sdds.serv.styles.textfield.clear.L
import com.sdds.serv.styles.textfield.clear.M
import com.sdds.serv.styles.textfield.clear.NoDivider
import com.sdds.serv.styles.textfield.clear.S
import com.sdds.serv.styles.textfield.clear.Xs

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
    val styleBuilder = when {
        singleLine && !isClear -> size.toTextFieldStyleBuilder()
        singleLine && isClear -> size.toTextFieldClearStyleBuilder()
        !singleLine && !isClear -> size.toTextAreaStyleBuilder()
        else -> size.toTextAreaClearStyleBuilder()
    }

    return styleBuilder
        .applyState(state)
        .applyLabelPlacement(labelPlacement)
        .applyFieldType(fieldType)
        .applyHasDivider(hasDivider)
        .style()
}

@Composable
private fun Size.toTextFieldStyleBuilder(): TextFieldStyleBuilder = when (this) {
    Size.L -> TextField.L
    Size.M -> TextField.M
    Size.S -> TextField.S
    Size.XS -> TextField.Xs
}

@Composable
private fun Size.toTextFieldClearStyleBuilder(): TextFieldStyleBuilder = when (this) {
    Size.L -> TextFieldClear.L
    Size.M -> TextFieldClear.M
    Size.S -> TextFieldClear.S
    Size.XS -> TextFieldClear.Xs
}

@Composable
private fun Size.toTextAreaStyleBuilder(): TextFieldStyleBuilder = when (this) {
    Size.L -> TextArea.L
    Size.M -> TextArea.M
    Size.S -> TextArea.S
    Size.XS -> TextArea.Xs
}

@Composable
private fun Size.toTextAreaClearStyleBuilder(): TextFieldStyleBuilder = when (this) {
    Size.L -> TextAreaClear.L
    Size.M -> TextAreaClear.M
    Size.S -> TextAreaClear.S
    Size.XS -> TextAreaClear.Xs
}

private fun TextFieldStyleBuilder.applyBackground(isClear: Boolean): TextFieldStyleBuilder {
    return fieldAppearance(
        if (isClear) TextField.FieldAppearance.Clear else TextField.FieldAppearance.Solid,
    )
}

private fun TextFieldStyleBuilder.applyLabelPlacement(labelPlacement: TextField.LabelPlacement): TextFieldStyleBuilder {
    return when (labelPlacement) {
        TextField.LabelPlacement.Outer -> OuterLabel
        TextField.LabelPlacement.Inner -> InnerLabel
    }
}

@Composable
private fun TextFieldStyleBuilder.applyState(state: State): TextFieldStyleBuilder {
    return when (state) {
        State.Default -> Default
        State.Error -> Error
        State.Warning -> Warning
        State.Success -> Success
    }
}

private fun TextFieldStyleBuilder.applyFieldType(fieldType: TextField.FieldType): TextFieldStyleBuilder {
    return when (fieldType) {
        TextField.FieldType.RequiredStart -> RequiredStart
        TextField.FieldType.RequiredEnd -> RequiredEnd
        TextField.FieldType.Optional -> Optional
    }
}

private fun TextFieldStyleBuilder.applyHasDivider(hasDivider: Boolean): TextFieldStyleBuilder {
    return if (hasDivider) HasDivider else NoDivider
}
