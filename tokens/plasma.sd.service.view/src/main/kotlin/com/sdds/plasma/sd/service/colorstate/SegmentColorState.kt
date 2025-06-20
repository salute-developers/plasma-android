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
 * Реализация [ColorState] для компонента Segment
 */
public enum class SegmentColorState(
    public override val attrs: IntArray,
) : ColorState {
    PRIMARY(intArrayOf(R.attr.plasma_segment_state_primary)),
    SECONDARY(intArrayOf(R.attr.plasma_segment_state_secondary)),
    ACCENT(intArrayOf(R.attr.plasma_segment_state_accent)),
}

/**
 * Реализация [ColorStateProvider] для SegmentColorState
 */
@Keep
internal class SegmentColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): SegmentColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Segment,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Segment_plasma_segmentColors, 0)
        typedArray.recycle()
        return SegmentColorState.values().getOrNull(stateOrdinal)
    }
}
