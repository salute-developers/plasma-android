package com.sdds.uikit.fixtures.stories.carousel

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.Carousel
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонент Carousel
 * @property variant вариация
 * @property appearance внешний вид
 * @property itemCount кол-во элементов в карусели
 * @property alignment выравнивание по горизонтали
 * @property controlsEnabled включены ли кнопки расположения
 * @property indicatorEnabled включен ли индикатор
 * @property indicatorVisibleItemCount кол-во видимых точек индикатора
 * @property withGap включен ли отступ между элементами
 */
@Parcelize
@StoryUiState
data class CarouselUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 10,
    val alignment: CarouselContentAlignment = CarouselContentAlignment.CENTER,
    val controlsEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
    val indicatorVisibleItemCount: Int = 5,
    val withGap: Boolean = true,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Выравнивание по горизонтали
 * @property raw значение выравнивания
 * @see Carousel.contentAlignment
 */
enum class CarouselContentAlignment(val raw: Int) {
    START(Carousel.CONTENT_ALIGNMENT_START),
    CENTER(Carousel.CONTENT_ALIGNMENT_CENTER),
    END(Carousel.CONTENT_ALIGNMENT_END),
}
