package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.PopupWindow
import androidx.core.content.withStyledAttributes
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.ListAdapter
import com.sdds.uikit.dropdown.DropdownEmptyStateView
import com.sdds.uikit.dropdown.DropdownFooterView

/**
 * Компонент ввода текста с выпадающим списком подсказок.
 *
 * Отображает текстовое поле и автоматически показывает список подсказок при изменении текста
 * или получении фокуса. Пользователь может передавать готовый список элементов или функцию,
 * генерирующую их динамически на основе введённого текста.
 */
open class Autocomplete @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_autocompleteStyle,
    defStyleRes: Int = R.style.Sdds_Components_Autocomplete,
) : LinearLayout(wrapper(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr, defStyleRes) {

    private var _textField: TextField = TextField(this.context)
    private val _dropdown: DropdownMenu = DropdownMenu(this.context)
        .apply {
            itemAdapter = SimpleListViewAdapter().apply {
                setSelectionListener { item ->
                    textField.value = item.title
                    textField.editText.setSelection(item.title.length)
                    dismiss()
                }
            }
            inputMethodMode = PopupWindow.INPUT_METHOD_NEEDED
            isFocusable = false
            itemListView.itemAnimator = null
            offset = 0
        }

    private val _globalFocusListener = ViewTreeObserver.OnGlobalFocusChangeListener { _, newFocus ->
        if ((newFocus == textField || textField.hasFocus()) && shouldShowDropdown()) {
            showDropdown()
        } else {
            hideDropdown()
        }
    }

    /**
     * Текстовое поле
     */
    val textField: TextField
        get() = _textField

    init {
        clipChildren = false
        clipToPadding = false
    }

    /**
     * Устанавливает список элементов, которые должны отображаться в выпадающем меню.
     *
     * @param items список элементов-подсказок.
     * Выпадающее меню будет автоматически показано или скрыто в зависимости от количества элементов.
     */
    fun setItems(items: List<ListItem>) {
        _dropdown.setItems<ListAdapter<ListItem, *>>(items)
        if (shouldShowDropdown(items.size)) {
            showDropdown()
        } else {
            hideDropdown()
        }
    }

    /**
     * Устанавливает функцию-генератор, формирующую подсказки на основе текущего текста.
     *
     * Функция вызывается после каждого изменения текста, а возвращённый список используется
     * для обновления содержимого выпадающего меню.
     *
     * @param producer функция, принимающая текущий текст и возвращающая список подсказок.
     */
    fun setItemProducer(producer: (CharSequence) -> List<ListItem>) {
        textField.editText.doAfterTextChanged { text ->
            setItems(producer(text.toString()))
        }
    }

    /**
     * Устанавливает пользовательский экран пустого состояния для выпадающего меню.
     *
     * @param emptyStateView виджет, который будет отображаться, когда список подсказок пуст; null удаляет его.
     */
    fun setDropdownEmptyStateView(emptyStateView: View?) {
        _dropdown.setEmptyStateView(emptyStateView)
    }

    /**
     * Устанавливает нижний колонтитул (footer) для выпадающего меню.
     *
     * @param footer виджет, отображаемый внизу выпадающего меню; null удаляет его.
     */
    fun setDropdownFooterView(footer: View?) {
        _dropdown.setFooter(footer)
    }

    /**
     * Возвращает текущий экран пустого состояния выпадающего меню.
     *
     * @return виджет пустого состояния или null, если он не установлен.
     */
    fun getEmptyStateView(): View? = _dropdown.getEmptyStateView()

    /**
     * Возвращает текущий footer выпадающего меню.
     *
     * @return footer или null, если он не установлен.
     */
    fun getFooterView(): View? = _dropdown.getFooterView()

    /**
     * Обновляет позицию выпадающего меню, если оно отображается.
     *
     * Полезно при изменениях компоновки, когда меню должно оставаться выровненным
     * относительно текстового поля.
     */
    fun updateDropdownLocation() {
        if (_dropdown.isShowing) {
            _dropdown.updateLocationPoint()
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        viewTreeObserver.addOnGlobalFocusChangeListener(_globalFocusListener)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        viewTreeObserver.removeOnGlobalFocusChangeListener(_globalFocusListener)
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        when (child) {
            is DropdownFooterView -> setDropdownFooterView(child.setLayoutParamsIfNeed(params))
            is DropdownEmptyStateView -> setDropdownEmptyStateView(child.setLayoutParamsIfNeed(params))
            else -> {
                if (child is TextField) _textField = child
                super.addView(child, index, params)
            }
        }
    }

    private fun showDropdown() {
        if (_dropdown.isShowing) return
        _dropdown.setFixedWidth(textField.measuredWidth)
        _dropdown.showWithTrigger(
            textField.findViewById(R.id.sd_textFieldDecorationBox) ?: textField,
            placement = Popover.PLACEMENT_BOTTOM,
            placementMode = Popover.PLACEMENT_MODE_STRICT,
            tailEnabled = false,
        )
    }

    private fun hideDropdown() {
        _dropdown.dismiss()
    }

    private fun shouldShowDropdown(itemCount: Int = _dropdown.itemAdapter?.itemCount ?: 0): Boolean {
        return itemCount > 0 || getEmptyStateView() != null
    }

    private companion object {

        fun View.setLayoutParamsIfNeed(lp: ViewGroup.LayoutParams?): View = apply {
            if (layoutParams == null) {
                layoutParams = lp
            }
        }

        fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            var themeOverlay = context
            context.withStyledAttributes(attrs, R.styleable.Autocomplete, defStyleAttr, defStyleRes) {
                val textFieldStyleOverlay = getResourceId(R.styleable.Autocomplete_sd_textFieldStyleOverlay, 0)
                if (textFieldStyleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, textFieldStyleOverlay)
                }
                val dropDownStyleOverlay = getResourceId(R.styleable.Autocomplete_sd_dropdownMenuStyleOverlay, 0)
                if (dropDownStyleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(context, dropDownStyleOverlay)
                }
            }
            return emptyStateWrapper(themeOverlay)
        }

        fun emptyStateWrapper(
            context: Context,
        ): Context {
            var themeOverlay = context
            val dropdownStyle = themeOverlay.resolveStyle(R.attr.sd_dropdownMenuStyle)
            themeOverlay.withStyledAttributes(dropdownStyle, R.styleable.DropdownMenu) {
                val emptyStateStyleOverlay = getResourceId(R.styleable.DropdownMenu_sd_emptyStateStyleOverlay, 0)
                if (emptyStateStyleOverlay != 0) {
                    themeOverlay = ContextThemeWrapper(themeOverlay, emptyStateStyleOverlay)
                }
            }
            return themeOverlay
        }

        fun Context.resolveStyle(attr: Int): Int {
            return TypedValue().run {
                theme.resolveAttribute(attr, this, true)
                data
            }
        }
    }
}
