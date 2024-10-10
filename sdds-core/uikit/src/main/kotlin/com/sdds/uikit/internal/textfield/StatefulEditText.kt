package com.sdds.uikit.internal.textfield

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.InputFilter
import android.text.TextPaint
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.TextView
import androidx.annotation.StyleRes
import androidx.appcompat.widget.AppCompatEditText
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder
import kotlin.math.roundToInt

/**
 * [AppCompatEditText] с поддержкой [ViewState]
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 21.06.2024
 */
internal class StatefulEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle,
) : AppCompatEditText(context, attrs, defStyleAttr), ViewStateHolder {

    private var _currentImeAction: Int = 0
    private val keyListener = KeyListener()
    private val editorListener = EditorListener()
    private var _keyHandled: Boolean = false

    private var _suffixDrawable: Drawable? = null
    private var _prefixDrawable: Drawable? = null
    private var _previousFilters: Array<out InputFilter>? = null
    private var _valueTextAppearance: Int = 0

    private val readOnlyFilter = InputFilter { source, _, _, dest, dstart, dend ->
        dest.subSequence(dstart, dend)
    }

    /**
     * Состояние внешнего вида текста
     * @see ViewState
     */
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Устанавливает [StatefulEditText] в режим "Только для чтения"
     */
    var isReadOnly: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                updateReadOnlyState()
                refreshDrawableState()
            }
        }

    var allowBreakLines: Boolean = true

    var placeholderEnabled: Boolean = true
        set(value) {
            if (field != value) {
                field = value
                resetHint()
            }
        }

    var placeholder: CharSequence? = null
        set(value) {
            if (field != value) {
                field = value
                resetHint()
            }
        }

    var prefix: Drawable?
        get() = _prefixDrawable
        set(value) {
            if (_prefixDrawable != value) {
                _prefixDrawable = value
                updatePrefixSuffixDrawable()
            }
        }

    var suffix: Drawable?
        get() = _suffixDrawable
        set(value) {
            if (_suffixDrawable != value) {
                _suffixDrawable = value
                updatePrefixSuffixDrawable()
            }
        }

    var prefixText: CharSequence?
        get() = prefix?.getText()
        set(value) {
            if (value.isNullOrBlank()) {
                prefix = null
            } else if (prefix == null) {
                prefix = TextDrawable(value)
            } else {
                prefix?.tryUpdateText(value)
            }
            updatePrefixSuffixDrawable()
        }

    var suffixText: CharSequence?
        get() = suffix?.getText()
        set(value) {
            if (value.isNullOrBlank()) {
                suffix = null
            } else if (suffix == null) {
                suffix = TextDrawable(value)
            } else {
                suffix?.tryUpdateText(value)
            }
            updatePrefixSuffixDrawable()
        }

    init {
        super.setOnKeyListener(keyListener)
        super.setOnEditorActionListener(editorListener)
        updatePrefixSuffixDrawable()
    }

    /**
     * Возвращает true если [StatefulEditText] однострочный
     */
    fun singleLine(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            isSingleLine
        } else {
            !isMultilineInputType() && maxLines == 1
        }
    }

    /**
     * Возвращает true если [StatefulEditText] есть префикс
     */
    fun hasPrefix(): Boolean {
        return if (prefix is TextDrawable) !prefixText.isNullOrBlank() else prefix != null
    }

    /**
     * Возвращает true если [StatefulEditText] есть суффикс
     */
    fun hasSuffix(): Boolean {
        return if (suffix is TextDrawable) !suffixText.isNullOrBlank() else suffix != null
    }

    /**
     * Устанавливает цвета [colors] для [placeholder]
     */
    fun setPlaceholderColors(colors: ColorStateList?) {
        setHintTextColor(colors)
        updatePrefixSuffixDrawable()
    }

    override fun setTextAppearance(resId: Int) {
        super.setTextAppearance(resId)
        _valueTextAppearance = resId
        updatePrefixSuffixDrawable()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _previousFilters = null
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        minWidth = if (singleLine() && !placeholder.isNullOrEmpty()) {
            compoundPaddingStart + compoundPaddingEnd + paint.measureText(placeholder?.toString().orEmpty()).toInt()
        } else {
            compoundPaddingStart + compoundPaddingEnd + paint.measureText(DUMMY_MEASURE_TEXT).toInt()
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        updateSuffixPrefixPosition()
    }

    override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
        updateSuffixPrefixPosition()
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        if (isReadOnly) {
            mergeDrawableStates(drawableState, intArrayOf(R.attr.sd_state_readonly))
        }
        return drawableState
    }

    override fun setOnKeyListener(l: OnKeyListener?) {
        keyListener.userKeyListener = l
    }

    override fun setOnEditorActionListener(l: OnEditorActionListener?) {
        editorListener.userListener = l
    }

    override fun onCreateInputConnection(outAttrs: EditorInfo?): InputConnection? {
        val connection = super.onCreateInputConnection(outAttrs)
        if (!allowBreakLines) {
            outAttrs?.apply {
                imeOptions = imeOptions and EditorInfo.IME_FLAG_NO_ENTER_ACTION.inv()
                _currentImeAction = imeOptions and EditorInfo.IME_MASK_ACTION
            }
        }
        return connection
    }

    private fun isMultilineInputType(): Boolean {
        val mask = (EditorInfo.TYPE_MASK_CLASS or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE)
        return inputType and mask == EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE
    }

    private fun updateReadOnlyState() {
        filters = if (isReadOnly) {
            _previousFilters = filters
            arrayOf(readOnlyFilter)
        } else {
            _previousFilters
        }
        showSoftInputOnFocus = !isReadOnly
        isCursorVisible = !isReadOnly
    }

    private fun updatePrefixSuffixDrawable() {
        (_prefixDrawable as? TextDrawable)?.apply {
            setTextAppearance(context, _valueTextAppearance)
            setTintList(hintTextColors)
        }
        (_suffixDrawable as? TextDrawable)?.apply {
            setTextAppearance(context, _valueTextAppearance)
            setTintList(hintTextColors)
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(
            _prefixDrawable,
            null,
            _suffixDrawable,
            null,
        )
        updateSuffixPrefixPosition()
        refreshDrawableState()
    }

    private fun updateSuffixPrefixPosition() {
        _prefixDrawable?.apply {
            val top = ((intrinsicHeight - measuredHeight) / 2)
            setBounds(
                0,
                top,
                intrinsicWidth,
                top + intrinsicHeight,
            )
        }

        _suffixDrawable?.apply {
            val suffixLeft = when {
                text.isNullOrBlank() && placeholderEnabled && !placeholder.isNullOrEmpty() -> 0
                layout != null -> layout.getLineWidth(lineCount - 1).toInt() - getAvailableLayoutWidth()
                else -> 0
            }
            val top = ((measuredHeight - intrinsicHeight) / 2)
            setBounds(
                suffixLeft,
                top,
                suffixLeft + intrinsicWidth,
                top + intrinsicHeight,
            )
        }
    }

    private fun getAvailableLayoutWidth() = measuredWidth - compoundPaddingStart - compoundPaddingEnd

    private fun resetHint() {
        if (placeholderEnabled) {
            super.setHint(placeholder)
        } else {
            super.setHint(null)
        }
        isCursorVisible = true
    }

    private inner class KeyListener : OnKeyListener {

        var userKeyListener: OnKeyListener? = null

        override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
            if (keyCode == KeyEvent.KEYCODE_ENTER && !singleLine()) {
                _keyHandled = userKeyListener?.onKey(v, keyCode, event) == true
                return _keyHandled || !allowBreakLines
            }
            return userKeyListener?.onKey(v, keyCode, event) == true
        }
    }

    private inner class EditorListener : OnEditorActionListener {

        var userListener: OnEditorActionListener? = null

        override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
            return (userListener?.onEditorAction(v, actionId, event) == true)
        }
    }

    internal class TextDrawable(text: CharSequence?) : Drawable() {

        private val _textPaint: TextPaint = TextPaint().configure(isAntiAlias = true)
        private val debug: Paint =
            Paint().configure(color = Color.MAGENTA, style = Paint.Style.STROKE, strokeWidth = 3f)
        private var _textColors: ColorStateList? = null
        private var _textBounds: Rect = Rect()

        var text: CharSequence? = text
            set(value) {
                if (field != value) {
                    field = value
                    invalidateSelf()
                }
            }

        fun setTextAppearance(context: Context, @StyleRes appearance: Int) {
            _textPaint.applyTextAppearance(context, appearance) {
                _textPaint.color = _textColors.colorForState(state)
                invalidateSelf()
            }
        }

        override fun draw(canvas: Canvas) {
            text?.toString()?.let {
                canvas.drawText(it, _textBounds.left.toFloat(), _textBounds.top.toFloat(), _textPaint)
            }
        }

        override fun setAlpha(alpha: Int) {
            _textPaint.alpha = alpha
        }

        override fun setColorFilter(colorFilter: ColorFilter?) {
            _textPaint.colorFilter = colorFilter
        }

        override fun getOpacity(): Int = PixelFormat.OPAQUE

        override fun setTintList(tint: ColorStateList?) {
            super.setTintList(tint)
            _textColors = tint
            _textPaint.color = _textColors.colorForState(state)
        }

        override fun onStateChange(state: IntArray): Boolean {
            var stateChanged = false
            val newColor = _textColors.colorForState(state)
            if (_textPaint.color != newColor) {
                _textPaint.color = newColor
                stateChanged = true
            }

            if (stateChanged) {
                invalidateSelf()
            }
            return super.onStateChange(state) || stateChanged
        }

        override fun onBoundsChange(bounds: Rect) {
            super.onBoundsChange(bounds)
            text?.toString()?.let { safeText ->
                _textPaint.getTextBounds(safeText, 0, safeText.length, _textBounds)
                _textBounds.offsetTo(
                    bounds.left,
                    bounds.centerY() - _textBounds.centerY(),
                )
            }
        }

        override fun getIntrinsicWidth(): Int {
            val measurableText = text?.toString() ?: return 0
            return _textPaint.measureText(measurableText).roundToInt()
        }

        override fun getIntrinsicHeight(): Int {
            return (_textPaint.fontMetrics.descent - _textPaint.fontMetrics.ascent).toInt()
        }

        override fun isStateful(): Boolean {
            return _textColors?.isStateful == true
        }
    }

    private companion object {

        const val DUMMY_MEASURE_TEXT = "M"

        fun Drawable.tryUpdateText(text: CharSequence?) {
            (this as? TextDrawable)?.text = text
        }

        fun Drawable.getText(): CharSequence? {
            return (this as? TextDrawable)?.text
        }
    }
}
