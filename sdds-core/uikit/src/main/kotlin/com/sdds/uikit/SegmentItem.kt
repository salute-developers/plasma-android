package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import androidx.core.widget.TextViewCompat
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.drawable.CounterDrawable
import com.sdds.uikit.drawable.TextDrawable

/**
 * Компонент "SegmentItem".
 * Умеет отображать иконку, counter, а также два текста: основной и дополнительный.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class SegmentItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_segmentItemStyle,
) : Button(context, attrs, defStyleAttr), TextDrawable.Delegate {

    private var _counterDrawable: CounterDrawable? = null
    private var _counterPadding: Int = 0
    private var _isCounterEnabled: Boolean = false
    private var _counterState: ColorState? = null
    private var _contentStartSize: Int = 0
    private var _contentEndSize: Int = 0
    private var _iconSize: Int = 0
    private var _counterText: String = ""

    /**
     * Включение counter
     */
    open var isCounterEnabled
        get() = _isCounterEnabled
        set(value) {
            if (_isCounterEnabled != value) {
                _isCounterEnabled = value
                resetCompoundDrawables()
                refreshDrawableState()
            }
        }

    /**
     * Текст counter
     */
    open var counterText: CharSequence
        get() = _counterDrawable?.text ?: "0"
        set(value) {
            _counterDrawable?.text = value
            _counterDrawable?.setBounds(0, 0, getCounterWidth(), getCounterHeight())
            resetCompoundDrawables()
        }

    /**
     * Состояние внешнего вида SegmentItem
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Размер иконки внчале.
     */
    open var contentStartSize: Int
        get() = _contentStartSize
        set(value) {
            if (_contentStartSize != value) {
                _contentStartSize = value
                if (iconPosition == IconPosition.TextStart) {
                    iconSize = _contentStartSize
                }
            }
        }

    /**
     * Размер иконки вконце.
     */
    open var contentEndSize: Int
        get() = _contentEndSize
        set(value) {
            if (_contentEndSize != value) {
                _contentEndSize = value
                if (iconPosition == IconPosition.TextEnd) {
                    iconSize = _contentEndSize
                }
            }
        }

    override var iconPosition: IconPosition
        get() = super.iconPosition
        set(value) {
            if (super.iconPosition != value) {
                super.iconPosition = value
                iconSize = getActualIconSize()
            }
        }

    private fun getActualIconSize(): Int {
        return when (iconPosition) {
            IconPosition.TextStart -> if (_contentStartSize != 0) _contentStartSize else _iconSize
            IconPosition.TextEnd -> if (_contentEndSize != 0) _contentEndSize else _iconSize
        }
    }

    init {
        obtainAttributes(attrs, defStyleAttr)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (isCounterEnabled) {
            updateCounter(measuredWidth)
        }
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.SegmentItem, defStyleAttr, 0)
        _counterPadding = typedArray.getDimensionPixelSize(R.styleable.SegmentItem_sd_counterPadding, 0)
        val counterStyleAttr = typedArray.getResourceId(
            R.styleable.SegmentItem_sd_counterStyle,
            R.style.Sdds_Components_Counter,
        )
        _contentStartSize = typedArray.getDimensionPixelSize(R.styleable.SegmentItem_sd_contentStartSize, 0)
        _contentEndSize = typedArray.getDimensionPixelSize(R.styleable.SegmentItem_sd_contentEndSize, 0)
        _iconSize = typedArray.getDimensionPixelSize(R.styleable.SegmentItem_sd_iconSize, 0)
        _isCounterEnabled = typedArray.getBoolean(R.styleable.SegmentItem_sd_counterEnabled, false)
        _counterText = typedArray.getString(R.styleable.SegmentItem_sd_counterText) ?: "0"
        typedArray.recycle()
        iconSize = getActualIconSize()
        counterObtainAttributes(counterStyleAttr)
    }

    @Suppress("CustomViewStyleable")
    private fun counterObtainAttributes(counterStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(counterStyleAttr, R.styleable.Counter)
        val pLeft = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingLeft, 0)
        val pRight = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingRight, 0)
        val pTop = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingTop, 0)
        val pBottom = typedArray.getDimensionPixelSize(R.styleable.Counter_android_paddingBottom, 0)
        _counterState = ColorState.obtain(context, null, 0, counterStyleAttr)
        typedArray.recycle()
        _counterDrawable = CounterDrawable(
            context = context,
            attrs = null,
            0,
            counterStyleAttr,
        ).apply {
            callback = this@SegmentItem
            setDelegate(this@SegmentItem)
            setPaddings(pLeft, pTop, pRight, pBottom)
            drawableStart = null
            drawableEnd = null
        }
        counterText = _counterText
    }

    override fun onDrawableSizeChange() {
        requestLayout()
        invalidate()
    }

    private fun updateCounter(segmentWidth: Int) {
        val counterWidth = getCounterWidth()
        val counterHeight = getCounterHeight()
        val left = -((segmentWidth - getContentWidth()) / 2)
        val top = 0
        _counterDrawable?.setBounds(
            left,
            top,
            left + counterWidth,
            top + counterHeight,
        )
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateCounter(w)
    }

    override fun getCompoundPaddingLeft(): Int {
        val extraPadding = if (isCounterEnabled && layoutDirection == LAYOUT_DIRECTION_RTL) {
            getCounterPadding()
        } else {
            0
        }
        return super.getCompoundPaddingLeft() + extraPadding
    }

    override fun getCompoundPaddingRight(): Int {
        val extraPadding = if (isCounterEnabled && layoutDirection == LAYOUT_DIRECTION_LTR) {
            getCounterPadding()
        } else {
            0
        }
        return super.getCompoundPaddingRight() + extraPadding
    }

    private fun getCounterWidth(): Int {
        return _counterDrawable?.intrinsicWidth ?: 0
    }

    private fun getCounterHeight(): Int {
        return _counterDrawable?.intrinsicHeight ?: 0
    }

    private fun getCounterPadding(): Int {
        return if (hasContent()) _counterPadding else 0
    }

    private fun hasContent(): Boolean {
        return icon != null || !text.isNullOrBlank()
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        if (_counterState?.isDefined() == true) {
            _counterDrawable?.state = drawableState
        }
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (_counterState?.isDefined() == true) {
            mergeDrawableStates(drawableState, _counterState!!.attrs)
        }
        return drawableState
    }

    override fun resetCompoundDrawables() {
        val existingDrawables = TextViewCompat.getCompoundDrawablesRelative(this)
        val drawableTop = existingDrawables[1]
        val drawableBottom = existingDrawables[3]
        when {
            isCounterEnabled -> {
                if (iconPosition == IconPosition.TextStart) {
                    TextViewCompat.setCompoundDrawablesRelative(
                        this,
                        icon,
                        drawableTop,
                        _counterDrawable,
                        drawableBottom,
                    )
                } else {
                    TextViewCompat.setCompoundDrawablesRelative(
                        this,
                        null,
                        drawableTop,
                        _counterDrawable,
                        drawableBottom,
                    )
                }
            }

            icon != null && !isCounterEnabled -> super.resetCompoundDrawables()
            else -> TextViewCompat.setCompoundDrawablesRelative(
                this,
                null,
                drawableTop,
                null,
                drawableBottom,
            )
        }
    }

    override fun toggle() {
        isChecked = isChecked || isCheckable
    }
}
