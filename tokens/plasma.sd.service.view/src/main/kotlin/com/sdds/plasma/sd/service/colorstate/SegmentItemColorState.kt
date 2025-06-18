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
 * Реализация [ColorState] для компонента SegmentItem
 */
public enum class SegmentItemColorState(
    public override val attrs: IntArray,
) : ColorState {
    PRIMARY(intArrayOf(R.attr.plasma_segmentitem_state_primary)),
    SECONDARY(intArrayOf(R.attr.plasma_segmentitem_state_secondary)),
    ACCENT(intArrayOf(R.attr.plasma_segmentitem_state_accent)),
}

/**
 * Реализация [ColorStateProvider] для SegmentItemColorState
 */
@Keep
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
        val stateOrdinal: Int = typedArray.getInt(
            R.styleable.SegmentItem_plasma_segmentitemColors,
            0,
        )
        typedArray.recycle()
        return SegmentItemColorState.values().getOrNull(stateOrdinal)
    }
}
