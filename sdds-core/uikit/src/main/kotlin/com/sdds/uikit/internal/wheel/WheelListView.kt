package com.sdds.uikit.internal.wheel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.StyleRes
import androidx.core.view.children
import androidx.core.view.doOnLayout
import androidx.core.view.doOnPreDraw
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.core.view.updatePaddingRelative
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.ListView
import com.sdds.uikit.ListViewHolder
import com.sdds.uikit.R
import com.sdds.uikit.TextView
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_CENTER
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_END
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_START
import com.sdds.uikit.Wheel.WheelItemEntry
import com.sdds.uikit.dp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.isParentOf
import com.sdds.uikit.statelist.ColorValueStateList
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sign

internal class WheelListView(context: Context) : ListView(context) {

    private val _layoutManager = WheelLayoutManager(context)
    private val _wheelItemAdapter = WheelItemAdapter()
    private val _spaceBetweenDecoration = WheelItemDecoration()
    private val _wheelSnapHelper = LinearSnapHelper().apply {
        attachToRecyclerView(this@WheelListView)
    }

    private var _itemTextAppearance: Int = 0
    private var _itemTextColor: ColorValueStateList? = null
    private var _itemTextAfterAppearance: Int = 0
    private var _itemTextAfterColor: ColorValueStateList? = null

    private var _itemAlignment: Int = ITEM_ALIGNMENT_CENTER
    private var _itemTextAfterPadding: Int = 0
    private var _entryMinSpacing: Int = 0
    private var _extraItemOffset: Int = 0
    private var _extraItemOffsetEnabled: Boolean = false

    private var _visibleCount = 0
    private var _itemsFocusable = false
    private var _infiniteScrollEnabled = false
    private var _wasFling = false
    private var _initialPositionSet: Boolean = false
    private var _savedDescendantFocusability: Int = descendantFocusability
    private var _reindexingFocusGuard: Boolean = false

    var itemsFocusable: Boolean
        get() = _itemsFocusable
        set(value) {
            if (_itemsFocusable != value) {
                _itemsFocusable = value
                refresh()
            }
        }

    var infiniteScrollEnabled: Boolean
        get() = _infiniteScrollEnabled
        set(value) {
            if (_infiniteScrollEnabled != value) {
                _infiniteScrollEnabled = value
                refresh()
            }
        }

    var visibleCount: Int
        get() = _visibleCount
        set(value) {
            if (_visibleCount != value) {
                _visibleCount = value
                refresh()
            }
        }

    var itemAlignment: Int
        get() = _itemAlignment
        set(value) {
            if (_itemAlignment != value) {
                _itemAlignment = value
                refresh()
            }
        }

    var entryMinSpacing: Int
        get() = _entryMinSpacing
        set(value) {
            if (_entryMinSpacing != value) {
                _entryMinSpacing = value
                refresh()
            }
        }

    var itemTextAfterPadding: Int
        get() = _itemTextAfterPadding
        set(value) {
            if (_itemTextAfterPadding != value) {
                _itemTextAfterPadding = value
                refresh()
            }
        }

    var extraItemOffset: Int
        get() = _extraItemOffset
        set(value) {
            if (_extraItemOffset != value) {
                _extraItemOffset = value
                refresh()
            }
        }

    var extraItemOffsetEnabled: Boolean
        get() = _extraItemOffsetEnabled
        set(value) {
            if (_extraItemOffsetEnabled != value) {
                _extraItemOffsetEnabled = value
                refresh()
            }
        }

    val itemHeight: Int
        get() = estimateChildHeight()

    val estimateChild: View?
        get() = getChildAt(0) ?: adapter?.onCreateViewHolder(this, 0)?.itemView

    init {
        adapter = _wheelItemAdapter
        layoutManager = _layoutManager
        setHasFixedSize(true)
        clipToPadding = false
        clipChildren = false
        addItemDecoration(_spaceBetweenDecoration)
        itemAnimator = null
        preserveFocusAfterLayout = true
        onFlingListener = object : OnFlingListener() {
            override fun onFling(velocityX: Int, velocityY: Int): Boolean {
                _wasFling = true
                return false
            }
        }
    }

    fun setData(items: List<WheelItemEntry>) {
        _wheelItemAdapter.submitList(items) {
            post { refresh() }
        }
        doOnLayout {
            val itemHeight = estimateChildHeight() - entryMinSpacing
            val edgeOffset = (it.measuredHeight - itemHeight) / 2
            it.updatePadding(top = edgeOffset, bottom = edgeOffset)
        }
    }

    fun setItemTextAppearance(@StyleRes appearanceId: Int) {
        if (_itemTextAppearance != appearanceId) {
            _itemTextAppearance = appearanceId
            refresh()
        }
    }

    fun setItemTextColor(colorValueStateList: ColorValueStateList?) {
        if (_itemTextColor != colorValueStateList) {
            _itemTextColor = colorValueStateList
            refresh()
        }
    }

    fun setItemTextAfterAppearance(@StyleRes appearanceId: Int) {
        if (_itemTextAfterAppearance != appearanceId) {
            _itemTextAfterAppearance = appearanceId
            refresh()
        }
    }

    fun setItemTextAfterColor(colorValueStateList: ColorValueStateList?) {
        if (_itemTextAfterColor != colorValueStateList) {
            _itemTextAfterColor = colorValueStateList
            refresh()
        }
    }

    fun setSelectedEntry(entryId: Long, animate: Boolean): Boolean {
        val position = _wheelItemAdapter.getItemPosition(entryId)
        if (position == NO_POSITION) return false
        return setSelectedPosition(position, animate)
    }

    fun setSelectedPosition(position: Int, smooth: Boolean = true): Boolean {
        doOnPreDraw { updateChildTransforms() }
        return snap(smooth) { position }
    }

    fun getSelectedEntry(): WheelItemEntry? {
        val currentPosition = getSelectedPosition()
        val normalizedPosition = if (infiniteScrollEnabled) {
            currentPosition % _wheelItemAdapter.currentList.size
        } else {
            currentPosition
        }
        return _wheelItemAdapter.currentList.getOrNull(normalizedPosition)
    }

    fun getSelectedPosition(): Int {
        val centerView = findCenterChild() ?: return -1
        return _layoutManager.getPosition(centerView)
    }

    fun snap(smooth: Boolean = true, positionProvider: (Int) -> Int): Boolean {
        val centerView = findCenterChild() ?: return false
        val currentPosition = getSelectedPosition()
        val nextPosition = positionProvider(currentPosition)
            .takeIf { it in 0 until _wheelItemAdapter.itemCount }
            ?: return false
        val nextView = _layoutManager.findViewByPosition(nextPosition)
        val snapDistance = if (nextView == null) {
            intArrayOf(0, (nextPosition - currentPosition) * centerView.measuredHeight)
        } else {
            _wheelSnapHelper.calculateDistanceToFinalSnap(_layoutManager, nextView) ?: intArrayOf(0, 0)
        }
        if (smooth) {
            smoothScrollBy(0, snapDistance[1])
        } else {
            scrollBy(0, snapDistance[1])
        }
        updateChildTransforms()
        return true
    }

    fun findCenterChild(): View? {
        return _wheelSnapHelper.findSnapView(_layoutManager)
    }

    override fun addFocusables(views: ArrayList<View>, direction: Int, mode: Int) {
        val current = rootView?.findFocus()
        val enteringFromOutside = current != null && !isParentOf(current)

        if (enteringFromOutside && itemsFocusable) {
            val center = findCenterChild()
            if (center != null && center.isFocusable) {
                // Отдаём кандидатом только центр и выходим — FocusFinder не увидит остальных
                center.addFocusables(views, direction, mode)
                return
            }
        }
        super.addFocusables(views, direction, mode)
    }

    override fun onRequestFocusInDescendants(direction: Int, previouslyFocusedRect: Rect?): Boolean {
        val target = findCenterChild() ?: return super.onRequestFocusInDescendants(direction, previouslyFocusedRect)
        return target.requestFocus()
    }

    override fun onDetachedFromWindow() {
        _reindexingFocusGuard = false
        descendantFocusability = _savedDescendantFocusability
        super.onDetachedFromWindow()
    }

    private fun refresh() {
        doOnPreDraw {
            if (infiniteScrollEnabled) {
                applyInfiniteScroll(false)
            } else {
                val position = if (_initialPositionSet) getSelectedPosition() else 0
                setSelectedPosition(position, false)
                _initialPositionSet = true
            }
        }
        _wheelItemAdapter.forceRefreshHolders()
    }

    private fun estimateChildHeight(
        widthSpec: Int = MeasureSpec.UNSPECIFIED,
        heightSpec: Int = MeasureSpec.UNSPECIFIED,
    ): Int {
        val child = estimateChild ?: return 0
        val spacing = entryMinSpacing
        if (child.measuredHeight > 0) {
            return child.measuredHeight + spacing
        }
        measureChild(child, widthSpec, heightSpec)
        return child.measuredHeight + spacing
    }

    private fun estimateWheelHeight(widthSpec: Int, heightSpec: Int): Int {
        val extraSpacing = if (extraItemOffsetEnabled) extraItemOffset * 2 else 0
        val itemHeight = estimateChildHeight(widthSpec, heightSpec) - extraSpacing
        val centerY = visibleCount * itemHeight / 2
        val maxDist = visibleCount * itemHeight / 2f
        var estimateHeight = 0f
        var childrenCenter = itemHeight.toFloat() / 2
        var distance = centerY - childrenCenter
        repeat(visibleCount) {
            val heightForDistance = getItemHeightForDistance(itemHeight, distance, maxDist)
            estimateHeight += heightForDistance
            childrenCenter += itemHeight
            distance = centerY - childrenCenter
        }
        return estimateHeight.toInt() + extraSpacing
    }

    override fun onScrolled(dx: Int, dy: Int) {
        super.onScrolled(dx, dy)
        updateChildTransforms()
    }

    override fun clearFocus() {
        if (_reindexingFocusGuard) return
        super.clearFocus()
    }

    override fun focusSearch(focused: View, direction: Int): View? {
        if (_reindexingFocusGuard) {
            return this
        }
        val isChild = indexOfChild(focused) != -1
        var target: View? = null
        if (isChild && itemsFocusable && !infiniteScrollEnabled) {
            val currentPosition = _layoutManager.getPosition(focused)
            val lastIndex = _wheelItemAdapter.itemCount - 1

            target = if (direction == View.FOCUS_DOWN && currentPosition == lastIndex) {
                rootView.findViewById<View>(nextFocusDownId)
                    ?: (parent as? ViewGroup)?.findViewById(nextFocusDownId)
            } else if (direction == View.FOCUS_UP && currentPosition == 0) {
                rootView.findViewById<View>(nextFocusUpId)
                    ?: (parent as? ViewGroup)?.findViewById(nextFocusUpId)
            } else {
                null
            }
        }

        return target ?: super.focusSearch(focused, direction)
    }

    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        val specHeight = MeasureSpec.getSize(heightSpec)
        val newHeightSpec = if (estimateChild != null) {
            val estimatedMaxHeight = estimateWheelHeight(widthSpec, heightSpec)
            val maxHeight = minOf(estimatedMaxHeight, specHeight)
            MeasureSpec.makeMeasureSpec(maxHeight, MeasureSpec.EXACTLY)
        } else {
            heightSpec
        }
        super.onMeasure(widthSpec, newHeightSpec)
    }

    private fun getMaxDistance(): Float {
        return measuredHeight / 2f
    }

    private fun getDistanceFactor(distance: Float, maxDist: Float = getMaxDistance()): Float {
        val absDistance = abs(distance)
        return (absDistance / maxDist).coerceAtMost(1.5f)
    }

    private fun getScaleByDistanceFactor(factor: Float): Float {
        return 1f - 0.3f * factor
    }

    private fun getAlphaByDistanceFactor(factor: Float): Float {
        return 1f - 0.8f * factor.coerceAtMost(1f)
    }

    private fun getItemHeightForDistance(itemHeight: Int, distance: Float, maxDist: Float): Float {
        val factor = getDistanceFactor(distance, maxDist)
        val scale = getScaleByDistanceFactor(factor)
        return (itemHeight - extraItemOffset - entryMinSpacing) * scale
    }

    private fun getTranslationForDistance(itemHeight: Int, distance: Float, maxDescriptionTranslation: Float): Float {
        val factor = getDistanceFactor(distance)
        val scale = getScaleByDistanceFactor(factor)
        val direction = sign(distance).toInt()
        val descriptionCompensation = if (extraItemOffsetEnabled) {
            val descriptionCompensationFactor = (abs(distance) / itemHeight).coerceIn(0f, 1f)
            maxDescriptionTranslation * descriptionCompensationFactor
        } else {
            0f
        }
        val translateYGeneral = (itemHeight * (1 - scale) / 2) + (descriptionCompensation * scale / 2)
        return direction * translateYGeneral
    }

    override fun onScrollStateChanged(state: Int) {
        super.onScrollStateChanged(state)
        if (state == SCROLL_STATE_IDLE && infiniteScrollEnabled) applyInfiniteScroll()
    }

    private fun getInfinityTargetPosition(position: Int): Int {
        val realItemCount = _wheelItemAdapter.realItemCount
        val allItemCount = _wheelItemAdapter.itemCount
        val infKoef = INFINITY_MULTIPLIER / 3
        if (realItemCount == 0 || position == NO_POSITION) return -1
        return when {
            position < realItemCount * infKoef -> position + realItemCount * infKoef
            position > allItemCount - (realItemCount * infKoef) -> (position % realItemCount) + realItemCount * infKoef
            else -> -1
        }
    }

    private fun applyInfiniteScroll(requestFocus: Boolean = hasFocus()) {
        val firstItemVisible = findCenterChild()?.let { _layoutManager.getPosition(it) }
            ?: _layoutManager.findFirstVisibleItemPosition()
        val isIdle = scrollState == SCROLL_STATE_IDLE
        val targetPosition = getInfinityTargetPosition(firstItemVisible).takeIf { it != -1 }

        if (targetPosition != null && isIdle) {
            if (requestFocus) {
                _reindexingFocusGuard = true
                _savedDescendantFocusability = descendantFocusability
                descendantFocusability = ViewGroup.FOCUS_BLOCK_DESCENDANTS
                isFocusable = true
                requestFocus()
                _wheelItemAdapter.setFocusLock(targetPosition)
            }

            snap(false) { targetPosition }

            if (requestFocus) {
                post {
                    descendantFocusability = _savedDescendantFocusability
                    _reindexingFocusGuard = false
                    isFocusable = false
                    _wheelItemAdapter.clearFocusLock()
                    _layoutManager.findViewByPosition(targetPosition)?.requestFocus()
                }
            }
        }
    }

    override fun stopScroll() {
        super.stopScroll()
        _wasFling = false
    }

    private fun updateChildTransforms() {
        if (measuredHeight == 0) return
        val centerY = measuredHeight / 2f

        for (i in 0 until childCount) {
            val child = getChildAt(i)
            val childHolder = getChildViewHolder(child) as WheelListView.WheelItemAdapter.WheelItemEntryHolder
            val childCenterY = (child.top + child.bottom) / 2f
            val distance = centerY - childCenterY
            val factor = getDistanceFactor(distance)

            val scale = getScaleByDistanceFactor(factor)
            val alpha = getAlphaByDistanceFactor(factor)

            val itemHeight = child.measuredHeight
            val direction = sign(distance).toInt()
            val maxDescriptionCompensation = childHolder.maxDescriptionCompensation
            val indexFromCenter = (abs(distance) / itemHeight).roundToInt()

            val descriptionCompensation = if (extraItemOffsetEnabled) {
                val descriptionCompensationFactor = (distance / itemHeight).coerceIn(0f, 1f)
                maxDescriptionCompensation * descriptionCompensationFactor
            } else {
                0f
            }

            val translationY = if (direction != 0) {
                val translateYGeneral = itemHeight * (1 - scale) / 2
                var allTranslation = 0f
                var neighbourCenter = childCenterY + direction * itemHeight
                var neighbourDistance = centerY - neighbourCenter
                var neighbourTranslation =
                    getTranslationForDistance(itemHeight, neighbourDistance, maxDescriptionCompensation)
                while (neighbourDistance.sign == distance.sign && indexFromCenter <= visibleCount / 2 + 1) {
                    allTranslation += neighbourTranslation
                    neighbourCenter += direction * itemHeight
                    neighbourDistance = centerY - neighbourCenter
                    neighbourTranslation =
                        getTranslationForDistance(itemHeight, neighbourDistance, maxDescriptionCompensation)
                }
                direction * translateYGeneral + allTranslation * 2
            } else {
                0f
            }

            val widthDiff = (child.measuredWidth * scale - measuredWidth) / 2
            val translationX = when (itemAlignment) {
                ITEM_ALIGNMENT_START -> widthDiff
                ITEM_ALIGNMENT_END -> -widthDiff
                else -> 0f
            }

            childHolder.updateTransform(
                scale = scale,
                translateX = translationX,
                translateY = translationY,
                alpha = alpha,
                descriptionCompensation = descriptionCompensation,
            )
        }
    }

    private inner class WheelItemDecoration : ItemDecoration() {
        private val debugPaint =
            Paint().configure(style = Paint.Style.STROKE, strokeWidth = 1.dp.toFloat(), color = Color.RED)
        private val debugBounds = Rect()

        override fun onDraw(c: Canvas, parent: RecyclerView, state: State) {
            super.onDraw(c, parent, state)
            if (!DRAW_DEBUG) return
            parent.children.forEach {
                debugBounds.set(
                    _layoutManager.getDecoratedLeft(it),
                    _layoutManager.getDecoratedTop(it),
                    _layoutManager.getDecoratedRight(it),
                    _layoutManager.getDecoratedBottom(it),
                )
                c.drawRect(debugBounds, debugPaint.configure(color = Color.RED, style = Paint.Style.STROKE))
            }
        }
    }

    internal inner class WheelItemAdapter : Adapter<WheelItemAdapter.WheelItemEntryHolder>() {

        private var freshViewType: Int = Int.MIN_VALUE
        private val _items: MutableList<WheelItemEntry> = mutableListOf()
        private var _focusLockPosition = NO_POSITION

        val currentList: List<WheelItemEntry>
            get() = _items

        val realItemCount: Int
            get() = _items.size

        @Suppress("NotifyDataSetChanged")
        fun forceRefreshHolders() {
            freshViewType++
            notifyDataSetChanged()
        }

        override fun getItemViewType(position: Int): Int {
            return freshViewType
        }

        override fun getItemCount(): Int {
            return if (infiniteScrollEnabled) realItemCount * INFINITY_MULTIPLIER else realItemCount
        }

        fun getItemPosition(entryId: Long): Int {
            return _items.indexOfFirst { it.id == entryId }
        }

        fun submitList(list: List<WheelItemEntry>, commitCallback: Runnable?) {
            val changed = _items != list
            _items.clear()
            _items.addAll(list)
            if (changed) commitCallback?.run()
        }

        private fun getItem(position: Int): WheelItemEntry {
            val pos = if (infiniteScrollEnabled) position % _items.size else position
            return _items[pos]
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WheelItemEntryHolder {
            return WheelItemEntryHolder(
                WheelListItemView(parent.context).apply {
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,
                    )
                },
            )
        }

        override fun onBindViewHolder(holder: WheelItemEntryHolder, position: Int) {
            holder.setFocusLock(position == _focusLockPosition)
            holder.bind(getItem(position))
        }

        fun setFocusLock(targetPosition: Int) {
            val oldLock = _focusLockPosition
            if (oldLock != NO_POSITION) {
                notifyItemChanged(oldLock)
            }
            _focusLockPosition = targetPosition
            if (_focusLockPosition != NO_POSITION) {
                notifyItemChanged(_focusLockPosition)
            }
        }

        fun clearFocusLock() {
            val oldLock = _focusLockPosition
            if (oldLock != NO_POSITION) {
                notifyItemChanged(oldLock)
            }
            _focusLockPosition = NO_POSITION
        }

        internal inner class WheelItemEntryHolder(itemView: WheelListItemView) : ListViewHolder(itemView) {
            private val itemTitleView = itemView.findViewById<TextView>(R.id.sd_wheel_item_title)
            private val itemTextAfterView = itemView.findViewById<TextView>(R.id.sd_wheel_item_text_after)

            private val wheelItem = itemView.findViewById<ViewGroup>(R.id.sd_wheel_item)

            private val descriptionOffset: Int
                get() = (extraItemOffset)
                    .takeIf { extraItemOffsetEnabled }
                    ?: 0

            val maxDescriptionCompensation: Float
                get() = (itemView.measuredHeight - entryMinSpacing - wheelItem.measuredHeight).toFloat()

            init {
                updateStyle()
                if (DRAW_DEBUG) {
                    itemView.setBackgroundColor(Color.MAGENTA)
                }
            }

            fun bind(item: WheelItemEntry) {
                itemTitleView.text = item.title
                itemTextAfterView.text = item.textAfter
                itemTextAfterView.isVisible = !item.textAfter.isNullOrBlank()
            }

            fun updateTransform(
                scale: Float,
                translateX: Float,
                translateY: Float,
                alpha: Float,
                descriptionCompensation: Float,
            ) {
                itemView.translationX = translateX
                itemView.translationY = translateY
                itemView.scaleX = scale
                itemView.scaleY = scale
                itemView.alpha = alpha
                wheelItem.translationY = descriptionCompensation
            }

            fun setFocusLock(lock: Boolean) {
                (itemView as WheelListItemView).setFocusLock(lock)
            }

            private fun updateStyle() {
                itemTitleView.apply {
                    setTextAppearance(_itemTextAppearance)
                    setTextColor(_itemTextColor)
                }
                wheelItem.apply {
                    updateLayoutParams<FrameLayout.LayoutParams> {
                        gravity = when (itemAlignment) {
                            ITEM_ALIGNMENT_START -> Gravity.START
                            ITEM_ALIGNMENT_END -> Gravity.END
                            else -> Gravity.CENTER_HORIZONTAL
                        }
                    }
                }
                itemTextAfterView.apply {
                    setTextAppearance(_itemTextAfterAppearance)
                    setTextColor(_itemTextAfterColor)
                }
                itemTextAfterView.updatePaddingRelative(start = _itemTextAfterPadding)
                itemView.apply {
                    isFocusable = itemsFocusable
                    updatePadding(
                        top = entryMinSpacing / 2,
                        bottom = descriptionOffset * 2 + entryMinSpacing / 2,
                    )
                }
            }
        }
    }

    private inner class WheelLayoutManager(context: Context) : LinearLayoutManager(context, VERTICAL, false) {
        private val _tempRect: Rect = Rect()
        override fun calculateExtraLayoutSpace(state: State, extraLayoutSpace: IntArray) {
            super.calculateExtraLayoutSpace(state, extraLayoutSpace)
            val extraSpace = 2 * itemHeight
            extraLayoutSpace[0] = extraSpace
            extraLayoutSpace[1] = extraSpace
        }

        override fun requestChildRectangleOnScreen(
            parent: RecyclerView,
            child: View,
            rect: Rect,
            immediate: Boolean,
            focusedChildVisible: Boolean,
        ): Boolean {
            val scrollAmount = _wheelSnapHelper.calculateDistanceToFinalSnap(this, child) ?: return false
            val dx = scrollAmount[0]
            val dy = scrollAmount[1]
            if (!focusedChildVisible || isFocusedChildVisibleAfterScrolling(parent, dx, dy)) {
                if (dx != 0 || dy != 0) {
                    if (immediate) {
                        parent.scrollBy(dx, dy)
                    } else {
                        parent.smoothScrollBy(dx, dy)
                    }
                    return true
                }
            }
            return false
        }

        private fun isFocusedChildVisibleAfterScrolling(parent: RecyclerView, dx: Int, dy: Int): Boolean {
            val focusedChild = parent.focusedChild ?: return false
            val parentLeft = paddingLeft
            val parentTop = paddingTop
            val parentRight = width - paddingRight
            val parentBottom = height - paddingBottom
            val bounds = _tempRect
            getDecoratedBoundsWithMargins(focusedChild, bounds)

            return !(
                bounds.left - dx >= parentRight ||
                    bounds.right - dx <= parentLeft ||
                    bounds.top - dy >= parentBottom ||
                    bounds.bottom - dy <= parentTop
                )
        }
    }

    internal class WheelListItemView(context: Context) : FrameLayout(context) {

        private var _focusLocked: Boolean = false

        init {
            inflate(context, R.layout.sd_layout_wheel_item, this)
            clipToPadding = false
            clipChildren = false
        }

        fun setFocusLock(lock: Boolean) {
            _focusLocked = lock
        }

        override fun onCreateDrawableState(extraSpace: Int): IntArray {
            val state = super.onCreateDrawableState(if (_focusLocked) extraSpace + 1 else extraSpace)

            if (_focusLocked && !isFocused) {
                mergeDrawableStates(state, intArrayOf(android.R.attr.state_focused))
            }
            return state
        }
    }

    private companion object {
        const val DRAW_DEBUG = false
        const val INFINITY_MULTIPLIER: Int = 40
    }
}
