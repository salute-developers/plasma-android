package com.sdds.playground.sandbox.cell.vs

import android.os.Parcelable
import com.sdds.playground.sandbox.core.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Cell
 * @author Малышев Александр on 14.10.2024
 */
@Parcelize
internal data class CellUiState(
    override val variant: String = "",
    val label: String = "Label",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDisclosure: Boolean = true,
    val disclosureText: String = "",
    val startContent: CellContent = CellContent.AVATAR,
    val endContent: CellContent = CellContent.NONE,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Тип контента для песочницы компонента Cell
 */
@Parcelize
internal enum class CellContent : Parcelable {
    NONE,
    AVATAR,
    ICON,
    SWITCH,
    CHECKBOX,
    RADIOBOX,
}
