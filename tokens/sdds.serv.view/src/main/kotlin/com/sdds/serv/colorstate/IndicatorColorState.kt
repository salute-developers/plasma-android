// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.serv.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента Indicator
 */
public enum class IndicatorColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_indicator_state_default)),
    ACCENT(intArrayOf(R.attr.serv_indicator_state_accent)),
    INACTIVE(intArrayOf(R.attr.serv_indicator_state_inactive)),
    POSITIVE(intArrayOf(R.attr.serv_indicator_state_positive)),
    WARNING(intArrayOf(R.attr.serv_indicator_state_warning)),
    NEGATIVE(intArrayOf(R.attr.serv_indicator_state_negative)),
    DARK(intArrayOf(R.attr.serv_indicator_state_dark)),
    BLACK(intArrayOf(R.attr.serv_indicator_state_black)),
    WHITE(intArrayOf(R.attr.serv_indicator_state_white)),
}

/**
 * Реализация [ColorStateProvider] для IndicatorColorState
 */
internal class IndicatorColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): IndicatorColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Indicator,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Indicator_serv_indicatorColors, 0)
        typedArray.recycle()
        return IndicatorColorState.values().getOrNull(stateOrdinal)
    }
}
