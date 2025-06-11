// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.serv.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента Toast
 */
public enum class ToastColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_toast_state_default)),
    POSITIVE(intArrayOf(R.attr.serv_toast_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_toast_state_negative)),
}

/**
 * Реализация [ColorStateProvider] для ToastColorState
 */
@Keep
internal class ToastColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ToastColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Toast,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Toast_serv_toastColors, 0)
        typedArray.recycle()
        return ToastColorState.values().getOrNull(stateOrdinal)
    }
}
