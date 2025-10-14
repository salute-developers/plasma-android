package com.sdds.testing.vs.radiobox

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние RadioBox
 * @property variant вариация компонента
 * @property checked состояние выбора RadioBox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли RadioBox
 */
@Parcelize
data class RadioBoxUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val checked: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
