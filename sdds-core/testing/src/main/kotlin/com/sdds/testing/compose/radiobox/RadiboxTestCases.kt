package com.sdds.testing.compose.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.updateSelection

/**
 * Тест кейсы для RadioBox, RadioBoxGroup
 */

/**
 * PLASMA-T1416
 */
@Composable
fun RadioBoxSizeM(style: RadioBoxStyle) {
    RadioBox(
        style = style,
        checked = true,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

/**
 * PLASMA-T1417
 */
@Composable
fun RadioBoxSizeS(style: RadioBoxStyle) {
    RadioBox(
        style = style,
        checked = false,
        enabled = true,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

/**
 * PLASMA-T1418
 */
@Composable
fun RadioBoxSizeMNoDescription(style: RadioBoxStyle) {
    RadioBox(
        style = style,
        checked = true,
        enabled = true,
        label = "Label",
        description = "",
        onClick = {},
    )
}

/**
 * PLASMA-T1420
 */
@Composable
fun RadioBoxDisabled(style: RadioBoxStyle) {
    RadioBox(
        style = style,
        checked = true,
        enabled = false,
        label = "Label",
        description = "Description",
        onClick = {},
    )
}

/**
 * PLASMA-T1421
 */
@Composable
fun RadioBoxGroupSizeM(style: RadioBoxGroupStyle) {
    RadioBoxGroup(
        style = style,
        default = 1,
    ) { selection ->
        radioBoxItem(key = 1) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 2) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 3) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
    }
}

/**
 * PLASMA-T1422
 */
@Composable
fun RadioBoxGroupSizeS(style: RadioBoxGroupStyle) {
    RadioBoxGroup(
        style = style,
        default = 2,
    ) { selection ->
        radioBoxItem(key = 1) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 2) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 3) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
    }
}

/**
 * PLASMA-T1423
 */
@Composable
fun RadioBoxGroupSizeMDescription(style: RadioBoxGroupStyle) {
    RadioBoxGroup(
        style = style,
        default = 1,
    ) { selection ->
        radioBoxItem(key = 1) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 2) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 3) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                description = "Description",
                onClick = { updateSelection(selection, key) },
            )
        }
    }
}

/**
 * PLASMA-T1424
 */
@Composable
fun RadioBoxGroupSizeSLabel(style: RadioBoxGroupStyle) {
    RadioBoxGroup(
        style = style,
        default = 2,
    ) { selection ->
        radioBoxItem(key = 1) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 2) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                onClick = { updateSelection(selection, key) },
            )
        }
        radioBoxItem(key = 3) { key ->
            RadioBox(
                checked = isChecked(selection, key),
                label = "Label",
                onClick = { updateSelection(selection, key) },
            )
        }
    }
}
