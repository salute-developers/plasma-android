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
 * Реализация [ColorState] для компонента Spinner
 */
public enum class SpinnerColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_spinner_state_default)),
    SECONDARY(intArrayOf(R.attr.serv_spinner_state_secondary)),
    ACCENT(intArrayOf(R.attr.serv_spinner_state_accent)),
    POSITIVE(intArrayOf(R.attr.serv_spinner_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_spinner_state_negative)),
    WARNING(intArrayOf(R.attr.serv_spinner_state_warning)),
    INFO(intArrayOf(R.attr.serv_spinner_state_info)),
}

/**
 * Реализация [ColorStateProvider] для SpinnerColorState
 */
@Keep
internal class SpinnerColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): SpinnerColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Spinner,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Spinner_serv_spinnerColors, 0)
        typedArray.recycle()
        return SpinnerColorState.values().getOrNull(stateOrdinal)
    }
}
