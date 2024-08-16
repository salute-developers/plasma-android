package com.sdds.uikit.internal

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import com.sdds.uikit.R
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy

/**
 * [Drawable] для RadioBox
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 04.06.2024
 */
internal class RadioBoxDrawable(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
) : Drawable(), Animatable {

    private val _paint: Paint by unsafeLazy { Paint() }
    private val animator by unsafeLazy {
        ValueAnimator().apply {
            duration = ANIMATION_DURATION
            interpolator = LinearInterpolator()
            addUpdateListener {
                _animatedMarkRadius = it.animatedValue as Float
                invalidateSelf()
            }
        }
    }

    private var _checked: Boolean = false
    private var _focused: Boolean = false

    private var _borderTintList: ColorStateList = DefaultBlackTint
    private var _checkMarkTintList: ColorStateList = DefaultWhiteTint
    private var _boxTintList: ColorStateList = DefaultBlackTint

    private var _animatedMarkRadius: Float = 0f
    private var _markSize: Int = 0
    private var _size: Int = 0
    private var _padding: Int = 0

    private val _markRadius: Float get() = _markSize / 2f

    /**
     * Отображается ли drawable в режиме Layout Editor
     */
    var isInEditMode: Boolean = false

    init {
        obtainAttributes(context, attrs, defStyleAttr)
    }

    /**
     * Устанавливает цвета границы
     */
    fun setBorderTintList(borderTintList: ColorStateList? = null) {
        if (_borderTintList != borderTintList) {
            _borderTintList = borderTintList ?: DefaultBlackTint
        }
    }

    /**
     * Устанавливает цвета заливки
     */
    fun setBoxTintList(boxTintLists: ColorStateList? = null) {
        if (_boxTintList != boxTintLists) {
            _boxTintList = boxTintLists ?: DefaultBlackTint
        }
    }

    /**
     * Устанавливает цвета маркера
     */
    fun setCheckMarkTintList(checkMarkTintLists: ColorStateList? = null) {
        if (_checkMarkTintList != checkMarkTintLists) {
            _checkMarkTintList = checkMarkTintLists ?: DefaultWhiteTint
        }
    }

    override fun draw(canvas: Canvas) = with(canvas) {
        save()
        translate(bounds.left.toFloat() + FocusBorderPadding, bounds.top.toFloat() + FocusBorderPadding)
        drawBox(
            checked = _checked,
            focused = _focused,
            boxColor = _boxTintList.getColorForState(state, _boxTintList.defaultColor),
            borderColor = _borderTintList.getColorForState(state, _borderTintList.defaultColor),
        )
        drawMark(
            color = _checkMarkTintList.getColorForState(state, _checkMarkTintList.defaultColor),
            radius = _animatedMarkRadius,
        )
        canvas.restore()
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val checked = state.contains(android.R.attr.state_checked)
        var changed = false
        var needAnimate = false
        if (_focused != focused) {
            _focused = focused
            changed = true
        }

        if (_checked != checked) {
            _checked = checked
            changed = true
            needAnimate = true
        }

        if (needAnimate) {
            resetAnimators()
            start()
        }
        return changed || super.onStateChange(state)
    }

    override fun isStateful(): Boolean {
        return true
    }

    override fun getIntrinsicWidth(): Int {
        return _size + FocusBorderPadding * 2
    }

    override fun getIntrinsicHeight(): Int {
        return _size + FocusBorderPadding * 2
    }

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
            animator.start()
        }
    }

    override fun stop() {
        if (animator.isRunning) {
            animator.cancel()
        }
    }

    override fun isRunning(): Boolean = animator.isRunning

    override fun jumpToCurrentState() {
        super.jumpToCurrentState()
        _animatedMarkRadius = if (_checked) _markRadius else 0f
    }

    private fun Canvas.drawBox(
        checked: Boolean,
        focused: Boolean,
        boxColor: Int,
        borderColor: Int,
    ) {
        _paint.xfermode = null
        val width = bounds.width()
        val height = bounds.height()

        val radioRadius = (width / 2f) - FocusBorderPadding - _padding
        val strokeWidth = if (_checked) DefaultCheckedRadioStrokeWidth else DefaultRadioStrokeWidth

        if ((checked && focused) || !checked) {
            // Рисуем пограничную окружность
            val borderRadius = if (_focused) (width / 2f) else radioRadius
            drawCircle(
                width / 2f,
                height / 2f,
                borderRadius - strokeWidth,
                _paint.configure(
                    style = Paint.Style.STROKE,
                    strokeWidth = strokeWidth,
                    color = borderColor,
                ),
            )
        }

        if (checked) {
            // Рисуем заполняющий круг при checked = true
            drawCircle(
                width / 2f,
                height / 2f,
                radioRadius,
                _paint.configure(style = Paint.Style.FILL, color = boxColor),
            )
        }
    }

    private fun Canvas.drawMark(color: Int, radius: Float) {
        if (radius > 0f) {
            // Рисуем основной круг при checked = true
            _paint.xfermode = XfermodeAdd
            drawCircle(
                bounds.width() / 2f,
                bounds.height() / 2f,
                radius,
                _paint.configure(style = Paint.Style.FILL, color = color),
            )
        }
    }

    private fun resetAnimators() {
        animator.cancel()
        animator.setFloatValues(
            if (_checked) 0f else _markRadius,
            if (_checked) _markRadius else 0f,
        )
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdRadioBoxDrawable, defStyleAttr, 0)
        _size = typedArray.getDimensionPixelSize(
            R.styleable.SdRadioBoxDrawable_sd_buttonSize,
            DefaultRadioBoxSize,
        )
        _markSize = typedArray.getDimensionPixelSize(
            R.styleable.SdRadioBoxDrawable_sd_buttonMarkSize,
            DefaultCheckMarkSize,
        )
        _padding = typedArray.getDimensionPixelSize(
            R.styleable.SdRadioBoxDrawable_sd_buttonPadding,
            DefaultRadioCheckedPadding,
        )
        typedArray.recycle()
    }

    private companion object {
        const val ANIMATION_DURATION = 100L
        val DefaultBlackTint = ColorStateList.valueOf(Color.BLACK)
        val DefaultWhiteTint = ColorStateList.valueOf(Color.WHITE)
        val DefaultRadioBoxSize = 26.dp
        val DefaultCheckMarkSize = 10.dp
        val DefaultRadioStrokeWidth = 2f.dp
        val DefaultCheckedRadioStrokeWidth = 1f.dp
        val DefaultRadioCheckedPadding = 2.dp
        val FocusBorderPadding = 2.dp
        val XfermodeAdd = PorterDuffXfermode(PorterDuff.Mode.ADD)
    }
}
