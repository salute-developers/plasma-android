package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.util.AttributeSet
import android.widget.CompoundButton
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import com.sdds.uikit.internal.CheckableDelegate
import com.sdds.uikit.internal.SwitchDrawable
import com.sdds.uikit.internal.base.ViewAlphaHelper

/**
 * Компонент Switch (переключатель)
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 06.06.2024
 */
open class Switch @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_switchStyle,
) : CompoundButton(context, attrs, defStyleAttr) {

    @Suppress("LeakingThis")
    private val _checkableDelegate: CheckableDelegate = CheckableDelegate(this, attrs, defStyleAttr)
    private val _viewAlphaHelper: ViewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)
    private var _buttonDrawable: SwitchDrawable? = null
    private var _offsetY = 0f

    init {
        background = null
        buttonDrawable = SwitchDrawable(context, attrs, defStyleAttr).apply {
            isInEditMode = this@Switch.isInEditMode
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
     * @param track цвета неподвижной части
     * @param thumb цвета подвижной части
     */
    open fun setSwitchColors(
        track: ColorStateList?,
        thumb: ColorStateList?,
    ): Unit = _buttonDrawable?.run {
        setThumbColor(thumb)
        setTrackColor(track)
    } ?: Unit

    override fun setButtonDrawable(drawable: Drawable?) {
        super.setButtonDrawable(null)
        _buttonDrawable = drawable as? SwitchDrawable
        setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, _buttonDrawable, null)
    }

    override fun setButtonIcon(icon: Icon?) {
        super.setButtonIcon(null)
    }

    override fun getButtonDrawable(): Drawable? = _buttonDrawable

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _viewAlphaHelper.updateAlphaByEnabledState(this)
    }

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
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Switch, defStyleAttr, 0)
        setSwitchColors(
            track = typedArray.getColorStateList(R.styleable.Switch_sd_buttonTrackColor),
            thumb = typedArray.getColorStateList(R.styleable.Switch_sd_buttonThumbColor),
        )
        typedArray.recycle()
    }
}
