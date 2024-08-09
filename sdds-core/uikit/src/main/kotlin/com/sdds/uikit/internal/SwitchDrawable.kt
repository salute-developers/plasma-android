package com.sdds.uikit.internal

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.lerp
import com.sdds.uikit.internal.base.unsafeLazy

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

    private var _paint: Paint = Paint().apply {
        isAntiAlias = true
        style = Paint.Style.FILL
    }
    private var _trackColorList: ColorStateList = DefaultBlackTint
    private var _thumbColorList: ColorStateList = DefaultWhiteTint
    private var _thumbPosition: Float = 0f
    private var _boundsF: RectF = RectF()
    private var _checked: Boolean = false
    private var _switchWidth: Int = 0
    private var _switchHeight: Int = 0
    private var _thumbSize: Float = 0f
    private var _trackCornerRadius: Float = 0f

    var isInEditMode: Boolean = false

    init {
        obtainAttributes(context, attrs, defStyleAttr)
    }

    /**
     * Устанавливает цвета фона переключателя
     * @param trackColor цвет фона переключателя
     */
    fun setTrackColor(trackColor: ColorStateList?) {
        if (_trackColorList != trackColor) {
            _trackColorList = trackColor ?: DefaultBlackTint
        }
    }

    /**
     * Устанавливает цвета подвижного элемента переключателя
     * @param thumbColor цвета подвижного элемента
     */
    fun setThumbColor(thumbColor: ColorStateList?) {
        if (_thumbColorList != thumbColor) {
            _thumbColorList = thumbColor ?: DefaultWhiteTint
        }
    }

    override fun draw(canvas: Canvas) = with(canvas) {
        val thumbRadius = _thumbSize / 2
        val trackColor = _trackColorList.getColorForState(state, _trackColorList.defaultColor)
        val thumbColor = _thumbColorList.getColorForState(state, _thumbColorList.defaultColor)

        // Рисуем track
        drawRoundRect(_boundsF, _trackCornerRadius, _trackCornerRadius, _paint.configure(color = trackColor))

        // Рисуем thumb
        drawCircle(
            lerp(
                DefaultSwitchPadding + thumbRadius,
                bounds.width() - thumbRadius - DefaultSwitchPadding,
                _thumbPosition,
            ),
            bounds.height() / 2f,
            thumbRadius,
            _paint.configure(color = thumbColor),

        )
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        _boundsF.set(bounds)
    }

    override fun onStateChange(state: IntArray): Boolean {
        val checked = state.contains(android.R.attr.state_checked)
        if (_checked != checked) {
            _checked = checked
            resetAnimator()
            start()
            return true
        }
        return super.onStateChange(state)
    }

    override fun isStateful(): Boolean = true

    override fun setAlpha(alpha: Int) {
        _paint.alpha = alpha
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

    override fun getIntrinsicWidth(): Int {
        return _switchWidth
    }

    override fun getIntrinsicHeight(): Int {
        return _switchHeight
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdSwitchDrawable, defStyleAttr, 0)
        _switchWidth = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_switchWidth, SwitchWidth)
        _switchHeight = typedArray.getDimensionPixelSize(R.styleable.SdSwitchDrawable_sd_switchHeight, SwitchHeight)
        _thumbSize = typedArray.getDimension(R.styleable.SdSwitchDrawable_sd_thumbSize, ThumbDiameter)
        _trackCornerRadius = typedArray.getDimension(
            R.styleable.SdSwitchDrawable_sd_trackCornerRadius,
            TrackCornerRadius,
        )
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
        val DefaultWhiteTint = ColorStateList.valueOf(Color.WHITE)
        val DefaultSwitchPadding = 2f.dp
        val ThumbDiameter = 24f.dp
        val SwitchWidth = 44.dp
        val SwitchHeight = 28.dp
        val TrackCornerRadius = 14f.dp
    }
}
