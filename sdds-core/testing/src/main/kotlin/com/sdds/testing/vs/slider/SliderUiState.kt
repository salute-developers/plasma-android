package com.sdds.testing.vs.slider

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Slider
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Slider
 * @property variant вариация
 * @property appearance разновидность компонента
 * @property limitLabelEnabled отображение лэйблов с предельными значениями
 * @property labelEnabled отображение лэйбла (заголовок с иконкой)
 * @property minLabel минимальное значение прогресса
 * @property maxLabel максимальное значение прогресса
 * @property title заголовок
 * @property thumbEnabled отображение ползунка
 * @property slideDirection направление движения ползунка (слайда)
 * @property alignment выравнивание контента внутри компонента
 */
@Parcelize
data class SliderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val limitLabelEnabled: Boolean = true,
    val labelEnabled: Boolean = true,
    val minLabel: String = "0",
    val maxLabel: String = "100",
    val title: String = "Title",
    val thumbEnabled: Boolean = true,
    val slideDirection: SlideDirection = SlideDirection.NORMAL,
    val alignment: Alignment = Alignment.START,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Тип ориентации слайдера
 */
@Parcelize
enum class SlideDirection : Parcelable {
    NORMAL,
    REVERSED,
}

/**
 * Преобразует [SlideDirection] в [Slider] SliderDirection
 */
fun SlideDirection.toSlideDirection(): Int = when (this) {
    SlideDirection.NORMAL -> Slider.SLIDE_DIRECTION_NORMAL
    SlideDirection.REVERSED -> Slider.SLIDE_DIRECTION_REVERSED
}

/**
 * Выравнивание контента в контейнере
 */
@Parcelize
enum class Alignment : Parcelable {
    START,
    CENTER,
    END,
}

/**
 * Преобразует [Alignment] в [Slider] Alignment
 */
fun Alignment.toAlignment(): Int = when (this) {
    Alignment.START -> Slider.ALIGNMENT_START
    Alignment.CENTER -> Slider.ALIGNMENT_CENTER
    Alignment.END -> Slider.ALIGNMENT_END
}
