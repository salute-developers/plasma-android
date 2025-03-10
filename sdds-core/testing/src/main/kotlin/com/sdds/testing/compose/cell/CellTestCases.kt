package com.sdds.testing.compose.cell

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Switch
import com.sdds.icons.R
/**
 * Тест кейсы для Cell
 */

/**
 * PLASMA-T1391
 */
@Composable
fun CellSizeLAvatarHasDisclosure(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString("Subtitle"),
        label = AnnotatedString("Label"),
        disclosureEnabled = true,
        disclosureText = AnnotatedString(""),
        startContent = {
            Avatar(painter = painterResource(id = R.drawable.ic_scribble_diagonal_24))
        },
    )
}

/**
 * PLSMA-T1392
 */
@Composable
fun CellSizeMTitleAvatar(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString(""),
        label = AnnotatedString(""),
        disclosureEnabled = false,
        disclosureText = AnnotatedString(""),
        startContent = {
            Avatar(painter = painterResource(id = R.drawable.ic_scribble_diagonal_24))
        },
    )
}

/**
 * PLASMA-T1393
 */
@Composable
fun CellSizeSSubtitleHasDisclosure(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString(""),
        subtitle = AnnotatedString("Subtitle"),
        label = AnnotatedString(""),
        disclosureEnabled = true,
    )
}

/**
 * PLASMA-T1394
 */
@Composable
fun CellSizeXsLabelAvatar(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString(""),
        subtitle = AnnotatedString(""),
        label = AnnotatedString("Label"),
        disclosureEnabled = false,
        startContent = {
            Avatar(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
            )
        },
    )
}

/**
 * PLASMA-T1385
 */
@Composable
fun CellSizeLHasDisclosureDisclosureText(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString("Subtitle"),
        label = AnnotatedString("Label"),
        disclosureEnabled = true,
        disclosureText = AnnotatedString("text"),
    )
}

/**
 * PLASMA-T1386
 */
@Composable
fun CellMAvatarIcon(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString(""),
        label = AnnotatedString("Label"),
        disclosureEnabled = false,
        startContent = {
            Avatar(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1387
 */
@Composable
fun CellSizeSIconHasDisclosureDisclosureText(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString("Subtitle"),
        label = AnnotatedString(""),
        disclosureEnabled = true,
        disclosureText = AnnotatedString("text"),
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1388
 */
@Composable
fun CellSizeXsRadioBoxAvatar(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString("Subtitle"),
        label = AnnotatedString("Label"),
        disclosureEnabled = false,
        startContent = {
            var checked by remember { mutableStateOf(false) }
            RadioBox(
                checked = checked,
                onClick = { checked = true },
            )
        },
        endContent = {
            Avatar(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
            )
        },
    )
}

/**
 * PLASMA-T1389
 */
@Composable
fun CellSizeLSwitchCheckBox(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString("Title"),
        subtitle = AnnotatedString(""),
        label = AnnotatedString(""),
        disclosureEnabled = false,
        startContent = {
            var active by remember { mutableStateOf(false) }
            Switch(active = active, onActiveChanged = { active = it })
        },
        endContent = {
            var checked by remember { mutableStateOf(false) }
            CheckBox(checked = checked, onCheckedChange = { checked = it })
        },
    )
}

/**
 * PLASMA-T1390
 */
@Composable
fun CellSizeMCheckBoxHasDisclosure(cellStyle: CellStyle) {
    Cell(
        style = cellStyle,
        title = AnnotatedString(""),
        subtitle = AnnotatedString(""),
        label = AnnotatedString("Label"),
        disclosureEnabled = true,
        startContent = {
            var checked by remember { mutableStateOf(false) }
            CheckBox(checked = checked, onCheckedChange = { checked = it })
        },
    )
}
