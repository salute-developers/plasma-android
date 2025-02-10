package com.sdds.uikit

import android.content.Context
import android.graphics.RectF
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.view.children
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.shape.AbsoluteCornerSize
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeHelper

/**
 * Компонент для группировки нескольких SegmentItem
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class Segment @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_segmentStyle,
    defStyleRes: Int = R.style.Sdds_Components_Segment,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var _adapter: Adapter? = null
    private var _segmentItemsPool: Array<SegmentItem?>? = null
    private var _checkedItem: Button? = null
    private var _onCheckedChangeListener: OnCheckedChangeListener? = null
    private var _childOnCheckedChangeListener: Button.OnCheckedChangeListener =
        CheckedStateTracker()
    private val _passThroughListener: PassThroughHierarchyChangeListener =
        PassThroughHierarchyChangeListener()
    private val _segmentShapeable: ShapeHelper = shapeHelper(attrs, defStyleAttr, defStyleRes)
    private var _isStretch: Boolean = false

    /**
     * Могут ли [SegmentItem] растягиваться. В состоянии true все [SegmentItem]
     * будут распределяться равномерно и заполнять ширину родителя, в состоянии false -
     * все [SegmentItem] будут занимать ширину, заданную в парметрах [SegmentItem], но не более
     * ширины родителя.
     */
    open var isStretch: Boolean
        get() = _isStretch
        set(value) {
            if (_isStretch != value) {
                _isStretch = value
                requestLayout()
            }
        }

    /**
     * Возвращает состояние горизонтальной ориентации [Segment]
     */
    val isHorizontal: Boolean
        get() = orientation == HORIZONTAL

    /**
     * Возвращает состояние вертикальной ориентации [Segment]
     */
    val isVertical: Boolean
        get() = orientation == VERTICAL

    @StyleRes
    private var _segmentItemStyleOverlay: Int = 0
    private var _themeOverlay: Context

    /**
     * Слушатель изменений состояния [SegmentItem.isChecked]
     */
    fun interface OnCheckedChangeListener {

        /**
         * Колбэк изменений состояния [isChecked]
         */
        fun onCheckedChanged(segment: Segment, segmentItem: SegmentItem, isChecked: Boolean)
    }

    internal open fun repopulate() {
        val adapter = this.adapter ?: return
        children.forEach { if (it is SegmentItem) adapter.onUnbindSegmentItem(it) }
        this.removeAllViews()
        val itemsCount = adapter.getCount()
        if (!adapter.isAttached || itemsCount == 0) {
            _segmentItemsPool = null
            return
        }
        val pool = getPool(itemsCount)
        for (index in 0 until itemsCount) {
            val segmentItemView = pool.getOrNull(index)
                ?: adapter.onCreateSegmentItemView(index, _themeOverlay)
                    .also { pool[index] = it }
            addView(segmentItemView)
            adapter.onBindSegmentItem(segmentItemView, index)
        }
    }

    private fun getPool(useCount: Int): Array<SegmentItem?> {
        var pool = _segmentItemsPool ?: Array<SegmentItem?>(useCount) { null }

        if (pool.size - useCount > pool.size / 2) {
            pool = pool.sliceArray(0 until useCount)
        } else if (pool.size < useCount) {
            pool = Array(useCount) { pool.getOrNull(it) }
        }

        _segmentItemsPool = pool
        return pool
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _segmentItemsPool = null
    }

    /**
     * Адаптер для связывания пользовательских данных и компонентов [SegmentItem]
     */
    var adapter: Adapter?
        get() = _adapter
        set(value) {
            if (_adapter != value) {
                if (value != null) {
                    _adapter = value
                    _adapter?.attachSegment(this)
                } else {
                    _adapter?.detachSegment()
                    _adapter = null
                }
                repopulate()
            }
        }

    init {
        super.setOnHierarchyChangeListener(_passThroughListener)
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.Segment, defStyleAttr, defStyleRes)
        _isStretch = typedArray.getBoolean(R.styleable.Segment_sd_stretch, true)
        _segmentItemStyleOverlay =
            typedArray.getResourceId(R.styleable.Segment_sd_segmentItemStyleOverlay, 0)
        _themeOverlay = if (_segmentItemStyleOverlay != 0) {
            ContextThemeWrapper(
                context,
                _segmentItemStyleOverlay,
            )
        } else {
            context
        }
        typedArray.recycle()
    }

    override fun setOnHierarchyChangeListener(listener: OnHierarchyChangeListener?) {
        _passThroughListener.onHierarchyChangeListener = listener
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (this.shape != null) adjustShape()
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child !is SegmentItem) return
        val layoutParams = (params as? LayoutParams) ?: LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        layoutParams.apply {
            weight = if (orientation == HORIZONTAL && _isStretch) 1f else 0f
            width =
                if (orientation == VERTICAL) ViewGroup.LayoutParams.MATCH_PARENT else layoutParams.width
        }
        super.addView(child, index, layoutParams)
    }

    /**
     * Адаптер для установки данных в [Segment]
     */

    abstract class Adapter {

        private var segment: Segment? = null

        /**
         * Возвращает true, если [Adapter] прикреплен к [Segment]
         */
        val isAttached: Boolean get() = segment != null

        /**
         * Возвращает кол-во элементов в [Segment]
         */
        abstract fun getCount(): Int

        /**
         * Создает [SegmentItem] для текущей позиции [position] в [Segment].
         * Можно переопределить, чтобы создать свой экземпляр [SegmentItem].
         * @param position порядковый номер элемента [SegmentItem] в [Segment]
         * @param context контекст
         */
        open fun onCreateSegmentItemView(position: Int, context: Context): SegmentItem {
            return SegmentItem(context)
        }

        /**
         * Связывает пользовательские данные с [SegmentItem], имеющий порядковый номер [position].
         * @param segmentItemView экземпляр компонента [SegmentItem]
         * @param position порядковый номер элемента [SegmentItem] в [Segment]
         */
        abstract fun onBindSegmentItem(segmentItemView: SegmentItem, position: Int)

        /**
         * Отвязывает пользовательские данные с [SegmentItem]
         * @param segmentItemView экземпляр компонента [SegmentItem]
         */
        open fun onUnbindSegmentItem(segmentItemView: SegmentItem) = Unit

        /**
         * Колбэк связывания [Adapter] с [Segment]
         */
        open fun onAttachSegment(segment: Segment) = Unit

        /**
         * Колбэк отвязывания [Adapter] от [Segment]
         */
        open fun onDetachSegment(segment: Segment) = Unit

        /**
         * Уведомляет [Segment] об изменении данных
         */
        fun notifySegmentChanged() {
            segment?.repopulate()
        }

        internal fun attachSegment(segment: Segment) {
            if (this.segment != segment) {
                this.segment = segment
                onAttachSegment(segment)
            }
        }

        internal fun detachSegment() {
            this.segment?.let(::onDetachSegment)
            this.segment = null
        }
    }

    private inner class CheckedStateTracker : Button.OnCheckedChangeListener {

        override fun onCheckedChanged(button: Button, isChecked: Boolean) {
            if (isChecked) {
                if (_checkedItem == button) {
                    return
                } else {
                    _checkedItem?.let {
                        it.isChecked = false
                        _onCheckedChangeListener?.onCheckedChanged(
                            this@Segment,
                            button as SegmentItem,
                            false,
                        )
                    }
                    _checkedItem = button
                    _onCheckedChangeListener?.onCheckedChanged(
                        this@Segment,
                        button as SegmentItem,
                        true,
                    )
                }
            }
        }
    }

    private inner class PassThroughHierarchyChangeListener : OnHierarchyChangeListener {

        var onHierarchyChangeListener: OnHierarchyChangeListener? = null

        override fun onChildViewAdded(parent: View?, child: View?) {
            if (parent == this@Segment && child is SegmentItem) {
                if (child.id == View.NO_ID) {
                    child.id = View.generateViewId()
                }
                child.setOnCheckedChangedListener(_childOnCheckedChangeListener)
            }
            onHierarchyChangeListener?.onChildViewAdded(parent, child)
        }

        override fun onChildViewRemoved(parent: View?, child: View?) {
            if (parent == this@Segment && child is SegmentItem) {
                child.setOnCheckedChangedListener(null)
            }
            onHierarchyChangeListener?.onChildViewRemoved(parent, child)
        }
    }

    private fun adjustShape() {
        val firstChild = getChildAt(0)
        val lastChild = getChildAt(childCount - 1)

        if (orientation == VERTICAL) {
            val firstTopLeftCorner = firstChild.getSize(Corner.TopLeft) + paddingTop
            val firstTopRightCorner = firstChild.getSize(Corner.TopRight) + paddingTop
            val lastBottomLeftCorner = lastChild.getSize(Corner.BottomLeft) + paddingBottom
            val lastBottomRightCorner = lastChild.getSize(Corner.BottomRight) + paddingBottom

            _segmentShapeable.setShape(
                ShapeModel(
                    cornerSizeTopLeft = AbsoluteCornerSize(firstTopLeftCorner),
                    cornerSizeTopRight = AbsoluteCornerSize(firstTopRightCorner),
                    cornerSizeBottomRight = AbsoluteCornerSize(lastBottomRightCorner),
                    cornerSizeBottomLeft = AbsoluteCornerSize(lastBottomLeftCorner),
                ),
            )
        } else {
            val firstTopLeftCorner = firstChild.getSize(Corner.TopLeft) + paddingLeft
            val firstBottomLeftCorner = firstChild.getSize(Corner.BottomLeft) + paddingLeft
            val lastTopRightCorner = lastChild.getSize(Corner.TopRight) + paddingRight
            val lastBottomRightCorner = lastChild.getSize(Corner.BottomRight) + paddingRight

            _segmentShapeable.setShape(
                ShapeModel(
                    cornerSizeTopLeft = AbsoluteCornerSize(firstTopLeftCorner),
                    cornerSizeTopRight = AbsoluteCornerSize(lastTopRightCorner),
                    cornerSizeBottomRight = AbsoluteCornerSize(lastBottomRightCorner),
                    cornerSizeBottomLeft = AbsoluteCornerSize(firstBottomLeftCorner),
                ),
            )
        }
    }

    private enum class Corner {
        TopLeft, TopRight, BottomRight, BottomLeft
    }

    companion object {

        /**
         * Константа горизонтальной ориентации [Segment]
         */
        const val HORIZONTAL = 0

        /**
         * Константа вертикальной ориентации [Segment]
         */
        const val VERTICAL = 1

        private val CornerSizeBounds = RectF()

        private fun View.getSize(corner: Corner): Float {
            CornerSizeBounds.apply {
                left = 0f
                top = 0f
                right = measuredWidth.toFloat()
                bottom = measuredHeight.toFloat()
            }
            val shape = (this as? Shapeable)?.shape ?: return 0f
            return when (corner) {
                Corner.TopLeft -> shape.cornerSizeTopLeft.getSize(CornerSizeBounds)
                Corner.TopRight -> shape.cornerSizeTopRight.getSize(CornerSizeBounds)
                Corner.BottomRight -> shape.cornerSizeBottomRight.getSize(CornerSizeBounds)
                Corner.BottomLeft -> shape.cornerSizeBottomLeft.getSize(CornerSizeBounds)
            }
        }
    }
}
