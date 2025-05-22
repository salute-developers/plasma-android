package com.sdds.uikit.internal.focusselector

import android.animation.Animator
import android.animation.ValueAnimator
import android.view.View

/**
 * Делегат для отрисовки фокусного состояния компонентов
 * @author Малышев Александр on 25.07.2024
 */
internal class FocusScaleAnimationHelper(
    private val factor: Float = DEFAULT_FACTOR,
    private val duration: Long = DEFAULT_DURATION,
) : Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    private var _initialsScaleX: Float = 1f
    private var _initialsScaleY: Float = 1f
    private var _initialScaleSet: Boolean = false
    private var _startScaleX: Float = 0f
    private var _endScaleX: Float = 0f
    private var _startScaleY: Float = 0f
    private var _endScaleY: Float = 0f
    private val _scaleAnimationListeners: MutableSet<ScaleAnimationListener> = mutableSetOf()

    /**
     * Анимирует [view] при изменении [pressed]
     */
    fun animatePressedState(view: View, pressed: Boolean) {
        if (!view.isFocused) return
        if (pressed) {
            _startScaleX = view.scaleX
            _startScaleY = view.scaleY
            _endScaleX = _initialsScaleX
            _endScaleY = _initialsScaleY
        } else {
            _startScaleX = view.scaleX
            _startScaleY = view.scaleY
            _endScaleX = _initialsScaleX + factor
            _endScaleY = _initialsScaleY + factor
        }
        view.animate()
            .setDuration(duration)
            .scaleX(_endScaleX)
            .scaleY(_endScaleY)
            .setListener(this)
            .setUpdateListener(this)
            .start()
    }

    /**
     * Анимирует изменение фокусного состояния [view]
     * @param view [View], фокусное состояние которого нужно анимировать
     * @param isFocused текущее фокусное состояние [view]
     */
    fun animateFocusChange(view: View, isFocused: Boolean) {
        if (isFocused && !view.isPressed) {
            if (!_initialScaleSet) {
                _initialsScaleX = view.scaleX
                _initialsScaleY = view.scaleY
                _initialScaleSet = true
            }
            _startScaleX = view.scaleX
            _startScaleY = view.scaleY
            _endScaleX = _initialsScaleX + factor
            _endScaleY = _initialsScaleY + factor
        } else {
            _startScaleX = view.scaleX
            _startScaleY = view.scaleY
            _endScaleX = _initialsScaleX
            _endScaleY = _initialsScaleY
        }
        view.animate()
            .setDuration(duration)
            .scaleX(_endScaleX)
            .scaleY(_endScaleY)
            .setListener(this)
            .setUpdateListener(this)
            .start()
    }

    fun addScaleAnimationListener(listener: ScaleAnimationListener) {
        _scaleAnimationListeners.add(listener)
    }

    fun removeScaleAnimationListener(listener: ScaleAnimationListener) {
        _scaleAnimationListeners.remove(listener)
    }

    override fun onAnimationStart(animation: Animator) {
        notifyAnimationStart()
    }

    override fun onAnimationEnd(animation: Animator) {
        notifyAnimationEnd()
    }

    override fun onAnimationCancel(animation: Animator) = Unit

    override fun onAnimationRepeat(animation: Animator) = Unit

    override fun onAnimationUpdate(animation: ValueAnimator) {
        notifyAnimationUpdate(animation.animatedFraction)
    }

    private fun notifyAnimationStart() {
        _scaleAnimationListeners.forEach {
            it.onStart()
        }
    }

    private fun notifyAnimationUpdate(fraction: Float) {
        _scaleAnimationListeners.forEach {
            it.onUpdate(_startScaleX, _startScaleY, _endScaleX, _endScaleY, fraction)
        }
    }

    private fun notifyAnimationEnd() {
        _scaleAnimationListeners.forEach {
            it.onEnd()
        }
    }

    companion object {
        const val DEFAULT_FACTOR = 0.05f
        const val DEFAULT_DURATION = 200L
    }
}
