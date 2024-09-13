package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewDebug
import android.view.ViewGroup
import androidx.core.view.isGone
import com.sdds.uikit.internal.base.configure

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
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes) {

    private val _flowManager: FlowLayoutManager
    private var _horizontalSpacing: Int
    private var _verticalSpacing: Int
    private var _gravity: Int
    private var isFinite: Boolean = false

    /**
     * Выравнивание дочерних элементов относительно строки, в которой они находятся.
     * @see Gravity
     */
    open var gravity: Int
        get() = _gravity
        set(value) {
            if (_gravity != value) {
                _gravity = value
                requestLayout()
            }
        }

    init {
        if (DEBUG_BOUNDS) {
            setWillNotDraw(false)
        }
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FlowLayout, defStyleAttr, defStyleRes)
        _horizontalSpacing = typedArray.getDimensionPixelSize(R.styleable.FlowLayout_sd_gap, 0)
        _verticalSpacing = typedArray.getDimensionPixelSize(R.styleable.FlowLayout_sd_lineSpacing, 0)
        _gravity = typedArray.getInt(R.styleable.FlowLayout_android_gravity, Gravity.TOP or Gravity.START)
        _flowManager = FlowLayoutManager(_horizontalSpacing, _verticalSpacing)
        typedArray.recycle()
    }

    internal fun getRowBounds(rowIndex: Int, outRect: Rect) {
        outRect.set(_flowManager.boundsList.getOrNull(rowIndex) ?: return)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (DEBUG_BOUNDS) _flowManager.drawDebug(canvas)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val availableWidth = if (widthMode != MeasureSpec.UNSPECIFIED) {
            specWidth - paddingStart - paddingEnd
        } else {
            INFINITE_SIZE
        }
        isFinite = availableWidth != INFINITE_SIZE

        var totalWidth = 0
        var totalHeight = paddingTop + paddingBottom

        _flowManager.boundsList.clear()
        _flowManager.reset()
        _flowManager.maximumRowWidth = 0
        _flowManager.offsetBounds(paddingStart, paddingTop)

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue

            onMeasureChild(child, widthMeasureSpec, heightMeasureSpec)
            // Если строка не может вместить еще одного ребенка
            if (!_flowManager.canHold(child, availableWidth)) {
                // То обновляем ширину контейнера, если она меньше, чем размер текущей строки
                totalWidth = maxOf(totalWidth, _flowManager.width)
                // Увеличиваем высоту контейнера на высоту текущей строки
                totalHeight += _flowManager.height + _verticalSpacing
                // И переходим на следующую строку
                _flowManager.next()
            }
            // Увеличивает границы текущей строки на ширину и высоту текущего ребенка
            _flowManager.updateBounds(child)
        }

        // Не забываем про последнюю строку
        totalWidth = maxOf(totalWidth, _flowManager.width) + paddingStart + paddingEnd
        totalHeight += _flowManager.height

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
        setMeasuredDimension(maxOf(minimumWidth, desiredWidth), maxOf(minimumHeight, desiredHeight))
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        val availableWidth = measuredWidth - paddingStart - paddingEnd

        _flowManager.reset()
        _flowManager.offsetBounds(paddingStart, paddingTop)

        for (index in 0 until childCount) {
            val child = getChildAt(index)
            if (child.isGone) continue

            // Если строка не может вместить еще одного ребенка
            if (!_flowManager.canHold(child, availableWidth)) {
                // То размещаем всех текущих детей в строке и обновляем позицию
                _flowManager.layout(_gravity, availableWidth)
                _flowManager.next()
            }
            _flowManager.hold(child)
        }
        // Размещаем оставшихся детей из последней строки
        _flowManager.layout(_gravity, availableWidth)
        // Сбрасываем менеджер
        _flowManager.reset()
    }

    protected open fun onMeasureChild(child: View, widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val lp = child.layoutParams as LayoutParams
        val occupy = lp.occupy
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        val childWidthSpec = if (occupy && isFinite) {
            val currentFlowWidth = if (_flowManager.wasOccupied) 0 else _flowManager.width
            MeasureSpec.makeMeasureSpec(specWidth - currentFlowWidth - _horizontalSpacing, widthMode)
        } else {
            widthMeasureSpec
        }
        val childHeightSpec = if (heightMode != MeasureSpec.UNSPECIFIED) {
            val currentFlowHeight = _flowManager.height
            MeasureSpec.makeMeasureSpec(specHeight - currentFlowHeight, heightMode)
        } else {
            heightMeasureSpec
        }
        measureChildWithMargins(child, childWidthSpec, 0, childHeightSpec, 0)
    }

    protected open fun onLayoutChild(child: View, left: Int, top: Int, right: Int, bottom: Int, rowHeight: Int) {
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

    internal open fun calculateRowHeight(child: View, layoutParams: LayoutParams): Int {
        return child.measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin
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
        var gravity: Int = -1

        /**
         * Если true, [View] занимает все оставшееся место в строке, а последующие [View] будут располагаться на новой
         */
        var occupy: Boolean = false

        constructor(c: Context, attrs: AttributeSet?) : super(c, attrs) {
            val typedArray = c.obtainStyledAttributes(attrs, R.styleable.FlowLayout_Layout)
            this.gravity = typedArray.getInt(R.styleable.FlowLayout_Layout_android_layout_gravity, -1)
            this.occupy = typedArray.getBoolean(R.styleable.FlowLayout_Layout_sd_layout_occupy, false)
            typedArray.recycle()
        }

        constructor(width: Int, height: Int) : super(width, height)
        constructor(source: MarginLayoutParams?) : super(source)
        constructor(source: ViewGroup.LayoutParams?) : super(source)
    }

    private inner class FlowLayoutManager(
        private val horizontalSpace: Int,
        private val verticalSpace: Int,
    ) {
        private val children: MutableList<View> = mutableListOf()
        private val bounds: Rect = Rect()
        private var offsetLeft: Int = 0
        private var offsetTop: Int = 0
        var wasOccupied: Boolean = false
            private set
        var boundsList = mutableListOf<Rect>()

        var maximumRowWidth: Int = 0
        var rowsCount: Int = MIN_ROW_COUNT
            private set

        val width: Int get() = bounds.width()
        val height: Int get() = bounds.height()

        fun canHold(child: View, maximumWidth: Int): Boolean =
            !wasOccupied && (width + child.widthWithSpace() <= maximumWidth)

        fun offsetBounds(left: Int, top: Int) {
            offsetLeft = left
            offsetTop = top
            bounds.offsetTo(offsetLeft, offsetTop)
        }

        fun updateBounds(child: View) {
            val lp = child.layoutParams as LayoutParams
            val widthWithSpacing = child.widthWithSpace() + lp.leftMargin + lp.rightMargin
            val newWidth = bounds.width() + widthWithSpacing

            wasOccupied = wasOccupied || lp.occupy

            bounds.left = offsetLeft
            bounds.right = bounds.left + newWidth
            maximumRowWidth = maxOf(bounds.width(), maximumRowWidth)
            bounds.bottom = maxOf(bounds.bottom, bounds.top + calculateRowHeight(child, lp))
            boundsList.getOrElse(rowsCount - 1) {
                Rect().also { boundsList.add(it) }
            }.apply { set(bounds) }
        }

        fun hold(child: View) {
            updateBounds(child)
            children.add(child)
        }

        fun drawDebug(canvas: Canvas) {
            boundsList.forEach { canvas.drawRect(it, DebugPaint) }
        }

        fun layout(gravity: Int, maximumWidth: Int) {
            val isFinite = maximumWidth != INFINITE_SIZE
            var boundsLeft = bounds.left
            var boundsRight = bounds.left + if (isFinite) maximumWidth else maximumRowWidth

            children.forEach { child ->
                val lp = child.layoutParams as LayoutParams
                var childGravity = lp.gravity

                if (childGravity < 0) {
                    childGravity = gravity
                }

                val childTop = when (childGravity and Gravity.VERTICAL_GRAVITY_MASK) {
                    Gravity.BOTTOM -> bounds.bottom - child.measuredHeight - lp.bottomMargin
                    Gravity.CENTER_VERTICAL -> {
                        bounds.centerY() - (child.measuredHeight) / 2 + lp.topMargin - lp.bottomMargin
                    }
                    else -> bounds.top + lp.topMargin
                }

                val horizontalGravity = Gravity.getAbsoluteGravity(
                    childGravity and Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK,
                    layoutDirection,
                )

                val childLeft: Int
                when {
                    horizontalGravity == Gravity.RIGHT && isFinite -> {
                        childLeft = boundsRight - child.measuredWidth - lp.rightMargin
                        boundsRight = childLeft - horizontalSpace - lp.leftMargin
                    }

                    else -> {
                        childLeft = boundsLeft + lp.leftMargin
                        boundsLeft = childLeft + child.measuredWidth + lp.rightMargin + horizontalSpace
                    }
                }

                onLayoutChild(
                    child,
                    childLeft,
                    childTop,
                    childLeft + child.measuredWidth,
                    childTop + child.measuredHeight,
                    bounds.height(),
                )
            }
        }

        fun next() {
            children.clear()
            wasOccupied = false
            rowsCount++
            bounds.top = bounds.bottom + verticalSpace
            bounds.left = offsetLeft
            bounds.right = offsetLeft
            bounds.bottom = bounds.top
        }

        fun reset() {
            children.clear()
            bounds.setEmpty()
            rowsCount = MIN_ROW_COUNT
        }

        private fun View.widthWithSpace(): Int {
            return measuredWidth + (if (bounds.width() == 0) 0 else horizontalSpace)
        }
    }

    private companion object {
        const val INFINITE_SIZE = Int.MAX_VALUE
        const val DEBUG_BOUNDS = false
        const val MIN_ROW_COUNT = 1
        val DebugPaint = Paint().configure(color = Color.MAGENTA, strokeWidth = 3f, style = Paint.Style.STROKE)
    }
}
