package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextAreaClear
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textarea.Default
import com.sdds.serv.styles.textarea.Error
import com.sdds.serv.styles.textarea.InnerLabel
import com.sdds.serv.styles.textarea.L
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.OuterLabel
import com.sdds.serv.styles.textarea.RequiredEnd
import com.sdds.serv.styles.textarea.RequiredStart
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.Warning
import com.sdds.serv.styles.textarea.WrapperTextAreaView
import com.sdds.serv.styles.textarea.Xs
import com.sdds.serv.styles.textarea.clear.Default
import com.sdds.serv.styles.textarea.clear.Error
import com.sdds.serv.styles.textarea.clear.InnerLabel
import com.sdds.serv.styles.textarea.clear.L
import com.sdds.serv.styles.textarea.clear.M
import com.sdds.serv.styles.textarea.clear.OuterLabel
import com.sdds.serv.styles.textarea.clear.RequiredEnd
import com.sdds.serv.styles.textarea.clear.RequiredStart
import com.sdds.serv.styles.textarea.clear.S
import com.sdds.serv.styles.textarea.clear.Warning
import com.sdds.serv.styles.textarea.clear.WrapperTextAreaClearView
import com.sdds.serv.styles.textarea.clear.Xs
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.OuterLabel
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.RequiredStart
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.Warning
import com.sdds.serv.styles.textfield.WrapperTextFieldView
import com.sdds.serv.styles.textfield.Xs
import com.sdds.serv.styles.textfield.clear.Default
import com.sdds.serv.styles.textfield.clear.Error
import com.sdds.serv.styles.textfield.clear.InnerLabel
import com.sdds.serv.styles.textfield.clear.L
import com.sdds.serv.styles.textfield.clear.M
import com.sdds.serv.styles.textfield.clear.OuterLabel
import com.sdds.serv.styles.textfield.clear.RequiredEnd
import com.sdds.serv.styles.textfield.clear.RequiredStart
import com.sdds.serv.styles.textfield.clear.S
import com.sdds.serv.styles.textfield.clear.Success
import com.sdds.serv.styles.textfield.clear.Warning
import com.sdds.serv.styles.textfield.clear.WrapperTextFieldClearView
import com.sdds.serv.styles.textfield.clear.Xs

internal data class TextFieldUiState(
    val singleLine: Boolean = true,
    val isClear: Boolean = false,
    val textFieldValue: TextFieldValue = TextFieldValue("Value"),
    val variant: TextFieldVariant = TextFieldVariant.TextFieldMOuterLabel,
    val state: State = State.Default,
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

internal enum class State {
    Default, Error, Warning, Success
}

internal enum class TextFieldVariant {
    TextFieldL,
    TextFieldLRequiredStart,
    TextFieldLRequiredEnd,
    TextFieldLOuterLabel,
    TextFieldLOuterLabelRequiredStart,
    TextFieldLOuterLabelRequiredEnd,
    TextFieldLInnerLabel,
    TextFieldLInnerLabelRequiredStart,
    TextFieldLInnerLabelRequiredEnd,
    TextFieldM,
    TextFieldMRequiredStart,
    TextFieldMRequiredEnd,
    TextFieldMOuterLabel,
    TextFieldMOuterLabelRequiredStart,
    TextFieldMOuterLabelRequiredEnd,
    TextFieldMInnerLabel,
    TextFieldMInnerLabelRequiredStart,
    TextFieldMInnerLabelRequiredEnd,
    TextFieldS,
    TextFieldSRequiredStart,
    TextFieldSRequiredEnd,
    TextFieldSOuterLabel,
    TextFieldSOuterLabelRequiredStart,
    TextFieldSOuterLabelRequiredEnd,
    TextFieldSInnerLabel,
    TextFieldSInnerLabelRequiredStart,
    TextFieldSInnerLabelRequiredEnd,
    TextFieldXS,
    TextFieldXSRequiredStart,
    TextFieldXSRequiredEnd,
    TextFieldXSOuterLabel,
    TextFieldXSOuterLabelRequiredStart,
    TextFieldXSOuterLabelRequiredEnd,
}

@Composable
internal fun TextFieldUiState.textFieldStyle(): TextFieldStyle {
    return when {
        singleLine && !isClear -> textFieldWrapperView().applyState(state)
        singleLine && isClear -> textFieldClearWrapperView().applyState(state)
        !singleLine && !isClear -> textAreaWrapperView().applyState(state)
        else -> textAreaClearWrapperView().applyState(state)
    }
}

@Composable
@Suppress("CyclomaticComplexMethod")
private fun TextFieldUiState.textFieldWrapperView(): WrapperTextFieldView {
    return when (variant) {
        TextFieldVariant.TextFieldL -> TextField.L
        TextFieldVariant.TextFieldLRequiredStart -> TextField.L.RequiredStart
        TextFieldVariant.TextFieldLRequiredEnd -> TextField.L.RequiredEnd
        TextFieldVariant.TextFieldLOuterLabel -> TextField.L.OuterLabel
        TextFieldVariant.TextFieldLOuterLabelRequiredStart -> TextField.L.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldLOuterLabelRequiredEnd -> TextField.L.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldLInnerLabel -> TextField.L.InnerLabel
        TextFieldVariant.TextFieldLInnerLabelRequiredStart -> TextField.L.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldLInnerLabelRequiredEnd -> TextField.L.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldM -> TextField.M
        TextFieldVariant.TextFieldMRequiredStart -> TextField.M.RequiredStart
        TextFieldVariant.TextFieldMRequiredEnd -> TextField.M.RequiredEnd
        TextFieldVariant.TextFieldMOuterLabel -> TextField.M.OuterLabel
        TextFieldVariant.TextFieldMOuterLabelRequiredStart -> TextField.M.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldMOuterLabelRequiredEnd -> TextField.M.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldMInnerLabel -> TextField.M.InnerLabel
        TextFieldVariant.TextFieldMInnerLabelRequiredStart -> TextField.M.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldMInnerLabelRequiredEnd -> TextField.M.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldS -> TextField.S
        TextFieldVariant.TextFieldSRequiredStart -> TextField.S.RequiredStart
        TextFieldVariant.TextFieldSRequiredEnd -> TextField.S.RequiredEnd
        TextFieldVariant.TextFieldSOuterLabel -> TextField.S.OuterLabel
        TextFieldVariant.TextFieldSOuterLabelRequiredStart -> TextField.S.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldSOuterLabelRequiredEnd -> TextField.S.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldSInnerLabel -> TextField.S.InnerLabel
        TextFieldVariant.TextFieldSInnerLabelRequiredStart -> TextField.S.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldSInnerLabelRequiredEnd -> TextField.S.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldXS -> TextField.Xs
        TextFieldVariant.TextFieldXSRequiredStart -> TextField.Xs.RequiredStart
        TextFieldVariant.TextFieldXSRequiredEnd -> TextField.Xs.RequiredEnd
        TextFieldVariant.TextFieldXSOuterLabel -> TextField.Xs.OuterLabel
        TextFieldVariant.TextFieldXSOuterLabelRequiredStart -> TextField.Xs.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldXSOuterLabelRequiredEnd -> TextField.Xs.OuterLabel.RequiredEnd
    }
}

@Composable
@Suppress("CyclomaticComplexMethod")
private fun TextFieldUiState.textAreaWrapperView(): WrapperTextAreaView {
    return when (variant) {
        TextFieldVariant.TextFieldL -> TextArea.L
        TextFieldVariant.TextFieldLRequiredStart -> TextArea.L.RequiredStart
        TextFieldVariant.TextFieldLRequiredEnd -> TextArea.L.RequiredEnd
        TextFieldVariant.TextFieldLOuterLabel -> TextArea.L.OuterLabel
        TextFieldVariant.TextFieldLOuterLabelRequiredStart -> TextArea.L.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldLOuterLabelRequiredEnd -> TextArea.L.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldLInnerLabel -> TextArea.L.InnerLabel
        TextFieldVariant.TextFieldLInnerLabelRequiredStart -> TextArea.L.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldLInnerLabelRequiredEnd -> TextArea.L.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldM -> TextArea.M
        TextFieldVariant.TextFieldMRequiredStart -> TextArea.M.RequiredStart
        TextFieldVariant.TextFieldMRequiredEnd -> TextArea.M.RequiredEnd
        TextFieldVariant.TextFieldMOuterLabel -> TextArea.M.OuterLabel
        TextFieldVariant.TextFieldMOuterLabelRequiredStart -> TextArea.M.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldMOuterLabelRequiredEnd -> TextArea.M.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldMInnerLabel -> TextArea.M.InnerLabel
        TextFieldVariant.TextFieldMInnerLabelRequiredStart -> TextArea.M.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldMInnerLabelRequiredEnd -> TextArea.M.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldS -> TextArea.S
        TextFieldVariant.TextFieldSRequiredStart -> TextArea.S.RequiredStart
        TextFieldVariant.TextFieldSRequiredEnd -> TextArea.S.RequiredEnd
        TextFieldVariant.TextFieldSOuterLabel -> TextArea.S.OuterLabel
        TextFieldVariant.TextFieldSOuterLabelRequiredStart -> TextArea.S.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldSOuterLabelRequiredEnd -> TextArea.S.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldSInnerLabel -> TextArea.S.InnerLabel
        TextFieldVariant.TextFieldSInnerLabelRequiredStart -> TextArea.S.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldSInnerLabelRequiredEnd -> TextArea.S.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldXS -> TextArea.Xs
        TextFieldVariant.TextFieldXSRequiredStart -> TextArea.Xs.RequiredStart
        TextFieldVariant.TextFieldXSRequiredEnd -> TextArea.Xs.RequiredEnd
        TextFieldVariant.TextFieldXSOuterLabel -> TextArea.Xs.OuterLabel
        TextFieldVariant.TextFieldXSOuterLabelRequiredStart -> TextArea.Xs.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldXSOuterLabelRequiredEnd -> TextArea.Xs.OuterLabel.RequiredEnd
    }
}

@Suppress("CyclomaticComplexMethod")
@Composable
private fun TextFieldUiState.textFieldClearWrapperView(): WrapperTextFieldClearView {
    return when (variant) {
        TextFieldVariant.TextFieldL -> TextFieldClear.L
        TextFieldVariant.TextFieldLRequiredStart -> TextFieldClear.L.RequiredStart
        TextFieldVariant.TextFieldLRequiredEnd -> TextFieldClear.L.RequiredEnd
        TextFieldVariant.TextFieldLOuterLabel -> TextFieldClear.L.OuterLabel
        TextFieldVariant.TextFieldLOuterLabelRequiredStart -> TextFieldClear.L.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldLOuterLabelRequiredEnd -> TextFieldClear.L.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldLInnerLabel -> TextFieldClear.L.InnerLabel
        TextFieldVariant.TextFieldLInnerLabelRequiredStart -> TextFieldClear.L.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldLInnerLabelRequiredEnd -> TextFieldClear.L.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldM -> TextFieldClear.M
        TextFieldVariant.TextFieldMRequiredStart -> TextFieldClear.M.RequiredStart
        TextFieldVariant.TextFieldMRequiredEnd -> TextFieldClear.M.RequiredEnd
        TextFieldVariant.TextFieldMOuterLabel -> TextFieldClear.M.OuterLabel
        TextFieldVariant.TextFieldMOuterLabelRequiredStart -> TextFieldClear.M.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldMOuterLabelRequiredEnd -> TextFieldClear.M.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldMInnerLabel -> TextFieldClear.M.InnerLabel
        TextFieldVariant.TextFieldMInnerLabelRequiredStart -> TextFieldClear.M.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldMInnerLabelRequiredEnd -> TextFieldClear.M.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldS -> TextFieldClear.S
        TextFieldVariant.TextFieldSRequiredStart -> TextFieldClear.S.RequiredStart
        TextFieldVariant.TextFieldSRequiredEnd -> TextFieldClear.S.RequiredEnd
        TextFieldVariant.TextFieldSOuterLabel -> TextFieldClear.S.OuterLabel
        TextFieldVariant.TextFieldSOuterLabelRequiredStart -> TextFieldClear.S.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldSOuterLabelRequiredEnd -> TextFieldClear.S.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldSInnerLabel -> TextFieldClear.S.InnerLabel
        TextFieldVariant.TextFieldSInnerLabelRequiredStart -> TextFieldClear.S.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldSInnerLabelRequiredEnd -> TextFieldClear.S.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldXS -> TextFieldClear.Xs
        TextFieldVariant.TextFieldXSRequiredStart -> TextFieldClear.Xs.RequiredStart
        TextFieldVariant.TextFieldXSRequiredEnd -> TextFieldClear.Xs.RequiredEnd
        TextFieldVariant.TextFieldXSOuterLabel -> TextFieldClear.Xs.OuterLabel
        TextFieldVariant.TextFieldXSOuterLabelRequiredStart -> TextFieldClear.Xs.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldXSOuterLabelRequiredEnd -> TextFieldClear.Xs.OuterLabel.RequiredEnd
    }
}

@Composable
@Suppress("CyclomaticComplexMethod")
private fun TextFieldUiState.textAreaClearWrapperView(): WrapperTextAreaClearView {
    return when (variant) {
        TextFieldVariant.TextFieldL -> TextAreaClear.L
        TextFieldVariant.TextFieldLRequiredStart -> TextAreaClear.L.RequiredStart
        TextFieldVariant.TextFieldLRequiredEnd -> TextAreaClear.L.RequiredEnd
        TextFieldVariant.TextFieldLOuterLabel -> TextAreaClear.L.OuterLabel
        TextFieldVariant.TextFieldLOuterLabelRequiredStart -> TextAreaClear.L.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldLOuterLabelRequiredEnd -> TextAreaClear.L.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldLInnerLabel -> TextAreaClear.L.InnerLabel
        TextFieldVariant.TextFieldLInnerLabelRequiredStart -> TextAreaClear.L.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldLInnerLabelRequiredEnd -> TextAreaClear.L.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldM -> TextAreaClear.M
        TextFieldVariant.TextFieldMRequiredStart -> TextAreaClear.M.RequiredStart
        TextFieldVariant.TextFieldMRequiredEnd -> TextAreaClear.M.RequiredEnd
        TextFieldVariant.TextFieldMOuterLabel -> TextAreaClear.M.OuterLabel
        TextFieldVariant.TextFieldMOuterLabelRequiredStart -> TextAreaClear.M.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldMOuterLabelRequiredEnd -> TextAreaClear.M.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldMInnerLabel -> TextAreaClear.M.InnerLabel
        TextFieldVariant.TextFieldMInnerLabelRequiredStart -> TextAreaClear.M.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldMInnerLabelRequiredEnd -> TextAreaClear.M.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldS -> TextAreaClear.S
        TextFieldVariant.TextFieldSRequiredStart -> TextAreaClear.S.RequiredStart
        TextFieldVariant.TextFieldSRequiredEnd -> TextAreaClear.S.RequiredEnd
        TextFieldVariant.TextFieldSOuterLabel -> TextAreaClear.S.OuterLabel
        TextFieldVariant.TextFieldSOuterLabelRequiredStart -> TextAreaClear.S.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldSOuterLabelRequiredEnd -> TextAreaClear.S.OuterLabel.RequiredEnd
        TextFieldVariant.TextFieldSInnerLabel -> TextAreaClear.S.InnerLabel
        TextFieldVariant.TextFieldSInnerLabelRequiredStart -> TextAreaClear.S.InnerLabel.RequiredStart
        TextFieldVariant.TextFieldSInnerLabelRequiredEnd -> TextAreaClear.S.InnerLabel.RequiredEnd
        TextFieldVariant.TextFieldXS -> TextAreaClear.Xs
        TextFieldVariant.TextFieldXSRequiredStart -> TextAreaClear.Xs.RequiredStart
        TextFieldVariant.TextFieldXSRequiredEnd -> TextAreaClear.Xs.RequiredEnd
        TextFieldVariant.TextFieldXSOuterLabel -> TextAreaClear.Xs.OuterLabel
        TextFieldVariant.TextFieldXSOuterLabelRequiredStart -> TextAreaClear.Xs.OuterLabel.RequiredStart
        TextFieldVariant.TextFieldXSOuterLabelRequiredEnd -> TextAreaClear.Xs.OuterLabel.RequiredEnd
    }
}

@Composable
private fun WrapperTextFieldView.applyState(state: State): TextFieldStyle {
    return when (state) {
        State.Default -> Default
        State.Error -> Error
        State.Warning -> Warning
        State.Success -> Success
    }.style()
}

@Composable
private fun WrapperTextAreaView.applyState(state: State): TextFieldStyle {
    return when (state) {
        State.Default -> Default
        State.Error -> Error
        State.Warning -> Warning
        else -> Default
    }.style()
}

@Composable
private fun WrapperTextFieldClearView.applyState(state: State): TextFieldStyle {
    return when (state) {
        State.Default -> Default
        State.Error -> Error
        State.Warning -> Warning
        State.Success -> Success
    }.style()
}

@Composable
private fun WrapperTextAreaClearView.applyState(state: State): TextFieldStyle {
    return when (state) {
        State.Default -> Default
        State.Error -> Error
        State.Warning -> Warning
        else -> Default
    }.style()
}
