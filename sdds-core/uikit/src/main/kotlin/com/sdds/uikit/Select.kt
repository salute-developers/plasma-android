package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.core.content.withStyledAttributes
import androidx.core.view.doOnLayout
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.SimpleSelectAdapter.SimpleSelectHolder
import com.sdds.uikit.dropdown.DropdownEmptyStateView
import com.sdds.uikit.dropdown.DropdownFooterView

/**
 * Компонент Select представляет триггер при нажатии которого появляется
 * всплывающее окно — выпадающий список элементов поверх контента.
 * В качестве триггера может быть [Button] или [TextField], в качестве
 * выпадающего списка - [DropdownMenu]
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 */
open class Select @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_selectStyle,
    defStyleRes: Int = R.style.Sdds_Components_Select,
) : FrameLayout(wrapper(context, attrs, defStyleAttr, defStyleRes), attrs) {

    private var trigger: View? = null
    private var _dropdown: DropdownMenu = DropdownMenu(this.context).apply {
        itemAdapter = SimpleSelectAdapter()
        inputMethodMode = PopupWindow.INPUT_METHOD_NEEDED
        isFocusable = true
        clipHeight = true
        itemListView.itemAnimator = null
        offset = 0
    }
    private var _dropdownPlacementMode = Popover.PLACEMENT_MODE_LOOSE

    init {
        clipChildren = false
        clipToPadding = false
        context.withStyledAttributes(attrs, R.styleable.Select, defStyleAttr, defStyleRes) {
        }
    }

    /**
     * Режим расположения [DropdownMenu]
     * @see Popover.PLACEMENT_MODE_STRICT
     * @see Popover.PLACEMENT_MODE_LOOSE
     */
    var dropdownPlacementMode: Int
        get() = _dropdownPlacementMode
        set(value) {
            if (_dropdownPlacementMode != value) {
                _dropdownPlacementMode = value
            }
        }

    /**
     * Адаптер для [ListView]
     */
    var adapter: ListAdapter<*, *>?
        get() = _dropdown.itemAdapter
        set(value) {
            _dropdown.itemAdapter = value
        }

    /**
     * Устанавливает нижний колонтитул (footer) для выпадающего меню.
     *
     * @param footer виджет, отображаемый внизу выпадающего меню; null удаляет его.
     */
    open fun setDropdownFooterView(footer: View?) {
        _dropdown.setFooter(footer)
    }

    /**
     * Устанавливает пользовательский экран пустого состояния для выпадающего меню.
     *
     * @param emptyStateView виджет, который будет отображаться, когда список подсказок пуст; null удаляет его.
     */
    open fun setDropdownEmptyStateView(emptyStateView: View?) {
        _dropdown.setEmptyStateView(emptyStateView)
    }

    /**
     * Возвращает текущий footer выпадающего меню.
     *
     * @return footer или null, если он не установлен.
     */
    open fun getFooterView(): View? = _dropdown.getFooterView()

    /**
     * Обновляет позицию выпадающего меню, если оно отображается.
     *
     * Полезно при изменениях компоновки, когда меню должно оставаться выровненным
     * относительно текстового поля.
     */
    open fun updateDropdownLocation() {
        if (_dropdown.isShowing) {
            _dropdown.updateLocationPoint()
        }
    }

    open fun setTrigger(view: View) {
        removeTrigger()
        trigger = view
        super.addView(trigger)
        tryToConfigureTrigger()
    }

    open fun removeTrigger() {
        if (trigger != null && trigger?.parent == this) removeView(trigger)
        trigger = null
    }

    /**
     * Устанавливает список элементов, которые должны отображаться в выпадающем меню.
     *
     * @param items список элементов-подсказок.
     */
    open fun setItems(items: List<ListItem>) {
        _dropdown.setItems<ListAdapter<ListItem, *>>(items)
        if (_dropdown.isShowing) _dropdown.updateLocationPoint()
    }

    private fun hideDropdown() {
        _dropdown.dismiss()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        hideDropdown()
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        when (child) {
            is DropdownFooterView -> setDropdownFooterView(child.setLayoutParamsIfNeed(params))
            is DropdownEmptyStateView -> setDropdownEmptyStateView(child.setLayoutParamsIfNeed(params))
            else -> {
                if (trigger == null && (child is TextField || child is Button)) {
                    trigger = child
                    tryToConfigureTrigger()
                }
                super.addView(child, index, params)
            }
        }
    }

    private fun showDropdown(trigger: View) {
        if (_dropdown.isShowing) {
            updateDropdownLocation()
            return
        }
        trigger.doOnLayout {
            _dropdown.setFixedWidth(trigger.measuredWidth)
            _dropdown.showWithTrigger(
                if (trigger is TextField) {
                    trigger.findViewById(R.id.sd_textFieldDecorationBox) ?: trigger
                } else { trigger },
                placement = Popover.PLACEMENT_BOTTOM,
                placementMode = _dropdownPlacementMode,
                tailEnabled = false,
            )
        }
    }

    private fun tryToConfigureTrigger() {
        trigger?.let { popoverTrigger ->
            popoverTrigger.setOnClickListener {
                if (_dropdown.isShowing) hideDropdown() else showDropdown(popoverTrigger)
            }
        }
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
            var buttonStyleOverlay = 0
            var textFieldStyleOverlay = 0
            var dropdownStyleOverlay = 0
            var selectItemStyleOverlay = 0
            context.withStyledAttributes(attrs, R.styleable.Select, defStyleAttr, defStyleRes) {
                buttonStyleOverlay = getResourceId(R.styleable.Select_sd_buttonStyleOverlay, 0)
                textFieldStyleOverlay = getResourceId(R.styleable.Select_sd_textFieldStyleOverlay, 0)
                dropdownStyleOverlay = getResourceId(R.styleable.Select_sd_dropdownMenuStyleOverlay, 0)
                selectItemStyleOverlay = getResourceId(R.styleable.Select_sd_selectItemStyleOverlay, 0)
            }
            val themeOverlay = createMergedOverlayContext(
                context,
                buttonStyleOverlay,
                textFieldStyleOverlay,
                dropdownStyleOverlay,
                selectItemStyleOverlay,
            )
            return themeOverlay
        }

        private fun createMergedOverlayContext(base: Context, vararg overlays: Int): Context {
            val validOverlays = overlays.filter { it != 0 }
            if (validOverlays.isEmpty()) return base
            val newTheme = base.resources.newTheme()
            newTheme.setTo(base.theme)
            validOverlays.forEach { newTheme.applyStyle(it, true) }
            return ContextThemeWrapper(base, newTheme)
        }
    }
}

/**
 * Простая реализация адаптера [ListViewAdapter] для [Select]
 */
class SimpleSelectAdapter : ListViewAdapter<ListItem, SimpleSelectHolder>(ListItemDiffCallback) {

    private var _selectionListener: SelectionListener? = null
    private var _lastSelectedItemPosition: Int = RecyclerView.NO_POSITION

    /**
     * Устанавливает слушатель выбора элементов [SelectionListener]
     */
    fun setSelectionListener(selectionListener: SelectionListener?) {
        _selectionListener = selectionListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleSelectHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sd_layout_simple_select_item, parent, false)
        return SimpleSelectHolder(itemView)
    }

    override fun onBindViewHolder(holder: SimpleSelectHolder, position: Int) {
        holder.bind(getItem(position))
    }

    /**
     * Слушатель выбора элемента в [SimpleListViewAdapter]
     */
    fun interface SelectionListener {

        /**
         * Колбэк выбора элемента [item]
         */
        fun onSelected(item: ListItem)
    }

    /**
     * Простой [SimpleSelectHolder]
     */
    inner class SimpleSelectHolder(itemView: View) : ListViewHolder(itemView) {

        private val titleView: TextView = itemView.findViewById(R.id.select_item_title)

        /**
         * Связывает [item] с [itemView]
         */
        fun bind(item: ListItem) = (itemView as SelectItem).apply {
            titleView.text = item.title
            disclosureEnabled = item.hasDisclosure
            item.colorState?.let { colorState = it }
            isSelected = adapterPosition == _lastSelectedItemPosition
            setOnClickListener {
                val oldItem = _lastSelectedItemPosition
                _lastSelectedItemPosition = adapterPosition
                if (oldItem != RecyclerView.NO_POSITION) notifyItemChanged(oldItem)
                notifyItemChanged(_lastSelectedItemPosition)
                _selectionListener?.onSelected(item)
            }
        }
    }

    private object ListItemDiffCallback : ItemCallback<ListItem>() {
        override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
            return oldItem.id == newItem.id
        }

        @Suppress("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
            return oldItem == newItem
        }
    }
}
