package com.sdds.playground.sandbox.cell

import android.os.Parcelable
import com.sdds.playground.sandbox.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Cell
 * @author Малышев Александр on 14.10.2024
 */
@Parcelize
internal data class CellUiState(
    val variant: CellVariant = CellVariant.CellM,
    val label: String = "Label",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDisclosure: Boolean = true,
    val disclosureText: String = "",
    val startContent: CellContent = CellContent.AVATAR,
    val endContent: CellContent = CellContent.NONE,
) : Parcelable

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

/**
 * Стили компонента Cell
 * @property styleRes идентификатор ресурса стиля
 */
@Parcelize
internal enum class CellVariant(val styleRes: Int) : Parcelable {
    CellL(R.style.Theme_Sandbox_ComponentOverlays_CellL),
    CellM(R.style.Theme_Sandbox_ComponentOverlays_CellM),
    CellS(R.style.Theme_Sandbox_ComponentOverlays_CellS),
    CellXS(R.style.Theme_Sandbox_ComponentOverlays_CellXS),
}
