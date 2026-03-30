package com.sdds.uikit.fixtures.stories.paginationdots

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонент PaginationDots
 * @property variant вариация
 * @property appearance внешний вид
 * @property itemCount общее кол-во индикаторов
 * @property visibleItemCount кол-во видимых индикаторов
 * @property step шаг изменения индекса
 */
@Parcelize
@StoryUiState
data class PaginationDotsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 20,
    val visibleItemCount: Int = 9,
    val step: Int = 1,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
