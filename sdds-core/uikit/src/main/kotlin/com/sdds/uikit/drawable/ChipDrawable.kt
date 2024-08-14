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
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.colorForState

/**
 * [Drawable] рисующий компонент Chip.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 29.07.2024
 */
open class ChipDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_chipStyle,
    defStyleRes: Int = R.style.Sdds_Components_Chip,
) : ShapeDrawable(context, attrs, defStyleAttr, defStyleRes) {

    private var _drawableStart: Drawable? = null
    private var _drawableEnd: Drawable? = null
    private var _contentDrawableSize: Int = 0

    private var _paddingLeft: Int = 0
    private var _paddingRight: Int = 0
    private var _paddingTop: Int = 0
    private var _paddingBottom: Int = 0

    private val contentStartBounds = Rect()
    private val contentEndBounds = Rect()

    private var _text: CharSequence = text
    private var _textLayout: StaticLayout? = null
    private var _textPaddingStart: Int = 0
    private var _textPaddingEnd: Int = 0
    private var _textColor: ColorStateList? = null
    private val textBounds = Rect()
    private val textPaint = TextPaint()

    private val _textWidth: Int
        get() = _textLayout?.ellipsizedWidth
            ?: textPaint.measureText(text, 0, text.length).toInt()

    private val _textHeight: Int
        get() = _textLayout?.height
            ?: (textPaint.fontMetrics.ascent - textPaint.fontMetrics.descent).toInt()

    /**
     * Текст
     */
    var text: CharSequence
        get() = _text
        set(value) {
            if (_text != value) {
                _text = value
                invalidateSelf()
            }
        }

    /**
     * [Drawable] в начале компонента
     */
    var drawableStart: Drawable?
        get() = _drawableStart
        set(value) {
            if (_drawableStart != value) {
                _drawableStart = value
                invalidateSelf()
            }
        }

    /**
     * [Drawable] в конце компонента
     */
    var drawableEnd: Drawable?
        get() = _drawableEnd
        set(value) {
            if (_drawableEnd != value) {
                _drawableEnd = value
                invalidateSelf()
            }
        }

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        updateTextLayout(_textWidth)
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
        textPaint.applyTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает [Drawable] в начале по идентификатору ресурса
     * @param context контекст
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableStartRes(context: Context, @DrawableRes drawableRes: Int) {
        drawableStart = AppCompatResources.getDrawable(context, drawableRes)
    }

    /**
     * Устанавливает [Drawable] в конце по идентификатору ресурса
     * @param context контекст
     * @param drawableRes идентификатор ресурса [Drawable]
     */
    fun setDrawableEndRes(context: Context, @DrawableRes drawableRes: Int) {
        drawableEnd = AppCompatResources.getDrawable(context, drawableRes)
    }

    /**
     * Устанавливает цвета [Drawable] в начале
     * @param tint цвета [Drawable] в начале
     */
    fun setDrawableStartTint(tint: ColorStateList?) {
        drawableStart?.mutate()?.apply {
            setTintList(tint)
        }
    }

    /**
     * Устанавливает цвета [Drawable] в конце
     * @param tint цвета [Drawable] в конце
     */
    fun setDrawableEndTint(tint: ColorStateList?) {
        drawableEnd?.mutate()?.apply {
            setTintList(tint)
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
        _drawableStart?.draw(canvas)

        val saveCount = canvas.save()
        canvas.translate(textBounds.left.toFloat(), textBounds.top.toFloat())
        _textLayout?.draw(canvas)

        canvas.restoreToCount(saveCount)

        _drawableEnd?.draw(canvas)
    }

    override fun onStateChange(state: IntArray): Boolean {
        val textColor = _textColor.colorForState(state)
        var stateChanged = false
        if (textPaint.color != textColor) {
            textPaint.color = textColor
            stateChanged = true
        }
        stateChanged = stateChanged or (_drawableStart?.setState(state) == true)
        stateChanged = stateChanged or (_drawableEnd?.setState(state) == true)
        return super.onStateChange(state) || stateChanged
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)

        // Content start bounds
        contentStartBounds.set(
            bounds.left + _paddingLeft,
            bounds.centerY() - _drawableStart.safeHeight() / 2,
            bounds.left + _paddingLeft + _drawableStart.safeWidth(),
            bounds.centerY() + _drawableStart.safeHeight() / 2,
        )
        _drawableStart?.bounds = contentStartBounds

        // Content end bounds
        contentEndBounds.set(
            bounds.right - _paddingRight - _drawableEnd.safeWidth(),
            bounds.centerY() - _drawableEnd.safeHeight() / 2,
            bounds.right - _paddingRight,
            bounds.centerY() + _drawableEnd.safeHeight() / 2,
        )
        _drawableEnd?.bounds = contentEndBounds

        // Text bounds
        val textWidth = (
            bounds.width() -
                _textPaddingStart -
                _textPaddingEnd -
                _paddingLeft -
                _paddingRight -
                contentStartBounds.width() -
                contentEndBounds.width()
            )
        updateTextLayout(textWidth)

        textBounds.offsetTo(
            contentStartBounds.right + _textPaddingStart,
            maxOf(bounds.centerY() - _textHeight / 2, _paddingTop),
        )
    }

    override fun getIntrinsicWidth(): Int {
        return (
            _paddingLeft +
                _paddingRight +
                _textPaddingStart +
                _textPaddingEnd +
                _drawableStart.safeWidth() +
                _textWidth +
                _drawableEnd.safeWidth()
            )
    }

    override fun getIntrinsicHeight(): Int {
        return _paddingTop + _paddingBottom + maxOf(
            _drawableStart.safeHeight(),
            _textHeight,
            _drawableEnd.safeHeight(),
        )
    }

    private fun Drawable?.safeWidth() =
        if (_contentDrawableSize != 0) _contentDrawableSize else this?.intrinsicWidth ?: 0

    private fun Drawable?.safeHeight() =
        if (_contentDrawableSize != 0) _contentDrawableSize else this?.intrinsicHeight ?: 0

    private fun updateTextLayout(width: Int) {
        if (_textLayout?.width == width || width < 0) {
            return
        }
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
            .also { it.getLineBounds(0, textBounds) }
    }

    @Suppress("PrivateResource")
    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Chip, defStyleAttr, defStyleRes)
        _text = typedArray.getString(R.styleable.Chip_android_text).orEmpty()
        setTextAppearance(context, typedArray.getResourceId(R.styleable.Chip_android_textAppearance, 0))
        val textColor = typedArray.getColorStateList(R.styleable.Chip_android_textColor)
        setTextColor(textColor)
        _textPaddingStart = typedArray.getDimensionPixelSize(R.styleable.Chip_sd_textPaddingStart, 0)
        _textPaddingEnd = typedArray.getDimensionPixelSize(R.styleable.Chip_sd_textPaddingEnd, 0)

        _drawableStart = typedArray.getDrawable(R.styleable.Chip_android_drawableStart)
        _drawableEnd = typedArray.getDrawable(R.styleable.Chip_android_drawableEnd)
        setTintList(
            typedArray.getColorStateList(R.styleable.Chip_android_backgroundTint)
                ?: typedArray.getColorStateList(R.styleable.Chip_backgroundTint),
        )
        setDrawableStartTint(typedArray.getColorStateList(R.styleable.Chip_sd_drawableStartTint) ?: textColor)
        setDrawableEndTint(typedArray.getColorStateList(R.styleable.Chip_sd_drawableEndTint) ?: textColor)
        typedArray.recycle()
    }
}
