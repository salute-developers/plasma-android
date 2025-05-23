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
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.CheckBoxDrawable
import com.sdds.uikit.internal.CheckableDelegate
import com.sdds.uikit.internal.base.ViewAlphaHelper

/**
 * Компонент CheckBox
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @see AppCompatCheckBox
 * @author Малышев Александр on 03.06.2024
 */
open class CheckBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.checkboxStyle,
) : AppCompatCheckBox(context, attrs, defStyleAttr), ColorStateHolder {

    @Suppress("LeakingThis")
    private val _checkableDelegate: CheckableDelegate = CheckableDelegate(this, attrs, defStyleAttr)
    private val _viewAlphaHelper: ViewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)
    private var _buttonDrawable: CheckBoxDrawable? = null
    private var _toggleState: ToggleableState = ToggleableState.OFF
    private var _offsetY = 0f
    private var _clickListenerSet: Boolean = false

    /**
     * Состояние компонента [CheckBox]
     */
    enum class ToggleableState {

        /**
         * [CheckBox] не выбран
         */
        OFF,

        /**
         * [CheckBox] выбран
         */
        ON,

        /**
         * [CheckBox] в неопределенном положении.
         * Полезно, когда компонент [CheckBox] показывает состояние
         * группы других [CheckBox]. Если выбраны не все [CheckBox] из группы,
         * главный [CheckBox] может иметь состояние [INDETERMINATE]
         */
        INDETERMINATE,

        ;

        /**
         * Включен ли [CheckBox].
         * Свойство добавлено для удобства
         */
        val isChecked: Boolean get() = this == ON

        /**
         * Находится ли [CheckBox].
         * Свойство добавлено для удобства
         */
        val isIndeterminate: Boolean get() = this == INDETERMINATE
    }

    init {
        background = null
        buttonDrawable = CheckBoxDrawable(context, attrs, defStyleAttr).apply {
            callback = this@CheckBox
            isInEditMode = this@CheckBox.isInEditMode
        }
        obtainAttributes(attrs, defStyleAttr)
    }

    /**
     * Дополнительный текст (описание)
     */
    open var description: CharSequence?
        get() = _checkableDelegate.description
        set(value) { _checkableDelegate.description = value }

    /**
     * Состояние [CheckBox].
     * @see ToggleableState
     */
    open var toggleState: ToggleableState
        get() = _toggleState
        set(value) {
            if (_toggleState != value) {
                _toggleState = value
                notifyToggleStateChanged()
            }
        }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

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
    open fun setCheckBoxColors(
        borderColors: ColorStateList?,
        boxColors: ColorStateList?,
        checkMarkColors: ColorStateList?,
    ): Unit = _buttonDrawable?.run {
        setBorderTintList(borderColors)
        setBoxTintList(boxColors)
        setCheckMarkTintList(checkMarkColors)
    } ?: Unit

    override fun setChecked(checked: Boolean) {
        super.setChecked(checked)
        _toggleState = if (checked) ToggleableState.ON else ToggleableState.OFF
    }

    override fun toggle() {
        // Если установлен обработчик нажатий, то изменение состояния происходит вручную
        // при помощи изменения параметра toggleState или isChecked
        if (!_clickListenerSet) super.toggle()
    }

    final override fun setButtonIcon(icon: Icon?) {
        super.setButtonIcon(null)
    }

    final override fun setButtonDrawable(buttonDrawable: Drawable?) {
        super.setButtonDrawable(null)
        // buttonDrawable может быть только CheckBoxDrawable или null
        _buttonDrawable = buttonDrawable as? CheckBoxDrawable
        setCompoundDrawablesRelativeWithIntrinsicBounds(_buttonDrawable, null, null, null)
    }

    override fun getButtonDrawable(): Drawable? = _buttonDrawable

    override fun setOnClickListener(l: OnClickListener?) {
        super.setOnClickListener(l)
        _clickListenerSet = l != null
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _viewAlphaHelper?.updateAlphaByEnabledState(this)
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

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _buttonDrawable
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        // Проверяем на null, так как onCreateDrawableState может выполняться до инициализации _toggleState
        if (toggleState?.isIndeterminate == true) {
            mergeDrawableStates(drawableState, IndeterminateState)
        }
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
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

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _checkableDelegate.updateDescriptionColor()
        _buttonDrawable?.state = drawableState
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.CheckBox, defStyleAttr, 0) {
            setCheckBoxColors(
                borderColors = getColorStateList(R.styleable.CheckBox_sd_buttonBorderColor),
                boxColors = getColorStateList(R.styleable.CheckBox_sd_buttonBoxColor),
                checkMarkColors = getColorStateList(R.styleable.CheckBox_sd_buttonMarkColor),
            )
            _toggleState = ToggleableState.values()[getInt(R.styleable.CheckBox_sd_toggleState, 0)]
            notifyToggleStateChanged()
        }
    }

    private fun notifyToggleStateChanged() {
        val wasChecked = isChecked
        super.setChecked(_toggleState.isChecked)
        if (wasChecked == isChecked) {
            refreshDrawableState()
        }
    }

    private companion object {
        val IndeterminateState = intArrayOf(R.attr.sd_state_indeterminate)
    }
}
