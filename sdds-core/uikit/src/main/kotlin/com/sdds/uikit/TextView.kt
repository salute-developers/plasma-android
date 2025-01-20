package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatTextView
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

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
    defStyleAttr: Int = android.R.attr.textViewStyle,
) : AppCompatTextView(context, attrs, defStyleAttr), ViewStateHolder, ColorStateHolder {

    @Suppress("LeakingThis")
    private val _shapeHelper: ShapeHelper = ShapeHelper(this, attrs, defStyleAttr)

    /**
     * Состояние внешнего вида текста
     * @see ViewState
     */
    @Deprecated("Use colorState")
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Состояние цвета текста
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
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

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }
}
