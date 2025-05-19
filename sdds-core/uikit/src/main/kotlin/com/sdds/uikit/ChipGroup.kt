package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Checkable
import androidx.core.view.children
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Компонент для группировки нескольких [Chip].
 * Поддерживает изменение вертикальных и горизонтальных отступов между дочерними элементами.
 * Если компоненту задана неограниченная ширина, то дочерние элементы будут располагаться друг за другом в одну строку.
 * Если ширина ограничена, то не вместившиеся дочерние элементы будут перенесены на следующие строки.
 * Компоненту также можно задать [gravity] - выравнивание дочерних элементов относительно размеров строки, в которой они
 * находятся.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 29.08.2024
 */
open class ChipGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_chipGroupStyle,
    defStyleRes: Int = R.style.Sdds_Components_ChipGroup,
) : FlowLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
),
    ViewStateHolder,
    ColorStateHolder {

    private var _protectFromCheckedChange: Boolean = false
    private val _passThroughListener: PassThroughHierarchyChangeListener =
        PassThroughHierarchyChangeListener()
    private var _childOnCheckedChangeListener: Chip.OnCheckedChangeListener = CheckedStateTracker()
    private var _selectionMode: SelectionMode = SelectionMode.None
    private var _onCheckedChangeListener: OnCheckedChangeListener? = null
    private var _checkedItems = mutableMapOf<Int, ViewState?>()
    private var _checkedItemsColorState = mutableMapOf<Int, ColorState?>()
    private var _adapter: Adapter? = null
    private var _chipPool: Array<Chip?>? = null

    /**
     * Слушатель изменений состояния [Chip.isChecked]
     */
    fun interface OnCheckedChangeListener {

        /**
         * Колбэк изменений состояния [isChecked]
         */
        fun onCheckedChanged(chipGroup: ChipGroup, chip: Chip, isChecked: Boolean)
    }

    /**
     * Режим выбора дочерних [Chip].
     */
    enum class SelectionMode {
        /**
         * Выбор отключен
         */
        None,

        /**
         * Можно выбрать только один [Chip] в группе
         */
        Single,

        /**
         * Можно выбрать несколько [Chip] в группе
         */
        Multiple,
    }

    /**
     * Режим выбора дочерних [Chip].
     * @see SelectionMode
     */
    var selectionMode: SelectionMode
        get() = _selectionMode
        set(value) {
            if (_selectionMode != value) {
                _selectionMode = value
                if (selectionMode == SelectionMode.None) {
                    children.forEach { view ->
                        if (view is Checkable && view.isChecked) {
                            view.isChecked = false
                        }
                    }
                }
            }
        }

    /**
     * Адаптер для связывания пользовательских данных и компонентов [Chip]
     */
    var adapter: Adapter?
        get() = _adapter
        set(value) {
            if (_adapter != value) {
                if (value != null) {
                    _adapter = value
                    _adapter?.attachChipGroup(this)
                } else {
                    _adapter?.detachChipGroup()
                    _adapter = null
                }
                repopulate()
            }
        }

    init {
        @Suppress("LeakingThis")
        ShapeHelper(this, attrs, defStyleAttr, defStyleRes)
        super.setOnHierarchyChangeListener(_passThroughListener)
    }

    /**
     * Указывает [ViewState] для [Chip] в состоянии [Chip.isChecked] == true.
     * @see ViewState
     */
    @Deprecated("Использовать ChipGroup.colorState")
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
            }
        }

    /**
     * Указывает [ColorState] для [Chip] в состоянии [Chip.isChecked] == true.
     * @see ColorState
     */
    override var colorState: ColorState? =
        ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
            }
        }

    /**
     * Устанавливает слушатель изменения состояний [Chip.isChecked] в группе
     */
    open fun setOnCheckedChangeListener(listener: OnCheckedChangeListener) {
        _onCheckedChangeListener = listener
    }

    override fun setOnHierarchyChangeListener(listener: OnHierarchyChangeListener?) {
        _passThroughListener.onHierarchyChangeListener = listener
    }

    override fun getAccessibilityClassName(): CharSequence {
        return ChipGroup::class.java.name
    }

    internal open fun repopulate() {
        val adapter = this.adapter ?: return
        children.forEach { if (it is Chip) adapter.onUnbindChip(it) }
        this.removeAllViews()
        val itemsCount = adapter.getCount()
        if (!adapter.isAttached || itemsCount == 0) {
            _chipPool = null
            return
        }
        val pool = getPool(itemsCount)
        for (index in 0 until itemsCount) {
            val chipView = pool.getOrNull(index)
                ?: adapter.onCreateChipView(index, context)
                    .also { pool[index] = it }
            addView(chipView)
            adapter.onBindChip(chipView, index)
        }
    }

    private fun getPool(useCount: Int): Array<Chip?> {
        var pool = _chipPool ?: Array<Chip?>(useCount) { null }

        if (pool.size - useCount > pool.size / 2) {
            pool = pool.sliceArray(0 until useCount)
        } else if (pool.size < useCount) {
            pool = Array(useCount) { pool.getOrNull(it) }
        }

        _chipPool = pool
        return pool
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _chipPool = null
    }

    /**
     * Адаптер для установки данных в [ChipGroup]
     */
    abstract class Adapter {

        private var chipGroup: ChipGroup? = null

        /**
         * Возвращает true, если [Adapter] прикреплен к [ChipGroup]
         */
        val isAttached: Boolean get() = chipGroup != null

        /**
         * Возвращает кол-во элементов в [ChipGroup]
         */
        abstract fun getCount(): Int

        /**
         * Создает [Chip] для текущей позиции [position] в [ChipGroup].
         * Можно переопределить, чтобы создать свой экземпляр [Chip].
         * @param position порядковый номер элемента [Chip] в [ChipGroup]
         * @param context контекст
         */
        open fun onCreateChipView(position: Int, context: Context): Chip {
            return Chip(context)
        }

        /**
         * Связывает пользовательские данные с [Chip], имеющий порядковый номер [position].
         * @param chipView экземпляр компонента [Chip]
         * @param position порядковый номер элемента [Chip] в [ChipGroup]
         */
        abstract fun onBindChip(chipView: Chip, position: Int)

        /**
         * Связывает пользовательские данные с [Chip], имеющий порядковый номер [position].
         * @param chipView экземпляр компонента [Chip]
         */
        open fun onUnbindChip(chipView: Chip) = Unit

        /**
         * Колбэк связывания [Adapter] с [ChipGroup]
         */
        open fun onAttachChipGroup(chipGroup: ChipGroup) = Unit

        /**
         * Колбэк отвязывания [Adapter] от [ChipGroup]
         */
        open fun onDetachChipGroup(chipGroup: ChipGroup) = Unit

        /**
         * Уведомляет [ChipGroup] об изменении данных
         */
        fun notifyChipGroupChanged() {
            chipGroup?.repopulate()
        }

        internal fun attachChipGroup(chipGroup: ChipGroup) {
            if (this.chipGroup != chipGroup) {
                this.chipGroup = chipGroup
                onAttachChipGroup(chipGroup)
            }
        }

        internal fun detachChipGroup() {
            this.chipGroup?.let(::onDetachChipGroup)
            this.chipGroup = null
        }
    }

    private inner class CheckedStateTracker : Chip.OnCheckedChangeListener {

        override fun onCheckedChanged(chip: Chip, isChecked: Boolean) {
            if (_protectFromCheckedChange || selectionMode == SelectionMode.None) return

            _protectFromCheckedChange = true
            if (selectionMode == SelectionMode.Single && isChecked) {
                _checkedItems.forEach { (checkedId, originalState) ->
                    if (checkedId == chip.id) return@forEach
                    findViewById<Chip>(checkedId)?.apply {
                        this.isChecked = false
                        this.state = originalState
                        _onCheckedChangeListener?.onCheckedChanged(this@ChipGroup, this, false)
                    }
                }
                _checkedItemsColorState.forEach { (checkedId, originalState) ->
                    if (checkedId == chip.id) return@forEach
                    findViewById<Chip>(checkedId)?.apply {
                        this.isChecked = false
                        this.colorState = originalState
                        _onCheckedChangeListener?.onCheckedChanged(this@ChipGroup, this, false)
                    }
                }
            }
            _protectFromCheckedChange = false

            if (isChecked) {
                _checkedItems[chip.id] = chip.state
                chip.state = state

                _checkedItemsColorState[chip.id] = chip.colorState
                colorState.takeIf { it != ColorState.Undefined }?.let { chip.colorState = it }
            } else {
                chip.state = _checkedItems[chip.id]
                _checkedItems.remove(chip.id)

                chip.colorState = _checkedItemsColorState[chip.id]
                _checkedItemsColorState.remove(chip.id)
            }
            _onCheckedChangeListener?.onCheckedChanged(this@ChipGroup, chip, isChecked)
        }
    }

    private inner class PassThroughHierarchyChangeListener : OnHierarchyChangeListener {

        var onHierarchyChangeListener: OnHierarchyChangeListener? = null

        override fun onChildViewAdded(parent: View?, child: View?) {
            if (parent == this@ChipGroup && child is Chip) {
                if (child.id == View.NO_ID) {
                    child.id = View.generateViewId()
                }
                child.setOnCheckedChangedListener(_childOnCheckedChangeListener)
            }
            onHierarchyChangeListener?.onChildViewAdded(parent, child)
        }

        override fun onChildViewRemoved(parent: View?, child: View?) {
            if (parent == this@ChipGroup && child is Chip) {
                child.setOnCheckedChangedListener(null)
            }
            onHierarchyChangeListener?.onChildViewRemoved(parent, child)
        }
    }

    companion object {
        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            val typedArray =
                context.obtainStyledAttributes(
                    attrs,
                    R.styleable.ChipGroup,
                    defStyleAttr,
                    defStyleRes,
                )
            val chipStyleOverlay =
                typedArray.getResourceId(R.styleable.ChipGroup_sd_chipStyleOverlay, 0)
            val themeOverlay =
                if (chipStyleOverlay != 0) {
                    ContextThemeWrapper(context, chipStyleOverlay)
                } else {
                    context
                }
            typedArray.recycle()
            return themeOverlay
        }
    }
}
