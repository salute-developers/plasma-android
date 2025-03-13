package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.View.MeasureSpec.AT_MOST
import android.view.View.MeasureSpec.EXACTLY
import android.view.View.MeasureSpec.UNSPECIFIED
import android.view.ViewDebug
import android.view.ViewGroup
import androidx.core.view.isGone
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable

/**
 * FlowLayout поддерживает позиционирование с автоматическим построчным переносом.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 06.09.2024
 */
open class FlowLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_flowLayoutStyle,
    defStyleRes: Int = R.style.Sdds_Components_FlowLayout,
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes), Shapeable, HasFocusSelector by FocusSelectorDelegate() {

    private val _shapeable: Shapeable = shapeable(attrs, defStyleAttr)
    private val _flowManager: FlowLayoutManager
    private var _mainAxisGap: Int
    private var _crossAxisGap: Int
    private var _gravity: Int
    private var isFinite: Boolean = false
    private var _orientation: Int = ORIENTATION_HORIZONTAL
    private var _arrangement: Int = ARRANGEMENT_START
    private var _alignment: Int = ALIGNMENT_START
    private var _itemsPerLine: Int = Int.MAX_VALUE

    /**
     * Выравнивание дочерних элементов относительно строки, в которой они находятся.
     * @see Gravity
     */
    @Deprecated("Use arrangement", ReplaceWith("arrangement"))
    open var gravity: Int
        get() = _gravity
        set(value) {
            if (_gravity != value) {
                _gravity = value
                _arrangement = gravityToArrangement(value, layoutDirection)
                requestLayout()
            }
        }

    /**
     * @see Shapeable.shape
     */
    override val shape: ShapeModel?
        get() = _shapeable.shape

    /**
     * Расположение элементов относительно выбранной ориентации
     */
    open var arrangement: Int
        get() = _arrangement
        set(value) {
            if (_arrangement != value) {
                _arrangement = value
                invalidate()
                requestLayout()
            }
        }

    /**
     * Выравнивание элементов внутри строк по вертикали при горизонтальной ориентации,
     * или внутри столбцов по горизонтали при вертикальной.
     */
    open var alignment: Int
        get() = _alignment
        set(value) {
            if (_alignment != value) {
                _alignment = value
                invalidate()
                requestLayout()
            }
        }

    /**
     * Ориентация. Может быть [ORIENTATION_VERTICAL] или [ORIENTATION_HORIZONTAL]
     */
    open var orientation: Int
        get() = _orientation
        set(value) {
            if (_orientation != value) {
                _orientation = value
                invalidate()
                requestLayout()
            }
        }

    /**
     * Кол-во элементов в строке/столбце
     */
    open var itemsPerLine: Int
        get() = _itemsPerLine
        set(value) {
            if (_itemsPerLine != value) {
                _itemsPerLine = value
                invalidate()
                requestLayout()
            }
        }

    init {
        if (DEBUG_BOUNDS) {
            setWillNotDraw(false)
        }
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FlowLayout, defStyleAttr, defStyleRes)
        val gap = typedArray.getDimensionPixelSize(R.styleable.FlowLayout_sd_gap, 0)
        val lineSpacing = typedArray.getDimensionPixelSize(R.styleable.FlowLayout_sd_lineSpacing, 0)
        _mainAxisGap = typedArray.getDimensionPixelSize(R.styleable.FlowLayout_sd_mainAxisGap, gap)
        _crossAxisGap = typedArray.getDimensionPixelSize(R.styleable.FlowLayout_sd_crossAxisGap, lineSpacing)
        _gravity = typedArray.getInt(R.styleable.FlowLayout_android_gravity, Gravity.TOP or Gravity.START)
        _orientation = typedArray.getInt(R.styleable.FlowLayout_android_orientation, ORIENTATION_HORIZONTAL)
        _arrangement = typedArray.getInt(
            R.styleable.FlowLayout_sd_arrangement,
            gravityToArrangement(_gravity, layoutDirection),
        )
        _alignment = typedArray.getInt(R.styleable.FlowLayout_sd_alignment, ALIGNMENT_START)
        _itemsPerLine = typedArray.getInt(R.styleable.FlowLayout_sd_itemsPerLine, Int.MAX_VALUE)
        _flowManager = FlowLayoutManager()
        typedArray.recycle()
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        @Suppress("LeakingThis")
        applySelector(this, context, attrs, defStyleAttr)
    }

    internal fun getRowBounds(rowIndex: Int, outRect: Rect) {
        outRect.set(_flowManager.boundsList.getOrNull(rowIndex) ?: return)
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        updateFocusSelector(this, gainFocus)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (DEBUG_BOUNDS) _flowManager.drawDebug(canvas)
    }

    @Suppress("CyclomaticComplexMethod")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val mainAxisSize = when {
            _orientation == ORIENTATION_HORIZONTAL && widthMode != UNSPECIFIED -> specWidth - paddingStart - paddingEnd
            _orientation == ORIENTATION_VERTICAL && heightMode != UNSPECIFIED -> specHeight - paddingTop - paddingBottom
            else -> INFINITE_SIZE
        }
        isFinite = mainAxisSize != INFINITE_SIZE

        val horizontalPadding = paddingStart + paddingEnd
        val verticalPadding = paddingTop + paddingBottom
        var mainAxisTotal = 0
        var crossAxisTotal = when (_orientation) {
            ORIENTATION_VERTICAL -> horizontalPadding
            else -> verticalPadding
        }

        _flowManager.boundsList.clear()
        _flowManager.reset()
        _flowManager.maxMainAxisSize = 0
        _flowManager.offsetBounds(paddingStart, paddingTop)

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue

            onMeasureChild(child, widthMeasureSpec, heightMeasureSpec)
            // Если строка не может вместить еще одного ребенка
            if (!_flowManager.canHold(child, mainAxisSize)) {
                // То обновляем размер контейнера, если она меньше, чем размер текущей строки
                mainAxisTotal = maxOf(mainAxisTotal, _flowManager.mainAxisSize)
                // Увеличиваем высоту контейнера на высоту текущей строки
                crossAxisTotal += _flowManager.crossAxisSize + _crossAxisGap
                // И переходим на следующую строку
                _flowManager.next()
            }
            // Увеличивает границы текущей строки на ширину и высоту текущего ребенка
            _flowManager.hold(child)
        }

        // Не забываем про последнюю строку
        mainAxisTotal = maxOf(mainAxisTotal, _flowManager.mainAxisSize)
//        // Учитываем внутренние отступы
        mainAxisTotal += when (_orientation) {
            ORIENTATION_VERTICAL -> verticalPadding
            else -> horizontalPadding
        }
        crossAxisTotal += _flowManager.crossAxisSize

        // Выбираем конечные размеры согласно требованиям родителя
        val desiredWidth = when {
            widthMode == EXACTLY -> specWidth
            widthMode == AT_MOST && _orientation == ORIENTATION_HORIZONTAL -> minOf(mainAxisTotal, specWidth)
            widthMode == AT_MOST && _orientation == ORIENTATION_VERTICAL -> minOf(crossAxisTotal, specWidth)
            _orientation == ORIENTATION_HORIZONTAL -> mainAxisTotal
            else -> crossAxisTotal
        }
        val desiredHeight = when {
            heightMode == EXACTLY -> specHeight
            heightMode == AT_MOST && _orientation == ORIENTATION_HORIZONTAL -> minOf(crossAxisTotal, specHeight)
            heightMode == AT_MOST && _orientation == ORIENTATION_VERTICAL -> minOf(mainAxisTotal, specHeight)
            _orientation == ORIENTATION_HORIZONTAL -> crossAxisTotal
            else -> mainAxisTotal
        }
        setMeasuredDimension(maxOf(minimumWidth, desiredWidth), maxOf(minimumHeight, desiredHeight))
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        val mainAxisSize = when {
            _orientation == ORIENTATION_HORIZONTAL -> measuredWidth - paddingStart - paddingEnd
            else -> measuredHeight - paddingTop - paddingBottom
        }

        _flowManager.reset()
        _flowManager.offsetBounds(paddingStart, paddingTop)

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue

            // Если строка не может вместить еще одного ребенка
            if (!_flowManager.canHold(child, mainAxisSize)) {
                // То размещаем всех текущих детей в строке и обновляем позицию
                _flowManager.layout(mainAxisSize)
                _flowManager.next()
            }
            _flowManager.hold(child)
        }
        // Размещаем оставшихся детей из последней строки
        _flowManager.layout(mainAxisSize)
        // Сбрасываем менеджер
        _flowManager.reset()
    }

    protected open fun onMeasureChild(child: View, widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val lp = child.layoutParams as LayoutParams
        val occupy = lp.occupy && isFinite
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val childWidthSpec = if (_orientation == ORIENTATION_HORIZONTAL && occupy) {
            val currentFlowWidth = if (_flowManager.wasOccupied) 0 else _flowManager.width
            MeasureSpec.makeMeasureSpec(specWidth - currentFlowWidth - getMainAxisGap(), widthMode)
        } else {
            widthMeasureSpec
        }
        val childHeightSpec = if (_orientation == ORIENTATION_VERTICAL && occupy) {
            val currentFlowHeight = if (_flowManager.wasOccupied) 0 else _flowManager.height
            MeasureSpec.makeMeasureSpec(specHeight - currentFlowHeight - getMainAxisGap(), heightMode)
        } else {
            heightMeasureSpec
        }
        measureChildWithMargins(child, childWidthSpec, 0, childHeightSpec, 0)
    }

    protected open fun onLayoutChild(child: View, left: Int, top: Int, right: Int, bottom: Int, rowBounds: Rect) {
        child.layout(left, top, right, bottom)
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
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

    internal open fun calculateLineCrossAxisSize(child: View, layoutParams: LayoutParams): Int {
        return when (_orientation) {
            ORIENTATION_VERTICAL -> child.measuredWidth + layoutParams.rightMargin + layoutParams.leftMargin
            else -> child.measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin
        }
    }

    private fun getMainAxisGap(): Int {
        if (arrangement == ARRANGEMENT_SPACE_BETWEEN || arrangement == ARRANGEMENT_SPACE_AROUND) {
            return 0
        }
        return _mainAxisGap
    }

    /**
     * Параметры расположения дочерних [View] в [FlowLayout]
     */
    class LayoutParams : MarginLayoutParams {

        /**
         * Выравнивание [View] внутри [FlowLayout]
         * @see FlowLayout.gravity
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
        @Deprecated("Use alignment", replaceWith = ReplaceWith("alignment"))
        var gravity: Int = -1

        /**
         * Выравнивание элементов внутри строк по вертикали при горизонтальной ориентации,
         * или внутри столбцов по горизонтали при вертикальной.
         */
        @ViewDebug.ExportedProperty(
            category = "layout",
            mapping = [
                ViewDebug.IntToString(from = ALIGNMENT_START, to = "START"),
                ViewDebug.IntToString(from = ALIGNMENT_CENTER, to = "CENTER"),
                ViewDebug.IntToString(from = ALIGNMENT_END, to = "END"),
            ],
        )
        var alignment: Int = ALIGNMENT_START

        /**
         * Если true, [View] занимает все оставшееся место в строке, а последующие [View] будут располагаться на новой
         */
        var occupy: Boolean = false

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            val typedArray = c.obtainStyledAttributes(attrs, R.styleable.FlowLayout_Layout)
            this.gravity = typedArray.getInt(R.styleable.FlowLayout_Layout_android_layout_gravity, -1)
            this.alignment =
                typedArray.getInt(R.styleable.FlowLayout_Layout_sd_layout_alignment, gravityToAlignment(gravity))
            this.occupy = typedArray.getBoolean(R.styleable.FlowLayout_Layout_sd_layout_occupy, false)
            typedArray.recycle()
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: MarginLayoutParams?) : super(source)
        constructor(source: ViewGroup.LayoutParams?) : super(source)
    }

    private inner class FlowLayoutManager {
        private val children: MutableList<View> = mutableListOf()
        private val bounds: Rect = Rect()
        private var offsetLeft: Int = 0
        private var offsetTop: Int = 0
        private val tempBounds: Rect = Rect()
        var wasOccupied: Boolean = false
            private set
        var boundsList = mutableListOf<Rect>()

        var maxMainAxisSize: Int = 0
        var rowsCount: Int = MIN_ROW_COUNT
            private set

        val width: Int get() = bounds.width()
        val height: Int get() = bounds.height()

        val mainAxisSize: Int
            get() = when (orientation) {
                ORIENTATION_HORIZONTAL -> width
                else -> height
            }
        val crossAxisSize: Int
            get() = when (orientation) {
                ORIENTATION_HORIZONTAL -> height
                else -> width
            }

        fun canHold(child: View, maxMainAxisSize: Int): Boolean {
            val enoughSpace = (mainAxisSize + child.mainAxisSizeWithGap() <= maxMainAxisSize)
            return !wasOccupied && children.size < _itemsPerLine && enoughSpace
        }

        fun offsetBounds(left: Int, top: Int) {
            offsetLeft = left
            offsetTop = top
            bounds.offsetTo(offsetLeft, offsetTop)
        }

        fun hold(child: View) {
            updateBounds(child)
            children.add(child)
        }

        fun drawDebug(canvas: Canvas) {
            boundsList.forEach { canvas.drawRect(it, DebugPaint) }
        }

        fun layout(maxSize: Int) {
            val isFinite = maxSize != INFINITE_SIZE
            val emptySpace = if (isFinite) {
                arrangeRowBounds(
                    availableSize = maxSize,
                    containerBounds = tempBounds,
                    rowBounds = bounds,
                )
            } else {
                0
            }

            var axisOffset = 0
            children.forEachIndexed { index, child ->
                alignChildBounds(child, tempBounds, bounds)

                axisOffset = if (orientation == ORIENTATION_HORIZONTAL) {
                    arrangeChildBoundsHorizontally(index, child, tempBounds, bounds, axisOffset, emptySpace)
                } else {
                    arrangeChildBoundsVertically(index, child, tempBounds, bounds, axisOffset, emptySpace)
                }

                onLayoutChild(
                    child,
                    tempBounds.left,
                    tempBounds.top,
                    tempBounds.left + child.measuredWidth,
                    tempBounds.top + child.measuredHeight,
                    bounds,
                )
            }
        }

        fun next() {
            children.clear()
            wasOccupied = false
            rowsCount++
            when (_orientation) {
                ORIENTATION_VERTICAL -> {
                    bounds.top = offsetTop
                    bounds.left = bounds.right + _crossAxisGap
                    bounds.right = bounds.left
                    bounds.bottom = bounds.top
                }

                else -> {
                    bounds.top = bounds.bottom + _crossAxisGap
                    bounds.left = offsetLeft
                    bounds.right = offsetLeft
                    bounds.bottom = bounds.top
                }
            }
        }

        fun reset() {
            children.clear()
            bounds.setEmpty()
            tempBounds.setEmpty()
            rowsCount = MIN_ROW_COUNT
        }

        private fun updateBounds(child: View) {
            val lp = child.layoutParams as LayoutParams
            val childMainAxisMargins = if (orientation == ORIENTATION_HORIZONTAL) {
                lp.leftMargin + lp.rightMargin
            } else {
                lp.topMargin + lp.bottomMargin
            }
            val childMainAxisSizeWithGap = child.mainAxisSizeWithGap() + childMainAxisMargins
            val newMainAxisSize = mainAxisSize + childMainAxisSizeWithGap

            wasOccupied = wasOccupied || lp.occupy
            bounds.expandMainAxis(newMainAxisSize)
            bounds.expandCrossAxis(calculateLineCrossAxisSize(child, lp))
            maxMainAxisSize = maxOf(mainAxisSize, maxMainAxisSize)

            updateBoundsList()
        }

        private fun View.mainAxisSizeWithGap(): Int {
            return when (_orientation) {
                ORIENTATION_VERTICAL -> measuredHeight
                else -> measuredWidth
            } + (if (mainAxisSize == 0) 0 else getMainAxisGap())
        }

        private fun Int.getArrangementGravity(): Int {
            return when (this) {
                ARRANGEMENT_CENTER ->
                    if (_orientation == ORIENTATION_HORIZONTAL) Gravity.CENTER_HORIZONTAL else Gravity.CENTER_VERTICAL
                ARRANGEMENT_END ->
                    if (_orientation == ORIENTATION_HORIZONTAL) Gravity.END else Gravity.BOTTOM
                else ->
                    if (_orientation == ORIENTATION_HORIZONTAL) Gravity.START else Gravity.TOP
            }
        }

        private fun Int.getAlignmentGravity(): Int {
            return when (this) {
                ALIGNMENT_CENTER ->
                    if (_orientation == ORIENTATION_HORIZONTAL) Gravity.CENTER_VERTICAL else Gravity.CENTER_HORIZONTAL
                ALIGNMENT_END ->
                    if (_orientation == ORIENTATION_HORIZONTAL) Gravity.BOTTOM else Gravity.END
                else ->
                    if (_orientation == ORIENTATION_HORIZONTAL) Gravity.TOP else Gravity.START
            }
        }

        private fun updateBoundsList() {
            boundsList.getOrElse(rowsCount - 1) {
                Rect().also { boundsList.add(it) }
            }.apply { set(bounds) }
        }

        private fun Rect.expandMainAxis(amount: Int) {
            if (orientation == ORIENTATION_HORIZONTAL) {
                right = left + amount
            } else {
                bottom = top + amount
            }
        }

        private fun Rect.expandCrossAxis(amount: Int) {
            if (orientation == ORIENTATION_HORIZONTAL) {
                bottom = maxOf(bottom, top + amount)
            } else {
                right = maxOf(right, left + amount)
            }
        }

        private fun arrangeRowBounds(availableSize: Int, containerBounds: Rect, rowBounds: Rect): Int {
            containerBounds.set(rowBounds)
            containerBounds.expandMainAxis(availableSize)

            var emptySpace = 0
            val arrangementGravity = arrangement.getArrangementGravity()
            Gravity.apply(
                arrangementGravity,
                rowBounds.width(),
                rowBounds.height(),
                containerBounds,
                rowBounds,
                layoutDirection,
            )
            if (_arrangement == ARRANGEMENT_SPACE_BETWEEN || _arrangement == ARRANGEMENT_SPACE_AROUND) {
                emptySpace = availableSize - mainAxisSize
                rowBounds.expandMainAxis(availableSize)
            }
            updateBoundsList()
            return emptySpace
        }

        private fun getArrangementSpacing(childIndex: Int, emptySpace: Int): Int {
            return when {
                arrangement == ARRANGEMENT_SPACE_BETWEEN && isFinite && children.size > 1 && childIndex != 0 ->
                    (emptySpace / (children.size - 1))
                arrangement == ARRANGEMENT_SPACE_AROUND && isFinite && children.size > 1 ->
                    (emptySpace / (children.size + 1))
                else -> 0
            }
        }

        private fun arrangeChildBoundsHorizontally(
            childIndex: Int,
            child: View,
            childBounds: Rect,
            rowBounds: Rect,
            offset: Int,
            emptySpace: Int,
        ): Int {
            val lp = child.layoutParams as LayoutParams
            val arrangementSpacing = getArrangementSpacing(childIndex, emptySpace)
            childBounds.left = rowBounds.left + offset + lp.leftMargin + arrangementSpacing
            childBounds.right = childBounds.left + child.measuredWidth + lp.rightMargin + getMainAxisGap()
            return childBounds.right - rowBounds.left
        }

        private fun arrangeChildBoundsVertically(
            childIndex: Int,
            child: View,
            childBounds: Rect,
            rowBounds: Rect,
            offset: Int,
            emptySpace: Int,
        ): Int {
            val lp = child.layoutParams as LayoutParams
            val arrangementSpacing = getArrangementSpacing(childIndex, emptySpace)
            childBounds.top = rowBounds.top + offset + lp.topMargin + arrangementSpacing
            childBounds.bottom = childBounds.top + child.measuredHeight + lp.bottomMargin + getMainAxisGap()
            return childBounds.bottom - rowBounds.top
        }

        private fun alignChildBounds(child: View, childBounds: Rect, rowBounds: Rect) {
            val lp = child.layoutParams as LayoutParams
            var childAlignment = lp.alignment

            if (childAlignment < 0) {
                childAlignment = alignment
            }

            val alignmentGravity = childAlignment.getAlignmentGravity()

            Gravity.apply(
                alignmentGravity,
                child.measuredWidth + lp.leftMargin + lp.rightMargin,
                child.measuredHeight + lp.topMargin + lp.bottomMargin,
                rowBounds,
                childBounds,
                layoutDirection,
            )
            childBounds.offset(lp.leftMargin, lp.topMargin)
        }
    }

    companion object {
        /**
         * Расположение в начале
         * @see FlowLayout.arrangement
         */
        const val ARRANGEMENT_START = 0

        /**
         * Расположение в середине
         * @see FlowLayout.arrangement
         */
        const val ARRANGEMENT_CENTER = 1

        /**
         * Расположение в конце
         * @see FlowLayout.arrangement
         */
        const val ARRANGEMENT_END = 2

        /**
         * Расположение с равными отступами между элементами
         * @see FlowLayout.arrangement
         */
        const val ARRANGEMENT_SPACE_BETWEEN = 3

        /**
         * Расположение с равными отступами вокруг элементов
         * @see FlowLayout.arrangement
         */
        const val ARRANGEMENT_SPACE_AROUND = 4

        /**
         * Выравнивание в начале
         * @see FlowLayout.alignment
         */
        const val ALIGNMENT_START = 0

        /**
         * Выравнивание в середине
         * @see FlowLayout.alignment
         */
        const val ALIGNMENT_CENTER = 1

        /**
         * Выравнивание в конце
         * @see FlowLayout.alignment
         */
        const val ALIGNMENT_END = 2

        /**
         * Горизонтальная ориентация
         * @see FlowLayout.orientation
         */
        const val ORIENTATION_HORIZONTAL = 0

        /**
         * Вертикальная ориентация
         * @see FlowLayout.orientation
         */
        const val ORIENTATION_VERTICAL = 1

        private const val INFINITE_SIZE = Int.MAX_VALUE
        private const val DEBUG_BOUNDS = false
        private const val MIN_ROW_COUNT = 1
        private val DebugPaint = Paint().configure(color = Color.MAGENTA, strokeWidth = 3f, style = Paint.Style.STROKE)

        private fun gravityToAlignment(gravity: Int): Int {
            if (gravity < 0) return gravity
            return when (gravity) {
                Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL, Gravity.CENTER -> ALIGNMENT_CENTER
                Gravity.END, Gravity.RIGHT, Gravity.BOTTOM -> ALIGNMENT_END
                else -> ALIGNMENT_START
            }
        }

        private fun gravityToArrangement(gravity: Int, layoutDirection: Int): Int {
            if (gravity < 0) return gravity
            val absHorizontalGravity = Gravity.getAbsoluteGravity(
                gravity and Gravity.HORIZONTAL_GRAVITY_MASK,
                layoutDirection,
            )
            return when (absHorizontalGravity) {
                Gravity.CENTER_HORIZONTAL, Gravity.CENTER -> ARRANGEMENT_CENTER
                Gravity.END, Gravity.RIGHT -> ARRANGEMENT_END
                else -> ARRANGEMENT_START
            }
        }
    }
}
