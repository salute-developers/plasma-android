package com.sdds.playground.sandbox.cell.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.cell.L
import com.sdds.serv.styles.cell.M
import com.sdds.serv.styles.cell.S
import com.sdds.serv.styles.cell.Xs

internal data class CellUiState(
    val size: Size = Size.M,
    val label: String = "Label",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDisclosure: Boolean = true,
    val disclosureText: String = "",
    val startContent: CellContent = CellContent.AVATAR,
    val endContent: CellContent = CellContent.NONE,
)

internal enum class Size {
    L, M, S, XS,
}

internal enum class CellContent {
    NONE,
    AVATAR,
    ICON,
    SWITCH,
    CHECKBOX,
    RADIOBOX,
}

@Composable
internal fun CellUiState.cellStyle(): CellStyle {
    return when (size) {
        Size.L -> Cell.L.style()
        Size.M -> Cell.M.style()
        Size.S -> Cell.S.style()
        Size.XS -> Cell.Xs.style()
    }
}
