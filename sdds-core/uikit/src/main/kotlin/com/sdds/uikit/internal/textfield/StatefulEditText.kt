package com.sdds.uikit.internal.textfield

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.InputFilter
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import com.sdds.uikit.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.viewstate.ViewState

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
) : AppCompatEditText(context, attrs, defStyleAttr), ColorStateHolder {

    private var _currentImeAction: Int = 0
    private val keyListener = KeyListener()
    private val editorListener = EditorListener()
    private var _keyHandled: Boolean = false

    private var _suffixDrawable: Drawable? = null
    private var _prefixDrawable: Drawable? = null
    private var _previousFilters: Array<out InputFilter>? = null
    private var _valueTextAppearance: Int = 0
    private var _prefixPadding: Int = 0
    private var _suffixPadding: Int = 0

    private val readOnlyFilter = InputFilter { source, _, _, dest, dstart, dend ->
        dest.subSequence(dstart, dend)
    }

    /**
     * Состояние внешнего вида текста
     * @see ViewState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
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
                prefix = TextDrawable(context)
                    .apply { text = value }
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
                suffix = TextDrawable(context)
                    .apply { text = value }
            } else {
                suffix?.tryUpdateText(value)
            }
            updatePrefixSuffixDrawable()
        }

    var prefixTextPadding: Int
        get() = _prefixPadding
        set(value) {
            if (_prefixPadding != value) {
                _prefixPadding = value
                requestLayout()
            }
        }
    var suffixTextPadding: Int
        get() = _suffixPadding
        set(value) {
            if (_suffixPadding != value) {
                _suffixPadding = value
                requestLayout()
            }
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
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
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
            setTintList(null)
            setTextAppearance(context, _valueTextAppearance)
            setTextColor(hintTextColors)
            textAlignment = TextDrawable.TextAlignment.START
            tryUpdatePaddings(0, _prefixPadding)
        }
        (_suffixDrawable as? TextDrawable)?.apply {
            setTintList(null)
            setTextAppearance(context, _valueTextAppearance)
            setTextColor(hintTextColors)
            textAlignment = TextDrawable.TextAlignment.START
            tryUpdatePaddings(_suffixPadding, 0)
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

    private companion object {

        const val DUMMY_MEASURE_TEXT = "M"

        fun Drawable.tryUpdateText(text: CharSequence?) {
            (this as? TextDrawable)?.text = text ?: return
        }

        fun Drawable.tryUpdatePaddings(paddingStart: Int = 0, paddingEnd: Int = 0) {
            (this as? TextDrawable)?.apply {
                setPaddings(paddingStart, 0, paddingEnd, 0)
            }
        }

        fun Drawable.getText(): CharSequence? {
            return (this as? TextDrawable)?.text
        }
    }
}
