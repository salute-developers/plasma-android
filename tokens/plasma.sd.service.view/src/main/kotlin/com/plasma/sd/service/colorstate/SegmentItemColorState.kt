package com.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.plasma.sd.service.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента SegmentItem
 */
public enum class SegmentItemColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.plasma_segmentItem_state_default)),
    SECONDARY(intArrayOf(R.attr.plasma_segmentItem_state_secondary)),
    PRIMARY(intArrayOf(R.attr.plasma_segmentItem_state_primary)),
}

/**
 * Реализация [ColorStateProvider] для SegmentIconColorState
 */
internal class SegmentItemColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): SegmentItemColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.SegmentItem,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.SegmentItem_plasma_segmentItemColors, 0)
        typedArray.recycle()
        return SegmentItemColorState.values().getOrNull(stateOrdinal)
    }
}
