package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiInput
import com.sdds.compose.uikit.ai.AiInputStyle
import com.sdds.icons.R

/**
 * Тест-кейсы для [AiInput]
 */

/**
 * PLASMA-T2707, PLASMA-T2708
 */
@Composable
fun AiInputHasContentHasActionsBeforeAfter(
    style: AiInputStyle,
) {
    AiInputCommon(
        style = style,
        value = LONG_TEXT,
    )
}

/**
 * PLASMA-T2709
 */
@Composable
fun AiInputLongPlaceholder(
    style: AiInputStyle,
) {
    AiInputCommon(
        style = style,
        placeholder = {
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and " +
                    "typesetting industry. Lorem Ipsum has been the industry's " +
                    "standard dummy text",
                maxLines = 1,
                softWrap = false,
                modifier = Modifier.horizontalScroll(rememberScrollState()),
            )
        },
    )
}

/**
 * PLASMA-T2710
 */
@Composable
fun AiInputHasActionsAfterHasMaxHeight(
    style: AiInputStyle,
) {
    AiInputCommon(
        style = style,
        placeholder = null,
        value = LONG_TEXT,
        hasContent = false,
        hasActionsBefore = false,
        hasMaxHeight = true,
    )
}

/**
 * PLASMA-T2711
 */
@Composable
fun AiInputHasActionsBefore(
    style: AiInputStyle,
) {
    AiInputCommon(
        style = style,
        value = LONG_TEXT,
        hasContent = false,
        hasActionsAfter = false,
    )
}

/**
 * PLASMA-T2712, PLASMA-T2713
 */
@Composable
fun AiInputHasActionsBeforeAfterHasMaxHeight(
    style: AiInputStyle,
) {
    AiInputCommon(
        style = style,
        hasContent = false,
        hasMaxHeight = true,
    )
}

/**
 * Общий тест-кейс
 */
@Composable
fun AiInputCommon(
    style: AiInputStyle,
    value: String = "",
    enabled: Boolean = true,
    readOnly: Boolean = false,
    hasContent: Boolean = true,
    hasActionsBefore: Boolean = true,
    hasActionsAfter: Boolean = true,
    hasMaxHeight: Boolean = false,
    placeholder: @Composable (() -> Unit)? = { Text(text = "Введите текст") },
) {
    var textValue by remember { mutableStateOf(TextFieldValue(value)) }
    AiInput(
        modifier = if (hasMaxHeight) Modifier.heightIn(max = 300.dp) else Modifier,
        style = style,
        value = textValue,
        onValueChange = { textValue = it },
        enabled = enabled,
        readOnly = readOnly,
        content = if (hasContent) {
            { repeat(5) { AiUserMessageContentFile() } }
        } else {
            null
        },
        startControls = if (hasActionsBefore) {
            { ButtonGroup { aiInputHasActionsBefore() } }
        } else {
            null
        },
        endControls = if (hasActionsAfter) {
            { ButtonGroup { aiInputHasActionsAfter() } }
        } else {
            null
        },
        sendButton = { IconButton(iconRes = R.drawable.ic_send_outline_24, onClick = {}) },
        placeholder = placeholder,
    )
}

private fun ButtonGroupScope.aiInputHasActionsBefore() {
    button { IconButton(iconRes = R.drawable.ic_clip_24, onClick = {}) }
    button { IconButton(iconRes = R.drawable.ic_settings_filter_24, onClick = {}) }
}

private fun ButtonGroupScope.aiInputHasActionsAfter() {
    button { IconButton(iconRes = R.drawable.ic_mic_outline_24, onClick = {}) }
}

private const val LONG_TEXT =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
        "It has survived not only five centuries, but also the leap into electronic typesetting, " +
        "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
        "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
        "like Aldus PageMaker including versions of Lorem Ipsum."
