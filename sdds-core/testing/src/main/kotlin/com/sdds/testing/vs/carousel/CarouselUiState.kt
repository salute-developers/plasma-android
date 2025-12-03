package com.sdds.testing.vs.carousel

import com.sdds.testing.vs.UiState
import com.sdds.uikit.Carousel

/**
 * Состояние компонент Carousel
 * @property variant вариация
 * @property appearance внешний вид
 * @property itemCount кол-во элементов в карусели
 * @property controlsPlacement расположение кнопок расположения
 * @property alignment выравнивание по горизонтали
 * @property controlsEnabled включены ли кнопки расположения
 * @property indicatorEnabled включен ли индикатор
 * @property indicatorVisibleItemCount кол-во видимых точек индикатора
 * @property withGap включен ли отступ между элементами
 */
data class CarouselUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 10,
    val controlsPlacement: CarouselControlsPlacement = CarouselControlsPlacement.INNER,
    val alignment: CarouselContentAlignment = CarouselContentAlignment.CENTER,
    val controlsEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
    val indicatorVisibleItemCount: Int = 5,
    val withGap: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Расположение кнопок управления
 * @property raw значение расположения
 * @see Carousel.controlsPlacement
 */
enum class CarouselControlsPlacement(val raw: Int) {
    INNER(Carousel.CONTROLS_PLACEMENT_INNER),
    OUTER(Carousel.CONTROLS_PLACEMENT_OUTER),
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
