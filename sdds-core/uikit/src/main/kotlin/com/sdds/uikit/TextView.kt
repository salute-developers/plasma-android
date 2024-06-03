package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatTextView
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.focusselector.tryApplyFocusSelector

/**
 * Компонент для отображения текста.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 03.06.2024
 */
open class TextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AppCompatTextView(context, attrs, defStyleAttr) {

    @Suppress("LeakingThis")
    private val _shapeHelper: ShapeHelper = ShapeHelper(this, attrs, defStyleAttr)

    init {
        tryApplyFocusSelector(attrs, defStyleAttr)
    }

    /**
     * Устанавливает толщину линии границы [TextView]
     * @param strokeWidth ширина границы
     */
    open fun setStrokeWidth(strokeWidth: Float) {
        this._shapeHelper.setStrokeWidth(strokeWidth)
    }

    /**
     * Устанавливает цвет линии границы [TextView]
     * @param color цвет линии границы
     */
    open fun setStrokeColor(@ColorInt color: Int) {
        setStrokeColorList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет линии границы [TextView] из ресурсов
     * @param colorRes цвета линии границы
     */
    open fun setStrokeColorResources(@ColorRes colorRes: Int) {
        setStrokeColorList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета линии границы [TextView] согласно состоянию [getDrawableState]
     * @param colorStateList цвета линии границы
     */
    open fun setStrokeColorList(colorStateList: ColorStateList) {
        this._shapeHelper.setStrokeColor(colorStateList)
    }
}
