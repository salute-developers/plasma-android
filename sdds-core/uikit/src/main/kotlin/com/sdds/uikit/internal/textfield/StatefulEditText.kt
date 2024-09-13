package com.sdds.uikit.internal.textfield

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import com.sdds.uikit.R
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

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

    init {
        super.setOnKeyListener(keyListener)
        super.setOnEditorActionListener(editorListener)
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

    private fun updateReadOnlyState() {
        isFocusable = !isReadOnly
        isFocusableInTouchMode = !isReadOnly
        isClickable = !isReadOnly
        isLongClickable = !isReadOnly
        isCursorVisible = !isReadOnly
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

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyDown(keyCode, event)
    }

    private fun isMultilineInputType(): Boolean {
        val mask = (EditorInfo.TYPE_MASK_CLASS or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE)
        return inputType and mask == EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE
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
}
