package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.core.content.ContextCompat
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList

/**
 * Простое всплывающее окно с текстом и иконкой.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 * @author Малышев Александр on 19.05.2025
 */
open class Tooltip @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_tooltipStyle,
    defStyleRes: Int = R.style.Sdds_Components_Tooltip,
) : Popover(context, attrs, defStyleAttr, defStyleRes) {

    private val _tooltipContent: TooltipContent = TooltipContent(context, attrs, defStyleAttr, defStyleRes)

    override var colorState: ColorState?
        get() = _tooltipContent.colorState
        set(value) {
            _tooltipContent.colorState = value
        }

    init {
        contentView = _tooltipContent
    }

    /**
     * Текст
     */
    open var text: CharSequence?
        get() = _tooltipContent.text
        set(value) {
            _tooltipContent.text = value ?: ""
            _tooltipContent.resetContentStartPadding()
        }

    /**
     * [Drawable] в начале [Tooltip]
     */
    open var contentStart: Drawable?
        get() = _tooltipContent.contentStart
        set(value) {
            _tooltipContent.contentStart = value
        }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        _tooltipContent.setTextColor(colors)
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorValueStateList?) {
        _tooltipContent.setTextColor(colors)
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    open fun setTextAppearance(@StyleRes appearanceId: Int) {
        _tooltipContent.setTextAppearance(appearanceId)
    }

    /**
     * Устанавливает [Drawable] в начале по идентификатору ресурса
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setContentStartRes(@DrawableRes drawableRes: Int) {
        _tooltipContent.setContentStartRes(drawableRes)
    }

    /**
     * Устанавливает цвета [Drawable] в начале
     * @param colors цвета [Drawable] в начале
     */
    open fun setContentStartColors(colors: ColorStateList?) {
        _tooltipContent.setContentStartColors(colors)
    }

    /**
     * Устанавливает цвет [Drawable] в начале
     * @param color цвет [Drawable] в начале
     */
    fun setContentStartColor(@ColorInt color: Int) {
        setContentStartColors(ColorStateList.valueOf(color))
    }

    override fun showWithTrigger(
        trigger: View,
        placement: Int,
        placementMode: Int,
        alignment: Int,
        tailEnabled: Boolean,
        triggerCentered: Boolean,
        duration: Long?,
    ) {
        if (text.isNullOrBlank() && contentStart == null) return
        super.showWithTrigger(trigger, placement, placementMode, alignment, tailEnabled, triggerCentered, duration)
    }

    @Suppress("UseCompatTextViewDrawableApis", "PrivateResource")
    private inner class TooltipContent(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) : TextView(context) {

        private var _contentStartSize: Int = 0
        private var _contentStartPadding: Int = 0

        var contentStart: Drawable? = null
            set(value) {
                if (field != value) {
                    field = value
                    resetCompoundDrawable()
                    refreshDrawableState()
                }
            }

        init {
            context.withStyledAttributes(
                attrs,
                R.styleable.Tooltip,
                defStyleAttr,
                defStyleRes,
            ) {
                text = getString(R.styleable.Tooltip_android_text).orEmpty()
                setTextAppearance(getResourceId(R.styleable.Tooltip_android_textAppearance, 0))
                val textColor = getColorStateList(R.styleable.Tooltip_android_textColor)
                val sdTextColor =
                    getColorValueStateList(context, R.styleable.Tooltip_sd_textColor)
                        ?: textColor?.let { ColorValueStateList.valueOf(it) }
                setTextColor(sdTextColor)
                _contentStartPadding = getDimensionPixelSize(R.styleable.Tooltip_sd_contentStartPadding, 0)
                contentStart = getDrawable(R.styleable.Tooltip_sd_contentStart)
                compoundDrawableTintList = getColorStateList(R.styleable.Tooltip_sd_contentStartTint) ?: textColor

                _contentStartSize = getDimensionPixelSize(R.styleable.Tooltip_sd_contentStartSize, 0)

                setMaxLines(getInt(R.styleable.Tooltip_android_maxLines, Int.MAX_VALUE))
            }
            resetContentStartPadding()
        }

        fun setContentStartRes(@DrawableRes drawableRes: Int) {
            contentStart = ContextCompat.getDrawable(context, drawableRes)
        }

        fun setContentStartColors(colors: ColorStateList?) {
            _tooltipContent.compoundDrawableTintList = colors
        }

        fun resetContentStartPadding() {
            compoundDrawablePadding = if (text.isNullOrBlank()) 0 else _contentStartPadding
        }

        private fun resetCompoundDrawable() {
            contentStart.run {
                if (_contentStartSize > 0) {
                    this?.setBounds(0, 0, _contentStartSize, _contentStartSize)
                    setCompoundDrawables(this, null, null, null)
                } else {
                    setCompoundDrawablesWithIntrinsicBounds(this, null, null, null)
                }
            }
        }
    }
}
