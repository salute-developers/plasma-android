package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.withTranslation
import com.sdds.uikit.Button.IconPosition

/**
 * Таб-элемент с иконкой и опциональным счётчиком.
 *
 * Позволяет отображать иконку с возможностью смещения счётчика по осям X и Y.
 * Счётчик отображается поверх иконки, если включена соответствующая опция.
 *
 * @constructor Создаёт новый экземпляр [IconTabItem].
 * @param context Контекст, в котором создаётся элемент.
 * @param attrs Атрибуты, заданные в XML.
 * @param defStyleAttr Идентификатор атрибута стиля по умолчанию.
 * @param defStyleRes Идентификатор ресурса стиля по умолчанию.
 * @see TabItem
 */
open class IconTabItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_iconTabItemStyle,
    defStyleRes: Int = R.style.Sdds_Components_IconTabItem,
) : TabItem(context, attrs, defStyleAttr, defStyleRes) {

    private var _counterOffsetX: Int = 0
    private var _counterOffsetY: Int = 0

    /**
     * Смещение счётчика по горизонтали (ось X) в пикселях.
     *
     * Позволяет сдвигать позицию счётчика относительно иконки.
     */
    var counterOffsetX: Int
        get() = _counterOffsetX
        set(value) {
            if (_counterOffsetX != value) {
                _counterOffsetX = value
                invalidate()
            }
        }

    /**
     * Смещение счётчика по вертикали (ось Y) в пикселях.
     *
     * Позволяет сдвигать позицию счётчика относительно иконки.
     */
    var counterOffsetY: Int
        get() = _counterOffsetY
        set(value) {
            if (_counterOffsetY != value) {
                _counterOffsetY = value
                invalidate()
            }
        }

    /**
     * Значение текста элемента. Всегда `null` для [IconTabItem].
     */
    final override var value: CharSequence?
        get() = null
        set(_) {}

    /**
     * Текст элемента. Всегда `null` для [IconTabItem].
     */
    final override var text: CharSequence?
        get() = null
        set(_) {}

    /**
     * Включена ли отрисовка счётчика.
     *
     * При изменении значения вызывается перерисовка компонента.
     */
    override var isCounterEnabled: Boolean
        get() = super.isCounterEnabled
        set(value) {
            if (super.isCounterEnabled != value) {
                super.isCounterEnabled = value
                setWillNotDraw(!value)
            }
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.IconTabItem, defStyleAttr, defStyleRes) {
            _counterOffsetX = getDimensionPixelSize(R.styleable.IconTabItem_sd_counterOffsetX, 0)
            _counterOffsetY = getDimensionPixelSize(R.styleable.IconTabItem_sd_counterOffsetY, 0)
        }
        getCounterDrawable()?.apply {
            callback = this@IconTabItem
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (isCounterEnabled) {
            val counterWidth = getCounterDrawable()?.intrinsicWidth ?: 0
            Log.e("IconTab", "onMeasure counter $id: $counterWidth")
            setMeasuredDimension(maxOf(counterWidth, measuredWidth), measuredHeight)
        }
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == getCounterDrawable()
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        if (isCounterEnabled) {
            getCounterDrawable()?.let { drawCounter(canvas, it) }
        }
    }

    private fun drawCounter(canvas: Canvas, counter: Drawable) {
        val iconBounds = icon?.bounds ?: return
        val iconTop = (measuredHeight - iconBounds.height()) / 2
        val iconRight = paddingLeft + iconBounds.width()
        val counterLeft = (iconRight - counter.intrinsicWidth + counterOffsetX)
            .coerceIn(0, measuredWidth - counter.intrinsicWidth)
        val counterTop = (iconTop - counterOffsetY)
            .coerceIn(0, measuredHeight - counter.intrinsicHeight)
        Log.e("IconTab", "drawCounter $id: $counterText")
        canvas.withTranslation(x = counterLeft.toFloat(), y = counterTop.toFloat()) {
            counter.draw(canvas)
        }
    }

    override fun resetCompoundDrawables() {
        val existingDrawables = getCompoundDrawables()
        if (existingDrawables.isEmpty()) return
        val drawableTop = existingDrawables[1]
        val drawableBottom = existingDrawables[3]
        when {
            isCounterEnabled -> {
                if (iconPosition == IconPosition.TextStart) {
                    setCompoundDrawablesRelative(
                        icon,
                        drawableTop,
                        null,
                        drawableBottom,
                    )
                } else {
                    setCompoundDrawablesRelative(
                        null,
                        drawableTop,
                        icon,
                        drawableBottom,
                    )
                }
            }

            icon != null && !isCounterEnabled -> super.resetCompoundDrawables()
            else -> setCompoundDrawablesRelative(
                null,
                drawableTop,
                null,
                drawableBottom,
            )
        }
    }
}
