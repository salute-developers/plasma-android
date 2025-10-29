package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout.LayoutParams
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isVisible
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setBackgroundValueList

/**
 * Компонент ToolBar.
 * Группирует кнопки согласно заданному стилю.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
open class ToolBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_toolBarStyle,
    defStyleRes: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var backgroundList: ColorValueStateList? = null
    private val slots: MutableList<android.widget.LinearLayout> = mutableListOf()
    private var _slotsAmount: Int = 0
    private var _slotPadding: Int = 0
    private var dividerStyleOverlay: Int = 0
    private var _dividerMargin: Int = 0
    private var _hasDivider: Boolean = false
    private var initialized: Boolean = false

    /**
     * Количество слотов
     */
    open var slotsAmount: Int
        get() = _slotsAmount
        set(value) {
            if (_slotsAmount != value) {
                _slotsAmount = value
                updateSlotsCount()
            }
        }

    /**
     * Отступ разделителя от краев ToolBar
     * в горизонтальной ориентации marginTop и marginBottom
     * в вертикальной - marginStart и marginEnd
     */
    open var dividerMargin: Int
        get() = _dividerMargin
        set(value) {
            if (_dividerMargin != value) {
                _dividerMargin = value
                updateDividersParams()
            }
        }

    /**
     * Отображение разделителя
     */
    open var hasDivider: Boolean
        get() = _hasDivider
        set(value) {
            if (_hasDivider != value) {
                _hasDivider = value
                updateDividersVisibility()
            }
        }

    /**
     * Отступ между слотами
     */
    open var slotPadding: Int
        get() = _slotPadding
        set(value) {
            if (_slotPadding != value) {
                _slotPadding = value
                updateSlotParams()
            }
        }

    init {
        context.withStyledAttributes(attrs, R.styleable.ToolBar, defStyleAttr, defStyleRes) {
            dividerStyleOverlay = getResourceId(R.styleable.ToolBar_sd_dividerStyleOverlay, 0)
            backgroundList = getColorValueStateList(context, R.styleable.ToolBar_sd_background)
            _slotsAmount = getInteger(R.styleable.ToolBar_sd_slotsAmount, 0)
            _slotPadding = getDimensionPixelSize(R.styleable.ToolBar_sd_slotPadding, 0)
            _dividerMargin = getDimensionPixelSize(R.styleable.ToolBar_sd_dividerMargin, 0)
            _hasDivider = getBoolean(R.styleable.ToolBar_sd_hasDivider, false)
            orientation = getInt(R.styleable.ToolBar_android_orientation, 0)
            initialized = true
        }
        initSlots()
        initToolBar()
        updateSlotParams()
    }

    /**
     * Добавляет [view] в слот по указанному индексу [slotIndex]
     */
    open fun addViewToSlot(slotIndex: Int, view: View?) {
        if (checkSlotIndex(slotIndex)) {
            slots[slotIndex].addView(view)
        }
    }

    /**
     * Добавляет view, возвращаемую лябдой [builder] в слот по указанному индексу [slotIndex]
     */
    open fun addViewToSlot(slotIndex: Int, builder: () -> View) {
        addViewToSlot(slotIndex, builder())
    }

    /**
     * Добавляет несколько [views] в слот по указанному индексу [slotIndex]
     */
    open fun addViewsToSlot(slotIndex: Int, views: List<View?>) {
        if (checkSlotIndex(slotIndex)) {
            views.forEach { view -> slots[slotIndex].addView(view) }
        }
    }

    /**
     * Возвращает все views в слоте по указанному индексу [slotIndex]
     */
    open fun getSlotViews(slotIndex: Int): List<View> {
        return if (checkSlotIndex(slotIndex)) {
            slots[slotIndex].children.toList()
        } else {
            emptyList()
        }
    }

    /**
     * Удаляет все views из слота по указанному индексу [slotIndex]
     */
    open fun removeSlotViews(slotIndex: Int) {
        if (checkSlotIndex(slotIndex)) {
            slots[slotIndex].removeAllViews()
        }
    }

    /**
     * Удаляет все views из всех слотов
     */
    open fun clearSlots() {
        slots.forEach { slot ->
            slot.removeAllViews()
        }
    }

    /**
     * Параметры для добавления дочерних [View] в [ToolBar]
     */
    class LayoutParams : android.widget.LinearLayout.LayoutParams {

        /**
         * Индекс слота, в который [View] будет добавлена
         */
        var slotIndex: Int = -1

        constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
            context.withStyledAttributes(attrs, R.styleable.ToolBar_Layout) {
                slotIndex = getInt(R.styleable.ToolBar_Layout_sd_slotIndex, -1)
            }
        }
        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: ViewGroup.LayoutParams) : super(source) {
            if (source is LayoutParams) {
                this.slotIndex = source.slotIndex
            }
        }
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return LayoutParams(context, attrs)
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean {
        return p is LayoutParams
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams): LayoutParams {
        return LayoutParams(p)
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        setBackgroundValueList(backgroundList)
    }

    override fun setOrientation(orientation: Int) {
        super.setOrientation(orientation)
        updateGravity()
        if (!initialized) return
        updateDividersParams()
        if (slots.isNotEmpty()) {
            slots.forEach { it.orientation = orientation }
        }
        updateSlotParams()
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child is Divider || child in slots) {
            super.addView(child, index, params)
            return
        }
        val lp = (params as? LayoutParams) ?: generateDefaultLayoutParams()
        val slotIndex = lp.slotIndex.takeIf { it in slots.indices } ?: 0
        addViewToSlot(slotIndex, child)
    }

    private fun initSlots() {
        slots.clear()
        repeat(slotsAmount) {
            slots.add(createSlot())
        }
    }

    private fun createSlot() = android.widget.LinearLayout(context).apply {
        layoutParams = LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        orientation = this@ToolBar.orientation
    }

    private fun updateSlotsCount() {
        if (slotsAmount < slots.size) {
            for (index in slots.lastIndex downTo slotsAmount) {
                removeView(slots[index])
                slots.removeAt(index)
            }
        } else {
            repeat(slotsAmount - slots.size) {
                slots.add(createSlot())
            }
        }
        initToolBar()
        updateSlotParams()
    }

    private fun checkSlotIndex(slotIndex: Int) = slotIndex in slots.indices

    private fun initToolBar() {
        removeAllViews()
        slots.forEachIndexed { index, slot ->
            addView(slot)
            if (index < slots.lastIndex) {
                val dividerLP = createDividerLayoutParams()
                addView(createDivider(), dividerLP)
            }
        }
    }

    private fun createDivider(): Divider {
        return Divider(ContextThemeWrapper(context, dividerStyleOverlay)).apply {
            isVisible = hasDivider
            orientation = if (this@ToolBar.orientation == HORIZONTAL) {
                VERTICAL
            } else {
                HORIZONTAL
            }
        }
    }

    private fun createDividerLayoutParams(): LayoutParams {
        return if (this@ToolBar.orientation == HORIZONTAL) {
            LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            ).apply { setMargins(0, dividerMargin, 0, dividerMargin) }
        } else {
            LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            ).apply { setMargins(dividerMargin, 0, dividerMargin, 0) }
        }
    }

    private fun updateDividersVisibility() {
        for (child in children) {
            if (child is Divider) {
                child.isVisible = hasDivider
            }
        }
    }

    private fun updateDividersParams() {
        children.forEach { child ->
            if (child is Divider) {
                val lp = createDividerLayoutParams()
                child.layoutParams = lp
                child.orientation = if (this@ToolBar.orientation == HORIZONTAL) VERTICAL else HORIZONTAL
            }
        }
    }

    private fun updateSlotParams() {
        if (slots.size == 1) {
            slots.first().setPaddingRelative(0, 0, 0, 0)
            return
        }
        slots.forEachIndexed { index, slot ->
            when (index) {
                0 -> {
                    if (slot.orientation == HORIZONTAL) {
                        slot.setPaddingRelative(0, 0, slotPadding, 0)
                    } else {
                        slot.setPaddingRelative(0, 0, 0, slotPadding)
                    }
                }

                slots.lastIndex -> {
                    if (slot.orientation == HORIZONTAL) {
                        slot.setPaddingRelative(slotPadding, 0, 0, 0)
                    } else {
                        slot.setPaddingRelative(0, slotPadding, 0, 0)
                    }
                }

                else -> {
                    if (slot.orientation == HORIZONTAL) {
                        slot.setPaddingRelative(slotPadding, 0, slotPadding, 0)
                    } else {
                        slot.setPaddingRelative(0, slotPadding, 0, slotPadding)
                    }
                }
            }
        }
    }

    private fun updateGravity() {
        gravity = if (this@ToolBar.orientation == HORIZONTAL) {
            Gravity.CENTER_VERTICAL
        } else {
            Gravity.CENTER_HORIZONTAL
        }
    }
}
