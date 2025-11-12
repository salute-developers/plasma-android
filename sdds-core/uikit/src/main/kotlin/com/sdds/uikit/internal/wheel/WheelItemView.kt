package com.sdds.uikit.internal.wheel

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import androidx.annotation.StyleRes
import androidx.core.graphics.withScale
import androidx.core.view.doOnPreDraw
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import com.sdds.uikit.ImageView
import com.sdds.uikit.TextView
import com.sdds.uikit.Wheel
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_END
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_START
import com.sdds.uikit.dp
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.internal.base.fullHeight
import com.sdds.uikit.internal.base.fullWidth
import com.sdds.uikit.internal.base.isParentOf
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.statelist.ColorValueStateList

internal class WheelItemView(context: Context) : ViewGroup(context) {

    private val _upButtonId = generateViewId()
    private val _downButtonId = generateViewId()
    private val _listView = WheelListView(context).apply {
        id = generateViewId()
        isFocusable = false
        nextFocusUpId = _upButtonId
        nextFocusDownId = _downButtonId
        addOnScrollListener(
            object : OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    super.onScrollStateChanged(recyclerView, newState)
                    if (newState == RecyclerView.SCROLL_STATE_IDLE && !recyclerView.isPressed) {
                        val entry = getSelectedEntry() ?: return
                        if (entry != _currentSelectedEntry) {
                            _currentSelectedEntry = entry
                            _entrySelectedListener?.onEntrySelected(this@WheelItemView.id, entry)
                        }
                    }
                }
            },
        )
    }

    private val _upButton: ImageView = ImageView(context).apply {
        id = _upButtonId
        isFocusable = true
        setOnClickListener { previous() }
    }
    private val _downButton: ImageView = ImageView(context).apply {
        id = _downButtonId
        isFocusable = true
        setOnClickListener { next() }
    }

    override fun setId(id: Int) {
        super.setId(id)
        _downButton.tag = id
    }

    private val _descriptionView: TextView = DescriptionView(context).apply {
        maxLines = 1
        isFocusable = false
        ellipsize = TextUtils.TruncateAt.END
    }

    private var focusSelectorSettings: FocusSelectorSettings? = null
    private var _descriptionTextAppearance: Int = 0
    private var _descriptionPadding: Int = 0
    private var _descriptionTextColor: ColorValueStateList? = null
    private var _description: CharSequence? = null

    private var _controlsEnabled: Boolean = false
    private var _controlsDisplayMode: Int = Wheel.CONTROLS_DISPLAY_MODE_ALWAYS
    private var _controlIconUp: Drawable? = null
    private var _controlIconUpTintList: ColorStateList? = null
    private var _controlIconDown: Drawable? = null
    private var _controlIconDownTintList: ColorStateList? = null
    private var _entrySelectedListener: Wheel.EntrySelectedListener? = null
    private var _currentSelectedEntry: Wheel.WheelItemEntry? = null
    private var _hasFocus: Boolean = false
    private var _listViewHasFocus: Boolean = false
    private var _itemSelectorEnabled: Boolean = false
    private val selectorBounds: Rect = Rect()

    private val _globalFocusListener = ViewTreeObserver.OnGlobalFocusChangeListener { oldFocus, newFocus ->
        val isFocusOnItem = oldFocus === this || newFocus === this
        if (isFocusOnItem || isParentOf(oldFocus) || isParentOf(newFocus)) {
            val hasFocus = hasFocus()
            val listViewHasFocus = _listView.hasFocus()
            if (_hasFocus != hasFocus) {
                _hasFocus = hasFocus
                updateControlsVisibility()
            }
            if (_listViewHasFocus != listViewHasFocus) {
                _listViewHasFocus = listViewHasFocus
                _descriptionView.isActivated = listViewHasFocus
                invalidate()
            }
        }
    }
    private val _selectorDrawable: ShapeDrawable = ShapeDrawable()

    val extraItemOffset: Int
        get() = _listView.extraItemOffset
            .takeIf { _listView.extraItemOffsetEnabled }
            ?: 0

    val itemHeight: Int
        get() = _listView.itemHeight

    var visibleItemsCount: Int
        get() = _listView.visibleCount
        set(value) {
            _listView.visibleCount = value
            _descriptionView.apply {
                isGone = description.isNullOrBlank() || value == 0
                _listView.extraItemOffsetEnabled = isVisible
                resetPositions()
            }
        }

    var controlsEnabled: Boolean
        get() = _controlsEnabled
        set(value) {
            if (_controlsEnabled != value) {
                _controlsEnabled = value
                updateControlsVisibility()
            }
        }

    var controlsDisplayMode: Int
        get() = _controlsDisplayMode
        set(value) {
            if (_controlsDisplayMode != value) {
                _controlsDisplayMode = value
                updateControlsVisibility()
            }
        }

    var controlIconUp: Drawable?
        get() = _controlIconUp
        set(value) {
            if (_controlIconUp != value) {
                _controlIconUp = value
                updateControls()
            }
        }

    var controlIconDown: Drawable?
        get() = _controlIconDown
        set(value) {
            if (_controlIconDown != value) {
                _controlIconDown = value
                updateControls()
            }
        }

    var itemAlignment: Int
        get() = _listView.itemAlignment
        set(value) {
            if (_listView.itemAlignment != value) {
                _listView.itemAlignment = value
                invalidate()
                requestLayout()
            }
        }

    var entryMinSpacing: Int
        get() = _listView.entryMinSpacing
        set(value) {
            if (_listView.entryMinSpacing != value) {
                _listView.entryMinSpacing = value
                resetPositions(true)
            }
        }

    var itemTextAfterPadding: Int
        get() = _listView.itemTextAfterPadding
        set(value) {
            _listView.itemTextAfterPadding = value
        }

    var description: CharSequence?
        get() = _description
        set(value) {
            if (_description != value) {
                _description = value
                _descriptionView.apply {
                    isGone = value.isNullOrBlank() || visibleItemsCount == 0
                    _listView.extraItemOffsetEnabled = isVisible
                    text = value
                    resetPositions()
                }
            }
        }

    var descriptionPadding: Int
        get() = _descriptionPadding
        set(value) {
            if (_descriptionPadding != value) {
                _descriptionPadding = value
                _descriptionView.updatePadding(top = value)
            }
        }

    var infiniteScrollEnabled: Boolean
        get() = _listView.infiniteScrollEnabled
        set(value) {
            _listView.infiniteScrollEnabled = value
        }

    var itemSelectorEnabled: Boolean
        get() = _itemSelectorEnabled
        set(value) {
            if (_itemSelectorEnabled != value) {
                _itemSelectorEnabled = value
                invalidate()
            }
        }

    init {
        populate()
        updateControls()
        updateDescription()
        setWillNotDraw(false)
    }

    fun setData(items: List<Wheel.WheelItemEntry>) {
        _listView.setData(items)
    }

    fun setItemSelectorShapeAppearance(@StyleRes appearanceId: Int) {
        _selectorDrawable.setShapeModel(ShapeModel.create(context, appearanceId))
    }

    fun setItemSelectorTint(tint: ColorValueStateList?) {
        _selectorDrawable.setTintValue(tint)
    }

    fun setFocusSelectorSettings(settings: FocusSelectorSettings) {
        if (focusSelectorSettings != settings) {
            focusSelectorSettings = settings
            requestLayout()
        }
    }

    fun setEntrySelectedListener(entrySelectedListener: Wheel.EntrySelectedListener?) {
        _entrySelectedListener = entrySelectedListener
    }

    fun setDescriptionTextAppearance(@StyleRes appearanceId: Int) {
        if (_descriptionTextAppearance != appearanceId) {
            _descriptionTextAppearance = appearanceId
            _descriptionView.setTextAppearance(appearanceId)
        }
    }

    fun setDescriptionTextColor(colorValueStateList: ColorValueStateList?) {
        if (_descriptionTextColor != colorValueStateList) {
            _descriptionTextColor = colorValueStateList
            _descriptionView.setTextColor(colorValueStateList)
        }
    }

    fun setItemTextAppearance(@StyleRes appearanceId: Int) {
        _listView.setItemTextAppearance(appearanceId)
    }

    fun setItemTextColor(colorValueStateList: ColorValueStateList?) {
        _listView.setItemTextColor(colorValueStateList)
    }

    fun setItemTextAfterAppearance(@StyleRes appearanceId: Int) {
        _listView.setItemTextAfterAppearance(appearanceId)
    }

    fun setItemTextAfterColor(colorValueStateList: ColorValueStateList?) {
        _listView.setItemTextAfterColor(colorValueStateList)
    }

    fun setControlIconUpColor(colorStateList: ColorStateList?) {
        _controlIconUpTintList = colorStateList
        updateControls()
    }

    fun setControlIconDownColor(colorStateList: ColorStateList?) {
        _controlIconDownTintList = colorStateList
        updateControls()
    }

    private fun populate() {
        addView(_upButton, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        addView(_listView, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
        addView(_descriptionView, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        addView(_downButton, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
    }

    fun next(): Boolean {
        return _listView.snap { it + 1 }
    }

    fun previous(): Boolean {
        return _listView.snap { it - 1 }
    }

    fun setSelectedEntry(entryId: Long, animate: Boolean): Boolean {
        return _listView.setSelectedEntry(entryId, animate)
    }

    fun getSelectedEntry(): Wheel.WheelItemEntry? {
        return _listView.getSelectedEntry()
    }

    override fun onRequestFocusInDescendants(direction: Int, previouslyFocusedRect: Rect?): Boolean {
        val target = _listView.findCenterChild()
            ?: return super.onRequestFocusInDescendants(direction, previouslyFocusedRect)
        return target.requestFocus()
    }

    override fun focusSearch(focused: View, direction: Int): View? {
        val fromDownButton = focused.id == _downButtonId && direction == View.FOCUS_UP
        val fromUpButton = focused.id == _upButtonId && direction == View.FOCUS_DOWN
        val fromListView = focused.id == _listView.id
        if (fromDownButton || fromUpButton || fromListView) {
            val centerChild = _listView.findCenterChild()
            centerChild?.let { return it }
        }
        return super.focusSearch(focused, direction)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        viewTreeObserver.addOnGlobalFocusChangeListener(_globalFocusListener)
    }

    override fun onDetachedFromWindow() {
        viewTreeObserver.removeOnGlobalFocusChangeListener(_globalFocusListener)
        super.onDetachedFromWindow()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        var totalWidth = 0
        var totalHeight = 0

        if (_controlsEnabled) {
            measureChildWithMargins(_upButton, widthMeasureSpec, 0, heightMeasureSpec, 0)
            measureChildWithMargins(_downButton, widthMeasureSpec, 0, heightMeasureSpec, 0)
            totalHeight += _upButton.fullHeight() + _downButton.fullHeight()
            totalWidth = maxOf(_downButton.fullWidth(), _upButton.fullWidth())
        }

        if (_descriptionView.isVisible) {
            measureChildWithMargins(_descriptionView, widthMeasureSpec, 0, heightMeasureSpec, 0)
        }

        _listView.extraItemOffset = _descriptionView.measuredHeight / 2
        measureChildWithMargins(_listView, widthMeasureSpec, 0, heightMeasureSpec, totalHeight)
        totalHeight += _listView.fullHeight()
        totalWidth = maxOf(totalWidth, _listView.fullWidth(), _descriptionView.fullWidth())

        totalWidth += paddingStart + paddingEnd
        totalHeight += paddingTop + paddingBottom

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
        setMeasuredDimension(
            desiredWidth.coerceAtLeast(minimumWidth),
            desiredHeight.coerceAtLeast(minimumHeight),
        )
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        if (itemSelectorEnabled && _listViewHasFocus) {
            if (focusSelectorSettings?.scaleEnabled == true) {
                val scale = focusSelectorSettings?.scaleFactor?.let { it + 1f } ?: 1f
                c.withScale(scale, scale, selectorBounds.exactCenterX(), selectorBounds.exactCenterY()) {
                    _selectorDrawable.draw(this)
                }
            } else {
                _selectorDrawable.draw(c)
            }
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        var top = paddingTop
        top = layoutChild(_upButton, top)
        top = layoutChild(_listView, top)
        layoutChild(_downButton, top)
        layoutChild(_descriptionView, 0)

        val estimateChild = _listView.estimateChild
        if (estimateChild != null) {
            val spacing = entryMinSpacing / 2
            selectorBounds.set(
                estimateChild.left,
                estimateChild.top + spacing,
                estimateChild.right,
                estimateChild.bottom - spacing,
            )
        }
        if (_descriptionView.isVisible) {
            selectorBounds.left = minOf(selectorBounds.left, _descriptionView.left) - SELECTOR_SAFE_PADDING
            selectorBounds.right = maxOf(selectorBounds.right, _descriptionView.right) + SELECTOR_SAFE_PADDING
            selectorBounds.bottom += SELECTOR_SAFE_PADDING
        }
        selectorBounds.offsetTo(selectorBounds.left, (measuredHeight - selectorBounds.height()) / 2)
        _selectorDrawable.bounds = selectorBounds
    }

    private fun layoutChild(child: View, top: Int): Int {
        if (child.isGone) return top
        val childLeft = if (child != _listView) {
            when (itemAlignment) {
                ITEM_ALIGNMENT_START -> paddingStart
                ITEM_ALIGNMENT_END -> measuredWidth - paddingEnd - child.fullWidth()
                else -> (measuredWidth - child.fullWidth()) / 2
            }
        } else {
            (measuredWidth - child.fullWidth()) / 2
        }
        child.layout(childLeft, top, childLeft + child.measuredWidth, top + child.measuredHeight)
        return top + child.fullHeight()
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return MarginLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        return p is MarginLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return MarginLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: LayoutParams?): LayoutParams {
        return MarginLayoutParams(p)
    }

    private fun updateControls() {
        _upButton.setImageDrawable(controlIconUp)
        _downButton.setImageDrawable(controlIconDown)
        _upButton.imageTintList = _controlIconUpTintList
        _downButton.imageTintList = _controlIconDownTintList
        updateControlsVisibility()
        _listView.itemsFocusable = true
        resetPositions(true)
    }

    private fun updateControlsVisibility() {
        if (!controlsEnabled) {
            _upButton.isGone = true
            _downButton.isGone = true
            return
        }

        when (controlsDisplayMode) {
            Wheel.CONTROLS_DISPLAY_MODE_IF_ACTIVE -> {
                val visibility = if (_hasFocus) VISIBLE else INVISIBLE
                _upButton.visibility = visibility
                _downButton.visibility = visibility
            }

            else -> {
                _upButton.isVisible = true
                _downButton.isVisible = true
            }
        }
    }

    private fun updateDescription() {
        _descriptionView.apply {
            isGone = description.isNullOrBlank() || visibleItemsCount == 0
            _listView.extraItemOffsetEnabled = isVisible
            text = description
            setTextColor(_descriptionTextColor)
            setTextAppearance(_descriptionTextAppearance)
            updatePadding(top = descriptionPadding)
        }
        resetPositions()
    }

    private fun resetPositions(reselect: Boolean = false) {
        val current = _listView.getSelectedPosition()
        _listView.doOnPreDraw {
            _descriptionView.translationY = getDescriptionPosition().toFloat()
            if (reselect) _listView.setSelectedPosition(current, false)
        }
        invalidate()
        if (reselect) requestLayout()
    }

    private fun getDescriptionPosition(): Int {
        val centerTop = (_listView.measuredHeight - _listView.itemHeight) / 2
        return _listView.top + centerTop + _listView.itemHeight - _descriptionView.measuredHeight - entryMinSpacing
    }

    private class DescriptionView(context: Context) : TextView(context) {

        override fun onCreateDrawableState(extraSpace: Int): IntArray {
            val state = super.onCreateDrawableState(if (isActivated) extraSpace + 1 else extraSpace)

            if (isActivated) {
                mergeDrawableStates(state, intArrayOf(android.R.attr.state_focused))
            }
            return state
        }
    }

    private companion object {
        val SELECTOR_SAFE_PADDING = 2.dp
    }
}
