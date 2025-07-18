package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.drawable.SpinnerDrawable
import kotlin.math.min

/**
 * Индикатор загрузки (спиннер)
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr атрибут стиля по-умолчанию
 * @author Малышев Александр on 26.04.2024
 */
open class Spinner @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_spinnerStyle,
    defStyleRes: Int = R.style.Sdds_Components_Spinner,
) : View(context, attrs, defStyleAttr), ColorStateHolder {

    private val _spinnerDrawable: SpinnerDrawable
    private var _maxWidth: Int = 0
    private var _maxHeight: Int = 0
    private var _padding: Int = 0

    /**
     * Состояние внешнего вида компонента [Badge]
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Spinner, defStyleAttr, defStyleRes)
        _maxWidth = typedArray.getDimensionPixelSize(R.styleable.Spinner_android_maxWidth, 0)
        _maxHeight = typedArray.getDimensionPixelSize(R.styleable.Spinner_android_maxHeight, 0)
        _padding = typedArray.getDimensionPixelSize(R.styleable.Spinner_android_padding, 0)
        val startColorList = typedArray.getColorStateList(R.styleable.Spinner_sd_startColor)
        val endColorList = typedArray.getColorStateList(R.styleable.Spinner_sd_endColor)
        val tintList = typedArray.getColorStateList(R.styleable.Spinner_android_tint)
        val angle = typedArray.getFloat(R.styleable.Spinner_sd_sweepAngle, 0f)
        val strokeWidth = calculateStrokeWidth(_maxWidth)
        val cap = typedArray.getInt(R.styleable.Spinner_sd_strokeCap, 0)
        _spinnerDrawable = SpinnerDrawable(
            strokeWidth = typedArray.getDimension(R.styleable.Spinner_sd_strokeWidth, strokeWidth),
        ).apply {
            callback = this@Spinner
            if (angle > 0f) sweepAngle = angle
            tintList?.let { setTintList(tintList) }
            setStrokeGradient(startColorList, endColorList)
            strokeCap = StrokeCap.values().getOrElse(cap) { StrokeCap.Round }
        }
        typedArray.recycle()
    }

    /**
     * Форма начала и конца дуги спиннера
     * @param paintCap форма
     */
    enum class StrokeCap(val paintCap: Paint.Cap) {

        /**
         * В виде полукруга
         */
        Round(Paint.Cap.ROUND),

        /**
         * В виде квадрата
         */
        Square(Paint.Cap.SQUARE),
    }

    /**
     * Устанавливает форму начала и конца дуги индикатора
     * @param strokeCap форма
     * @see [StrokeCap]
     */
    open fun setStrokeCap(strokeCap: StrokeCap) {
        _spinnerDrawable.strokeCap = strokeCap
    }

    /**
     * Устанавливает цвета градиента дуги спиннера
     * @param startColorList цвета начала градиента
     * @param endColorList цвета в конце градиента
     */
    open fun setStrokeGradient(startColorList: ColorStateList?, endColorList: ColorStateList?) {
        _spinnerDrawable.setStrokeGradient(startColorList, endColorList)
    }

    /**
     * Устанавливает цвета начала градиента дуги спиннера
     * @param startColorList цвета начала градиента
     */
    open fun setStrokeStartColor(startColorList: ColorStateList?) {
        _spinnerDrawable.setStartTintList(startColorList)
    }

    /**
     * Устанавливает цвета в конце градиента дуги спиннера
     * @param endColorList цвета начала градиента
     */
    open fun setStrokeEndColor(endColorList: ColorStateList?) {
        _spinnerDrawable.setEndTintList(endColorList)
    }

    /**
     * Устанавливает угол дуги индикатора
     * @param angle угол дуги
     */
    open fun setSweepAngle(angle: Float) {
        _spinnerDrawable.sweepAngle = angle
    }

    /**
     * Устанавливает скорость вращения дуги
     * @param duration длительность вращения в мс
     */
    open fun setDuration(duration: Long) {
        _spinnerDrawable.setDuration(duration)
    }

    /**
     * Устанавливает цвета для [Spinner]
     * @param tint цвета компонента
     */
    open fun setTintList(tint: ColorStateList?) {
        _spinnerDrawable.setTintList(tint)
    }

    /**
     * Устанавливает цвет для [Spinner]
     * @param color цвет компонента
     */
    open fun setColor(@ColorInt color: Int) {
        setTintList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет для [Spinner] по идентификатору ресурса цвета
     * @param colorRes идентификатор ресурса цвета компонента
     */
    open fun setColorRes(@ColorRes colorRes: Int) {
        setTintList(AppCompatResources.getColorStateList(context, colorRes))
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val newWidth = if (MeasureSpec.getMode(widthMeasureSpec) != MeasureSpec.EXACTLY) {
            min(measuredWidth, _maxWidth)
        } else {
            measuredWidth
        }
        val newHeight = if (MeasureSpec.getMode(heightMeasureSpec) != MeasureSpec.EXACTLY) {
            min(measuredHeight, _maxHeight)
        } else {
            measuredHeight
        }
        setMeasuredDimension(newWidth, newHeight)
        _spinnerDrawable.setBounds(_padding, _padding, measuredWidth - _padding, measuredHeight - _padding)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _spinnerDrawable
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _spinnerDrawable.state = drawableState
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!_spinnerDrawable.isRunning) {
            _spinnerDrawable.start()
        }
        _spinnerDrawable.draw(canvas)
    }

    private fun calculateStrokeWidth(size: Int): Float {
        val actualSize = if (size > 0) size.toFloat() else MIN_SPINNER_SIZE
        return (MIN_SPINNER_THICKNESS * (actualSize / MIN_SPINNER_SIZE))
    }

    private companion object {
        const val MIN_SPINNER_THICKNESS = 1.5f
        const val MIN_SPINNER_SIZE = 16f
    }
}
