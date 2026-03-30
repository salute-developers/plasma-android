package com.sdds.uikit.fixtures.stories.checkbox

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.CheckBox
import com.sdds.uikit.fixtures.UiState
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
@StoryUiState
data class CheckBoxUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val state: CheckBox.ToggleableState = CheckBox.ToggleableState.INDETERMINATE,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
