package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.annotation.ColorInt
import androidx.annotation.StyleRes
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import com.sdds.uikit.Button.IconPosition
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.CounterDrawable
import com.sdds.uikit.internal.base.ViewAlphaHelper

/**
 * Компонент таб-элемента с иконкой, текстами и опциональными: иконкой-действием и счётчиком.
 * Поддерживает состояние цвета через [ColorStateHolder].
 *
 * @constructor Создаёт экземпляр [TabItem].
 * @param context Контекст, в котором создаётся виджет.
 * @param attrs Набор атрибутов из XML-разметки, если задан.
 * @param defStyleAttr Атрибут стиля по умолчанию, применяемый к этому виджету.
 * @param defStyleRes Ресурс стиля по умолчанию, применяемый к этому виджету.
 * @see ColorState
 * @see Button.IconPosition
 */
open class TabItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_tabItemStyle,
    defStyleRes: Int = R.style.Sdds_Components_TabItem,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {

    private val viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)
    private val _action: ImageView = ImageView(context, null, 0).apply {
        background = null
        setPadding(0, 0, 0, 0)
    }
    private val _internalTabItem = TabItemInternal(context, attrs, defStyleAttr)

    private var _onSelectedChangeListener: OnSelectedChangeListener? = null
    private var _actionPadding: Int = 0
    private var _actionSize: Int = LayoutParams.WRAP_CONTENT

    /**
     * Включает/выключает отображение счётчика поверх контента таба.
     */
    open var isCounterEnabled
        get() = _internalTabItem.isCounterEnabled
        set(value) {
            _internalTabItem.isCounterEnabled = value
        }

    /**
     * Текст, отображаемый внутри счётчика.
     */
    open var counterText: CharSequence
        get() = _internalTabItem.counterText
        set(value) {
            _internalTabItem.counterText = value
        }

    /**
     * Состояние внешнего вида SegmentItem
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                _internalTabItem.colorState = value
                refreshDrawableState()
            }
        }

    /**
     * Размер иконки в начале (start) в пикселях.
     */
    open var contentStartSize: Int
        get() = _internalTabItem.contentStartSize
        set(value) {
            _internalTabItem.contentStartSize = value
        }

    /**
     * Размер иконки в конце (end) в пикселях.
     */
    open var contentEndSize: Int
        get() = _internalTabItem.contentEndSize
        set(value) {
            _internalTabItem.contentEndSize = value
        }

    /**
     * Положение иконки относительно текста.
     */
    var iconPosition: IconPosition
        get() = _internalTabItem.iconPosition
        set(value) {
            _internalTabItem.iconPosition = value
        }

    /**
     * Дополнительный текст
     * @see valuePadding
     */
    open var value: CharSequence?
        get() = _internalTabItem.value
        set(value) {
            _internalTabItem.value = value
        }

    /**
     * Основной текст
     */
    open var text: CharSequence?
        get() = _internalTabItem.text
        set(value) {
            _internalTabItem.text = value
        }

    /**
     * Отступ между основным ([text]) и дополнительным ([value]) текстами.
     * @see value
     * @see text
     */
    open var valuePadding: Int
        get() = _internalTabItem.valuePadding
        set(value) {
            _internalTabItem.valuePadding = value
        }

    /**
     * Управляет видимостью иконки-действия справа.
     */
    open var actionEnabled: Boolean
        get() = _action.isVisible
        set(value) {
            _action.isVisible = value
        }

    /**
     * Drawable иконки-действия, отображаемой справа.
     */
    open var action: Drawable?
        get() = _action.drawable
        set(value) {
            _action.setImageDrawable(value)
        }

    /**
     * Отступ слева от иконки-действия в пикселях.
     */
    open var actionPadding: Int
        get() = _actionPadding
        set(value) {
            if (_actionPadding != value) {
                _actionPadding = value
                _action.updateLayoutParams<MarginLayoutParams> {
                    marginStart = value
                }
            }
        }

    /**
     * Основная иконка элемента.
     */
    open var icon: Drawable?
        get() = _internalTabItem.icon
        set(value) {
            _internalTabItem.icon = value
        }

    /**
     * Слушатель изменения состояния выбора [TabItem].
     */
    fun interface OnSelectedChangeListener {

        /**
         * Вызывается при изменении состояния выбора элемента.
         *
         * @param item Элемент, состояние которого изменилось.
         * @param isSelected Новое состояние выбора.
         */
        fun onSelectedChanged(item: TabItem, isSelected: Boolean)
    }

    init {
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        orientation = HORIZONTAL
        viewAlphaHelper.updateAlphaByEnabledState(this)
        populate()
    }

    final override fun getOrientation(): Int {
        return HORIZONTAL
    }

    final override fun setOrientation(orientation: Int) {
        super.setOrientation(HORIZONTAL)
    }

    /**
     * Сбрасывает составные drawables у внутреннего элемента.
     */
    @Suppress("UNNECESSARY_SAFE_CALL")
    open fun resetCompoundDrawables() {
        _internalTabItem?.resetCompoundDrawablesInternal()
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    internal fun getCounterDrawable(): CounterDrawable? =
        _internalTabItem?.getCounterDrawable()

    /**
     * Возвращает текущие составные drawables внутреннего элемента.
     */
    @Suppress("UNNECESSARY_SAFE_CALL")
    open fun getCompoundDrawables(): Array<Drawable> {
        return _internalTabItem?.compoundDrawablesRelative ?: emptyArray()
    }

    /**
     * Устанавливает составные drawables относительно направления текста.
     *
     * @param start Drawable слева/в начале.
     * @param top Drawable сверху.
     * @param end Drawable справа/в конце.
     * @param bottom Drawable снизу.
     */
    @Suppress("UNNECESSARY_SAFE_CALL")
    open fun setCompoundDrawablesRelative(
        start: Drawable?,
        top: Drawable?,
        end: Drawable?,
        bottom: Drawable?,
    ) {
        _internalTabItem?.setCompoundDrawablesRelative(start, top, end, bottom)
    }

    /**
     * Задаёт обработчик клика по иконке-действию.
     *
     * @param clickListener Слушатель клика или `null` для удаления слушателя.
     */
    fun setActionClickListener(clickListener: OnClickListener?) {
        _action.setOnClickListener(clickListener)
    }

    /**
     * Устанавливает слушатель изменения состояния выбора у элемента.
     *
     * @param listener Слушатель или `null` для удаления слушателя.
     */
    fun setOnSelectedChangeListener(listener: OnSelectedChangeListener?) {
        _onSelectedChangeListener = listener
    }

    /**
     * Задаёт цвет текста с использованием [ColorStateList].
     */
    fun setTextColor(color: ColorStateList?) {
        _internalTabItem.setTextColor(color)
    }

    /**
     * Задаёт однотонный цвет текста.
     */
    fun setTextColor(@ColorInt color: Int) {
        _internalTabItem.setTextColor(color)
    }

    /**
     * Задаёт цвет дополнительного текста ([value]) с использованием [ColorStateList].
     */
    fun setValueTextColor(color: ColorStateList?) {
        _internalTabItem.setValueTextColor(color)
    }

    /**
     * Задаёт однотонный цвет дополнительного текста ([value]).
     */
    fun setValueTextColor(@ColorInt color: Int) {
        _internalTabItem.setValueTextColor(color)
    }

    /**
     * Применяет текстовый стиль к основному тексту.
     */
    fun setTextAppearance(@StyleRes appearance: Int) {
        _internalTabItem.setTextAppearance(context, appearance)
    }

    /**
     * Устанавливает палитру оттенков (tint) для основной иконки.
     */
    fun setIconTintList(color: ColorStateList?) {
        _internalTabItem.setIconTintList(color)
    }

    /**
     * Устанавливает однотонный оттенок (tint) для основной иконки.
     */
    fun setIconTint(@ColorInt color: Int) {
        _internalTabItem.setIconTint(color)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _action.isEnabled = enabled
        viewAlphaHelper.updateAlphaByEnabledState(this)
    }

    override fun setSelected(selected: Boolean) {
        val wasSelected = isSelected
        super.setSelected(selected)
        if (wasSelected != selected) {
            _onSelectedChangeListener?.onSelectedChanged(this, selected)
        }
    }

    override fun performClick(): Boolean {
        toggle()
        return super.performClick()
    }

    /**
     * Переключает элемент в состояние выбранного (если ещё не выбран).
     */
    open fun toggle() {
        if (!this.isSelected) {
            this.isSelected = true
        }
    }

    private fun populate() {
        gravity = Gravity.CENTER
        addView(_internalTabItem)
        addView(
            _action,
            LayoutParams(_actionSize, _actionSize).apply {
                marginStart = actionPadding
            },
        )
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) = _internalTabItem.apply {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.TabItem, defStyleAttr, defStyleRes)
        _action.let {
            it.setImageDrawable(typedArray.getDrawable(R.styleable.TabItem_sd_action))
            it.isVisible = typedArray.getBoolean(R.styleable.TabItem_sd_actionEnabled, false)
            it.imageTintList = typedArray.getColorStateList(R.styleable.TabItem_sd_actionTint)
        }
        _actionPadding = typedArray.getDimensionPixelSize(R.styleable.TabItem_sd_actionPadding, 0)
        _actionSize = typedArray.getDimensionPixelSize(R.styleable.TabItem_sd_actionSize, LayoutParams.WRAP_CONTENT)
        typedArray.recycle()
    }

    internal inner class TabItemInternal(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
        SegmentItem(context, attrs, defStyleAttr) {
        init {
            isFocusable = false
            isClickable = false
            isDuplicateParentStateEnabled = true
            background = null
            foreground = null
            setPadding(0, 0, 0, 0)
        }

        override fun resetCompoundDrawables() {
            this@TabItem.resetCompoundDrawables()
        }

        fun resetCompoundDrawablesInternal() {
            super.resetCompoundDrawables()
        }
    }
}
