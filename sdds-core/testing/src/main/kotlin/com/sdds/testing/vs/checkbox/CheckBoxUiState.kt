package com.sdds.testing.vs.checkbox

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.CheckBox
import kotlinx.parcelize.Parcelize

/**
 * Состояние checkbox
 * @property variant вариация компонента [CheckBox]
 * @property state состояние checkbox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
@Parcelize
data class CheckBoxUiState(
    override val variant: String = "",
    val state: CheckBox.ToggleableState = CheckBox.ToggleableState.INDETERMINATE,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
