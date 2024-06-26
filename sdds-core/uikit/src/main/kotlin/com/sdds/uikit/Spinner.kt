package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
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
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr) {

    private val _spinnerDrawable: SpinnerDrawable
    private var _maxWidth: Int = 0
    private var _maxHeight: Int = 0

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Spinner, defStyleAttr, -1)
        _spinnerDrawable = SpinnerDrawable(
            strokeWidth = typedArray.getDimension(R.styleable.Spinner_sd_strokeWidth, DefaultStrokeWidth),
        ).apply {
            callback = this@Spinner
            setTintList(typedArray.getColorStateList(R.styleable.Spinner_android_tint))
        }
        _maxWidth = typedArray.getDimensionPixelSize(R.styleable.Spinner_android_maxWidth, 0)
        _maxHeight = typedArray.getDimensionPixelSize(R.styleable.Spinner_android_maxHeight, 0)
        typedArray.recycle()
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
        _spinnerDrawable.setBounds(paddingStart, paddingTop, measuredWidth - paddingEnd, measuredHeight - paddingBottom)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _spinnerDrawable
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!_spinnerDrawable.isRunning) {
            _spinnerDrawable.start()
        }
        _spinnerDrawable.draw(canvas)
    }

    private companion object {
        val DefaultStrokeWidth = 2f.dp
    }
}
