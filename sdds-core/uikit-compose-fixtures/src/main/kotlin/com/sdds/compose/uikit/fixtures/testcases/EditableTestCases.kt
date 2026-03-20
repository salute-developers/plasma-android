package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [Editable]
 */

/**
 * PLASMA-T2536, PLASMA-T2539, PLASMA-T2541, PLASMA-T2542
 */
@Composable
fun EditableSingleLineRelativeStart(style: EditableStyle) {
    EditableCommon(
        style = style,
    )
}

/**
 * PLASMA-T2537
 */
@Composable
fun EditableDisabled(style: EditableStyle) {
    EditableCommon(
        style = style,
        enabled = false,
        textAlign = TextAlign.Center,
    )
}

/**
 * PLASMA-T2538
 */
@Composable
fun EditableMultipleLinesIconPlacementAbsoluteTextAlignEnd(style: EditableStyle) {
    EditableCommon(
        modifier = Modifier
            .padding(24.dp),
        style = style,
        singleLine = false,
        iconPlacement = EditableIconPlacement.Absolute,
        textAlign = TextAlign.End,
    )
}

/**
 * PLASMA-T2540
 */
@Composable
fun EditableTextAlignCenter(style: EditableStyle) {
    EditableCommon(
        style = style,
        iconPlacement = EditableIconPlacement.Absolute,
        textAlign = TextAlign.Center,
    )
}

/**
 * PLASMA-T2541
 */
@Composable
fun EditableMultipleLinesStart(style: EditableStyle) {
    EditableCommon(
        style = style,
        singleLine = false,
    )
}

/**
 * PLASMA-T2543
 */
@Composable
fun EditableRelativeTextAlignCenter(style: EditableStyle) {
    EditableCommon(
        style = style,
        iconPlacement = EditableIconPlacement.Relative,
        textAlign = TextAlign.Center,
    )
}

/**
 * PLASMA-T2544
 */
@Composable
fun EditableReadOnly(style: EditableStyle) {
    EditableCommon(
        style = style,
        readOnly = true,
    )
}

/**
 * PLASMA-T2545
 */
@Composable
fun EditableTextAlignCenterRelative(style: EditableStyle) {
    EditableCommon(
        style = style,
        singleLine = false,
        textAlign = TextAlign.Center,
    )
}

/**
 * Общий Editable
 */
@Composable
fun EditableCommon(
    modifier: Modifier = Modifier,
    style: EditableStyle,
    singleLine: Boolean = true,
    readOnly: Boolean = false,
    enabled: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    iconPlacement: EditableIconPlacement = EditableIconPlacement.Relative,
) {
    val focusRequester = remember { FocusRequester() }
    var text by remember { mutableStateOf(TextFieldValue("Value")) }
    Editable(
        modifier = modifier
            .focusRequester(focusRequester),
        style = style,
        icon = {
            Icon(
                modifier = Modifier
                    .testTag("icon")
                    .clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                    ) {
                        focusRequester.requestFocus()
                        text = text.copy(selection = TextRange(text.text.length))
                    },
                painter = painterResource(R.drawable.ic_edit_fill_36),
                contentDescription = null,
            )
        },
        singleLine = singleLine,
        readOnly = readOnly,
        enabled = enabled,
        textAlign = textAlign,
        iconPlacement = iconPlacement,
        value = text,
        onValueChange = { text = it },
    )
}
