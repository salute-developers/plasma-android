package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatRadioButton
import com.sdds.uikit.internal.CheckableDelegate
import com.sdds.uikit.internal.RadioBoxDrawable

/**
 * Компонент RadioBox
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 03.06.2024
 */
open class RadioBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AppCompatRadioButton(context, attrs, defStyleAttr) {

    @Suppress("LeakingThis")
    private val _checkableDelegate: CheckableDelegate = CheckableDelegate(this, attrs, defStyleAttr)
    private var _buttonDrawable: RadioBoxDrawable? = null
    private var _offsetY = 0f

    init {
        background = null
        buttonDrawable = RadioBoxDrawable(context, attrs, defStyleAttr).apply {
            isInEditMode = this@RadioBox.isInEditMode
        }
        obtainAttributes(attrs, defStyleAttr)
    }

    /**
     * Текст-описание
     */
    open var description: CharSequence?
        get() = _checkableDelegate.description
        set(value) { _checkableDelegate.description = value }

    /**
     * Устанавливает стиль дополнительного текста по идентификатору стиля в ресурсах
     * @param textAppearanceId идентификатор стиля текста в ресурсах
     */
    open fun setDescriptionTextAppearance(@StyleRes textAppearanceId: Int) {
        _checkableDelegate.setDescriptionTextAppearance(textAppearanceId)
    }

    /**
     * Устанавливает цвета дополнительного текста
     * @param colors [ColorStateList] цвета дополнительного текста
     */
    open fun setDescriptionTextColors(colors: ColorStateList?) {
        _checkableDelegate.setDescriptionTextColors(colors)
    }

    /**
     * Устанавливает цвет дополнительного текста
     * @param color цвет дополнительного текста
     */
    fun setDescriptionTextColor(@ColorInt color: Int) {
        setDescriptionTextColors(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет дополнительного текста по идентификатору
     * @param colorRes идентификатор цвета в ресурсах
     */
    fun setDescriptionTextColorResource(@ColorRes colorRes: Int) {
        setDescriptionTextColors(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета для [getButtonDrawable].
     * @param borderColors цвета границы
     * @param boxColors цвета заливки
     * @param boxColors цвета маркера
     */
    open fun setRadioBoxColors(
        borderColors: ColorStateList?,
        boxColors: ColorStateList?,
        checkMarkColors: ColorStateList?,
    ): Unit = _buttonDrawable?.run {
        setBorderTintList(borderColors)
        setBoxTintList(boxColors)
        setCheckMarkTintList(checkMarkColors)
        this.invalidateSelf()
    } ?: Unit

    override fun toggle() {
        isChecked = !isChecked
    }

    final override fun setButtonIcon(icon: Icon?) {
        super.setButtonIcon(null)
        // buttonDrawable может быть только RadioBoxDrawable или null
    }

    final override fun setButtonDrawable(buttonDrawable: Drawable?) {
        super.setButtonDrawable(null)
        // buttonDrawable может быть только RadioBoxDrawable или null
        _buttonDrawable = buttonDrawable as? RadioBoxDrawable
        setCompoundDrawablesRelativeWithIntrinsicBounds(buttonDrawable, null, null, null)
    }

    override fun getButtonDrawable(): Drawable? = _buttonDrawable

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val newWidth = _checkableDelegate.measureWidth(widthMeasureSpec)
        val newHeight = _checkableDelegate.measureHeight(heightMeasureSpec)
        if (newWidth != measuredWidth || newHeight != measuredHeight) {
            _offsetY = (measuredHeight - newHeight) / 2f
            setMeasuredDimension(newWidth, newHeight)
        } else {
            _offsetY = 0f
        }
    }

    override fun onDraw(canvas: Canvas) {
        with(canvas) {
            save()
            translate(0f, _offsetY)
            super.onDraw(canvas)
            restore()
        }
        _checkableDelegate.drawDescription(canvas)
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RadioBox, defStyleAttr, 0)
        setRadioBoxColors(
            borderColors = typedArray.getColorStateList(R.styleable.RadioBox_sd_buttonBorderColor),
            boxColors = typedArray.getColorStateList(R.styleable.RadioBox_sd_buttonBoxColor),
            checkMarkColors = typedArray.getColorStateList(R.styleable.RadioBox_sd_buttonMarkColor),
        )
        typedArray.recycle()
    }
}
