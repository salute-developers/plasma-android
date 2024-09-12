package com.sdds.playground.sandbox.textarea

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.LabelType
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChip
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.iconSize
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.scrollBarConfig
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.textAreaColors
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.textAreaPaddings
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.textAreaShapeFor
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.textAreaStyles
import com.sdds.playground.sandbox.textarea.TextAreaDefaults.toFieldType
import com.sdds.playground.sandbox.textfield.SandboxTextField

@Composable
internal fun SandboxTextArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    labelType: LabelType = LabelType.Outer,
    fieldType: SandboxTextArea.FieldType = SandboxTextArea.FieldType.Optional,
    labelText: String = "",
    optionalText: String = "Optional",
    placeholderText: String? = null,
    captionText: String? = null,
    counterText: String? = null,
    state: SandboxTextArea.State = SandboxTextArea.State.Default,
    size: SandboxTextArea.Size = SandboxTextArea.Size.L,
    icon: @Composable (() -> Unit)? = null,
    chips: @Composable (() -> Unit)? = null,
    dotBadgePosition: TextField.DotBadge.Position = TextField.DotBadge.Position.Start,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused = interactionSource.collectIsFocusedAsState().value
    val inputState = state.toInputState(enabled, isFocused, readOnly)

    val styles = textAreaStyles()
    val colors = textAreaColors()

    val label =
        if (size == SandboxTextArea.Size.XS && labelType == LabelType.Inner) "" else labelText

    TextArea(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        placeholderText = placeholderText,
        labelType = labelType,
        fieldType = fieldType.toFieldType(
            labelType = labelType,
            position = dotBadgePosition,
            hasLabel = labelText.isNotEmpty(),
            optionalText = optionalText,
            size = size,
        ),
        labelText = label,
        captionText = captionText,
        counterText = counterText,
        icon = icon,
        chips = chips,
        outerLabelStyle = styles.outerLabelStyle(size, colors, inputState).value,
        innerLabelStyle = styles.innerLabelStyle(
            size = size,
            inputState = inputState,
            isEmpty = value.text.isEmpty(),
            colors = colors,
        ).value,
        valuesStyle = styles.valueStyle(size, colors, inputState).value,
        captionStyle = styles.captionStyle(size, colors, inputState).value,
        counterStyle = styles.counterStyle(size, colors, inputState).value,
        placeHolderStyle = styles.placeholderStyle(size, colors, inputState).value,
        backgroundColor = colors.backgroundColor(inputState).value,
        cursorColor = colors.cursorColor(inputState).value,
        iconSize = iconSize(size),
        paddings = textAreaPaddings(size, labelType, hasChips = chips != null),
        shape = textAreaShapeFor(size),
        interactionSource = interactionSource,
        scrollBarConfig = scrollBarConfig(),
    )
}

/**
 * Параметры текстового поля
 */
internal object SandboxTextArea {

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
    }

    /**
     * Размеры текстового поля
     */
    enum class Size {
        L,
        M,
        S,
        XS,
    }
}

private fun SandboxTextArea.State.toInputState(
    enabled: Boolean,
    isFocused: Boolean,
    readOnly: Boolean,
): SandboxTextField.InputState {
    return when {
        readOnly -> SandboxTextField.InputState.ReadOnly
        isFocused -> SandboxTextField.InputState.Focused
        !enabled -> SandboxTextField.InputState.Normal
        else -> when (this) {
            SandboxTextArea.State.Default -> SandboxTextField.InputState.Normal
            SandboxTextArea.State.Error -> SandboxTextField.InputState.Error
            SandboxTextArea.State.Warning -> SandboxTextField.InputState.Warning
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun SandboxTextAreaPreview() {
    SandboxTheme {
        var text by remember { mutableStateOf(TextFieldValue("Value")) }
        SandboxTextArea(
            value = text,
            onValueChange = {
                text = it
            },
            captionText = "Caption",
            counterText = "Counter",
            labelText = "Label",
            placeholderText = "Placeholder",
            size = SandboxTextArea.Size.L,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            labelType = LabelType.Inner,
            fieldType = SandboxTextArea.FieldType.Optional,
            optionalText = "optional",
            state = SandboxTextArea.State.Default,
            chips = {
                SandboxEmbeddedChip(
                    label = "label",
                    size = SandboxEmbeddedChip.Size.S,
                )
            },
            enabled = true,
            dotBadgePosition = TextField.DotBadge.Position.Start,
        )
    }
}
