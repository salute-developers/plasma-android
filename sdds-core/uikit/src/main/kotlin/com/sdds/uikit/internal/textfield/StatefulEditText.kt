package com.sdds.uikit.internal.textfield

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.InputType
import android.util.AttributeSet
import android.view.ActionMode
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.getSystemService
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
internal open class StatefulEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle,
) : AppCompatEditText(context, attrs, defStyleAttr), ColorStateHolder {

    private var _currentImeAction: Int = 0
    private val keyListener = KeyListener()
    private val editorListener = EditorListener()
    private val insertionReadOnlyCallback = ReadOnlyInsertionActionModeCallback()
    private val selectionReadOnlyCallback = ReadOnlySelectionActionModeCallback()
    private var _keyHandled: Boolean = false

    private var _suffixDrawable: Drawable? = null
    private var _prefixDrawable: Drawable? = null
    private var _valueTextAppearance: Int = 0
    private var _prefixPadding: Int = 0
    private var _suffixPadding: Int = 0
    private var _originalInputType: Int? = null
    private var _pendingEditorListener: OnEditorActionListener? = null

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

    open var placeholder: CharSequence? = null
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
        editorListener.userListener = _pendingEditorListener
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

    /**
     * Запрашивает фокус и клавиатуру
     */
    fun forceFocus() {
        if (requestFocus() && !isReadOnly) {
            showImeImplicit()
        }
        setSelection(text?.length ?: 0)
    }

    override fun setTextAppearance(resId: Int) {
        super.setTextAppearance(resId)
        _valueTextAppearance = resId
        updatePrefixSuffixDrawable()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val newMinWidth = if (singleLine() && !placeholder.isNullOrEmpty()) {
            compoundPaddingStart + compoundPaddingEnd + paint.measureText(placeholder?.toString().orEmpty()).toInt()
        } else {
            compoundPaddingStart + compoundPaddingEnd + paint.measureText(DUMMY_MEASURE_TEXT).toInt()
        }
        minWidth = maxOf(newMinWidth, minWidth)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        updateSuffixPrefixPosition()
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        super.onTextChanged(s, start, before, count)
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
        // Может быть не инициализирован при вызове setOnEditorActionListener из супер класса,
        if (editorListener == null) {
            _pendingEditorListener = l
        } else {
            editorListener.userListener = l
        }
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

    private fun showImeImplicit() {
        context.getSystemService<InputMethodManager>()
            ?.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    }

    private fun isMultilineInputType(): Boolean {
        val mask = (EditorInfo.TYPE_MASK_CLASS or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE)
        return inputType and mask == EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE
    }

    private fun updateReadOnlyState() {
        if (_originalInputType == null) {
            _originalInputType = inputType
        }
        if (isReadOnly) {
            inputType = InputType.TYPE_NULL
        } else {
            inputType = _originalInputType ?: InputType.TYPE_NULL
        }
        customInsertionActionModeCallback = insertionReadOnlyCallback.takeIf { isReadOnly }
        customSelectionActionModeCallback = selectionReadOnlyCallback.takeIf { isReadOnly }
        showSoftInputOnFocus = !isReadOnly
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

    protected fun updateSuffixPrefixPosition() {
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
                layout != null -> getLastLineWidth().toInt() - getAvailableLayoutWidth()
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

    protected open fun getLastLineWidth(): Float {
        val l = layout ?: return 0f
        val end = text?.length ?: 0
        return l.getPrimaryHorizontal(end)
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
            // Сначала режем ввод в read-only
            if (this@StatefulEditText.isReadOnly && event?.action == KeyEvent.ACTION_DOWN) {
                return when (keyCode) {
                    // Разрешаем только навигацию/модификаторы, чтобы можно было двигать курсор и выделять
                    KeyEvent.KEYCODE_DPAD_LEFT,
                    KeyEvent.KEYCODE_DPAD_RIGHT,
                    KeyEvent.KEYCODE_DPAD_UP,
                    KeyEvent.KEYCODE_DPAD_DOWN,
                    KeyEvent.KEYCODE_MOVE_HOME,
                    KeyEvent.KEYCODE_MOVE_END,
                    KeyEvent.KEYCODE_PAGE_UP,
                    KeyEvent.KEYCODE_PAGE_DOWN,
                    KeyEvent.KEYCODE_SHIFT_LEFT,
                    KeyEvent.KEYCODE_SHIFT_RIGHT,
                    KeyEvent.KEYCODE_ALT_LEFT,
                    KeyEvent.KEYCODE_ALT_RIGHT,
                    KeyEvent.KEYCODE_CTRL_LEFT,
                    KeyEvent.KEYCODE_CTRL_RIGHT,
                    -> {
                        // не перехватываем — пусть система двигает курсор/выделение
                        userKeyListener?.onKey(v, keyCode, event) == true
                    }
                    else -> {
                        // любые символы, Backspace, Enter и т.п. – гасим
                        true
                    }
                }
            }

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

    private class ReadOnlySelectionActionModeCallback : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean = true

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
            menu ?: return false
            runCatching {
                val copyItem = menu.findItem(android.R.id.copy)
                val title = copyItem.title
                menu.clear()
                menu.add(0, android.R.id.copy, 0, title)
            }
            return true
        }

        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean = false

        override fun onDestroyActionMode(mode: ActionMode?) = Unit
    }

    private class ReadOnlyInsertionActionModeCallback : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean = false

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean = false

        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean = false

        override fun onDestroyActionMode(mode: ActionMode?) = Unit
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
