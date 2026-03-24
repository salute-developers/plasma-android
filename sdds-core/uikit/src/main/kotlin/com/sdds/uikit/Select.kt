package com.sdds.uikit

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import android.util.TypedValue
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.doOnLayout
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import com.sdds.uikit.Select.SelectionMode
import com.sdds.uikit.SimpleSelectAdapterSingle.SimpleSelectHolder
import com.sdds.uikit.dropdown.DropdownEmptyStateView
import com.sdds.uikit.dropdown.DropdownFooterView
import com.sdds.uikit.internal.base.unsafeLazy

/**
 * Компонент Select представляет триггер, при нажатии на который, появляется
 * всплывающее окно — выпадающий список элементов поверх контента.
 * Если в качестве триггера устанавливается [Button] или [TextField] - они будут
 * автоматически стилизованы (при использовании готовых стилей дизайн системы или
 * при верно настроенном стиле Select). В качестве выпадающего списка используется
 * компонент [DropdownMenu], который так же автоматически стилизуется.
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

    @DrawableRes
    private var triggerOpenStateIcon: Int = 0

    @DrawableRes
    private var triggerClosedStateIcon: Int = 0

    private var trigger: View? = null

    private val controller = SelectController()

    private var stateChangeListener: OnStateChangeListener? = null
    private var itemSelectedListener: OnItemSelectedListener? = null

    private val _dropdown: DropdownMenu by unsafeLazy {
        DropdownMenu(this.context).apply {
            itemAdapter = SimpleSelectAdapterSingle().apply {
                onItemClick = { item ->
                    itemSelectedListener?.onItemSelected(item)
                }
            }
            isFocusable = true
            clipHeight = true
            itemListView.itemAnimator = null
            offset = 0
        }
    }
    private var _dropdownPlacementMode = Popover.PLACEMENT_MODE_LOOSE

    init {
        clipChildren = false
        clipToPadding = false
        context.withStyledAttributes(attrs, R.styleable.Select, defStyleAttr, defStyleRes) {
        }
        _dropdown.setOnDismissListener {
            controller.close()
            notifyStateChanged()
        }
    }

    /**
     * Режим расположения [DropdownMenu].
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
     * Адаптер для [ListView].
     */
    var adapter: SelectAdapter<*, *>?
        get() = _dropdown.itemAdapter as? SelectAdapter
        set(value) {
            _dropdown.itemAdapter = value
        }

    /**
     * Включает/выключает отображение пустого состояния
     */
    var emptyStateEnabled: Boolean
        get() = _dropdown.emptyStateEnabled
        set(value) {
            _dropdown.emptyStateEnabled = value
        }

    /**
     * Состояние выпадающего меню в [Select].
     */
    enum class SelectMenuState {
        /**
         * Выпадающее меню отображается.
         */
        OPENED,

        /**
         * Выпадающее меню скрыто.
         */
        CLOSED,
    }

    /**
     * Устанавливает [Select] в режим "Только для чтения"
     */
    open var isReadOnly: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                updateReadOnlyState()
            }
        }

    /**
     * Режим работы адаптера выпадающего меню.
     */
    enum class SelectionMode {
        /**
         * Максимум один элемент может быть выбран из списка выпадающего меню.
         */
        SINGLE,

        /**
         * Количество выбранных элементов списка выпадающего меню не ограничено.
         */
        MULTIPLE,
    }

    /**
     * Слушатель изменения состояния выпадающего меню в [Select] -
     * отображается или скрыто.
     */
    fun interface OnStateChangeListener {

        /**
         * Колбэк изменения состояния.
         * @param state текущее состояние.
         */
        fun onStateChange(state: SelectMenuState)
    }

    /**
     * Устанавливает слушателя изменения состояния выпадающего меню в [Select].
     * @param listener - слушатель.
     */
    fun setOnStateChangeListener(listener: OnStateChangeListener?) {
        stateChangeListener = listener
    }

    /**
     * Слушатель выбора элемента списка выпадающего меню.
     */
    fun interface OnItemSelectedListener {

        /**
         * Колбэк выбора элемента списка выпадающего меню.
         * @param item элемент списка.
         */
        fun onItemSelected(item: ListItem)
    }

    /**
     * Устанавливает слушателя выбора элемента в выпадающем меню.
     * @param listener - слушатель.
     */
    fun setOnItemSelectedListener(listener: OnItemSelectedListener?) {
        itemSelectedListener = listener
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
     * Возвращает текущий экран пустого состояния выпадающего меню.
     *
     * @return виджет пустого состояния или null, если он не установлен.
     */
    open fun getEmptyStateView(): View? = _dropdown.getEmptyStateView()

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

    /**
     * Устанавливает новый триггер для выпадающего меню.
     */
    open fun setTrigger(view: View) {
        removeTrigger()
        trigger = view
        super.addView(trigger)
        tryToConfigureTrigger()
    }

    /**
     * Возвращает [View], установленную как триггер для выпадающего меню.
     */
    open fun getTrigger(): View? {
        return trigger
    }

    /**
     * Удаляет триггер для [DropdownMenu]
     */
    open fun removeTrigger() {
        if (trigger != null && trigger?.parent == this) removeView(trigger)
        trigger = null
    }

    /**
     * Устанавливает список элементов, которые должны отображаться в выпадающем меню.
     * @param items список элементов.
     */
    open fun setItems(items: List<ListItem>) {
        _dropdown.setItems<ListAdapter<ListItem, *>>(items)
        if (_dropdown.isShowing) _dropdown.updateLocationPoint()
    }

    /**
     * Очищает список элементов выпадающем меню.
     */
    open fun clearItems() {
        _dropdown.setItems<ListAdapter<ListItem, *>>(listOf())
    }

    /**
     * Устанавливает иконку отображающую состояние "Открыто" выпадающего меню.
     * @param openStateIcon идентификатор ресурса иконки.
     */
    open fun setTriggerOpenStateIcon(@DrawableRes openStateIcon: Int) {
        if (triggerOpenStateIcon != openStateIcon) {
            triggerOpenStateIcon = openStateIcon
            trigger?.let { tryToConfigureTriggerUi(it) }
        }
    }

    /**
     * Устанавливает иконку отображающую состояние "Скрыто" выпадающего меню.
     * @param closedStateIcon идентификатор ресурса иконки.
     */
    open fun setTriggerClosedStateIcon(@DrawableRes closedStateIcon: Int) {
        if (triggerClosedStateIcon != closedStateIcon) {
            triggerClosedStateIcon = closedStateIcon
            trigger?.let { tryToConfigureTriggerUi(it) }
        }
    }

    /**
     * Возвращает список выбранных элементов [ListItem] выпадающего меню.
     */
    fun getSelectedItems() = adapter?.getSelectedItems()

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        trigger?.let {
            it.isEnabled = enabled
        }
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

    private fun hideDropdown() {
        if (_dropdown.isShowing) {
            _dropdown.dismiss()
        }
    }

    private fun showDropdown(trigger: View) {
        if (!checkIsShowingAndCanShow()) return
        if (shouldShowDropdown()) {
            trigger.doOnLayout {
                _dropdown.setFixedWidth(trigger.measuredWidth)
                _dropdown.showWithTrigger(
                    if (trigger is TextField) {
                        trigger.findViewById(R.id.sd_textFieldDecorationBox) ?: trigger
                    } else {
                        trigger
                    },
                    placement = Popover.PLACEMENT_BOTTOM,
                    placementMode = _dropdownPlacementMode,
                    tailEnabled = false,
                )
            }
            notifyStateChanged()
        }
    }

    private fun checkIsShowingAndCanShow(): Boolean {
        var canShow = false
        if (_dropdown.isShowing) {
            if (isEnabled && !isReadOnly) {
                updateDropdownLocation()
            } else {
                _dropdown.dismiss()
            }
        } else {
            canShow = true
        }
        return canShow
    }

    private fun updateReadOnlyState() {
        checkIsShowingAndCanShow()
        tryToConfigureTrigger()
    }

    private fun tryToConfigureTrigger() {
        trigger?.let { popoverTrigger ->
            val clickListener = if (!isReadOnly) {
                {
                    controller.toggle()
                    when (controller.state) {
                        SelectMenuState.OPENED -> showDropdown(popoverTrigger)
                        SelectMenuState.CLOSED -> hideDropdown()
                    }
                }
            } else {
                null
            }
            popoverTrigger.setOnClickListener {
                clickListener?.invoke()
            }
            configureIfTriggerIsTextField(popoverTrigger, clickListener)
            tryToConfigureTriggerUi(popoverTrigger)
        }
    }

    private fun configureIfTriggerIsTextField(popoverTrigger: View, clickListener: (() -> Unit)?) {
        val textField = (popoverTrigger as? TextField) ?: return
        textField.editText.apply {
            if (!isReadOnly) {
                inputType = InputType.TYPE_NULL
                showSoftInputOnFocus = false
                keyListener = null
                isLongClickable = false
            }
        }
        textField.isReadOnly = this.isReadOnly
        textField.setInteractiveNoEditable(
            !isReadOnly,
            clickListener,
        )
    }

    private fun tryToConfigureTriggerUi(trigger: View) {
        when (trigger) {
            is Button -> configureButtonTrigger(trigger)
            is TextField -> configureTextFieldTrigger(trigger)
            else -> {}
        }
    }

    private fun configureButtonTrigger(trigger: View) {
        (trigger as? Button)?.let { button ->
            if (controller.state == SelectMenuState.CLOSED && triggerClosedStateIcon != 0) {
                button.setIconResource(triggerClosedStateIcon)
            }
            if (controller.state == SelectMenuState.OPENED && triggerOpenStateIcon != 0) {
                button.setIconResource(triggerOpenStateIcon)
            }
        }
    }

    private fun configureTextFieldTrigger(trigger: View) {
        (trigger as? TextField)?.let { textField ->
            if (controller.state == SelectMenuState.CLOSED && triggerClosedStateIcon != 0) {
                textField.setAction(triggerClosedStateIcon)
            }
            if (controller.state == SelectMenuState.OPENED && triggerOpenStateIcon != 0) {
                textField.setAction(triggerOpenStateIcon)
            }
        }
    }

    private fun notifyStateChanged() {
        stateChangeListener?.onStateChange(controller.state)
        trigger?.let { tryToConfigureTriggerUi(it) }
    }

    private fun shouldShowDropdown(): Boolean {
        val itemCount = _dropdown.itemAdapter?.itemCount ?: 0
        val strict = isReadOnly || !isEnabled
        val existingUi =
            itemCount > 0 || (getEmptyStateView() != null && emptyStateEnabled) || (getFooterView() != null)
        return !strict && existingUi
    }

    private class SelectController {
        var state: SelectMenuState = SelectMenuState.CLOSED
            private set

        fun open() {
            state = SelectMenuState.OPENED
        }

        fun close() {
            state = SelectMenuState.CLOSED
        }

        fun toggle() {
            state = if (state == SelectMenuState.OPENED) {
                SelectMenuState.CLOSED
            } else {
                SelectMenuState.OPENED
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

        fun createMergedOverlayContext(base: Context, vararg overlays: Int): Context {
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
 * Базовый адаптер для [Select]
 * @param diffCallback для вычисления разницы между двумя не null элементами в списке [ItemCallback]
 * @param selectionMode режим работы адаптера
 * @see SelectionMode
 */
abstract class SelectAdapter<T : ListItem, VH : ListViewHolder>(
    diffCallback: ItemCallback<T> = DefaultSelectItemDiffCallback(),
    var selectionMode: SelectionMode = SelectionMode.SINGLE,
) : ListViewAdapter<T, VH>(diffCallback) {

    private val selectedItems = mutableSetOf<Long>()

    /**
     * Проверяет выбран ли указанный элемент списка
     */
    fun isSelected(item: T): Boolean = selectedItems.contains(item.id)

    /**
     * Возвращает все выбранные элементы списка
     */
    fun getSelectedItems(): List<T> {
        return currentList.filter { isSelected(it) }
    }

    /**
     * Коллбэк при выборе элемента списка
     */
    var onItemClick: ((item: T) -> Unit)? = null

    /**
     * Устанавливает или снимает выбор с элемента при повторном нажатии,
     * учитывая режим работы адаптера [selectionMode]
     */
    fun toggleSelection(item: T) {
        if (isSelected(item)) {
            itemWasSelected(item)
            onItemClick?.invoke(item)
            return
        }
        if (selectionMode == SelectionMode.SINGLE) {
            notifyInSingleMode(item)
        } else {
            notifyInMultipleMode(item)
        }
        onItemClick?.invoke(item)
    }

    /**
     * Устанавливает выбор на всех элементах, если режим работы адаптера [SelectionMode.MULTIPLE]
     */
    fun selectAll() {
        if (selectionMode != SelectionMode.MULTIPLE) return
        currentList.forEachIndexed { index, item ->
            if (!isSelected(item)) {
                selectedItems.add(item.id)
                notifyItemChanged(index)
            }
        }
    }

    /**
     * Снимает выбор со всех элементов списка
     */
    fun clearAllSelected() {
        val oldSelected = selectedItems.toList()
        selectedItems.clear()
        oldSelected.forEach { id ->
            val pos = currentList.indexOfFirst { it.id == id }
            if (pos != -1) notifyItemChanged(pos)
        }
    }

    /**
     * Устанавливает выбор на указанном элементе
     * учитывая режим работы адаптера [selectionMode]
     */
    fun selectItem(item: T) {
        if (isSelected(item)) return
        if (selectionMode == SelectionMode.SINGLE) {
            notifyInSingleMode(item)
        } else {
            notifyInMultipleMode(item)
        }
    }

    /**
     * Устанавливает выбор на указанных элементах, если режим работы адаптера [SelectionMode.MULTIPLE]
     */
    fun selectItems(items: List<T>) {
        if (items.count() > 1 && selectionMode != SelectionMode.MULTIPLE) return
        val changedPositions = mutableSetOf<Int>()
        items.forEach { item ->
            val pos = getItemPosition(item)
            if (pos != -1 && !isSelected(item)) {
                selectedItems.add(item.id)
                changedPositions.add(pos)
            }
        }
        changedPositions.forEach { notifyItemChanged(it) }
    }

    private fun getItemPosition(item: T) = currentList.indexOfFirst { it.id == item.id }

    private fun itemWasSelected(item: T) {
        selectedItems.remove(item.id)
        val newPos = getItemPosition(item)
        if (newPos != -1) notifyItemChanged(newPos)
    }

    private fun notifyInSingleMode(item: T) {
        val newSelectedPos = getItemPosition(item)
        val oldSelectedId = selectedItems.firstOrNull()
        oldSelectedId?.let { oldId ->
            val oldPos = currentList.indexOfFirst { it.id == oldId }
            if (oldPos != -1) notifyItemChanged(oldPos)
        }
        selectedItems.clear()
        selectedItems.add(item.id)
        if (newSelectedPos != -1) notifyItemChanged(newSelectedPos)
    }

    private fun notifyInMultipleMode(item: T) {
        selectedItems.add(item.id)
        val newSelectedPos = getItemPosition(item)
        if (newSelectedPos != -1) notifyItemChanged(newSelectedPos)
    }

    private class DefaultSelectItemDiffCallback<T : ListItem> : ItemCallback<T>() {
        override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
            return oldItem.id == newItem.id
        }

        @Suppress("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
            return oldItem == newItem
        }
    }
}

/**
 * Простая реализация адаптера [SelectAdapter] для [Select]
 */
class SimpleSelectAdapterSingle : SelectAdapter<ListItem, SimpleSelectHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleSelectHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sd_layout_simple_select_item, parent, false)
        return SimpleSelectHolder(itemView)
    }

    override fun onBindViewHolder(holder: SimpleSelectHolder, position: Int) {
        holder.bind(getItem(position))
    }

    /**
     * Простой [SimpleSelectHolder]
     */
    inner class SimpleSelectHolder(itemView: View) : ListViewHolder(itemView) {

        private val titleView: TextView = itemView.findViewById(R.id.select_item_title)

        /**
         * Связывает [item] с [itemView]
         */
        fun bind(item: ListItem) = (itemView as SelectItemView).apply {
            titleView.text = item.title
            disclosureEnabled = item.hasDisclosure
            item.colorState?.let { colorState = it }
            isChecked = this@SimpleSelectAdapterSingle.isSelected(item)
            setOnClickListener {
                toggleSelection(item)
            }
        }
    }
}
