// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.plasma.sd.service.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента SegmentItemCounter
 */
public enum class SegmentItemCounterColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.plasma_segmentitemcounter_state_default)),
    ACCENT(intArrayOf(R.attr.plasma_segmentitemcounter_state_accent)),
}

/**
 * Реализация [ColorStateProvider] для SegmentItemCounterColorState
 */
@Keep
internal class SegmentItemCounterColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): SegmentItemCounterColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.SegmentItemCounter,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(R.styleable.SegmentItemCounter_plasma_segmentitemcounterColors, 0)
        typedArray.recycle()
        return SegmentItemCounterColorState.values().getOrNull(stateOrdinal)
    }
}
