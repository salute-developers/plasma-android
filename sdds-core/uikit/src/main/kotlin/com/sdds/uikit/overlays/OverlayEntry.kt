package com.sdds.uikit.overlays

import android.view.View

/**
 * Интерфейс, представляющий элемент, отображаемый в оверлее.
 */
interface OverlayEntry {
    /**
     * Уникальный идентификатор элемента оверлея.
     */
    val id: Long

    /**
     * Длительность отображения элемента в миллисекундах.
     */
    val durationMillis: Long?

    /**
     * Создаёт и возвращает представление (View), связанное с элементом оверлея.
     */
    fun createView(): View

    /**
     * Отображает элемент оверлея.
     */
    fun show()

    /**
     * Скрывает элемент оверлея.
     */
    fun hide()
}

/**
 * Перечисление возможных позиций для отображения элементов оверлея.
 */
enum class OverlayPosition {
    TopStart,
    TopCenter,
    TopEnd,
    CenterStart,
    Center,
    CenterEnd,
    BottomStart,
    BottomCenter,
    BottomEnd,
}

/**
 * Тип функции, описывающей анимацию для View.
 */
typealias OverlayAnimation = (View) -> Unit

/**
 * Спецификация анимации для появления и скрытия элемента оверлея.
 * @property enter анимация появления
 * @property exit анимация скрытия
 */
data class OverlayAnimationSpec(
    val enter: OverlayAnimation,
    val exit: OverlayAnimation,
) {

    companion object {

        /**
         * Без анимации
         */
        val NoAnimation = OverlayAnimationSpec({}, {})

        internal val FadeIn: OverlayAnimation = { view ->
            view.alpha = 0f
            view.animate().alpha(1f)
                .withEndAction { view.alpha = 1f }
        }
        internal val FadeOut: OverlayAnimation = { it.animate().alpha(0f) }
        internal val SlideInTop: OverlayAnimation = { view ->
            FadeIn(view)
            view.translationY = -view.measuredHeight.toFloat()
            view.animate().translationY(0f)
                .withEndAction { view.translationY = 0f }
        }
        internal val SlideInBottom: OverlayAnimation = { view ->
            FadeIn(view)
            view.translationY = view.measuredHeight.toFloat()
            view.animate().translationY(0f)
                .withEndAction { view.translationY = 0f }
        }
        internal val SlideInStart: OverlayAnimation = { view ->
            FadeIn(view)
            view.translationX = -view.measuredWidth.toFloat()
            view.animate().translationX(0f)
                .withEndAction { view.translationX = 0f }
        }
        internal val SlideInEnd: OverlayAnimation = { view ->
            FadeIn(view)
            view.translationX = view.measuredWidth.toFloat()
            view.animate().translationX(0f)
                .withEndAction { view.translationX = 0f }
        }

        internal val SlideOutStart: OverlayAnimation = { view ->
            FadeOut(view)
            view.translationX = 0f
            view.animate().translationX(-view.measuredWidth.toFloat())
        }
        internal val SlideOutEnd: OverlayAnimation = { view ->
            FadeOut(view)
            view.translationX = 0f
            view.animate().translationX(view.measuredWidth.toFloat())
        }
    }
}

internal fun OverlayPosition.isTop(): Boolean =
    this == OverlayPosition.TopStart || this == OverlayPosition.TopEnd || this == OverlayPosition.TopCenter

internal fun OverlayPosition.isBottom(): Boolean =
    this == OverlayPosition.BottomStart || this == OverlayPosition.BottomEnd || this == OverlayPosition.BottomCenter

internal fun OverlayPosition.isStart(): Boolean =
    this == OverlayPosition.TopStart || this == OverlayPosition.CenterStart || this == OverlayPosition.BottomStart

internal fun OverlayPosition.isCenter(): Boolean =
    this == OverlayPosition.Center || this == OverlayPosition.TopCenter || this == OverlayPosition.BottomCenter

internal fun OverlayPosition.getAnimationSpec(): OverlayAnimationSpec {
    return when (this) {
        OverlayPosition.TopStart,
        OverlayPosition.CenterStart,
        OverlayPosition.BottomStart,
        -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInStart,
            exit = OverlayAnimationSpec.SlideOutStart,
        )

        OverlayPosition.TopCenter -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInTop,
            exit = OverlayAnimationSpec.FadeOut,
        )

        OverlayPosition.BottomCenter -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInBottom,
            exit = OverlayAnimationSpec.FadeOut,
        )

        OverlayPosition.TopEnd,
        OverlayPosition.CenterEnd,
        OverlayPosition.BottomEnd,
        -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInEnd,
            exit = OverlayAnimationSpec.SlideOutEnd,
        )

        OverlayPosition.Center -> OverlayAnimationSpec.NoAnimation
    }
}
