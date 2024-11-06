package com.sdds.plasma.sd.service.sandbox.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.plasma.sd.service.styles.Default
import com.sdds.plasma.sd.service.styles.Error
import com.sdds.plasma.sd.service.styles.InnerLabel
import com.sdds.plasma.sd.service.styles.L
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.Optional
import com.sdds.plasma.sd.service.styles.OuterLabel
import com.sdds.plasma.sd.service.styles.RequiredEnd
import com.sdds.plasma.sd.service.styles.RequiredStart
import com.sdds.plasma.sd.service.styles.S
import com.sdds.plasma.sd.service.styles.Success
import com.sdds.plasma.sd.service.styles.Warning
import com.sdds.plasma.sd.service.styles.Xs

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
        .applyBackground(isClear)
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
    return hasDivider(hasDivider)
}
