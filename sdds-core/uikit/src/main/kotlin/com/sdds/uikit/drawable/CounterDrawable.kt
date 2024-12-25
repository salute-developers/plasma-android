package com.sdds.uikit.drawable

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.text.TextUtils
import android.util.AttributeSet
import androidx.annotation.StyleRes
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.CancelableFontCallback
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.shape.ShapeDrawable
import kotlin.math.roundToInt

/**
 * [Drawable] рисующий компонент Counter.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class CounterDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_counterStyle,
    defStyleRes: Int = R.style.Sdds_Components_Counter,
) : ShapeDrawable(context, attrs, defStyleAttr, defStyleRes) {

    /**
     * Делегат для родителя, которая рисует [CounterDrawable]
     */
    interface Delegate {

        /**
         * Колбэк изменения размера [CounterDrawable]
         */
        fun onCounterDrawableSizeChange()
    }

    private var _paddingLeft: Int = 0
    private var _paddingRight: Int = 0
    private var _paddingTop: Int = 0
    private var _paddingBottom: Int = 0
    private var _text: CharSequence = ""
    private var _textLayout: StaticLayout? = null
    private var _textColor: ColorStateList? = null
    private val textBounds = Rect()
    private val textPaint = TextPaint().configure(isAntiAlias = true)
    private var _fontCallback: CancelableFontCallback? = null
    private var _delegate: Delegate? = null

    private val _textWidth: Int
        get() = if (_text.isNotBlank()) {
            textPaint.measureText(text, 0, text.length).roundToInt()
        } else {
            0
        }

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
    }

    /**
     * Текст
     */
    var text: CharSequence
        get() = _text
        set(value) {
            if (_text != value && value.matches(Regex("[0-9]+"))) {
                val oldWidth = _textWidth
                _text = value
                val newWidth = _textWidth
                updateTextLayout(true)
                invalidateSelf()
                if (oldWidth != newWidth) {
                    _delegate?.onCounterDrawableSizeChange()
                }
            }
        }

    /**
     * Устанавливает [Delegate] для [CounterDrawable]
     */
    fun setDelegate(delegate: Delegate?) {
        _delegate = delegate
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        if (_textColor != colors) {
            _textColor = colors
            textPaint.color = colors.colorForState(state)
            invalidateSelf()
        }
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param context контекст
     * @param appearanceId идентификатор стиля текста
     */
    open fun setTextAppearance(context: Context, @StyleRes appearanceId: Int) {
        _fontCallback?.cancel()
        _fontCallback = textPaint.applyTextAppearance(context, appearanceId) {
            onSizeChanged(true)
        }
    }

    /**
     * Устанавливает внутренние отступы
     * @param paddingLeft отступ слева
     * @param paddingTop отступ сверху
     * @param paddingRight отступ справа
     * @param paddingBottom отступ снизу
     */
    fun setPaddings(
        paddingLeft: Int = _paddingLeft,
        paddingTop: Int = _paddingTop,
        paddingRight: Int = _paddingRight,
        paddingBottom: Int = _paddingBottom,
    ) {
        var invalidate = false
        if (_paddingLeft != paddingLeft) {
            _paddingLeft = paddingLeft
            invalidate = true
        }

        if (_paddingTop != paddingTop) {
            _paddingTop = paddingTop
            invalidate = true
        }

        if (_paddingRight != paddingRight) {
            _paddingRight = paddingRight
            invalidate = true
        }

        if (_paddingBottom != paddingBottom) {
            _paddingBottom = paddingBottom
            invalidate = true
        }

        if (invalidate) {
            onBoundsChange(bounds)
            invalidateSelf()
        }
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        val saveCount = canvas.save()
        canvas.translate(textBounds.left.toFloat(), textBounds.top.toFloat())
        _textLayout?.draw(canvas)
        canvas.restoreToCount(saveCount)
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        updateTextLayout()
    }

    override fun onStateChange(state: IntArray): Boolean {
        val textColor = _textColor.colorForState(state)
        var stateChanged = false
        if (textPaint.color != textColor) {
            textPaint.color = textColor
            stateChanged = true
        }
        if (stateChanged) {
            invalidateSelf()
        }
        return super.onStateChange(state) || stateChanged
    }

    private fun onSizeChanged(updateParent: Boolean) {
        updateTextLayout()
        if (updateParent) _delegate?.onCounterDrawableSizeChange()
    }

    private fun updateTextLayout(force: Boolean = false) {
        if (text.isEmpty()) {
            _textLayout = null
            textBounds.set(0, 0, 0, 0)
            return
        }
        // Text bounds
        val width = (
            bounds.width() - _paddingLeft - _paddingRight
            ).coerceAtLeast(0)

        if (force || (_textLayout?.width != width && width > 0)) {
            _textLayout = StaticLayout.Builder
                .obtain(
                    text,
                    0,
                    text.length,
                    textPaint,
                    width,
                )
                .setMaxLines(1)
                .setIncludePad(false)
                .setEllipsize(TextUtils.TruncateAt.END)
                .setAlignment(Layout.Alignment.ALIGN_CENTER)
                .build()
        }
        updateTextBounds()
    }

    override fun getIntrinsicWidth(): Int {
        return _paddingLeft + _paddingRight + _textWidth
    }

    override fun getIntrinsicHeight(): Int {
        return _paddingTop + _paddingBottom + textBounds.height()
    }

    private fun updateTextBounds() {
        if (text.isEmpty()) {
            textBounds.set(0, 0, 0, 0)
            return
        }
        _textLayout?.getLineBounds(0, textBounds)
        val offsetLeft = bounds.centerX() - textBounds.width() / 2
        textBounds.offsetTo(
            offsetLeft,
            maxOf(bounds.centerY() - textBounds.height() / 2, _paddingTop),
        )
    }

    @Suppress("PrivateResource")
    private fun obtainAttributes(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) {
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.Counter, defStyleAttr, defStyleRes)
        text = typedArray.getString(R.styleable.Counter_android_text).orEmpty()
        setTextAppearance(
            context,
            typedArray.getResourceId(R.styleable.Counter_android_textAppearance, 0),
        )
        val textColor = typedArray.getColorStateList(R.styleable.Counter_android_textColor)
        setTextColor(textColor)
        setTintList(
            typedArray.getColorStateList(R.styleable.Counter_android_backgroundTint)
                ?: typedArray.getColorStateList(R.styleable.Counter_backgroundTint),
        )
        typedArray.recycle()
    }
}
