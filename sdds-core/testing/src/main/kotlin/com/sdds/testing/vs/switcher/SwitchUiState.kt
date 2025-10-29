package com.sdds.testing.vs.switcher

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние switch
 *
 * @property variant стиль компонента
 * @property active состояние switch
 * @property focusable включен ли фокус у switch
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли switch
 */
@Parcelize
data class SwitchUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val active: Boolean = false,
    val focusable: Boolean = true,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
