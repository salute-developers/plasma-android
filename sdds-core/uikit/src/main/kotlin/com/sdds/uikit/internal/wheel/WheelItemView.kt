package com.sdds.uikit.internal.wheel

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.view.doOnPreDraw
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import com.sdds.uikit.ImageView
import com.sdds.uikit.R
import com.sdds.uikit.TextView
import com.sdds.uikit.Wheel
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_END
import com.sdds.uikit.Wheel.Companion.ITEM_ALIGNMENT_START
import com.sdds.uikit.internal.base.fullHeight
import com.sdds.uikit.internal.base.fullWidth
import com.sdds.uikit.statelist.ColorValueStateList

internal class WheelItemView(context: Context) : ViewGroup(context) {

    private val _listView = WheelListView(context).apply {
        isFocusable = false
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
        id = R.id.sd_upButtonId
        isFocusable = true
        nextFocusDownId = R.id.sd_downButtonId
        setOnClickListener { previous() }
    }
    private val _downButton: ImageView = ImageView(context).apply {
        id = R.id.sd_downButtonId
        nextFocusUpId = R.id.sd_upButtonId
        isFocusable = true
        setOnClickListener { next() }
    }

    override fun setId(id: Int) {
        super.setId(id)
        _downButton.tag = id
    }

    private val _descriptionView: TextView = TextView(context).apply {
        maxLines = 1
        isFocusable = false
        ellipsize = TextUtils.TruncateAt.END
    }

    private var _descriptionTextAppearance: Int = 0
    private var _descriptionPadding: Int = 0
    private var _descriptionTextColor: ColorValueStateList? = null
    private var _description: CharSequence? = null

    private var _controlsEnabled: Boolean = false
    private var _controlIconUp: Drawable? = null
    private var _controlIconUpTintList: ColorStateList? = null
    private var _controlIconDown: Drawable? = null
    private var _controlIconDownTintList: ColorStateList? = null
    private var _entrySelectedListener: Wheel.EntrySelectedListener? = null
    private var _currentSelectedEntry: Wheel.WheelItemEntry? = null

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
            updateDescription()
        }

    var controlsEnabled: Boolean
        get() = _controlsEnabled
        set(value) {
            if (_controlsEnabled != value) {
                _controlsEnabled = value
                updateControls()
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
                resetPositions()
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
                updateDescription()
            }
        }

    var descriptionPadding: Int
        get() = _descriptionPadding
        set(value) {
            if (_descriptionPadding != value) {
                _descriptionPadding = value
                updateDescription()
            }
        }

    var infiniteScrollEnabled: Boolean
        get() = _listView.infiniteScrollEnabled
        set(value) {
            _listView.infiniteScrollEnabled = value
        }

    init {
        populate()
        updateControls()
        updateDescription()
    }

    fun setData(items: List<Wheel.WheelItemEntry>) {
        _listView.setData(items)
    }

    fun setEntrySelectedListener(entrySelectedListener: Wheel.EntrySelectedListener?) {
        _entrySelectedListener = entrySelectedListener
    }

    fun setDescriptionTextAppearance(@StyleRes appearanceId: Int) {
        if (_descriptionTextAppearance != appearanceId) {
            _descriptionTextAppearance = appearanceId
            updateDescription()
        }
    }

    fun setDescriptionTextColor(colorValueStateList: ColorValueStateList?) {
        if (_descriptionTextColor != colorValueStateList) {
            _descriptionTextColor = colorValueStateList
            updateDescription()
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

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        var top = paddingTop
        top = layoutChild(_upButton, top)
        top = layoutChild(_listView, top)
        layoutChild(_downButton, top)
        layoutChild(_descriptionView, 0)
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
        _upButton.isVisible = controlsEnabled
        _downButton.isVisible = controlsEnabled
        _listView.itemsFocusable = !controlsEnabled
        resetPositions()
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

    private fun resetPositions() {
        val current = _listView.getSelectedPosition()
        _listView.doOnPreDraw {
            _descriptionView.translationY = getDescriptionPosition().toFloat()
            _listView.setSelectedPosition(current, false)
        }
        invalidate()
        requestLayout()
    }

    private fun getDescriptionPosition(): Int {
        val centerTop = (_listView.measuredHeight - _listView.itemHeight + entryMinSpacing) / 2
        return _listView.top + centerTop + _listView.itemHeight - _descriptionView.measuredHeight - entryMinSpacing
    }
}
