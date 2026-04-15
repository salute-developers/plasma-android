package com.sdds.uikit.fixtures.stories.list

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ListView
 * @property variant вариация
 * @property amount кол-во элементов
 * @property itemTitle заголовок элемента
 * @property hasDisclosure наличие индикатора доп. информации
 */
@Parcelize
@StoryUiState
data class ListUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Title",
    val hasDisclosure: Boolean = true,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
