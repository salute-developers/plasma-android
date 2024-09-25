package com.sdds.uikit

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewDebug
import android.view.ViewGroup
import android.widget.Checkable
import androidx.core.view.children
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
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes), ViewStateHolder {

    private var _protectFromCheckedChange: Boolean = false
    private val _passThroughListener: PassThroughHierarchyChangeListener = PassThroughHierarchyChangeListener()
    private val _rowManager: RowManager
    private var _horizontalSpacing: Int
    private var _verticalSpacing: Int
    private var _gravity: Int
    private var _childOnCheckedChangeListener: Chip.OnCheckedChangeListener = CheckedStateTracker()
    private var _selectionMode: SelectionMode = SelectionMode.None
    private var _onCheckedChangeListener: OnCheckedChangeListener? = null
    private var _checkedItems = mutableMapOf<Int, ViewState?>()

    /**
     * Слушатель изменений состояния [isChecked]
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
     * Выравнивание дочерних элементов относительно строки, в которой они находятся.
     * @see Gravity
     */
    var gravity: Int
        get() = _gravity
        set(value) {
            if (_gravity != value) {
                _gravity = value
                requestLayout()
            }
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

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ChipGroup, defStyleAttr, defStyleRes)
        _horizontalSpacing = typedArray.getDimensionPixelSize(R.styleable.ChipGroup_sd_gap, 0)
        _verticalSpacing = typedArray.getDimensionPixelSize(R.styleable.ChipGroup_sd_lineSpacing, 0)
        _gravity = typedArray.getInt(R.styleable.ChipGroup_android_gravity, Gravity.TOP or Gravity.START)
        _rowManager = RowManager(_horizontalSpacing, _verticalSpacing)
        typedArray.recycle()
        @Suppress("LeakingThis")
        ShapeHelper(this, attrs, defStyleAttr, defStyleRes)
        super.setOnHierarchyChangeListener(_passThroughListener)
    }

    /**
     * Указывает [ViewState] для [Chip] в состоянии [Chip.isChecked] == true.
     * @see ViewState
     */
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr, defStyleRes)
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

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val maxRowWidth = if (widthMode != MeasureSpec.UNSPECIFIED) {
            specWidth - paddingStart - paddingEnd
        } else {
            INFINITE_SIZE
        }

        var totalWidth = 0
        var totalHeight = paddingTop + paddingBottom

        _rowManager.reset()
        _rowManager.offsetBounds(paddingStart, paddingTop)

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            measureChild(child, widthMeasureSpec, heightMeasureSpec)
            // Если строка не может вместить еще одного ребенка
            if (!_rowManager.canHold(child, maxRowWidth)) {
                // То обновляем ширину контейнера, если она меньше, чем размер текущей строки
                totalWidth = maxOf(totalWidth, _rowManager.width)
                // Увеличиваем высоту контейнера на высоту текущей строки
                totalHeight += _rowManager.height + _verticalSpacing
                // И переходим на следующую строку
                _rowManager.next()
            }
            // Увеличивает границы текущей строки на ширину и высоту текущего ребенка
            _rowManager.updateBounds(child, _gravity, maxRowWidth)
        }

        // Не забываем про последнюю строку
        totalWidth = maxOf(totalWidth, _rowManager.width) + paddingStart + paddingEnd
        totalHeight += _rowManager.height

        // Выбираем конечные размеры согласно требованиям родителя
        val desiredWidth = when (widthMode) {
            MeasureSpec.EXACTLY -> specWidth
            MeasureSpec.AT_MOST -> minOf(totalWidth, specWidth)
            else -> totalWidth
        }
        val desiredHeight = when (heightMode) {
            MeasureSpec.EXACTLY -> specHeight
            MeasureSpec.AT_MOST -> minOf(totalHeight, specHeight)
            else -> totalHeight
        }
        setMeasuredDimension(desiredWidth, desiredHeight)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val availableWidth = measuredWidth - paddingStart - paddingEnd

        _rowManager.reset()
        _rowManager.offsetBounds(paddingStart, paddingTop)

        for (index in 0 until childCount) {
            val child = getChildAt(index)

            // Если строка не может вместить еще одного ребенка
            if (!_rowManager.canHold(child, availableWidth)) {
                // То размещаем всех текущих детей в строке и обновляем позицию
                _rowManager.layout(_gravity)
                _rowManager.next()
            }
            _rowManager.hold(child, _gravity, availableWidth)
        }
        // Размещаем оставшихся детей из последней строки
        _rowManager.layout(_gravity)
        // Сбрасываем менеджер
        _rowManager.reset()
    }

    override fun getAccessibilityClassName(): CharSequence {
        return ChipGroup::class.java.name
    }

    override fun generateDefaultLayoutParams(): ViewGroup.LayoutParams {
        return LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: ViewGroup.LayoutParams?): Boolean {
        return p is LayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): ViewGroup.LayoutParams {
        return LayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: ViewGroup.LayoutParams?): ViewGroup.LayoutParams {
        return LayoutParams(p)
    }

    /**
     * Параметры расположения дочерних [View] в [ChipGroup]
     */
    class LayoutParams : MarginLayoutParams {

        /**
         * Выравнивание [View] внутри [ChipGroup]
         * @see ChipGroup.gravity
         */
        @ViewDebug.ExportedProperty(
            category = "layout",
            mapping = [
                ViewDebug.IntToString(from = -1, to = "NONE"),
                ViewDebug.IntToString(from = Gravity.NO_GRAVITY, to = "NONE"),
                ViewDebug.IntToString(from = Gravity.TOP, to = "TOP"),
                ViewDebug.IntToString(from = Gravity.BOTTOM, to = "BOTTOM"),
                ViewDebug.IntToString(from = Gravity.LEFT, to = "LEFT"),
                ViewDebug.IntToString(from = Gravity.RIGHT, to = "RIGHT"),
                ViewDebug.IntToString(from = Gravity.START, to = "START"),
                ViewDebug.IntToString(from = Gravity.END, to = "END"),
                ViewDebug.IntToString(from = Gravity.CENTER_VERTICAL, to = "CENTER_VERTICAL"),
                ViewDebug.IntToString(from = Gravity.FILL_VERTICAL, to = "FILL_VERTICAL"),
                ViewDebug.IntToString(from = Gravity.CENTER_HORIZONTAL, to = "CENTER_HORIZONTAL"),
                ViewDebug.IntToString(from = Gravity.FILL_HORIZONTAL, to = "FILL_HORIZONTAL"),
                ViewDebug.IntToString(from = Gravity.CENTER, to = "CENTER"),
                ViewDebug.IntToString(from = Gravity.FILL, to = "FILL"),
            ],
        )
        var gravity: Int = -1

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            val typedArray = c.obtainStyledAttributes(attrs, R.styleable.ChipGroup_Layout)
            this.gravity = typedArray.getInt(R.styleable.ChipGroup_Layout_android_layout_gravity, -1)
            typedArray.recycle()
        }
        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: MarginLayoutParams?) : super(source)
        constructor(source: ViewGroup.LayoutParams?) : super(source)
    }

    private class RowManager(
        private val horizontalSpace: Int,
        private val verticalSpace: Int,
    ) {
        private val children: MutableList<View> = mutableListOf()
        private val bounds: Rect = Rect()
        private var offsetLeft: Int = 0
        private var offsetTop: Int = 0

        val width: Int get() = bounds.width()
        val height: Int get() = bounds.height()

        fun canHold(child: View, maximumWidth: Int): Boolean =
            width + child.widthWithSpace() <= maximumWidth

        fun offsetBounds(left: Int, top: Int) {
            offsetLeft = left
            offsetTop = top
            bounds.offsetTo(offsetLeft, offsetTop)
        }

        fun updateBounds(child: View, gravity: Int, maximumWidth: Int) {
            val widthWithSpacing = child.widthWithSpace()
            val newWidth = bounds.width() + widthWithSpacing

            var childGravity = (child.layoutParams as LayoutParams).gravity

            if (childGravity < 0) {
                childGravity = gravity
            }

            val horizontalGravity = Gravity.getAbsoluteGravity(
                childGravity and Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK,
                child.layoutDirection,
            )
            val isFinite = maximumWidth != INFINITE_SIZE
            when {
                horizontalGravity == Gravity.RIGHT && isFinite -> {
                    bounds.right = offsetLeft + maximumWidth
                    bounds.left = bounds.right - newWidth
                }
                horizontalGravity == Gravity.CENTER_HORIZONTAL && isFinite -> {
                    bounds.left = (maximumWidth - newWidth) / 2
                    bounds.right = (maximumWidth + newWidth) / 2
                }
                else -> {
                    bounds.left = offsetLeft
                    bounds.right = bounds.left + newWidth
                }
            }
            bounds.bottom = maxOf(bounds.bottom, bounds.top + child.measuredHeight)
        }

        fun hold(child: View, gravity: Int, maximumWidth: Int) {
            updateBounds(child, gravity, maximumWidth)
            children.add(child)
        }

        fun layout(gravity: Int) {
            var childLeft = bounds.left
            children.forEach { child ->
                var childGravity = (child.layoutParams as LayoutParams).gravity

                if (childGravity < 0) {
                    childGravity = gravity
                }

                val childTop = when (childGravity and Gravity.VERTICAL_GRAVITY_MASK) {
                    Gravity.BOTTOM -> bounds.bottom - child.measuredHeight
                    Gravity.CENTER_VERTICAL -> bounds.centerY() - child.measuredHeight / 2
                    else -> bounds.top
                }

                child.layout(
                    childLeft,
                    childTop,
                    childLeft + child.measuredWidth,
                    childTop + child.measuredHeight,
                )
                childLeft += child.measuredWidth + horizontalSpace
            }
        }

        fun next() {
            children.clear()
            bounds.top = bounds.bottom + verticalSpace
            bounds.left = offsetLeft
            bounds.right = offsetLeft
            bounds.bottom = bounds.top
        }

        fun reset() {
            children.clear()
            bounds.setEmpty()
        }

        private fun View.widthWithSpace(): Int =
            measuredWidth + (if (bounds.width() == 0) 0 else horizontalSpace)
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
            }
            _protectFromCheckedChange = false

            if (isChecked) {
                _checkedItems[chip.id] = chip.state
                chip.state = state
            } else {
                chip.state = _checkedItems[chip.id]
                _checkedItems.remove(chip.id)
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

    private companion object {
        const val INFINITE_SIZE = Int.MAX_VALUE
    }
}
