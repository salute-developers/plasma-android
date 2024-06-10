package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.util.AttributeSet
import android.widget.CompoundButton
import com.sdds.uikit.internal.SwitchDrawable

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
    defStyleAttr: Int = 0,
) : CompoundButton(context, attrs, defStyleAttr) {

    private var _buttonDrawable: SwitchDrawable? = null

    init {
        background = null
        buttonDrawable = SwitchDrawable(context, attrs, defStyleAttr).apply {
            isInEditMode = this@Switch.isInEditMode
        }

        obtainAttributes(attrs, defStyleAttr)
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

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Switch, defStyleAttr, 0)
        setSwitchColors(
            track = typedArray.getColorStateList(R.styleable.Switch_sd_buttonTrackColor),
            thumb = typedArray.getColorStateList(R.styleable.Switch_sd_buttonThumbColor),
        )
        typedArray.recycle()
    }
}
