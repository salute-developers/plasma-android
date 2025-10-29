package com.sdds.testing.vs.cell

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Cell
 * @property variant вариация компонента
 * @property label текст подписи
 * @property title текст заголовка
 * @property subtitle текст подзаголовка
 * @property hasDisclosure включен ли disclosure
 * @property disclosureText тест disclosure
 * @property startContent тип контента в начале
 * @property endContent тип контента в конце
 * @author Малышев Александр on 14.10.2024
 */
@Parcelize
data class CellUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val hasDisclosure: Boolean = false,
    val disclosureText: String = "",
    val startContent: CellContent = CellContent.AVATAR,
    val endContent: CellContent = CellContent.NONE,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Тип контента для песочницы компонента Cell
 */
@Parcelize
enum class CellContent : Parcelable {
    NONE,
    AVATAR,
    ICON,
    SWITCH,
    CHECKBOX,
    RADIOBOX,
}
