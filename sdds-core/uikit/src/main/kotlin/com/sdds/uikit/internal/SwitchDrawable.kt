package com.sdds.uikit.internal

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import androidx.core.graphics.toXfermode
import androidx.core.graphics.withTranslation
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.getXfermode
import com.sdds.uikit.internal.base.lerp
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel

/**
 * [Drawable] переключателя компонента Switch
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 06.06.2024
 */
internal class SwitchDrawable(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
    defStyleRes: Int,
) : Drawable(), Animatable {

    private val _animator by unsafeLazy {
        ValueAnimator().apply {
            duration = ANIMATION_DURATION
            interpolator = LinearInterpolator()
            addUpdateListener {
                _thumbPosition = it.animatedValue as Float
                invalidateSelf()
            }
        }
    }

    private var _trackColorList: ColorStateList = DefaultBlackTint
    private var _trackBorderColorList: ColorStateList? = null
    private var _thumbColorList: ColorStateList = DefaultGrayTint
    private var _thumbPosition: Float = 0f
    private var _checked: Boolean = false
    private var _focused: Boolean = false
    private var _switchWidth: Int = 0
    private var _switchHeight: Int = 0
    private var _thumbWidth: Int = 0
    private var _thumbHeight: Int = 0
    var isInEditMode: Boolean = false
    private var _trackDrawable: ShapeDrawable? = null
    private var _thumbDrawable: ShapeDrawable? = null
    private var _strokeWidth: Float = 0f
    private var _thumbPadding: Float = 0f

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        _trackDrawable = ShapeDrawable(context, attrs, defStyleAttr).apply {
            callback = this@SwitchDrawable.callback
            setStrokeWidth(_strokeWidth)
        }
    }

    /**
     * Устанавливает цвета фона переключателя
     * @param trackColor цвет фона переключателя
     */
    fun setTrackColor(trackColor: ColorStateList?) {
        _trackColorList = trackColor ?: DefaultBlackTint
        _trackDrawable?.setTintList(_trackColorList)
    }

    /**
     * Устанавливает цвета бордера переключателя
     * @param trackBorderColor цвет бордера переключателя
     */
    fun setTrackBorderColor(trackBorderColor: ColorStateList?) {
        _trackBorderColorList = trackBorderColor ?: DefaultBlackTint
        _trackDrawable?.setStrokeTint(_trackBorderColorList)
    }

    /**
     * Устанавливает толщину бордера переключателя
     * @param borderWidth толщина бордера переключателя
     */
    fun setTrackBorderWidth(borderWidth: Float) {
        _strokeWidth = borderWidth
        _trackDrawable?.setStrokeWidth(_strokeWidth)
    }

    /**
     * Устанавливает цвета подвижного элемента переключателя
     * @param thumbColor цвета подвижного элемента
     */
    fun setThumbColor(thumbColor: ColorStateList?) {
        _thumbColorList = thumbColor ?: DefaultGrayTint
        _thumbDrawable?.setTintList(_thumbColorList)
    }

    override fun draw(canvas: Canvas) {
        _trackDrawable?.draw(canvas)
        val translation = lerp(
            bounds.left + _thumbPadding,
            bounds.right - _thumbWidth - _thumbPadding,
            _thumbPosition,
        )
        canvas.withTranslation(translation) {
            _thumbDrawable?.draw(this)
        }
    }

    override fun onBoundsChange(bounds: Rect) {
        _trackDrawable?.setBounds(0, 0, _switchWidth, _switchHeight)
        val left = bounds.left
        val top = bounds.centerY() - _thumbHeight / 2
        _thumbDrawable?.setBounds(
            left,
            top,
            left + _thumbWidth,
            top + _thumbHeight,
        )
        super.onBoundsChange(bounds)
    }

    override fun onStateChange(state: IntArray): Boolean {
        var invalidate = super.onStateChange(state)
        invalidate = _thumbDrawable?.setState(state) == true || invalidate
        invalidate = _trackDrawable?.setState(state) == true || invalidate
        val checked = state.contains(android.R.attr.state_checked)
        if (_checked != checked) {
            _checked = checked
            resetAnimator()
            start()
            invalidate = true
        }

        val focused = state.contains(android.R.attr.state_focused)
        if (_focused != focused) {
            _focused = focused
            invalidate = true
        }
        if (invalidate) {
            invalidateSelf()
        }
        return invalidate
    }

    override fun isStateful(): Boolean = true

    override fun setAlpha(alpha: Int) {
        _trackDrawable?.alpha = alpha
        _thumbDrawable?.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun start() {
        if (isInEditMode) {
            jumpToCurrentState()
            invalidateSelf()
            return
        }
        if (!isRunning) {
            _animator.start()
        }
    }

    override fun stop() {
        if (isRunning) {
            _animator.cancel()
        }
    }

    override fun isRunning(): Boolean = _animator.isRunning

    override fun getIntrinsicWidth() = _switchWidth

    override fun getIntrinsicHeight() = _switchHeight

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdSwitchDrawable, defStyleAttr, defStyleRes)
        _switchWidth = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_switchWidth, SwitchWidth)
        _switchHeight = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_switchHeight, SwitchHeight)
        _thumbWidth = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_thumbWidth, ThumbDiameter)
        _thumbHeight = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_thumbHeight, ThumbDiameter)
        _strokeWidth = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_switchBorderWidth, 0).toFloat()
        _thumbPadding =
            typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_thumbPadding, DefaultSwitchPadding)
                .toFloat()
        val thumbShape = ShapeModel.create(
            context,
            typedArray.getResourceId(R.styleable.SdSwitchDrawable_sd_thumbShapeAppearance, 0),
        )
        val xfermode = typedArray.getInt(R.styleable.SdSwitchDrawable_sd_buttonThumbColorMode, 0)
        _thumbDrawable = ShapeDrawable(thumbShape).apply {
            callback = this@SwitchDrawable.callback
            setXfermode(getXfermode(xfermode).toXfermode())
        }
        typedArray.recycle()
    }

    private fun resetAnimator() {
        _animator.cancel()
        _animator.setFloatValues(
            if (_checked) 0f else 1f,
            if (_checked) 1f else 0f,
        )
    }

    private companion object {
        const val ANIMATION_DURATION = 100L
        val DefaultBlackTint = ColorStateList.valueOf(Color.BLACK)
        val DefaultGrayTint = ColorStateList.valueOf(Color.LTGRAY)
        val DefaultSwitchPadding = 2.dp
        val ThumbDiameter = 24.dp
        val SwitchWidth = 44.dp
        val SwitchHeight = 28.dp
    }
}
