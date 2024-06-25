package com.sdds.uikit.internal.textfield

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
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

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        return drawableState
    }
}
