package com.sdds.uikit.internal.textfield

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
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
internal class StatefulEditText(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle,
) : AppCompatEditText(context, attrs, defStyleAttr), ViewStateHolder {

    private var _lastInputType: Int = inputType

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
        if (isReadOnly) {
            _lastInputType = inputType
            inputType = InputType.TYPE_NULL
        } else {
            inputType = _lastInputType
        }
        isFocusable = !isReadOnly
        isFocusableInTouchMode = !isReadOnly
        isClickable = !isReadOnly
        isLongClickable = !isReadOnly
        isCursorVisible = !isReadOnly
    }
}
