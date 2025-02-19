package com.sdds.playground.sandbox.cell.compose

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Switch
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

@Composable
internal fun CellScreen() {
    val cellViewModel: CellViewModel =
        viewModel(CellViewModel::class.java)
    val uiState by cellViewModel.cellState.collectAsState()

    ComponentScaffold(
        component = {
            Cell(
                style = uiState.cellStyle(),
                title = AnnotatedString(uiState.title),
                subtitle = AnnotatedString(uiState.subtitle),
                label = AnnotatedString(uiState.label),
                disclosureEnabled = uiState.hasDisclosure,
                disclosureText = AnnotatedString(uiState.disclosureText),
                startContent = cellContent(contentType = uiState.startContent),
                endContent = cellContent(contentType = uiState.endContent),
            )
        },
        propertiesOwner = cellViewModel,
    )
}

@Composable
private fun cellContent(contentType: CellContent): (@Composable RowScope.() -> Unit)? {
    return if (contentType != CellContent.NONE) {
        {
            when (contentType) {
                CellContent.AVATAR -> Avatar(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                )
                CellContent.ICON -> Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )

                CellContent.SWITCH -> Switch(active = true)
                CellContent.CHECKBOX -> CheckBox(checked = true)
                CellContent.RADIOBOX -> RadioBox(checked = true)
                CellContent.NONE -> {}
            }
        }
    } else {
        null
    }
}
