// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.plasma.sd.service.R
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
    DEFAULT(intArrayOf(R.attr.plasma_indicator_state_default)),
    ACCENT(intArrayOf(R.attr.plasma_indicator_state_accent)),
    INACTIVE(intArrayOf(R.attr.plasma_indicator_state_inactive)),
    POSITIVE(intArrayOf(R.attr.plasma_indicator_state_positive)),
    WARNING(intArrayOf(R.attr.plasma_indicator_state_warning)),
    NEGATIVE(intArrayOf(R.attr.plasma_indicator_state_negative)),
    DARK(intArrayOf(R.attr.plasma_indicator_state_dark)),
    BLACK(intArrayOf(R.attr.plasma_indicator_state_black)),
    WHITE(intArrayOf(R.attr.plasma_indicator_state_white)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Indicator_plasma_indicatorColors, 0)
        typedArray.recycle()
        return IndicatorColorState.values().getOrNull(stateOrdinal)
    }
}
