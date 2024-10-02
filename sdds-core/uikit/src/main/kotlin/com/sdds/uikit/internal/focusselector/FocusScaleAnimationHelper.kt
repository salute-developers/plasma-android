package com.sdds.uikit.internal.focusselector

import android.view.View

/**
 * Делегат для отрисовки фокусного состояния компонентов
 * @author Малышев Александр on 25.07.2024
 */
internal class FocusScaleAnimationHelper(
    private val factor: Float = DEFAULT_FACTOR,
    private val duration: Long = DEFAULT_DURATION,
) {

    private var _initialsScaleX: Float = 1f
    private var _initialsScaleY: Float = 1f

    /**
     * Анимирует изменение фокусного состояния [view]
     * @param view [View], фокусное состояние которого нужно анимировать
     * @param isFocused текущее фокусное состояние [view]
     */
    fun animateFocusChange(view: View, isFocused: Boolean) {
        view.animate()
            .setDuration(duration)
            .apply {
                if (isFocused) {
                    _initialsScaleX = view.scaleX
                    _initialsScaleY = view.scaleY
                    scaleXBy(factor)
                    scaleYBy(factor)
                } else {
                    scaleX(_initialsScaleX)
                    scaleY(_initialsScaleY)
                }
            }
            .start()
    }

    companion object {
        const val DEFAULT_FACTOR = 0.05f
        const val DEFAULT_DURATION = 120L
    }
}
