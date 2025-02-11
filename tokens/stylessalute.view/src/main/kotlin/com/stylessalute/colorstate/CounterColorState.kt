package com.stylessalute.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.stylessalute.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента Counter
 */
public enum class CounterColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_counter_state_default)),
    ACCENT(intArrayOf(R.attr.salute_counter_state_accent)),
    POSITIVE(intArrayOf(R.attr.salute_counter_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_counter_state_negative)),
    WARNING(intArrayOf(R.attr.salute_counter_state_warning)),
    BLACK(intArrayOf(R.attr.salute_counter_state_black)),
    WHITE(intArrayOf(R.attr.salute_counter_state_white)),
}

/**
 * Реализация [ColorStateProvider] для CounterColorState
 */
internal class CounterColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): CounterColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Counter,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Counter_salute_counterColors, 0)
        typedArray.recycle()
        return CounterColorState.values().getOrNull(stateOrdinal)
    }
}
