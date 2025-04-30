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
import android.util.LayoutDirection
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.DrawableCompat
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.CancelableFontCallback
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.shader.CachedShaderFactory
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.setColorValue
import kotlin.math.roundToInt

/**
 * [Drawable] базовый рисующий компонент.
 * @param context контекст
 * @param attrs аттрибуты
 * @param defStyleAttr аттрибут стиля по умолчанию
 */
open class TextDrawable(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_textDrawableStyle,
    defStyleRes: Int = R.style.Sdds_Components_TextDrawable,
) : ShapeDrawable(context, attrs, defStyleAttr, defStyleRes) {

    /**
     * Делегат для родителя, которая рисует [TextDrawable]
     */
    interface Delegate {

        /**
         * Колбэк изменения размера [TextDrawable]
         */
        fun onDrawableSizeChange()
    }

    /**
     * Выравнивание текста
     */
    enum class TextAlignment {
        START, CENTER, END
    }

    private var _drawableStart: Drawable? = null
    private var _drawableStartTint: ColorStateList? = null
    private var _drawableEnd: Drawable? = null
    private var _drawableEndTint: ColorStateList? = null
    private var _contentDrawableSize: Int = 0
    private var _contentStartSize: Int = 0
    private var _contentEndSize: Int = 0

    private var _paddingLeft: Int = 0
    private var _paddingRight: Int = 0
    private var _paddingTop: Int = 0
    private var _paddingBottom: Int = 0

    private val contentStartBounds = Rect()
    private val contentEndBounds = Rect()

    private var _text: CharSequence = ""
    private var _textLayout: StaticLayout? = null
    private var _textPaddingStart: Int = 0
    private var _textPaddingEnd: Int = 0
    private var _textColor: ColorValueStateList? = null
    private val textBounds = Rect()
    private val textPaint = TextPaint().configure(isAntiAlias = true)
    private var _fontCallback: CancelableFontCallback? = null
    private var _delegate: Delegate? = null
    private var _lineHeight: Float = 0f
    private var _textAlignment: TextAlignment = TextAlignment.CENTER
    private val _shaderFactoryDelegate: CachedShaderFactory = CachedShaderFactory.create()

    private val _textWidth: Int
        get() = if (_text.isNotBlank()) {
            textPaint.measureText(text, 0, text.length).roundToInt()
        } else {
            0
        }

    /**
     * Текст
     */
    var text: CharSequence
        get() = _text
        set(value) {
            if (_text != value) {
                val oldWidth = _textWidth
                _text = value
                val newWidth = _textWidth
                updateTextLayout(true)
                invalidateSelf()
                if (oldWidth != newWidth) {
                    _delegate?.onDrawableSizeChange()
                }
            }
        }

    /**
     * [Drawable] в начале компонента
     */
    var drawableStart: Drawable?
        get() = _drawableStart
        set(value) {
            if (_drawableStart != value) {
                _drawableStart?.callback = null
                val oldWidth = drawableStart.safeWidth(_contentStartSize)
                _drawableStart = value
                val newWidth = drawableStart.safeWidth(_contentStartSize)
                _drawableStart.applyChild(_drawableStartTint)
                onSizeChanged(oldWidth != newWidth)
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
                _drawableEnd?.callback = null
                val oldWidth = _drawableEnd.safeWidth(_contentEndSize)
                _drawableEnd = value
                val newWidth = _drawableEnd.safeWidth(_contentEndSize)
                _drawableEnd.applyChild(_drawableEndTint)
                onSizeChanged(oldWidth != newWidth)
                invalidateSelf()
            }
        }

    /**
     * Выравнивание текста
     */
    var textAlignment: TextAlignment
        get() = _textAlignment
        set(value) {
            if (_textAlignment != value) {
                _textAlignment = value
                updateTextBounds()
                invalidateSelf()
            }
        }

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
    }

    /**
     * Устанавливает [Delegate] для [TextDrawable]
     */
    fun setDelegate(delegate: Delegate?) {
        _delegate = delegate
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorStateList?) {
        setTextColor(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    open fun setTextColor(colors: ColorValueStateList?) {
        if (_textColor != colors) {
            _textColor = colors
            resetTextColor()
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
        _fontCallback = textPaint.applyTextAppearance(
            context = context,
            styleId = appearanceId,
            tCallback = { textAppearance ->
                _lineHeight = textAppearance.lineHeight
            },
        ) {
            onSizeChanged(true)
        }
        _textColor?.let { _ ->
            resetTextColor()
        }
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
        _drawableStartTint = tint
        _drawableStart?.applyChild(tint)
    }

    /**
     * Устанавливает цвета [Drawable] в конце
     * @param tint цвета [Drawable] в конце
     */
    fun setDrawableEndTint(tint: ColorStateList?) {
        _drawableEndTint = tint
        _drawableEnd.applyChild(tint)
    }

    /**
     * Устанавливает внутренние отступы
     * @param paddingLeft отступ слева
     * @param paddingTop отступ сверху
     * @param paddingRight отступ справа
     * @param paddingBottom отступ снизу
     */
    fun setPaddingsRelative(
        paddingStart: Int = 0,
        paddingTop: Int = 0,
        paddingEnd: Int = 0,
        paddingBottom: Int = 0,
    ) {
        val paddingLeft = if (layoutDirection == LayoutDirection.LTR) paddingStart else paddingEnd
        val paddingRight = if (layoutDirection == LayoutDirection.LTR) paddingEnd else paddingStart
        setPaddings(paddingLeft, paddingTop, paddingRight, paddingBottom)
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
        var stateChanged = resetTextColor()
        stateChanged = (_drawableStart?.setState(state) == true) || stateChanged
        stateChanged = (_drawableEnd?.setState(state) == true) || stateChanged
        if (stateChanged) {
            invalidateSelf()
        }
        return super.onStateChange(state) || stateChanged
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        updateDrawableStartBounds()
        updateDrawableEndBounds()
        updateTextLayout()
        resetTextColor()
    }

    override fun getIntrinsicWidth(): Int {
        return (
            _paddingLeft +
                _paddingRight +
                getTextPaddingStart() +
                getTextPaddingEnd() +
                _drawableStart.safeWidth(_contentStartSize) +
                _textWidth +
                _drawableEnd.safeWidth(_contentEndSize)
            )
    }

    override fun getIntrinsicHeight(): Int {
        return _paddingTop + _paddingBottom + maxOf(
            _drawableStart.safeHeight(_contentStartSize),
            textBounds.height(),
            _drawableEnd.safeHeight(_contentEndSize),
        )
    }

    override fun isStateful(): Boolean {
        return super.isStateful() ||
            (_textColor?.isStateful() == true) ||
            (drawableStart?.isStateful == true) ||
            (drawableEnd?.isStateful == true)
    }

    private fun resetTextColor(): Boolean {
        _shaderFactoryDelegate.updateBounds(textBounds)
        return textPaint.setColorValue(_textColor, state, _shaderFactoryDelegate)
    }

    private fun onSizeChanged(updateParent: Boolean) {
        updateDrawableStartBounds()
        updateDrawableEndBounds()
        updateTextLayout()
        resetTextColor()
        if (updateParent) _delegate?.onDrawableSizeChange()
    }

    private fun Drawable?.safeWidth(drawableSize: Int = 0) =
        when {
            drawableSize != 0 && this != null -> drawableSize
            _contentDrawableSize != 0 && this != null -> _contentDrawableSize
            else -> this?.intrinsicWidth ?: 0
        }

    private fun Drawable?.safeHeight(drawableSize: Int = 0) =
        when {
            drawableSize != 0 && this != null -> drawableSize
            _contentDrawableSize != 0 && this != null -> _contentDrawableSize
            else -> this?.intrinsicHeight ?: 0
        }

    private fun getTextPaddingStart(): Int =
        (_textPaddingStart.takeIf { drawableStart != null && _textWidth > 0 } ?: 0)

    private fun getTextPaddingEnd(): Int =
        (_textPaddingEnd.takeIf { drawableEnd != null && _textWidth > 0 } ?: 0)

    private fun updateTextLayout(force: Boolean = false) {
        if (text.isEmpty()) {
            _textLayout = null
            textBounds.set(0, 0, 0, 0)
            return
        }
        // Text bounds
        val width = (
            bounds.width() -
                getTextPaddingStart() -
                getTextPaddingEnd() -
                _paddingLeft -
                _paddingRight -
                contentStartBounds.width() -
                contentEndBounds.width()
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

    private fun updateDrawableStartBounds() {
        // Content start bounds
        if (_drawableStart != null) {
            contentStartBounds.set(
                bounds.left + _paddingLeft,
                bounds.centerY() - _drawableStart.safeHeight(_contentStartSize) / 2,
                bounds.left + _paddingLeft + _drawableStart.safeWidth(_contentStartSize),
                bounds.centerY() + _drawableStart.safeHeight(_contentStartSize) / 2,
            )
            _drawableStart?.bounds = contentStartBounds
        } else {
            contentStartBounds.set(0, 0, 0, 0)
        }
    }

    private fun updateDrawableEndBounds() {
        // Content end bounds
        if (_drawableEnd != null) {
            contentEndBounds.set(
                bounds.right - _paddingRight - _drawableEnd.safeWidth(_contentEndSize),
                bounds.centerY() - _drawableEnd.safeHeight(_contentEndSize) / 2,
                bounds.right - _paddingRight,
                bounds.centerY() + _drawableEnd.safeHeight(_contentEndSize) / 2,
            )
            _drawableEnd?.bounds = contentEndBounds
        } else {
            contentEndBounds.set(0, 0, 0, 0)
        }
    }

    private fun updateTextBounds() {
        if (text.isEmpty()) {
            textBounds.set(0, 0, 0, 0)
            return
        }
        _textLayout?.getLineBounds(0, textBounds)
        val textPositionWithoutDrawable = when (textAlignment) {
            TextAlignment.START -> bounds.left + _paddingLeft
            TextAlignment.CENTER -> bounds.centerX() - textBounds.width() / 2
            TextAlignment.END -> bounds.right - _paddingRight - textBounds.width()
        }
        val offsetLeft = when {
            _drawableStart != null -> maxOf(
                contentStartBounds.right + _textPaddingStart,
                textPositionWithoutDrawable,
            )
            _drawableEnd != null -> minOf(
                contentEndBounds.left - _textPaddingEnd - textBounds.width(),
                textPositionWithoutDrawable,
            )

            else -> textPositionWithoutDrawable
        }
        textBounds.offsetTo(
            offsetLeft,
            maxOf(bounds.centerY() - textBounds.height() / 2, bounds.top + _paddingTop),
        )
    }

    @Suppress("PrivateResource")
    private fun obtainAttributes(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.TextDrawable,
            defStyleAttr,
            defStyleRes,
        )
        text = typedArray.getString(R.styleable.TextDrawable_android_text).orEmpty()
        setTextAppearance(
            context,
            typedArray.getResourceId(R.styleable.TextDrawable_android_textAppearance, 0),
        )
        val textColor = typedArray.getColorStateList(R.styleable.TextDrawable_android_textColor)
        val sdTextColor =
            typedArray.getColorValueStateList(context, R.styleable.TextDrawable_sd_textColor)
                ?: textColor?.let { ColorValueStateList.valueOf(it) }
        setTextColor(sdTextColor)
        _textPaddingStart =
            typedArray.getDimensionPixelSize(R.styleable.TextDrawable_sd_textPaddingStart, 0)
        _textPaddingEnd =
            typedArray.getDimensionPixelSize(R.styleable.TextDrawable_sd_textPaddingEnd, 0)

        drawableStart = typedArray.getDrawable(R.styleable.TextDrawable_android_drawableStart)
        drawableEnd = typedArray.getDrawable(R.styleable.TextDrawable_android_drawableEnd)
        setTintList(
            typedArray.getColorStateList(R.styleable.TextDrawable_android_backgroundTint)
                ?: typedArray.getColorStateList(R.styleable.TextDrawable_backgroundTint),
        )
        setDrawableStartTint(
            typedArray.getColorStateList(R.styleable.TextDrawable_sd_drawableStartTint) ?: textColor,
        )
        setDrawableEndTint(
            typedArray.getColorStateList(R.styleable.TextDrawable_sd_drawableEndTint) ?: textColor,
        )
        _contentDrawableSize =
            typedArray.getDimensionPixelSize(R.styleable.TextDrawable_sd_drawableSize, 0)
        _contentStartSize =
            typedArray.getDimensionPixelSize(R.styleable.TextDrawable_sd_contentStartSize, 0)
        _contentEndSize =
            typedArray.getDimensionPixelSize(R.styleable.TextDrawable_sd_contentEndSize, 0)
        _textAlignment = TextAlignment.values().getOrElse(
            typedArray.getInt(
                R.styleable.TextDrawable_sd_textAlignment,
                TextAlignment.CENTER.ordinal,
            ),
        ) { TextAlignment.CENTER }
        typedArray.recycle()
    }

    private fun Drawable?.applyChild(tint: ColorStateList?) {
        if (this == null) return
        callback = callback
        DrawableCompat.setLayoutDirection(this, DrawableCompat.getLayoutDirection(this))
        level = level
        setVisible(isVisible, false)
        DrawableCompat.setTintList(this, tint)
        if (isStateful) {
            state = this@TextDrawable.state
        }
    }
}
