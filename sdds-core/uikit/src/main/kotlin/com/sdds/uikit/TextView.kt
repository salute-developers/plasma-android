package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Rect
import android.graphics.Shader
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatTextView
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.shader.ShaderFactory
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setTextColorValue
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

    private var _textTint: ColorValueStateList? = null
    private val _tempTextBounds: Rect = Rect()
    private val _textBounds: Rect = Rect()
    private var _textShaderFactory: ShaderFactory? = null
    private var _textShader: Shader? = null

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

    init {
        context.obtainStyledAttributes(attrs, R.styleable.TextView, defStyleAttr, 0).use {
            setTextColor(it.getColorValueStateList(context, R.styleable.TextView_sd_textColor))
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

    /**
     * Устанавливает цвета текста [tint]
     * @see ColorValueStateList
     */
    open fun setTextColor(tint: ColorValueStateList?) {
        _textTint = tint
        updateBounds()
        invalidate()
    }

    /**
     * Устанавливает шейдер для текста
     */
    open fun setTextShader(shaderFactory: ShaderFactory?) {
        _textShaderFactory = shaderFactory
        if (shaderFactory != null) {
            createShader(shaderFactory)
        }
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

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateBounds()
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setTextColorValue(_textTint)
    }

    private fun updateBounds() {
        _tempTextBounds.set(_textBounds)
        paint.getTextBounds(text.toString(), 0, text.length, _textBounds)
    }

    private fun createShader(shaderFactory: ShaderFactory): Shader? {
        if (_textShaderFactory != shaderFactory || _tempTextBounds != _textBounds) {
            _textShaderFactory = shaderFactory
            return shaderFactory.resize(_textBounds.width().toFloat(), _textBounds.height().toFloat()).also {
                _textShader = it
            }
        }
        return _textShader
    }
}
