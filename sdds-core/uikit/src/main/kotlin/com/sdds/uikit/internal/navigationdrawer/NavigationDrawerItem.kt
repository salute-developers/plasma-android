package com.sdds.uikit.internal.navigationdrawer

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.core.content.res.use
import androidx.core.view.isVisible
import com.sdds.uikit.Counter
import com.sdds.uikit.FrameLayout
import com.sdds.uikit.ImageView
import com.sdds.uikit.ListItemView
import com.sdds.uikit.NavigationDrawer.Companion.STATE_EXPANDED
import com.sdds.uikit.NavigationDrawer.Item
import com.sdds.uikit.R
import com.sdds.uikit.TextView
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.AnimationUtils.blendColors
import com.sdds.uikit.internal.base.colorForState

@Suppress("ViewConstructor")
internal class NavigationDrawerItem(
    context: Context,
    @StyleRes style: Int,
) : ListItemView(context, null, 0, style) {

    private val _iconView: ImageView
    private val _titleView: TextView
    private val _startContainer: FrameLayout
    private var _counter: Counter? = null

    private var _isExpanded: Boolean = true
    private var _counterEnabled: Boolean = false
    private var _counterOffsetX: Float = 0f
    private var _counterOffsetY: Float = 0f
    private var _counterText: CharSequence? = null

    @StyleRes
    private var _expandedCounterStyle: Int = 0
    private var _collapsedCounterStyle: Int = 0

    private var _iconTint: ColorStateList? = null
    private var _textColor: ColorStateList? = null

    @ColorInt
    private var _currentIconColor: Int = 0

    @ColorInt
    private var _currentTextColor: Int = 0

    private val drawableStatAnimator: ValueAnimator = ValueAnimator.ofFloat(0f, 1f).apply {
        duration = AnimationUtils.DEFAULT_DURATION
        interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
    }

    var isExpanded: Boolean
        get() = _isExpanded
        set(value) {
            if (_isExpanded != value) {
                _isExpanded = value
                resetCounter(true)
                _titleView.isVisible = value
                invalidate()
                requestLayout()
            }
        }

    var counterText: CharSequence?
        get() = _counterText
        set(value) {
            if (_counterText != value) {
                _counterText = value
                updateCounter()
            }
        }

    var counterEnabled: Boolean
        get() = _counterEnabled
        set(value) {
            if (_counterEnabled != value) {
                _counterEnabled = value
                _startContainer.isVisible = icon != null || _counterEnabled
                resetCounter()
            }
        }

    var icon: Drawable?
        get() = _iconView.drawable
        set(value) {
            _iconView.setImageDrawable(value)
            _iconView.isVisible = value != null
            _startContainer.isVisible = value != null || _counterEnabled
        }

    var text: CharSequence?
        get() = _titleView.text
        set(value) {
            _titleView.text = value
        }

    init {
        inflate(context, R.layout.sd_layout_navigation_item_view, this)
        _startContainer = findViewById(R.id.navigation_drawer_item_start_container)
        _iconView = findViewById(R.id.navigation_drawer_item_icon)
        _titleView = findViewById(R.id.navigation_drawer_item_title)
        context.obtainStyledAttributes(style, R.styleable.NavigationDrawerItem).use {
            setIconTint(it.getColorStateList(R.styleable.NavigationDrawerItem_sd_iconTint))
            val textColor = it.getColorStateList(R.styleable.NavigationDrawerItem_android_textColor)
            if (textColor != null) setTextColor(textColor)
            setTextAppearance(it.getResourceId(R.styleable.NavigationDrawerItem_android_textAppearance, 0))
            _expandedCounterStyle = it.getResourceId(R.styleable.NavigationDrawerItem_sd_expandedCounterStyle, 0)
            _collapsedCounterStyle = it.getResourceId(R.styleable.NavigationDrawerItem_sd_collapsedCounterStyle, 0)
            counterEnabled = it.getBoolean(R.styleable.NavigationDrawerItem_sd_counterEnabled, false)
            _counterOffsetX = it.getDimension(R.styleable.NavigationDrawerItem_sd_collapsedCounterOffsetX, 0f)
            _counterOffsetY = it.getDimension(R.styleable.NavigationDrawerItem_sd_collapsedCounterOffsetY, 0f)
        }
        resetCounter()
    }

    fun setIconBitmap(bitmap: Bitmap) {
        _iconView.setImageBitmap(bitmap)
    }

    fun setIconTint(tint: ColorStateList?) {
        _iconTint = tint
        _currentIconColor = tint.colorForState(drawableState)
        _iconView.imageTintList = tint
    }

    fun setText(@StringRes textRes: Int) {
        text = context.resources.getText(textRes)
    }

    fun setTextAppearance(@StyleRes appearance: Int) {
        _titleView.setTextAppearance(appearance)
    }

    fun setTextColor(color: ColorStateList) {
        _textColor = color
        _currentTextColor = color.colorForState(drawableState)
        _titleView.setTextColor(color)
    }

    fun setTextColor(@ColorInt color: Int) {
        setTextColor(ColorStateList.valueOf(color))
    }

    override fun drawableStateChanged() {
        drawableStatAnimator.cancel()
        val oldIconColor = _currentIconColor
        val oldTextColor = _currentTextColor
        super.drawableStateChanged()
        drawableStatAnimator.apply {
            removeAllUpdateListeners()
            animateColor(oldTextColor, _textColor.colorForState(drawableState)) {
                _currentTextColor = it
                _titleView.setTextColor(_currentTextColor)
            }
            animateColor(oldIconColor, _iconTint.colorForState(drawableState)) {
                _currentIconColor = it
                _iconView.imageTintList = ColorStateList.valueOf(_currentIconColor)
            }
            start()
        }
    }

    private fun resetCounter(force: Boolean = false) {
        _counter?.let {
            removeView(it)
            _startContainer.removeView(it)
        }
        if (!counterEnabled) {
            _counter = null
            return
        }
        if (isExpanded) {
            addView(
                getCounter(force),
                LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                ).apply {
                    cellContent = CellContent.END
                },
            )
        } else {
            _startContainer.addView(
                getCounter(force),
                MarginLayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                ).apply {
                    gravity = Gravity.CENTER
                },
            )
        }
        updateCounter()
    }

    private fun getCounter(force: Boolean = false): Counter {
        val currentCounter = _counter
        val counter = if (currentCounter == null || force) {
            val counterStyle = if (isExpanded) _expandedCounterStyle else _collapsedCounterStyle
            if (counterStyle != 0) {
                Counter(context, null, 0, defStyleRes = counterStyle)
            } else {
                Counter(context)
            }
        } else {
            currentCounter
        }
        _counter = counter
        return counter
    }

    private fun updateCounter() {
        getCounter()
            .apply {
                text = _counterText ?: ""
                if (!isExpanded) {
                    translationX = if (!isExpanded) _counterOffsetX else 0f
                    translationY = if (!isExpanded) _counterOffsetY else 0f
                }
            }
    }

    companion object {
        fun NavigationDrawerItem.bindItem(item: Item, drawerState: Int): NavigationDrawerItem = apply {
            icon = item.icon
            if (item.iconBitmap != null) {
                setIconBitmap(item.iconBitmap)
            }
            text = item.title
            isExpanded = drawerState == STATE_EXPANDED
            counterText = item.counter
            counterEnabled = !item.counter.isNullOrBlank()
        }

        private fun ValueAnimator.animateColor(from: Int, to: Int, apply: (Int) -> Unit) {
            if (from == to) {
                apply(to)
                return
            }
            addUpdateListener {
                apply(blendColors(from, to, it.animatedFraction))
            }
        }
    }
}
